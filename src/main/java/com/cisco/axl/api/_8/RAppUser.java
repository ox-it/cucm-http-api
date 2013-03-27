
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RAppUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAppUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordCredentials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pwdCredPolicyName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                   &lt;element name="pwdCredUserCantChange" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredUserMustChange" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredTimeChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pwdCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pwdCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="digestCredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="acceptPresenceSubscription" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="acceptOutOfDialogRefer" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="acceptUnsolicitedNotification" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="allowReplaceHeader" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="isStandard" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="associatedDevices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="device" type="{http://www.cisco.com/AXL/API/8.0}String50" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="associatedGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="userGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
 *                             &lt;element name="userRoles" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/8.0}String100" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="associatedCapfProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="capfProfileInstanceId" type="{http://www.cisco.com/AXL/API/8.0}String128" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ctiControlledDeviceProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="deviceProfile" type="{http://www.cisco.com/AXL/API/8.0}String50" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "RAppUser", propOrder = {
    "userid",
    "password",
    "passwordCredentials",
    "digestCredentials",
    "presenceGroupName",
    "acceptPresenceSubscription",
    "acceptOutOfDialogRefer",
    "acceptUnsolicitedNotification",
    "allowReplaceHeader",
    "isStandard",
    "associatedDevices",
    "associatedGroups",
    "associatedCapfProfiles",
    "ctiControlledDeviceProfiles"
})
public class RAppUser {

