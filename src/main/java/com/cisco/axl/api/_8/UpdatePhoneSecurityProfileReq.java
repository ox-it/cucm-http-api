
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePhoneSecurityProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePhoneSecurityProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceSecurityMode" type="{http://www.cisco.com/AXL/API/8.0}XDeviceSecurityMode" minOccurs="0"/>
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/8.0}XAuthenticationMode" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/8.0}XKeySize" minOccurs="0"/>
 *         &lt;element name="tftpEncryptedConfig" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="nonceValidityTime" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="transportType" type="{http://www.cisco.com/AXL/API/8.0}XTransport" minOccurs="0"/>
 *         &lt;element name="sipPhonePort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="enableDigestAuthentication" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="excludeDigestCredentials" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePhoneSecurityProfileReq", propOrder = {
    "newName",
    "description",
    "deviceSecurityMode",
    "authenticationMode",
    "keySize",
    "tftpEncryptedConfig",
    "nonceValidityTime",
    "transportType",
    "sipPhonePort",
    "enableDigestAuthentication",
    "excludeDigestCredentials"
})
public class UpdatePhoneSecurityProfileReq
    extends NameAndGUIDRequest
{

    protected String newName;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "deviceSecurityMode", type = JAXBElement.class)
    protected JAXBElement<String> deviceSecurityMode;
    @XmlElement(defaultValue = "By Null String")
    protected String authenticationMode;
    @XmlElement(defaultValue = "1024")
    protected String keySize;
    @XmlElement(defaultValue = "false")
    protected String tftpEncryptedConfig;
    @XmlElement(defaultValue = "600")
    protected String nonceValidityTime;
    @XmlElement(defaultValue = "TCP+UDP")
    protected String transportType;
    @XmlElement(defaultValue = "5060")
    protected String sipPhonePort;
    @XmlElement(defaultValue = "false")
    protected String enableDigestAuthentication;
    @XmlElement(defaultValue = "false")
    protected String excludeDigestCredentials;

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
     * Gets the value of the deviceSecurityMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceSecurityMode() {
        return deviceSecurityMode;
    }

    /**
     * Sets the value of the deviceSecurityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceSecurityMode(JAXBElement<String> value) {
        this.deviceSecurityMode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMode(String value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySize(String value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the tftpEncryptedConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTftpEncryptedConfig() {
        return tftpEncryptedConfig;
    }

    /**
     * Sets the value of the tftpEncryptedConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTftpEncryptedConfig(String value) {
        this.tftpEncryptedConfig = value;
    }

    /**
     * Gets the value of the nonceValidityTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonceValidityTime() {
        return nonceValidityTime;
    }

    /**
     * Sets the value of the nonceValidityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonceValidityTime(String value) {
        this.nonceValidityTime = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportType(String value) {
        this.transportType = value;
    }

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
     * Gets the value of the enableDigestAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableDigestAuthentication() {
        return enableDigestAuthentication;
    }

    /**
     * Sets the value of the enableDigestAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableDigestAuthentication(String value) {
        this.enableDigestAuthentication = value;
    }

    /**
     * Gets the value of the excludeDigestCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeDigestCredentials() {
        return excludeDigestCredentials;
    }

    /**
     * Sets the value of the excludeDigestCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeDigestCredentials(String value) {
        this.excludeDigestCredentials = value;
    }

}
