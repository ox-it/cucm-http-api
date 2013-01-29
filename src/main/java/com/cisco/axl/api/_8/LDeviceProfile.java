
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LDeviceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDeviceProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}UniqueString128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.5}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.5}XProduct" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.cisco.com/AXL/API/8.5}XModel" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/8.5}XClass" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/8.5}XDeviceProtocol" minOccurs="0"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/8.5}XProtocolSide" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="traceFlag" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/8.5}XPreemption" minOccurs="0"/>
 *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="userlocale" type="{http://www.cisco.com/AXL/API/8.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="defaultProfileName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="currentProfileName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="loginTime" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="loginDuration" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/8.5}XBarge" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="loginUserId" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/8.5}XDNDOption" minOccurs="0"/>
 *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/8.5}XRingSetting" minOccurs="0"/>
 *         &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="emccCallingSearchSpace" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="currentConfig" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.5}XMOHAudioSourceId" minOccurs="0"/>
 *                   &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/8.5}String128" minOccurs="0"/>
 *                   &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/8.5}XPreemption" minOccurs="0"/>
 *                   &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *                   &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/8.5}XBarge" minOccurs="0"/>
 *                   &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *                   &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/8.5}XRingSetting" minOccurs="0"/>
 *                   &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/8.5}XDNDOption" minOccurs="0"/>
 *                   &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="emccCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="deviceName" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *                   &lt;element name="model" type="{http://www.cisco.com/AXL/API/8.5}XModel" minOccurs="0"/>
 *                   &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.5}XProduct" minOccurs="0"/>
 *                   &lt;element name="deviceProtocol" type="{http://www.cisco.com/AXL/API/8.5}XDeviceProtocol" minOccurs="0"/>
 *                   &lt;element name="class" type="{http://www.cisco.com/AXL/API/8.5}XClass" minOccurs="0"/>
 *                   &lt;element name="addressMode" type="{http://www.cisco.com/AXL/API/8.5}XIPAddressingMode" minOccurs="0"/>
 *                   &lt;element name="allowAutoConfig" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *                   &lt;element name="remoteSrstOption" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *                   &lt;element name="remoteSrstIp" type="{http://www.cisco.com/AXL/API/8.5}String15" minOccurs="0"/>
 *                   &lt;element name="remoteSrstPort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *                   &lt;element name="remoteSipSrstIp" type="{http://www.cisco.com/AXL/API/8.5}String15" minOccurs="0"/>
 *                   &lt;element name="remoteSipSrstPort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *                   &lt;element name="geolocationInfo" type="{http://www.cisco.com/AXL/API/8.5}String2048" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDeviceProfile", propOrder = {
    "name",
    "description",
    "product",
    "model",
    "clazz",
    "protocol",
    "protocolSide",
    "userHoldMohAudioSourceId",
    "traceFlag",
    "mlppIndicationStatus",
    "preemption",
    "phoneTemplateName",
    "userlocale",
    "defaultProfileName",
    "currentProfileName",
    "loginTime",
    "loginDuration",
    "singleButtonBarge",
    "joinAcrossLines",
    "loginUserId",
    "ignorePresentationIndicators",
    "dndOption",
    "dndRingSetting",
    "dndStatus",
    "emccCallingSearchSpace",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "softkeyTemplateName",
    "callInfoPrivacyStatus",
    "currentConfig",
    "featureControlPolicy"
})
public class LDeviceProfile {

