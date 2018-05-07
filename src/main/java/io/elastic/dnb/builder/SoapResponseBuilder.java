package io.elastic.dnb.builder;

import io.elastic.dnb.jaxws.OrderProductResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by NShkarupa on 07.05.2018.
 */
public class SoapResponseBuilder {

    public OrderProductResponse unmarshallOrderProductResponse(Node node) {
        node.normalize();
        JAXBContext jc = null;
        JAXBElement<OrderProductResponse> je= null;
        try {
            jc = JAXBContext.newInstance(OrderProductResponse.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();

//            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            InputSource is = new InputSource();
//            is.setCharacterStream(new StringReader("      <com:OrderProductResponse ServiceVersionNumber=\"3.0\" xmlns:com=\"http://services.dnb.com/NewsAndMediaProductServiceV2.0\">\n" +
//                    "         <TransactionDetail>\n" +
//                    "            <ApplicationTransactionID>-1</ApplicationTransactionID>\n" +
//                    "            <ServiceTransactionID>Id-cefcef5a5317e438c3be2fcc</ServiceTransactionID>\n" +
//                    "            <TransactionTimestamp>2018-05-07T03:14:22.325-04:00</TransactionTimestamp>\n" +
//                    "         </TransactionDetail>\n" +
//                    "         <TransactionResult>\n" +
//                    "            <SeverityText>Error</SeverityText>\n" +
//                    "            <ResultID>SC001</ResultID>\n" +
//                    "            <ResultText>Your user credentials are invalid. Please contact your D&amp;B Representative or your local Customer Service Center.</ResultText>\n" +
//                    "         </TransactionResult>\n" +
//                    "      </com:OrderProductResponse>\n"));
//
//            Document doc = db.parse(is);
//            node = doc.getFirstChild();


            je = unmarshaller.unmarshal(node, OrderProductResponse.class);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        return je.getValue();
    }
}
