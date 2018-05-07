package io.elastic.dnb.builder;


import io.elastic.api.JSON;
import io.elastic.dnb.jaxws.OrderProductResponse;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.xc.JaxbAnnotationIntrospector;
import org.w3c.dom.Node;

import javax.json.JsonObject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;

/**
 * Created by NShkarupa on 07.05.2018.
 */
public class SoapResponseBuilder {

    public OrderProductResponse unmarshallOrderProductResponse(Node node) {
        node.normalize();
        JAXBContext jc = null;
        JAXBElement<OrderProductResponse> je = null;
        try {
            jc = JAXBContext.newInstance(OrderProductResponse.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            je = unmarshaller.unmarshal(node, OrderProductResponse.class);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        return je.getValue();
    }


    public JsonObject marshallOrderProductResponseToJson(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
        mapper.setAnnotationIntrospector(introspector);
        try {
            JsonObject result = JSON.parseObject(mapper.writeValueAsString(object));
            System.out.println(mapper.writeValueAsString(object));
            return result;
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}
