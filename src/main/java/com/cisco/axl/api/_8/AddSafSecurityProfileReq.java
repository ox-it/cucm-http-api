
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSafSecurityProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSafSecurityProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="safSecurityProfile" type="{http://www.cisco.com/AXL/API/8.0}XSafSecurityProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSafSecurityProfileReq", propOrder = {
    "safSecurityProfile"
})
public class AddSafSecurityProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSafSecurityProfile safSecurityProfile;

    /**
     * Gets the value of the safSecurityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XSafSecurityProfile }
     *     
     */
    public XSafSecurityProfile getSafSecurityProfile() {
        return safSecurityProfile;
    }

    /**
     * Sets the value of the safSecurityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSafSecurityProfile }
     *     
     */
    public void setSafSecurityProfile(XSafSecurityProfile value) {
        this.safSecurityProfile = value;
    }

}
