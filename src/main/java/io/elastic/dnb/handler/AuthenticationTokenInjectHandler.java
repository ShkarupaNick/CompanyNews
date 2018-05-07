package io.elastic.dnb.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class AuthenticationTokenInjectHandler implements SOAPHandler<SOAPMessageContext>
{
	private static final Logger logger = LoggerFactory.getLogger(AuthenticationTokenInjectHandler.class);

    /**
     * This method handles the incoming and outgoing SOAP-Message. It's an
     * excellent point to manipulate the SOAP.
     *
     * @param context
     *            The SOAPMessageContext object.
     *
     * @return true if successful handling, false otherwise.
     */
	@Override
    public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("Client : handleMessage()......");
		SOAPMessage soapMessage = context.getMessage();
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		logger.info("isRequest={}",isRequest);
		if(isRequest)
		{
			String prefixUri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-";
	        String uri = prefixUri + "wssecurity-secext-1.0.xsd";
	        String uta = prefixUri + "wssecurity-utility-1.0.xsd";
	        String ta = prefixUri + "username-token-profile-1.0#PasswordText";
			SOAPEnvelope envelope;
			try {
				envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPFactory factory = SOAPFactory.newInstance();
				String prefix = "wsse";
				SOAPElement securityElem = factory.createElement("Security",prefix,uri);
				SOAPElement tokenElem = factory.createElement("UsernameToken",prefix,uri);
				tokenElem.addAttribute(QName.valueOf("wsu:Id"),"UsernameToken-3");
				tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), uta);
				SOAPElement userElem = factory.createElement("Username",prefix,uri);
				userElem.addTextNode("siva");
				SOAPElement pwdElem = factory.createElement("Password",prefix,uri);
				pwdElem.addTextNode("secret");
				pwdElem.addAttribute(QName.valueOf("Type"), ta);
				tokenElem.addChildElement(userElem);
				tokenElem.addChildElement(pwdElem);
				securityElem.addChildElement(tokenElem);
				SOAPHeader header = envelope.addHeader();
				header.addChildElement(securityElem);

			}
            catch (SOAPException e) {
				throw new RuntimeException(e);
			}
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		logger.info("Client : handleFault()......");
		return true;
	}

	@Override
	public void close(MessageContext context) {
		logger.info("Client : close()......");
		
	}

	@Override
	public Set<QName> getHeaders() {
		logger.info("Client : getHeaders()......");
		return null;
	}

}