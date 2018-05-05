
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectHeader" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}SubjectHeader"/>
 *         &lt;element name="Telecommunication" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}Telecommunication" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subject", propOrder = {
    "subjectHeader",
    "telecommunication",
    "location"
})
@XmlSeeAlso({
    Organization.class
})
public class Subject {

    @XmlElement(name = "SubjectHeader", required = true)
    protected SubjectHeader subjectHeader;
    @XmlElement(name = "Telecommunication")
    protected Telecommunication telecommunication;
    @XmlElement(name = "Location")
    protected Location location;

    /**
     * Gets the value of the subjectHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHeader }
     *     
     */
    public SubjectHeader getSubjectHeader() {
        return subjectHeader;
    }

    /**
     * Sets the value of the subjectHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHeader }
     *     
     */
    public void setSubjectHeader(SubjectHeader value) {
        this.subjectHeader = value;
    }

    /**
     * Gets the value of the telecommunication property.
     * 
     * @return
     *     possible object is
     *     {@link Telecommunication }
     *     
     */
    public Telecommunication getTelecommunication() {
        return telecommunication;
    }

    /**
     * Sets the value of the telecommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telecommunication }
     *     
     */
    public void setTelecommunication(Telecommunication value) {
        this.telecommunication = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}
