
package io.elastic.dnb.jaxws;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveProductResponseDetail complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RetrieveProductResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Product" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}Product"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductResponseDetail", propOrder = {
        "product",
        "inquiryReferenceDetail"
})
public class RetrieveProductResponseDetail {

    @XmlElement(name = "Product", required = true)
    @JsonProperty("Product")
    protected Product product;
    @XmlElement(name = "InquiryReferenceDetail")
    @JsonProperty("InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the product property.
     *
     * @return possible object is
     * {@link Product }
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value allowed object is
     *              {@link Product }
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the inquiryReferenceDetail property.
     *
     * @return possible object is
     * {@link InquiryReferenceDetail }
     */
    public InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }

    /**
     * Sets the value of the inquiryReferenceDetail property.
     *
     * @param value allowed object is
     *              {@link InquiryReferenceDetail }
     */
    public void setInquiryReferenceDetail(InquiryReferenceDetail value) {
        this.inquiryReferenceDetail = value;
    }

}
