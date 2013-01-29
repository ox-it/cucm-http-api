
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPhoneSecurityProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPhoneSecurityProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="phoneSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}XPhoneSecurityProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPhoneSecurityProfileReq", propOrder = {
    "phoneSecurityProfile"
})
public class AddPhoneSecurityProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPhoneSecurityProfile phoneSecurityProfile;

    /**
     * Gets the value of the phoneSecurityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XPhoneSecurityProfile }
     *     
     */
    public XPhoneSecurityProfile getPhoneSecurityProfile() {
        return phoneSecurityProfile;
    }

    /**
     * Sets the value of the phoneSecurityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhoneSecurityProfile }
     *     
     */
    public void setPhoneSecurityProfile(XPhoneSecurityProfile value) {
        this.phoneSecurityProfile = value;
    }

}
