
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Records the parameters for refining the news information returned in the product
 * <p>
 * <p>
 * <p>Java class for NewsSpecification complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="NewsSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublishedFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PublishedToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CategoryText" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}NewsCategoryTextEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsSpecification", propOrder = {
        "publishedFromDate",
        "publishedToDate",
        "categoryText"
})
public class NewsSpecification {

    @XmlElement(name = "PublishedFromDate")
    @JsonProperty("PublishedFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publishedFromDate;
    @XmlElement(name = "PublishedToDate")
    @JsonProperty("PublishedToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publishedToDate;
    @XmlElement(name = "CategoryText")
    @JsonProperty("CategoryText")
    protected List<NewsCategoryTextEnum> categoryText;

    /**
     * Gets the value of the publishedFromDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPublishedFromDate() {
        return publishedFromDate;
    }

    /**
     * Sets the value of the publishedFromDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPublishedFromDate(XMLGregorianCalendar value) {
        this.publishedFromDate = value;
    }

    /**
     * Gets the value of the publishedToDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPublishedToDate() {
        return publishedToDate;
    }

    /**
     * Sets the value of the publishedToDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPublishedToDate(XMLGregorianCalendar value) {
        this.publishedToDate = value;
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
     * {@link NewsCategoryTextEnum }
     */
    public List<NewsCategoryTextEnum> getCategoryText() {
        if (categoryText == null) {
            categoryText = new ArrayList<NewsCategoryTextEnum>();
        }
        return this.categoryText;
    }

}
