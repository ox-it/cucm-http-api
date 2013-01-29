
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveSafCcdPurgeBlockLearnedRoutesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveSafCcdPurgeBlockLearnedRoutesReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveSafCcdPurgeBlockLearnedRoutesReq", propOrder = {
    "uuid",
    "learnedPattern",
    "learnedPatternPrefix",
    "callControlIdentity",
    "ipAddress"
})
public class RemoveSafCcdPurgeBlockLearnedRoutesReq {

    protected String uuid;
    protected String learnedPattern;
    protected String learnedPatternPrefix;
    protected String callControlIdentity;
    protected String ipAddress;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}
