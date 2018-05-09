
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Records information about the different modes of Telecommunication addresses used by a subject for external contact purposes. The modes of communication include telephone, fax, e-mail, web address.
 * <p>
 * <p>
 * <p>Java class for Telecommunication complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Telecommunication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}TelecommunicationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacsimileNumber" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}TelecommunicationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SocialMediaDetail" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}SocialMediaDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telecommunication", propOrder = {
        "telephoneNumber",
        "facsimileNumber",
        "socialMediaDetail"
})
public class Telecommunication {

    @XmlElement(name = "TelephoneNumber")
    @JsonProperty("TelephoneNumber")
    protected List<TelecommunicationNumberType> telephoneNumber;
    @XmlElement(name = "FacsimileNumber")
    @JsonProperty("FacsimileNumber")
    protected List<TelecommunicationNumberType> facsimileNumber;
    @XmlElement(name = "SocialMediaDetail")
    @JsonProperty("SocialMediaDetail")
    protected List<SocialMediaDetail> socialMediaDetail;

    /**
     * Gets the value of the telephoneNumber property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumber property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumber().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecommunicationNumberType }
     */
    public List<TelecommunicationNumberType> getTelephoneNumber() {
        if (telephoneNumber == null) {
            telephoneNumber = new ArrayList<TelecommunicationNumberType>();
        }
        return this.telephoneNumber;
    }

    /**
     * Gets the value of the facsimileNumber property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimileNumber property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimileNumber().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecommunicationNumberType }
     */
    public List<TelecommunicationNumberType> getFacsimileNumber() {
        if (facsimileNumber == null) {
            facsimileNumber = new ArrayList<TelecommunicationNumberType>();
        }
        return this.facsimileNumber;
    }

    /**
     * Gets the value of the socialMediaDetail property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialMediaDetail property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialMediaDetail().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialMediaDetail }
     */
    public List<SocialMediaDetail> getSocialMediaDetail() {
        if (socialMediaDetail == null) {
            socialMediaDetail = new ArrayList<SocialMediaDetail>();
        }
        return this.socialMediaDetail;
    }

}
