
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSafCcdPurgeBlockLearnedRoutes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSafCcdPurgeBlockLearnedRoutes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="learnedPattern" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="learnedPatternPrefix" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="callControlIdentity" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSafCcdPurgeBlockLearnedRoutes", propOrder = {
    "learnedPattern",
    "learnedPatternPrefix",
    "callControlIdentity",
    "ipAddress"
})
public class XSafCcdPurgeBlockLearnedRoutes {

    protected String learnedPattern;
    protected String learnedPatternPrefix;
    protected String callControlIdentity;
    protected String ipAddress;

    /**
     * Gets the value of the learnedPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnedPattern() {
        return learnedPattern;
    }

    /**
     * Sets the value of the learnedPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnedPattern(String value) {
        this.learnedPattern = value;
    }

    /**
     * Gets the value of the learnedPatternPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnedPatternPrefix() {
        return learnedPatternPrefix;
    }

    /**
     * Sets the value of the learnedPatternPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnedPatternPrefix(String value) {
        this.learnedPatternPrefix = value;
    }

    /**
     * Gets the value of the callControlIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallControlIdentity() {
        return callControlIdentity;
    }

    /**
     * Sets the value of the callControlIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallControlIdentity(String value) {
        this.callControlIdentity = value;
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

}
