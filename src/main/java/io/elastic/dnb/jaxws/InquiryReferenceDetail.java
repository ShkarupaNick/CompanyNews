
package io.elastic.dnb.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InquiryReferenceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryReferenceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerReferenceText" maxOccurs="5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomerBillingEndorsementText" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}CustomerReferenceText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryReferenceDetail", propOrder = {
    "customerReferenceText",
    "customerBillingEndorsementText"
})
public class InquiryReferenceDetail {

    @XmlElement(name = "CustomerReferenceText")
    protected List<String> customerReferenceText;
    @XmlElement(name = "CustomerBillingEndorsementText")
    protected String customerBillingEndorsementText;

    /**
     * Gets the value of the customerReferenceText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerReferenceText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerReferenceText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerReferenceText() {
        if (customerReferenceText == null) {
            customerReferenceText = new ArrayList<String>();
        }
        return this.customerReferenceText;
    }

    /**
     * Gets the value of the customerBillingEndorsementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBillingEndorsementText() {
        return customerBillingEndorsementText;
    }

    /**
     * Sets the value of the customerBillingEndorsementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBillingEndorsementText(String value) {
        this.customerBillingEndorsementText = value;
    }

}
