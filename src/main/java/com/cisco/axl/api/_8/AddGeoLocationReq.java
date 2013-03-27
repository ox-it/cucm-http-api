
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGeoLocationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGeoLocationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="geoLocation" type="{http://www.cisco.com/AXL/API/8.0}XGeoLocation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGeoLocationReq", propOrder = {
    "geoLocation"
})
public class AddGeoLocationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGeoLocation geoLocation;

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link XGeoLocation }
     *     
     */
    public XGeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGeoLocation }
     *     
     */
    public void setGeoLocation(XGeoLocation value) {
        this.geoLocation = value;
    }

}
