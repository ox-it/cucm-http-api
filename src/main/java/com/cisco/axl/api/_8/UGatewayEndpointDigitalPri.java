
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for UGatewayEndpointDigitalPri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UGatewayEndpointDigitalPri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/8.0}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/8.0}XCountry" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/8.0}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/8.0}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="mlppPreemption" type="{http://www.cisco.com/AXL/API/8.0}XPreemption" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="redirectInboundNumberIe" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="calledPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="calledPri" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="callerIdDn" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="callingPartySelection" type="{http://www.cisco.com/AXL/API/8.0}XCallingPartySelection" minOccurs="0"/>
 *         &lt;element name="callingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="callingPri" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="chanIE" type="{http://www.cisco.com/AXL/API/8.0}XPRIChanIE" minOccurs="0"/>
 *         &lt;element name="clockReference" type="{http://www.cisco.com/AXL/API/8.0}XClockReference" minOccurs="0"/>
 *         &lt;element name="dChannelEnable" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="channelSelectionOrder" type="{http://www.cisco.com/AXL/API/8.0}XTrunkSelectionOrder" minOccurs="0"/>
 *         &lt;element name="displayIe" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="pcmType" type="{http://www.cisco.com/AXL/API/8.0}XEncode" minOccurs="0"/>
 *         &lt;element name="csuParam" type="{http://www.cisco.com/AXL/API/8.0}XCSUParam" minOccurs="0"/>
 *         &lt;element name="firstDelay" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="interfaceIdPresent" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="interfaceId" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="intraDelay" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="mcdnEnable" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="redirectOutboundNumberIe" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="numDigitsToStrip" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="passingPrecedenceLevelThrough" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="connectedLineIdPresentation" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="priProtocol" type="{http://www.cisco.com/AXL/API/8.0}XPriProtocol" minOccurs="0"/>
 *         &lt;element name="securityAccessLevel" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="sendCallingNameInFacilityIe" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="sendExLeadingCharInDispIe" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="sendRestart" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="setupNonIsdnPi" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="sigDigits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *                 &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="span" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="statusPoll" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="smdiBasePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="GClearEnable" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/8.0}XPacketCaptureMode" minOccurs="0"/>
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="transmitUtf8" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="v150" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="asn1RoseOidEncoding" type="{http://www.cisco.com/AXL/API/8.0}XASN1RoseOidEncoding" minOccurs="0"/>
 *         &lt;element name="qsigVariant" type="{http://www.cisco.com/AXL/API/8.0}XQSIGVariant" minOccurs="0"/>
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCdpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="nationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="internationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="unknownPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="subscriberPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="routeClassSignalling" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="nationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="internationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="unknownStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="subscriberStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="nationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="internationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="unknownTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="subscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="imeE164TransformationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssNatl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssIntl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssUnkn" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssSubs" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UGatewayEndpointDigitalPri", propOrder = {
    "index",
    "description",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "networkLocation",
    "locationName",
    "networkLocale",
    "mediaResourceListName",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "loadInformation",
    "vendorConfig",
    "mlppDomainId",
    "mlppIndicationStatus",
    "mlppPreemption",
    "useTrustedRelayPoint",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "redirectInboundNumberIe",
    "calledPlan",
    "calledPri",
    "callerIdDn",
    "callingPartySelection",
    "callingPlan",
    "callingPri",
    "chanIE",
    "clockReference",
    "dChannelEnable",
    "channelSelectionOrder",
    "displayIe",
    "pcmType",
    "csuParam",
    "firstDelay",
    "interfaceIdPresent",
    "interfaceId",
    "intraDelay",
    "mcdnEnable",
    "redirectOutboundNumberIe",
    "numDigitsToStrip",
    "passingPrecedenceLevelThrough",
    "prefix",
    "callingLinePresentationBit",
    "connectedLineIdPresentation",
    "priProtocol",
    "securityAccessLevel",
    "sendCallingNameInFacilityIe",
    "sendExLeadingCharInDispIe",
    "sendRestart",
    "setupNonIsdnPi",
    "sigDigits",
    "span",
    "statusPoll",
    "smdiBasePort",
    "gClearEnable",
    "packetCaptureMode",
    "packetCaptureDuration",
    "transmitUtf8",
    "v150",
    "asn1RoseOidEncoding",
    "qsigVariant",
    "unattendedPort",
    "cdpnTransformationCssName",
    "useDevicePoolCdpnTransformCss",
    "nationalPrefix",
    "internationalPrefix",
    "unknownPrefix",
    "subscriberPrefix",
    "geoLocationFilterName",
    "routeClassSignalling",
    "nationalStripDigits",
    "internationalStripDigits",
    "unknownStripDigits",
    "subscriberStripDigits",
    "nationalTransformationCssName",
    "internationalTransformationCssName",
    "unknownTransformationCssName",
    "subscriberTransformationCssName",
    "pstnAccess",
    "imeE164TransformationName",
    "useDevicePoolCgpnTransformCssNatl",
    "useDevicePoolCgpnTransformCssIntl",
    "useDevicePoolCgpnTransformCssUnkn",
    "useDevicePoolCgpnTransformCssSubs"
})
public class UGatewayEndpointDigitalPri {

