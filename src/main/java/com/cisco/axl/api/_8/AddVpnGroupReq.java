
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVpnGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVpnGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="vpnGroup" type="{http://www.cisco.com/AXL/API/8.0}XVpnGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVpnGroupReq", propOrder = {
    "vpnGroup"
})
public class AddVpnGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVpnGroup vpnGroup;

    /**
     * Gets the value of the vpnGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XVpnGroup }
     *     
     */
    public XVpnGroup getVpnGroup() {
        return vpnGroup;
    }

    /**
     * Sets the value of the vpnGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVpnGroup }
     *     
     */
    public void setVpnGroup(XVpnGroup value) {
        this.vpnGroup = value;
    }

}
