
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVpnProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVpnProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="vpnProfile" type="{http://www.cisco.com/AXL/API/8.5}XVpnProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVpnProfileReq", propOrder = {
    "vpnProfile"
})
public class AddVpnProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVpnProfile vpnProfile;

    /**
     * Gets the value of the vpnProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XVpnProfile }
     *     
     */
    public XVpnProfile getVpnProfile() {
        return vpnProfile;
    }

    /**
     * Sets the value of the vpnProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVpnProfile }
     *     
     */
    public void setVpnProfile(XVpnProfile value) {
        this.vpnProfile = value;
    }

}
