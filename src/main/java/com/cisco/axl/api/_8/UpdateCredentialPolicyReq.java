
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCredentialPolicyReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCredentialPolicyReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="failedLogon" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="resetFailedLogonAttempts" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="lockoutDuration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="credChangeDuration" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="credExpiresAfter" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="minCredLength" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="prevCredStoredNum" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="inactiveDaysAllowed" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="expiryWarningDays" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="trivialCredCheck" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCredentialPolicyReq", propOrder = {
    "newName",
    "failedLogon",
    "resetFailedLogonAttempts",
    "lockoutDuration",
    "credChangeDuration",
    "credExpiresAfter",
    "minCredLength",
    "prevCredStoredNum",
    "inactiveDaysAllowed",
    "expiryWarningDays",
    "trivialCredCheck"
})
public class UpdateCredentialPolicyReq
    extends NameAndGUIDRequest
{

    protected String newName;
    @XmlElement(defaultValue = "3")
    protected String failedLogon;
    @XmlElement(defaultValue = "30")
    protected String resetFailedLogonAttempts;
    @XmlElement(defaultValue = "30")
    protected String lockoutDuration;
    @XmlElement(defaultValue = "0")
    protected String credChangeDuration;
    @XmlElement(defaultValue = "180")
    protected String credExpiresAfter;
    @XmlElement(defaultValue = "8")
    protected String minCredLength;
    @XmlElement(defaultValue = "12")
    protected String prevCredStoredNum;
    @XmlElement(defaultValue = "0")
    protected String inactiveDaysAllowed;
    @XmlElement(defaultValue = "0")
    protected String expiryWarningDays;
    @XmlElement(defaultValue = "true")
    protected String trivialCredCheck;

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
     * Gets the value of the failedLogon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedLogon() {
        return failedLogon;
    }

    /**
     * Sets the value of the failedLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedLogon(String value) {
        this.failedLogon = value;
    }

    /**
     * Gets the value of the resetFailedLogonAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetFailedLogonAttempts() {
        return resetFailedLogonAttempts;
    }

    /**
     * Sets the value of the resetFailedLogonAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetFailedLogonAttempts(String value) {
        this.resetFailedLogonAttempts = value;
    }

    /**
     * Gets the value of the lockoutDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockoutDuration() {
        return lockoutDuration;
    }

    /**
     * Sets the value of the lockoutDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockoutDuration(String value) {
        this.lockoutDuration = value;
    }

    /**
     * Gets the value of the credChangeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredChangeDuration() {
        return credChangeDuration;
    }

    /**
     * Sets the value of the credChangeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredChangeDuration(String value) {
        this.credChangeDuration = value;
    }

    /**
     * Gets the value of the credExpiresAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredExpiresAfter() {
        return credExpiresAfter;
    }

    /**
     * Sets the value of the credExpiresAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredExpiresAfter(String value) {
        this.credExpiresAfter = value;
    }

    /**
     * Gets the value of the minCredLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCredLength() {
        return minCredLength;
    }

    /**
     * Sets the value of the minCredLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCredLength(String value) {
        this.minCredLength = value;
    }

    /**
     * Gets the value of the prevCredStoredNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevCredStoredNum() {
        return prevCredStoredNum;
    }

    /**
     * Sets the value of the prevCredStoredNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevCredStoredNum(String value) {
        this.prevCredStoredNum = value;
    }

    /**
     * Gets the value of the inactiveDaysAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveDaysAllowed() {
        return inactiveDaysAllowed;
    }

    /**
     * Sets the value of the inactiveDaysAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveDaysAllowed(String value) {
        this.inactiveDaysAllowed = value;
    }

    /**
     * Gets the value of the expiryWarningDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryWarningDays() {
        return expiryWarningDays;
    }

    /**
     * Sets the value of the expiryWarningDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryWarningDays(String value) {
        this.expiryWarningDays = value;
    }

    /**
     * Gets the value of the trivialCredCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrivialCredCheck() {
        return trivialCredCheck;
    }

    /**
     * Sets the value of the trivialCredCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrivialCredCheck(String value) {
        this.trivialCredCheck = value;
    }

}
