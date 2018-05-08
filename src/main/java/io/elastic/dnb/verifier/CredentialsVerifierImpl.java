package io.elastic.dnb.verifier;

import io.elastic.api.CredentialsVerifier;
import io.elastic.api.InvalidCredentialsException;
import io.elastic.dnb.Constants;
import io.elastic.dnb.SoapClientUtils;
import io.elastic.dnb.builder.SoapRequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.json.JsonObject;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

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
            Document body = requestBuilder.buildCredentialVerificationRequestXmlDocument();
            body.normalizeDocument();
            SOAPMessage soapResponse = utils.callSoapWebService(Constants.API_URL, "http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct", body, configuration.getJsonString("apiKey").getString(), configuration.getJsonString("apiPassphrase").getString());
            logger.trace("Verifying soapResponse: {}...",soapResponse);
            Document responseDocument = soapResponse.getSOAPBody().getOwnerDocument();
            XPath xPath = XPathFactory.newInstance().newXPath();
            Node node = ((NodeList) xPath.evaluate("//ResultID/text()", responseDocument.getDocumentElement(), XPathConstants.NODESET)).item(0);

            if (node.getNodeValue().equals("SC001")) {
                throw new InvalidCredentialsException("Invalid api key or passphrase. Please, check credentials and try again...");
            }
            logger.info("Credentials successfully verified...");
        } catch (SOAPException e) {
            throw new InvalidCredentialsException("Failed to verify credentials...", e);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

    private void trimWhitespace(Node node) {
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); ++i) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.TEXT_NODE) {
                child.setTextContent(child.getTextContent().trim());
            }
            trimWhitespace(child);
        }
    }
}

