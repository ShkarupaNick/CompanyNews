
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionDetail" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}RequestTransactionDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ServiceVersionNumber" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}ServiceVersionNumber" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
        "transactionDetail"
})
@XmlSeeAlso({
        RetrieveProductRequest.class,
        OrderProductRequest.class
})
public class Request {

    @XmlElement(name = "TransactionDetail")
    @JsonProperty("TransactionDetail")
    protected RequestTransactionDetail transactionDetail;
    @XmlAttribute(name = "ServiceVersionNumber")
    @JsonProperty("ServiceVersionNumber")
    protected String serviceVersionNumber;

    /**
     * Gets the value of the transactionDetail property.
     *
     * @return possible object is
     * {@link RequestTransactionDetail }
     */
    public RequestTransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     *
     * @param value allowed object is
     *              {@link RequestTransactionDetail }
     */
    public void setTransactionDetail(RequestTransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the serviceVersionNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServiceVersionNumber() {
        return serviceVersionNumber;
    }

    /**
     * Sets the value of the serviceVersionNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServiceVersionNumber(String value) {
        this.serviceVersionNumber = value;
    }

}