    protected String name;
    protected String description;
    protected String product;
    protected String model;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    protected String protocolSide;
    protected String userHoldMohAudioSourceId;
    protected String traceFlag;
    protected String mlppIndicationStatus;
    protected String preemption;
    protected XFkType phoneTemplateName;
    protected String userlocale;
    protected String defaultProfileName;
    protected XFkType currentProfileName;
    protected String loginTime;
    protected String loginDuration;
    protected String singleButtonBarge;
    protected String joinAcrossLines;
    protected XFkType loginUserId;
    protected String ignorePresentationIndicators;
    protected String dndOption;
    protected String dndRingSetting;
    protected String dndStatus;
    protected XFkType emccCallingSearchSpace;
    protected String alwaysUsePrimeLine;
    protected String alwaysUsePrimeLineForVoiceMessage;
    protected XFkType softkeyTemplateName;
    protected String callInfoPrivacyStatus;
    protected LDeviceProfile.CurrentConfig currentConfig;
    protected XFkType featureControlPolicy;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;
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
     * Gets the value of the traceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceFlag() {
        return traceFlag;
    }

    /**
     * Sets the value of the traceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceFlag(String value) {
        this.traceFlag = value;
    }

    /**
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndicationStatus(String value) {
        this.mlppIndicationStatus = value;
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
     * Gets the value of the phoneTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPhoneTemplateName() {
        return phoneTemplateName;
    }

    /**
     * Sets the value of the phoneTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPhoneTemplateName(XFkType value) {
        this.phoneTemplateName = value;
    }

    /**
     * Gets the value of the userlocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlocale() {
        return userlocale;
    }

    /**
     * Sets the value of the userlocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlocale(String value) {
        this.userlocale = value;
    }

    /**
     * Gets the value of the defaultProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultProfileName() {
        return defaultProfileName;
    }

    /**
     * Sets the value of the defaultProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultProfileName(String value) {
        this.defaultProfileName = value;
    }

    /**
     * Gets the value of the currentProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCurrentProfileName() {
        return currentProfileName;
    }

    /**
     * Sets the value of the currentProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCurrentProfileName(XFkType value) {
        this.currentProfileName = value;
    }

    /**
     * Gets the value of the loginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * Sets the value of the loginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginTime(String value) {
        this.loginTime = value;
    }

    /**
     * Gets the value of the loginDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginDuration() {
        return loginDuration;
    }

    /**
     * Sets the value of the loginDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginDuration(String value) {
        this.loginDuration = value;
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
     * Gets the value of the loginUserId property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLoginUserId() {
        return loginUserId;
    }

    /**
     * Sets the value of the loginUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLoginUserId(XFkType value) {
        this.loginUserId = value;
    }

    /**
     * Gets the value of the ignorePresentationIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnorePresentationIndicators() {
        return ignorePresentationIndicators;
    }

    /**
     * Sets the value of the ignorePresentationIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnorePresentationIndicators(String value) {
        this.ignorePresentationIndicators = value;
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
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftkeyTemplateName(XFkType value) {
        this.softkeyTemplateName = value;
    }

    /**
     * Gets the value of the callInfoPrivacyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallInfoPrivacyStatus() {
        return callInfoPrivacyStatus;
    }

    /**
     * Sets the value of the callInfoPrivacyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallInfoPrivacyStatus(String value) {
        this.callInfoPrivacyStatus = value;
    }

    /**
     * Gets the value of the currentConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LDeviceProfile.CurrentConfig }
     *     
     */
    public LDeviceProfile.CurrentConfig getCurrentConfig() {
        return currentConfig;
    }

    /**
     * Sets the value of the currentConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDeviceProfile.CurrentConfig }
     *     
     */
    public void setCurrentConfig(LDeviceProfile.CurrentConfig value) {
        this.currentConfig = value;
    }

