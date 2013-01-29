
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
 * <p>Java class for XLineGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLineGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}Name"/>
 *         &lt;element name="distributionAlgorithm" type="{http://www.cisco.com/AXL/API/8.5}XDistributeAlgorithm"/>
 *         &lt;element name="rnaReversionTimeOut" type="{http://www.cisco.com/AXL/API/8.5}XInteger"/>
 *         &lt;element name="huntAlgorithmNoAnswer" type="{http://www.cisco.com/AXL/API/8.5}XHuntAlgorithm"/>
 *         &lt;element name="huntAlgorithmBusy" type="{http://www.cisco.com/AXL/API/8.5}XHuntAlgorithm"/>
 *         &lt;element name="huntAlgorithmNotAvailable" type="{http://www.cisco.com/AXL/API/8.5}XHuntAlgorithm"/>
 *         &lt;element name="members" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.5}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "XLineGroup", propOrder = {
    "name",
    "distributionAlgorithm",
    "rnaReversionTimeOut",
    "huntAlgorithmNoAnswer",
    "huntAlgorithmBusy",
    "huntAlgorithmNotAvailable",
    "members"
})
public class XLineGroup {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String name;
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
    protected XLineGroup.Members members;

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
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link XLineGroup.Members }
     *     
     */
    public XLineGroup.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLineGroup.Members }
     *     
     */
    public void setMembers(XLineGroup.Members value) {
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.5}XLineGroupMember" maxOccurs="unbounded" minOccurs="0"/>
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

}
