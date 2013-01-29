
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCallManager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCallManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="autoRegistration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="startDn" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *                   &lt;element name="endDn" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *                   &lt;element name="nextDn" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *                   &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="e164Mask" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="ethernetPhonePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *                   &lt;element name="mgcpPorts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="listen" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *                             &lt;element name="keepAlive" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sipPorts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *                             &lt;element name="sipPhoneSecurePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
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
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RCallManager", propOrder = {
    "name",
    "description",
    "autoRegistration",
    "ports",
    "processNodeName"
})
public class RCallManager {

    protected String name;
    protected String description;
    protected RCallManager.AutoRegistration autoRegistration;
    protected RCallManager.Ports ports;
    protected XFkType processNodeName;
    @XmlAttribute
    protected String uuid;
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
     *     {@link RCallManager.AutoRegistration }
     *     
     */
    public RCallManager.AutoRegistration getAutoRegistration() {
        return autoRegistration;
    }

    /**
     * Sets the value of the autoRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallManager.AutoRegistration }
     *     
     */
    public void setAutoRegistration(RCallManager.AutoRegistration value) {
        this.autoRegistration = value;
    }

    /**
     * Gets the value of the ports property.
     * 
     * @return
     *     possible object is
     *     {@link RCallManager.Ports }
     *     
     */
    public RCallManager.Ports getPorts() {
        return ports;
    }

    /**
     * Sets the value of the ports property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCallManager.Ports }
     *     
     */
    public void setPorts(RCallManager.Ports value) {
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
     *         &lt;element name="startDn" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
     *         &lt;element name="endDn" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
     *         &lt;element name="nextDn" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
     *         &lt;element name="e164Mask" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
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

        protected String startDn;
        protected String endDn;
        protected String nextDn;
        protected XFkType routePartitionName;
        protected String e164Mask;

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
         *     {@link XFkType }
         *     
         */
        public XFkType getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setRoutePartitionName(XFkType value) {
            this.routePartitionName = value;
        }

        /**
         * Gets the value of the e164Mask property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getE164Mask() {
            return e164Mask;
        }

        /**
         * Sets the value of the e164Mask property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setE164Mask(String value) {
            this.e164Mask = value;
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
     *         &lt;element name="ethernetPhonePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
     *         &lt;element name="mgcpPorts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="listen" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
     *                   &lt;element name="keepAlive" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sipPorts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
     *                   &lt;element name="sipPhoneSecurePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
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

        protected String ethernetPhonePort;
        protected RCallManager.Ports.MgcpPorts mgcpPorts;
        protected RCallManager.Ports.SipPorts sipPorts;

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
         *     {@link RCallManager.Ports.MgcpPorts }
         *     
         */
        public RCallManager.Ports.MgcpPorts getMgcpPorts() {
            return mgcpPorts;
        }

        /**
         * Sets the value of the mgcpPorts property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallManager.Ports.MgcpPorts }
         *     
         */
        public void setMgcpPorts(RCallManager.Ports.MgcpPorts value) {
            this.mgcpPorts = value;
        }

        /**
         * Gets the value of the sipPorts property.
         * 
         * @return
         *     possible object is
         *     {@link RCallManager.Ports.SipPorts }
         *     
         */
        public RCallManager.Ports.SipPorts getSipPorts() {
            return sipPorts;
        }

        /**
         * Sets the value of the sipPorts property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallManager.Ports.SipPorts }
         *     
         */
        public void setSipPorts(RCallManager.Ports.SipPorts value) {
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
         *         &lt;element name="listen" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
         *         &lt;element name="keepAlive" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
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

            protected String listen;
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
         *         &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
         *         &lt;element name="sipPhoneSecurePort" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
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

            protected String sipPhonePort;
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
