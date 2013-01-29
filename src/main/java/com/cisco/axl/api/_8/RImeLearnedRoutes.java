
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RImeLearnedRoutes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RImeLearnedRoutes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="e164Did" type="{http://www.cisco.com/AXL/API/8.5}String32" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="signaling" type="{http://www.cisco.com/AXL/API/8.5}String1024" minOccurs="0"/>
 *         &lt;element name="learnedOn" type="{http://www.cisco.com/AXL/API/8.5}String32" minOccurs="0"/>
 *         &lt;element name="expiresOn" type="{http://www.cisco.com/AXL/API/8.5}String32" minOccurs="0"/>
 *         &lt;element name="adminEnabled" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
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
@XmlType(name = "RImeLearnedRoutes", propOrder = {
    "e164Did",
    "domain",
    "signaling",
    "learnedOn",
    "expiresOn",
    "adminEnabled"
})
public class RImeLearnedRoutes {

    protected String e164Did;
    protected String domain;
    protected String signaling;
    protected String learnedOn;
    protected String expiresOn;
    @XmlElement(defaultValue = "false")
    protected String adminEnabled;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the e164Did property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE164Did() {
        return e164Did;
    }

    /**
     * Sets the value of the e164Did property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE164Did(String value) {
        this.e164Did = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the signaling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaling() {
        return signaling;
    }

    /**
     * Sets the value of the signaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaling(String value) {
        this.signaling = value;
    }

    /**
     * Gets the value of the learnedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnedOn() {
        return learnedOn;
    }

    /**
     * Sets the value of the learnedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnedOn(String value) {
        this.learnedOn = value;
    }

    /**
     * Gets the value of the expiresOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiresOn() {
        return expiresOn;
    }

    /**
     * Sets the value of the expiresOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiresOn(String value) {
        this.expiresOn = value;
    }

    /**
     * Gets the value of the adminEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminEnabled() {
        return adminEnabled;
    }

    /**
     * Sets the value of the adminEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminEnabled(String value) {
        this.adminEnabled = value;
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
