
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for XCiscoCatalyst6000E1VoIPGateway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCiscoCatalyst6000E1VoIPGateway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XProduct"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/8.0}XClass"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/8.0}XDeviceProtocol"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/8.0}XProtocolSide"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/8.0}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/8.0}XCountry" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/8.0}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/8.0}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="redirectInboundNumberIe" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="calledPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan"/>
 *         &lt;element name="calledPri" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber"/>
 *         &lt;element name="callerIdDn" type="{http://www.cisco.com/AXL/API/8.0}String255"/>
 *         &lt;element name="callingPartySelection" type="{http://www.cisco.com/AXL/API/8.0}XCallingPartySelection"/>
 *         &lt;element name="callingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan"/>
 *         &lt;element name="callingPri" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber"/>
 *         &lt;element name="chanIe" type="{http://www.cisco.com/AXL/API/8.0}XPRIChanIE"/>
 *         &lt;element name="clockReference" type="{http://www.cisco.com/AXL/API/8.0}XClockReference"/>
 *         &lt;element name="dChannelEnable" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="channelSelectionOrder" type="{http://www.cisco.com/AXL/API/8.0}XTrunkSelectionOrder"/>
 *         &lt;element name="displayIE" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="pcmType" type="{http://www.cisco.com/AXL/API/8.0}XEncode"/>
 *         &lt;element name="csuParam" type="{http://www.cisco.com/AXL/API/8.0}XCSUParam"/>
 *         &lt;element name="firstDelay" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="interfaceIdPresent" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="interfaceId" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="intraDelay" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="mcdnEnable" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="redirectOutboundNumberIe" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="numDigitsToStrip" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="passingPrecedenceLevelThrough" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit"/>
 *         &lt;element name="connectedLineIdPresentation" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit"/>
 *         &lt;element name="priProtocol" type="{http://www.cisco.com/AXL/API/8.0}XPriProtocol"/>
 *         &lt;element name="securityAccessLevel" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="sendCallingNameInFacilityIe" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="sendExLeadingCharInDispIe" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="sendRestart" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="setupNonIsdnPi" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="sigDigits">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.cisco.com/AXL/API/8.0>XInteger">
 *                 &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="span" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="statusPoll" type="{http://www.cisco.com/AXL/API/8.0}boolean"/>
 *         &lt;element name="smdiBasePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/8.0}XPacketCaptureMode" minOccurs="0"/>
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="transmitUtf8" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="v150" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="asn1RoseOidEncoding" type="{http://www.cisco.com/AXL/API/8.0}XASN1RoseOidEncoding" minOccurs="0"/>
 *         &lt;element name="QSIGVariant" type="{http://www.cisco.com/AXL/API/8.0}XQSIGVariant" minOccurs="0"/>
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCdpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="nationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="internationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="unknownPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="subscriberPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="nationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="internationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="unknownStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="subscriberStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="nationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="internationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="unknownTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="subscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssNatl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssIntl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssUnkn" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssSubs" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="imeE164TransformationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCiscoCatalyst6000E1VoIPGateway", propOrder = {
    "name",
    "description",
    "product",
    "clazz",
    "protocol",
    "protocolSide",
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
    "chanIe",
    "clockReference",
    "dChannelEnable",
    "channelSelectionOrder",
    "displayIE",
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
    "nationalStripDigits",
    "internationalStripDigits",
    "unknownStripDigits",
    "subscriberStripDigits",
    "nationalTransformationCssName",
    "internationalTransformationCssName",
    "unknownTransformationCssName",
    "subscriberTransformationCssName",
    "useDevicePoolCgpnTransformCssNatl",
    "useDevicePoolCgpnTransformCssIntl",
    "useDevicePoolCgpnTransformCssUnkn",
    "useDevicePoolCgpnTransformCssSubs",
    "pstnAccess",
    "imeE164TransformationName"
})
public class XCiscoCatalyst6000E1VoIPGateway {

