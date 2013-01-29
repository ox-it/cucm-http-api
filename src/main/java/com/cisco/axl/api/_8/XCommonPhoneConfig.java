
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCommonPhoneConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCommonPhoneConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}UniqueString50"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.5}String128" minOccurs="0"/>
 *         &lt;element name="unlockPwd" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/8.5}XDNDOption" minOccurs="0"/>
 *         &lt;element name="dndAlertingType" type="{http://www.cisco.com/AXL/API/8.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="backgroundImage" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="phonePersonalization" type="{http://www.cisco.com/AXL/API/8.5}XPhonePersonalization" minOccurs="0"/>
 *         &lt;element name="phoneServiceDisplay" type="{http://www.cisco.com/AXL/API/8.5}XPhoneServiceDisplay" minOccurs="0"/>
 *         &lt;element name="sshUserId" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="sshPwd" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/8.5}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="vpnGroupName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="vpnProfileName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCommonPhoneConfig", propOrder = {
    "name",
    "description",
    "unlockPwd",
    "dndOption",
    "dndAlertingType",
    "backgroundImage",
    "phonePersonalization",
    "phoneServiceDisplay",
    "sshUserId",
    "sshPwd",
    "vendorConfig",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "vpnGroupName",
    "vpnProfileName",
    "featureControlPolicy"
})
public class XCommonPhoneConfig {

    protected String name;
    protected String description;
    protected String unlockPwd;
    @XmlElement(defaultValue = "Ringer Off")
    protected String dndOption;
    @XmlElement(defaultValue = "Beep Only")
    protected String dndAlertingType;
    @XmlElement(defaultValue = "true")
    protected String backgroundImage;
    @XmlElement(defaultValue = "Default")
    protected String phonePersonalization;
    @XmlElement(defaultValue = "Default")
    protected String phoneServiceDisplay;
    protected String sshUserId;
    protected String sshPwd;
    @XmlElementRef(name = "vendorConfig", type = JAXBElement.class)
    protected JAXBElement<XVendorConfig> vendorConfig;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLine;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLineForVoiceMessage;
    @XmlElementRef(name = "vpnGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> vpnGroupName;
    @XmlElementRef(name = "vpnProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> vpnProfileName;
    @XmlElementRef(name = "featureControlPolicy", type = JAXBElement.class)
    protected JAXBElement<XFkType> featureControlPolicy;

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
     * Gets the value of the unlockPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlockPwd() {
        return unlockPwd;
    }

    /**
     * Sets the value of the unlockPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlockPwd(String value) {
        this.unlockPwd = value;
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
     * Gets the value of the sshPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSshPwd() {
        return sshPwd;
    }

    /**
     * Sets the value of the sshPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSshPwd(String value) {
        this.sshPwd = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XVendorConfig }{@code >}
     *     
     */
    public JAXBElement<XVendorConfig> getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XVendorConfig }{@code >}
     *     
     */
    public void setVendorConfig(JAXBElement<XVendorConfig> value) {
        this.vendorConfig = ((JAXBElement<XVendorConfig> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getVpnGroupName() {
        return vpnGroupName;
    }

    /**
     * Sets the value of the vpnGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setVpnGroupName(JAXBElement<XFkType> value) {
        this.vpnGroupName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the vpnProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getVpnProfileName() {
        return vpnProfileName;
    }

    /**
     * Sets the value of the vpnProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setVpnProfileName(JAXBElement<XFkType> value) {
        this.vpnProfileName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the featureControlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getFeatureControlPolicy() {
        return featureControlPolicy;
    }

    /**
     * Sets the value of the featureControlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setFeatureControlPolicy(JAXBElement<XFkType> value) {
        this.featureControlPolicy = ((JAXBElement<XFkType> ) value);
    }

}
