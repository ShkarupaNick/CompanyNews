
package io.elastic.dnb.jaxws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DNBStringType256 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBStringType256">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.dnb.com/NewsAndMediaProductServiceV2.0>StringBaseType256">
 *       &lt;attribute name="LanguageCode" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="WritingScriptISOAlpha4Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBStringType256", propOrder = {
    "value"
})
public class DNBStringType256 {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "WritingScriptISOAlpha4Code")
    protected String writingScriptISOAlpha4Code;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguageCode(BigInteger value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the writingScriptISOAlpha4Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritingScriptISOAlpha4Code() {
        return writingScriptISOAlpha4Code;
    }

    /**
     * Sets the value of the writingScriptISOAlpha4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritingScriptISOAlpha4Code(String value) {
        this.writingScriptISOAlpha4Code = value;
    }

}
