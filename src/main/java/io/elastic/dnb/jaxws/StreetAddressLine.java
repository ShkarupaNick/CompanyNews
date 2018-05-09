
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An entry loop which can repeat multiple times to allow the recording of several street address lines of this address. This includes address line details prior to the Suburb or Town/City region address line. This includes the portion of the address lines which deal with the street address components, such as street name, street number, building name, estate name.
 * <p>
 * <p>
 * <p>Java class for StreetAddressLine complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StreetAddressLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetAddressLine", propOrder = {
        "lineText"
})
public class StreetAddressLine {

    @XmlElement(name = "LineText", required = true)
    @JsonProperty("LineText")
    protected String lineText;

    /**
     * Gets the value of the lineText property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineText() {
        return lineText;
    }

    /**
     * Sets the value of the lineText property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineText(String value) {
        this.lineText = value;
    }

}
