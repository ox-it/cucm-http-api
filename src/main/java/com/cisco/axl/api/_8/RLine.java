
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/8.5}XPatternUsage" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarDestinationMask" type="{http://www.cisco.com/AXL/API/8.5}String128" minOccurs="0"/>
 *         &lt;element name="aarKeepCallHistory" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="aarVoiceMailEnabled" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="callForwardAll" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardAll" minOccurs="0"/>
 *         &lt;element name="callForwardBusy" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardBusy" minOccurs="0"/>
 *         &lt;element name="callForwardBusyInt" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardBusyInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswer" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardNoAnswer" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswerInt" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardNoAnswerInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverage" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardNoCoverage" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverageInt" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardNoCoverageInt" minOccurs="0"/>
 *         &lt;element name="callForwardOnFailure" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardOnFailure" minOccurs="0"/>
 *         &lt;element name="callForwardAlternateParty" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardAlternateParty" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegistered" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardNotRegistered" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegisteredInt" type="{http://www.cisco.com/AXL/API/8.5}RCallForwardNotRegisteredInt" minOccurs="0"/>
 *         &lt;element name="callPickupGroupName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="autoAnswer" type="{http://www.cisco.com/AXL/API/8.5}XAutoAnswer" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="alertingName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="asciiAlertingName" type="{http://www.cisco.com/AXL/API/8.5}String32" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="shareLineAppearanceCssName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="voiceMailProfileName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/8.5}XPatternPrecedence" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/8.5}XReleaseCauseValue" minOccurs="0"/>
 *         &lt;element name="hrDuration" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="hrInterval" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="cfaCssPolicy" type="{http://www.cisco.com/AXL/API/8.5}XCFACSSActivationPolicy" minOccurs="0"/>
 *         &lt;element name="defaultActivatedDeviceName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveDn" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntDn" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveVmEnabled" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntVmEnabled" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveCssName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntCssName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonReversionTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="partyEntranceTone" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RLine", propOrder = {
    "pattern",
    "description",
    "usage",
    "routePartitionName",
    "aarNeighborhoodName",
    "aarDestinationMask",
    "aarKeepCallHistory",
    "aarVoiceMailEnabled",
    "callForwardAll",
    "callForwardBusy",
    "callForwardBusyInt",
    "callForwardNoAnswer",
    "callForwardNoAnswerInt",
    "callForwardNoCoverage",
    "callForwardNoCoverageInt",
    "callForwardOnFailure",
    "callForwardAlternateParty",
    "callForwardNotRegistered",
    "callForwardNotRegisteredInt",
    "callPickupGroupName",
    "autoAnswer",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "alertingName",
    "asciiAlertingName",
    "presenceGroupName",
    "shareLineAppearanceCssName",
    "voiceMailProfileName",
    "patternPrecedence",
    "releaseClause",
    "hrDuration",
    "hrInterval",
    "cfaCssPolicy",
    "defaultActivatedDeviceName",
    "parkMonForwardNoRetrieveDn",
    "parkMonForwardNoRetrieveIntDn",
    "parkMonForwardNoRetrieveVmEnabled",
    "parkMonForwardNoRetrieveIntVmEnabled",
    "parkMonForwardNoRetrieveCssName",
    "parkMonForwardNoRetrieveIntCssName",
    "parkMonReversionTimer",
    "partyEntranceTone"
})
public class RLine {

