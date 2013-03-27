
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCcdAdvertisingServiceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCcdAdvertisingServiceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="isActivated" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="hostDnGroup" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="safSipTrunk" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="safH323Trunk" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCcdAdvertisingServiceReq", propOrder = {
    "newName",
    "description",
    "isActivated",
    "hostDnGroup",
    "safSipTrunk",
    "safH323Trunk"
})
public class UpdateCcdAdvertisingServiceReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String isActivated;
    protected XFkType hostDnGroup;
    @XmlElementRef(name = "safSipTrunk", type = JAXBElement.class)
    protected JAXBElement<XFkType> safSipTrunk;
    @XmlElementRef(name = "safH323Trunk", type = JAXBElement.class)
    protected JAXBElement<XFkType> safH323Trunk;

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
