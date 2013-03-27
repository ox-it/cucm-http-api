
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UpdateCallPickupGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCallPickupGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}Name"/>
 *           &lt;sequence>
 *             &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="newPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newRoutePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}Name" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeMembers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addMembers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="members" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="pickupNotification" type="{http://www.cisco.com/AXL/API/8.0}XPickupNotification" minOccurs="0"/>
 *         &lt;element name="pickupNotificationTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callInfoForPickupNotification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="callingPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="calledPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCallPickupGroupReq", propOrder = {
    "uuid",
    "name",
    "pattern",
    "routePartitionName",
    "newPattern",
    "description",
    "newRoutePartitionName",
    "newName",
    "removeMembers",
    "addMembers",
    "members",
    "pickupNotification",
    "pickupNotificationTimer",
    "callInfoForPickupNotification"
})
public class UpdateCallPickupGroupReq
    extends APIRequest
{

    protected String uuid;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String name;
    protected String pattern;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    protected String newPattern;
    protected String description;
    @XmlElementRef(name = "newRoutePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> newRoutePartitionName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String newName;
    protected UpdateCallPickupGroupReq.RemoveMembers removeMembers;
    protected UpdateCallPickupGroupReq.AddMembers addMembers;
    protected UpdateCallPickupGroupReq.Members members;
    @XmlElement(defaultValue = "No Alert")
    protected String pickupNotification;
    @XmlElement(defaultValue = "6")
    protected String pickupNotificationTimer;
    protected UpdateCallPickupGroupReq.CallInfoForPickupNotification callInfoForPickupNotification;

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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartitionName(JAXBElement<XFkType> value) {
        this.routePartitionName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the newPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPattern() {
        return newPattern;
    }

    /**
     * Sets the value of the newPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPattern(String value) {
        this.newPattern = value;
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
     * Gets the value of the newRoutePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNewRoutePartitionName() {
        return newRoutePartitionName;
    }

    /**
     * Sets the value of the newRoutePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNewRoutePartitionName(JAXBElement<XFkType> value) {
        this.newRoutePartitionName = ((JAXBElement<XFkType> ) value);
    }

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
     * Gets the value of the removeMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCallPickupGroupReq.RemoveMembers }
     *     
     */
    public UpdateCallPickupGroupReq.RemoveMembers getRemoveMembers() {
        return removeMembers;
    }

    /**
     * Sets the value of the removeMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCallPickupGroupReq.RemoveMembers }
     *     
     */
    public void setRemoveMembers(UpdateCallPickupGroupReq.RemoveMembers value) {
        this.removeMembers = value;
    }

    /**
     * Gets the value of the addMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCallPickupGroupReq.AddMembers }
     *     
     */
    public UpdateCallPickupGroupReq.AddMembers getAddMembers() {
        return addMembers;
    }

    /**
     * Sets the value of the addMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCallPickupGroupReq.AddMembers }
     *     
     */
    public void setAddMembers(UpdateCallPickupGroupReq.AddMembers value) {
        this.addMembers = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCallPickupGroupReq.Members }
     *     
     */
    public UpdateCallPickupGroupReq.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCallPickupGroupReq.Members }
     *     
     */
    public void setMembers(UpdateCallPickupGroupReq.Members value) {
        this.members = value;
    }

    /**
     * Gets the value of the pickupNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNotification() {
        return pickupNotification;
    }

    /**
     * Sets the value of the pickupNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNotification(String value) {
        this.pickupNotification = value;
    }

    /**
     * Gets the value of the pickupNotificationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNotificationTimer() {
        return pickupNotificationTimer;
    }

    /**
     * Sets the value of the pickupNotificationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNotificationTimer(String value) {
        this.pickupNotificationTimer = value;
    }

    /**
     * Gets the value of the callInfoForPickupNotification property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCallPickupGroupReq.CallInfoForPickupNotification }
     *     
     */
    public UpdateCallPickupGroupReq.CallInfoForPickupNotification getCallInfoForPickupNotification() {
        return callInfoForPickupNotification;
    }

    /**
     * Sets the value of the callInfoForPickupNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCallPickupGroupReq.CallInfoForPickupNotification }
     *     
     */
    public void setCallInfoForPickupNotification(UpdateCallPickupGroupReq.CallInfoForPickupNotification value) {
        this.callInfoForPickupNotification = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "member"
    })
    public static class AddMembers
        extends XCommonMembersExtension
    {

        protected List<XPickupGroupMember> member;

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPickupGroupMember }
         * 
         * 
         */
        public List<XPickupGroupMember> getMember() {
            if (member == null) {
                member = new ArrayList<XPickupGroupMember>();
            }
            return this.member;
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
     *         &lt;element name="callingPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="calledPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
        "callingPartyInfo",
        "calledPartyInfo"
    })
    public static class CallInfoForPickupNotification {

        @XmlElement(defaultValue = "false")
        protected String callingPartyInfo;
        @XmlElement(defaultValue = "false")
        protected String calledPartyInfo;

        /**
         * Gets the value of the callingPartyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallingPartyInfo() {
            return callingPartyInfo;
        }

        /**
         * Sets the value of the callingPartyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallingPartyInfo(String value) {
            this.callingPartyInfo = value;
        }

        /**
         * Gets the value of the calledPartyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalledPartyInfo() {
            return calledPartyInfo;
        }

        /**
         * Sets the value of the calledPartyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalledPartyInfo(String value) {
            this.calledPartyInfo = value;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "member"
    })
    public static class Members
        extends XCommonMembersExtension
    {

        protected List<XPickupGroupMember> member;

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPickupGroupMember }
         * 
         * 
         */
        public List<XPickupGroupMember> getMember() {
            if (member == null) {
                member = new ArrayList<XPickupGroupMember>();
            }
            return this.member;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XPickupGroupMember" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "member"
    })
    public static class RemoveMembers
        extends XCommonMembersExtension
    {

        protected List<XPickupGroupMember> member;

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPickupGroupMember }
         * 
         * 
         */
        public List<XPickupGroupMember> getMember() {
            if (member == null) {
                member = new ArrayList<XPickupGroupMember>();
            }
            return this.member;
        }

    }

}
