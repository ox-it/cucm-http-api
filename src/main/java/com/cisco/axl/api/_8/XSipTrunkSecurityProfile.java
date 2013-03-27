
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSipTrunkSecurityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSipTrunkSecurityProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String64"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSipTrunkSecurityProfile", propOrder = {
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
public class XSipTrunkSecurityProfile {

    protected String name;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "securityMode", type = JAXBElement.class)
    protected JAXBElement<String> securityMode;
    @XmlElement(defaultValue = "TCP+UDP")
    protected String incomingTransport;
    @XmlElementRef(name = "outgoingTransport", type = JAXBElement.class)
    protected JAXBElement<String> outgoingTransport;
    @XmlElement(defaultValue = "false")
    protected String digestAuthentication;
    @XmlElement(defaultValue = "600")
    protected String noncePolicyTime;
    protected String x509SubjectName;
    @XmlElement(defaultValue = "5060")
    protected String incomingPort;
    @XmlElement(defaultValue = "false")
    protected String applLevelAuthentication;
    @XmlElement(defaultValue = "false")
    protected String acceptPresenceSubscription;
    @XmlElement(defaultValue = "false")
    protected String acceptOutOfDialogRefer;
    @XmlElement(defaultValue = "false")
    protected String acceptUnsolicitedNotification;
    @XmlElement(defaultValue = "false")
    protected String allowReplaceHeader;
    @XmlElement(defaultValue = "false")
    protected String transmitSecurityStatus;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securityMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityMode() {
        return securityMode;
    }

    /**
     * Sets the value of the securityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityMode(JAXBElement<String> value) {
        this.securityMode = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutgoingTransport() {
        return outgoingTransport;
    }

    /**
     * Sets the value of the outgoingTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutgoingTransport(JAXBElement<String> value) {
        this.outgoingTransport = ((JAXBElement<String> ) value);
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

}
