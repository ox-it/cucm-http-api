
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDdi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDdi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="clause" type="{http://www.cisco.com/AXL/API/8.0}String1024" minOccurs="0"/>
 *         &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="digitAnalysisId" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="members" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}RDigitDiscardInstructionMember" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RDdi", propOrder = {
    "name",
    "clause",
    "dialPlanName",
    "digitAnalysisId",
    "members"
})
public class RDdi {

    protected String name;
    protected String clause;
    protected XFkType dialPlanName;
    protected String digitAnalysisId;
    protected RDdi.Members members;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the clause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClause() {
        return clause;
    }

    /**
     * Sets the value of the clause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClause(String value) {
        this.clause = value;
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
     * Gets the value of the digitAnalysisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitAnalysisId() {
        return digitAnalysisId;
    }

    /**
     * Sets the value of the digitAnalysisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitAnalysisId(String value) {
        this.digitAnalysisId = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link RDdi.Members }
     *     
     */
    public RDdi.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link RDdi.Members }
     *     
     */
    public void setMembers(RDdi.Members value) {
        this.members = value;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.0}RDigitDiscardInstructionMember" maxOccurs="unbounded" minOccurs="0"/>
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
        "member"
    })
    public static class Members {

        protected List<RDigitDiscardInstructionMember> member;

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
         * {@link RDigitDiscardInstructionMember }
         * 
         * 
         */
        public List<RDigitDiscardInstructionMember> getMember() {
            if (member == null) {
                member = new ArrayList<RDigitDiscardInstructionMember>();
            }
            return this.member;
        }

    }

}
