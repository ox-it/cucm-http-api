
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRouteFilterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRouteFilterReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeMembers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XRouteFilterMember" maxOccurs="unbounded" minOccurs="0"/>
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
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XRouteFilterMember" maxOccurs="unbounded" minOccurs="0"/>
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
 *                     &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XRouteFilterMember" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRouteFilterReq", propOrder = {
    "newName",
    "dialPlanName",
    "removeMembers",
    "addMembers",
    "members"
})
public class UpdateRouteFilterReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected XFkType dialPlanName;
    protected UpdateRouteFilterReq.RemoveMembers removeMembers;
    protected UpdateRouteFilterReq.AddMembers addMembers;
    protected UpdateRouteFilterReq.Members members;

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
     * Gets the value of the dialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDialPlanName() {
        return dialPlanName;
    }

    /**
     * Sets the value of the dialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDialPlanName(XFkType value) {
        this.dialPlanName = value;
    }

    /**
     * Gets the value of the removeMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRouteFilterReq.RemoveMembers }
     *     
     */
    public UpdateRouteFilterReq.RemoveMembers getRemoveMembers() {
        return removeMembers;
    }

    /**
     * Sets the value of the removeMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRouteFilterReq.RemoveMembers }
     *     
     */
    public void setRemoveMembers(UpdateRouteFilterReq.RemoveMembers value) {
        this.removeMembers = value;
    }

    /**
     * Gets the value of the addMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRouteFilterReq.AddMembers }
     *     
     */
    public UpdateRouteFilterReq.AddMembers getAddMembers() {
        return addMembers;
    }

    /**
     * Sets the value of the addMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRouteFilterReq.AddMembers }
     *     
     */
    public void setAddMembers(UpdateRouteFilterReq.AddMembers value) {
        this.addMembers = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRouteFilterReq.Members }
     *     
     */
    public UpdateRouteFilterReq.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRouteFilterReq.Members }
     *     
     */
    public void setMembers(UpdateRouteFilterReq.Members value) {
        this.members = value;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XRouteFilterMember" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<XRouteFilterMember> member;

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
         * {@link XRouteFilterMember }
         * 
         * 
         */
        public List<XRouteFilterMember> getMember() {
            if (member == null) {
                member = new ArrayList<XRouteFilterMember>();
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XRouteFilterMember" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<XRouteFilterMember> member;

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
         * {@link XRouteFilterMember }
         * 
         * 
         */
        public List<XRouteFilterMember> getMember() {
            if (member == null) {
                member = new ArrayList<XRouteFilterMember>();
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XRouteFilterMember" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<XRouteFilterMember> member;

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
         * {@link XRouteFilterMember }
         * 
         * 
         */
        public List<XRouteFilterMember> getMember() {
            if (member == null) {
                member = new ArrayList<XRouteFilterMember>();
            }
            return this.member;
        }

    }

}