    protected String pattern;
    protected String description;
    protected String usage;
    protected XFkType routePartitionName;
    protected XFkType aarNeighborhoodName;
    protected String aarDestinationMask;
    protected String aarKeepCallHistory;
    protected String aarVoiceMailEnabled;
    protected RCallForwardAll callForwardAll;
    protected RCallForwardBusy callForwardBusy;
    protected RCallForwardBusyInt callForwardBusyInt;
    protected RCallForwardNoAnswer callForwardNoAnswer;
    protected RCallForwardNoAnswerInt callForwardNoAnswerInt;
    protected RCallForwardNoCoverage callForwardNoCoverage;
    protected RCallForwardNoCoverageInt callForwardNoCoverageInt;
    protected RCallForwardOnFailure callForwardOnFailure;
    protected RCallForwardAlternateParty callForwardAlternateParty;
    protected RCallForwardNotRegistered callForwardNotRegistered;
    protected RCallForwardNotRegisteredInt callForwardNotRegisteredInt;
    protected XFkType callPickupGroupName;
    protected String autoAnswer;
    protected String networkHoldMohAudioSourceId;
    protected String userHoldMohAudioSourceId;
    protected String alertingName;
    protected String asciiAlertingName;
    protected XFkType presenceGroupName;
    protected XFkType shareLineAppearanceCssName;
    protected XFkType voiceMailProfileName;
    protected String patternPrecedence;
    protected String releaseClause;
    protected String hrDuration;
    protected String hrInterval;
    protected String cfaCssPolicy;
    protected XFkType defaultActivatedDeviceName;
    protected String parkMonForwardNoRetrieveDn;
    protected String parkMonForwardNoRetrieveIntDn;
    protected String parkMonForwardNoRetrieveVmEnabled;
    protected String parkMonForwardNoRetrieveIntVmEnabled;
    protected XFkType parkMonForwardNoRetrieveCssName;
    protected XFkType parkMonForwardNoRetrieveIntCssName;
    protected String parkMonReversionTimer;
    protected String partyEntranceTone;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRoutePartitionName(XFkType value) {
        this.routePartitionName = value;
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarNeighborhoodName(XFkType value) {
        this.aarNeighborhoodName = value;
    }

    /**
     * Gets the value of the aarDestinationMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarDestinationMask() {
        return aarDestinationMask;
    }

    /**
     * Sets the value of the aarDestinationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarDestinationMask(String value) {
        this.aarDestinationMask = value;
    }

    /**
     * Gets the value of the aarKeepCallHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarKeepCallHistory() {
        return aarKeepCallHistory;
    }

    /**
     * Sets the value of the aarKeepCallHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarKeepCallHistory(String value) {
        this.aarKeepCallHistory = value;
    }

    /**
     * Gets the value of the aarVoiceMailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarVoiceMailEnabled() {
        return aarVoiceMailEnabled;
    }

    /**
     * Sets the value of the aarVoiceMailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarVoiceMailEnabled(String value) {
        this.aarVoiceMailEnabled = value;
    }

    /**
     * Gets the value of the callForwardAll property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardAll }
     *     
     */
    public RCallForwardAll getCallForwardAll() {
        return callForwardAll;
    }

    /**
     * Sets the value of the callForwardAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardAll }
     *     
     */
    public void setCallForwardAll(RCallForwardAll value) {
        this.callForwardAll = value;
    }

    /**
     * Gets the value of the callForwardBusy property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardBusy }
     *     
     */
    public RCallForwardBusy getCallForwardBusy() {
        return callForwardBusy;
    }

    /**
     * Sets the value of the callForwardBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardBusy }
     *     
     */
    public void setCallForwardBusy(RCallForwardBusy value) {
        this.callForwardBusy = value;
    }

    /**
     * Gets the value of the callForwardBusyInt property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardBusyInt }
     *     
     */
    public RCallForwardBusyInt getCallForwardBusyInt() {
        return callForwardBusyInt;
    }

    /**
     * Sets the value of the callForwardBusyInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardBusyInt }
     *     
     */
    public void setCallForwardBusyInt(RCallForwardBusyInt value) {
        this.callForwardBusyInt = value;
    }

    /**
     * Gets the value of the callForwardNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardNoAnswer }
     *     
     */
    public RCallForwardNoAnswer getCallForwardNoAnswer() {
        return callForwardNoAnswer;
    }

    /**
     * Sets the value of the callForwardNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardNoAnswer }
     *     
     */
    public void setCallForwardNoAnswer(RCallForwardNoAnswer value) {
        this.callForwardNoAnswer = value;
    }

    /**
     * Gets the value of the callForwardNoAnswerInt property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardNoAnswerInt }
     *     
     */
    public RCallForwardNoAnswerInt getCallForwardNoAnswerInt() {
        return callForwardNoAnswerInt;
    }

    /**
     * Sets the value of the callForwardNoAnswerInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardNoAnswerInt }
     *     
     */
    public void setCallForwardNoAnswerInt(RCallForwardNoAnswerInt value) {
        this.callForwardNoAnswerInt = value;
    }

    /**
     * Gets the value of the callForwardNoCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardNoCoverage }
     *     
     */
    public RCallForwardNoCoverage getCallForwardNoCoverage() {
        return callForwardNoCoverage;
    }

    /**
     * Sets the value of the callForwardNoCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardNoCoverage }
     *     
     */
    public void setCallForwardNoCoverage(RCallForwardNoCoverage value) {
        this.callForwardNoCoverage = value;
    }

    /**
     * Gets the value of the callForwardNoCoverageInt property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardNoCoverageInt }
     *     
     */
    public RCallForwardNoCoverageInt getCallForwardNoCoverageInt() {
        return callForwardNoCoverageInt;
    }

    /**
     * Sets the value of the callForwardNoCoverageInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardNoCoverageInt }
     *     
     */
    public void setCallForwardNoCoverageInt(RCallForwardNoCoverageInt value) {
        this.callForwardNoCoverageInt = value;
    }

    /**
     * Gets the value of the callForwardOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardOnFailure }
     *     
     */
    public RCallForwardOnFailure getCallForwardOnFailure() {
        return callForwardOnFailure;
    }

    /**
     * Sets the value of the callForwardOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardOnFailure }
     *     
     */
    public void setCallForwardOnFailure(RCallForwardOnFailure value) {
        this.callForwardOnFailure = value;
    }

    /**
     * Gets the value of the callForwardAlternateParty property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardAlternateParty }
     *     
     */
    public RCallForwardAlternateParty getCallForwardAlternateParty() {
        return callForwardAlternateParty;
    }

    /**
     * Sets the value of the callForwardAlternateParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardAlternateParty }
     *     
     */
    public void setCallForwardAlternateParty(RCallForwardAlternateParty value) {
        this.callForwardAlternateParty = value;
    }

    /**
     * Gets the value of the callForwardNotRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardNotRegistered }
     *     
     */
    public RCallForwardNotRegistered getCallForwardNotRegistered() {
        return callForwardNotRegistered;
    }

    /**
     * Sets the value of the callForwardNotRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardNotRegistered }
     *     
     */
    public void setCallForwardNotRegistered(RCallForwardNotRegistered value) {
        this.callForwardNotRegistered = value;
    }

    /**
     * Gets the value of the callForwardNotRegisteredInt property.
     * 
     * @return
     *     possible object is
     *     {@link RCallForwardNotRegisteredInt }
     *     
     */
    public RCallForwardNotRegisteredInt getCallForwardNotRegisteredInt() {
        return callForwardNotRegisteredInt;
    }

    /**
     * Sets the value of the callForwardNotRegisteredInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallForwardNotRegisteredInt }
     *     
     */
    public void setCallForwardNotRegisteredInt(RCallForwardNotRegisteredInt value) {
        this.callForwardNotRegisteredInt = value;
    }

    /**
     * Gets the value of the callPickupGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallPickupGroupName() {
        return callPickupGroupName;
    }

    /**
     * Sets the value of the callPickupGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallPickupGroupName(XFkType value) {
        this.callPickupGroupName = value;
    }

    /**
     * Gets the value of the autoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets the value of the autoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAnswer(String value) {
        this.autoAnswer = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkHoldMohAudioSourceId(String value) {
        this.networkHoldMohAudioSourceId = value;
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
     * Gets the value of the alertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingName() {
        return alertingName;
    }

    /**
     * Sets the value of the alertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingName(String value) {
        this.alertingName = value;
    }

    /**
     * Gets the value of the asciiAlertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsciiAlertingName() {
        return asciiAlertingName;
    }

    /**
     * Sets the value of the asciiAlertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsciiAlertingName(String value) {
        this.asciiAlertingName = value;
    }

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPresenceGroupName(XFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the shareLineAppearanceCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getShareLineAppearanceCssName() {
        return shareLineAppearanceCssName;
    }

    /**
     * Sets the value of the shareLineAppearanceCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setShareLineAppearanceCssName(XFkType value) {
        this.shareLineAppearanceCssName = value;
    }

    /**
     * Gets the value of the voiceMailProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getVoiceMailProfileName() {
        return voiceMailProfileName;
    }

    /**
     * Sets the value of the voiceMailProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setVoiceMailProfileName(XFkType value) {
        this.voiceMailProfileName = value;
    }

    /**
     * Gets the value of the patternPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternPrecedence() {
        return patternPrecedence;
    }

    /**
     * Sets the value of the patternPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternPrecedence(String value) {
        this.patternPrecedence = value;
    }

    /**
     * Gets the value of the releaseClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseClause() {
        return releaseClause;
    }

    /**
     * Sets the value of the releaseClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseClause(String value) {
        this.releaseClause = value;
    }

    /**
     * Gets the value of the hrDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrDuration() {
        return hrDuration;
    }

    /**
     * Sets the value of the hrDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrDuration(String value) {
        this.hrDuration = value;
    }

    /**
     * Gets the value of the hrInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrInterval() {
        return hrInterval;
    }

    /**
     * Sets the value of the hrInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrInterval(String value) {
        this.hrInterval = value;
    }

    /**
     * Gets the value of the cfaCssPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfaCssPolicy() {
        return cfaCssPolicy;
    }

    /**
     * Sets the value of the cfaCssPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfaCssPolicy(String value) {
        this.cfaCssPolicy = value;
    }

    /**
     * Gets the value of the defaultActivatedDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDefaultActivatedDeviceName() {
        return defaultActivatedDeviceName;
    }

    /**
     * Sets the value of the defaultActivatedDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDefaultActivatedDeviceName(XFkType value) {
        this.defaultActivatedDeviceName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveDn() {
        return parkMonForwardNoRetrieveDn;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveDn(String value) {
        this.parkMonForwardNoRetrieveDn = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveIntDn() {
        return parkMonForwardNoRetrieveIntDn;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveIntDn(String value) {
        this.parkMonForwardNoRetrieveIntDn = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveVmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveVmEnabled() {
        return parkMonForwardNoRetrieveVmEnabled;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveVmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveVmEnabled(String value) {
        this.parkMonForwardNoRetrieveVmEnabled = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntVmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveIntVmEnabled() {
        return parkMonForwardNoRetrieveIntVmEnabled;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntVmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveIntVmEnabled(String value) {
        this.parkMonForwardNoRetrieveIntVmEnabled = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getParkMonForwardNoRetrieveCssName() {
        return parkMonForwardNoRetrieveCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveCssName(XFkType value) {
        this.parkMonForwardNoRetrieveCssName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getParkMonForwardNoRetrieveIntCssName() {
        return parkMonForwardNoRetrieveIntCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveIntCssName(XFkType value) {
        this.parkMonForwardNoRetrieveIntCssName = value;
    }

    /**
     * Gets the value of the parkMonReversionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonReversionTimer() {
        return parkMonReversionTimer;
    }

    /**
     * Sets the value of the parkMonReversionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonReversionTimer(String value) {
        this.parkMonReversionTimer = value;
    }

    /**
     * Gets the value of the partyEntranceTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyEntranceTone() {
        return partyEntranceTone;
    }

    /**
     * Sets the value of the partyEntranceTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyEntranceTone(String value) {
        this.partyEntranceTone = value;
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
