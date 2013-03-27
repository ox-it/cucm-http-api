
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="mailid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/8.0}XUserLocale" minOccurs="0"/>
 *         &lt;element name="primaryExtension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                   &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="associatedPc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableCti" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="enableMobility" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileVoiceAccess" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="maxDeskPickupWaitTime" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="remoteDestinationLimit" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="enableEmcc" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
@XmlType(name = "LUser", propOrder = {
    "firstName",
    "middleName",
    "lastName",
    "userid",
    "telephoneNumber",
    "mailid",
    "department",
    "manager",
    "userLocale",
    "primaryExtension",
    "associatedPc",
    "enableCti",
    "presenceGroupName",
    "subscribeCallingSearchSpaceName",
    "enableMobility",
    "enableMobileVoiceAccess",
    "maxDeskPickupWaitTime",
    "remoteDestinationLimit",
    "status",
    "enableEmcc"
})
public class LUser {

    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String userid;
    protected String telephoneNumber;
    protected String mailid;
    protected String department;
    protected String manager;
    protected String userLocale;
    protected LUser.PrimaryExtension primaryExtension;
    protected String associatedPc;
    protected String enableCti;
    protected XFkType presenceGroupName;
    protected XFkType subscribeCallingSearchSpaceName;
    protected String enableMobility;
    protected String enableMobileVoiceAccess;
    protected String maxDeskPickupWaitTime;
    protected String remoteDestinationLimit;
    protected String status;
    protected String enableEmcc;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the mailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailid() {
        return mailid;
    }

    /**
     * Sets the value of the mailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailid(String value) {
        this.mailid = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the primaryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link LUser.PrimaryExtension }
     *     
     */
    public LUser.PrimaryExtension getPrimaryExtension() {
        return primaryExtension;
    }

    /**
     * Sets the value of the primaryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LUser.PrimaryExtension }
     *     
     */
    public void setPrimaryExtension(LUser.PrimaryExtension value) {
        this.primaryExtension = value;
    }

    /**
     * Gets the value of the associatedPc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedPc() {
        return associatedPc;
    }

    /**
     * Sets the value of the associatedPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedPc(String value) {
        this.associatedPc = value;
    }

    /**
     * Gets the value of the enableCti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableCti() {
        return enableCti;
    }

    /**
     * Sets the value of the enableCti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableCti(String value) {
        this.enableCti = value;
    }

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPresenceGroupName(XFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSubscribeCallingSearchSpaceName() {
        return subscribeCallingSearchSpaceName;
    }

    /**
     * Sets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSubscribeCallingSearchSpaceName(XFkType value) {
        this.subscribeCallingSearchSpaceName = value;
    }

    /**
     * Gets the value of the enableMobility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobility() {
        return enableMobility;
    }

    /**
     * Sets the value of the enableMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobility(String value) {
        this.enableMobility = value;
    }

    /**
     * Gets the value of the enableMobileVoiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobileVoiceAccess() {
        return enableMobileVoiceAccess;
    }

    /**
     * Sets the value of the enableMobileVoiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobileVoiceAccess(String value) {
        this.enableMobileVoiceAccess = value;
    }

    /**
     * Gets the value of the maxDeskPickupWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDeskPickupWaitTime() {
        return maxDeskPickupWaitTime;
    }

    /**
     * Sets the value of the maxDeskPickupWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDeskPickupWaitTime(String value) {
        this.maxDeskPickupWaitTime = value;
    }

    /**
     * Gets the value of the remoteDestinationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDestinationLimit() {
        return remoteDestinationLimit;
    }

    /**
     * Sets the value of the remoteDestinationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDestinationLimit(String value) {
        this.remoteDestinationLimit = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the enableEmcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableEmcc() {
        return enableEmcc;
    }

    /**
     * Sets the value of the enableEmcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableEmcc(String value) {
        this.enableEmcc = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pattern",
        "routePartitionName"
    })
    public static class PrimaryExtension {

        protected String pattern;
        protected String routePartitionName;

        /**
         * Gets the value of the pattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Sets the value of the pattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutePartitionName(String value) {
            this.routePartitionName = value;
        }

    }

}
