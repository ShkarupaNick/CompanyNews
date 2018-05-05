
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to the request for retrieving the archived reports/products and investigation reports and also the transaction information associated with this request.
 *          
 * 
 * <p>Java class for RetrieveProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveProductRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="RetrieveProductRequestDetail" type="{http://services.dnb.com/NewsAndMediaProductServiceV2.0}RetrieveProductRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductRequest", propOrder = {
    "retrieveProductRequestDetail"
})
public class RetrieveProductRequest
    extends Request
{

    @XmlElement(name = "RetrieveProductRequestDetail", required = true)
    protected RetrieveProductRequestDetail retrieveProductRequestDetail;

    /**
     * Gets the value of the retrieveProductRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveProductRequestDetail }
     *     
     */
    public RetrieveProductRequestDetail getRetrieveProductRequestDetail() {
        return retrieveProductRequestDetail;
    }

    /**
     * Sets the value of the retrieveProductRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveProductRequestDetail }
     *     
     */
    public void setRetrieveProductRequestDetail(RetrieveProductRequestDetail value) {
        this.retrieveProductRequestDetail = value;
    }

}
