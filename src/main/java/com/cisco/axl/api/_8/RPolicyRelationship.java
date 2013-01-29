
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RPolicyRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RPolicyRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="geoLocationPolicyAName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationDeviceA" type="{http://www.cisco.com/AXL/API/8.5}XGeoLocationDevice" minOccurs="0"/>
 *         &lt;element name="geoLocationPolicyBName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationDeviceB" type="{http://www.cisco.com/AXL/API/8.5}XGeoLocationDevice" minOccurs="0"/>
 *         &lt;element name="logicalPartitionPolicy" type="{http://www.cisco.com/AXL/API/8.5}XLogicalPartitionPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPolicyRelationship", propOrder = {
    "geoLocationPolicyAName",
    "geoLocationDeviceA",
    "geoLocationPolicyBName",
    "geoLocationDeviceB",
    "logicalPartitionPolicy"
})
public class RPolicyRelationship {

    protected XFkType geoLocationPolicyAName;
    protected String geoLocationDeviceA;
    protected XFkType geoLocationPolicyBName;
    protected String geoLocationDeviceB;
    protected String logicalPartitionPolicy;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the geoLocationPolicyAName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getGeoLocationPolicyAName() {
        return geoLocationPolicyAName;
    }

    /**
     * Sets the value of the geoLocationPolicyAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setGeoLocationPolicyAName(XFkType value) {
        this.geoLocationPolicyAName = value;
    }

    /**
     * Gets the value of the geoLocationDeviceA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoLocationDeviceA() {
        return geoLocationDeviceA;
    }

    /**
     * Sets the value of the geoLocationDeviceA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoLocationDeviceA(String value) {
        this.geoLocationDeviceA = value;
    }

    /**
     * Gets the value of the geoLocationPolicyBName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getGeoLocationPolicyBName() {
        return geoLocationPolicyBName;
    }

    /**
     * Sets the value of the geoLocationPolicyBName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setGeoLocationPolicyBName(XFkType value) {
        this.geoLocationPolicyBName = value;
    }

    /**
     * Gets the value of the geoLocationDeviceB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoLocationDeviceB() {
        return geoLocationDeviceB;
    }

    /**
     * Sets the value of the geoLocationDeviceB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoLocationDeviceB(String value) {
        this.geoLocationDeviceB = value;
    }

    /**
     * Gets the value of the logicalPartitionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalPartitionPolicy() {
        return logicalPartitionPolicy;
    }

    /**
     * Sets the value of the logicalPartitionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalPartitionPolicy(String value) {
        this.logicalPartitionPolicy = value;
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

}
