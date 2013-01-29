
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGeoLocationPolicyReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGeoLocationPolicyReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="geoLocationPolicy" type="{http://www.cisco.com/AXL/API/8.5}XGeoLocationPolicy"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGeoLocationPolicyReq", propOrder = {
    "geoLocationPolicy"
})
public class AddGeoLocationPolicyReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGeoLocationPolicy geoLocationPolicy;

    /**
     * Gets the value of the geoLocationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link XGeoLocationPolicy }
     *     
     */
    public XGeoLocationPolicy getGeoLocationPolicy() {
        return geoLocationPolicy;
    }

    /**
     * Sets the value of the geoLocationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGeoLocationPolicy }
     *     
     */
    public void setGeoLocationPolicy(XGeoLocationPolicy value) {
        this.geoLocationPolicy = value;
    }

}
