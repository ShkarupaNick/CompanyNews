
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveProductRequestDetail complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RetrieveProductRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveDetail" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}RetrieveProductArchiveDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductRequestDetail", propOrder = {
        "archiveDetail"
})
public class RetrieveProductRequestDetail {

    @XmlElement(name = "ArchiveDetail", required = true)
    @JsonProperty("ArchiveDetail")
    protected RetrieveProductArchiveDetail archiveDetail;

    /**
     * Gets the value of the archiveDetail property.
     *
     * @return possible object is
     * {@link RetrieveProductArchiveDetail }
     */
    public RetrieveProductArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }

    /**
     * Sets the value of the archiveDetail property.
     *
     * @param value allowed object is
     *              {@link RetrieveProductArchiveDetail }
     */
    public void setArchiveDetail(RetrieveProductArchiveDetail value) {
        this.archiveDetail = value;
    }

}
