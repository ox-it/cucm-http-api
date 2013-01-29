
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLicenseCapabilitiesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLicenseCapabilitiesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="licenseCapabilities" type="{http://www.cisco.com/AXL/API/8.5}XLicenseCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLicenseCapabilitiesReq", propOrder = {
    "licenseCapabilities"
})
public class AddLicenseCapabilitiesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLicenseCapabilities licenseCapabilities;

    /**
     * Gets the value of the licenseCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link XLicenseCapabilities }
     *     
     */
    public XLicenseCapabilities getLicenseCapabilities() {
        return licenseCapabilities;
    }

    /**
     * Sets the value of the licenseCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLicenseCapabilities }
     *     
     */
    public void setLicenseCapabilities(XLicenseCapabilities value) {
        this.licenseCapabilities = value;
    }

}
