
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UpdateLineGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLineGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}Name" minOccurs="0"/>
 *         &lt;element name="distributionAlgorithm" type="{http://www.cisco.com/AXL/API/8.0}XDistributeAlgorithm" minOccurs="0"/>
 *         &lt;element name="rnaReversionTimeOut" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="huntAlgorithmNoAnswer" type="{http://www.cisco.com/AXL/API/8.0}XHuntAlgorithm" minOccurs="0"/>
 *         &lt;element name="huntAlgorithmBusy" type="{http://www.cisco.com/AXL/API/8.0}XHuntAlgorithm" minOccurs="0"/>
 *         &lt;element name="huntAlgorithmNotAvailable" type="{http://www.cisco.com/AXL/API/8.0}XHuntAlgorithm" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeMembers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
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
 *                       &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
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
 *                     &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UpdateLineGroupReq", propOrder = {
    "newName",
    "distributionAlgorithm",
    "rnaReversionTimeOut",
    "huntAlgorithmNoAnswer",
    "huntAlgorithmBusy",
    "huntAlgorithmNotAvailable",
    "removeMembers",
    "addMembers",
    "members"
})
public class UpdateLineGroupReq
    extends NameAndGUIDRequest
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String newName;
    @XmlElement(defaultValue = "Longest Idle Time")
    protected String distributionAlgorithm;
    @XmlElement(defaultValue = "10")
    protected String rnaReversionTimeOut;
    @XmlElement(defaultValue = "Try next member; then, try next group in Hunt List")
    protected String huntAlgorithmNoAnswer;
    @XmlElement(defaultValue = "Try next member; then, try next group in Hunt List")
    protected String huntAlgorithmBusy;
    @XmlElement(defaultValue = "Try next member; then, try next group in Hunt List")
    protected String huntAlgorithmNotAvailable;
    protected UpdateLineGroupReq.RemoveMembers removeMembers;
    protected UpdateLineGroupReq.AddMembers addMembers;
    protected UpdateLineGroupReq.Members members;

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
     * Gets the value of the distributionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionAlgorithm() {
        return distributionAlgorithm;
    }

    /**
     * Sets the value of the distributionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionAlgorithm(String value) {
        this.distributionAlgorithm = value;
    }

    /**
     * Gets the value of the rnaReversionTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnaReversionTimeOut() {
        return rnaReversionTimeOut;
    }

    /**
     * Sets the value of the rnaReversionTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnaReversionTimeOut(String value) {
        this.rnaReversionTimeOut = value;
    }

    /**
     * Gets the value of the huntAlgorithmNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAlgorithmNoAnswer() {
        return huntAlgorithmNoAnswer;
    }

    /**
     * Sets the value of the huntAlgorithmNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAlgorithmNoAnswer(String value) {
        this.huntAlgorithmNoAnswer = value;
    }

    /**
     * Gets the value of the huntAlgorithmBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAlgorithmBusy() {
        return huntAlgorithmBusy;
    }

    /**
     * Sets the value of the huntAlgorithmBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAlgorithmBusy(String value) {
        this.huntAlgorithmBusy = value;
    }

    /**
     * Gets the value of the huntAlgorithmNotAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAlgorithmNotAvailable() {
        return huntAlgorithmNotAvailable;
    }

    /**
     * Sets the value of the huntAlgorithmNotAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAlgorithmNotAvailable(String value) {
        this.huntAlgorithmNotAvailable = value;
    }

    /**
     * Gets the value of the removeMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLineGroupReq.RemoveMembers }
     *     
     */
    public UpdateLineGroupReq.RemoveMembers getRemoveMembers() {
        return removeMembers;
    }

    /**
     * Sets the value of the removeMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLineGroupReq.RemoveMembers }
     *     
     */
    public void setRemoveMembers(UpdateLineGroupReq.RemoveMembers value) {
        this.removeMembers = value;
    }

    /**
     * Gets the value of the addMembers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLineGroupReq.AddMembers }
     *     
     */
    public UpdateLineGroupReq.AddMembers getAddMembers() {
        return addMembers;
    }

    /**
     * Sets the value of the addMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLineGroupReq.AddMembers }
     *     
     */
    public void setAddMembers(UpdateLineGroupReq.AddMembers value) {
        this.addMembers = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLineGroupReq.Members }
     *     
     */
    public UpdateLineGroupReq.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLineGroupReq.Members }
     *     
     */
    public void setMembers(UpdateLineGroupReq.Members value) {
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<XLineGroupMember> member;

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
         * {@link XLineGroupMember }
         * 
         * 
         */
        public List<XLineGroupMember> getMember() {
            if (member == null) {
                member = new ArrayList<XLineGroupMember>();
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<XLineGroupMember> member;

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
         * {@link XLineGroupMember }
         * 
         * 
         */
        public List<XLineGroupMember> getMember() {
            if (member == null) {
                member = new ArrayList<XLineGroupMember>();
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<XLineGroupMember> member;

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
         * {@link XLineGroupMember }
         * 
         * 
         */
        public List<XLineGroupMember> getMember() {
            if (member == null) {
                member = new ArrayList<XLineGroupMember>();
            }
            return this.member;
        }

    }

}
