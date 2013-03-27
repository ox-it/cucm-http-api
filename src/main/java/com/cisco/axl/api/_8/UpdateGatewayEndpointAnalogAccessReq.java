
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewayEndpointAnalogAccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewayEndpointAnalogAccessReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/8.0}UGatewayEndpointAnalog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewayEndpointAnalogAccessReq", propOrder = {
    "endpoint"
})
public class UpdateGatewayEndpointAnalogAccessReq
    extends NameAndGUIDRequest
{

    protected UGatewayEndpointAnalog endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link UGatewayEndpointAnalog }
     *     
     */
    public UGatewayEndpointAnalog getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link UGatewayEndpointAnalog }
     *     
     */
    public void setEndpoint(UGatewayEndpointAnalog value) {
        this.endpoint = value;
    }

}
