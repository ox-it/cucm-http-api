
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLocationRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLocationRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="rsvpSetting" type="{http://www.cisco.com/AXL/API/8.5}XMatrixValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLocationRelationship", propOrder = {
    "locationName",
    "rsvpSetting"
})
public class XLocationRelationship {

    protected XFkType locationName;
    protected String rsvpSetting;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocationName(XFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the rsvpSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvpSetting() {
        return rsvpSetting;
    }

    /**
     * Sets the value of the rsvpSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsvpSetting(String value) {
        this.rsvpSetting = value;
    }

}
