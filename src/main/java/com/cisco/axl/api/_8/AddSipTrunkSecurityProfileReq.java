
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipTrunkSecurityProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipTrunkSecurityProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sipTrunkSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}XSipTrunkSecurityProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipTrunkSecurityProfileReq", propOrder = {
    "sipTrunkSecurityProfile"
})
public class AddSipTrunkSecurityProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipTrunkSecurityProfile sipTrunkSecurityProfile;

    /**
     * Gets the value of the sipTrunkSecurityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XSipTrunkSecurityProfile }
     *     
     */
    public XSipTrunkSecurityProfile getSipTrunkSecurityProfile() {
        return sipTrunkSecurityProfile;
    }

    /**
     * Sets the value of the sipTrunkSecurityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipTrunkSecurityProfile }
     *     
     */
    public void setSipTrunkSecurityProfile(XSipTrunkSecurityProfile value) {
        this.sipTrunkSecurityProfile = value;
    }

}
