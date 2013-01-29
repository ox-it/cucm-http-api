
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGatewayEndpointAnalogAccessRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGatewayEndpointAnalogAccessRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gatewayEndpointAnalogAccess" type="{http://www.cisco.com/AXL/API/8.5}RGatewayEndpointAnalogAccess"/>
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
@XmlType(name = "GetGatewayEndpointAnalogAccessRes", propOrder = {
    "_return"
})
public class GetGatewayEndpointAnalogAccessRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGatewayEndpointAnalogAccessRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGatewayEndpointAnalogAccessRes.Return }
     *     
     */
    public GetGatewayEndpointAnalogAccessRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGatewayEndpointAnalogAccessRes.Return }
     *     
     */
    public void setReturn(GetGatewayEndpointAnalogAccessRes.Return value) {
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
     *         &lt;element name="gatewayEndpointAnalogAccess" type="{http://www.cisco.com/AXL/API/8.5}RGatewayEndpointAnalogAccess"/>
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
        "gatewayEndpointAnalogAccess"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGatewayEndpointAnalogAccess gatewayEndpointAnalogAccess;

        /**
         * Gets the value of the gatewayEndpointAnalogAccess property.
         * 
         * @return
         *     possible object is
         *     {@link RGatewayEndpointAnalogAccess }
         *     
         */
        public RGatewayEndpointAnalogAccess getGatewayEndpointAnalogAccess() {
            return gatewayEndpointAnalogAccess;
        }

        /**
         * Sets the value of the gatewayEndpointAnalogAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGatewayEndpointAnalogAccess }
         *     
         */
        public void setGatewayEndpointAnalogAccess(RGatewayEndpointAnalogAccess value) {
            this.gatewayEndpointAnalogAccess = value;
        }

    }

}