    /**
     * Gets the value of the featureControlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getFeatureControlPolicy() {
        return featureControlPolicy;
    }

    /**
     * Sets the value of the featureControlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setFeatureControlPolicy(XFkType value) {
        this.featureControlPolicy = value;
    }

    /**
     * Gets the value of the ctiid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCtiid() {
        return ctiid;
    }

    /**
     * Sets the value of the ctiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCtiid(BigInteger value) {
        this.ctiid = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.5}XMOHAudioSourceId" minOccurs="0"/>
     *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
     *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/8.5}String128" minOccurs="0"/>
     *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
     *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/8.5}XPreemption" minOccurs="0"/>
     *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
     *         &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
     *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/8.5}XBarge" minOccurs="0"/>
     *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
     *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
     *         &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
     *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/8.5}XRingSetting" minOccurs="0"/>
     *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/8.5}XDNDOption" minOccurs="0"/>
     *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
     *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
     *         &lt;element name="emccCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
     *         &lt;element name="deviceName" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
     *         &lt;element name="model" type="{http://www.cisco.com/AXL/API/8.5}XModel" minOccurs="0"/>
     *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.5}XProduct" minOccurs="0"/>
     *         &lt;element name="deviceProtocol" type="{http://www.cisco.com/AXL/API/8.5}XDeviceProtocol" minOccurs="0"/>
     *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/8.5}XClass" minOccurs="0"/>
     *         &lt;element name="addressMode" type="{http://www.cisco.com/AXL/API/8.5}XIPAddressingMode" minOccurs="0"/>
     *         &lt;element name="allowAutoConfig" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
     *         &lt;element name="remoteSrstOption" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
     *         &lt;element name="remoteSrstIp" type="{http://www.cisco.com/AXL/API/8.5}String15" minOccurs="0"/>
     *         &lt;element name="remoteSrstPort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
     *         &lt;element name="remoteSipSrstIp" type="{http://www.cisco.com/AXL/API/8.5}String15" minOccurs="0"/>
     *         &lt;element name="remoteSipSrstPort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
     *         &lt;element name="geolocationInfo" type="{http://www.cisco.com/AXL/API/8.5}String2048" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userHoldMohAudioSourceId",
        "phoneTemplateName",
        "mlppDomainId",
        "mlppIndicationStatus",
        "preemption",
        "softkeyTemplateName",
        "ignorePresentationIndicators",
        "singleButtonBarge",
        "joinAcrossLines",
        "callInfoPrivacyStatus",
        "dndStatus",
        "dndRingSetting",
        "dndOption",
        "alwaysUsePrimeLine",
        "alwaysUsePrimeLineForVoiceMessage",
        "emccCallingSearchSpaceName",
        "deviceName",
        "model",
        "product",
        "deviceProtocol",
        "clazz",
        "addressMode",
        "allowAutoConfig",
        "remoteSrstOption",
        "remoteSrstIp",
        "remoteSrstPort",
        "remoteSipSrstIp",
        "remoteSipSrstPort",
        "geolocationInfo"
    })
    public static class CurrentConfig {

        protected String userHoldMohAudioSourceId;
        protected XFkType phoneTemplateName;
        protected String mlppDomainId;
        protected String mlppIndicationStatus;
        protected String preemption;
        protected XFkType softkeyTemplateName;
        protected String ignorePresentationIndicators;
        protected String singleButtonBarge;
        protected String joinAcrossLines;
        protected String callInfoPrivacyStatus;
        protected String dndStatus;
        protected String dndRingSetting;
        protected String dndOption;
        protected String alwaysUsePrimeLine;
        protected String alwaysUsePrimeLineForVoiceMessage;
        protected XFkType emccCallingSearchSpaceName;
        protected String deviceName;
        protected String model;
        protected String product;
        protected String deviceProtocol;
        @XmlElement(name = "class")
        protected String clazz;
        protected String addressMode;
        protected String allowAutoConfig;
        protected String remoteSrstOption;
        protected String remoteSrstIp;
        protected String remoteSrstPort;
        protected String remoteSipSrstIp;
        protected String remoteSipSrstPort;
        protected String geolocationInfo;

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
         * Gets the value of the phoneTemplateName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getPhoneTemplateName() {
            return phoneTemplateName;
        }

        /**
         * Sets the value of the phoneTemplateName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setPhoneTemplateName(XFkType value) {
            this.phoneTemplateName = value;
        }

        /**
         * Gets the value of the mlppDomainId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMlppDomainId() {
            return mlppDomainId;
        }

        /**
         * Sets the value of the mlppDomainId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMlppDomainId(String value) {
            this.mlppDomainId = value;
        }

        /**
         * Gets the value of the mlppIndicationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMlppIndicationStatus() {
            return mlppIndicationStatus;
        }

        /**
         * Sets the value of the mlppIndicationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMlppIndicationStatus(String value) {
            this.mlppIndicationStatus = value;
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
         * Gets the value of the softkeyTemplateName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getSoftkeyTemplateName() {
            return softkeyTemplateName;
        }

        /**
         * Sets the value of the softkeyTemplateName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setSoftkeyTemplateName(XFkType value) {
            this.softkeyTemplateName = value;
        }

        /**
         * Gets the value of the ignorePresentationIndicators property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIgnorePresentationIndicators() {
            return ignorePresentationIndicators;
        }

        /**
         * Sets the value of the ignorePresentationIndicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIgnorePresentationIndicators(String value) {
            this.ignorePresentationIndicators = value;
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
         * Gets the value of the callInfoPrivacyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallInfoPrivacyStatus() {
            return callInfoPrivacyStatus;
        }

        /**
         * Sets the value of the callInfoPrivacyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallInfoPrivacyStatus(String value) {
            this.callInfoPrivacyStatus = value;
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
         * Gets the value of the emccCallingSearchSpaceName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getEmccCallingSearchSpaceName() {
            return emccCallingSearchSpaceName;
        }

        /**
         * Sets the value of the emccCallingSearchSpaceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setEmccCallingSearchSpaceName(XFkType value) {
            this.emccCallingSearchSpaceName = value;
        }

        /**
         * Gets the value of the deviceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceName() {
            return deviceName;
        }

        /**
         * Sets the value of the deviceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceName(String value) {
            this.deviceName = value;
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
         * Gets the value of the deviceProtocol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceProtocol() {
            return deviceProtocol;
        }

        /**
         * Sets the value of the deviceProtocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceProtocol(String value) {
            this.deviceProtocol = value;
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
         * Gets the value of the addressMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressMode() {
            return addressMode;
        }

        /**
         * Sets the value of the addressMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressMode(String value) {
            this.addressMode = value;
        }

        /**
         * Gets the value of the allowAutoConfig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllowAutoConfig() {
            return allowAutoConfig;
        }

        /**
         * Sets the value of the allowAutoConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllowAutoConfig(String value) {
            this.allowAutoConfig = value;
        }

        /**
         * Gets the value of the remoteSrstOption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSrstOption() {
            return remoteSrstOption;
        }

        /**
         * Sets the value of the remoteSrstOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSrstOption(String value) {
            this.remoteSrstOption = value;
        }

        /**
         * Gets the value of the remoteSrstIp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSrstIp() {
            return remoteSrstIp;
        }

        /**
         * Sets the value of the remoteSrstIp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSrstIp(String value) {
            this.remoteSrstIp = value;
        }

        /**
         * Gets the value of the remoteSrstPort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSrstPort() {
            return remoteSrstPort;
        }

        /**
         * Sets the value of the remoteSrstPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSrstPort(String value) {
            this.remoteSrstPort = value;
        }

        /**
         * Gets the value of the remoteSipSrstIp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSipSrstIp() {
            return remoteSipSrstIp;
        }

        /**
         * Sets the value of the remoteSipSrstIp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSipSrstIp(String value) {
            this.remoteSipSrstIp = value;
        }

        /**
         * Gets the value of the remoteSipSrstPort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemoteSipSrstPort() {
            return remoteSipSrstPort;
        }

        /**
         * Sets the value of the remoteSipSrstPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemoteSipSrstPort(String value) {
            this.remoteSipSrstPort = value;
        }

        /**
         * Gets the value of the geolocationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeolocationInfo() {
            return geolocationInfo;
        }

        /**
         * Sets the value of the geolocationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeolocationInfo(String value) {
            this.geolocationInfo = value;
        }

    }

}