    protected String userid;
    protected String password;
    protected RAppUser.PasswordCredentials passwordCredentials;
    protected String digestCredentials;
    protected XFkType presenceGroupName;
    protected String acceptPresenceSubscription;
    protected String acceptOutOfDialogRefer;
    protected String acceptUnsolicitedNotification;
    protected String allowReplaceHeader;
    protected String isStandard;
    protected RAppUser.AssociatedDevices associatedDevices;
    protected RAppUser.AssociatedGroups associatedGroups;
    protected RAppUser.AssociatedCapfProfiles associatedCapfProfiles;
    protected RAppUser.CtiControlledDeviceProfiles ctiControlledDeviceProfiles;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link RAppUser.PasswordCredentials }
     *     
     */
    public RAppUser.PasswordCredentials getPasswordCredentials() {
        return passwordCredentials;
    }

    /**
     * Sets the value of the passwordCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAppUser.PasswordCredentials }
     *     
     */
    public void setPasswordCredentials(RAppUser.PasswordCredentials value) {
        this.passwordCredentials = value;
    }

    /**
     * Gets the value of the digestCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestCredentials() {
        return digestCredentials;
    }

    /**
     * Sets the value of the digestCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestCredentials(String value) {
        this.digestCredentials = value;
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
     * Gets the value of the acceptPresenceSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptPresenceSubscription() {
        return acceptPresenceSubscription;
    }

    /**
     * Sets the value of the acceptPresenceSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptPresenceSubscription(String value) {
        this.acceptPresenceSubscription = value;
    }

    /**
     * Gets the value of the acceptOutOfDialogRefer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptOutOfDialogRefer() {
        return acceptOutOfDialogRefer;
    }

    /**
     * Sets the value of the acceptOutOfDialogRefer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptOutOfDialogRefer(String value) {
        this.acceptOutOfDialogRefer = value;
    }

    /**
     * Gets the value of the acceptUnsolicitedNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptUnsolicitedNotification() {
        return acceptUnsolicitedNotification;
    }

    /**
     * Sets the value of the acceptUnsolicitedNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptUnsolicitedNotification(String value) {
        this.acceptUnsolicitedNotification = value;
    }

    /**
     * Gets the value of the allowReplaceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowReplaceHeader() {
        return allowReplaceHeader;
    }

    /**
     * Sets the value of the allowReplaceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowReplaceHeader(String value) {
        this.allowReplaceHeader = value;
    }

    /**
     * Gets the value of the isStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStandard() {
        return isStandard;
    }

    /**
     * Sets the value of the isStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStandard(String value) {
        this.isStandard = value;
    }

    /**
     * Gets the value of the associatedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link RAppUser.AssociatedDevices }
     *     
     */
    public RAppUser.AssociatedDevices getAssociatedDevices() {
        return associatedDevices;
    }

    /**
     * Sets the value of the associatedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAppUser.AssociatedDevices }
     *     
     */
    public void setAssociatedDevices(RAppUser.AssociatedDevices value) {
        this.associatedDevices = value;
    }

    /**
     * Gets the value of the associatedGroups property.
     * 
     * @return
     *     possible object is
     *     {@link RAppUser.AssociatedGroups }
     *     
     */
    public RAppUser.AssociatedGroups getAssociatedGroups() {
        return associatedGroups;
    }

    /**
     * Sets the value of the associatedGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAppUser.AssociatedGroups }
     *     
     */
    public void setAssociatedGroups(RAppUser.AssociatedGroups value) {
        this.associatedGroups = value;
    }

    /**
     * Gets the value of the associatedCapfProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link RAppUser.AssociatedCapfProfiles }
     *     
     */
    public RAppUser.AssociatedCapfProfiles getAssociatedCapfProfiles() {
        return associatedCapfProfiles;
    }

    /**
     * Sets the value of the associatedCapfProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAppUser.AssociatedCapfProfiles }
     *     
     */
    public void setAssociatedCapfProfiles(RAppUser.AssociatedCapfProfiles value) {
        this.associatedCapfProfiles = value;
    }

    /**
     * Gets the value of the ctiControlledDeviceProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link RAppUser.CtiControlledDeviceProfiles }
     *     
     */
    public RAppUser.CtiControlledDeviceProfiles getCtiControlledDeviceProfiles() {
        return ctiControlledDeviceProfiles;
    }

    /**
     * Sets the value of the ctiControlledDeviceProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAppUser.CtiControlledDeviceProfiles }
     *     
     */
    public void setCtiControlledDeviceProfiles(RAppUser.CtiControlledDeviceProfiles value) {
        this.ctiControlledDeviceProfiles = value;
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
     *         &lt;element name="capfProfileInstanceId" type="{http://www.cisco.com/AXL/API/8.0}String128" maxOccurs="unbounded" minOccurs="0"/>
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
        "capfProfileInstanceId"
    })
    public static class AssociatedCapfProfiles {

        protected List<String> capfProfileInstanceId;

        /**
         * Gets the value of the capfProfileInstanceId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capfProfileInstanceId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapfProfileInstanceId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCapfProfileInstanceId() {
            if (capfProfileInstanceId == null) {
                capfProfileInstanceId = new ArrayList<String>();
            }
            return this.capfProfileInstanceId;
        }

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
     *         &lt;element name="device" type="{http://www.cisco.com/AXL/API/8.0}String50" maxOccurs="unbounded" minOccurs="0"/>
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
        "device"
    })
    public static class AssociatedDevices {

        protected List<String> device;

        /**
         * Gets the value of the device property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the device property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDevice() {
            if (device == null) {
                device = new ArrayList<String>();
            }
            return this.device;
        }

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
     *         &lt;element name="userGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
     *                   &lt;element name="userRoles" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/8.0}String100" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "userGroup"
    })
    public static class AssociatedGroups {

        protected List<RAppUser.AssociatedGroups.UserGroup> userGroup;

        /**
         * Gets the value of the userGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RAppUser.AssociatedGroups.UserGroup }
         * 
         * 
         */
        public List<RAppUser.AssociatedGroups.UserGroup> getUserGroup() {
            if (userGroup == null) {
                userGroup = new ArrayList<RAppUser.AssociatedGroups.UserGroup>();
            }
            return this.userGroup;
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
         *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
         *         &lt;element name="userRoles" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/8.0}String100" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "name",
            "userRoles"
        })
        public static class UserGroup {

            protected String name;
            protected RAppUser.AssociatedGroups.UserGroup.UserRoles userRoles;

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
             * Gets the value of the userRoles property.
             * 
             * @return
             *     possible object is
             *     {@link RAppUser.AssociatedGroups.UserGroup.UserRoles }
             *     
             */
            public RAppUser.AssociatedGroups.UserGroup.UserRoles getUserRoles() {
                return userRoles;
            }

            /**
             * Sets the value of the userRoles property.
             * 
             * @param value
             *     allowed object is
             *     {@link RAppUser.AssociatedGroups.UserGroup.UserRoles }
             *     
             */
            public void setUserRoles(RAppUser.AssociatedGroups.UserGroup.UserRoles value) {
                this.userRoles = value;
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
             *         &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/8.0}String100" maxOccurs="unbounded" minOccurs="0"/>
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
                "userRole"
            })
            public static class UserRoles {

                protected List<String> userRole;

                /**
                 * Gets the value of the userRole property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the userRole property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUserRole().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getUserRole() {
                    if (userRole == null) {
                        userRole = new ArrayList<String>();
                    }
                    return this.userRole;
                }

            }

        }

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
     *         &lt;element name="deviceProfile" type="{http://www.cisco.com/AXL/API/8.0}String50" maxOccurs="unbounded" minOccurs="0"/>
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
        "deviceProfile"
    })
    public static class CtiControlledDeviceProfiles {

        protected List<String> deviceProfile;

        /**
         * Gets the value of the deviceProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deviceProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeviceProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDeviceProfile() {
            if (deviceProfile == null) {
                deviceProfile = new ArrayList<String>();
            }
            return this.deviceProfile;
        }

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
     *         &lt;element name="pwdCredPolicyName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
     *         &lt;element name="pwdCredUserCantChange" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredUserMustChange" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredTimeChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pwdCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pwdCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
        "pwdCredPolicyName",
        "pwdCredUserCantChange",
        "pwdCredUserMustChange",
        "pwdCredDoesNotExpire",
        "pwdCredTimeChanged",
        "pwdCredTimeAdminLockout",
        "pwdCredLockedByAdministrator"
    })
    public static class PasswordCredentials {

        protected XFkType pwdCredPolicyName;
        protected String pwdCredUserCantChange;
        protected String pwdCredUserMustChange;
        protected String pwdCredDoesNotExpire;
        protected String pwdCredTimeChanged;
        protected String pwdCredTimeAdminLockout;
        protected String pwdCredLockedByAdministrator;

        /**
         * Gets the value of the pwdCredPolicyName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getPwdCredPolicyName() {
            return pwdCredPolicyName;
        }

        /**
         * Sets the value of the pwdCredPolicyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setPwdCredPolicyName(XFkType value) {
            this.pwdCredPolicyName = value;
        }

        /**
         * Gets the value of the pwdCredUserCantChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredUserCantChange() {
            return pwdCredUserCantChange;
        }

        /**
         * Sets the value of the pwdCredUserCantChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredUserCantChange(String value) {
            this.pwdCredUserCantChange = value;
        }

        /**
         * Gets the value of the pwdCredUserMustChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredUserMustChange() {
            return pwdCredUserMustChange;
        }

        /**
         * Sets the value of the pwdCredUserMustChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredUserMustChange(String value) {
            this.pwdCredUserMustChange = value;
        }

        /**
         * Gets the value of the pwdCredDoesNotExpire property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredDoesNotExpire() {
            return pwdCredDoesNotExpire;
        }

        /**
         * Sets the value of the pwdCredDoesNotExpire property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredDoesNotExpire(String value) {
            this.pwdCredDoesNotExpire = value;
        }

        /**
         * Gets the value of the pwdCredTimeChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredTimeChanged() {
            return pwdCredTimeChanged;
        }

        /**
         * Sets the value of the pwdCredTimeChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredTimeChanged(String value) {
            this.pwdCredTimeChanged = value;
        }

        /**
         * Gets the value of the pwdCredTimeAdminLockout property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredTimeAdminLockout() {
            return pwdCredTimeAdminLockout;
        }

        /**
         * Sets the value of the pwdCredTimeAdminLockout property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredTimeAdminLockout(String value) {
            this.pwdCredTimeAdminLockout = value;
        }

        /**
         * Gets the value of the pwdCredLockedByAdministrator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredLockedByAdministrator() {
            return pwdCredLockedByAdministrator;
        }

        /**
         * Sets the value of the pwdCredLockedByAdministrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredLockedByAdministrator(String value) {
            this.pwdCredLockedByAdministrator = value;
        }

    }

}
