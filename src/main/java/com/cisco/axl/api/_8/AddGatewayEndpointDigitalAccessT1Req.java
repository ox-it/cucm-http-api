
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewayEndpointDigitalAccessT1Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewayEndpointDigitalAccessT1Req">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="gatewayEndpointDigitalAccessT1" type="{http://www.cisco.com/AXL/API/8.5}XGatewayEndpointDigitalAccessT1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewayEndpointDigitalAccessT1Req", propOrder = {
    "gatewayEndpointDigitalAccessT1"
})
public class AddGatewayEndpointDigitalAccessT1Req
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGatewayEndpointDigitalAccessT1 gatewayEndpointDigitalAccessT1;

    /**
     * Gets the value of the gatewayEndpointDigitalAccessT1 property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalAccessT1 }
     *     
     */
    public XGatewayEndpointDigitalAccessT1 getGatewayEndpointDigitalAccessT1() {
        return gatewayEndpointDigitalAccessT1;
    }

    /**
     * Sets the value of the gatewayEndpointDigitalAccessT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalAccessT1 }
     *     
     */
    public void setGatewayEndpointDigitalAccessT1(XGatewayEndpointDigitalAccessT1 value) {
        this.gatewayEndpointDigitalAccessT1 = value;
    }

}
