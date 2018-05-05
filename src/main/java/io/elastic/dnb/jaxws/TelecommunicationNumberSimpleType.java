
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecommunicationNumberSimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationNumberSimpleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelecommunicationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InternationalDialingCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationNumberSimpleType", propOrder = {
    "telecommunicationNumber",
    "internationalDialingCode"
})
@XmlSeeAlso({
    TelecommunicationNumberType.class
})
public class TelecommunicationNumberSimpleType {

    @XmlElement(name = "TelecommunicationNumber", required = true)
    protected String telecommunicationNumber;
    @XmlElement(name = "InternationalDialingCode")
    protected String internationalDialingCode;

    /**
     * Gets the value of the telecommunicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelecommunicationNumber() {
        return telecommunicationNumber;
    }

    /**
     * Sets the value of the telecommunicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelecommunicationNumber(String value) {
        this.telecommunicationNumber = value;
    }

    /**
     * Gets the value of the internationalDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalDialingCode() {
        return internationalDialingCode;
    }

    /**
     * Sets the value of the internationalDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalDialingCode(String value) {
        this.internationalDialingCode = value;
    }

}
