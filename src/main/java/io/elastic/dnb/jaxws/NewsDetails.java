
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An entry loop which can repeat multiple times to allow the recording of the news publications on this subject.
 * <p>
 * <p>
 * <p>Java class for NewsDetails complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="NewsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublishedDateTimestamp" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="SourceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryText" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TitleText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContentText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WebPageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsDetails", propOrder = {
        "publishedDateTimestamp",
        "sourceDescription",
        "categoryText",
        "titleText",
        "contentText",
        "webPageURL"
})
public class NewsDetails {

    @XmlElement(name = "PublishedDateTimestamp")
    @JsonProperty("PublishedDateTimestamp")
    protected XMLGregorianCalendar publishedDateTimestamp;
    @XmlElement(name = "SourceDescription")
    @JsonProperty("SourceDescription")
    protected String sourceDescription;
    @XmlElement(name = "CategoryText")
    @JsonProperty("CategoryText")
    protected List<DNBDecodedStringType> categoryText;
    @XmlElement(name = "TitleText")
    @JsonProperty("TitleText")
    protected String titleText;
    @XmlElement(name = "ContentText")
    @JsonProperty("ContentText")
    protected String contentText;
    @XmlElement(name = "WebPageURL")
    @JsonProperty("WebPageURL")
    protected String webPageURL;

    /**
     * Gets the value of the publishedDateTimestamp property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPublishedDateTimestamp() {
        return publishedDateTimestamp;
    }

    /**
     * Sets the value of the publishedDateTimestamp property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPublishedDateTimestamp(XMLGregorianCalendar value) {
        this.publishedDateTimestamp = value;
    }

    /**
     * Gets the value of the sourceDescription property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSourceDescription() {
        return sourceDescription;
    }

    /**
     * Sets the value of the sourceDescription property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourceDescription(String value) {
        this.sourceDescription = value;
    }

    /**
     * Gets the value of the categoryText property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryText property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryText().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     */
    public List<DNBDecodedStringType> getCategoryText() {
        if (categoryText == null) {
            categoryText = new ArrayList<DNBDecodedStringType>();
        }
        return this.categoryText;
    }

    /**
     * Gets the value of the titleText property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitleText() {
        return titleText;
    }

    /**
     * Sets the value of the titleText property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitleText(String value) {
        this.titleText = value;
    }

    /**
     * Gets the value of the contentText property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * Sets the value of the contentText property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContentText(String value) {
        this.contentText = value;
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

}
