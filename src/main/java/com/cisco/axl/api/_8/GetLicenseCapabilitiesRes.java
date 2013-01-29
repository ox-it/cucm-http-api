
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLicenseCapabilitiesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLicenseCapabilitiesRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="licenseCapabilities" type="{http://www.cisco.com/AXL/API/8.5}RLicenseCapabilities"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLicenseCapabilitiesRes", propOrder = {
    "_return"
})
public class GetLicenseCapabilitiesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLicenseCapabilitiesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLicenseCapabilitiesRes.Return }
     *     
     */
    public GetLicenseCapabilitiesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLicenseCapabilitiesRes.Return }
     *     
     */
    public void setReturn(GetLicenseCapabilitiesRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="licenseCapabilities" type="{http://www.cisco.com/AXL/API/8.5}RLicenseCapabilities"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "licenseCapabilities"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLicenseCapabilities licenseCapabilities;

        /**
         * Gets the value of the licenseCapabilities property.
         * 
         * @return
         *     possible object is
         *     {@link RLicenseCapabilities }
         *     
         */
        public RLicenseCapabilities getLicenseCapabilities() {
            return licenseCapabilities;
        }

        /**
         * Sets the value of the licenseCapabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLicenseCapabilities }
         *     
         */
        public void setLicenseCapabilities(RLicenseCapabilities value) {
            this.licenseCapabilities = value;
        }

    }

}
