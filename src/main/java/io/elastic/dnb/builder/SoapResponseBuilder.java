package io.elastic.dnb.builder;

import io.elastic.dnb.jaxws.OrderProductResponse;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Created by NShkarupa on 07.05.2018.
 */
public class SoapResponseBuilder {

    public OrderProductResponse unmarshallOrderProductResponse(Node object) {
        JAXBContext jc = null;
        JAXBElement<OrderProductResponse> je= null;
        try {
            jc = JAXBContext.newInstance(OrderProductResponse.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            je = unmarshaller.unmarshal(object, OrderProductResponse.class);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        return je.getValue();
    }
}
