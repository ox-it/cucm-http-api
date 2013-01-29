
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCcdHostedDN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCcdHostedDN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="hostedPattern" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="CcdHostedDnGroup" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="pstnFailoverStripDigits" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="pstnFailoverPrependDigits" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="usePstnFailover" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
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
@XmlType(name = "RCcdHostedDN", propOrder = {
    "hostedPattern",
    "description",
    "ccdHostedDnGroup",
    "pstnFailoverStripDigits",
    "pstnFailoverPrependDigits",
    "usePstnFailover"
})
public class RCcdHostedDN {

    protected String hostedPattern;
    protected String description;
    @XmlElement(name = "CcdHostedDnGroup")
    protected XFkType ccdHostedDnGroup;
    protected String pstnFailoverStripDigits;
    protected String pstnFailoverPrependDigits;
    protected String usePstnFailover;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the hostedPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedPattern() {
        return hostedPattern;
    }

    /**
     * Sets the value of the hostedPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedPattern(String value) {
        this.hostedPattern = value;
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
     * Gets the value of the ccdHostedDnGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCcdHostedDnGroup() {
        return ccdHostedDnGroup;
    }

    /**
     * Sets the value of the ccdHostedDnGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCcdHostedDnGroup(XFkType value) {
        this.ccdHostedDnGroup = value;
    }

    /**
     * Gets the value of the pstnFailoverStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailoverStripDigits() {
        return pstnFailoverStripDigits;
    }

    /**
     * Sets the value of the pstnFailoverStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailoverStripDigits(String value) {
        this.pstnFailoverStripDigits = value;
    }

    /**
     * Gets the value of the pstnFailoverPrependDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailoverPrependDigits() {
        return pstnFailoverPrependDigits;
    }

    /**
     * Sets the value of the pstnFailoverPrependDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailoverPrependDigits(String value) {
        this.pstnFailoverPrependDigits = value;
    }

    /**
     * Gets the value of the usePstnFailover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePstnFailover() {
        return usePstnFailover;
    }

    /**
     * Sets the value of the usePstnFailover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePstnFailover(String value) {
        this.usePstnFailover = value;
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
