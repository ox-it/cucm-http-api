
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LVpnProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LVpnProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoNetworkDetection" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="mtu" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="failToConnect" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="clientAuthentication" type="{http://www.cisco.com/AXL/API/8.5}XVPNClientAuthentication" minOccurs="0"/>
 *         &lt;element name="pwdPersistant" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableHostIdCheck" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LVpnProfile", propOrder = {
    "name",
    "description",
    "autoNetworkDetection",
    "mtu",
    "failToConnect",
    "clientAuthentication",
    "pwdPersistant",
    "enableHostIdCheck"
})
public class LVpnProfile {

    protected String name;
    protected String description;
    protected String autoNetworkDetection;
    protected String mtu;
    protected String failToConnect;
    protected String clientAuthentication;
    protected String pwdPersistant;
    protected String enableHostIdCheck;
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
     * Gets the value of the autoNetworkDetection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoNetworkDetection() {
        return autoNetworkDetection;
    }

    /**
     * Sets the value of the autoNetworkDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoNetworkDetection(String value) {
        this.autoNetworkDetection = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtu(String value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the failToConnect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailToConnect() {
        return failToConnect;
    }

    /**
     * Sets the value of the failToConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailToConnect(String value) {
        this.failToConnect = value;
    }

    /**
     * Gets the value of the clientAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAuthentication() {
        return clientAuthentication;
    }

    /**
     * Sets the value of the clientAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAuthentication(String value) {
        this.clientAuthentication = value;
    }

    /**
     * Gets the value of the pwdPersistant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwdPersistant() {
        return pwdPersistant;
    }

    /**
     * Sets the value of the pwdPersistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwdPersistant(String value) {
        this.pwdPersistant = value;
    }

    /**
     * Gets the value of the enableHostIdCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableHostIdCheck() {
        return enableHostIdCheck;
    }

    /**
     * Sets the value of the enableHostIdCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableHostIdCheck(String value) {
        this.enableHostIdCheck = value;
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
