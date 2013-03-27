
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGeoLocationPolicyReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGeoLocationPolicyReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="nationalSubDivision" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="communityName" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="cityDivision" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="neighbourhood" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="leadingStreetDirection" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="trailingStreetSuffix" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="streetSuffix" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="houseNumberSuffix" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
 *         &lt;element name="landmark" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="floor" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="occupantName" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.cisco.com/AXL/API/8.0}String100" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeRelatedPolicies" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}XPolicyRelationship" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addRelatedPolicies" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}XPolicyRelationship" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="relatedPolicies" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}XPolicyRelationship" maxOccurs="unbounded"/>
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
@XmlType(name = "UpdateGeoLocationPolicyReq", propOrder = {
    "newName",
    "country",
    "description",
    "nationalSubDivision",
    "district",
    "communityName",
    "cityDivision",
    "neighbourhood",
    "street",
    "leadingStreetDirection",
    "trailingStreetSuffix",
    "streetSuffix",
    "houseNumber",
    "houseNumberSuffix",
    "landmark",
    "location",
    "floor",
    "occupantName",
    "postalCode",
    "removeRelatedPolicies",
    "addRelatedPolicies",
    "relatedPolicies"
})
public class UpdateGeoLocationPolicyReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String country;
    protected String description;
    protected String nationalSubDivision;
    protected String district;
    protected String communityName;
    protected String cityDivision;
    protected String neighbourhood;
    protected String street;
    protected String leadingStreetDirection;
    protected String trailingStreetSuffix;
    protected String streetSuffix;
    protected String houseNumber;
    protected String houseNumberSuffix;
    protected String landmark;
    protected String location;
    protected String floor;
    protected String occupantName;
    protected String postalCode;
    protected UpdateGeoLocationPolicyReq.RemoveRelatedPolicies removeRelatedPolicies;
    protected UpdateGeoLocationPolicyReq.AddRelatedPolicies addRelatedPolicies;
    protected UpdateGeoLocationPolicyReq.RelatedPolicies relatedPolicies;

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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the nationalSubDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalSubDivision() {
        return nationalSubDivision;
    }

    /**
     * Sets the value of the nationalSubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalSubDivision(String value) {
        this.nationalSubDivision = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the communityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     * Sets the value of the communityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityName(String value) {
        this.communityName = value;
    }

    /**
     * Gets the value of the cityDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityDivision() {
        return cityDivision;
    }

    /**
     * Sets the value of the cityDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityDivision(String value) {
        this.cityDivision = value;
    }

    /**
     * Gets the value of the neighbourhood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Sets the value of the neighbourhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighbourhood(String value) {
        this.neighbourhood = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the leadingStreetDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadingStreetDirection() {
        return leadingStreetDirection;
    }

    /**
     * Sets the value of the leadingStreetDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadingStreetDirection(String value) {
        this.leadingStreetDirection = value;
    }

    /**
     * Gets the value of the trailingStreetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailingStreetSuffix() {
        return trailingStreetSuffix;
    }

    /**
     * Sets the value of the trailingStreetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailingStreetSuffix(String value) {
        this.trailingStreetSuffix = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    /**
     * Sets the value of the houseNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberSuffix(String value) {
        this.houseNumberSuffix = value;
    }

    /**
     * Gets the value of the landmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandmark() {
        return landmark;
    }

    /**
     * Sets the value of the landmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandmark(String value) {
        this.landmark = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the occupantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupantName() {
        return occupantName;
    }

    /**
     * Sets the value of the occupantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupantName(String value) {
        this.occupantName = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the removeRelatedPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateGeoLocationPolicyReq.RemoveRelatedPolicies }
     *     
     */
    public UpdateGeoLocationPolicyReq.RemoveRelatedPolicies getRemoveRelatedPolicies() {
        return removeRelatedPolicies;
    }

    /**
     * Sets the value of the removeRelatedPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateGeoLocationPolicyReq.RemoveRelatedPolicies }
     *     
     */
    public void setRemoveRelatedPolicies(UpdateGeoLocationPolicyReq.RemoveRelatedPolicies value) {
        this.removeRelatedPolicies = value;
    }

    /**
     * Gets the value of the addRelatedPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateGeoLocationPolicyReq.AddRelatedPolicies }
     *     
     */
    public UpdateGeoLocationPolicyReq.AddRelatedPolicies getAddRelatedPolicies() {
        return addRelatedPolicies;
    }

    /**
     * Sets the value of the addRelatedPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateGeoLocationPolicyReq.AddRelatedPolicies }
     *     
     */
    public void setAddRelatedPolicies(UpdateGeoLocationPolicyReq.AddRelatedPolicies value) {
        this.addRelatedPolicies = value;
    }

    /**
     * Gets the value of the relatedPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateGeoLocationPolicyReq.RelatedPolicies }
     *     
     */
    public UpdateGeoLocationPolicyReq.RelatedPolicies getRelatedPolicies() {
        return relatedPolicies;
    }

    /**
     * Sets the value of the relatedPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateGeoLocationPolicyReq.RelatedPolicies }
     *     
     */
    public void setRelatedPolicies(UpdateGeoLocationPolicyReq.RelatedPolicies value) {
        this.relatedPolicies = value;
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
     *         &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}XPolicyRelationship" maxOccurs="unbounded"/>
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
        "relatedPolicy"
    })
    public static class AddRelatedPolicies
        extends XCommonMembersExtension
    {

        protected List<XPolicyRelationship> relatedPolicy;

        /**
         * Gets the value of the relatedPolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedPolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPolicyRelationship }
         * 
         * 
         */
        public List<XPolicyRelationship> getRelatedPolicy() {
            if (relatedPolicy == null) {
                relatedPolicy = new ArrayList<XPolicyRelationship>();
            }
            return this.relatedPolicy;
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
     *         &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}XPolicyRelationship" maxOccurs="unbounded"/>
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
        "relatedPolicy"
    })
    public static class RelatedPolicies
        extends XCommonMembersExtension
    {

        protected List<XPolicyRelationship> relatedPolicy;

        /**
         * Gets the value of the relatedPolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedPolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPolicyRelationship }
         * 
         * 
         */
        public List<XPolicyRelationship> getRelatedPolicy() {
            if (relatedPolicy == null) {
                relatedPolicy = new ArrayList<XPolicyRelationship>();
            }
            return this.relatedPolicy;
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
     *         &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}XPolicyRelationship" maxOccurs="unbounded"/>
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
        "relatedPolicy"
    })
    public static class RemoveRelatedPolicies
        extends XCommonMembersExtension
    {

        protected List<XPolicyRelationship> relatedPolicy;

        /**
         * Gets the value of the relatedPolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedPolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPolicyRelationship }
         * 
         * 
         */
        public List<XPolicyRelationship> getRelatedPolicy() {
            if (relatedPolicy == null) {
                relatedPolicy = new ArrayList<XPolicyRelationship>();
            }
            return this.relatedPolicy;
        }

    }

}
