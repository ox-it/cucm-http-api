
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XVoiceMailProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XVoiceMailProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="voiceMailboxMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voiceMailPilot" type="{http://www.cisco.com/AXL/API/8.0}XVmPilot"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XVoiceMailProfile", propOrder = {
    "name",
    "description",
    "isDefault",
    "voiceMailboxMask",
    "voiceMailPilot"
})
public class XVoiceMailProfile {

    protected String name;
    protected String description;
    @XmlElement(defaultValue = "false")
    protected String isDefault;
    @XmlElementRef(name = "voiceMailboxMask", type = JAXBElement.class)
    protected JAXBElement<String> voiceMailboxMask;
    protected XVmPilot voiceMailPilot;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the voiceMailboxMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceMailboxMask() {
        return voiceMailboxMask;
    }

    /**
     * Sets the value of the voiceMailboxMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceMailboxMask(JAXBElement<String> value) {
        this.voiceMailboxMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the voiceMailPilot property.
     * 
     * @return
     *     possible object is
     *     {@link XVmPilot }
     *     
     */
    public XVmPilot getVoiceMailPilot() {
        return voiceMailPilot;
    }

    /**
     * Sets the value of the voiceMailPilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVmPilot }
     *     
     */
    public void setVoiceMailPilot(XVmPilot value) {
        this.voiceMailPilot = value;
    }

}
