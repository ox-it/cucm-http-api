
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGeoLocationPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGeoLocationPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
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
 *         &lt;element name="relatedPolicies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}RPolicyRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RGeoLocationPolicy", propOrder = {
    "name",
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
    "relatedPolicies"
})
public class RGeoLocationPolicy {

    protected String name;
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
    protected RGeoLocationPolicy.RelatedPolicies relatedPolicies;
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
     * Gets the value of the relatedPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link RGeoLocationPolicy.RelatedPolicies }
     *     
     */
    public RGeoLocationPolicy.RelatedPolicies getRelatedPolicies() {
        return relatedPolicies;
    }

    /**
     * Sets the value of the relatedPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGeoLocationPolicy.RelatedPolicies }
     *     
     */
    public void setRelatedPolicies(RGeoLocationPolicy.RelatedPolicies value) {
        this.relatedPolicies = value;
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
     *         &lt;element name="relatedPolicy" type="{http://www.cisco.com/AXL/API/8.0}RPolicyRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
        "relatedPolicy"
    })
    public static class RelatedPolicies {

        protected List<RPolicyRelationship> relatedPolicy;

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
         * {@link RPolicyRelationship }
         * 
         * 
         */
        public List<RPolicyRelationship> getRelatedPolicy() {
            if (relatedPolicy == null) {
                relatedPolicy = new ArrayList<RPolicyRelationship>();
            }
            return this.relatedPolicy;
        }

    }

}
