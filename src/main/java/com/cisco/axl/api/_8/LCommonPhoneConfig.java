
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCommonPhoneConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCommonPhoneConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/8.0}XDNDOption" minOccurs="0"/>
 *         &lt;element name="dndAlertingType" type="{http://www.cisco.com/AXL/API/8.0}XRingSetting" minOccurs="0"/>
 *         &lt;element name="backgroundImage" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="phonePersonalization" type="{http://www.cisco.com/AXL/API/8.0}XPhonePersonalization" minOccurs="0"/>
 *         &lt;element name="phoneServiceDisplay" type="{http://www.cisco.com/AXL/API/8.0}XPhoneServiceDisplay" minOccurs="0"/>
 *         &lt;element name="sshUserId" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="vpnGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="vpnProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LCommonPhoneConfig", propOrder = {
    "name",
    "description",
    "dndOption",
    "dndAlertingType",
    "backgroundImage",
    "phonePersonalization",
    "phoneServiceDisplay",
    "sshUserId",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "vpnGroupName",
    "vpnProfileName"
})
public class LCommonPhoneConfig {

    protected String name;
    protected String description;
    protected String dndOption;
    protected String dndAlertingType;
    protected String backgroundImage;
    protected String phonePersonalization;
    protected String phoneServiceDisplay;
    protected String sshUserId;
    protected String alwaysUsePrimeLine;
    protected String alwaysUsePrimeLineForVoiceMessage;
    protected XFkType vpnGroupName;
    protected XFkType vpnProfileName;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the dndOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndOption() {
        return dndOption;
    }

    /**
     * Sets the value of the dndOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndOption(String value) {
        this.dndOption = value;
    }

    /**
     * Gets the value of the dndAlertingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndAlertingType() {
        return dndAlertingType;
    }

    /**
     * Sets the value of the dndAlertingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndAlertingType(String value) {
        this.dndAlertingType = value;
    }

    /**
     * Gets the value of the backgroundImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Sets the value of the backgroundImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundImage(String value) {
        this.backgroundImage = value;
    }

    /**
     * Gets the value of the phonePersonalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonePersonalization() {
        return phonePersonalization;
    }

    /**
     * Sets the value of the phonePersonalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonePersonalization(String value) {
        this.phonePersonalization = value;
    }

    /**
     * Gets the value of the phoneServiceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneServiceDisplay() {
        return phoneServiceDisplay;
    }

    /**
     * Sets the value of the phoneServiceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneServiceDisplay(String value) {
        this.phoneServiceDisplay = value;
    }

    /**
     * Gets the value of the sshUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSshUserId() {
        return sshUserId;
    }

    /**
     * Sets the value of the sshUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSshUserId(String value) {
        this.sshUserId = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUsePrimeLine() {
        return alwaysUsePrimeLine;
    }

    /**
     * Sets the value of the alwaysUsePrimeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUsePrimeLine(String value) {
        this.alwaysUsePrimeLine = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUsePrimeLineForVoiceMessage() {
        return alwaysUsePrimeLineForVoiceMessage;
    }

    /**
     * Sets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUsePrimeLineForVoiceMessage(String value) {
        this.alwaysUsePrimeLineForVoiceMessage = value;
    }

    /**
     * Gets the value of the vpnGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getVpnGroupName() {
        return vpnGroupName;
    }

    /**
     * Sets the value of the vpnGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setVpnGroupName(XFkType value) {
        this.vpnGroupName = value;
    }

    /**
     * Gets the value of the vpnProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getVpnProfileName() {
        return vpnProfileName;
    }

    /**
     * Sets the value of the vpnProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setVpnProfileName(XFkType value) {
        this.vpnProfileName = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
