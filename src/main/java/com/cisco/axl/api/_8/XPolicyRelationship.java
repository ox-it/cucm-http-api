
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XPolicyRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XPolicyRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="geoLocationPolicyAName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="geoLocationDeviceA" type="{http://www.cisco.com/AXL/API/8.5}XGeoLocationDevice"/>
 *         &lt;element name="geoLocationPolicyBName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="geoLocationDeviceB" type="{http://www.cisco.com/AXL/API/8.5}XGeoLocationDevice"/>
 *         &lt;element name="logicalPartitionPolicy" type="{http://www.cisco.com/AXL/API/8.5}XLogicalPartitionPolicy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XPolicyRelationship", propOrder = {
    "geoLocationPolicyAName",
    "geoLocationDeviceA",
    "geoLocationPolicyBName",
    "geoLocationDeviceB",
    "logicalPartitionPolicy"
})
public class XPolicyRelationship {

    @XmlElementRef(name = "geoLocationPolicyAName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationPolicyAName;
    protected String geoLocationDeviceA;
    @XmlElementRef(name = "geoLocationPolicyBName", type = JAXBElement.class)
    protected JAXBElement<XFkType> geoLocationPolicyBName;
    protected String geoLocationDeviceB;
    protected String logicalPartitionPolicy;

    /**
     * Gets the value of the geoLocationPolicyAName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationPolicyAName() {
        return geoLocationPolicyAName;
    }

    /**
     * Sets the value of the geoLocationPolicyAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationPolicyAName(JAXBElement<XFkType> value) {
        this.geoLocationPolicyAName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getGeoLocationPolicyBName() {
        return geoLocationPolicyBName;
    }

    /**
     * Sets the value of the geoLocationPolicyBName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setGeoLocationPolicyBName(JAXBElement<XFkType> value) {
        this.geoLocationPolicyBName = ((JAXBElement<XFkType> ) value);
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

}
