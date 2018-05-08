package io.elastic.dnb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class SoapClientUtils {
    private static final Logger logger = LoggerFactory.getLogger(SoapClientUtils.class);


    public SOAPMessage callSoapWebService(String soapEndpointUrl, String soapAction, Document body, String apiKey, String apiPassphrase) {
        SOAPMessage soapResponse = null;
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage request = createSOAPRequest(soapAction, body, apiKey, apiPassphrase);

            logger.info("Soap request to endpoint: {}", soapEndpointUrl);
            logger.trace("request: {}",toString(request.getSOAPBody().getOwnerDocument()));
            soapResponse = soapConnection.call(request, soapEndpointUrl);


            logger.info("Soap response received...");
            logger.trace("response: {}",toString(soapResponse.getSOAPBody().getOwnerDocument()));
//            // Print the SOAP Response
//            System.out.println("Response SOAP Message:");
//            soapResponse.writeTo(System.out);
//            System.out.println();

            soapConnection.close();

        } catch (Exception e) {
            logger.error("Error occurred while sending SOAP Request to Server!  Make sure you have the correct endpoint URL and SOAPAction!");
            throw new RuntimeException(e.getMessage());
        }
        return soapResponse;
    }

    private SOAPMessage createSOAPRequest(String soapAction, Document body, String apiKey, String apiPassphrase) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        // SOAP Envelope
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String myNamespace = "new";
        String myNamespaceURI = "https://services.dnb.com/NewsAndMediaProductServiceV2.0";
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
        envelope.getBody().setEncodingStyle("http://schemas.xmlsoap.org/soap/encoding/");

        envelope.getBody().addDocument(body);
        addSoapHeader(envelope, apiKey, apiPassphrase);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);
        soapMessage.saveChanges();
        return soapMessage;
    }

    private void addSoapHeader(SOAPEnvelope envelope, String apiKey, String apiPassphrase) {
        String prefixUri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-";
        String uri = prefixUri + "wssecurity-secext-1.0.xsd";
        String uta = prefixUri + "wssecurity-utility-1.0.xsd";
        String ta = prefixUri + "username-token-profile-1.0#PasswordText";
        try {
            SOAPFactory factory = SOAPFactory.newInstance();
            String prefix = "wsse";
            SOAPElement securityElem = factory.createElement("Security", prefix, uri);
            SOAPElement tokenElem = factory.createElement("UsernameToken", prefix, uri);
            tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-3");
            tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), uta);
            SOAPElement userElem = factory.createElement("Username", prefix, uri);
            userElem.addTextNode(apiKey);
            SOAPElement pwdElem = factory.createElement("Password", prefix, uri);
            pwdElem.addTextNode(apiPassphrase);
            pwdElem.addAttribute(QName.valueOf("Type"), ta);
            tokenElem.addChildElement(userElem);
            tokenElem.addChildElement(pwdElem);
            securityElem.addChildElement(tokenElem);
            envelope.getHeader().addChildElement(securityElem);
        } catch (SOAPException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    private static String toString(Document doc) {
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
