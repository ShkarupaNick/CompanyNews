package io.elastic.dnb.verifier;

import io.elastic.api.CredentialsVerifier;
import io.elastic.api.InvalidCredentialsException;
import io.elastic.dnb.Constants;
import io.elastic.dnb.SoapClientUtils;
import io.elastic.dnb.builder.SoapRequestBuilder;
import io.elastic.dnb.builder.SoapResponseBuilder;
import io.elastic.dnb.jaxws.OrderProductResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.json.JsonObject;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

/**
 * Created by NShkarupa on 07.05.2018.
 */
public class CredentialsVerifierImpl implements CredentialsVerifier {
    private static final Logger logger = LoggerFactory.getLogger(CredentialsVerifierImpl.class);


    @Override
    public void verify(JsonObject configuration) throws InvalidCredentialsException {
        try {

            logger.info("Verifying the credentials...");
            SoapRequestBuilder requestBuilder = new SoapRequestBuilder();
            SoapClientUtils utils = new SoapClientUtils();
            Document body = requestBuilder.buildCredentialVerificationRequestXmlDocument(configuration.getJsonString("apiKey").getString(), configuration.getJsonString("apiKey").getString());
            body.normalizeDocument();
            SOAPMessage soapResponse = utils.callSoapWebService(Constants.API_URL, "http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct", body);
            SoapResponseBuilder soapResponseBuilder = new SoapResponseBuilder();
            OrderProductResponse response = soapResponseBuilder.unmarshallOrderProductResponse(soapResponse.getSOAPBody().getFirstChild());

            if (response.getTransactionResult().getResultID().equals("SC001")) {
                throw new InvalidCredentialsException("Invalid api key or passphrase. Please, check credentials and try again...");
            }
        } catch (SOAPException e) {
            throw new InvalidCredentialsException("Failed to verify credentials...", e);
        }
    }
}

