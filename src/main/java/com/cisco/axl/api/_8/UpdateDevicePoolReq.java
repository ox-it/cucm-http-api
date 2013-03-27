
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDevicePoolReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDevicePoolReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}UniqueString50" minOccurs="0"/>
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
 *         &lt;element name="cntdPnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDevicePoolReq", propOrder = {
    "newName",
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
    "imeEnrolledPatternGroupName",
    "cntdPnTransformationCssName"
})
public class UpdateDevicePoolReq
    extends NameAndGUIDRequest
{

    protected String newName;
    @XmlElementRef(name = "autoSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> autoSearchSpaceName;
    protected XFkType dateTimeSettingName;
    protected XFkType callManagerGroupName;
    @XmlElementRef(name = "mediaResourceListName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mediaResourceListName;
    protected XFkType regionName;
    @XmlElementRef(name = "networkLocale", type = JAXBElement.class)
    protected JAXBElement<String> networkLocale;
    protected XFkType srstName;
    @XmlElement(defaultValue = "-1")
    protected String connectionMonitorDuration;
    @XmlElementRef(name = "automatedAlternateRoutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> automatedAlternateRoutingCssName;
    @XmlElementRef(name = "aarNeighborhoodName", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarNeighborhoodName;
    @XmlElementRef(name = "locationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> locationName;
    @XmlElementRef(name = "mobilityCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mobilityCssName;
    @XmlElementRef(name = "physicalLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> physicalLocationName;
    @XmlElementRef(name = "deviceMobilityGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> deviceMobilityGroupName;
    @XmlElement(defaultValue = "Default")
    protected String revertPriority;
    @XmlElement(defaultValue = "Default")
    protected String singleButtonBarge;
    @XmlElement(defaultValue = "Default")
    protected String joinAcrossLines;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElementRef(name = "cdpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cdpnTransformationCssName;
    @XmlElementRef(name = "localRouteGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> localRouteGroupName;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationName;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationFilterName;
    protected String callingPartyNationalPrefix;
    protected String callingPartyInternationalPrefix;
    protected String callingPartyUnknownPrefix;
    protected String callingPartySubscriberPrefix;
    @XmlElementRef(name = "adjunctCallingSearchSpace", type = JAXBElement.class)
    protected JAXBElement<XFkType> adjunctCallingSearchSpace;
    @XmlElementRef(name = "callingPartyNationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyNationalStripDigits;
    @XmlElementRef(name = "callingPartyInternationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyInternationalStripDigits;
    @XmlElementRef(name = "callingPartyUnknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyUnknownStripDigits;
    @XmlElementRef(name = "callingPartySubscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartySubscriberStripDigits;
    @XmlElementRef(name = "callingPartyNationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingPartyNationalTransformationCssName;
    @XmlElementRef(name = "callingPartyInternationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingPartyInternationalTransformationCssName;
    @XmlElementRef(name = "callingPartyUnknownTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingPartyUnknownTransformationCssName;
    @XmlElementRef(name = "callingPartySubscriberTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingPartySubscriberTransformationCssName;
    protected String calledPartyNationalPrefix;
    protected String calledPartyInternationalPrefix;
    protected String calledPartyUnknownPrefix;
    protected String calledPartySubscriberPrefix;
    @XmlElementRef(name = "calledPartyNationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyNationalStripDigits;
    @XmlElementRef(name = "calledPartyInternationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyInternationalStripDigits;
    @XmlElementRef(name = "calledPartyUnknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyUnknownStripDigits;
    @XmlElementRef(name = "calledPartySubscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> calledPartySubscriberStripDigits;
    @XmlElementRef(name = "calledPartyNationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyNationalTransformationCssName;
    @XmlElementRef(name = "calledPartyInternationalTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyInternationalTransformationCssName;
    @XmlElementRef(name = "calledPartyUnknownTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartyUnknownTransformationCssName;
    @XmlElementRef(name = "calledPartySubscriberTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> calledPartySubscriberTransformationCssName;
    @XmlElementRef(name = "imeEnrolledPatternGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> imeEnrolledPatternGroupName;
    @XmlElementRef(name = "cntdPnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cntdPnTransformationCssName;

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
     * Gets the value of the autoSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAutoSearchSpaceName() {
        return autoSearchSpaceName;
    }

    /**
     * Sets the value of the autoSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAutoSearchSpaceName(JAXBElement<XFkType> value) {
        this.autoSearchSpaceName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLocationName(JAXBElement<XFkType> value) {
        this.locationName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the mobilityCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMobilityCssName() {
        return mobilityCssName;
    }

    /**
     * Sets the value of the mobilityCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMobilityCssName(JAXBElement<XFkType> value) {
        this.mobilityCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the physicalLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPhysicalLocationName() {
        return physicalLocationName;
    }

    /**
     * Sets the value of the physicalLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPhysicalLocationName(JAXBElement<XFkType> value) {
        this.physicalLocationName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the deviceMobilityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDeviceMobilityGroupName() {
        return deviceMobilityGroupName;
    }

    /**
     * Sets the value of the deviceMobilityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDeviceMobilityGroupName(JAXBElement<XFkType> value) {
        this.deviceMobilityGroupName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the localRouteGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLocalRouteGroupName() {
        return localRouteGroupName;
    }

    /**
     * Sets the value of the localRouteGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLocalRouteGroupName(JAXBElement<XFkType> value) {
        this.localRouteGroupName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAdjunctCallingSearchSpace() {
        return adjunctCallingSearchSpace;
    }

    /**
     * Sets the value of the adjunctCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAdjunctCallingSearchSpace(JAXBElement<XFkType> value) {
        this.adjunctCallingSearchSpace = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the callingPartyNationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyNationalStripDigits() {
        return callingPartyNationalStripDigits;
    }

    /**
     * Sets the value of the callingPartyNationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyNationalStripDigits(JAXBElement<String> value) {
        this.callingPartyNationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingPartyInternationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyInternationalStripDigits() {
        return callingPartyInternationalStripDigits;
    }

    /**
     * Sets the value of the callingPartyInternationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyInternationalStripDigits(JAXBElement<String> value) {
        this.callingPartyInternationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingPartyUnknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyUnknownStripDigits() {
        return callingPartyUnknownStripDigits;
    }

    /**
     * Sets the value of the callingPartyUnknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyUnknownStripDigits(JAXBElement<String> value) {
        this.callingPartyUnknownStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingPartySubscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartySubscriberStripDigits() {
        return callingPartySubscriberStripDigits;
    }

    /**
     * Sets the value of the callingPartySubscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartySubscriberStripDigits(JAXBElement<String> value) {
        this.callingPartySubscriberStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingPartyNationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingPartyNationalTransformationCssName() {
        return callingPartyNationalTransformationCssName;
    }

    /**
     * Sets the value of the callingPartyNationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingPartyNationalTransformationCssName(JAXBElement<XFkType> value) {
        this.callingPartyNationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the callingPartyInternationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingPartyInternationalTransformationCssName() {
        return callingPartyInternationalTransformationCssName;
    }

    /**
     * Sets the value of the callingPartyInternationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingPartyInternationalTransformationCssName(JAXBElement<XFkType> value) {
        this.callingPartyInternationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the callingPartyUnknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingPartyUnknownTransformationCssName() {
        return callingPartyUnknownTransformationCssName;
    }

    /**
     * Sets the value of the callingPartyUnknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingPartyUnknownTransformationCssName(JAXBElement<XFkType> value) {
        this.callingPartyUnknownTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the callingPartySubscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingPartySubscriberTransformationCssName() {
        return callingPartySubscriberTransformationCssName;
    }

    /**
     * Sets the value of the callingPartySubscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingPartySubscriberTransformationCssName(JAXBElement<XFkType> value) {
        this.callingPartySubscriberTransformationCssName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyNationalStripDigits() {
        return calledPartyNationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyNationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyNationalStripDigits(JAXBElement<String> value) {
        this.calledPartyNationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartyInternationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyInternationalStripDigits() {
        return calledPartyInternationalStripDigits;
    }

    /**
     * Sets the value of the calledPartyInternationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyInternationalStripDigits(JAXBElement<String> value) {
        this.calledPartyInternationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartyUnknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyUnknownStripDigits() {
        return calledPartyUnknownStripDigits;
    }

    /**
     * Sets the value of the calledPartyUnknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyUnknownStripDigits(JAXBElement<String> value) {
        this.calledPartyUnknownStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartySubscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartySubscriberStripDigits() {
        return calledPartySubscriberStripDigits;
    }

    /**
     * Sets the value of the calledPartySubscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartySubscriberStripDigits(JAXBElement<String> value) {
        this.calledPartySubscriberStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyNationalTransformationCssName() {
        return calledPartyNationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyNationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyNationalTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyNationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyInternationalTransformationCssName() {
        return calledPartyInternationalTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyInternationalTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyInternationalTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyInternationalTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartyUnknownTransformationCssName() {
        return calledPartyUnknownTransformationCssName;
    }

    /**
     * Sets the value of the calledPartyUnknownTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartyUnknownTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartyUnknownTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCalledPartySubscriberTransformationCssName() {
        return calledPartySubscriberTransformationCssName;
    }

    /**
     * Sets the value of the calledPartySubscriberTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCalledPartySubscriberTransformationCssName(JAXBElement<XFkType> value) {
        this.calledPartySubscriberTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the imeEnrolledPatternGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getImeEnrolledPatternGroupName() {
        return imeEnrolledPatternGroupName;
    }

    /**
     * Sets the value of the imeEnrolledPatternGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setImeEnrolledPatternGroupName(JAXBElement<XFkType> value) {
        this.imeEnrolledPatternGroupName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the cntdPnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCntdPnTransformationCssName() {
        return cntdPnTransformationCssName;
    }

    /**
     * Sets the value of the cntdPnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCntdPnTransformationCssName(JAXBElement<XFkType> value) {
        this.cntdPnTransformationCssName = ((JAXBElement<XFkType> ) value);
    }

}
