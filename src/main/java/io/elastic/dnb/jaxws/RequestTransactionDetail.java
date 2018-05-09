
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestTransactionDetail complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RequestTransactionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationTransactionID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransactionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubmittingOfficeID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestTransactionDetail", propOrder = {
        "applicationTransactionID",
        "transactionTimestamp",
        "submittingOfficeID"
})
public class RequestTransactionDetail {

    @XmlElement(name = "ApplicationTransactionID")
    @JsonProperty("ApplicationTransactionID")
    protected String applicationTransactionID;
    @XmlElement(name = "TransactionTimestamp")
    @JsonProperty("TransactionTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTimestamp;
    @XmlElement(name = "SubmittingOfficeID")
    @JsonProperty("SubmittingOfficeID")
    protected String submittingOfficeID;

    /**
     * Gets the value of the applicationTransactionID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getApplicationTransactionID() {
        return applicationTransactionID;
    }

    /**
     * Sets the value of the applicationTransactionID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApplicationTransactionID(String value) {
        this.applicationTransactionID = value;
    }

    /**
     * Gets the value of the transactionTimestamp property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * Sets the value of the transactionTimestamp property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTransactionTimestamp(XMLGregorianCalendar value) {
        this.transactionTimestamp = value;
    }

    /**
     * Gets the value of the submittingOfficeID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubmittingOfficeID() {
        return submittingOfficeID;
    }

    /**
     * Sets the value of the submittingOfficeID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubmittingOfficeID(String value) {
        this.submittingOfficeID = value;
    }

}
