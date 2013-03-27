
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateImeServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateImeServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="deviceSecurityMode" type="{http://www.cisco.com/AXL/API/8.0}XServerSecurityMode" minOccurs="0"/>
 *         &lt;element name="applicationUser" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="reconnectInterval" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateImeServerReq", propOrder = {
    "newName",
    "description",
    "ipAddress",
    "port",
    "deviceSecurityMode",
    "applicationUser",
    "reconnectInterval"
})
public class UpdateImeServerReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String ipAddress;
    @XmlElement(defaultValue = "5620")
    protected String port;
    @XmlElement(defaultValue = "Authenticated")
    protected String deviceSecurityMode;
    protected XFkType applicationUser;
    @XmlElement(defaultValue = "120")
    protected String reconnectInterval;

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
     * Gets the value of the deviceSecurityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSecurityMode() {
        return deviceSecurityMode;
    }

    /**
     * Sets the value of the deviceSecurityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSecurityMode(String value) {
        this.deviceSecurityMode = value;
    }

    /**
     * Gets the value of the applicationUser property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getApplicationUser() {
        return applicationUser;
    }

    /**
     * Sets the value of the applicationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setApplicationUser(XFkType value) {
        this.applicationUser = value;
    }

    /**
     * Gets the value of the reconnectInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconnectInterval() {
        return reconnectInterval;
    }

    /**
     * Sets the value of the reconnectInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconnectInterval(String value) {
        this.reconnectInterval = value;
    }

}
