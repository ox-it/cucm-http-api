
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RHuntPilot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RHuntPilot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/8.0}XPatternUsage" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="blockEnable" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="calledPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callingPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useCallingPartyPhoneMask" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="callingPartyPrefixDigits" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="digitDiscardInstructionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="patternUrgency" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="prefixDigitsOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="callingNamePresentationBit" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="connectedLinePresentationBit" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="connectedNamePresentationBit" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/8.0}XPatternPrecedence" minOccurs="0"/>
 *         &lt;element name="provideOutsideDialtone" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberType" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberType" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="huntListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieve" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="destination" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *                   &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alertingName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="asciiAlertingName" type="{http://www.cisco.com/AXL/API/8.0}String32" minOccurs="0"/>
 *         &lt;element name="e164Mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="forwardHuntNoAnswer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forwardHuntBusy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="callPickupGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="maxHuntduration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/8.0}XReleaseCauseValue" minOccurs="0"/>
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
@XmlType(name = "RHuntPilot", propOrder = {
    "pattern",
    "description",
    "usage",
    "routePartitionName",
    "blockEnable",
    "calledPartyTransformationMask",
    "callingPartyTransformationMask",
    "useCallingPartyPhoneMask",
    "callingPartyPrefixDigits",
    "dialPlanName",
    "digitDiscardInstructionName",
    "patternUrgency",
    "prefixDigitsOut",
    "routeFilterName",
    "callingLinePresentationBit",
    "callingNamePresentationBit",
    "connectedLinePresentationBit",
    "connectedNamePresentationBit",
    "patternPrecedence",
    "provideOutsideDialtone",
    "callingPartyNumberingPlan",
    "callingPartyNumberType",
    "calledPartyNumberingPlan",
    "calledPartyNumberType",
    "huntListName",
    "parkMonForwardNoRetrieve",
    "alertingName",
    "asciiAlertingName",
    "e164Mask",
    "aarNeighborhoodName",
    "forwardHuntNoAnswer",
    "forwardHuntBusy",
    "callPickupGroupName",
    "maxHuntduration",
    "releaseClause"
})
public class RHuntPilot {

    protected String pattern;
    protected String description;
    protected String usage;
    protected XFkType routePartitionName;
    protected String blockEnable;
    protected String calledPartyTransformationMask;
    protected String callingPartyTransformationMask;
    protected String useCallingPartyPhoneMask;
    protected String callingPartyPrefixDigits;
    protected XFkType dialPlanName;
    protected XFkType digitDiscardInstructionName;
    protected String patternUrgency;
    protected String prefixDigitsOut;
    protected XFkType routeFilterName;
    protected String callingLinePresentationBit;
    protected String callingNamePresentationBit;
    protected String connectedLinePresentationBit;
    protected String connectedNamePresentationBit;
    protected String patternPrecedence;
    protected String provideOutsideDialtone;
    protected String callingPartyNumberingPlan;
    protected String callingPartyNumberType;
    protected String calledPartyNumberingPlan;
    protected String calledPartyNumberType;
    protected XFkType huntListName;
    protected RHuntPilot.ParkMonForwardNoRetrieve parkMonForwardNoRetrieve;
    protected String alertingName;
    protected String asciiAlertingName;
    protected String e164Mask;
    protected XFkType aarNeighborhoodName;
    protected RHuntPilot.ForwardHuntNoAnswer forwardHuntNoAnswer;
    protected RHuntPilot.ForwardHuntBusy forwardHuntBusy;
    protected XFkType callPickupGroupName;
    protected String maxHuntduration;
    protected String releaseClause;
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
     * Gets the value of the blockEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockEnable() {
        return blockEnable;
    }

