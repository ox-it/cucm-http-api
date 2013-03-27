
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSrst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSrst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SipNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SipPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="isSecure" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSrst", propOrder = {
    "name",
    "port",
    "ipAddress",
    "sipNetwork",
    "sipPort",
    "isSecure"
})
public class XSrst {

    protected String name;
    @XmlElement(defaultValue = "2000")
    protected String port;
    protected String ipAddress;
    @XmlElement(name = "SipNetwork")
    protected String sipNetwork;
    @XmlElement(name = "SipPort", defaultValue = "5060")
    protected String sipPort;
    protected String isSecure;

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
