
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRoutePatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRoutePatternReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *             &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *             &lt;element name="routeFilterName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="newPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newRoutePartitionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="blockEnable" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="calledPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callingPartyTransformationMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useCallingPartyPhoneMask" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="callingPartyPrefixDigits" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="newDialPlanName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="digitDiscardInstructionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/8.5}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="patternUrgency" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="prefixDigitsOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newRouteFilterName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/8.5}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="callingNamePresentationBit" type="{http://www.cisco.com/AXL/API/8.5}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="connectedLinePresentationBit" type="{http://www.cisco.com/AXL/API/8.5}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="connectedNamePresentationBit" type="{http://www.cisco.com/AXL/API/8.5}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="supportOverlapSending" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/8.5}XPatternPrecedence" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/8.5}XReleaseCauseValue" minOccurs="0"/>
 *         &lt;element name="allowDeviceOverride" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="provideOutsideDialtone" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/8.5}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberType" type="{http://www.cisco.com/AXL/API/8.5}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/8.5}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberType" type="{http://www.cisco.com/AXL/API/8.5}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="destination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="gatewayName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                   &lt;element name="routeListName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="authorizationCodeRequired" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="authorizationLevelRequired" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="clientCodeRequired" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="isdnNsfInfoElement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="cic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="networkServiceProtocol" type="{http://www.cisco.com/AXL/API/8.5}XPriProtocol"/>
 *                   &lt;element name="networkService" type="{http://www.cisco.com/AXL/API/8.5}XNSFService" minOccurs="0"/>
 *                   &lt;element name="paramValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resourcePriorityNamespaceName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="routeClass" type="{http://www.cisco.com/AXL/API/8.5}XPatternRouteClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRoutePatternReq", propOrder = {
    "uuid",
    "pattern",
    "routePartitionName",
    "dialPlanName",
    "routeFilterName",
    "newPattern",
    "description",
    "newRoutePartitionName",
    "blockEnable",
    "calledPartyTransformationMask",
    "callingPartyTransformationMask",
    "useCallingPartyPhoneMask",
    "callingPartyPrefixDigits",
    "newDialPlanName",
    "digitDiscardInstructionName",
    "networkLocation",
    "patternUrgency",
    "prefixDigitsOut",
    "newRouteFilterName",
    "callingLinePresentationBit",
    "callingNamePresentationBit",
    "connectedLinePresentationBit",
    "connectedNamePresentationBit",
    "supportOverlapSending",
    "patternPrecedence",
    "releaseClause",
    "allowDeviceOverride",
    "provideOutsideDialtone",
    "callingPartyNumberingPlan",
    "callingPartyNumberType",
    "calledPartyNumberingPlan",
    "calledPartyNumberType",
    "destination",
    "authorizationCodeRequired",
    "authorizationLevelRequired",
    "clientCodeRequired",
    "isdnNsfInfoElement",
    "resourcePriorityNamespaceName",
    "routeClass"
})
public class UpdateRoutePatternReq
    extends APIRequest
{

    protected String uuid;
    protected String pattern;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    @XmlElementRef(name = "dialPlanName", type = JAXBElement.class)
    protected JAXBElement<XFkType> dialPlanName;
    @XmlElementRef(name = "routeFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routeFilterName;
    protected String newPattern;
    protected String description;
    @XmlElementRef(name = "newRoutePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newRoutePartitionName;
    protected String blockEnable;
    @XmlElementRef(name = "calledPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyTransformationMask;
    @XmlElementRef(name = "callingPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyTransformationMask;
    @XmlElement(defaultValue = "Default")
    protected String useCallingPartyPhoneMask;
    @XmlElementRef(name = "callingPartyPrefixDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyPrefixDigits;
    @XmlElementRef(name = "newDialPlanName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newDialPlanName;
    @XmlElementRef(name = "digitDiscardInstructionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> digitDiscardInstructionName;
    @XmlElement(defaultValue = "OnNet")
    protected String networkLocation;
    protected String patternUrgency;
    @XmlElementRef(name = "prefixDigitsOut", type = JAXBElement.class)
    protected JAXBElement<String> prefixDigitsOut;
    @XmlElementRef(name = "newRouteFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newRouteFilterName;
    @XmlElement(defaultValue = "Default")
    protected String callingLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String callingNamePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedNamePresentationBit;
    protected String supportOverlapSending;
    @XmlElement(defaultValue = "Default")
    protected String patternPrecedence;
    @XmlElement(defaultValue = "No Error")
    protected String releaseClause;
    @XmlElement(defaultValue = "true")
    protected String allowDeviceOverride;
    @XmlElement(defaultValue = "true")
    protected String provideOutsideDialtone;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPartyNumberingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPartyNumberType;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPartyNumberingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPartyNumberType;
    protected UpdateRoutePatternReq.Destination destination;
    protected String authorizationCodeRequired;
    @XmlElement(defaultValue = "0")
    protected String authorizationLevelRequired;
    protected String clientCodeRequired;
    protected UpdateRoutePatternReq.IsdnNsfInfoElement isdnNsfInfoElement;
    @XmlElementRef(name = "resourcePriorityNamespaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> resourcePriorityNamespaceName;
    @XmlElement(defaultValue = "Default")
    protected String routeClass;

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
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartitionName(JAXBElement<XFkType> value) {
        this.routePartitionName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the dialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDialPlanName() {
        return dialPlanName;
    }

    /**
     * Sets the value of the dialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDialPlanName(JAXBElement<XFkType> value) {
        this.dialPlanName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the routeFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRouteFilterName() {
        return routeFilterName;
    }

    /**
     * Sets the value of the routeFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRouteFilterName(JAXBElement<XFkType> value) {
        this.routeFilterName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the newPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPattern() {
        return newPattern;
    }

    /**
     * Sets the value of the newPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPattern(String value) {
        this.newPattern = value;
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
     * Gets the value of the newRoutePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNewRoutePartitionName() {
        return newRoutePartitionName;
    }

    /**
     * Sets the value of the newRoutePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNewRoutePartitionName(JAXBElement<XFkType> value) {
        this.newRoutePartitionName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyTransformationMask() {
        return calledPartyTransformationMask;
    }

    /**
     * Sets the value of the calledPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyTransformationMask(JAXBElement<String> value) {
        this.calledPartyTransformationMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingPartyTransformationMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyTransformationMask() {
        return callingPartyTransformationMask;
    }

    /**
     * Sets the value of the callingPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyTransformationMask(JAXBElement<String> value) {
        this.callingPartyTransformationMask = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyPrefixDigits() {
        return callingPartyPrefixDigits;
    }

    /**
     * Sets the value of the callingPartyPrefixDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyPrefixDigits(JAXBElement<String> value) {
        this.callingPartyPrefixDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the newDialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNewDialPlanName() {
        return newDialPlanName;
    }

    /**
     * Sets the value of the newDialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNewDialPlanName(JAXBElement<XFkType> value) {
        this.newDialPlanName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the digitDiscardInstructionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDigitDiscardInstructionName() {
        return digitDiscardInstructionName;
    }

    /**
     * Sets the value of the digitDiscardInstructionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDigitDiscardInstructionName(JAXBElement<XFkType> value) {
        this.digitDiscardInstructionName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the networkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLocation() {
        return networkLocation;
    }

    /**
     * Sets the value of the networkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLocation(String value) {
        this.networkLocation = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefixDigitsOut() {
        return prefixDigitsOut;
    }

    /**
     * Sets the value of the prefixDigitsOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefixDigitsOut(JAXBElement<String> value) {
        this.prefixDigitsOut = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the newRouteFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNewRouteFilterName() {
        return newRouteFilterName;
    }

    /**
     * Sets the value of the newRouteFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNewRouteFilterName(JAXBElement<XFkType> value) {
        this.newRouteFilterName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the supportOverlapSending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportOverlapSending() {
        return supportOverlapSending;
    }

    /**
     * Sets the value of the supportOverlapSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportOverlapSending(String value) {
        this.supportOverlapSending = value;
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
     * Gets the value of the allowDeviceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowDeviceOverride() {
        return allowDeviceOverride;
    }

    /**
     * Sets the value of the allowDeviceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowDeviceOverride(String value) {
        this.allowDeviceOverride = value;
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
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRoutePatternReq.Destination }
     *     
     */
    public UpdateRoutePatternReq.Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRoutePatternReq.Destination }
     *     
     */
    public void setDestination(UpdateRoutePatternReq.Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the authorizationCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCodeRequired() {
        return authorizationCodeRequired;
    }

    /**
     * Sets the value of the authorizationCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCodeRequired(String value) {
        this.authorizationCodeRequired = value;
    }

    /**
     * Gets the value of the authorizationLevelRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationLevelRequired() {
        return authorizationLevelRequired;
    }

    /**
     * Sets the value of the authorizationLevelRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationLevelRequired(String value) {
        this.authorizationLevelRequired = value;
    }

    /**
     * Gets the value of the clientCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCodeRequired() {
        return clientCodeRequired;
    }

    /**
     * Sets the value of the clientCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCodeRequired(String value) {
        this.clientCodeRequired = value;
    }

    /**
     * Gets the value of the isdnNsfInfoElement property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRoutePatternReq.IsdnNsfInfoElement }
     *     
     */
    public UpdateRoutePatternReq.IsdnNsfInfoElement getIsdnNsfInfoElement() {
        return isdnNsfInfoElement;
    }

    /**
     * Sets the value of the isdnNsfInfoElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRoutePatternReq.IsdnNsfInfoElement }
     *     
     */
    public void setIsdnNsfInfoElement(UpdateRoutePatternReq.IsdnNsfInfoElement value) {
        this.isdnNsfInfoElement = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getResourcePriorityNamespaceName() {
        return resourcePriorityNamespaceName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setResourcePriorityNamespaceName(JAXBElement<XFkType> value) {
        this.resourcePriorityNamespaceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the routeClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteClass() {
        return routeClass;
    }

    /**
     * Sets the value of the routeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteClass(String value) {
        this.routeClass = value;
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
     *       &lt;choice>
     *         &lt;element name="gatewayName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *         &lt;element name="routeListName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gatewayName",
        "routeListName"
    })
    public static class Destination {

        protected XFkType gatewayName;
        protected XFkType routeListName;

        /**
         * Gets the value of the gatewayName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getGatewayName() {
            return gatewayName;
        }

        /**
         * Sets the value of the gatewayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setGatewayName(XFkType value) {
            this.gatewayName = value;
        }

        /**
         * Gets the value of the routeListName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getRouteListName() {
            return routeListName;
        }

        /**
         * Sets the value of the routeListName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setRouteListName(XFkType value) {
            this.routeListName = value;
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
     *         &lt;element name="cic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="networkServiceProtocol" type="{http://www.cisco.com/AXL/API/8.5}XPriProtocol"/>
     *         &lt;element name="networkService" type="{http://www.cisco.com/AXL/API/8.5}XNSFService" minOccurs="0"/>
     *         &lt;element name="paramValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cic",
        "networkServiceProtocol",
        "networkService",
        "paramValue"
    })
    public static class IsdnNsfInfoElement {

        protected String cic;
        protected String networkServiceProtocol;
        protected String networkService;
        protected String paramValue;

        /**
         * Gets the value of the cic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCic() {
            return cic;
        }

        /**
         * Sets the value of the cic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCic(String value) {
            this.cic = value;
        }

        /**
         * Gets the value of the networkServiceProtocol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkServiceProtocol() {
            return networkServiceProtocol;
        }

        /**
         * Sets the value of the networkServiceProtocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkServiceProtocol(String value) {
            this.networkServiceProtocol = value;
        }

        /**
         * Gets the value of the networkService property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkService() {
            return networkService;
        }

        /**
         * Sets the value of the networkService property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkService(String value) {
            this.networkService = value;
        }

        /**
         * Gets the value of the paramValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParamValue() {
            return paramValue;
        }

        /**
         * Sets the value of the paramValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParamValue(String value) {
            this.paramValue = value;
        }

    }

}
