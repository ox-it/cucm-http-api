
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatekeeperReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatekeeperReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.5}UniqueString128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.5}String128" minOccurs="0"/>
 *         &lt;element name="rrqTimeToLive" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="retryTimeout" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="enableDevice" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatekeeperReq", propOrder = {
    "newName",
    "description",
    "rrqTimeToLive",
    "retryTimeout",
    "enableDevice"
})
public class UpdateGatekeeperReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    @XmlElement(defaultValue = "60")
    protected String rrqTimeToLive;
    @XmlElement(defaultValue = "300")
    protected String retryTimeout;
    @XmlElement(defaultValue = "true")
    protected String enableDevice;

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
     * Gets the value of the rrqTimeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrqTimeToLive() {
        return rrqTimeToLive;
    }

    /**
     * Sets the value of the rrqTimeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrqTimeToLive(String value) {
        this.rrqTimeToLive = value;
    }

    /**
     * Gets the value of the retryTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryTimeout() {
        return retryTimeout;
    }

    /**
     * Sets the value of the retryTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryTimeout(String value) {
        this.retryTimeout = value;
    }

    /**
     * Gets the value of the enableDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableDevice() {
        return enableDevice;
    }

    /**
     * Sets the value of the enableDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableDevice(String value) {
        this.enableDevice = value;
    }

}
