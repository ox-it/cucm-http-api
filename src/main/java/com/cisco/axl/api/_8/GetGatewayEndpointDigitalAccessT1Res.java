
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGatewayEndpointDigitalAccessT1Res complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGatewayEndpointDigitalAccessT1Res">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gatewayEndpointDigitalAccessT1" type="{http://www.cisco.com/AXL/API/8.0}RGatewayEndpointDigitalAccessT1"/>
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
@XmlType(name = "GetGatewayEndpointDigitalAccessT1Res", propOrder = {
    "_return"
})
public class GetGatewayEndpointDigitalAccessT1Res
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGatewayEndpointDigitalAccessT1Res.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGatewayEndpointDigitalAccessT1Res.Return }
     *     
     */
    public GetGatewayEndpointDigitalAccessT1Res.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGatewayEndpointDigitalAccessT1Res.Return }
     *     
     */
    public void setReturn(GetGatewayEndpointDigitalAccessT1Res.Return value) {
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
     *         &lt;element name="gatewayEndpointDigitalAccessT1" type="{http://www.cisco.com/AXL/API/8.0}RGatewayEndpointDigitalAccessT1"/>
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
        "gatewayEndpointDigitalAccessT1"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGatewayEndpointDigitalAccessT1 gatewayEndpointDigitalAccessT1;

        /**
         * Gets the value of the gatewayEndpointDigitalAccessT1 property.
         * 
         * @return
         *     possible object is
         *     {@link RGatewayEndpointDigitalAccessT1 }
         *     
         */
        public RGatewayEndpointDigitalAccessT1 getGatewayEndpointDigitalAccessT1() {
            return gatewayEndpointDigitalAccessT1;
        }

        /**
         * Sets the value of the gatewayEndpointDigitalAccessT1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGatewayEndpointDigitalAccessT1 }
         *     
         */
        public void setGatewayEndpointDigitalAccessT1(RGatewayEndpointDigitalAccessT1 value) {
            this.gatewayEndpointDigitalAccessT1 = value;
        }

    }

}
