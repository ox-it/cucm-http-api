
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XTimeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XTimeSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="members">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XTimeScheduleTimePeriod" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="isPublished" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="timeScheduleCategory" type="{http://www.cisco.com/AXL/API/8.0}XTimeScheduleCategory" minOccurs="0"/>
 *         &lt;element name="todOwnerIdName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XTimeSchedule", propOrder = {
    "name",
    "members",
    "description",
    "isPublished",
    "timeScheduleCategory",
    "todOwnerIdName"
})
public class XTimeSchedule {

    protected String name;
    protected XTimeSchedule.Members members;
    protected String description;
    @XmlElement(defaultValue = "false")
    protected String isPublished;
    @XmlElement(defaultValue = "Regular")
    protected String timeScheduleCategory;
    @XmlElementRef(name = "todOwnerIdName", type = JAXBElement.class)
    protected JAXBElement<XFkType> todOwnerIdName;

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
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeSchedule.Members }
     *     
     */
    public XTimeSchedule.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeSchedule.Members }
     *     
     */
    public void setMembers(XTimeSchedule.Members value) {
        this.members = value;
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
     * Gets the value of the isPublished property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPublished(String value) {
        this.isPublished = value;
    }

    /**
     * Gets the value of the timeScheduleCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeScheduleCategory() {
        return timeScheduleCategory;
    }

    /**
     * Sets the value of the timeScheduleCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeScheduleCategory(String value) {
        this.timeScheduleCategory = value;
    }

    /**
     * Gets the value of the todOwnerIdName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getTodOwnerIdName() {
        return todOwnerIdName;
    }

    /**
     * Sets the value of the todOwnerIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setTodOwnerIdName(JAXBElement<XFkType> value) {
        this.todOwnerIdName = ((JAXBElement<XFkType> ) value);
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XTimeScheduleTimePeriod" maxOccurs="unbounded"/>
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

        protected List<XTimeScheduleTimePeriod> member;

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
         * {@link XTimeScheduleTimePeriod }
         * 
         * 
         */
        public List<XTimeScheduleTimePeriod> getMember() {
            if (member == null) {
                member = new ArrayList<XTimeScheduleTimePeriod>();
            }
            return this.member;
        }

    }

}
