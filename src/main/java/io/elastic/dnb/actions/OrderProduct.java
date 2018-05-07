package io.elastic.dnb.actions;

import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.api.Module;
import io.elastic.dnb.Constants;
import io.elastic.dnb.SoapClientUtils;
import io.elastic.dnb.builder.SoapRequestBuilder;
import io.elastic.dnb.builder.SoapResponseBuilder;
import io.elastic.dnb.jaxws.OrderProductRequest;
import io.elastic.dnb.jaxws.OrderProductResponse;
import io.elastic.petstore.HttpClientUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

/**
 * Action to create a pet.
 */
public class OrderProduct implements Module {
    private static final Logger logger = LoggerFactory.getLogger(OrderProduct.class);

    /**
     * Executes the actions's logic by sending a request to the Petstore API and emitting response to the platform.
     *
     * @param parameters execution parameters
     */
    @Override
    public void execute(final ExecutionParameters parameters) {
        logger.info("About to create new pet");
        // incoming message
        final Message message = parameters.getMessage();

        // body contains the mapped data
        final JsonObject body = message.getBody();

        // contains action's configuration
        final JsonObject configuration = parameters.getConfiguration();

        final JsonString apiKey = configuration.getJsonString("apiKey");
        final JsonString apiPassphrase = configuration.getJsonString("apiPassphrase");



        JsonObject orderProductRequestDetail = body.getJsonObject("OrderProductRequest").getJsonObject("OrderProductRequestDetail");
        String DUNSNumber = orderProductRequestDetail.getJsonObject("InquiryDetail").getString("DUNSNumber");
        String DNBProductID = orderProductRequestDetail.getJsonObject("ProductSpecification").getString("DNBProductID");
        Boolean archiveProductOptOutIndicator = orderProductRequestDetail.getJsonObject("ArchiveDetail").getBoolean("ArchiveProductOptOutIndicator");
        String customerBillingEndorsementText = orderProductRequestDetail.getJsonObject("InquiryReferenceDetail").getString("CustomerBillingEndorsementText");

        SoapRequestBuilder soapRequestBuilder = new SoapRequestBuilder();
        Document request = soapRequestBuilder.buildOrderProductOperationRequestXmlDocument(DUNSNumber, DNBProductID, archiveProductOptOutIndicator, customerBillingEndorsementText);
        SoapClientUtils utils = new SoapClientUtils();
        SOAPMessage soapResponse = utils.callSoapWebService(Constants.API_URL, "http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct", request, configuration.getJsonString("apiKey").getString(), configuration.getJsonString("apiPassphrase").getString());
        SoapResponseBuilder responseBuilder = new SoapResponseBuilder();
        try {
            OrderProductResponse respObject =  responseBuilder.unmarshallOrderProductResponse(soapResponse.getSOAPBody().getFirstChild());
            JsonObject responseJsonObj = responseBuilder.marshallOrderProductResponseToJson(respObject);
            parameters.getEventEmitter().emitData(new Message.Builder().body(responseJsonObj).build());
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        logger.info("response successfully received");

        // emitting the message to the platform
    }
}
