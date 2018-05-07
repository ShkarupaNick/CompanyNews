package io.elastic.dnb.builder;

import io.elastic.dnb.jaxws.*;
import org.w3c.dom.Document;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringWriter;

public class SoapRequestBuilder {

    private SoapRequestBuilder soapRequestBuilder;

    public OrderProductRequest buildOrderProductOperationRequest(String DUNSNumber, String DNBProductID, Boolean archiveProductOptOutIndicator, String billingEndorsementText) {
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
        return orderProductRequest;
    }

    public Document buildOrderProductOperationRequestXmlDocument(String DUNSNumber, String DNBProductID, Boolean archiveProductOptOutIndicator, String billingEndorsementText) {
        return marshalToDocument(buildOrderProductOperationRequest(DUNSNumber, DNBProductID, archiveProductOptOutIndicator, billingEndorsementText));
    }


    public OrderProductRequest buildCredentialVerificationRequest() {
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
        return orderProductRequest;
    }

    public String buildCredentialVerificationRequestXmlString() {
        return marshalToString(buildCredentialVerificationRequest());
    }

    public Document buildCredentialVerificationRequestXmlDocument() {
        return marshalToDocument(buildCredentialVerificationRequest());
    }

    public Document marshalToDocument(Object object)  {
        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Marshaller marshaller = null;
            marshaller = JAXBContext.newInstance(object.getClass()).createMarshaller();
            marshaller.marshal(object, document);
        } catch (JAXBException |ParserConfigurationException e) {
            e.printStackTrace();
        }
        return document;
    }

    public String marshalToString(Object object){
        JAXBContext jaxbContext = null;
        String xmlString = null;
        try {
            jaxbContext = JAXBContext.newInstance(object.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(object, sw);
            xmlString = sw.toString();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        return xmlString;
    }
}
