
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDhcpServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDhcpServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="dhcpServer" type="{http://www.cisco.com/AXL/API/8.5}XDhcpServer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDhcpServerReq", propOrder = {
    "dhcpServer"
})
public class AddDhcpServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDhcpServer dhcpServer;

    /**
     * Gets the value of the dhcpServer property.
     * 
     * @return
     *     possible object is
     *     {@link XDhcpServer }
     *     
     */
    public XDhcpServer getDhcpServer() {
        return dhcpServer;
    }

    /**
     * Sets the value of the dhcpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDhcpServer }
     *     
     */
    public void setDhcpServer(XDhcpServer value) {
        this.dhcpServer = value;
    }

}
