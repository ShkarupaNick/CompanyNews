
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchiveDetail complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArchiveDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveProductOptOutIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendArchivePeriodIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PortfolioAssetContainerID" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}PortfolioAssetContainerIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveDetail", propOrder = {
        "archiveProductOptOutIndicator",
        "extendArchivePeriodIndicator",
        "portfolioAssetContainerID"
})
public class ArchiveDetail {

    @XmlElement(name = "ArchiveProductOptOutIndicator")
    @JsonProperty("ArchiveProductOptOutIndicator")
    protected Boolean archiveProductOptOutIndicator;
    @XmlElement(name = "ExtendArchivePeriodIndicator")
    @JsonProperty("ExtendArchivePeriodIndicator")
    protected Boolean extendArchivePeriodIndicator;
    @XmlElement(name = "PortfolioAssetContainerID")
    @JsonProperty("PortfolioAssetContainerID")
    protected Long portfolioAssetContainerID;

    /**
     * Gets the value of the archiveProductOptOutIndicator property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isArchiveProductOptOutIndicator() {
        return archiveProductOptOutIndicator;
    }

    /**
     * Sets the value of the archiveProductOptOutIndicator property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setArchiveProductOptOutIndicator(Boolean value) {
        this.archiveProductOptOutIndicator = value;
    }

    /**
     * Gets the value of the extendArchivePeriodIndicator property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isExtendArchivePeriodIndicator() {
        return extendArchivePeriodIndicator;
    }

    /**
     * Sets the value of the extendArchivePeriodIndicator property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExtendArchivePeriodIndicator(Boolean value) {
        this.extendArchivePeriodIndicator = value;
    }

    /**
     * Gets the value of the portfolioAssetContainerID property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getPortfolioAssetContainerID() {
        return portfolioAssetContainerID;
    }

    /**
     * Sets the value of the portfolioAssetContainerID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPortfolioAssetContainerID(Long value) {
        this.portfolioAssetContainerID = value;
    }

}
