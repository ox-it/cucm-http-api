
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for XCss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueName50"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="members" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XCallingSearchSpaceMember" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="partitionUsage" type="{http://www.cisco.com/AXL/API/8.0}XPartitionUsage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCss", propOrder = {
    "name",
    "description",
    "members",
    "partitionUsage"
})
public class XCss {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    protected String description;
    protected XCss.Members members;
    @XmlElement(defaultValue = "General")
    protected String partitionUsage;

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
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link XCss.Members }
     *     
     */
    public XCss.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCss.Members }
     *     
     */
    public void setMembers(XCss.Members value) {
        this.members = value;
    }

    /**
     * Gets the value of the partitionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionUsage() {
        return partitionUsage;
    }

    /**
     * Sets the value of the partitionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionUsage(String value) {
        this.partitionUsage = value;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XCallingSearchSpaceMember" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<XCallingSearchSpaceMember> member;

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
         * {@link XCallingSearchSpaceMember }
         * 
         * 
         */
        public List<XCallingSearchSpaceMember> getMember() {
            if (member == null) {
                member = new ArrayList<XCallingSearchSpaceMember>();
            }
            return this.member;
        }

    }

}
