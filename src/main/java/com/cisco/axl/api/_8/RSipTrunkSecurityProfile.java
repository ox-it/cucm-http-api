
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSipTrunkSecurityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSipTrunkSecurityProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String64" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
 *         &lt;element name="securityMode" type="{http://www.cisco.com/AXL/API/8.0}XDeviceSecurityMode" minOccurs="0"/>
 *         &lt;element name="incomingTransport" type="{http://www.cisco.com/AXL/API/8.0}XTransport" minOccurs="0"/>
 *         &lt;element name="outgoingTransport" type="{http://www.cisco.com/AXL/API/8.0}XTransport" minOccurs="0"/>
 *         &lt;element name="digestAuthentication" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="noncePolicyTime" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="x509SubjectName" type="{http://www.cisco.com/AXL/API/8.0}String4096" minOccurs="0"/>
 *         &lt;element name="incomingPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="applLevelAuthentication" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="acceptPresenceSubscription" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="acceptOutOfDialogRefer" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="acceptUnsolicitedNotification" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="allowReplaceHeader" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="transmitSecurityStatus" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
@XmlType(name = "RSipTrunkSecurityProfile", propOrder = {
    "name",
    "description",
    "securityMode",
    "incomingTransport",
    "outgoingTransport",
    "digestAuthentication",
    "noncePolicyTime",
    "x509SubjectName",
    "incomingPort",
    "applLevelAuthentication",
    "acceptPresenceSubscription",
    "acceptOutOfDialogRefer",
    "acceptUnsolicitedNotification",
    "allowReplaceHeader",
    "transmitSecurityStatus"
})
public class RSipTrunkSecurityProfile {

    protected String name;
    protected String description;
    protected String securityMode;
    protected String incomingTransport;
    protected String outgoingTransport;
    protected String digestAuthentication;
    protected String noncePolicyTime;
    protected String x509SubjectName;
    protected String incomingPort;
    protected String applLevelAuthentication;
    protected String acceptPresenceSubscription;
    protected String acceptOutOfDialogRefer;
    protected String acceptUnsolicitedNotification;
    protected String allowReplaceHeader;
    protected String transmitSecurityStatus;
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
     * Gets the value of the securityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityMode() {
        return securityMode;
    }

    /**
     * Sets the value of the securityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityMode(String value) {
        this.securityMode = value;
    }

    /**
     * Gets the value of the incomingTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingTransport() {
        return incomingTransport;
    }

    /**
     * Sets the value of the incomingTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingTransport(String value) {
        this.incomingTransport = value;
    }

    /**
     * Gets the value of the outgoingTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingTransport() {
        return outgoingTransport;
    }

    /**
     * Sets the value of the outgoingTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingTransport(String value) {
        this.outgoingTransport = value;
    }

    /**
     * Gets the value of the digestAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestAuthentication() {
        return digestAuthentication;
    }

    /**
     * Sets the value of the digestAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestAuthentication(String value) {
        this.digestAuthentication = value;
    }

    /**
     * Gets the value of the noncePolicyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoncePolicyTime() {
        return noncePolicyTime;
    }

    /**
     * Sets the value of the noncePolicyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoncePolicyTime(String value) {
        this.noncePolicyTime = value;
    }

    /**
     * Gets the value of the x509SubjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX509SubjectName() {
        return x509SubjectName;
    }

    /**
     * Sets the value of the x509SubjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX509SubjectName(String value) {
        this.x509SubjectName = value;
    }

    /**
     * Gets the value of the incomingPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingPort() {
        return incomingPort;
    }

    /**
     * Sets the value of the incomingPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingPort(String value) {
        this.incomingPort = value;
    }

    /**
     * Gets the value of the applLevelAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplLevelAuthentication() {
        return applLevelAuthentication;
    }

    /**
     * Sets the value of the applLevelAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplLevelAuthentication(String value) {
        this.applLevelAuthentication = value;
    }

    /**
     * Gets the value of the acceptPresenceSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptPresenceSubscription() {
        return acceptPresenceSubscription;
    }

    /**
     * Sets the value of the acceptPresenceSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptPresenceSubscription(String value) {
        this.acceptPresenceSubscription = value;
    }

    /**
     * Gets the value of the acceptOutOfDialogRefer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptOutOfDialogRefer() {
        return acceptOutOfDialogRefer;
    }

    /**
     * Sets the value of the acceptOutOfDialogRefer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptOutOfDialogRefer(String value) {
        this.acceptOutOfDialogRefer = value;
    }

    /**
     * Gets the value of the acceptUnsolicitedNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptUnsolicitedNotification() {
        return acceptUnsolicitedNotification;
    }

    /**
     * Sets the value of the acceptUnsolicitedNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptUnsolicitedNotification(String value) {
        this.acceptUnsolicitedNotification = value;
    }

    /**
     * Gets the value of the allowReplaceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowReplaceHeader() {
        return allowReplaceHeader;
    }

    /**
     * Sets the value of the allowReplaceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowReplaceHeader(String value) {
        this.allowReplaceHeader = value;
    }

    /**
     * Gets the value of the transmitSecurityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmitSecurityStatus() {
        return transmitSecurityStatus;
    }

    /**
     * Sets the value of the transmitSecurityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmitSecurityStatus(String value) {
        this.transmitSecurityStatus = value;
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
