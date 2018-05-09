
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An entry loop which can repeat multiple times to allow the recording of the details of the interactive platforms via which subject creates and shares user-generated content; e.g., Internet forums, weblogs, social blogs, wikis, social networks.
 * <p>
 * <p>
 * <p>Java class for SocialMediaDetail complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="SocialMediaDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialMediaPlatformName" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="UserContentKey" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="UserDisplayName" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="WebPageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriberQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialMediaDetail", propOrder = {
        "socialMediaPlatformName",
        "userContentKey",
        "userDisplayName",
        "webPageURL",
        "subscriberQuantity"
})
public class SocialMediaDetail {

    @XmlElement(name = "SocialMediaPlatformName", required = true)
    @JsonProperty("SocialMediaPlatformName")
    protected DNBDecodedStringType socialMediaPlatformName;
    @XmlElement(name = "UserContentKey")
    @JsonProperty("UserContentKey")
    protected String userContentKey;
    @XmlElement(name = "UserDisplayName")
    @JsonProperty("UserDisplayName")
    protected String userDisplayName;
    @XmlElement(name = "WebPageURL")
    @JsonProperty("WebPageURL")
    protected String webPageURL;
    @XmlElement(name = "SubscriberQuantity")
    @JsonProperty("SubscriberQuantity")
    protected Integer subscriberQuantity;

    /**
     * Gets the value of the socialMediaPlatformName property.
     *
     * @return possible object is
     * {@link DNBDecodedStringType }
     */
    public DNBDecodedStringType getSocialMediaPlatformName() {
        return socialMediaPlatformName;
    }

    /**
     * Sets the value of the socialMediaPlatformName property.
     *
     * @param value allowed object is
     *              {@link DNBDecodedStringType }
     */
    public void setSocialMediaPlatformName(DNBDecodedStringType value) {
        this.socialMediaPlatformName = value;
    }

    /**
     * Gets the value of the userContentKey property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserContentKey() {
        return userContentKey;
    }

    /**
     * Sets the value of the userContentKey property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserContentKey(String value) {
        this.userContentKey = value;
    }

    /**
     * Gets the value of the userDisplayName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserDisplayName() {
        return userDisplayName;
    }

    /**
     * Sets the value of the userDisplayName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserDisplayName(String value) {
        this.userDisplayName = value;
    }

    /**
     * Gets the value of the webPageURL property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWebPageURL() {
        return webPageURL;
    }

    /**
     * Sets the value of the webPageURL property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWebPageURL(String value) {
        this.webPageURL = value;
    }

    /**
     * Gets the value of the subscriberQuantity property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getSubscriberQuantity() {
        return subscriberQuantity;
    }

    /**
     * Sets the value of the subscriberQuantity property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setSubscriberQuantity(Integer value) {
        this.subscriberQuantity = value;
    }

}
