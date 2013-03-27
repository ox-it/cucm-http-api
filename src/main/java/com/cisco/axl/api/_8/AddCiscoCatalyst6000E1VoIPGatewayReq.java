
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCiscoCatalyst6000E1VoIPGatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCiscoCatalyst6000E1VoIPGatewayReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ciscoCatalyst6000E1VoIPGateway" type="{http://www.cisco.com/AXL/API/8.0}XCiscoCatalyst6000E1VoIPGateway"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCiscoCatalyst6000E1VoIPGatewayReq", propOrder = {
    "ciscoCatalyst6000E1VoIPGateway"
})
public class AddCiscoCatalyst6000E1VoIPGatewayReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCiscoCatalyst6000E1VoIPGateway ciscoCatalyst6000E1VoIPGateway;

    /**
     * Gets the value of the ciscoCatalyst6000E1VoIPGateway property.
     * 
     * @return
     *     possible object is
     *     {@link XCiscoCatalyst6000E1VoIPGateway }
     *     
     */
    public XCiscoCatalyst6000E1VoIPGateway getCiscoCatalyst6000E1VoIPGateway() {
        return ciscoCatalyst6000E1VoIPGateway;
    }

    /**
     * Sets the value of the ciscoCatalyst6000E1VoIPGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCiscoCatalyst6000E1VoIPGateway }
     *     
     */
    public void setCiscoCatalyst6000E1VoIPGateway(XCiscoCatalyst6000E1VoIPGateway value) {
        this.ciscoCatalyst6000E1VoIPGateway = value;
    }

}
