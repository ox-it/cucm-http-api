
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTODAccessMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTODAccessMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="timeScheduleName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="accessListName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
@XmlType(name = "RTODAccessMember", propOrder = {
    "timeScheduleName",
    "accessListName"
})
public class RTODAccessMember {

    protected XFkType timeScheduleName;
    protected XFkType accessListName;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the timeScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getTimeScheduleName() {
        return timeScheduleName;
    }

    /**
     * Sets the value of the timeScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setTimeScheduleName(XFkType value) {
        this.timeScheduleName = value;
    }

    /**
     * Gets the value of the accessListName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAccessListName() {
        return accessListName;
    }

    /**
     * Sets the value of the accessListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAccessListName(XFkType value) {
        this.accessListName = value;
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
