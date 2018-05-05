
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}Subject">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}OrganizationName" minOccurs="0"/>
 *         &lt;element name="OrganizationDetail" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}OrganizationDetail" minOccurs="0"/>
 *         &lt;element name="News" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}News" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "organizationName",
    "organizationDetail",
    "news"
})
public class Organization
    extends Subject
{

    @XmlElement(name = "OrganizationName")
    protected OrganizationName organizationName;
    @XmlElement(name = "OrganizationDetail")
    protected OrganizationDetail organizationDetail;
    @XmlElement(name = "News")
    protected News news;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationName }
     *     
     */
    public OrganizationName getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationName }
     *     
     */
    public void setOrganizationName(OrganizationName value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetail }
     *     
     */
    public OrganizationDetail getOrganizationDetail() {
        return organizationDetail;
    }

    /**
     * Sets the value of the organizationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetail }
     *     
     */
    public void setOrganizationDetail(OrganizationDetail value) {
        this.organizationDetail = value;
    }

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link News }
     *     
     */
    public News getNews() {
        return news;
    }

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link News }
     *     
     */
    public void setNews(News value) {
        this.news = value;
    }

}
