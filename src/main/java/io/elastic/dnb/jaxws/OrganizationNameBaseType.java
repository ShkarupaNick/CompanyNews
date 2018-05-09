
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationNameBaseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="OrganizationNameBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}DNBStringType256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationNameBaseType", propOrder = {
        "organizationName"
})
@XmlSeeAlso({
        OrganizationPrimaryNameType.class
})
public class OrganizationNameBaseType {

    @XmlElement(name = "OrganizationName", required = true)
    @JsonProperty("OrganizationName")
    protected DNBStringType256 organizationName;

    /**
     * Gets the value of the organizationName property.
     *
     * @return possible object is
     * {@link DNBStringType256 }
     */
    public DNBStringType256 getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     *
     * @param value allowed object is
     *              {@link DNBStringType256 }
     */
    public void setOrganizationName(DNBStringType256 value) {
        this.organizationName = value;
    }

}
