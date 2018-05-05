
package io.elastic.dnb.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the parameters for refining the social media information returned in the product.
 *          
 * 
 * <p>Java class for SocialMediaSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialMediaSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialMediaPlatformName" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}SocialMediaNameEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialMediaSpecification", propOrder = {
    "socialMediaPlatformName"
})
public class SocialMediaSpecification {

    @XmlElement(name = "SocialMediaPlatformName")
    protected List<SocialMediaNameEnum> socialMediaPlatformName;

    /**
     * Gets the value of the socialMediaPlatformName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialMediaPlatformName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialMediaPlatformName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialMediaNameEnum }
     * 
     * 
     */
    public List<SocialMediaNameEnum> getSocialMediaPlatformName() {
        if (socialMediaPlatformName == null) {
            socialMediaPlatformName = new ArrayList<SocialMediaNameEnum>();
        }
        return this.socialMediaPlatformName;
    }

}
