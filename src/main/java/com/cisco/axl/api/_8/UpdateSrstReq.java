
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSrstReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSrstReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SipNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SipPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="isSecure" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSrstReq", propOrder = {
    "newName",
    "port",
    "ipAddress",
    "sipNetwork",
    "sipPort",
    "isSecure"
})
public class UpdateSrstReq
    extends NameAndGUIDRequest
{

    protected String newName;
    @XmlElement(defaultValue = "2000")
    protected String port;
    protected String ipAddress;
    @XmlElement(name = "SipNetwork")
    protected String sipNetwork;
    @XmlElement(name = "SipPort", defaultValue = "5060")
    protected String sipPort;
    protected String isSecure;

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
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the sipNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipNetwork() {
        return sipNetwork;
    }

    /**
     * Sets the value of the sipNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipNetwork(String value) {
        this.sipNetwork = value;
    }

    /**
     * Gets the value of the sipPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipPort() {
        return sipPort;
    }

    /**
     * Sets the value of the sipPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipPort(String value) {
        this.sipPort = value;
    }

    /**
     * Gets the value of the isSecure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSecure() {
        return isSecure;
    }

    /**
     * Sets the value of the isSecure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSecure(String value) {
        this.isSecure = value;
    }

}
