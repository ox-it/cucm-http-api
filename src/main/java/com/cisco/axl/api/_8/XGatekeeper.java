
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XGatekeeper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGatekeeper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="rrqTimeToLive" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="retryTimeout" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="enableDevice" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGatekeeper", propOrder = {
    "name",
    "description",
    "rrqTimeToLive",
    "retryTimeout",
    "enableDevice"
})
public class XGatekeeper {

    protected String name;
    protected String description;
    @XmlElement(defaultValue = "60")
    protected String rrqTimeToLive;
    @XmlElement(defaultValue = "300")
    protected String retryTimeout;
    @XmlElement(defaultValue = "true")
    protected String enableDevice;

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
