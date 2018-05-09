
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSpecification complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ProductSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBProductID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LanguagePreferenceCode" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="TradeUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewsSpecification" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}NewsSpecification" minOccurs="0"/>
 *         &lt;element name="SocialMediaSpecification" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}SocialMediaSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", propOrder = {
        "dnbProductID",
        "languagePreferenceCode",
        "tradeUpIndicator",
        "newsSpecification",
        "socialMediaSpecification"
})
public class ProductSpecification {

    @XmlElement(name = "DNBProductID", required = true)
    @JsonProperty("DNBProductID")
    protected String dnbProductID;
    @XmlElement(name = "LanguagePreferenceCode")
    @JsonProperty("LanguagePreferenceCode")
    protected BigInteger languagePreferenceCode;
    @XmlElement(name = "TradeUpIndicator")
    @JsonProperty("TradeUpIndicator")
    protected Boolean tradeUpIndicator;
    @XmlElement(name = "NewsSpecification")
    @JsonProperty("NewsSpecification")
    protected NewsSpecification newsSpecification;
    @XmlElement(name = "SocialMediaSpecification")
    @JsonProperty("SocialMediaSpecification")
    protected SocialMediaSpecification socialMediaSpecification;

    /**
     * Gets the value of the dnbProductID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDNBProductID() {
        return dnbProductID;
    }

    /**
     * Sets the value of the dnbProductID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDNBProductID(String value) {
        this.dnbProductID = value;
    }

    /**
     * Gets the value of the languagePreferenceCode property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLanguagePreferenceCode() {
        return languagePreferenceCode;
    }

    /**
     * Sets the value of the languagePreferenceCode property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLanguagePreferenceCode(BigInteger value) {
        this.languagePreferenceCode = value;
    }

    /**
     * Gets the value of the tradeUpIndicator property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTradeUpIndicator() {
        return tradeUpIndicator;
    }

    /**
     * Sets the value of the tradeUpIndicator property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTradeUpIndicator(Boolean value) {
        this.tradeUpIndicator = value;
    }

    /**
     * Gets the value of the newsSpecification property.
     *
     * @return possible object is
     * {@link NewsSpecification }
     */
    public NewsSpecification getNewsSpecification() {
        return newsSpecification;
    }

    /**
     * Sets the value of the newsSpecification property.
     *
     * @param value allowed object is
     *              {@link NewsSpecification }
     */
    public void setNewsSpecification(NewsSpecification value) {
        this.newsSpecification = value;
    }

    /**
     * Gets the value of the socialMediaSpecification property.
     *
     * @return possible object is
     * {@link SocialMediaSpecification }
     */
    public SocialMediaSpecification getSocialMediaSpecification() {
        return socialMediaSpecification;
    }

    /**
     * Sets the value of the socialMediaSpecification property.
     *
     * @param value allowed object is
     *              {@link SocialMediaSpecification }
     */
    public void setSocialMediaSpecification(SocialMediaSpecification value) {
        this.socialMediaSpecification = value;
    }

}
