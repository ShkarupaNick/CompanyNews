package io.elastic.dnb.builder;

import io.elastic.api.JSON;
import io.elastic.dnb.jaxws.*;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.json.JsonObject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringWriter;

public class SoapRequestBuilder {
    private static final Logger logger = LoggerFactory.getLogger(SoapRequestBuilder.class);

    public OrderProductRequest buildOrderProductOperationRequest(String DUNSNumber, String DNBProductID, Boolean archiveProductOptOutIndicator, String billingEndorsementText) {
        logger.debug("starting building the OrderProductOperationRequest... ");
        logger.trace("DUNSNumber: {}, DNBProductID: {}, archiveProductOptOutIndicator: {}, billingEndorsementText: {}", DUNSNumber, DNBProductID, archiveProductOptOutIndicator, billingEndorsementText);
        OrderProductRequest orderProductRequest = new OrderProductRequest();
        RequestTransactionDetail transactionDetail = new RequestTransactionDetail();
        transactionDetail.setApplicationTransactionID(java.util.UUID.randomUUID().toString());
        orderProductRequest.setTransactionDetail(transactionDetail);

        OrderProductRequestDetail orderProductRequestDetail = new OrderProductRequestDetail();

        InquiryDetail inquiryDetail = new InquiryDetail();
        inquiryDetail.setDUNSNumber(DUNSNumber);
        orderProductRequestDetail.setInquiryDetail(inquiryDetail);

        ProductSpecification productSpecification = new ProductSpecification();
        productSpecification.setDNBProductID(DNBProductID);
        orderProductRequestDetail.setProductSpecification(productSpecification);

        ArchiveDetail archiveDetail = new ArchiveDetail();
        archiveDetail.setArchiveProductOptOutIndicator(archiveProductOptOutIndicator);
        orderProductRequestDetail.setArchiveDetail(archiveDetail);

        InquiryReferenceDetail inquiryReferenceDetail = new InquiryReferenceDetail();
        inquiryReferenceDetail.setCustomerBillingEndorsementText(billingEndorsementText);
        orderProductRequestDetail.setInquiryReferenceDetail(inquiryReferenceDetail);

        orderProductRequest.setOrderProductRequestDetail(orderProductRequestDetail);
        logger.debug("OrderProductOperationRequest successfully built... ");
        return orderProductRequest;
    }


    public OrderProductRequest buildOrderProductOperationRequest(JsonObject body) {
        logger.debug("starting building the OrderProductOperationRequest... ");
        logger.info("body: {}", JSON.stringify(body));
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        OrderProductRequest orderProductRequest = null;
        try {
            orderProductRequest = mapper.readValue(JSON.stringify(body), OrderProductRequest.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return orderProductRequest;
    }

    public Document buildOrderProductOperationRequestXmlDocument(String DUNSNumber, String DNBProductID, Boolean archiveProductOptOutIndicator, String billingEndorsementText) {
        return marshalToDocument(buildOrderProductOperationRequest(DUNSNumber, DNBProductID, archiveProductOptOutIndicator, billingEndorsementText));
    }

    public Document buildOrderProductOperationRequestXmlDocument(JsonObject object) {
        return marshalToDocument(buildOrderProductOperationRequest(object));
    }


    public OrderProductRequest buildCredentialVerificationRequest() {
        logger.debug("starting building the CredentialVerificationRequest... ");
        OrderProductRequest orderProductRequest = new OrderProductRequest();
        RequestTransactionDetail transactionDetail = new RequestTransactionDetail();
        transactionDetail.setApplicationTransactionID("-1");
        orderProductRequest.setTransactionDetail(transactionDetail);

        OrderProductRequestDetail orderProductRequestDetail = new OrderProductRequestDetail();

        InquiryDetail inquiryDetail = new InquiryDetail();
        inquiryDetail.setDUNSNumber("884114609");
        orderProductRequestDetail.setInquiryDetail(inquiryDetail);

        ProductSpecification productSpecification = new ProductSpecification();
        productSpecification.setDNBProductID("NEWS_MDA");
        orderProductRequestDetail.setProductSpecification(productSpecification);

        ArchiveDetail archiveDetail = new ArchiveDetail();
        archiveDetail.setArchiveProductOptOutIndicator(false);
        orderProductRequestDetail.setArchiveDetail(archiveDetail);

        InquiryReferenceDetail inquiryReferenceDetail = new InquiryReferenceDetail();
        inquiryReferenceDetail.setCustomerBillingEndorsementText("some text");
        orderProductRequestDetail.setInquiryReferenceDetail(inquiryReferenceDetail);

        orderProductRequest.setOrderProductRequestDetail(orderProductRequestDetail);
        logger.debug("buildCredentialVerificationRequest successfully built... ");
        return orderProductRequest;
    }

    public String buildCredentialVerificationRequestXmlString() {
        return marshalToString(buildCredentialVerificationRequest());
    }

    public Document buildCredentialVerificationRequestXmlDocument() {
        return marshalToDocument(buildCredentialVerificationRequest());
    }

    public Document marshalToDocument(Object object) {
        logger.debug("Starting marchall object to DOM...");
        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Marshaller marshaller = null;
            marshaller = JAXBContext.newInstance(object.getClass()).createMarshaller();
            marshaller.marshal(object, document);
            logger.debug("the object was marshaled successfully...");

        } catch (JAXBException | ParserConfigurationException e) {
            logger.error("error while marshaling object to DOM......");
            throw new RuntimeException(e);
        }
        return document;
    }

    public String marshalToString(Object object) {
        logger.debug("Starting marchall object to String...");
        JAXBContext jaxbContext = null;
        String xmlString = null;
        try {
            jaxbContext = JAXBContext.newInstance(object.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(object, sw);
            xmlString = sw.toString();
            logger.debug("the object was marshaled successfully...");
        } catch (JAXBException e) {
            logger.error("error while marshaling object to String");
            throw new RuntimeException(e);
        }
        return xmlString;
    }
}
