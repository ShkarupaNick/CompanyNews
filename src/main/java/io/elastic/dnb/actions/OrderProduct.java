package io.elastic.dnb.actions;

import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.api.Module;
import io.elastic.dnb.Constants;
import io.elastic.dnb.SoapClientUtils;
import io.elastic.dnb.builder.SoapRequestBuilder;
import io.elastic.dnb.builder.SoapResponseBuilder;
import io.elastic.dnb.jaxws.OrderProductResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.json.JsonObject;
import javax.json.JsonString;
import javax.xml.soap.SOAPMessage;

/**
 * Action to create a pet.
 */
public class OrderProduct implements Module {
    private static final Logger logger = LoggerFactory.getLogger(OrderProduct.class);

    @Override
    public void execute(final ExecutionParameters parameters) {
        logger.info("About getting Order Product info");
        // incoming message
        final Message message = parameters.getMessage();
        logger.trace("message: {}", message);

        // body contains the mapped data
        final JsonObject body = message.getBody();
        logger.trace("body: {}", body);


        // contains action's configuration
        final JsonObject configuration = parameters.getConfiguration();
        logger.info("configuration: {}", configuration);

        final JsonString apiKey = configuration.getJsonString("apiKey");
        final JsonString apiPassphrase = configuration.getJsonString("apiPassphrase");

        try {
//            JsonObject orderProductRequestDetail = body.getJsonObject("OrderProductRequest").getJsonObject("OrderProductRequestDetail");
//            String DUNSNumber = orderProductRequestDetail.getJsonObject("InquiryDetail").getString("DUNSNumber");
//            String DNBProductID = orderProductRequestDetail.getJsonObject("ProductSpecification").getString("DNBProductID");
//            Boolean archiveProductOptOutIndicator = orderProductRequestDetail.getJsonObject("ArchiveDetail").getBoolean("ArchiveProductOptOutIndicator");
//            String customerBillingEndorsementText = orderProductRequestDetail.getJsonObject("InquiryReferenceDetail").getString("CustomerBillingEndorsementText");

            SoapRequestBuilder soapRequestBuilder = new SoapRequestBuilder();
            //Document request = soapRequestBuilder.buildOrderProductOperationRequestXmlDocument(DUNSNumber, DNBProductID, archiveProductOptOutIndicator, customerBillingEndorsementText);
            Document request = soapRequestBuilder.buildOrderProductOperationRequestXmlDocument(body);
            SoapClientUtils utils = new SoapClientUtils();
            SOAPMessage soapResponse = utils.callSoapWebService(Constants.API_URL, "http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct", request, configuration.getJsonString("apiKey").getString(), configuration.getJsonString("apiPassphrase").getString());
            SoapResponseBuilder responseBuilder = new SoapResponseBuilder();
            OrderProductResponse respObject = responseBuilder.unmarshallOrderProductResponse(soapResponse.getSOAPBody().getFirstChild());
            JsonObject responseJsonObj = responseBuilder.marshallOrderProductResponseToJson(respObject);
            parameters.getEventEmitter().emitData(new Message.Builder().body(responseJsonObj).build());
            logger.info("response successfully received");
            logger.trace("response: {}",responseJsonObj);
        } catch (Exception e) {
            logger.error("Internal Component error {}",e.getMessage());
            parameters.getEventEmitter().emitException(e);
            new RuntimeException(e);
        }
    }
}
