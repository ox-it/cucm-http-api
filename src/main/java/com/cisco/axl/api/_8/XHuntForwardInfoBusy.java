
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XHuntForwardInfoBusy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XHuntForwardInfoBusy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="destination" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="maxHuntduration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XHuntForwardInfoBusy", propOrder = {
    "usePersonalPreferences",
    "callingSearchSpaceName",
    "destination",
    "maxHuntduration"
})
public class XHuntForwardInfoBusy {

    protected String usePersonalPreferences;
    @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceName;
    @XmlElementRef(name = "destination", type = JAXBElement.class)
    protected JAXBElement<String> destination;
    @XmlElementRef(name = "maxHuntduration", type = JAXBElement.class)
    protected JAXBElement<String> maxHuntduration;

    /**
     * Gets the value of the usePersonalPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePersonalPreferences() {
        return usePersonalPreferences;
    }

    /**
     * Sets the value of the usePersonalPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePersonalPreferences(String value) {
        this.usePersonalPreferences = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.callingSearchSpaceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestination(JAXBElement<String> value) {
        this.destination = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maxHuntduration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxHuntduration() {
        return maxHuntduration;
    }

    /**
     * Sets the value of the maxHuntduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxHuntduration(JAXBElement<String> value) {
        this.maxHuntduration = ((JAXBElement<String> ) value);
    }

}
