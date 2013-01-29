
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewayEndpointAnalogAccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewayEndpointAnalogAccessReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="gatewayEndpointAnalogAccess" type="{http://www.cisco.com/AXL/API/8.5}XGatewayEndpointAnalogAccess"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewayEndpointAnalogAccessReq", propOrder = {
    "gatewayEndpointAnalogAccess"
})
public class AddGatewayEndpointAnalogAccessReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGatewayEndpointAnalogAccess gatewayEndpointAnalogAccess;

    /**
     * Gets the value of the gatewayEndpointAnalogAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointAnalogAccess }
     *     
     */
    public XGatewayEndpointAnalogAccess getGatewayEndpointAnalogAccess() {
        return gatewayEndpointAnalogAccess;
    }

    /**
     * Sets the value of the gatewayEndpointAnalogAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointAnalogAccess }
     *     
     */
    public void setGatewayEndpointAnalogAccess(XGatewayEndpointAnalogAccess value) {
        this.gatewayEndpointAnalogAccess = value;
    }

}
