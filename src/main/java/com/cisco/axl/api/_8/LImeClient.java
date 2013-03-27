
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LImeClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LImeClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="isActivated" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="sipTrunkName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="primaryImeServerName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="secondaryImeServerName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="learnedRouteFilterGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="exclusionNumberGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="firewallName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
@XmlType(name = "LImeClient", propOrder = {
    "name",
    "description",
    "domain",
    "isActivated",
    "sipTrunkName",
    "primaryImeServerName",
    "secondaryImeServerName",
    "learnedRouteFilterGroupName",
    "exclusionNumberGroupName",
    "firewallName"
})
public class LImeClient {

    protected String name;
    protected String description;
    protected String domain;
    protected String isActivated;
    protected XFkType sipTrunkName;
    protected XFkType primaryImeServerName;
    protected XFkType secondaryImeServerName;
    protected XFkType learnedRouteFilterGroupName;
    protected XFkType exclusionNumberGroupName;
    protected XFkType firewallName;
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
     * Gets the value of the isActivated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActivated() {
        return isActivated;
    }

    /**
     * Sets the value of the isActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActivated(String value) {
        this.isActivated = value;
    }

    /**
     * Gets the value of the sipTrunkName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipTrunkName() {
        return sipTrunkName;
    }

    /**
     * Sets the value of the sipTrunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipTrunkName(XFkType value) {
        this.sipTrunkName = value;
    }

    /**
     * Gets the value of the primaryImeServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPrimaryImeServerName() {
        return primaryImeServerName;
    }

    /**
     * Sets the value of the primaryImeServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPrimaryImeServerName(XFkType value) {
        this.primaryImeServerName = value;
    }

    /**
     * Gets the value of the secondaryImeServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSecondaryImeServerName() {
        return secondaryImeServerName;
    }

    /**
     * Sets the value of the secondaryImeServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSecondaryImeServerName(XFkType value) {
        this.secondaryImeServerName = value;
    }

    /**
     * Gets the value of the learnedRouteFilterGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLearnedRouteFilterGroupName() {
        return learnedRouteFilterGroupName;
    }

    /**
     * Sets the value of the learnedRouteFilterGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLearnedRouteFilterGroupName(XFkType value) {
        this.learnedRouteFilterGroupName = value;
    }

    /**
     * Gets the value of the exclusionNumberGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getExclusionNumberGroupName() {
        return exclusionNumberGroupName;
    }

    /**
     * Sets the value of the exclusionNumberGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setExclusionNumberGroupName(XFkType value) {
        this.exclusionNumberGroupName = value;
    }

    /**
     * Gets the value of the firewallName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getFirewallName() {
        return firewallName;
    }

    /**
     * Sets the value of the firewallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setFirewallName(XFkType value) {
        this.firewallName = value;
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
