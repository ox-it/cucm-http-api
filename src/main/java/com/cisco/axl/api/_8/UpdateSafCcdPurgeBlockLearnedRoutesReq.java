
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSafCcdPurgeBlockLearnedRoutesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSafCcdPurgeBlockLearnedRoutesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="learnedPattern" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *             &lt;element name="learnedPatternPrefix" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *             &lt;element name="callControlIdentity" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *             &lt;element name="ipAddress" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="newLearnedPattern" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="newLearnedPatternPrefix" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="newCallControlIdentity" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="newIpAddress" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSafCcdPurgeBlockLearnedRoutesReq", propOrder = {
    "uuid",
    "learnedPattern",
    "learnedPatternPrefix",
    "callControlIdentity",
    "ipAddress",
    "newLearnedPattern",
    "newLearnedPatternPrefix",
    "newCallControlIdentity",
    "newIpAddress"
})
public class UpdateSafCcdPurgeBlockLearnedRoutesReq
    extends APIRequest
{

    protected String uuid;
    protected String learnedPattern;
    protected String learnedPatternPrefix;
    protected String callControlIdentity;
    protected String ipAddress;
    protected String newLearnedPattern;
    protected String newLearnedPatternPrefix;
    protected String newCallControlIdentity;
    protected String newIpAddress;

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

    /**
     * Gets the value of the newLearnedPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewLearnedPattern() {
        return newLearnedPattern;
    }

    /**
     * Sets the value of the newLearnedPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewLearnedPattern(String value) {
        this.newLearnedPattern = value;
    }

    /**
     * Gets the value of the newLearnedPatternPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewLearnedPatternPrefix() {
        return newLearnedPatternPrefix;
    }

    /**
     * Sets the value of the newLearnedPatternPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewLearnedPatternPrefix(String value) {
        this.newLearnedPatternPrefix = value;
    }

    /**
     * Gets the value of the newCallControlIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCallControlIdentity() {
        return newCallControlIdentity;
    }

    /**
     * Sets the value of the newCallControlIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCallControlIdentity(String value) {
        this.newCallControlIdentity = value;
    }

    /**
     * Gets the value of the newIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIpAddress() {
        return newIpAddress;
    }

    /**
     * Sets the value of the newIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIpAddress(String value) {
        this.newIpAddress = value;
    }

}