    protected String name;
    protected String description;
    protected String product;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    @XmlElement(defaultValue = "User")
    protected String protocolSide;
    @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceName;
    @XmlElementRef(name = "devicePoolName", type = JAXBElement.class)
    protected JAXBElement<XFkType> devicePoolName;
    @XmlElementRef(name = "commonDeviceConfigName", type = JAXBElement.class)
    protected JAXBElement<XFkType> commonDeviceConfigName;
    @XmlElement(defaultValue = "Use System Default")
    protected String networkLocation;
    protected XFkType locationName;
    @XmlElementRef(name = "networkLocale", type = JAXBElement.class)
    protected JAXBElement<String> networkLocale;
    @XmlElementRef(name = "mediaResourceListName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mediaResourceListName;
    @XmlElementRef(name = "automatedAlternateRoutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> automatedAlternateRoutingCssName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    @XmlElementRef(name = "loadInformation", type = JAXBElement.class)
    protected JAXBElement<XLoadInformation> loadInformation;
    protected XVendorConfig vendorConfig;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<Integer> mlppDomainId;
    @XmlElement(defaultValue = "Default")
    protected String useTrustedRelayPoint;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCss;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationName;
    protected String redirectInboundNumberIe;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPri;
    @XmlElementRef(name = "callerIdDn", type = JAXBElement.class)
    protected JAXBElement<String> callerIdDn;
    @XmlElement(defaultValue = "Originator")
    protected String callingPartySelection;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPri;
    @XmlElement(defaultValue = "Use Number when 1B")
    protected String chanIe;
    protected String clockReference;
    protected String dChannelEnable;
    @XmlElement(defaultValue = "Top Down")
    protected String channelSelectionOrder;
    protected String displayIE;
    protected String pcmType;
    protected String csuParam;
    @XmlElement(defaultValue = "32")
    protected String firstDelay;
    protected String interfaceIdPresent;
    @XmlElement(defaultValue = "0")
    protected String interfaceId;
    @XmlElement(defaultValue = "4")
    protected String intraDelay;
    protected String mcdnEnable;
    protected String redirectOutboundNumberIe;
    @XmlElement(defaultValue = "0")
    protected String numDigitsToStrip;
    protected String passingPrecedenceLevelThrough;
    @XmlElementRef(name = "prefix", type = JAXBElement.class)
    protected JAXBElement<String> prefix;
    @XmlElement(defaultValue = "Default")
    protected String callingLinePresentationBit;
    @XmlElement(defaultValue = "Default")
    protected String connectedLineIdPresentation;
    protected String priProtocol;
    @XmlElement(defaultValue = "2")
    protected String securityAccessLevel;
    protected String sendCallingNameInFacilityIe;
    protected String sendExLeadingCharInDispIe;
    protected String sendRestart;
    protected String setupNonIsdnPi;
    protected XCiscoCatalyst6000E1VoIPGateway.SigDigits sigDigits;
    protected String span;
    protected String statusPoll;
    @XmlElement(defaultValue = "0")
    protected String smdiBasePort;
    @XmlElement(defaultValue = "None")
    protected String packetCaptureMode;
    @XmlElementRef(name = "packetCaptureDuration", type = JAXBElement.class)
    protected JAXBElement<String> packetCaptureDuration;
    @XmlElement(defaultValue = "false")
    protected String transmitUtf8;
    @XmlElement(defaultValue = "false")
    protected String v150;
    @XmlElement(defaultValue = "No Changes")
    protected String asn1RoseOidEncoding;
    @XmlElement(name = "QSIGVariant", defaultValue = "No Changes")
    protected String qsigVariant;
    @XmlElement(defaultValue = "false")
    protected String unattendedPort;
    @XmlElementRef(name = "cdpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cdpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCdpnTransformCss;
    protected String nationalPrefix;
    protected String internationalPrefix;
    protected String unknownPrefix;
    protected String subscriberPrefix;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationFilterName;
    @XmlElementRef(name = "nationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> nationalStripDigits;
    @XmlElementRef(name = "internationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> internationalStripDigits;
    @XmlElementRef(name = "unknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> unknownStripDigits;
    @XmlElementRef(name = "subscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> subscriberStripDigits;
    @XmlElementRef(name = "nationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> nationalTransformationCssName;
    @XmlElementRef(name = "internationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> internationalTransformationCssName;
    @XmlElementRef(name = "unknownTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> unknownTransformationCssName;
    @XmlElementRef(name = "subscriberTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> subscriberTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssNatl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssIntl;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssUnkn;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCssSubs;
    @XmlElement(defaultValue = "true")
    protected String pstnAccess;
    @XmlElementRef(name = "imeE164TransformationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> imeE164TransformationName;

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
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.callingSearchSpaceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDevicePoolName(JAXBElement<XFkType> value) {
        this.devicePoolName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCommonDeviceConfigName(JAXBElement<XFkType> value) {
        this.commonDeviceConfigName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkLocale() {
        return networkLocale;
    }

    /**
     * Sets the value of the networkLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkLocale(JAXBElement<String> value) {
        this.networkLocale = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mediaResourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMediaResourceListName() {
        return mediaResourceListName;
    }

    /**
     * Sets the value of the mediaResourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMediaResourceListName(JAXBElement<XFkType> value) {
        this.mediaResourceListName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the automatedAlternateRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAutomatedAlternateRoutingCssName() {
        return automatedAlternateRoutingCssName;
    }

    /**
     * Sets the value of the automatedAlternateRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAutomatedAlternateRoutingCssName(JAXBElement<XFkType> value) {
        this.automatedAlternateRoutingCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAarNeighborhoodName(JAXBElement<XFkType> value) {
        this.aarNeighborhoodName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the loadInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XLoadInformation }{@code >}
     *     
     */
    public JAXBElement<XLoadInformation> getLoadInformation() {
        return loadInformation;
    }

    /**
     * Sets the value of the loadInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XLoadInformation }{@code >}
     *     
     */
    public void setLoadInformation(JAXBElement<XLoadInformation> value) {
        this.loadInformation = ((JAXBElement<XLoadInformation> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCgpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cgpnTransformationCssName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationName() {
        return geoLocationName;
    }

    /**
     * Sets the value of the geoLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationName(JAXBElement<XFkType> value) {
        this.geoLocationName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallerIdDn() {
        return callerIdDn;
    }

    /**
     * Sets the value of the callerIdDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallerIdDn(JAXBElement<String> value) {
        this.callerIdDn = ((JAXBElement<String> ) value);
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
     * Gets the value of the chanIe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanIe() {
        return chanIe;
    }

    /**
     * Sets the value of the chanIe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanIe(String value) {
        this.chanIe = value;
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
     * Gets the value of the displayIE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayIE() {
        return displayIE;
    }

    /**
     * Sets the value of the displayIE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayIE(String value) {
        this.displayIE = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = ((JAXBElement<String> ) value);
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
     *     {@link XCiscoCatalyst6000E1VoIPGateway.SigDigits }
     *     
     */
    public XCiscoCatalyst6000E1VoIPGateway.SigDigits getSigDigits() {
        return sigDigits;
    }

    /**
     * Sets the value of the sigDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCiscoCatalyst6000E1VoIPGateway.SigDigits }
     *     
     */
    public void setSigDigits(XCiscoCatalyst6000E1VoIPGateway.SigDigits value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPacketCaptureDuration() {
        return packetCaptureDuration;
    }

    /**
     * Sets the value of the packetCaptureDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPacketCaptureDuration(JAXBElement<String> value) {
        this.packetCaptureDuration = ((JAXBElement<String> ) value);
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
    public String getQSIGVariant() {
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
    public void setQSIGVariant(String value) {
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCdpnTransformationCssName() {
        return cdpnTransformationCssName;
    }

    /**
     * Sets the value of the cdpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCdpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cdpnTransformationCssName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationFilterName() {
        return geoLocationFilterName;
    }

    /**
     * Sets the value of the geoLocationFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationFilterName(JAXBElement<XFkType> value) {
        this.geoLocationFilterName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the nationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalStripDigits() {
        return nationalStripDigits;
    }

    /**
     * Sets the value of the nationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalStripDigits(JAXBElement<String> value) {
        this.nationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternationalStripDigits() {
        return internationalStripDigits;
    }

    /**
     * Sets the value of the internationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternationalStripDigits(JAXBElement<String> value) {
        this.internationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnknownStripDigits() {
        return unknownStripDigits;
    }

    /**
     * Sets the value of the unknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnknownStripDigits(JAXBElement<String> value) {
        this.unknownStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubscriberStripDigits() {
        return subscriberStripDigits;
    }

    /**
     * Sets the value of the subscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubscriberStripDigits(JAXBElement<String> value) {
        this.subscriberStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNationalTransformationCssName() {
        return nationalTransformationCssName;
    }

    /**
     * Sets the value of the nationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNationalTransformationCssName(JAXBElement<XFkType> value) {
        this.nationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the internationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getInternationalTransformationCssName() {
        return internationalTransformationCssName;
    }

    /**
     * Sets the value of the internationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setInternationalTransformationCssName(JAXBElement<XFkType> value) {
        this.internationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the unknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUnknownTransformationCssName() {
        return unknownTransformationCssName;
    }

    /**
     * Sets the value of the unknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUnknownTransformationCssName(JAXBElement<XFkType> value) {
        this.unknownTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the subscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSubscriberTransformationCssName() {
        return subscriberTransformationCssName;
    }

    /**
     * Sets the value of the subscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSubscriberTransformationCssName(JAXBElement<XFkType> value) {
        this.subscriberTransformationCssName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getImeE164TransformationName() {
        return imeE164TransformationName;
    }

    /**
     * Sets the value of the imeE164TransformationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setImeE164TransformationName(JAXBElement<XFkType> value) {
        this.imeE164TransformationName = ((JAXBElement<XFkType> ) value);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.cisco.com/AXL/API/8.0>XInteger">
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
        protected String value;
        @XmlAttribute
        protected Boolean enable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
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
