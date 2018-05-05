
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveProductArchiveDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveProductArchiveDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortfolioAssetContainerID" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}PortfolioAssetContainerIDType" minOccurs="0"/>
 *         &lt;element name="PortfolioAssetID" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}PortfolioAssetIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductArchiveDetail", propOrder = {
    "portfolioAssetContainerID",
    "portfolioAssetID"
})
public class RetrieveProductArchiveDetail {

    @XmlElement(name = "PortfolioAssetContainerID")
    protected Long portfolioAssetContainerID;
    @XmlElement(name = "PortfolioAssetID")
    protected long portfolioAssetID;

    /**
     * Gets the value of the portfolioAssetContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioAssetContainerID() {
        return portfolioAssetContainerID;
    }

    /**
     * Sets the value of the portfolioAssetContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioAssetContainerID(Long value) {
        this.portfolioAssetContainerID = value;
    }

    /**
     * Gets the value of the portfolioAssetID property.
     * 
     */
    public long getPortfolioAssetID() {
        return portfolioAssetID;
    }

    /**
     * Sets the value of the portfolioAssetID property.
     * 
     */
    public void setPortfolioAssetID(long value) {
        this.portfolioAssetID = value;
    }

}
