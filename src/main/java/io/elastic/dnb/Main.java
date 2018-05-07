package io.elastic.dnb;

import io.elastic.api.InvalidCredentialsException;
import io.elastic.dnb.builder.SoapRequestBuilder;
import io.elastic.dnb.builder.SoapResponseBuilder;
import io.elastic.dnb.jaxws.OrderProductResponse;
import io.elastic.dnb.verifier.CredentialsVerifierImpl;
import org.w3c.dom.Document;

import javax.json.Json;
import javax.json.JsonObject;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by NShkarupa on 05.05.2018.
 */
public class Main {


    public static void main(String[] args) throws IOException, SOAPException, InvalidCredentialsException {

        CredentialsVerifierImpl credentialsVerifier = new CredentialsVerifierImpl();
        JsonObject configuration = Json.createObjectBuilder()
                .add("apiKey", "P2000003F23AC15AF0044C19E36A2805")
                .add("apiPassphrase", "21928114")
                .build();

        credentialsVerifier.verify(configuration);

        SoapRequestBuilder soapRequestBuilder = new SoapRequestBuilder();
        Document request = soapRequestBuilder.buildOrderProductOperationRequestXmlDocument("884114609", "NEWS_MDA", false, "bla bla bla");
        SoapClientUtils utils = new SoapClientUtils();
        SOAPMessage soapResponse = utils.callSoapWebService(Constants.API_URL, "http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct", request, configuration.getJsonString("apiKey").getString(), configuration.getJsonString("apiPassphrase").getString());
        SoapResponseBuilder responseBuilder = new SoapResponseBuilder();
        try {
            OrderProductResponse respObject =  responseBuilder.unmarshallOrderProductResponse(soapResponse.getSOAPBody().getFirstChild());
            JsonObject responseJsonObj = responseBuilder.marshallOrderProductResponseToJson(respObject);

        } catch (SOAPException e) {
            e.printStackTrace();
        }


    }

    public static String toString(Document doc) {
        try {
            StringWriter sw = new StringWriter();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(new DOMSource(doc), new StreamResult(sw));
            return sw.toString();
        } catch (Exception ex) {
            throw new RuntimeException("Error converting to String", ex);
        }
    }
}
