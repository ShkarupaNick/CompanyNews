
package io.elastic.dnb.jaxws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DNBDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBDateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.dnb.com/NewsAndMediaProductServiceV2.0>DNBDateSimpleType">
 *       &lt;attribute name="DatePrecisionText">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="192"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DatePrecisionDNBCodeValue" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="DatePrecisionDNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBDateType", propOrder = {
    "value"
})
public class DNBDateType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DatePrecisionText")
    protected String datePrecisionText;
    @XmlAttribute(name = "DatePrecisionDNBCodeValue")
    protected BigInteger datePrecisionDNBCodeValue;
    @XmlAttribute(name = "DatePrecisionDNBCodeTableNumber")
    protected Integer datePrecisionDNBCodeTableNumber;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is02.13
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the datePrecisionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePrecisionText() {
        return datePrecisionText;
    }

    /**
     * Sets the value of the datePrecisionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePrecisionText(String value) {
        this.datePrecisionText = value;
    }

    /**
     * Gets the value of the datePrecisionDNBCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDatePrecisionDNBCodeValue() {
        return datePrecisionDNBCodeValue;
    }

    /**
     * Sets the value of the datePrecisionDNBCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDatePrecisionDNBCodeValue(BigInteger value) {
        this.datePrecisionDNBCodeValue = value;
    }

    /**
     * Gets the value of the datePrecisionDNBCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatePrecisionDNBCodeTableNumber() {
        return datePrecisionDNBCodeTableNumber;
    }

    /**
     * Sets the value of the datePrecisionDNBCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatePrecisionDNBCodeTableNumber(Integer value) {
        this.datePrecisionDNBCodeTableNumber = value;
    }

}
