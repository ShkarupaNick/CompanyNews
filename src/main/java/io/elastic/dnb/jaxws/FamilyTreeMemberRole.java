
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyTreeMemberRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyTreeMemberRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}Role">
 *       &lt;sequence>
 *         &lt;element name="FamilyTreeMemberRoleText" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyTreeMemberRole", propOrder = {
    "familyTreeMemberRoleText"
})
public class FamilyTreeMemberRole
    extends Role
{

    @XmlElement(name = "FamilyTreeMemberRoleText")
    protected DNBDecodedStringType familyTreeMemberRoleText;

    /**
     * Gets the value of the familyTreeMemberRoleText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFamilyTreeMemberRoleText() {
        return familyTreeMemberRoleText;
    }

    /**
     * Sets the value of the familyTreeMemberRoleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFamilyTreeMemberRoleText(DNBDecodedStringType value) {
        this.familyTreeMemberRoleText = value;
    }

}