    /**
     * Sets the value of the blockEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockEnable(String value) {
        this.blockEnable = value;
    }

    /**
     * Gets the value of the calledPartyTransformationMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyTransformationMask() {
        return calledPartyTransformationMask;
    }

    /**
     * Sets the value of the calledPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyTransformationMask(String value) {
        this.calledPartyTransformationMask = value;
    }

    /**
     * Gets the value of the callingPartyTransformationMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyTransformationMask() {
        return callingPartyTransformationMask;
    }

    /**
     * Sets the value of the callingPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyTransformationMask(String value) {
        this.callingPartyTransformationMask = value;
    }

    /**
     * Gets the value of the useCallingPartyPhoneMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCallingPartyPhoneMask() {
        return useCallingPartyPhoneMask;
    }

    /**
     * Sets the value of the useCallingPartyPhoneMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCallingPartyPhoneMask(String value) {
        this.useCallingPartyPhoneMask = value;
    }

    /**
     * Gets the value of the callingPartyPrefixDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyPrefixDigits() {
        return callingPartyPrefixDigits;
    }

    /**
     * Sets the value of the callingPartyPrefixDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyPrefixDigits(String value) {
        this.callingPartyPrefixDigits = value;
    }

    /**
     * Gets the value of the dialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDialPlanName() {
        return dialPlanName;
    }

    /**
     * Sets the value of the dialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDialPlanName(XFkType value) {
        this.dialPlanName = value;
    }

    /**
     * Gets the value of the digitDiscardInstructionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDigitDiscardInstructionName() {
        return digitDiscardInstructionName;
    }

    /**
     * Sets the value of the digitDiscardInstructionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDigitDiscardInstructionName(XFkType value) {
        this.digitDiscardInstructionName = value;
    }

    /**
     * Gets the value of the patternUrgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternUrgency() {
        return patternUrgency;
    }

    /**
     * Sets the value of the patternUrgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternUrgency(String value) {
        this.patternUrgency = value;
    }

    /**
     * Gets the value of the prefixDigitsOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixDigitsOut() {
        return prefixDigitsOut;
    }

    /**
     * Sets the value of the prefixDigitsOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixDigitsOut(String value) {
        this.prefixDigitsOut = value;
    }

    /**
     * Gets the value of the routeFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRouteFilterName() {
        return routeFilterName;
    }

    /**
     * Sets the value of the routeFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRouteFilterName(XFkType value) {
        this.routeFilterName = value;
    }

    /**
     * Gets the value of the callingLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLinePresentationBit() {
        return callingLinePresentationBit;
    }

    /**
     * Sets the value of the callingLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLinePresentationBit(String value) {
        this.callingLinePresentationBit = value;
    }

    /**
     * Gets the value of the callingNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNamePresentationBit() {
        return callingNamePresentationBit;
    }

    /**
     * Sets the value of the callingNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNamePresentationBit(String value) {
        this.callingNamePresentationBit = value;
    }

    /**
     * Gets the value of the connectedLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedLinePresentationBit() {
        return connectedLinePresentationBit;
    }

    /**
     * Sets the value of the connectedLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedLinePresentationBit(String value) {
        this.connectedLinePresentationBit = value;
    }

    /**
     * Gets the value of the connectedNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedNamePresentationBit() {
        return connectedNamePresentationBit;
    }

    /**
     * Sets the value of the connectedNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedNamePresentationBit(String value) {
        this.connectedNamePresentationBit = value;
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
     * Gets the value of the provideOutsideDialtone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideOutsideDialtone() {
        return provideOutsideDialtone;
    }

    /**
     * Sets the value of the provideOutsideDialtone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideOutsideDialtone(String value) {
        this.provideOutsideDialtone = value;
    }

    /**
     * Gets the value of the callingPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNumberingPlan() {
        return callingPartyNumberingPlan;
    }

    /**
     * Sets the value of the callingPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNumberingPlan(String value) {
        this.callingPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the callingPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNumberType() {
        return callingPartyNumberType;
    }

    /**
     * Sets the value of the callingPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNumberType(String value) {
        this.callingPartyNumberType = value;
    }

    /**
     * Gets the value of the calledPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNumberingPlan() {
        return calledPartyNumberingPlan;
    }

    /**
     * Sets the value of the calledPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNumberingPlan(String value) {
        this.calledPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the calledPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNumberType() {
        return calledPartyNumberType;
    }

    /**
     * Sets the value of the calledPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNumberType(String value) {
        this.calledPartyNumberType = value;
    }

    /**
     * Gets the value of the huntListName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHuntListName() {
        return huntListName;
    }

    /**
     * Sets the value of the huntListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHuntListName(XFkType value) {
        this.huntListName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link RHuntPilot.ParkMonForwardNoRetrieve }
     *     
     */
    public RHuntPilot.ParkMonForwardNoRetrieve getParkMonForwardNoRetrieve() {
        return parkMonForwardNoRetrieve;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link RHuntPilot.ParkMonForwardNoRetrieve }
     *     
     */
    public void setParkMonForwardNoRetrieve(RHuntPilot.ParkMonForwardNoRetrieve value) {
        this.parkMonForwardNoRetrieve = value;
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
     * Gets the value of the e164Mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE164Mask() {
        return e164Mask;
    }

    /**
     * Sets the value of the e164Mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE164Mask(String value) {
        this.e164Mask = value;
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
     * Gets the value of the forwardHuntNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link RHuntPilot.ForwardHuntNoAnswer }
     *     
     */
    public RHuntPilot.ForwardHuntNoAnswer getForwardHuntNoAnswer() {
        return forwardHuntNoAnswer;
    }

    /**
     * Sets the value of the forwardHuntNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RHuntPilot.ForwardHuntNoAnswer }
     *     
     */
    public void setForwardHuntNoAnswer(RHuntPilot.ForwardHuntNoAnswer value) {
        this.forwardHuntNoAnswer = value;
    }

    /**
     * Gets the value of the forwardHuntBusy property.
     * 
     * @return
     *     possible object is
     *     {@link RHuntPilot.ForwardHuntBusy }
     *     
     */
    public RHuntPilot.ForwardHuntBusy getForwardHuntBusy() {
        return forwardHuntBusy;
    }

    /**
     * Sets the value of the forwardHuntBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RHuntPilot.ForwardHuntBusy }
     *     
     */
    public void setForwardHuntBusy(RHuntPilot.ForwardHuntBusy value) {
        this.forwardHuntBusy = value;
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
     * Gets the value of the maxHuntduration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxHuntduration() {
        return maxHuntduration;
    }

    /**
     * Sets the value of the maxHuntduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxHuntduration(String value) {
        this.maxHuntduration = value;
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
     *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
        "usePersonalPreferences",
        "destination",
        "callingSearchSpaceName"
    })
    public static class ForwardHuntBusy {

        protected String usePersonalPreferences;
        protected String destination;
        protected XFkType callingSearchSpaceName;

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
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the callingSearchSpaceName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getCallingSearchSpaceName() {
            return callingSearchSpaceName;
        }

        /**
         * Sets the value of the callingSearchSpaceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setCallingSearchSpaceName(XFkType value) {
            this.callingSearchSpaceName = value;
        }

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
     *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
        "usePersonalPreferences",
        "destination",
        "callingSearchSpaceName"
    })
    public static class ForwardHuntNoAnswer {

        protected String usePersonalPreferences;
        protected String destination;
        protected XFkType callingSearchSpaceName;

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
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the callingSearchSpaceName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getCallingSearchSpaceName() {
            return callingSearchSpaceName;
        }

        /**
         * Sets the value of the callingSearchSpaceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setCallingSearchSpaceName(XFkType value) {
            this.callingSearchSpaceName = value;
        }

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
     *         &lt;element name="usePersonalPreferences" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="destination" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
     *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
        "usePersonalPreferences",
        "destination",
        "callingSearchSpaceName"
    })
    public static class ParkMonForwardNoRetrieve {

        protected String usePersonalPreferences;
        protected String destination;
        protected XFkType callingSearchSpaceName;

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
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the callingSearchSpaceName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getCallingSearchSpaceName() {
            return callingSearchSpaceName;
        }

        /**
         * Sets the value of the callingSearchSpaceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setCallingSearchSpaceName(XFkType value) {
            this.callingSearchSpaceName = value;
        }

    }

}
