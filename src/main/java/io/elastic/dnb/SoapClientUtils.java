package io.elastic.dnb;

import io.elastic.dnb.jaxws.OrderProductResponse;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;

public class SoapClientUtils {

    public SOAPMessage callSoapWebService(String soapEndpointUrl, String soapAction, Document body, String apiKey, String apiPassphrase) {
        SOAPMessage soapResponse = null;
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage request = createSOAPRequest(soapAction, body, apiKey, apiPassphrase);


            // Print the SOAP Response
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            request.writeTo(out);
            System.out.println("\n\n\n" + new String(out.toByteArray()));


            // Send SOAP Message to SOAP Server
            soapResponse = soapConnection.call(request, soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();

        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
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
            throw new RuntimeException(e);
        }
    }



}
