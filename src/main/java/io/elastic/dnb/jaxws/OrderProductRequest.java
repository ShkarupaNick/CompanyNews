
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for OrderProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProductRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="OrderProductRequestDetail" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}OrderProductRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProductRequest", propOrder = {
    "orderProductRequestDetail"
})
@XmlRootElement(name = "OrderProductRequest")
public class OrderProductRequest
    extends Request
{

    @XmlElement(name = "OrderProductRequestDetail", required = true)
    protected OrderProductRequestDetail orderProductRequestDetail;

    /**
     * Gets the value of the orderProductRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProductRequestDetail }
     *     
     */
    public OrderProductRequestDetail getOrderProductRequestDetail() {
        return orderProductRequestDetail;
    }

    /**
     * Sets the value of the orderProductRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProductRequestDetail }
     *     
     */
    public void setOrderProductRequestDetail(OrderProductRequestDetail value) {
        this.orderProductRequestDetail = value;
    }

}
