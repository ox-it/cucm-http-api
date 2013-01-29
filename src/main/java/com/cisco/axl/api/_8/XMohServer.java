
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
 * <p>Java class for XMohServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMohServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="maxUnicastConnections" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="maxMulticastConnections" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="fixedAudioSourceDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runFlag" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/8.5}XStatus" minOccurs="0"/>
 *         &lt;element name="isMultiCastEnabled" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="baseMulticastIpaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseMulticastPort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="multicastIncrementOnIp" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="audioSources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="audioSource" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="sourceId" type="{http://www.cisco.com/AXL/API/8.5}XInteger"/>
 *                             &lt;element name="maxHops" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMohServer", propOrder = {
    "name",
    "description",
    "processNodeName",
    "devicePoolName",
    "locationName",
    "maxUnicastConnections",
    "maxMulticastConnections",
    "fixedAudioSourceDevice",
    "runFlag",
    "useTrustedRelayPoint",
    "isMultiCastEnabled",
    "baseMulticastIpaddress",
    "baseMulticastPort",
    "multicastIncrementOnIp",
    "audioSources"
})
public class XMohServer {

    protected String name;
    protected String description;
    @XmlElementRef(name = "processNodeName", type = JAXBElement.class)
    protected JAXBElement<XFkType> processNodeName;
    @XmlElementRef(name = "devicePoolName", type = JAXBElement.class)
    protected JAXBElement<XFkType> devicePoolName;
    protected XFkType locationName;
    @XmlElement(defaultValue = "250")
    protected String maxUnicastConnections;
    @XmlElement(defaultValue = "250000")
    protected String maxMulticastConnections;
    protected String fixedAudioSourceDevice;
    @XmlElement(defaultValue = "true")
    protected String runFlag;
    @XmlElement(defaultValue = "Default")
    protected String useTrustedRelayPoint;
    protected String isMultiCastEnabled;
    @XmlElement(defaultValue = "239.1.1.1")
    protected String baseMulticastIpaddress;
    @XmlElement(defaultValue = "0")
    protected String baseMulticastPort;
    @XmlElement(defaultValue = "false")
    protected String multicastIncrementOnIp;
    protected XMohServer.AudioSources audioSources;

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
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setProcessNodeName(JAXBElement<XFkType> value) {
        this.processNodeName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the maxUnicastConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxUnicastConnections() {
        return maxUnicastConnections;
    }

    /**
     * Sets the value of the maxUnicastConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxUnicastConnections(String value) {
        this.maxUnicastConnections = value;
    }

    /**
     * Gets the value of the maxMulticastConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMulticastConnections() {
        return maxMulticastConnections;
    }

    /**
     * Sets the value of the maxMulticastConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxMulticastConnections(String value) {
        this.maxMulticastConnections = value;
    }

    /**
     * Gets the value of the fixedAudioSourceDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAudioSourceDevice() {
        return fixedAudioSourceDevice;
    }

    /**
     * Sets the value of the fixedAudioSourceDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAudioSourceDevice(String value) {
        this.fixedAudioSourceDevice = value;
    }

    /**
     * Gets the value of the runFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunFlag() {
        return runFlag;
    }

    /**
     * Sets the value of the runFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunFlag(String value) {
        this.runFlag = value;
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
     * Gets the value of the isMultiCastEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiCastEnabled() {
        return isMultiCastEnabled;
    }

    /**
     * Sets the value of the isMultiCastEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiCastEnabled(String value) {
        this.isMultiCastEnabled = value;
    }

    /**
     * Gets the value of the baseMulticastIpaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMulticastIpaddress() {
        return baseMulticastIpaddress;
    }

    /**
     * Sets the value of the baseMulticastIpaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMulticastIpaddress(String value) {
        this.baseMulticastIpaddress = value;
    }

    /**
     * Gets the value of the baseMulticastPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMulticastPort() {
        return baseMulticastPort;
    }

    /**
     * Sets the value of the baseMulticastPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMulticastPort(String value) {
        this.baseMulticastPort = value;
    }

    /**
     * Gets the value of the multicastIncrementOnIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticastIncrementOnIp() {
        return multicastIncrementOnIp;
    }

    /**
     * Sets the value of the multicastIncrementOnIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticastIncrementOnIp(String value) {
        this.multicastIncrementOnIp = value;
    }

    /**
     * Gets the value of the audioSources property.
     * 
     * @return
     *     possible object is
     *     {@link XMohServer.AudioSources }
     *     
     */
    public XMohServer.AudioSources getAudioSources() {
        return audioSources;
    }

    /**
     * Sets the value of the audioSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMohServer.AudioSources }
     *     
     */
    public void setAudioSources(XMohServer.AudioSources value) {
        this.audioSources = value;
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
     *         &lt;element name="audioSource" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="sourceId" type="{http://www.cisco.com/AXL/API/8.5}XInteger"/>
     *                   &lt;element name="maxHops" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "audioSource"
    })
    public static class AudioSources {

        protected List<XMohServer.AudioSources.AudioSource> audioSource;

        /**
         * Gets the value of the audioSource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the audioSource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAudioSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMohServer.AudioSources.AudioSource }
         * 
         * 
         */
        public List<XMohServer.AudioSources.AudioSource> getAudioSource() {
            if (audioSource == null) {
                audioSource = new ArrayList<XMohServer.AudioSources.AudioSource>();
            }
            return this.audioSource;
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
         *         &lt;element name="sourceId" type="{http://www.cisco.com/AXL/API/8.5}XInteger"/>
         *         &lt;element name="maxHops" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
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
            "sourceId",
            "maxHops"
        })
        public static class AudioSource {

            protected String sourceId;
            @XmlElement(defaultValue = "2")
            protected String maxHops;

            /**
             * Gets the value of the sourceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceId() {
                return sourceId;
            }

            /**
             * Sets the value of the sourceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceId(String value) {
                this.sourceId = value;
            }

            /**
             * Gets the value of the maxHops property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaxHops() {
                return maxHops;
            }

            /**
             * Sets the value of the maxHops property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaxHops(String value) {
                this.maxHops = value;
            }

        }

    }

}
