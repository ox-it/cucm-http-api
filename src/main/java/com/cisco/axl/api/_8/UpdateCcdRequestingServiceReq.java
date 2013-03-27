
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCcdRequestingServiceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCcdRequestingServiceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="isActivated" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="learnedPatternPrefix" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="pstnPrefix" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeAssociatedTrunks" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="associatedTrunk" type="{http://www.cisco.com/AXL/API/8.0}XCcdRequestingServiceMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addAssociatedTrunks" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="associatedTrunk" type="{http://www.cisco.com/AXL/API/8.0}XCcdRequestingServiceMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="associatedTrunks" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="associatedTrunk" type="{http://www.cisco.com/AXL/API/8.0}XCcdRequestingServiceMember" maxOccurs="unbounded"/>
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
@XmlType(name = "UpdateCcdRequestingServiceReq", propOrder = {
    "newName",
    "description",
    "isActivated",
    "routePartitionName",
    "learnedPatternPrefix",
    "pstnPrefix",
    "removeAssociatedTrunks",
    "addAssociatedTrunks",
    "associatedTrunks"
})
public class UpdateCcdRequestingServiceReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String isActivated;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    protected String learnedPatternPrefix;
    protected String pstnPrefix;
    protected UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks removeAssociatedTrunks;
    protected UpdateCcdRequestingServiceReq.AddAssociatedTrunks addAssociatedTrunks;
    protected UpdateCcdRequestingServiceReq.AssociatedTrunks associatedTrunks;

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
     * Gets the value of the isActivated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActivated() {
        return isActivated;
    }

    /**
     * Sets the value of the isActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActivated(String value) {
        this.isActivated = value;
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
     * Gets the value of the learnedPatternPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnedPatternPrefix() {
        return learnedPatternPrefix;
    }

    /**
     * Sets the value of the learnedPatternPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnedPatternPrefix(String value) {
        this.learnedPatternPrefix = value;
    }

    /**
     * Gets the value of the pstnPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnPrefix() {
        return pstnPrefix;
    }

    /**
     * Sets the value of the pstnPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnPrefix(String value) {
        this.pstnPrefix = value;
    }

    /**
     * Gets the value of the removeAssociatedTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks }
     *     
     */
    public UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks getRemoveAssociatedTrunks() {
        return removeAssociatedTrunks;
    }

    /**
     * Sets the value of the removeAssociatedTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks }
     *     
     */
    public void setRemoveAssociatedTrunks(UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks value) {
        this.removeAssociatedTrunks = value;
    }

    /**
     * Gets the value of the addAssociatedTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCcdRequestingServiceReq.AddAssociatedTrunks }
     *     
     */
    public UpdateCcdRequestingServiceReq.AddAssociatedTrunks getAddAssociatedTrunks() {
        return addAssociatedTrunks;
    }

    /**
     * Sets the value of the addAssociatedTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCcdRequestingServiceReq.AddAssociatedTrunks }
     *     
     */
    public void setAddAssociatedTrunks(UpdateCcdRequestingServiceReq.AddAssociatedTrunks value) {
        this.addAssociatedTrunks = value;
    }

    /**
     * Gets the value of the associatedTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCcdRequestingServiceReq.AssociatedTrunks }
     *     
     */
    public UpdateCcdRequestingServiceReq.AssociatedTrunks getAssociatedTrunks() {
        return associatedTrunks;
    }

    /**
     * Sets the value of the associatedTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCcdRequestingServiceReq.AssociatedTrunks }
     *     
     */
    public void setAssociatedTrunks(UpdateCcdRequestingServiceReq.AssociatedTrunks value) {
        this.associatedTrunks = value;
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
     *         &lt;element name="associatedTrunk" type="{http://www.cisco.com/AXL/API/8.0}XCcdRequestingServiceMember" maxOccurs="unbounded"/>
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
        "associatedTrunk"
    })
    public static class AddAssociatedTrunks
        extends XCommonMembersExtension
    {

        protected List<XCcdRequestingServiceMember> associatedTrunk;

        /**
         * Gets the value of the associatedTrunk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedTrunk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedTrunk().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XCcdRequestingServiceMember }
         * 
         * 
         */
        public List<XCcdRequestingServiceMember> getAssociatedTrunk() {
            if (associatedTrunk == null) {
                associatedTrunk = new ArrayList<XCcdRequestingServiceMember>();
            }
            return this.associatedTrunk;
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
     *         &lt;element name="associatedTrunk" type="{http://www.cisco.com/AXL/API/8.0}XCcdRequestingServiceMember" maxOccurs="unbounded"/>
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
        "associatedTrunk"
    })
    public static class AssociatedTrunks
        extends XCommonMembersExtension
    {

        protected List<XCcdRequestingServiceMember> associatedTrunk;

        /**
         * Gets the value of the associatedTrunk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedTrunk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedTrunk().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XCcdRequestingServiceMember }
         * 
         * 
         */
        public List<XCcdRequestingServiceMember> getAssociatedTrunk() {
            if (associatedTrunk == null) {
                associatedTrunk = new ArrayList<XCcdRequestingServiceMember>();
            }
            return this.associatedTrunk;
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
     *         &lt;element name="associatedTrunk" type="{http://www.cisco.com/AXL/API/8.0}XCcdRequestingServiceMember" maxOccurs="unbounded"/>
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
        "associatedTrunk"
    })
    public static class RemoveAssociatedTrunks
        extends XCommonMembersExtension
    {

        protected List<XCcdRequestingServiceMember> associatedTrunk;

        /**
         * Gets the value of the associatedTrunk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedTrunk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedTrunk().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XCcdRequestingServiceMember }
         * 
         * 
         */
        public List<XCcdRequestingServiceMember> getAssociatedTrunk() {
            if (associatedTrunk == null) {
                associatedTrunk = new ArrayList<XCcdRequestingServiceMember>();
            }
            return this.associatedTrunk;
        }

    }

}
