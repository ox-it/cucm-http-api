
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMobileSmartClientProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMobileSmartClientProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="mobileSmartClientProfile" type="{http://www.cisco.com/AXL/API/8.0}XMobileSmartClientProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMobileSmartClientProfileReq", propOrder = {
    "mobileSmartClientProfile"
})
public class AddMobileSmartClientProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMobileSmartClientProfile mobileSmartClientProfile;

    /**
     * Gets the value of the mobileSmartClientProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XMobileSmartClientProfile }
     *     
     */
    public XMobileSmartClientProfile getMobileSmartClientProfile() {
        return mobileSmartClientProfile;
    }

    /**
     * Sets the value of the mobileSmartClientProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMobileSmartClientProfile }
     *     
     */
    public void setMobileSmartClientProfile(XMobileSmartClientProfile value) {
        this.mobileSmartClientProfile = value;
    }

}
