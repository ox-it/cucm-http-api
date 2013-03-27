
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateVoiceMailProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateVoiceMailProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="voiceMailboxMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voiceMailPilot" type="{http://www.cisco.com/AXL/API/8.0}XVmPilot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVoiceMailProfileReq", propOrder = {
    "newName",
    "description",
    "isDefault",
    "voiceMailboxMask",
    "voiceMailPilot"
})
public class UpdateVoiceMailProfileReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    @XmlElement(defaultValue = "false")
    protected String isDefault;
    @XmlElementRef(name = "voiceMailboxMask", type = JAXBElement.class)
    protected JAXBElement<String> voiceMailboxMask;
    protected XVmPilot voiceMailPilot;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
