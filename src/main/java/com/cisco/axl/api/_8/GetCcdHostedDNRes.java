
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCcdHostedDNRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCcdHostedDNRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ccdHostedDN" type="{http://www.cisco.com/AXL/API/8.5}RCcdHostedDN"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCcdHostedDNRes", propOrder = {
    "_return"
})
public class GetCcdHostedDNRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCcdHostedDNRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCcdHostedDNRes.Return }
     *     
     */
    public GetCcdHostedDNRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCcdHostedDNRes.Return }
     *     
     */
    public void setReturn(GetCcdHostedDNRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ccdHostedDN" type="{http://www.cisco.com/AXL/API/8.5}RCcdHostedDN"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ccdHostedDN"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCcdHostedDN ccdHostedDN;

        /**
         * Gets the value of the ccdHostedDN property.
         * 
         * @return
         *     possible object is
         *     {@link RCcdHostedDN }
         *     
         */
        public RCcdHostedDN getCcdHostedDN() {
            return ccdHostedDN;
        }

        /**
         * Sets the value of the ccdHostedDN property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCcdHostedDN }
         *     
         */
        public void setCcdHostedDN(RCcdHostedDN value) {
            this.ccdHostedDN = value;
        }

    }

}
