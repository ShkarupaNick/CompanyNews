
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Records the details on news publications collected for this subject and the details of the online service, platform, or site that focuses on facilitating the building of social networks or social relations among people in which this subject is a participant.
 * <p>
 * <p>
 * <p>Java class for News complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="News">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewsDetails" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}NewsDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "News", propOrder = {
        "newsDetails"
})
public class News {

    @XmlElement(name = "NewsDetails")
    @JsonProperty("NewsDetails")
    protected List<NewsDetails> newsDetails;

    /**
     * Gets the value of the newsDetails property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newsDetails property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewsDetails().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewsDetails }
     */
    public List<NewsDetails> getNewsDetails() {
        if (newsDetails == null) {
            newsDetails = new ArrayList<NewsDetails>();
        }
        return this.newsDetails;
    }

}
