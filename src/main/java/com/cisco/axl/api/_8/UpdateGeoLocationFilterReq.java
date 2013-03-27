
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGeoLocationFilterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGeoLocationFilterReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="useCountry" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useNationalSubDivision" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useDistrict" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useCommunityName" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useCityDivision" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useNeighbourhood" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useStreet" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useLeadingStreetDirection" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useTrailingStreetSuffix" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useStreetSuffix" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useHouseNumber" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useHouseNumberSuffix" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useLandmark" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useLocation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useFloor" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="useOccupantName" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="usePostalCode" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGeoLocationFilterReq", propOrder = {
    "newName",
    "description",
    "useCountry",
    "useNationalSubDivision",
    "useDistrict",
    "useCommunityName",
    "useCityDivision",
    "useNeighbourhood",
    "useStreet",
    "useLeadingStreetDirection",
    "useTrailingStreetSuffix",
    "useStreetSuffix",
    "useHouseNumber",
    "useHouseNumberSuffix",
    "useLandmark",
    "useLocation",
    "useFloor",
    "useOccupantName",
    "usePostalCode"
})
public class UpdateGeoLocationFilterReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String useCountry;
    protected String useNationalSubDivision;
    protected String useDistrict;
    protected String useCommunityName;
    protected String useCityDivision;
    protected String useNeighbourhood;
    protected String useStreet;
    protected String useLeadingStreetDirection;
    protected String useTrailingStreetSuffix;
    protected String useStreetSuffix;
    protected String useHouseNumber;
    protected String useHouseNumberSuffix;
    protected String useLandmark;
    protected String useLocation;
    protected String useFloor;
    protected String useOccupantName;
    protected String usePostalCode;

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
     * Gets the value of the useCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCountry() {
        return useCountry;
    }

    /**
     * Sets the value of the useCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCountry(String value) {
        this.useCountry = value;
    }

    /**
     * Gets the value of the useNationalSubDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseNationalSubDivision() {
        return useNationalSubDivision;
    }

    /**
     * Sets the value of the useNationalSubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseNationalSubDivision(String value) {
        this.useNationalSubDivision = value;
    }

    /**
     * Gets the value of the useDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDistrict() {
        return useDistrict;
    }

    /**
     * Sets the value of the useDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDistrict(String value) {
        this.useDistrict = value;
    }

    /**
     * Gets the value of the useCommunityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCommunityName() {
        return useCommunityName;
    }

    /**
     * Sets the value of the useCommunityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCommunityName(String value) {
        this.useCommunityName = value;
    }

    /**
     * Gets the value of the useCityDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCityDivision() {
        return useCityDivision;
    }

    /**
     * Sets the value of the useCityDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCityDivision(String value) {
        this.useCityDivision = value;
    }

    /**
     * Gets the value of the useNeighbourhood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseNeighbourhood() {
        return useNeighbourhood;
    }

    /**
     * Sets the value of the useNeighbourhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseNeighbourhood(String value) {
        this.useNeighbourhood = value;
    }

    /**
     * Gets the value of the useStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseStreet() {
        return useStreet;
    }

    /**
     * Sets the value of the useStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseStreet(String value) {
        this.useStreet = value;
    }

    /**
     * Gets the value of the useLeadingStreetDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLeadingStreetDirection() {
        return useLeadingStreetDirection;
    }

    /**
     * Sets the value of the useLeadingStreetDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLeadingStreetDirection(String value) {
        this.useLeadingStreetDirection = value;
    }

    /**
     * Gets the value of the useTrailingStreetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrailingStreetSuffix() {
        return useTrailingStreetSuffix;
    }

    /**
     * Sets the value of the useTrailingStreetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrailingStreetSuffix(String value) {
        this.useTrailingStreetSuffix = value;
    }

    /**
     * Gets the value of the useStreetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseStreetSuffix() {
        return useStreetSuffix;
    }

    /**
     * Sets the value of the useStreetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseStreetSuffix(String value) {
        this.useStreetSuffix = value;
    }

    /**
     * Gets the value of the useHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseHouseNumber() {
        return useHouseNumber;
    }

    /**
     * Sets the value of the useHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseHouseNumber(String value) {
        this.useHouseNumber = value;
    }

    /**
     * Gets the value of the useHouseNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseHouseNumberSuffix() {
        return useHouseNumberSuffix;
    }

    /**
     * Sets the value of the useHouseNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseHouseNumberSuffix(String value) {
        this.useHouseNumberSuffix = value;
    }

    /**
     * Gets the value of the useLandmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLandmark() {
        return useLandmark;
    }

    /**
     * Sets the value of the useLandmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLandmark(String value) {
        this.useLandmark = value;
    }

    /**
     * Gets the value of the useLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLocation() {
        return useLocation;
    }

    /**
     * Sets the value of the useLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLocation(String value) {
        this.useLocation = value;
    }

    /**
     * Gets the value of the useFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseFloor() {
        return useFloor;
    }

    /**
     * Sets the value of the useFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseFloor(String value) {
        this.useFloor = value;
    }

    /**
     * Gets the value of the useOccupantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseOccupantName() {
        return useOccupantName;
    }

    /**
     * Sets the value of the useOccupantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseOccupantName(String value) {
        this.useOccupantName = value;
    }

    /**
     * Gets the value of the usePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePostalCode() {
        return usePostalCode;
    }

    /**
     * Sets the value of the usePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePostalCode(String value) {
        this.usePostalCode = value;
    }

}
