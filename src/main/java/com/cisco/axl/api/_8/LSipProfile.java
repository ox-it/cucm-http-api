
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LSipProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LSipProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
 *         &lt;element name="defaultTelephonyEventPayloadType" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="redirectByApplication" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="ringing180" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="timerInvite" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="timerRegisterDelta" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="timerRegister" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="timerT1" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="timerT2" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="retryInvite" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="retryNotInvite" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="startMediaPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="stopMediaPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callpickupUri" type="{http://www.cisco.com/AXL/API/8.0}Name128" minOccurs="0"/>
 *         &lt;element name="callpickupListUri" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="callpickupGroupUri" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="meetmeServiceUrl" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="userInfo" type="{http://www.cisco.com/AXL/API/8.0}XZzuserInfo" minOccurs="0"/>
 *         &lt;element name="dtmfDbLevel" type="{http://www.cisco.com/AXL/API/8.0}XZzdtmfDbLevel" minOccurs="0"/>
 *         &lt;element name="callHoldRingback" type="{http://www.cisco.com/AXL/API/8.0}XZzpreff" minOccurs="0"/>
 *         &lt;element name="anonymousCallBlock" type="{http://www.cisco.com/AXL/API/8.0}XZzpreff" minOccurs="0"/>
 *         &lt;element name="callerIdBlock" type="{http://www.cisco.com/AXL/API/8.0}XZzpreff" minOccurs="0"/>
 *         &lt;element name="dndControl" type="{http://www.cisco.com/AXL/API/8.0}XZzdndcontrol" minOccurs="0"/>
 *         &lt;element name="telnetLevel" type="{http://www.cisco.com/AXL/API/8.0}XTelnetLevel" minOccurs="0"/>
 *         &lt;element name="timerKeepAlive" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="timerSubscribe" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="timerSubscribeDelta" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="maxRedirects" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="timerOffHookToFirstDigit" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callForwardUri" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="abbreviatedDialUri" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="confJointEnable" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="rfc2543Hold" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="semiAttendedTransfer" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enableVad" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="stutterMsgWaiting" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="callStats" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="t38Invite" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="rerouteIncomingRequest" type="{http://www.cisco.com/AXL/API/8.0}XSIPReroute" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespaceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="enableAnatForEarlyOfferCalls" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="rsvpOverSip" type="{http://www.cisco.com/AXL/API/8.0}XRSVPOverSIP" minOccurs="0"/>
 *         &lt;element name="fallbackToLocalRsvp" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="sipRe11XxEnabled" type="{http://www.cisco.com/AXL/API/8.0}XSIPRel1XXOptions" minOccurs="0"/>
 *         &lt;element name="gClear" type="{http://www.cisco.com/AXL/API/8.0}XGClear" minOccurs="0"/>
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
@XmlType(name = "LSipProfile", propOrder = {
    "name",
    "description",
    "defaultTelephonyEventPayloadType",
    "redirectByApplication",
    "ringing180",
    "timerInvite",
    "timerRegisterDelta",
    "timerRegister",
    "timerT1",
    "timerT2",
    "retryInvite",
    "retryNotInvite",
    "startMediaPort",
    "stopMediaPort",
    "callpickupUri",
    "callpickupListUri",
    "callpickupGroupUri",
    "meetmeServiceUrl",
    "userInfo",
    "dtmfDbLevel",
    "callHoldRingback",
    "anonymousCallBlock",
    "callerIdBlock",
    "dndControl",
    "telnetLevel",
    "timerKeepAlive",
    "timerSubscribe",
    "timerSubscribeDelta",
    "maxRedirects",
    "timerOffHookToFirstDigit",
    "callForwardUri",
    "abbreviatedDialUri",
    "confJointEnable",
    "rfc2543Hold",
    "semiAttendedTransfer",
    "enableVad",
    "stutterMsgWaiting",
    "callStats",
    "t38Invite",
    "rerouteIncomingRequest",
    "resourcePriorityNamespaceListName",
    "enableAnatForEarlyOfferCalls",
    "rsvpOverSip",
    "fallbackToLocalRsvp",
    "sipRe11XxEnabled",
    "gClear"
})
public class LSipProfile {

    protected String name;
    protected String description;
    protected String defaultTelephonyEventPayloadType;
    protected String redirectByApplication;
    protected String ringing180;
    protected String timerInvite;
    protected String timerRegisterDelta;
    protected String timerRegister;
    protected String timerT1;
    protected String timerT2;
    protected String retryInvite;
    protected String retryNotInvite;
    protected String startMediaPort;
    protected String stopMediaPort;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String callpickupUri;
    protected String callpickupListUri;
    protected String callpickupGroupUri;
    protected String meetmeServiceUrl;
    protected String userInfo;
    protected String dtmfDbLevel;
    protected String callHoldRingback;
    protected String anonymousCallBlock;
    protected String callerIdBlock;
    protected String dndControl;
    protected String telnetLevel;
    protected String timerKeepAlive;
    protected String timerSubscribe;
    protected String timerSubscribeDelta;
    protected String maxRedirects;
    protected String timerOffHookToFirstDigit;
    protected String callForwardUri;
    protected String abbreviatedDialUri;
    protected String confJointEnable;
    protected String rfc2543Hold;
    protected String semiAttendedTransfer;
    protected String enableVad;
    protected String stutterMsgWaiting;
    protected String callStats;
    protected String t38Invite;
    protected String rerouteIncomingRequest;
    protected XFkType resourcePriorityNamespaceListName;
    protected String enableAnatForEarlyOfferCalls;
    protected String rsvpOverSip;
    protected String fallbackToLocalRsvp;
    protected String sipRe11XxEnabled;
    protected String gClear;
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
     * Gets the value of the defaultTelephonyEventPayloadType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTelephonyEventPayloadType() {
        return defaultTelephonyEventPayloadType;
    }

    /**
     * Sets the value of the defaultTelephonyEventPayloadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTelephonyEventPayloadType(String value) {
        this.defaultTelephonyEventPayloadType = value;
    }

    /**
     * Gets the value of the redirectByApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectByApplication() {
        return redirectByApplication;
    }

    /**
     * Sets the value of the redirectByApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectByApplication(String value) {
        this.redirectByApplication = value;
    }

    /**
     * Gets the value of the ringing180 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRinging180() {
        return ringing180;
    }

    /**
     * Sets the value of the ringing180 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRinging180(String value) {
        this.ringing180 = value;
    }

    /**
     * Gets the value of the timerInvite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerInvite() {
        return timerInvite;
    }

    /**
     * Sets the value of the timerInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerInvite(String value) {
        this.timerInvite = value;
    }

    /**
     * Gets the value of the timerRegisterDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerRegisterDelta() {
        return timerRegisterDelta;
    }

    /**
     * Sets the value of the timerRegisterDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerRegisterDelta(String value) {
        this.timerRegisterDelta = value;
    }

    /**
     * Gets the value of the timerRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerRegister() {
        return timerRegister;
    }

    /**
     * Sets the value of the timerRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerRegister(String value) {
        this.timerRegister = value;
    }

    /**
     * Gets the value of the timerT1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerT1() {
        return timerT1;
    }

    /**
     * Sets the value of the timerT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerT1(String value) {
        this.timerT1 = value;
    }

    /**
     * Gets the value of the timerT2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerT2() {
        return timerT2;
    }

    /**
     * Sets the value of the timerT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerT2(String value) {
        this.timerT2 = value;
    }

    /**
     * Gets the value of the retryInvite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryInvite() {
        return retryInvite;
    }

    /**
     * Sets the value of the retryInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryInvite(String value) {
        this.retryInvite = value;
    }

    /**
     * Gets the value of the retryNotInvite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryNotInvite() {
        return retryNotInvite;
    }

    /**
     * Sets the value of the retryNotInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryNotInvite(String value) {
        this.retryNotInvite = value;
    }

    /**
     * Gets the value of the startMediaPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMediaPort() {
        return startMediaPort;
    }

    /**
     * Sets the value of the startMediaPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMediaPort(String value) {
        this.startMediaPort = value;
    }

    /**
     * Gets the value of the stopMediaPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopMediaPort() {
        return stopMediaPort;
    }

    /**
     * Sets the value of the stopMediaPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopMediaPort(String value) {
        this.stopMediaPort = value;
    }

    /**
     * Gets the value of the callpickupUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallpickupUri() {
        return callpickupUri;
    }

    /**
     * Sets the value of the callpickupUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallpickupUri(String value) {
        this.callpickupUri = value;
    }

    /**
     * Gets the value of the callpickupListUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallpickupListUri() {
        return callpickupListUri;
    }

    /**
     * Sets the value of the callpickupListUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallpickupListUri(String value) {
        this.callpickupListUri = value;
    }

    /**
     * Gets the value of the callpickupGroupUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallpickupGroupUri() {
        return callpickupGroupUri;
    }

    /**
     * Sets the value of the callpickupGroupUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallpickupGroupUri(String value) {
        this.callpickupGroupUri = value;
    }

    /**
     * Gets the value of the meetmeServiceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetmeServiceUrl() {
        return meetmeServiceUrl;
    }

    /**
     * Sets the value of the meetmeServiceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetmeServiceUrl(String value) {
        this.meetmeServiceUrl = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInfo(String value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the dtmfDbLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtmfDbLevel() {
        return dtmfDbLevel;
    }

    /**
     * Sets the value of the dtmfDbLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtmfDbLevel(String value) {
        this.dtmfDbLevel = value;
    }

    /**
     * Gets the value of the callHoldRingback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallHoldRingback() {
        return callHoldRingback;
    }

    /**
     * Sets the value of the callHoldRingback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallHoldRingback(String value) {
        this.callHoldRingback = value;
    }

    /**
     * Gets the value of the anonymousCallBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousCallBlock() {
        return anonymousCallBlock;
    }

    /**
     * Sets the value of the anonymousCallBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousCallBlock(String value) {
        this.anonymousCallBlock = value;
    }

    /**
     * Gets the value of the callerIdBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdBlock() {
        return callerIdBlock;
    }

    /**
     * Sets the value of the callerIdBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdBlock(String value) {
        this.callerIdBlock = value;
    }

    /**
     * Gets the value of the dndControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDndControl() {
        return dndControl;
    }

    /**
     * Sets the value of the dndControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDndControl(String value) {
        this.dndControl = value;
    }

    /**
     * Gets the value of the telnetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelnetLevel() {
        return telnetLevel;
    }

    /**
     * Sets the value of the telnetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelnetLevel(String value) {
        this.telnetLevel = value;
    }

    /**
     * Gets the value of the timerKeepAlive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerKeepAlive() {
        return timerKeepAlive;
    }

    /**
     * Sets the value of the timerKeepAlive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerKeepAlive(String value) {
        this.timerKeepAlive = value;
    }

    /**
     * Gets the value of the timerSubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerSubscribe() {
        return timerSubscribe;
    }

    /**
     * Sets the value of the timerSubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerSubscribe(String value) {
        this.timerSubscribe = value;
    }

    /**
     * Gets the value of the timerSubscribeDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerSubscribeDelta() {
        return timerSubscribeDelta;
    }

    /**
     * Sets the value of the timerSubscribeDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerSubscribeDelta(String value) {
        this.timerSubscribeDelta = value;
    }

    /**
     * Gets the value of the maxRedirects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRedirects() {
        return maxRedirects;
    }

    /**
     * Sets the value of the maxRedirects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRedirects(String value) {
        this.maxRedirects = value;
    }

    /**
     * Gets the value of the timerOffHookToFirstDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerOffHookToFirstDigit() {
        return timerOffHookToFirstDigit;
    }

    /**
     * Sets the value of the timerOffHookToFirstDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerOffHookToFirstDigit(String value) {
        this.timerOffHookToFirstDigit = value;
    }

    /**
     * Gets the value of the callForwardUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardUri() {
        return callForwardUri;
    }

    /**
     * Sets the value of the callForwardUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardUri(String value) {
        this.callForwardUri = value;
    }

    /**
     * Gets the value of the abbreviatedDialUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviatedDialUri() {
        return abbreviatedDialUri;
    }

    /**
     * Sets the value of the abbreviatedDialUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviatedDialUri(String value) {
        this.abbreviatedDialUri = value;
    }

    /**
     * Gets the value of the confJointEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfJointEnable() {
        return confJointEnable;
    }

    /**
     * Sets the value of the confJointEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfJointEnable(String value) {
        this.confJointEnable = value;
    }

    /**
     * Gets the value of the rfc2543Hold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc2543Hold() {
        return rfc2543Hold;
    }

    /**
     * Sets the value of the rfc2543Hold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc2543Hold(String value) {
        this.rfc2543Hold = value;
    }

    /**
     * Gets the value of the semiAttendedTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemiAttendedTransfer() {
        return semiAttendedTransfer;
    }

    /**
     * Sets the value of the semiAttendedTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemiAttendedTransfer(String value) {
        this.semiAttendedTransfer = value;
    }

    /**
     * Gets the value of the enableVad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableVad() {
        return enableVad;
    }

    /**
     * Sets the value of the enableVad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableVad(String value) {
        this.enableVad = value;
    }

    /**
     * Gets the value of the stutterMsgWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStutterMsgWaiting() {
        return stutterMsgWaiting;
    }

    /**
     * Sets the value of the stutterMsgWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStutterMsgWaiting(String value) {
        this.stutterMsgWaiting = value;
    }

    /**
     * Gets the value of the callStats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallStats() {
        return callStats;
    }

    /**
     * Sets the value of the callStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallStats(String value) {
        this.callStats = value;
    }

    /**
     * Gets the value of the t38Invite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT38Invite() {
        return t38Invite;
    }

    /**
     * Sets the value of the t38Invite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT38Invite(String value) {
        this.t38Invite = value;
    }

    /**
     * Gets the value of the rerouteIncomingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRerouteIncomingRequest() {
        return rerouteIncomingRequest;
    }

    /**
     * Sets the value of the rerouteIncomingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRerouteIncomingRequest(String value) {
        this.rerouteIncomingRequest = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespaceListName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getResourcePriorityNamespaceListName() {
        return resourcePriorityNamespaceListName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setResourcePriorityNamespaceListName(XFkType value) {
        this.resourcePriorityNamespaceListName = value;
    }

    /**
     * Gets the value of the enableAnatForEarlyOfferCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableAnatForEarlyOfferCalls() {
        return enableAnatForEarlyOfferCalls;
    }

    /**
     * Sets the value of the enableAnatForEarlyOfferCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableAnatForEarlyOfferCalls(String value) {
        this.enableAnatForEarlyOfferCalls = value;
    }

    /**
     * Gets the value of the rsvpOverSip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvpOverSip() {
        return rsvpOverSip;
    }

    /**
     * Sets the value of the rsvpOverSip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsvpOverSip(String value) {
        this.rsvpOverSip = value;
    }

    /**
     * Gets the value of the fallbackToLocalRsvp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackToLocalRsvp() {
        return fallbackToLocalRsvp;
    }

    /**
     * Sets the value of the fallbackToLocalRsvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackToLocalRsvp(String value) {
        this.fallbackToLocalRsvp = value;
    }

    /**
     * Gets the value of the sipRe11XxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipRe11XxEnabled() {
        return sipRe11XxEnabled;
    }

    /**
     * Sets the value of the sipRe11XxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipRe11XxEnabled(String value) {
        this.sipRe11XxEnabled = value;
    }

    /**
     * Gets the value of the gClear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGClear() {
        return gClear;
    }

    /**
     * Sets the value of the gClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGClear(String value) {
        this.gClear = value;
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
