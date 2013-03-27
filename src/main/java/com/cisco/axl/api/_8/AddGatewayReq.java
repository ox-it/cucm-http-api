
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewayReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="gateway" type="{http://www.cisco.com/AXL/API/8.0}XGateway"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewayReq", propOrder = {
    "gateway"
})
public class AddGatewayReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGateway gateway;

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link XGateway }
     *     
     */
    public XGateway getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGateway }
     *     
     */
    public void setGateway(XGateway value) {
        this.gateway = value;
    }

}
