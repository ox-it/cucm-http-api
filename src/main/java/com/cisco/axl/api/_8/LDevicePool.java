
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LDevicePool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LDevicePool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString50" minOccurs="0"/>
 *         &lt;element name="autoSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="dateTimeSettingName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="callManagerGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="regionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/8.0}XCountry" minOccurs="0"/>
 *         &lt;element name="srstName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="connectionMonitorDuration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="mobilityCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="physicalLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="deviceMobilityGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="revertPriority" type="{http://www.cisco.com/AXL/API/8.0}XRevertPriority" minOccurs="0"/>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/8.0}XBarge" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="localRouteGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyNationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="callingPartyInternationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="callingPartyUnknownPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="callingPartySubscriberPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="adjunctCallingSearchSpace" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
 *         &lt;element name="calledPartyNationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="calledPartyNationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyInternationalTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyUnknownTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="calledPartySubscriberTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="imeEnrolledPatternGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
@XmlType(name = "LDevicePool", propOrder = {
    "name",
    "autoSearchSpaceName",
    "dateTimeSettingName",
    "callManagerGroupName",
    "mediaResourceListName",
    "regionName",
    "networkLocale",
    "srstName",
    "connectionMonitorDuration",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "locationName",
    "mobilityCssName",
    "physicalLocationName",
    "deviceMobilityGroupName",
    "revertPriority",
    "singleButtonBarge",
    "joinAcrossLines",
    "cgpnTransformationCssName",
    "cdpnTransformationCssName",
    "localRouteGroupName",
    "geoLocationName",
    "geoLocationFilterName",
    "callingPartyNationalPrefix",
    "callingPartyInternationalPrefix",
    "callingPartyUnknownPrefix",
    "callingPartySubscriberPrefix",
    "adjunctCallingSearchSpace",
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
    "calledPartyNationalStripDigits",
    "calledPartyInternationalStripDigits",
    "calledPartyUnknownStripDigits",
    "calledPartySubscriberStripDigits",
    "calledPartyNationalTransformationCssName",
    "calledPartyInternationalTransformationCssName",
    "calledPartyUnknownTransformationCssName",
    "calledPartySubscriberTransformationCssName",
    "imeEnrolledPatternGroupName"
})
public class LDevicePool {

    protected String name;
    protected XFkType autoSearchSpaceName;
    protected XFkType dateTimeSettingName;
    protected XFkType callManagerGroupName;
    protected XFkType mediaResourceListName;
    protected XFkType regionName;
    protected String networkLocale;
    protected XFkType srstName;
    protected String connectionMonitorDuration;
    protected XFkType automatedAlternateRoutingCssName;
    protected XFkType aarNeighborhoodName;
    protected XFkType locationName;
    protected XFkType mobilityCssName;
    protected XFkType physicalLocationName;
    protected XFkType deviceMobilityGroupName;
    protected String revertPriority;
    protected String singleButtonBarge;
    protected String joinAcrossLines;
    protected XFkType cgpnTransformationCssName;
    protected XFkType cdpnTransformationCssName;
    protected XFkType localRouteGroupName;
    protected XFkType geoLocationName;
    protected XFkType geoLocationFilterName;
    protected String callingPartyNationalPrefix;
    protected String callingPartyInternationalPrefix;
    protected String callingPartyUnknownPrefix;
    protected String callingPartySubscriberPrefix;
    protected XFkType adjunctCallingSearchSpace;
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
    protected String calledPartyNationalStripDigits;
    protected String calledPartyInternationalStripDigits;
    protected String calledPartyUnknownStripDigits;
    protected String calledPartySubscriberStripDigits;
    protected XFkType calledPartyNationalTransformationCssName;
    protected XFkType calledPartyInternationalTransformationCssName;
    protected XFkType calledPartyUnknownTransformationCssName;
    protected XFkType calledPartySubscriberTransformationCssName;
    protected XFkType imeEnrolledPatternGroupName;
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
     * Gets the value of the autoSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAutoSearchSpaceName() {
        return autoSearchSpaceName;
    }

    /**
     * Sets the value of the autoSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAutoSearchSpaceName(XFkType value) {
        this.autoSearchSpaceName = value;
    }

    /**
     * Gets the value of the dateTimeSettingName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDateTimeSettingName() {
        return dateTimeSettingName;
    }

    /**
     * Sets the value of the dateTimeSettingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDateTimeSettingName(XFkType value) {
        this.dateTimeSettingName = value;
    }

    /**
     * Gets the value of the callManagerGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallManagerGroupName() {
        return callManagerGroupName;
    }

    /**
     * Sets the value of the callManagerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallManagerGroupName(XFkType value) {
        this.callManagerGroupName = value;
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
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRegionName(XFkType value) {
        this.regionName = value;
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
     * Gets the value of the srstName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSrstName() {
        return srstName;
    }

    /**
     * Sets the value of the srstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSrstName(XFkType value) {
        this.srstName = value;
    }

    /**
     * Gets the value of the connectionMonitorDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionMonitorDuration() {
        return connectionMonitorDuration;
    }

    /**
     * Sets the value of the connectionMonitorDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionMonitorDuration(String value) {
        this.connectionMonitorDuration = value;
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
     * Gets the value of the mobilityCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMobilityCssName() {
        return mobilityCssName;
    }

    /**
     * Sets the value of the mobilityCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMobilityCssName(XFkType value) {
        this.mobilityCssName = value;
    }

    /**
     * Gets the value of the physicalLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPhysicalLocationName() {
        return physicalLocationName;
    }

    /**
     * Sets the value of the physicalLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPhysicalLocationName(XFkType value) {
        this.physicalLocationName = value;
    }

    /**
     * Gets the value of the deviceMobilityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDeviceMobilityGroupName() {
        return deviceMobilityGroupName;
    }

    /**
     * Sets the value of the deviceMobilityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDeviceMobilityGroupName(XFkType value) {
        this.deviceMobilityGroupName = value;
    }

    /**
     * Gets the value of the revertPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevertPriority() {
        return revertPriority;
    }

    /**
     * Sets the value of the revertPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevertPriority(String value) {
        this.revertPriority = value;
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
     * Gets the value of the localRouteGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocalRouteGroupName() {
        return localRouteGroupName;
    }

    /**
     * Sets the value of the localRouteGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocalRouteGroupName(XFkType value) {
        this.localRouteGroupName = value;
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
     * Gets the value of the callingPartyNationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNationalPrefix() {
        return callingPartyNationalPrefix;
    }

    /**
     * Sets the value of the callingPartyNationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNationalPrefix(String value) {
        this.callingPartyNationalPrefix = value;
    }

    /**
     * Gets the value of the callingPartyInternationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyInternationalPrefix() {
        return callingPartyInternationalPrefix;
    }

    /**
     * Sets the value of the callingPartyInternationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyInternationalPrefix(String value) {
        this.callingPartyInternationalPrefix = value;
    }

    /**
     * Gets the value of the callingPartyUnknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyUnknownPrefix() {
        return callingPartyUnknownPrefix;
    }

    /**
     * Sets the value of the callingPartyUnknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyUnknownPrefix(String value) {
        this.callingPartyUnknownPrefix = value;
    }

    /**
     * Gets the value of the callingPartySubscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartySubscriberPrefix() {
        return callingPartySubscriberPrefix;
    }

    /**
     * Sets the value of the callingPartySubscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartySubscriberPrefix(String value) {
        this.callingPartySubscriberPrefix = value;
    }

    /**
     * Gets the value of the adjunctCallingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAdjunctCallingSearchSpace() {
        return adjunctCallingSearchSpace;
    }

    /**
     * Sets the value of the adjunctCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAdjunctCallingSearchSpace(XFkType value) {
        this.adjunctCallingSearchSpace = value;
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
     * Gets the value of the imeEnrolledPatternGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getImeEnrolledPatternGroupName() {
        return imeEnrolledPatternGroupName;
    }

    /**
     * Sets the value of the imeEnrolledPatternGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setImeEnrolledPatternGroupName(XFkType value) {
        this.imeEnrolledPatternGroupName = value;
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
