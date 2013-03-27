
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
 * <p>Java class for XCiscoCatalyst600024PortFXSGateway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCiscoCatalyst600024PortFXSGateway">
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
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/8.0}XCountry" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="loadInformation" type="{http://www.cisco.com/AXL/API/8.0}XLoadInformation" minOccurs="0"/>
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/8.0}XVendorConfig" minOccurs="0"/>
 *         &lt;element name="traceFlag" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="useDevicePoolCgpnTransformCss" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="ports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XAnalogPort" maxOccurs="24"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="portSelectionOrder" type="{http://www.cisco.com/AXL/API/8.0}XTrunkSelectionOrder"/>
 *         &lt;element name="transmitUtf8" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCiscoCatalyst600024PortFXSGateway", propOrder = {
    "name",
    "description",
    "product",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "networkLocale",
    "locationName",
    "mediaResourceListName",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "loadInformation",
    "vendorConfig",
    "traceFlag",
    "mlppDomainId",
    "useTrustedRelayPoint",
    "cgpnTransformationCssName",
    "useDevicePoolCgpnTransformCss",
    "geoLocationName",
    "ports",
    "portSelectionOrder",
    "transmitUtf8",
    "geoLocationFilterName"
})
public class XCiscoCatalyst600024PortFXSGateway {

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
    @XmlElementRef(name = "networkLocale", type = JAXBElement.class)
    protected JAXBElement<String> networkLocale;
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
    @XmlElement(defaultValue = "Default")
    protected String useTrustedRelayPoint;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    protected String useDevicePoolCgpnTransformCss;
    @XmlElementRef(name = "geoLocationName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationName;
    protected XCiscoCatalyst600024PortFXSGateway.Ports ports;
    protected String portSelectionOrder;
    @XmlElement(defaultValue = "false")
    protected String transmitUtf8;
    @XmlElementRef(name = "geoLocationFilterName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationFilterName;

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
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link XCiscoCatalyst600024PortFXSGateway.Ports }
     *     
     */
    public XCiscoCatalyst600024PortFXSGateway.Ports getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCiscoCatalyst600024PortFXSGateway.Ports }
     *     
     */
    public void setPorts(XCiscoCatalyst600024PortFXSGateway.Ports value) {
        this.ports = value;
    }

    /**
     * Gets the value of the portSelectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortSelectionOrder() {
        return portSelectionOrder;
    }

    /**
     * Sets the value of the portSelectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortSelectionOrder(String value) {
        this.portSelectionOrder = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XAnalogPort" maxOccurs="24"/>
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

        protected List<XAnalogPort> port;

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
         * {@link XAnalogPort }
         * 
         * 
         */
        public List<XAnalogPort> getPort() {
            if (port == null) {
                port = new ArrayList<XAnalogPort>();
            }
            return this.port;
        }

    }

}
