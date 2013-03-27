
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGatewayEndpointDigitalAccessBriRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGatewayEndpointDigitalAccessBriRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gatewayEndpointDigitalAccessBri" type="{http://www.cisco.com/AXL/API/8.0}RGatewayEndpointDigitalAccessBri"/>
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
@XmlType(name = "GetGatewayEndpointDigitalAccessBriRes", propOrder = {
    "_return"
})
public class GetGatewayEndpointDigitalAccessBriRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGatewayEndpointDigitalAccessBriRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGatewayEndpointDigitalAccessBriRes.Return }
     *     
     */
    public GetGatewayEndpointDigitalAccessBriRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGatewayEndpointDigitalAccessBriRes.Return }
     *     
     */
    public void setReturn(GetGatewayEndpointDigitalAccessBriRes.Return value) {
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
     *         &lt;element name="gatewayEndpointDigitalAccessBri" type="{http://www.cisco.com/AXL/API/8.0}RGatewayEndpointDigitalAccessBri"/>
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
        "gatewayEndpointDigitalAccessBri"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGatewayEndpointDigitalAccessBri gatewayEndpointDigitalAccessBri;

        /**
         * Gets the value of the gatewayEndpointDigitalAccessBri property.
         * 
         * @return
         *     possible object is
         *     {@link RGatewayEndpointDigitalAccessBri }
         *     
         */
        public RGatewayEndpointDigitalAccessBri getGatewayEndpointDigitalAccessBri() {
            return gatewayEndpointDigitalAccessBri;
        }

        /**
         * Sets the value of the gatewayEndpointDigitalAccessBri property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGatewayEndpointDigitalAccessBri }
         *     
         */
        public void setGatewayEndpointDigitalAccessBri(RGatewayEndpointDigitalAccessBri value) {
            this.gatewayEndpointDigitalAccessBri = value;
        }

    }

}
