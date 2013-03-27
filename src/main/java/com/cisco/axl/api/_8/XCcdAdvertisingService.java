
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCcdAdvertisingService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCcdAdvertisingService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="isActivated" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="hostDnGroup" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="safSipTrunk" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="safH323Trunk" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCcdAdvertisingService", propOrder = {
    "name",
    "description",
    "isActivated",
    "hostDnGroup",
    "safSipTrunk",
    "safH323Trunk"
})
public class XCcdAdvertisingService {

    protected String name;
    protected String description;
    protected String isActivated;
    protected XFkType hostDnGroup;
    @XmlElementRef(name = "safSipTrunk", type = JAXBElement.class)
    protected JAXBElement<XFkType> safSipTrunk;
    @XmlElementRef(name = "safH323Trunk", type = JAXBElement.class)
    protected JAXBElement<XFkType> safH323Trunk;

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
     * Gets the value of the hostDnGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHostDnGroup() {
        return hostDnGroup;
    }

    /**
     * Sets the value of the hostDnGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHostDnGroup(XFkType value) {
        this.hostDnGroup = value;
    }

    /**
     * Gets the value of the safSipTrunk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSafSipTrunk() {
        return safSipTrunk;
    }

    /**
     * Sets the value of the safSipTrunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSafSipTrunk(JAXBElement<XFkType> value) {
        this.safSipTrunk = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the safH323Trunk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSafH323Trunk() {
        return safH323Trunk;
    }

    /**
     * Sets the value of the safH323Trunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSafH323Trunk(JAXBElement<XFkType> value) {
        this.safH323Trunk = ((JAXBElement<XFkType> ) value);
    }

}