    protected String index;
    protected String description;
    protected XFkType callingSearchSpaceName;
    protected XFkType devicePoolName;
    protected XFkType commonDeviceConfigName;
    protected String networkLocation;
    protected XFkType locationName;
    protected String networkLocale;
    protected XFkType mediaResourceListName;
    protected XFkType automatedAlternateRoutingCssName;
    protected XFkType aarNeighborhoodName;
    protected XLoadInformation loadInformation;
    protected XVendorConfig vendorConfig;
    protected Integer mlppDomainId;
    protected String mlppIndicationStatus;
    protected String mlppPreemption;
    protected String useTrustedRelayPoint;
    protected XFkType cgpnTransformationCssName;
    protected String useDevicePoolCgpnTransformCss;
    protected XFkType geoLocationName;
    protected String redirectInboundNumberIe;
    protected String calledPlan;
    protected String calledPri;
    protected String callerIdDn;
    protected String callingPartySelection;
    protected String callingPlan;
    protected String callingPri;
    protected String chanIE;
    protected String clockReference;
    protected String dChannelEnable;
    protected String channelSelectionOrder;
    protected String displayIe;
    protected String pcmType;
    protected String csuParam;
    protected String firstDelay;
    protected String interfaceIdPresent;
    protected String interfaceId;
    protected String intraDelay;
    protected String mcdnEnable;
    protected String redirectOutboundNumberIe;
    protected String numDigitsToStrip;
    protected String passingPrecedenceLevelThrough;
    protected String prefix;
    protected String callingLinePresentationBit;
    protected String connectedLineIdPresentation;
    protected String priProtocol;
    protected String securityAccessLevel;
    protected String sendCallingNameInFacilityIe;
    protected String sendExLeadingCharInDispIe;
    protected String sendRestart;
    protected String setupNonIsdnPi;
    protected UGatewayEndpointDigitalPri.SigDigits sigDigits;
    protected String span;
    protected String statusPoll;
    protected String smdiBasePort;
    @XmlElement(name = "GClearEnable")
    protected String gClearEnable;
    protected String packetCaptureMode;
    protected String packetCaptureDuration;
    protected String transmitUtf8;
    protected String v150;
    protected String asn1RoseOidEncoding;
    protected String qsigVariant;
    protected String unattendedPort;
    protected XFkType cdpnTransformationCssName;
    protected String useDevicePoolCdpnTransformCss;
    protected String nationalPrefix;
    protected String internationalPrefix;
    protected String unknownPrefix;
    protected String subscriberPrefix;
    protected XFkType geoLocationFilterName;
    protected String routeClassSignalling;
    protected String nationalStripDigits;
    protected String internationalStripDigits;
    protected String unknownStripDigits;
    protected String subscriberStripDigits;
    protected XFkType nationalTransformationCssName;
    protected XFkType internationalTransformationCssName;
    protected XFkType unknownTransformationCssName;
    protected XFkType subscriberTransformationCssName;
    protected String pstnAccess;
    protected XFkType imeE164TransformationName;
    protected String useDevicePoolCgpnTransformCssNatl;
    protected String useDevicePoolCgpnTransformCssIntl;
    protected String useDevicePoolCgpnTransformCssUnkn;
    protected String useDevicePoolCgpnTransformCssSubs;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
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

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDevicePoolName(XFkType value) {
        this.devicePoolName = value;
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCommonDeviceConfigName(XFkType value) {
        this.commonDeviceConfigName = value;
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
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocationName(XFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the networkLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkLocale() {
        return networkLocale;
    }

    /**
     * Sets the value of the networkLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkLocale(String value) {
        this.networkLocale = value;
    }

    /**
     * Gets the value of the mediaResourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMediaResourceListName() {
        return mediaResourceListName;
    }

    /**
     * Sets the value of the mediaResourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMediaResourceListName(XFkType value) {
        this.mediaResourceListName = value;
    }

    /**
     * Gets the value of the automatedAlternateRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAutomatedAlternateRoutingCssName() {
        return automatedAlternateRoutingCssName;
    }

    /**
     * Sets the value of the automatedAlternateRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAutomatedAlternateRoutingCssName(XFkType value) {
        this.automatedAlternateRoutingCssName = value;
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
     * Gets the value of the loadInformation property.
     * 
     * @return
     *     possible object is
     *     {@link XLoadInformation }
     *     
     */
    public XLoadInformation getLoadInformation() {
        return loadInformation;
    }

    /**
     * Sets the value of the loadInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLoadInformation }
     *     
     */
    public void setLoadInformation(XLoadInformation value) {
        this.loadInformation = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setVendorConfig(XVendorConfig value) {
        this.vendorConfig = value;
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
     * Gets the value of the mlppPreemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppPreemption() {
        return mlppPreemption;
    }

    /**
     * Sets the value of the mlppPreemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppPreemption(String value) {
        this.mlppPreemption = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrustedRelayPoint(String value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the cgpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCgpnTransformationCssName(XFkType value) {
        this.cgpnTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCss() {
        return useDevicePoolCgpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCss(String value) {
        this.useDevicePoolCgpnTransformCss = value;
    }

    /**
     * Gets the value of the geoLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getGeoLocationName() {
        return geoLocationName;
    }

    /**
     * Sets the value of the geoLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setGeoLocationName(XFkType value) {
        this.geoLocationName = value;
    }

    /**
     * Gets the value of the redirectInboundNumberIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectInboundNumberIe() {
        return redirectInboundNumberIe;
    }

    /**
     * Sets the value of the redirectInboundNumberIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectInboundNumberIe(String value) {
        this.redirectInboundNumberIe = value;
    }

    /**
     * Gets the value of the calledPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPlan() {
        return calledPlan;
    }

    /**
     * Sets the value of the calledPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPlan(String value) {
        this.calledPlan = value;
    }

    /**
     * Gets the value of the calledPri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPri() {
        return calledPri;
    }

    /**
     * Sets the value of the calledPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPri(String value) {
        this.calledPri = value;
    }

    /**
     * Gets the value of the callerIdDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdDn() {
        return callerIdDn;
    }

    /**
     * Sets the value of the callerIdDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdDn(String value) {
        this.callerIdDn = value;
    }

    /**
     * Gets the value of the callingPartySelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartySelection() {
        return callingPartySelection;
    }

    /**
     * Sets the value of the callingPartySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartySelection(String value) {
        this.callingPartySelection = value;
    }

    /**
     * Gets the value of the callingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPlan() {
        return callingPlan;
    }

    /**
     * Sets the value of the callingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPlan(String value) {
        this.callingPlan = value;
    }

    /**
     * Gets the value of the callingPri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPri() {
        return callingPri;
    }

    /**
     * Sets the value of the callingPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPri(String value) {
        this.callingPri = value;
    }

    /**
     * Gets the value of the chanIE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanIE() {
        return chanIE;
    }

    /**
     * Sets the value of the chanIE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanIE(String value) {
        this.chanIE = value;
    }

    /**
     * Gets the value of the clockReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockReference() {
        return clockReference;
    }

    /**
     * Sets the value of the clockReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockReference(String value) {
        this.clockReference = value;
    }

    /**
     * Gets the value of the dChannelEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDChannelEnable() {
        return dChannelEnable;
    }

    /**
     * Sets the value of the dChannelEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDChannelEnable(String value) {
        this.dChannelEnable = value;
    }

    /**
     * Gets the value of the channelSelectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelSelectionOrder() {
        return channelSelectionOrder;
    }

    /**
     * Sets the value of the channelSelectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelSelectionOrder(String value) {
        this.channelSelectionOrder = value;
    }

    /**
     * Gets the value of the displayIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayIe() {
        return displayIe;
    }

    /**
     * Sets the value of the displayIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayIe(String value) {
        this.displayIe = value;
    }

    /**
     * Gets the value of the pcmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcmType() {
        return pcmType;
    }

    /**
     * Sets the value of the pcmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcmType(String value) {
        this.pcmType = value;
    }

    /**
     * Gets the value of the csuParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsuParam() {
        return csuParam;
    }

    /**
     * Sets the value of the csuParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsuParam(String value) {
        this.csuParam = value;
    }

    /**
     * Gets the value of the firstDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDelay() {
        return firstDelay;
    }

    /**
     * Sets the value of the firstDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDelay(String value) {
        this.firstDelay = value;
    }

    /**
     * Gets the value of the interfaceIdPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceIdPresent() {
        return interfaceIdPresent;
    }

    /**
     * Sets the value of the interfaceIdPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceIdPresent(String value) {
        this.interfaceIdPresent = value;
    }

    /**
     * Gets the value of the interfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the value of the interfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceId(String value) {
        this.interfaceId = value;
    }

    /**
     * Gets the value of the intraDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraDelay() {
        return intraDelay;
    }

    /**
     * Sets the value of the intraDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraDelay(String value) {
        this.intraDelay = value;
    }

    /**
     * Gets the value of the mcdnEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcdnEnable() {
        return mcdnEnable;
    }

    /**
     * Sets the value of the mcdnEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcdnEnable(String value) {
        this.mcdnEnable = value;
    }

    /**
     * Gets the value of the redirectOutboundNumberIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectOutboundNumberIe() {
        return redirectOutboundNumberIe;
    }

    /**
     * Sets the value of the redirectOutboundNumberIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectOutboundNumberIe(String value) {
        this.redirectOutboundNumberIe = value;
    }

    /**
     * Gets the value of the numDigitsToStrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDigitsToStrip() {
        return numDigitsToStrip;
    }

    /**
     * Sets the value of the numDigitsToStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDigitsToStrip(String value) {
        this.numDigitsToStrip = value;
    }

    /**
     * Gets the value of the passingPrecedenceLevelThrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassingPrecedenceLevelThrough() {
        return passingPrecedenceLevelThrough;
    }

    /**
     * Sets the value of the passingPrecedenceLevelThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassingPrecedenceLevelThrough(String value) {
        this.passingPrecedenceLevelThrough = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
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
     * Gets the value of the connectedLineIdPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedLineIdPresentation() {
        return connectedLineIdPresentation;
    }

    /**
     * Sets the value of the connectedLineIdPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedLineIdPresentation(String value) {
        this.connectedLineIdPresentation = value;
    }

    /**
     * Gets the value of the priProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriProtocol() {
        return priProtocol;
    }

    /**
     * Sets the value of the priProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriProtocol(String value) {
        this.priProtocol = value;
    }

    /**
     * Gets the value of the securityAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAccessLevel() {
        return securityAccessLevel;
    }

    /**
     * Sets the value of the securityAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAccessLevel(String value) {
        this.securityAccessLevel = value;
    }

    /**
     * Gets the value of the sendCallingNameInFacilityIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCallingNameInFacilityIe() {
        return sendCallingNameInFacilityIe;
    }

    /**
     * Sets the value of the sendCallingNameInFacilityIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCallingNameInFacilityIe(String value) {
        this.sendCallingNameInFacilityIe = value;
    }

    /**
     * Gets the value of the sendExLeadingCharInDispIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendExLeadingCharInDispIe() {
        return sendExLeadingCharInDispIe;
    }

    /**
     * Sets the value of the sendExLeadingCharInDispIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendExLeadingCharInDispIe(String value) {
        this.sendExLeadingCharInDispIe = value;
    }

    /**
     * Gets the value of the sendRestart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendRestart() {
        return sendRestart;
    }

    /**
     * Sets the value of the sendRestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendRestart(String value) {
        this.sendRestart = value;
    }

    /**
     * Gets the value of the setupNonIsdnPi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupNonIsdnPi() {
        return setupNonIsdnPi;
    }

    /**
     * Sets the value of the setupNonIsdnPi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupNonIsdnPi(String value) {
        this.setupNonIsdnPi = value;
    }

    /**
     * Gets the value of the sigDigits property.
     * 
     * @return
     *     possible object is
     *     {@link UGatewayEndpointDigitalPri.SigDigits }
     *     
     */
    public UGatewayEndpointDigitalPri.SigDigits getSigDigits() {
        return sigDigits;
    }

    /**
     * Sets the value of the sigDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link UGatewayEndpointDigitalPri.SigDigits }
     *     
     */
    public void setSigDigits(UGatewayEndpointDigitalPri.SigDigits value) {
        this.sigDigits = value;
    }

    /**
     * Gets the value of the span property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpan() {
        return span;
    }

    /**
     * Sets the value of the span property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpan(String value) {
        this.span = value;
    }

    /**
     * Gets the value of the statusPoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPoll() {
        return statusPoll;
    }

    /**
     * Sets the value of the statusPoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPoll(String value) {
        this.statusPoll = value;
    }

    /**
     * Gets the value of the smdiBasePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmdiBasePort() {
        return smdiBasePort;
    }

    /**
     * Sets the value of the smdiBasePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmdiBasePort(String value) {
        this.smdiBasePort = value;
    }

    /**
     * Gets the value of the gClearEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGClearEnable() {
        return gClearEnable;
    }

    /**
     * Sets the value of the gClearEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGClearEnable(String value) {
        this.gClearEnable = value;
    }

    /**
     * Gets the value of the packetCaptureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketCaptureMode() {
        return packetCaptureMode;
    }

    /**
     * Sets the value of the packetCaptureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketCaptureMode(String value) {
        this.packetCaptureMode = value;
    }

    /**
     * Gets the value of the packetCaptureDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketCaptureDuration() {
        return packetCaptureDuration;
    }

    /**
     * Sets the value of the packetCaptureDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketCaptureDuration(String value) {
        this.packetCaptureDuration = value;
    }

    /**
     * Gets the value of the transmitUtf8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmitUtf8() {
        return transmitUtf8;
    }

    /**
     * Sets the value of the transmitUtf8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmitUtf8(String value) {
        this.transmitUtf8 = value;
    }

    /**
     * Gets the value of the v150 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV150() {
        return v150;
    }

    /**
     * Sets the value of the v150 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV150(String value) {
        this.v150 = value;
    }

    /**
     * Gets the value of the asn1RoseOidEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsn1RoseOidEncoding() {
        return asn1RoseOidEncoding;
    }

    /**
     * Sets the value of the asn1RoseOidEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsn1RoseOidEncoding(String value) {
        this.asn1RoseOidEncoding = value;
    }

    /**
     * Gets the value of the qsigVariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsigVariant() {
        return qsigVariant;
    }

    /**
     * Sets the value of the qsigVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsigVariant(String value) {
        this.qsigVariant = value;
    }

    /**
     * Gets the value of the unattendedPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnattendedPort() {
        return unattendedPort;
    }

    /**
     * Sets the value of the unattendedPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnattendedPort(String value) {
        this.unattendedPort = value;
    }

    /**
     * Gets the value of the cdpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCdpnTransformationCssName() {
        return cdpnTransformationCssName;
    }

    /**
     * Sets the value of the cdpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCdpnTransformationCssName(XFkType value) {
        this.cdpnTransformationCssName = value;
    }

    /**
     * Gets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCdpnTransformCss() {
        return useDevicePoolCdpnTransformCss;
    }

    /**
     * Sets the value of the useDevicePoolCdpnTransformCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCdpnTransformCss(String value) {
        this.useDevicePoolCdpnTransformCss = value;
    }

    /**
     * Gets the value of the nationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalPrefix() {
        return nationalPrefix;
    }

    /**
     * Sets the value of the nationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalPrefix(String value) {
        this.nationalPrefix = value;
    }

    /**
     * Gets the value of the internationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPrefix() {
        return internationalPrefix;
    }

    /**
     * Sets the value of the internationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPrefix(String value) {
        this.internationalPrefix = value;
    }

    /**
     * Gets the value of the unknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownPrefix() {
        return unknownPrefix;
    }

    /**
     * Sets the value of the unknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownPrefix(String value) {
        this.unknownPrefix = value;
    }

    /**
     * Gets the value of the subscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberPrefix() {
        return subscriberPrefix;
    }

    /**
     * Sets the value of the subscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberPrefix(String value) {
        this.subscriberPrefix = value;
    }

    /**
     * Gets the value of the geoLocationFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getGeoLocationFilterName() {
        return geoLocationFilterName;
    }

    /**
     * Sets the value of the geoLocationFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setGeoLocationFilterName(XFkType value) {
        this.geoLocationFilterName = value;
    }

    /**
     * Gets the value of the routeClassSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteClassSignalling() {
        return routeClassSignalling;
    }

    /**
     * Sets the value of the routeClassSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteClassSignalling(String value) {
        this.routeClassSignalling = value;
    }

    /**
     * Gets the value of the nationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalStripDigits() {
        return nationalStripDigits;
    }

    /**
     * Sets the value of the nationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalStripDigits(String value) {
        this.nationalStripDigits = value;
    }

    /**
     * Gets the value of the internationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStripDigits() {
        return internationalStripDigits;
    }

    /**
     * Sets the value of the internationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStripDigits(String value) {
        this.internationalStripDigits = value;
    }

    /**
     * Gets the value of the unknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownStripDigits() {
        return unknownStripDigits;
    }

    /**
     * Sets the value of the unknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownStripDigits(String value) {
        this.unknownStripDigits = value;
    }

    /**
     * Gets the value of the subscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberStripDigits() {
        return subscriberStripDigits;
    }

    /**
     * Sets the value of the subscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberStripDigits(String value) {
        this.subscriberStripDigits = value;
    }

    /**
     * Gets the value of the nationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNationalTransformationCssName() {
        return nationalTransformationCssName;
    }

    /**
     * Sets the value of the nationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNationalTransformationCssName(XFkType value) {
        this.nationalTransformationCssName = value;
    }

    /**
     * Gets the value of the internationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getInternationalTransformationCssName() {
        return internationalTransformationCssName;
    }

    /**
     * Sets the value of the internationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setInternationalTransformationCssName(XFkType value) {
        this.internationalTransformationCssName = value;
    }

    /**
     * Gets the value of the unknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getUnknownTransformationCssName() {
        return unknownTransformationCssName;
    }

    /**
     * Sets the value of the unknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setUnknownTransformationCssName(XFkType value) {
        this.unknownTransformationCssName = value;
    }

    /**
     * Gets the value of the subscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSubscriberTransformationCssName() {
        return subscriberTransformationCssName;
    }

    /**
     * Sets the value of the subscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSubscriberTransformationCssName(XFkType value) {
        this.subscriberTransformationCssName = value;
    }

    /**
     * Gets the value of the pstnAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnAccess() {
        return pstnAccess;
    }

    /**
     * Sets the value of the pstnAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnAccess(String value) {
        this.pstnAccess = value;
    }

    /**
     * Gets the value of the imeE164TransformationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getImeE164TransformationName() {
        return imeE164TransformationName;
    }

    /**
     * Sets the value of the imeE164TransformationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setImeE164TransformationName(XFkType value) {
        this.imeE164TransformationName = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssNatl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssNatl() {
        return useDevicePoolCgpnTransformCssNatl;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssNatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssNatl(String value) {
        this.useDevicePoolCgpnTransformCssNatl = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssIntl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssIntl() {
        return useDevicePoolCgpnTransformCssIntl;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssIntl(String value) {
        this.useDevicePoolCgpnTransformCssIntl = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssUnkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssUnkn() {
        return useDevicePoolCgpnTransformCssUnkn;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssUnkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssUnkn(String value) {
        this.useDevicePoolCgpnTransformCssUnkn = value;
    }

    /**
     * Gets the value of the useDevicePoolCgpnTransformCssSubs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCgpnTransformCssSubs() {
        return useDevicePoolCgpnTransformCssSubs;
    }

    /**
     * Sets the value of the useDevicePoolCgpnTransformCssSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCgpnTransformCssSubs(String value) {
        this.useDevicePoolCgpnTransformCssSubs = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
     *       &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SigDigits {

        @XmlValue
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger value;
        @XmlAttribute
        protected Boolean enable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the enable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnable() {
            return enable;
        }

        /**
         * Sets the value of the enable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnable(Boolean value) {
            this.enable = value;
        }

    }

}
