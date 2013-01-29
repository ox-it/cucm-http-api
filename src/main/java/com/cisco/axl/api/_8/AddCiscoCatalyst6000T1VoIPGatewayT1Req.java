
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCiscoCatalyst6000T1VoIPGatewayT1Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCiscoCatalyst6000T1VoIPGatewayT1Req">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ciscoCatalyst6000T1VoIPGatewayT1" type="{http://www.cisco.com/AXL/API/8.5}XCiscoCatalyst6000T1VoIPGatewayT1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCiscoCatalyst6000T1VoIPGatewayT1Req", propOrder = {
    "ciscoCatalyst6000T1VoIPGatewayT1"
})
public class AddCiscoCatalyst6000T1VoIPGatewayT1Req
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCiscoCatalyst6000T1VoIPGatewayT1 ciscoCatalyst6000T1VoIPGatewayT1;

    /**
     * Gets the value of the ciscoCatalyst6000T1VoIPGatewayT1 property.
     * 
     * @return
     *     possible object is
     *     {@link XCiscoCatalyst6000T1VoIPGatewayT1 }
     *     
     */
    public XCiscoCatalyst6000T1VoIPGatewayT1 getCiscoCatalyst6000T1VoIPGatewayT1() {
        return ciscoCatalyst6000T1VoIPGatewayT1;
    }

    /**
     * Sets the value of the ciscoCatalyst6000T1VoIPGatewayT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCiscoCatalyst6000T1VoIPGatewayT1 }
     *     
     */
    public void setCiscoCatalyst6000T1VoIPGatewayT1(XCiscoCatalyst6000T1VoIPGatewayT1 value) {
        this.ciscoCatalyst6000T1VoIPGatewayT1 = value;
    }

}
