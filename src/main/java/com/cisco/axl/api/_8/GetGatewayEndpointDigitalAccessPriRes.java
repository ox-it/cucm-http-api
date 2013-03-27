
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGatewayEndpointDigitalAccessPriRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGatewayEndpointDigitalAccessPriRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gatewayEndpointDigitalAccessPri" type="{http://www.cisco.com/AXL/API/8.0}RGatewayEndpointDigitalAccessPri"/>
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
@XmlType(name = "GetGatewayEndpointDigitalAccessPriRes", propOrder = {
    "_return"
})
public class GetGatewayEndpointDigitalAccessPriRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGatewayEndpointDigitalAccessPriRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGatewayEndpointDigitalAccessPriRes.Return }
     *     
     */
    public GetGatewayEndpointDigitalAccessPriRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGatewayEndpointDigitalAccessPriRes.Return }
     *     
     */
    public void setReturn(GetGatewayEndpointDigitalAccessPriRes.Return value) {
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
     *         &lt;element name="gatewayEndpointDigitalAccessPri" type="{http://www.cisco.com/AXL/API/8.0}RGatewayEndpointDigitalAccessPri"/>
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
        "gatewayEndpointDigitalAccessPri"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGatewayEndpointDigitalAccessPri gatewayEndpointDigitalAccessPri;

        /**
         * Gets the value of the gatewayEndpointDigitalAccessPri property.
         * 
         * @return
         *     possible object is
         *     {@link RGatewayEndpointDigitalAccessPri }
         *     
         */
        public RGatewayEndpointDigitalAccessPri getGatewayEndpointDigitalAccessPri() {
            return gatewayEndpointDigitalAccessPri;
        }

        /**
         * Sets the value of the gatewayEndpointDigitalAccessPri property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGatewayEndpointDigitalAccessPri }
         *     
         */
        public void setGatewayEndpointDigitalAccessPri(RGatewayEndpointDigitalAccessPri value) {
            this.gatewayEndpointDigitalAccessPri = value;
        }

    }

}
