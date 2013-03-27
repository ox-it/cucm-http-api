
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDefaultDeviceProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDefaultDeviceProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDefaultDeviceProfileReq", propOrder = {
    "description",
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
public class UpdateDefaultDeviceProfileReq
    extends NameAndGUIDRequest
{

    protected String description;
    @XmlElementRef(name = "userHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> userHoldMohAudioSourceId;
    @XmlElementRef(name = "userLocale", type = JAXBElement.class)
    protected JAXBElement<String> userLocale;
    @XmlElementRef(name = "phoneButtonTemplate", type = JAXBElement.class)
    protected JAXBElement<XFkType> phoneButtonTemplate;
    @XmlElementRef(name = "softkeyTemplate", type = JAXBElement.class)
    protected JAXBElement<XFkType> softkeyTemplate;
    @XmlElement(defaultValue = "Default")
    protected String privacy;
    @XmlElement(defaultValue = "Default")
    protected String singleButtonBarge;
    @XmlElement(defaultValue = "Default")
    protected String joinAcrossLines;
    protected String ignorePi;
    protected String dndStatus;
    @XmlElementRef(name = "dndRingSetting", type = JAXBElement.class)
    protected JAXBElement<String> dndRingSetting;
    @XmlElement(defaultValue = "Ringer Off")
    protected String dndOption;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<Integer> mlppDomainId;
    @XmlElement(defaultValue = "Off")
    protected String mlppIndication;
    @XmlElement(defaultValue = "Default")
    protected String preemption;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLine;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLineForVoiceMessage;
    @XmlElementRef(name = "emccCallingSearchSpace", type = JAXBElement.class)
    protected JAXBElement<XFkType> emccCallingSearchSpace;

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
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserHoldMohAudioSourceId(JAXBElement<String> value) {
        this.userHoldMohAudioSourceId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLocale(JAXBElement<String> value) {
        this.userLocale = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneButtonTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPhoneButtonTemplate() {
        return phoneButtonTemplate;
    }

    /**
     * Sets the value of the phoneButtonTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPhoneButtonTemplate(JAXBElement<XFkType> value) {
        this.phoneButtonTemplate = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the softkeyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSoftkeyTemplate() {
        return softkeyTemplate;
    }

    /**
     * Sets the value of the softkeyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSoftkeyTemplate(JAXBElement<XFkType> value) {
        this.softkeyTemplate = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDndRingSetting() {
        return dndRingSetting;
    }

    /**
     * Sets the value of the dndRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDndRingSetting(JAXBElement<String> value) {
        this.dndRingSetting = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMlppDomainId(JAXBElement<Integer> value) {
        this.mlppDomainId = ((JAXBElement<Integer> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getEmccCallingSearchSpace() {
        return emccCallingSearchSpace;
    }

    /**
     * Sets the value of the emccCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setEmccCallingSearchSpace(JAXBElement<XFkType> value) {
        this.emccCallingSearchSpace = ((JAXBElement<XFkType> ) value);
    }

}
