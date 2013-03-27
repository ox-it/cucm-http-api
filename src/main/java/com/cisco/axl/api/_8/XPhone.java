
package com.cisco.axl.api._8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XPhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XPhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XProduct"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/8.0}XClass"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/8.0}XDeviceProtocol"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/8.0}XProtocolSide"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="commonPhoneConfigName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/8.0}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.0}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.0}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/8.0}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/8.0}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="versionStamp" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="traceFlag" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/8.0}XPreemption" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.0}XStatus"/>
 *         &lt;element name="retryVideoCallAsAudio" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="securityProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="sipProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="sendGeoLocation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="line" type="{http://www.cisco.com/AXL/API/8.0}XPhoneLine" maxOccurs="unbounded"/>
 *                   &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/8.0}XNumplanIdentifier" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="speeddials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="speeddial" type="{http://www.cisco.com/AXL/API/8.0}XSpeeddial" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="busyLampFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="busyLampField" type="{http://www.cisco.com/AXL/API/8.0}XBusyLampField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primaryPhoneName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="ringSettingIdleBlfAudibleAlert" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="ringSettingBusyBlfAudibleAlert" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="blfDirectedCallParks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/8.0}XBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addOnModules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/8.0}XAddOnModule" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userlocale" type="{http://www.cisco.com/AXL/API/8.0}XUserLocale" minOccurs="0"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/8.0}XCountry" minOccurs="0"/>
 *         &lt;element name="idleTimeout" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="authenticationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directoryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idleUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messagesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyServerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="service" type="{http://www.cisco.com/AXL/API/8.0}XSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="defaultProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="enableExtensionMobility" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/8.0}XBarge" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="builtInBridgeStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus"/>
 *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="hlogStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="ownerUserName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="ignorePresentationIndicators" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/8.0}XPacketCaptureMode"/>
 *         &lt;element name="packetCaptureDuration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="rerouteCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="allowCtiControlFlag" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="requireDtmfReception" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="rfc2833Disabled" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="certificateOperation" type="{http://www.cisco.com/AXL/API/8.0}XCertificateOperation"/>
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/8.0}XAuthenticationMode" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/8.0}XKeySize" minOccurs="0"/>
 *         &lt;element name="authenticationString" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="upgradeFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceMobilityMode" type="{http://www.cisco.com/AXL/API/8.0}XStatus"/>
 *         &lt;element name="remoteDevice" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/8.0}XDNDOption" minOccurs="0"/>
 *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/8.0}XRingSetting" minOccurs="0"/>
 *         &lt;element name="dndStatus" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="isDualMode" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mobilityUserIdName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="phoneSuite" type="{http://www.cisco.com/AXL/API/8.0}XPhonePersonalization" minOccurs="0"/>
 *         &lt;element name="phoneServiceDisplay" type="{http://www.cisco.com/AXL/API/8.0}XPhoneServiceDisplay" minOccurs="0"/>
 *         &lt;element name="isProtected" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mobileSmartClientProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="mtpRequired" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mtpPreferedCodec" type="{http://www.cisco.com/AXL/API/8.0}XSIPCodec" minOccurs="0"/>
 *         &lt;element name="dialRulesName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="sshUserId" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="sshPwd" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="digestUser" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="outboundCallRollover" type="{http://www.cisco.com/AXL/API/8.0}XOutboundCallRollover" minOccurs="0"/>
 *         &lt;element name="hotlineDevice" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="secureInformationUrl" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="secureDirectoryUrl" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="secureMessageUrl" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="secureServicesUrl" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="secureAuthenticationUrl" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="secureIdleUrl" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XPhone", propOrder = {
    "name",
    "description",
    "product",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "commonPhoneConfigName",
    "networkLocation",
    "locationName",
    "mediaResourceListName",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "loadInformation",
    "vendorConfig",
    "versionStamp",
    "traceFlag",
    "mlppDomainId",
    "mlppIndicationStatus",
    "preemption",
    "useTrustedRelayPoint",
    "retryVideoCallAsAudio",
    "securityProfileName",
    "sipProfileName",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "geoLocationFilterName",
    "sendGeoLocation",
    "lines",
    "phoneTemplateName",
    "speeddials",
    "busyLampFields",
    "primaryPhoneName",
    "ringSettingIdleBlfAudibleAlert",
    "ringSettingBusyBlfAudibleAlert",
    "blfDirectedCallParks",
    "addOnModules",
    "userlocale",
    "networkLocale",
    "idleTimeout",
    "authenticationUrl",
    "directoryUrl",
    "idleUrl",
    "informationUrl",
    "messagesUrl",
    "proxyServerUrl",
    "servicesUrl",
    "services",
    "softkeyTemplateName",
    "defaultProfileName",
    "enableExtensionMobility",
    "singleButtonBarge",
    "joinAcrossLines",
    "builtInBridgeStatus",
    "callInfoPrivacyStatus",
    "hlogStatus",
    "ownerUserName",
    "ignorePresentationIndicators",
    "packetCaptureMode",
    "packetCaptureDuration",
    "subscribeCallingSearchSpaceName",
    "rerouteCallingSearchSpaceName",
    "allowCtiControlFlag",
    "presenceGroupName",
    "unattendedPort",
    "requireDtmfReception",
    "rfc2833Disabled",
    "certificateOperation",
    "authenticationMode",
    "keySize",
    "authenticationString",
    "upgradeFinishTime",
    "deviceMobilityMode",
    "remoteDevice",
    "dndOption",
    "dndRingSetting",
    "dndStatus",
    "isActive",
    "isDualMode",
    "mobilityUserIdName",
    "phoneSuite",
    "phoneServiceDisplay",
    "isProtected",
    "mobileSmartClientProfileName",
    "mtpRequired",
    "mtpPreferedCodec",
    "dialRulesName",
    "sshUserId",
    "sshPwd",
    "digestUser",
    "outboundCallRollover",
    "hotlineDevice",
    "secureInformationUrl",
    "secureDirectoryUrl",
    "secureMessageUrl",
    "secureServicesUrl",
    "secureAuthenticationUrl",
    "secureIdleUrl",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage"
})
public class XPhone {

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
    protected XFkType commonPhoneConfigName;
    @XmlElement(defaultValue = "Use System Default")
    protected String networkLocation;
    protected XFkType locationName;
    @XmlElementRef(name = "mediaResourceListName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mediaResourceListName;
    @XmlElementRef(name = "networkHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> networkHoldMohAudioSourceId;
    @XmlElementRef(name = "userHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> userHoldMohAudioSourceId;
    @XmlElementRef(name = "automatedAlternateRoutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> automatedAlternateRoutingCssName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    @XmlElementRef(name = "loadInformation", type = JAXBElement.class)
    protected JAXBElement<XLoadInformation> loadInformation;
    protected XVendorConfig vendorConfig;
    @XmlElementRef(name = "versionStamp", type = JAXBElement.class)
    protected JAXBElement<String> versionStamp;
    protected String traceFlag;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<Integer> mlppDomainId;
    @XmlElement(defaultValue = "Off")
    protected String mlppIndicationStatus;
    @XmlElement(defaultValue = "Default")
    protected String preemption;
    @XmlElement(defaultValue = "Default")
    protected String useTrustedRelayPoint;
    @XmlElement(defaultValue = "true")
    protected String retryVideoCallAsAudio;
    @XmlElementRef(name = "securityProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> securityProfileName;
    @XmlElementRef(name = "sipProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> sipProfileName;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCss;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationName;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationFilterName;
    protected String sendGeoLocation;
    protected XPhone.Lines lines;
    @XmlElementRef(name = "phoneTemplateName", type = JAXBElement.class)
    protected JAXBElement<XFkType> phoneTemplateName;
    protected XPhone.Speeddials speeddials;
    protected XPhone.BusyLampFields busyLampFields;
    @XmlElementRef(name = "primaryPhoneName", type = JAXBElement.class)
    protected JAXBElement<XFkType> primaryPhoneName;
    @XmlElement(defaultValue = "Default")
    protected String ringSettingIdleBlfAudibleAlert;
    @XmlElement(defaultValue = "Default")
    protected String ringSettingBusyBlfAudibleAlert;
    protected XPhone.BlfDirectedCallParks blfDirectedCallParks;
    protected XPhone.AddOnModules addOnModules;
    @XmlElementRef(name = "userlocale", type = JAXBElement.class)
    protected JAXBElement<String> userlocale;
    @XmlElementRef(name = "networkLocale", type = JAXBElement.class)
    protected JAXBElement<String> networkLocale;
    @XmlElementRef(name = "idleTimeout", type = JAXBElement.class)
    protected JAXBElement<String> idleTimeout;
    protected String authenticationUrl;
    protected String directoryUrl;
    protected String idleUrl;
    protected String informationUrl;
    protected String messagesUrl;
    protected String proxyServerUrl;
    protected String servicesUrl;
    protected XPhone.Services services;
    @XmlElementRef(name = "softkeyTemplateName", type = JAXBElement.class)
    protected JAXBElement<XFkType> softkeyTemplateName;
    @XmlElementRef(name = "defaultProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> defaultProfileName;
    protected String enableExtensionMobility;
    @XmlElement(defaultValue = "Default")
    protected String singleButtonBarge;
    @XmlElement(defaultValue = "Default")
    protected String joinAcrossLines;
    @XmlElement(defaultValue = "Default")
    protected String builtInBridgeStatus;
    @XmlElement(defaultValue = "Default")
    protected String callInfoPrivacyStatus;
    protected String hlogStatus;
    @XmlElementRef(name = "ownerUserName", type = JAXBElement.class)
    protected JAXBElement<XFkType> ownerUserName;
    @XmlElement(defaultValue = "false")
    protected String ignorePresentationIndicators;
    @XmlElement(defaultValue = "None")
    protected String packetCaptureMode;
    @XmlElementRef(name = "packetCaptureDuration", type = JAXBElement.class)
    protected JAXBElement<String> packetCaptureDuration;
    @XmlElementRef(name = "subscribeCallingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> subscribeCallingSearchSpaceName;
    @XmlElementRef(name = "rerouteCallingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> rerouteCallingSearchSpaceName;
    protected String allowCtiControlFlag;
    protected XFkType presenceGroupName;
    @XmlElement(defaultValue = "false")
    protected String unattendedPort;
    @XmlElement(defaultValue = "false")
    protected String requireDtmfReception;
    @XmlElement(defaultValue = "false")
    protected String rfc2833Disabled;
    @XmlElement(defaultValue = "No Pending Operation")
    protected String certificateOperation;
    @XmlElement(defaultValue = "By Null String")
    protected String authenticationMode;
    @XmlElement(defaultValue = "1024")
    protected String keySize;
    protected String authenticationString;
    protected String upgradeFinishTime;
    @XmlElement(defaultValue = "Default")
    protected String deviceMobilityMode;
    @XmlElement(defaultValue = "false")
    protected String remoteDevice;
    @XmlElement(defaultValue = "Ringer Off")
    protected String dndOption;
    @XmlElementRef(name = "dndRingSetting", type = JAXBElement.class)
    protected JAXBElement<String> dndRingSetting;
    protected String dndStatus;
    @XmlElement(defaultValue = "true")
    protected String isActive;
    protected String isDualMode;
    @XmlElementRef(name = "mobilityUserIdName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mobilityUserIdName;
    @XmlElement(defaultValue = "Default")
    protected String phoneSuite;
    @XmlElement(defaultValue = "Default")
    protected String phoneServiceDisplay;
    @XmlElement(defaultValue = "false")
    protected String isProtected;
    @XmlElementRef(name = "mobileSmartClientProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mobileSmartClientProfileName;
    protected String mtpRequired;
    @XmlElement(defaultValue = "711ulaw")
    protected String mtpPreferedCodec;
    @XmlElementRef(name = "dialRulesName", type = JAXBElement.class)
    protected JAXBElement<XFkType> dialRulesName;
    protected String sshUserId;
    protected String sshPwd;
    protected String digestUser;
    @XmlElement(defaultValue = "No Rollover")
    protected String outboundCallRollover;
    @XmlElement(defaultValue = "false")
    protected String hotlineDevice;
    protected String secureInformationUrl;
    protected String secureDirectoryUrl;
    protected String secureMessageUrl;
    protected String secureServicesUrl;
    protected String secureAuthenticationUrl;
    protected String secureIdleUrl;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLine;
    @XmlElement(defaultValue = "Default")
    protected String alwaysUsePrimeLineForVoiceMessage;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;

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
     * Gets the value of the commonPhoneConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCommonPhoneConfigName() {
        return commonPhoneConfigName;
    }

    /**
     * Sets the value of the commonPhoneConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCommonPhoneConfigName(XFkType value) {
        this.commonPhoneConfigName = value;
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
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkHoldMohAudioSourceId(JAXBElement<String> value) {
        this.networkHoldMohAudioSourceId = ((JAXBElement<String> ) value);
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
     * Gets the value of the versionStamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersionStamp() {
        return versionStamp;
    }

    /**
     * Sets the value of the versionStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersionStamp(JAXBElement<String> value) {
        this.versionStamp = ((JAXBElement<String> ) value);
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
     * Gets the value of the securityProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * Sets the value of the securityProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSecurityProfileName(JAXBElement<XFkType> value) {
        this.securityProfileName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the sipProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSipProfileName() {
        return sipProfileName;
    }

    /**
     * Sets the value of the sipProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSipProfileName(JAXBElement<XFkType> value) {
        this.sipProfileName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone.Lines }
     *     
     */
    public XPhone.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone.Lines }
     *     
     */
    public void setLines(XPhone.Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the phoneTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPhoneTemplateName() {
        return phoneTemplateName;
    }

    /**
     * Sets the value of the phoneTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPhoneTemplateName(JAXBElement<XFkType> value) {
        this.phoneTemplateName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the speeddials property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone.Speeddials }
     *     
     */
    public XPhone.Speeddials getSpeeddials() {
        return speeddials;
    }

    /**
     * Sets the value of the speeddials property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone.Speeddials }
     *     
     */
    public void setSpeeddials(XPhone.Speeddials value) {
        this.speeddials = value;
    }

    /**
     * Gets the value of the busyLampFields property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone.BusyLampFields }
     *     
     */
    public XPhone.BusyLampFields getBusyLampFields() {
        return busyLampFields;
    }

    /**
     * Sets the value of the busyLampFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone.BusyLampFields }
     *     
     */
    public void setBusyLampFields(XPhone.BusyLampFields value) {
        this.busyLampFields = value;
    }

    /**
     * Gets the value of the primaryPhoneName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPrimaryPhoneName() {
        return primaryPhoneName;
    }

    /**
     * Sets the value of the primaryPhoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPrimaryPhoneName(JAXBElement<XFkType> value) {
        this.primaryPhoneName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the ringSettingIdleBlfAudibleAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSettingIdleBlfAudibleAlert() {
        return ringSettingIdleBlfAudibleAlert;
    }

    /**
     * Sets the value of the ringSettingIdleBlfAudibleAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSettingIdleBlfAudibleAlert(String value) {
        this.ringSettingIdleBlfAudibleAlert = value;
    }

    /**
     * Gets the value of the ringSettingBusyBlfAudibleAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSettingBusyBlfAudibleAlert() {
        return ringSettingBusyBlfAudibleAlert;
    }

    /**
     * Sets the value of the ringSettingBusyBlfAudibleAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSettingBusyBlfAudibleAlert(String value) {
        this.ringSettingBusyBlfAudibleAlert = value;
    }

    /**
     * Gets the value of the blfDirectedCallParks property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone.BlfDirectedCallParks }
     *     
     */
    public XPhone.BlfDirectedCallParks getBlfDirectedCallParks() {
        return blfDirectedCallParks;
    }

    /**
     * Sets the value of the blfDirectedCallParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone.BlfDirectedCallParks }
     *     
     */
    public void setBlfDirectedCallParks(XPhone.BlfDirectedCallParks value) {
        this.blfDirectedCallParks = value;
    }

    /**
     * Gets the value of the addOnModules property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone.AddOnModules }
     *     
     */
    public XPhone.AddOnModules getAddOnModules() {
        return addOnModules;
    }

    /**
     * Sets the value of the addOnModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone.AddOnModules }
     *     
     */
    public void setAddOnModules(XPhone.AddOnModules value) {
        this.addOnModules = value;
    }

    /**
     * Gets the value of the userlocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserlocale() {
        return userlocale;
    }

    /**
     * Sets the value of the userlocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserlocale(JAXBElement<String> value) {
        this.userlocale = ((JAXBElement<String> ) value);
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
     * Gets the value of the idleTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * Sets the value of the idleTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdleTimeout(JAXBElement<String> value) {
        this.idleTimeout = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the authenticationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    /**
     * Sets the value of the authenticationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationUrl(String value) {
        this.authenticationUrl = value;
    }

    /**
     * Gets the value of the directoryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryUrl() {
        return directoryUrl;
    }

    /**
     * Sets the value of the directoryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryUrl(String value) {
        this.directoryUrl = value;
    }

    /**
     * Gets the value of the idleUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleUrl() {
        return idleUrl;
    }

    /**
     * Sets the value of the idleUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleUrl(String value) {
        this.idleUrl = value;
    }

    /**
     * Gets the value of the informationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationUrl() {
        return informationUrl;
    }

    /**
     * Sets the value of the informationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationUrl(String value) {
        this.informationUrl = value;
    }

    /**
     * Gets the value of the messagesUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagesUrl() {
        return messagesUrl;
    }

    /**
     * Sets the value of the messagesUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagesUrl(String value) {
        this.messagesUrl = value;
    }

    /**
     * Gets the value of the proxyServerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyServerUrl() {
        return proxyServerUrl;
    }

    /**
     * Sets the value of the proxyServerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyServerUrl(String value) {
        this.proxyServerUrl = value;
    }

    /**
     * Gets the value of the servicesUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesUrl() {
        return servicesUrl;
    }

    /**
     * Sets the value of the servicesUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicesUrl(String value) {
        this.servicesUrl = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone.Services }
     *     
     */
    public XPhone.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone.Services }
     *     
     */
    public void setServices(XPhone.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSoftkeyTemplateName(JAXBElement<XFkType> value) {
        this.softkeyTemplateName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the defaultProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDefaultProfileName() {
        return defaultProfileName;
    }

    /**
     * Sets the value of the defaultProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDefaultProfileName(JAXBElement<XFkType> value) {
        this.defaultProfileName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the enableExtensionMobility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableExtensionMobility() {
        return enableExtensionMobility;
    }

    /**
     * Sets the value of the enableExtensionMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableExtensionMobility(String value) {
        this.enableExtensionMobility = value;
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
     * Gets the value of the builtInBridgeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuiltInBridgeStatus() {
        return builtInBridgeStatus;
    }

    /**
     * Sets the value of the builtInBridgeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuiltInBridgeStatus(String value) {
        this.builtInBridgeStatus = value;
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
     * Gets the value of the hlogStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHlogStatus() {
        return hlogStatus;
    }

    /**
     * Sets the value of the hlogStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHlogStatus(String value) {
        this.hlogStatus = value;
    }

    /**
     * Gets the value of the ownerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getOwnerUserName() {
        return ownerUserName;
    }

    /**
     * Sets the value of the ownerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setOwnerUserName(JAXBElement<XFkType> value) {
        this.ownerUserName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSubscribeCallingSearchSpaceName() {
        return subscribeCallingSearchSpaceName;
    }

    /**
     * Sets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSubscribeCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.subscribeCallingSearchSpaceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the rerouteCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRerouteCallingSearchSpaceName() {
        return rerouteCallingSearchSpaceName;
    }

    /**
     * Sets the value of the rerouteCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRerouteCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.rerouteCallingSearchSpaceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the allowCtiControlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowCtiControlFlag() {
        return allowCtiControlFlag;
    }

    /**
     * Sets the value of the allowCtiControlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowCtiControlFlag(String value) {
        this.allowCtiControlFlag = value;
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
     * Gets the value of the requireDtmfReception property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireDtmfReception() {
        return requireDtmfReception;
    }

    /**
     * Sets the value of the requireDtmfReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireDtmfReception(String value) {
        this.requireDtmfReception = value;
    }

    /**
     * Gets the value of the rfc2833Disabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc2833Disabled() {
        return rfc2833Disabled;
    }

    /**
     * Sets the value of the rfc2833Disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc2833Disabled(String value) {
        this.rfc2833Disabled = value;
    }

    /**
     * Gets the value of the certificateOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateOperation() {
        return certificateOperation;
    }

    /**
     * Sets the value of the certificateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateOperation(String value) {
        this.certificateOperation = value;
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMode(String value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySize(String value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the authenticationString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationString() {
        return authenticationString;
    }

    /**
     * Sets the value of the authenticationString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationString(String value) {
        this.authenticationString = value;
    }

    /**
     * Gets the value of the upgradeFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeFinishTime() {
        return upgradeFinishTime;
    }

    /**
     * Sets the value of the upgradeFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeFinishTime(String value) {
        this.upgradeFinishTime = value;
    }

    /**
     * Gets the value of the deviceMobilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMobilityMode() {
        return deviceMobilityMode;
    }

    /**
     * Sets the value of the deviceMobilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMobilityMode(String value) {
        this.deviceMobilityMode = value;
    }

    /**
     * Gets the value of the remoteDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDevice() {
        return remoteDevice;
    }

    /**
     * Sets the value of the remoteDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDevice(String value) {
        this.remoteDevice = value;
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
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDualMode() {
        return isDualMode;
    }

    /**
     * Sets the value of the isDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDualMode(String value) {
        this.isDualMode = value;
    }

    /**
     * Gets the value of the mobilityUserIdName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMobilityUserIdName() {
        return mobilityUserIdName;
    }

    /**
     * Sets the value of the mobilityUserIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMobilityUserIdName(JAXBElement<XFkType> value) {
        this.mobilityUserIdName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the phoneSuite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneSuite() {
        return phoneSuite;
    }

    /**
     * Sets the value of the phoneSuite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneSuite(String value) {
        this.phoneSuite = value;
    }

    /**
     * Gets the value of the phoneServiceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneServiceDisplay() {
        return phoneServiceDisplay;
    }

    /**
     * Sets the value of the phoneServiceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneServiceDisplay(String value) {
        this.phoneServiceDisplay = value;
    }

    /**
     * Gets the value of the isProtected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsProtected() {
        return isProtected;
    }

    /**
     * Sets the value of the isProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsProtected(String value) {
        this.isProtected = value;
    }

    /**
     * Gets the value of the mobileSmartClientProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMobileSmartClientProfileName() {
        return mobileSmartClientProfileName;
    }

    /**
     * Sets the value of the mobileSmartClientProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMobileSmartClientProfileName(JAXBElement<XFkType> value) {
        this.mobileSmartClientProfileName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the mtpPreferedCodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtpPreferedCodec() {
        return mtpPreferedCodec;
    }

    /**
     * Sets the value of the mtpPreferedCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtpPreferedCodec(String value) {
        this.mtpPreferedCodec = value;
    }

    /**
     * Gets the value of the dialRulesName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDialRulesName() {
        return dialRulesName;
    }

    /**
     * Sets the value of the dialRulesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDialRulesName(JAXBElement<XFkType> value) {
        this.dialRulesName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the sshUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSshUserId() {
        return sshUserId;
    }

    /**
     * Sets the value of the sshUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSshUserId(String value) {
        this.sshUserId = value;
    }

    /**
     * Gets the value of the sshPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSshPwd() {
        return sshPwd;
    }

    /**
     * Sets the value of the sshPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSshPwd(String value) {
        this.sshPwd = value;
    }

    /**
     * Gets the value of the digestUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestUser() {
        return digestUser;
    }

    /**
     * Sets the value of the digestUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestUser(String value) {
        this.digestUser = value;
    }

    /**
     * Gets the value of the outboundCallRollover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundCallRollover() {
        return outboundCallRollover;
    }

    /**
     * Sets the value of the outboundCallRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundCallRollover(String value) {
        this.outboundCallRollover = value;
    }

    /**
     * Gets the value of the hotlineDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotlineDevice() {
        return hotlineDevice;
    }

    /**
     * Sets the value of the hotlineDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotlineDevice(String value) {
        this.hotlineDevice = value;
    }

    /**
     * Gets the value of the secureInformationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureInformationUrl() {
        return secureInformationUrl;
    }

    /**
     * Sets the value of the secureInformationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureInformationUrl(String value) {
        this.secureInformationUrl = value;
    }

    /**
     * Gets the value of the secureDirectoryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureDirectoryUrl() {
        return secureDirectoryUrl;
    }

    /**
     * Sets the value of the secureDirectoryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureDirectoryUrl(String value) {
        this.secureDirectoryUrl = value;
    }

    /**
     * Gets the value of the secureMessageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureMessageUrl() {
        return secureMessageUrl;
    }

    /**
     * Sets the value of the secureMessageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureMessageUrl(String value) {
        this.secureMessageUrl = value;
    }

    /**
     * Gets the value of the secureServicesUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureServicesUrl() {
        return secureServicesUrl;
    }

    /**
     * Sets the value of the secureServicesUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureServicesUrl(String value) {
        this.secureServicesUrl = value;
    }

    /**
     * Gets the value of the secureAuthenticationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureAuthenticationUrl() {
        return secureAuthenticationUrl;
    }

    /**
     * Sets the value of the secureAuthenticationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureAuthenticationUrl(String value) {
        this.secureAuthenticationUrl = value;
    }

    /**
     * Gets the value of the secureIdleUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureIdleUrl() {
        return secureIdleUrl;
    }

    /**
     * Sets the value of the secureIdleUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureIdleUrl(String value) {
        this.secureIdleUrl = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/8.0}XAddOnModule" maxOccurs="3" minOccurs="0"/>
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
        "addOnModule"
    })
    public static class AddOnModules {

        protected List<XAddOnModule> addOnModule;

        /**
         * Gets the value of the addOnModule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addOnModule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddOnModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XAddOnModule }
         * 
         * 
         */
        public List<XAddOnModule> getAddOnModule() {
            if (addOnModule == null) {
                addOnModule = new ArrayList<XAddOnModule>();
            }
            return this.addOnModule;
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
     *         &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/8.0}XBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
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
        "blfDirectedCallPark"
    })
    public static class BlfDirectedCallParks {

        protected List<XBLFDirectedCallPark> blfDirectedCallPark;

        /**
         * Gets the value of the blfDirectedCallPark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blfDirectedCallPark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlfDirectedCallPark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XBLFDirectedCallPark }
         * 
         * 
         */
        public List<XBLFDirectedCallPark> getBlfDirectedCallPark() {
            if (blfDirectedCallPark == null) {
                blfDirectedCallPark = new ArrayList<XBLFDirectedCallPark>();
            }
            return this.blfDirectedCallPark;
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
     *         &lt;element name="busyLampField" type="{http://www.cisco.com/AXL/API/8.0}XBusyLampField" maxOccurs="unbounded" minOccurs="0"/>
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
        "busyLampField"
    })
    public static class BusyLampFields {

        protected List<XBusyLampField> busyLampField;

        /**
         * Gets the value of the busyLampField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the busyLampField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusyLampField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XBusyLampField }
         * 
         * 
         */
        public List<XBusyLampField> getBusyLampField() {
            if (busyLampField == null) {
                busyLampField = new ArrayList<XBusyLampField>();
            }
            return this.busyLampField;
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
     *       &lt;choice>
     *         &lt;element name="line" type="{http://www.cisco.com/AXL/API/8.0}XPhoneLine" maxOccurs="unbounded"/>
     *         &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/8.0}XNumplanIdentifier" maxOccurs="unbounded"/>
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
        "line",
        "lineIdentifier"
    })
    public static class Lines {

        protected List<XPhoneLine> line;
        protected List<XNumplanIdentifier> lineIdentifier;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPhoneLine }
         * 
         * 
         */
        public List<XPhoneLine> getLine() {
            if (line == null) {
                line = new ArrayList<XPhoneLine>();
            }
            return this.line;
        }

        /**
         * Gets the value of the lineIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XNumplanIdentifier }
         * 
         * 
         */
        public List<XNumplanIdentifier> getLineIdentifier() {
            if (lineIdentifier == null) {
                lineIdentifier = new ArrayList<XNumplanIdentifier>();
            }
            return this.lineIdentifier;
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
     *         &lt;element name="service" type="{http://www.cisco.com/AXL/API/8.0}XSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
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
        "service"
    })
    public static class Services {

        protected List<XSubscribedService> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSubscribedService }
         * 
         * 
         */
        public List<XSubscribedService> getService() {
            if (service == null) {
                service = new ArrayList<XSubscribedService>();
            }
            return this.service;
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
     *         &lt;element name="speeddial" type="{http://www.cisco.com/AXL/API/8.0}XSpeeddial" maxOccurs="unbounded" minOccurs="0"/>
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
        "speeddial"
    })
    public static class Speeddials {

        protected List<XSpeeddial> speeddial;

        /**
         * Gets the value of the speeddial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the speeddial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpeeddial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSpeeddial }
         * 
         * 
         */
        public List<XSpeeddial> getSpeeddial() {
            if (speeddial == null) {
                speeddial = new ArrayList<XSpeeddial>();
            }
            return this.speeddial;
        }

    }

}
