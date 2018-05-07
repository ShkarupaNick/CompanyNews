package io.elastic.dnb;

import io.elastic.dnb.builder.SoapRequestBuilder;
import io.elastic.dnb.builder.SoapResponseBuilder;
import io.elastic.dnb.jaxws.OrderProductRequest;
import io.elastic.dnb.jaxws.OrderProductResponse;
import io.elastic.dnb.verifier.CredentialsVerifierImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by NShkarupa on 05.05.2018.
 */
public class Main {


    public static void main(String[] args) throws IOException, SOAPException {

        CredentialsVerifierImpl credentialsVerifier = new CredentialsVerifierImpl();
        credentialsVerifier.verify




        System.out.println(response);
        
        
      
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
