
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseAddressType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="BaseAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}SimpleAddress">
 *       &lt;sequence>
 *         &lt;element name="TerritoryAbbreviatedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountyOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritoryOfficialName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="LanguageCode" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="WritingScriptCode" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBCodeValueType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAddressType", propOrder = {
        "territoryAbbreviatedName",
        "postalCode",
        "countyOfficialName",
        "territoryOfficialName"
})
@XmlSeeAlso({
        PrimaryAddressType.class,
        MailAddressType.class
})
public class BaseAddressType
        extends SimpleAddress {

    @XmlElement(name = "TerritoryAbbreviatedName")
    @JsonProperty("TerritoryAbbreviatedName")
    protected String territoryAbbreviatedName;
    @XmlElement(name = "PostalCode")
    @JsonProperty("PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountyOfficialName")
    @JsonProperty("CountyOfficialName")
    protected String countyOfficialName;
    @XmlElement(name = "TerritoryOfficialName")
    @JsonProperty("TerritoryOfficialName")
    protected String territoryOfficialName;
    @XmlAttribute(name = "LanguageCode")
    protected BigInteger languageCode;
    @XmlAttribute(name = "WritingScriptCode")
    protected BigInteger writingScriptCode;

    /**
     * Gets the value of the territoryAbbreviatedName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTerritoryAbbreviatedName() {
        return territoryAbbreviatedName;
    }

    /**
     * Sets the value of the territoryAbbreviatedName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTerritoryAbbreviatedName(String value) {
        this.territoryAbbreviatedName = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countyOfficialName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountyOfficialName() {
        return countyOfficialName;
    }

    /**
     * Sets the value of the countyOfficialName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountyOfficialName(String value) {
        this.countyOfficialName = value;
    }

    /**
     * Gets the value of the territoryOfficialName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTerritoryOfficialName() {
        return territoryOfficialName;
    }

    /**
     * Sets the value of the territoryOfficialName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTerritoryOfficialName(String value) {
        this.territoryOfficialName = value;
    }

    /**
     * Gets the value of the languageCode property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLanguageCode(BigInteger value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the writingScriptCode property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getWritingScriptCode() {
        return writingScriptCode;
    }

    /**
     * Sets the value of the writingScriptCode property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setWritingScriptCode(BigInteger value) {
        this.writingScriptCode = value;
    }

}
