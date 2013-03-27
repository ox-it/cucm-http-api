
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCiscoCatalyst6000T1VoIPGatewayT1Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCiscoCatalyst6000T1VoIPGatewayT1Req">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/8.0}XNetworkLocation" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/8.0}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/8.0}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="traceFlag" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="retryVideoCallAsAudio" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="sendGeoLocation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="ports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XT1Port" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trunkSelectionOrder" type="{http://www.cisco.com/AXL/API/8.0}XTrunkSelectionOrder" minOccurs="0"/>
 *         &lt;element name="clockReference" type="{http://www.cisco.com/AXL/API/8.0}XClockReference" minOccurs="0"/>
 *         &lt;element name="csuParam" type="{http://www.cisco.com/AXL/API/8.0}XCSUParam" minOccurs="0"/>
 *         &lt;element name="digitSending" type="{http://www.cisco.com/AXL/API/8.0}XDigitSending" minOccurs="0"/>
 *         &lt;element name="pcmType" type="{http://www.cisco.com/AXL/API/8.0}XEncode" minOccurs="0"/>
 *         &lt;element name="fdlChannel" type="{http://www.cisco.com/AXL/API/8.0}XFDLChannel" minOccurs="0"/>
 *         &lt;element name="yellowAlarm" type="{http://www.cisco.com/AXL/API/8.0}XYellowAlarm" minOccurs="0"/>
 *         &lt;element name="zeroSupression" type="{http://www.cisco.com/AXL/API/8.0}XZeroSuppression" minOccurs="0"/>
 *         &lt;element name="smdiBasePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="handleDtmfPrecedenceSignals" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCdpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="imeE164TransformationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCiscoCatalyst6000T1VoIPGatewayT1Req", propOrder = {
    "newName",
    "description",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "networkLocation",
    "locationName",
    "mediaResourceListName",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "loadInformation",
    "vendorConfig",
    "traceFlag",
    "mlppDomainId",
    "mlppIndicationStatus",
    "useTrustedRelayPoint",
    "retryVideoCallAsAudio",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "sendGeoLocation",
    "ports",
    "trunkSelectionOrder",
    "clockReference",
    "csuParam",
    "digitSending",
    "pcmType",
    "fdlChannel",
    "yellowAlarm",
    "zeroSupression",
    "smdiBasePort",
    "handleDtmfPrecedenceSignals",
    "cdpnTransformationCssName",
    "useDevicePoolCdpnTransformCss",
    "geoLocationFilterName",
    "pstnAccess",
    "imeE164TransformationName"
})
public class UpdateCiscoCatalyst6000T1VoIPGatewayT1Req
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    @XmlElementRef(name = "callingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceName;
    @XmlElementRef(name = "devicePoolName", type = JAXBElement.class)
    protected JAXBElement<XFkType> devicePoolName;
    @XmlElementRef(name = "commonDeviceConfigName", type = JAXBElement.class)
    protected JAXBElement<XFkType> commonDeviceConfigName;
    @XmlElement(defaultValue = "Use System Default")
    protected String networkLocation;
    protected XFkType locationName;
    @XmlElementRef(name = "mediaResourceListName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mediaResourceListName;
    @XmlElementRef(name = "automatedAlternateRoutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> automatedAlternateRoutingCssName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    @XmlElementRef(name = "loadInformation", type = JAXBElement.class)
    protected JAXBElement<XLoadInformation> loadInformation;
    protected XVendorConfig vendorConfig;
    protected String traceFlag;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<Integer> mlppDomainId;
    @XmlElement(defaultValue = "Off")
    protected String mlppIndicationStatus;
    @XmlElement(defaultValue = "Default")
    protected String useTrustedRelayPoint;
    @XmlElement(defaultValue = "true")
    protected String retryVideoCallAsAudio;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCgpnTransformCss;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationName;
    protected String sendGeoLocation;
    protected UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.Ports ports;
    protected String trunkSelectionOrder;
    protected String clockReference;
    protected String csuParam;
    @XmlElement(defaultValue = "DTMF")
    protected String digitSending;
    protected String pcmType;
    @XmlElement(defaultValue = "None")
    protected String fdlChannel;
    @XmlElement(defaultValue = "F-Bit")
    protected String yellowAlarm;
    @XmlElement(defaultValue = "B8ZS")
    protected String zeroSupression;
    @XmlElement(defaultValue = "0")
    protected String smdiBasePort;
    @XmlElement(defaultValue = "false")
    protected String handleDtmfPrecedenceSignals;
    @XmlElementRef(name = "cdpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cdpnTransformationCssName;
    @XmlElement(defaultValue = "true")
    protected String useDevicePoolCdpnTransformCss;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationFilterName;
    @XmlElement(defaultValue = "true")
    protected String pstnAccess;
    @XmlElementRef(name = "imeE164TransformationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> imeE164TransformationName;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.Ports }
     *     
     */
    public UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.Ports getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.Ports }
     *     
     */
    public void setPorts(UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.Ports value) {
        this.ports = value;
    }

    /**
     * Gets the value of the trunkSelectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkSelectionOrder() {
        return trunkSelectionOrder;
    }

    /**
     * Sets the value of the trunkSelectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkSelectionOrder(String value) {
        this.trunkSelectionOrder = value;
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
     * Gets the value of the digitSending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitSending() {
        return digitSending;
    }

    /**
     * Sets the value of the digitSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitSending(String value) {
        this.digitSending = value;
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
     * Gets the value of the fdlChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdlChannel() {
        return fdlChannel;
    }

    /**
     * Sets the value of the fdlChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdlChannel(String value) {
        this.fdlChannel = value;
    }

    /**
     * Gets the value of the yellowAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYellowAlarm() {
        return yellowAlarm;
    }

    /**
     * Sets the value of the yellowAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYellowAlarm(String value) {
        this.yellowAlarm = value;
    }

    /**
     * Gets the value of the zeroSupression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroSupression() {
        return zeroSupression;
    }

    /**
     * Sets the value of the zeroSupression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroSupression(String value) {
        this.zeroSupression = value;
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
     * Gets the value of the handleDtmfPrecedenceSignals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleDtmfPrecedenceSignals() {
        return handleDtmfPrecedenceSignals;
    }

    /**
     * Sets the value of the handleDtmfPrecedenceSignals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleDtmfPrecedenceSignals(String value) {
        this.handleDtmfPrecedenceSignals = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XT1Port" maxOccurs="unbounded"/>
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
        "port"
    })
    public static class Ports {

        protected List<XT1Port> port;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XT1Port }
         * 
         * 
         */
        public List<XT1Port> getPort() {
            if (port == null) {
                port = new ArrayList<XT1Port>();
            }
            return this.port;
        }

    }

}
