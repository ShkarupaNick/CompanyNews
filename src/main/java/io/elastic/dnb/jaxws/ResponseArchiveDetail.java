
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseArchiveDetail complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ResponseArchiveDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortfolioAssetID" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}PortfolioAssetIDType"/>
 *         &lt;element name="PortfolioAssetContainerID" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}PortfolioAssetContainerIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseArchiveDetail", propOrder = {
        "portfolioAssetID",
        "portfolioAssetContainerID"
})
public class ResponseArchiveDetail {

    @XmlElement(name = "PortfolioAssetID")
    @JsonProperty("PortfolioAssetID")
    protected long portfolioAssetID;
    @XmlElement(name = "PortfolioAssetContainerID")
    @JsonProperty("PortfolioAssetContainerID")
    protected Long portfolioAssetContainerID;

    /**
     * Gets the value of the portfolioAssetID property.
     */
    public long getPortfolioAssetID() {
        return portfolioAssetID;
    }

    /**
     * Sets the value of the portfolioAssetID property.
     */
    public void setPortfolioAssetID(long value) {
        this.portfolioAssetID = value;
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
