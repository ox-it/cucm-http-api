
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCommonDeviceConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCommonDeviceConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString50"/>
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/8.0}XUserLocale" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.0}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/8.0}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/8.0}XPreemption" minOccurs="0"/>
 *         &lt;element name="ipAddressingMode" type="{http://www.cisco.com/AXL/API/8.0}XIPAddressingMode" minOccurs="0"/>
 *         &lt;element name="ipAddressingModePreferenceControl" type="{http://www.cisco.com/AXL/API/8.0}XIPAddressingModePrefControl" minOccurs="0"/>
 *         &lt;element name="allowAutoConfigurationForPhones" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="useImeForOutboundCalls" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCommonDeviceConfig", propOrder = {
    "name",
    "softkeyTemplateName",
    "userLocale",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "mlppDomainId",
    "mlppIndicationStatus",
    "useTrustedRelayPoint",
    "preemption",
    "ipAddressingMode",
    "ipAddressingModePreferenceControl",
    "allowAutoConfigurationForPhones",
    "useImeForOutboundCalls"
})
public class XCommonDeviceConfig {

    protected String name;
    @XmlElementRef(name = "softkeyTemplateName", type = JAXBElement.class)
    protected JAXBElement<XFkType> softkeyTemplateName;
    @XmlElementRef(name = "userLocale", type = JAXBElement.class)
    protected JAXBElement<String> userLocale;
    @XmlElementRef(name = "networkHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> networkHoldMohAudioSourceId;
    @XmlElementRef(name = "userHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> userHoldMohAudioSourceId;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<Integer> mlppDomainId;
    @XmlElement(defaultValue = "Default")
    protected String mlppIndicationStatus;
    @XmlElement(defaultValue = "false")
    protected String useTrustedRelayPoint;
    @XmlElement(defaultValue = "Default")
    protected String preemption;
    @XmlElement(defaultValue = "IPv4 and IPv6")
    protected String ipAddressingMode;
    @XmlElement(defaultValue = "Use System Default")
    protected String ipAddressingModePreferenceControl;
    @XmlElement(defaultValue = "Default")
    protected String allowAutoConfigurationForPhones;
    @XmlElement(defaultValue = "Default")
    protected String useImeForOutboundCalls;

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
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLocale(JAXBElement<String> value) {
        this.userLocale = ((JAXBElement<String> ) value);
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
     * Gets the value of the ipAddressingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressingMode() {
        return ipAddressingMode;
    }

    /**
     * Sets the value of the ipAddressingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressingMode(String value) {
        this.ipAddressingMode = value;
    }

    /**
     * Gets the value of the ipAddressingModePreferenceControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressingModePreferenceControl() {
        return ipAddressingModePreferenceControl;
    }

    /**
     * Sets the value of the ipAddressingModePreferenceControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressingModePreferenceControl(String value) {
        this.ipAddressingModePreferenceControl = value;
    }

    /**
     * Gets the value of the allowAutoConfigurationForPhones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAutoConfigurationForPhones() {
        return allowAutoConfigurationForPhones;
    }

    /**
     * Sets the value of the allowAutoConfigurationForPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAutoConfigurationForPhones(String value) {
        this.allowAutoConfigurationForPhones = value;
    }

    /**
     * Gets the value of the useImeForOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseImeForOutboundCalls() {
        return useImeForOutboundCalls;
    }

    /**
     * Sets the value of the useImeForOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseImeForOutboundCalls(String value) {
        this.useImeForOutboundCalls = value;
    }

}
