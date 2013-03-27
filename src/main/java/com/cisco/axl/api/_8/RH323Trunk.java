
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
 * <p>Java class for RH323Trunk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RH323Trunk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XProduct" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.cisco.com/AXL/API/8.0}XModel" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/8.0}XClass" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/8.0}XDeviceProtocol" minOccurs="0"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/8.0}XProtocolSide" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/8.0}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="traceFlag" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/8.0}XPreemption" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="retryVideoCallAsAudio" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="sendGeoLocation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCdpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/8.0}XPacketCaptureMode" minOccurs="0"/>
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="srtpAllowed" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="waitForFarEndH245TerminalSet" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mtpRequired" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="callerIdDn" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="callingPartySelection" type="{http://www.cisco.com/AXL/API/8.0}XCallingPartySelection" minOccurs="0"/>
 *         &lt;element name="callingLineIdPresentation" type="{http://www.cisco.com/AXL/API/8.0}XPresentationBit" minOccurs="0"/>
 *         &lt;element name="displayIEDelivery" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="redirectOutboundNumberIe" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="redirectInboundNumberIe" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enableInboundFaststart" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enableOutboundFaststart" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="codecForOutboundFaststart" type="{http://www.cisco.com/AXL/API/8.0}XMediaPayload" minOccurs="0"/>
 *         &lt;element name="allowH235PassThrough" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="tunneledProtocol" type="{http://www.cisco.com/AXL/API/8.0}XTunneledProtocol" minOccurs="0"/>
 *         &lt;element name="asn1RoseOidEncoding" type="{http://www.cisco.com/AXL/API/8.0}XASN1RoseOidEncoding" minOccurs="0"/>
 *         &lt;element name="qsigVariant" type="{http://www.cisco.com/AXL/API/8.0}XQSIGVariant" minOccurs="0"/>
 *         &lt;element name="transmitUtf8" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="signalingPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="nationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="internationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="unknownPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="subscriberPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="sigDigits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.cisco.com/AXL/API/8.0>XInteger">
 *                 &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prefixDn" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="calledPartyIeNumberType" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="callingPartyIeNumberType" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="calledNumberingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="callingNumberingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="pathReplacementSupport" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="gateKeeperInfo" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="gateKeeper" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                     &lt;element name="terminalType" type="{http://www.cisco.com/AXL/API/8.0}XTerminal" minOccurs="0"/>
 *                     &lt;element name="technologyPrefix" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *                     &lt;element name="zone" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="remoteServerinfo" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="server1" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                     &lt;element name="server2" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                     &lt;element name="server3" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="ictPassingPrecedenceLevelThroughUuie" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="ictSecurityAccessLevel" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="isSafEnabled" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="callingPartyNationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callingPartyInternationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callingPartyUnknownStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callingPartySubscriberStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callingPartyNationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyInternationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyUnknownTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="callingPartySubscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyNationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="imeE164TransformationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssNatl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssIntl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssUnkn" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCssSubs" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssNatl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssIntl" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssUnkn" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCalledCssSubs" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="calledPartyNationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyNationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
@XmlType(name = "RH323Trunk", propOrder = {
    "name",
    "description",
    "product",
    "model",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "networkLocation",
    "locationName",
    "mediaResourceListName",
    "aarNeighborhoodName",
    "traceFlag",
    "mlppDomainId",
    "mlppIndicationStatus",
    "preemption",
    "useTrustedRelayPoint",
    "retryVideoCallAsAudio",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "geoLocationFilterName",
    "sendGeoLocation",
    "cdpnTransformationCssName",
    "useDevicePoolCdpnTransformCss",
    "packetCaptureMode",
    "packetCaptureDuration",
    "srtpAllowed",
    "unattendedPort",
    "waitForFarEndH245TerminalSet",
    "mtpRequired",
    "callerIdDn",
    "callingPartySelection",
    "callingLineIdPresentation",
    "displayIEDelivery",
    "redirectOutboundNumberIe",
    "redirectInboundNumberIe",
    "enableInboundFaststart",
    "enableOutboundFaststart",
    "codecForOutboundFaststart",
    "allowH235PassThrough",
    "tunneledProtocol",
    "asn1RoseOidEncoding",
    "qsigVariant",
    "transmitUtf8",
    "signalingPort",
    "nationalPrefix",
    "internationalPrefix",
    "unknownPrefix",
    "subscriberPrefix",
    "sigDigits",
    "prefixDn",
    "calledPartyIeNumberType",
    "callingPartyIeNumberType",
    "calledNumberingPlan",
    "callingNumberingPlan",
    "pathReplacementSupport",
    "gateKeeperInfo",
    "remoteServerinfo",
    "ictPassingPrecedenceLevelThroughUuie",
    "ictSecurityAccessLevel",
    "isSafEnabled",
    "callingPartyNationalStripDigits",
    "callingPartyInternationalStripDigits",
    "callingPartyUnknownStripDigits",
    "callingPartySubscriberStripDigits",
    "callingPartyNationalTransformationCssName",
    "callingPartyInternationalTransformationCssName",
    "callingPartyUnknownTransformationCssName",
    "callingPartySubscriberTransformationCssName",
    "calledPartyNationalPrefix",
    "calledPartyInternationalPrefix",
    "calledPartyUnknownPrefix",
    "calledPartySubscriberPrefix",
    "pstnAccess",
    "imeE164TransformationName",
    "automatedAlternateRoutingCssName",
    "useDevicePoolCgpnTransformCssNatl",
    "useDevicePoolCgpnTransformCssIntl",
    "useDevicePoolCgpnTransformCssUnkn",
    "useDevicePoolCgpnTransformCssSubs",
    "useDevicePoolCalledCssNatl",
    "useDevicePoolCalledCssIntl",
    "useDevicePoolCalledCssUnkn",
    "useDevicePoolCalledCssSubs",
    "calledPartyNationalStripDigits",
    "calledPartyInternationalStripDigits",
    "calledPartyUnknownStripDigits",
    "calledPartySubscriberStripDigits",
    "calledPartyNationalTransformationCssName",
    "calledPartyInternationalTransformationCssName",
    "calledPartyUnknownTransformationCssName",
    "calledPartySubscriberTransformationCssName"
})
public class RH323Trunk {

    protected String name;
    protected String description;
    protected String product;
    protected String model;
    @XmlElement(name = "class")
    protected String clazz;
    protected String protocol;
    protected String protocolSide;
    protected XFkType callingSearchSpaceName;
    protected XFkType devicePoolName;
    protected XFkType commonDeviceConfigName;
    protected String networkLocation;
    protected XFkType locationName;
    protected XFkType mediaResourceListName;
    protected XFkType aarNeighborhoodName;
    protected String traceFlag;
    protected Integer mlppDomainId;
    protected String mlppIndicationStatus;
    protected String preemption;
    protected String useTrustedRelayPoint;
    protected String retryVideoCallAsAudio;
    protected XFkType cgpnTransformationCssName;
    protected String useDevicePoolCgpnTransformCss;
    protected XFkType geoLocationName;
    protected XFkType geoLocationFilterName;
    protected String sendGeoLocation;
    protected XFkType cdpnTransformationCssName;
    protected String useDevicePoolCdpnTransformCss;
    protected String packetCaptureMode;
    protected String packetCaptureDuration;
    protected String srtpAllowed;
    protected String unattendedPort;
    protected String waitForFarEndH245TerminalSet;
    protected String mtpRequired;
    protected String callerIdDn;
    protected String callingPartySelection;
    protected String callingLineIdPresentation;
    protected String displayIEDelivery;
    protected String redirectOutboundNumberIe;
    protected String redirectInboundNumberIe;
    protected String enableInboundFaststart;
    protected String enableOutboundFaststart;
    protected String codecForOutboundFaststart;
    protected String allowH235PassThrough;
    protected String tunneledProtocol;
    protected String asn1RoseOidEncoding;
    protected String qsigVariant;
    protected String transmitUtf8;
    protected String signalingPort;
    protected String nationalPrefix;
    protected String internationalPrefix;
    protected String unknownPrefix;
    protected String subscriberPrefix;
    protected RH323Trunk.SigDigits sigDigits;
    protected String prefixDn;
    protected String calledPartyIeNumberType;
    protected String callingPartyIeNumberType;
    protected String calledNumberingPlan;
    protected String callingNumberingPlan;
    protected String pathReplacementSupport;
    protected RH323Trunk.GateKeeperInfo gateKeeperInfo;
    protected RH323Trunk.RemoteServerinfo remoteServerinfo;
    protected String ictPassingPrecedenceLevelThroughUuie;
    protected String ictSecurityAccessLevel;
    protected String isSafEnabled;
    protected String callingPartyNationalStripDigits;
    protected String callingPartyInternationalStripDigits;
    protected String callingPartyUnknownStripDigits;
    protected String callingPartySubscriberStripDigits;
    protected XFkType callingPartyNationalTransformationCssName;
    protected XFkType callingPartyInternationalTransformationCssName;
    protected XFkType callingPartyUnknownTransformationCssName;
    protected XFkType callingPartySubscriberTransformationCssName;
    protected String calledPartyNationalPrefix;
    protected String calledPartyInternationalPrefix;
    protected String calledPartyUnknownPrefix;
    protected String calledPartySubscriberPrefix;
    protected String pstnAccess;
    protected XFkType imeE164TransformationName;
    protected XFkType automatedAlternateRoutingCssName;
    protected String useDevicePoolCgpnTransformCssNatl;
    protected String useDevicePoolCgpnTransformCssIntl;
    protected String useDevicePoolCgpnTransformCssUnkn;
    protected String useDevicePoolCgpnTransformCssSubs;
    protected String useDevicePoolCalledCssNatl;
    protected String useDevicePoolCalledCssIntl;
    protected String useDevicePoolCalledCssUnkn;
    protected String useDevicePoolCalledCssSubs;
    protected String calledPartyNationalStripDigits;
    protected String calledPartyInternationalStripDigits;
    protected String calledPartyUnknownStripDigits;
    protected String calledPartySubscriberStripDigits;
    protected XFkType calledPartyNationalTransformationCssName;
    protected XFkType calledPartyInternationalTransformationCssName;
    protected XFkType calledPartyUnknownTransformationCssName;
    protected XFkType calledPartySubscriberTransformationCssName;
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
     * Gets the value of the retryVideoCallAsAudio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryVideoCallAsAudio() {
        return retryVideoCallAsAudio;
    }

    /**
     * Sets the value of the retryVideoCallAsAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryVideoCallAsAudio(String value) {
        this.retryVideoCallAsAudio = value;
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
     * Gets the value of the sendGeoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendGeoLocation() {
        return sendGeoLocation;
    }

    /**
     * Sets the value of the sendGeoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendGeoLocation(String value) {
        this.sendGeoLocation = value;
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
     * Gets the value of the srtpAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrtpAllowed() {
        return srtpAllowed;
    }

    /**
     * Sets the value of the srtpAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrtpAllowed(String value) {
        this.srtpAllowed = value;
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
     * Gets the value of the waitForFarEndH245TerminalSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitForFarEndH245TerminalSet() {
        return waitForFarEndH245TerminalSet;
    }

    /**
     * Sets the value of the waitForFarEndH245TerminalSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitForFarEndH245TerminalSet(String value) {
        this.waitForFarEndH245TerminalSet = value;
    }

    /**
     * Gets the value of the mtpRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtpRequired() {
        return mtpRequired;
    }

    /**
     * Sets the value of the mtpRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtpRequired(String value) {
        this.mtpRequired = value;
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
     * Gets the value of the callingLineIdPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdPresentation() {
        return callingLineIdPresentation;
    }

    /**
     * Sets the value of the callingLineIdPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdPresentation(String value) {
        this.callingLineIdPresentation = value;
    }

    /**
     * Gets the value of the displayIEDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayIEDelivery() {
        return displayIEDelivery;
    }

    /**
     * Sets the value of the displayIEDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayIEDelivery(String value) {
        this.displayIEDelivery = value;
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
     * Gets the value of the enableInboundFaststart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableInboundFaststart() {
        return enableInboundFaststart;
    }

    /**
     * Sets the value of the enableInboundFaststart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableInboundFaststart(String value) {
        this.enableInboundFaststart = value;
    }

    /**
     * Gets the value of the enableOutboundFaststart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableOutboundFaststart() {
        return enableOutboundFaststart;
    }

    /**
     * Sets the value of the enableOutboundFaststart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableOutboundFaststart(String value) {
        this.enableOutboundFaststart = value;
    }

    /**
     * Gets the value of the codecForOutboundFaststart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecForOutboundFaststart() {
        return codecForOutboundFaststart;
    }

    /**
     * Sets the value of the codecForOutboundFaststart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecForOutboundFaststart(String value) {
        this.codecForOutboundFaststart = value;
    }

    /**
     * Gets the value of the allowH235PassThrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowH235PassThrough() {
        return allowH235PassThrough;
    }

    /**
     * Sets the value of the allowH235PassThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowH235PassThrough(String value) {
        this.allowH235PassThrough = value;
    }

    /**
     * Gets the value of the tunneledProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunneledProtocol() {
        return tunneledProtocol;
    }

    /**
     * Sets the value of the tunneledProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunneledProtocol(String value) {
        this.tunneledProtocol = value;
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
     * Gets the value of the signalingPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalingPort() {
        return signalingPort;
    }

    /**
     * Sets the value of the signalingPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalingPort(String value) {
        this.signalingPort = value;
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
     * Gets the value of the sigDigits property.
     * 
     * @return
     *     possible object is
     *     {@link RH323Trunk.SigDigits }
     *     
     */
    public RH323Trunk.SigDigits getSigDigits() {
        return sigDigits;
    }

    /**
     * Sets the value of the sigDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RH323Trunk.SigDigits }
     *     
     */
    public void setSigDigits(RH323Trunk.SigDigits value) {
        this.sigDigits = value;
    }

    /**
     * Gets the value of the prefixDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixDn() {
        return prefixDn;
    }

    /**
     * Sets the value of the prefixDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixDn(String value) {
        this.prefixDn = value;
    }

    /**
     * Gets the value of the calledPartyIeNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyIeNumberType() {
        return calledPartyIeNumberType;
    }

    /**
     * Sets the value of the calledPartyIeNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyIeNumberType(String value) {
        this.calledPartyIeNumberType = value;
    }

    /**
     * Gets the value of the callingPartyIeNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyIeNumberType() {
        return callingPartyIeNumberType;
    }

    /**
     * Sets the value of the callingPartyIeNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyIeNumberType(String value) {
        this.callingPartyIeNumberType = value;
    }

    /**
     * Gets the value of the calledNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledNumberingPlan() {
        return calledNumberingPlan;
    }

    /**
     * Sets the value of the calledNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledNumberingPlan(String value) {
        this.calledNumberingPlan = value;
    }

    /**
     * Gets the value of the callingNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNumberingPlan() {
        return callingNumberingPlan;
    }

    /**
     * Sets the value of the callingNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNumberingPlan(String value) {
        this.callingNumberingPlan = value;
    }

    /**
     * Gets the value of the pathReplacementSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathReplacementSupport() {
        return pathReplacementSupport;
    }

    /**
     * Sets the value of the pathReplacementSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathReplacementSupport(String value) {
        this.pathReplacementSupport = value;
    }

    /**
     * Gets the value of the gateKeeperInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RH323Trunk.GateKeeperInfo }
     *     
     */
    public RH323Trunk.GateKeeperInfo getGateKeeperInfo() {
        return gateKeeperInfo;
    }

    /**
     * Sets the value of the gateKeeperInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RH323Trunk.GateKeeperInfo }
     *     
     */
    public void setGateKeeperInfo(RH323Trunk.GateKeeperInfo value) {
        this.gateKeeperInfo = value;
    }

    /**
     * Gets the value of the remoteServerinfo property.
     * 
     * @return
     *     possible object is
     *     {@link RH323Trunk.RemoteServerinfo }
     *     
     */
    public RH323Trunk.RemoteServerinfo getRemoteServerinfo() {
        return remoteServerinfo;
    }

    /**
     * Sets the value of the remoteServerinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RH323Trunk.RemoteServerinfo }
     *     
     */
    public void setRemoteServerinfo(RH323Trunk.RemoteServerinfo value) {
        this.remoteServerinfo = value;
    }

    /**
     * Gets the value of the ictPassingPrecedenceLevelThroughUuie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIctPassingPrecedenceLevelThroughUuie() {
        return ictPassingPrecedenceLevelThroughUuie;
    }

    /**
     * Sets the value of the ictPassingPrecedenceLevelThroughUuie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIctPassingPrecedenceLevelThroughUuie(String value) {
        this.ictPassingPrecedenceLevelThroughUuie = value;
    }

    /**
     * Gets the value of the ictSecurityAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIctSecurityAccessLevel() {
        return ictSecurityAccessLevel;
    }

    /**
     * Sets the value of the ictSecurityAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIctSecurityAccessLevel(String value) {
        this.ictSecurityAccessLevel = value;
    }

    /**
     * Gets the value of the isSafEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSafEnabled() {
        return isSafEnabled;
    }

    /**
     * Sets the value of the isSafEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSafEnabled(String value) {
        this.isSafEnabled = value;
    }

    /**
     * Gets the value of the callingPartyNationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNationalStripDigits() {
        return callingPartyNationalStripDigits;
    }

    /**
     * Sets the value of the callingPartyNationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNationalStripDigits(String value) {
        this.callingPartyNationalStripDigits = value;
    }

    /**
     * Gets the value of the callingPartyInternationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyInternationalStripDigits() {
        return callingPartyInternationalStripDigits;
    }

    /**
     * Sets the value of the callingPartyInternationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyInternationalStripDigits(String value) {
        this.callingPartyInternationalStripDigits = value;
    }

    /**
     * Gets the value of the callingPartyUnknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyUnknownStripDigits() {
        return callingPartyUnknownStripDigits;
    }

    /**
     * Sets the value of the callingPartyUnknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyUnknownStripDigits(String value) {
        this.callingPartyUnknownStripDigits = value;
    }

    /**
     * Gets the value of the callingPartySubscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartySubscriberStripDigits() {
        return callingPartySubscriberStripDigits;
    }

    /**
     * Sets the value of the callingPartySubscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartySubscriberStripDigits(String value) {
        this.callingPartySubscriberStripDigits = value;
    }

    /**
     * Gets the value of the callingPartyNationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingPartyNationalTransformationCssName() {
        return callingPartyNationalTransformationCssName;
    }

    /**
     * Sets the value of the callingPartyNationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingPartyNationalTransformationCssName(XFkType value) {
        this.callingPartyNationalTransformationCssName = value;
    }

    /**
     * Gets the value of the callingPartyInternationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingPartyInternationalTransformationCssName() {
        return callingPartyInternationalTransformationCssName;
    }

    /**
     * Sets the value of the callingPartyInternationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingPartyInternationalTransformationCssName(XFkType value) {
        this.callingPartyInternationalTransformationCssName = value;
    }

    /**
     * Gets the value of the callingPartyUnknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingPartyUnknownTransformationCssName() {
        return callingPartyUnknownTransformationCssName;
    }

    /**
     * Sets the value of the callingPartyUnknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingPartyUnknownTransformationCssName(XFkType value) {
        this.callingPartyUnknownTransformationCssName = value;
    }

    /**
     * Gets the value of the callingPartySubscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingPartySubscriberTransformationCssName() {
        return callingPartySubscriberTransformationCssName;
    }

    /**
     * Sets the value of the callingPartySubscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingPartySubscriberTransformationCssName(XFkType value) {
        this.callingPartySubscriberTransformationCssName = value;
    }

    /**
     * Gets the value of the calledPartyNationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNationalPrefix() {
        return calledPartyNationalPrefix;
    }

    /**
     * Sets the value of the calledPartyNationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNationalPrefix(String value) {
        this.calledPartyNationalPrefix = value;
    }

    /**
     * Gets the value of the calledPartyInternationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyInternationalPrefix() {
        return calledPartyInternationalPrefix;
    }

    /**
     * Sets the value of the calledPartyInternationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyInternationalPrefix(String value) {
        this.calledPartyInternationalPrefix = value;
    }

    /**
     * Gets the value of the calledPartyUnknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyUnknownPrefix() {
        return calledPartyUnknownPrefix;
    }

    /**
     * Sets the value of the calledPartyUnknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyUnknownPrefix(String value) {
        this.calledPartyUnknownPrefix = value;
    }

    /**
     * Gets the value of the calledPartySubscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartySubscriberPrefix() {
        return calledPartySubscriberPrefix;
    }

    /**
     * Sets the value of the calledPartySubscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartySubscriberPrefix(String value) {
        this.calledPartySubscriberPrefix = value;
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
     * Gets the value of the useDevicePoolCalledCssNatl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssNatl() {
        return useDevicePoolCalledCssNatl;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssNatl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssNatl(String value) {
        this.useDevicePoolCalledCssNatl = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssIntl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssIntl() {
        return useDevicePoolCalledCssIntl;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssIntl(String value) {
        this.useDevicePoolCalledCssIntl = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssUnkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssUnkn() {
        return useDevicePoolCalledCssUnkn;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssUnkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssUnkn(String value) {
        this.useDevicePoolCalledCssUnkn = value;
    }

    /**
     * Gets the value of the useDevicePoolCalledCssSubs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDevicePoolCalledCssSubs() {
        return useDevicePoolCalledCssSubs;
    }

    /**
     * Sets the value of the useDevicePoolCalledCssSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDevicePoolCalledCssSubs(String value) {
        this.useDevicePoolCalledCssSubs = value;
    }

    /**
     * Gets the value of the calledPartyNationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNationalStripDigits() {
        return calledPartyNationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyNationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNationalStripDigits(String value) {
        this.calledPartyNationalStripDigits = value;
    }

    /**
     * Gets the value of the calledPartyInternationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyInternationalStripDigits() {
        return calledPartyInternationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyInternationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyInternationalStripDigits(String value) {
        this.calledPartyInternationalStripDigits = value;
    }

    /**
     * Gets the value of the calledPartyUnknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyUnknownStripDigits() {
        return calledPartyUnknownStripDigits;
    }

    /**
     * Sets the value of the calledPartyUnknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyUnknownStripDigits(String value) {
        this.calledPartyUnknownStripDigits = value;
    }

    /**
     * Gets the value of the calledPartySubscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartySubscriberStripDigits() {
        return calledPartySubscriberStripDigits;
    }

    /**
     * Sets the value of the calledPartySubscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartySubscriberStripDigits(String value) {
        this.calledPartySubscriberStripDigits = value;
    }

    /**
     * Gets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCalledPartyNationalTransformationCssName() {
        return calledPartyNationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCalledPartyNationalTransformationCssName(XFkType value) {
        this.calledPartyNationalTransformationCssName = value;
    }

    /**
     * Gets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCalledPartyInternationalTransformationCssName() {
        return calledPartyInternationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCalledPartyInternationalTransformationCssName(XFkType value) {
        this.calledPartyInternationalTransformationCssName = value;
    }

    /**
     * Gets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCalledPartyUnknownTransformationCssName() {
        return calledPartyUnknownTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCalledPartyUnknownTransformationCssName(XFkType value) {
        this.calledPartyUnknownTransformationCssName = value;
    }

    /**
     * Gets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCalledPartySubscriberTransformationCssName() {
        return calledPartySubscriberTransformationCssName;
    }

    /**
     * Sets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCalledPartySubscriberTransformationCssName(XFkType value) {
        this.calledPartySubscriberTransformationCssName = value;
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
     *         &lt;element name="gateKeeper" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
     *         &lt;element name="terminalType" type="{http://www.cisco.com/AXL/API/8.0}XTerminal" minOccurs="0"/>
     *         &lt;element name="technologyPrefix" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
     *         &lt;element name="zone" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
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
        "gateKeeper",
        "terminalType",
        "technologyPrefix",
        "zone"
    })
    public static class GateKeeperInfo {

        protected XFkType gateKeeper;
        protected String terminalType;
        protected String technologyPrefix;
        protected String zone;

        /**
         * Gets the value of the gateKeeper property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getGateKeeper() {
            return gateKeeper;
        }

        /**
         * Sets the value of the gateKeeper property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setGateKeeper(XFkType value) {
            this.gateKeeper = value;
        }

        /**
         * Gets the value of the terminalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminalType() {
            return terminalType;
        }

        /**
         * Sets the value of the terminalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminalType(String value) {
            this.terminalType = value;
        }

        /**
         * Gets the value of the technologyPrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnologyPrefix() {
            return technologyPrefix;
        }

        /**
         * Sets the value of the technologyPrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnologyPrefix(String value) {
            this.technologyPrefix = value;
        }

        /**
         * Gets the value of the zone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZone() {
            return zone;
        }

        /**
         * Sets the value of the zone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZone(String value) {
            this.zone = value;
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
     *         &lt;element name="server1" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
     *         &lt;element name="server2" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
     *         &lt;element name="server3" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
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
        "server1",
        "server2",
        "server3"
    })
    public static class RemoteServerinfo {

        protected String server1;
        protected String server2;
        protected String server3;

        /**
         * Gets the value of the server1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServer1() {
            return server1;
        }

        /**
         * Sets the value of the server1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServer1(String value) {
            this.server1 = value;
        }

        /**
         * Gets the value of the server2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServer2() {
            return server2;
        }

        /**
         * Sets the value of the server2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServer2(String value) {
            this.server2 = value;
        }

        /**
         * Gets the value of the server3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServer3() {
            return server3;
        }

        /**
         * Sets the value of the server3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServer3(String value) {
            this.server3 = value;
        }

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
