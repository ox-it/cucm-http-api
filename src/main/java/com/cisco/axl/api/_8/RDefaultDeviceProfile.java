
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDefaultDeviceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDefaultDeviceProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XProduct" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.cisco.com/AXL/API/8.0}XModel" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/8.0}XClass" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/8.0}XDeviceProtocol" minOccurs="0"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/8.0}XProtocolSide" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.0}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/8.0}XUserLocale" minOccurs="0"/>
 *         &lt;element name="phoneButtonTemplate" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="softkeyTemplate" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="privacy" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/8.0}XBarge" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="ignorePi" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/8.0}XRingSetting" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/8.0}XDNDOption" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mlppIndication" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/8.0}XPreemption" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="emccCallingSearchSpace" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
@XmlType(name = "RDefaultDeviceProfile", propOrder = {
    "name",
    "description",
    "product",
    "model",
    "clazz",
    "protocol",
    "protocolSide",
    "userHoldMohAudioSourceId",
    "userLocale",
    "phoneButtonTemplate",
    "softkeyTemplate",
    "privacy",
    "singleButtonBarge",
    "joinAcrossLines",
    "ignorePi",
    "dndStatus",
    "dndRingSetting",
    "dndOption",
    "mlppDomainId",
    "mlppIndication",
    "preemption",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "emccCallingSearchSpace"
})
public class RDefaultDeviceProfile {

    protected String name;
    protected String description;
    protected String product;
    protected String model;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    protected String protocolSide;
    protected String userHoldMohAudioSourceId;
    protected String userLocale;
    protected XFkType phoneButtonTemplate;
    protected XFkType softkeyTemplate;
    protected String privacy;
    protected String singleButtonBarge;
    protected String joinAcrossLines;
    protected String ignorePi;
    protected String dndStatus;
    protected String dndRingSetting;
    protected String dndOption;
    protected Integer mlppDomainId;
    protected String mlppIndication;
    protected String preemption;
    protected String alwaysUsePrimeLine;
    protected String alwaysUsePrimeLineForVoiceMessage;
    protected XFkType emccCallingSearchSpace;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the protocolSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolSide() {
        return protocolSide;
    }

    /**
     * Sets the value of the protocolSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolSide(String value) {
        this.protocolSide = value;
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHoldMohAudioSourceId(String value) {
        this.userHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the phoneButtonTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPhoneButtonTemplate() {
        return phoneButtonTemplate;
    }

    /**
     * Sets the value of the phoneButtonTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPhoneButtonTemplate(XFkType value) {
        this.phoneButtonTemplate = value;
    }

    /**
     * Gets the value of the softkeyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftkeyTemplate() {
        return softkeyTemplate;
    }

    /**
     * Sets the value of the softkeyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftkeyTemplate(XFkType value) {
        this.softkeyTemplate = value;
    }

    /**
     * Gets the value of the privacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * Sets the value of the privacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacy(String value) {
        this.privacy = value;
    }

    /**
     * Gets the value of the singleButtonBarge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleButtonBarge() {
        return singleButtonBarge;
    }

    /**
     * Sets the value of the singleButtonBarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleButtonBarge(String value) {
        this.singleButtonBarge = value;
    }

    /**
     * Gets the value of the joinAcrossLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinAcrossLines() {
        return joinAcrossLines;
    }

    /**
     * Sets the value of the joinAcrossLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinAcrossLines(String value) {
        this.joinAcrossLines = value;
    }

    /**
     * Gets the value of the ignorePi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnorePi() {
        return ignorePi;
    }

    /**
     * Sets the value of the ignorePi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnorePi(String value) {
        this.ignorePi = value;
    }

    /**
     * Gets the value of the dndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndStatus() {
        return dndStatus;
    }

    /**
     * Sets the value of the dndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndStatus(String value) {
        this.dndStatus = value;
    }

    /**
     * Gets the value of the dndRingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndRingSetting() {
        return dndRingSetting;
    }

    /**
     * Sets the value of the dndRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndRingSetting(String value) {
        this.dndRingSetting = value;
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
     * Gets the value of the mlppDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMlppDomainId(Integer value) {
        this.mlppDomainId = value;
    }

    /**
     * Gets the value of the mlppIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndication() {
        return mlppIndication;
    }

    /**
     * Sets the value of the mlppIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndication(String value) {
        this.mlppIndication = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemption(String value) {
        this.preemption = value;
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
     * Gets the value of the emccCallingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getEmccCallingSearchSpace() {
        return emccCallingSearchSpace;
    }

    /**
     * Sets the value of the emccCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setEmccCallingSearchSpace(XFkType value) {
        this.emccCallingSearchSpace = value;
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
