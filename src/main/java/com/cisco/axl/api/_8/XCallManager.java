
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCallManager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCallManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="autoRegistration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="startDn" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                   &lt;element name="endDn" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                   &lt;element name="nextDn" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                   &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                   &lt;element name="e164Mask" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ports">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;choice>
 *                     &lt;element name="ethernetPhonePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *                   &lt;/choice>
 *                   &lt;element name="mgcpPorts">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="listen" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *                             &lt;element name="keepAlive" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sipPorts">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *                             &lt;element name="sipPhoneSecurePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
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
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCallManager", propOrder = {
    "name",
    "description",
    "autoRegistration",
    "ports",
    "processNodeName"
})
public class XCallManager {

    protected String name;
    protected String description;
    protected XCallManager.AutoRegistration autoRegistration;
    protected XCallManager.Ports ports;
    protected XFkType processNodeName;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
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
     * Gets the value of the autoRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XCallManager.AutoRegistration }
     *     
     */
    public XCallManager.AutoRegistration getAutoRegistration() {
        return autoRegistration;
    }

    /**
     * Sets the value of the autoRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallManager.AutoRegistration }
     *     
     */
    public void setAutoRegistration(XCallManager.AutoRegistration value) {
        this.autoRegistration = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link XCallManager.Ports }
     *     
     */
    public XCallManager.Ports getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallManager.Ports }
     *     
     */
    public void setPorts(XCallManager.Ports value) {
        this.ports = value;
    }

    /**
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
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
     *         &lt;element name="startDn" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
     *         &lt;element name="endDn" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
     *         &lt;element name="nextDn" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
     *         &lt;element name="e164Mask" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
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
        "startDn",
        "endDn",
        "nextDn",
        "routePartitionName",
        "e164Mask"
    })
    public static class AutoRegistration {

        @XmlElement(defaultValue = "1000")
        protected String startDn;
        @XmlElement(defaultValue = "1000")
        protected String endDn;
        @XmlElement(defaultValue = "1000")
        protected String nextDn;
        @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
        protected JAXBElement<XFkType> routePartitionName;
        @XmlElementRef(name = "e164Mask", type = JAXBElement.class)
        protected JAXBElement<String> e164Mask;

        /**
         * Gets the value of the startDn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDn() {
            return startDn;
        }

        /**
         * Sets the value of the startDn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDn(String value) {
            this.startDn = value;
        }

        /**
         * Gets the value of the endDn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDn() {
            return endDn;
        }

        /**
         * Sets the value of the endDn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDn(String value) {
            this.endDn = value;
        }

        /**
         * Gets the value of the nextDn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextDn() {
            return nextDn;
        }

        /**
         * Sets the value of the nextDn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextDn(String value) {
            this.nextDn = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
         *     
         */
        public JAXBElement<XFkType> getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
         *     
         */
        public void setRoutePartitionName(JAXBElement<XFkType> value) {
            this.routePartitionName = ((JAXBElement<XFkType> ) value);
        }

        /**
         * Gets the value of the e164Mask property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getE164Mask() {
            return e164Mask;
        }

        /**
         * Sets the value of the e164Mask property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setE164Mask(JAXBElement<String> value) {
            this.e164Mask = ((JAXBElement<String> ) value);
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
     *         &lt;choice>
     *           &lt;element name="ethernetPhonePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
     *         &lt;/choice>
     *         &lt;element name="mgcpPorts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="listen" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
     *                   &lt;element name="keepAlive" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sipPorts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
     *                   &lt;element name="sipPhoneSecurePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
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
        "ethernetPhonePort",
        "mgcpPorts",
        "sipPorts"
    })
    public static class Ports {

        @XmlElement(defaultValue = "2000")
        protected String ethernetPhonePort;
        protected XCallManager.Ports.MgcpPorts mgcpPorts;
        protected XCallManager.Ports.SipPorts sipPorts;

        /**
         * Gets the value of the ethernetPhonePort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEthernetPhonePort() {
            return ethernetPhonePort;
        }

        /**
         * Sets the value of the ethernetPhonePort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEthernetPhonePort(String value) {
            this.ethernetPhonePort = value;
        }

        /**
         * Gets the value of the mgcpPorts property.
         * 
         * @return
         *     possible object is
         *     {@link XCallManager.Ports.MgcpPorts }
         *     
         */
        public XCallManager.Ports.MgcpPorts getMgcpPorts() {
            return mgcpPorts;
        }

        /**
         * Sets the value of the mgcpPorts property.
         * 
         * @param value
         *     allowed object is
         *     {@link XCallManager.Ports.MgcpPorts }
         *     
         */
        public void setMgcpPorts(XCallManager.Ports.MgcpPorts value) {
            this.mgcpPorts = value;
        }

        /**
         * Gets the value of the sipPorts property.
         * 
         * @return
         *     possible object is
         *     {@link XCallManager.Ports.SipPorts }
         *     
         */
        public XCallManager.Ports.SipPorts getSipPorts() {
            return sipPorts;
        }

        /**
         * Sets the value of the sipPorts property.
         * 
         * @param value
         *     allowed object is
         *     {@link XCallManager.Ports.SipPorts }
         *     
         */
        public void setSipPorts(XCallManager.Ports.SipPorts value) {
            this.sipPorts = value;
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
         *         &lt;element name="listen" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
         *         &lt;element name="keepAlive" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
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
            "listen",
            "keepAlive"
        })
        public static class MgcpPorts {

            @XmlElement(defaultValue = "2427")
            protected String listen;
            @XmlElement(defaultValue = "2428")
            protected String keepAlive;

            /**
             * Gets the value of the listen property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getListen() {
                return listen;
            }

            /**
             * Sets the value of the listen property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setListen(String value) {
                this.listen = value;
            }

            /**
             * Gets the value of the keepAlive property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeepAlive() {
                return keepAlive;
            }

            /**
             * Sets the value of the keepAlive property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeepAlive(String value) {
                this.keepAlive = value;
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
         *         &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
         *         &lt;element name="sipPhoneSecurePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
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
            "sipPhonePort",
            "sipPhoneSecurePort"
        })
        public static class SipPorts {

            @XmlElement(defaultValue = "5060")
            protected String sipPhonePort;
            @XmlElement(defaultValue = "5061")
            protected String sipPhoneSecurePort;

            /**
             * Gets the value of the sipPhonePort property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSipPhonePort() {
                return sipPhonePort;
            }

            /**
             * Sets the value of the sipPhonePort property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSipPhonePort(String value) {
                this.sipPhonePort = value;
            }

            /**
             * Gets the value of the sipPhoneSecurePort property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSipPhoneSecurePort() {
                return sipPhoneSecurePort;
            }

            /**
             * Sets the value of the sipPhoneSecurePort property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSipPhoneSecurePort(String value) {
                this.sipPhoneSecurePort = value;
            }

        }

    }

}
