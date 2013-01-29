
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMobilityReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMobilityReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="handoffNumber" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *           &lt;element name="DTMFNumber" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="newHandoffNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="newHandoffPartitionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *           &lt;element name="newDTMFNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="newDTMFPartitionName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMobilityReq", propOrder = {
    "handoffNumber",
    "dtmfNumber",
    "newHandoffNumber",
    "newHandoffPartitionName",
    "newDTMFNumber",
    "newDTMFPartitionName"
})
public class UpdateMobilityReq {

    protected XFkType handoffNumber;
    @XmlElement(name = "DTMFNumber")
    protected XFkType dtmfNumber;
    protected String newHandoffNumber;
    protected XFkType newHandoffPartitionName;
    protected String newDTMFNumber;
    protected XFkType newDTMFPartitionName;

    /**
     * Gets the value of the handoffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHandoffNumber() {
        return handoffNumber;
    }

    /**
     * Sets the value of the handoffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHandoffNumber(XFkType value) {
        this.handoffNumber = value;
    }

    /**
     * Gets the value of the dtmfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDTMFNumber() {
        return dtmfNumber;
    }

    /**
     * Sets the value of the dtmfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDTMFNumber(XFkType value) {
        this.dtmfNumber = value;
    }

    /**
     * Gets the value of the newHandoffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewHandoffNumber() {
        return newHandoffNumber;
    }

    /**
     * Sets the value of the newHandoffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewHandoffNumber(String value) {
        this.newHandoffNumber = value;
    }

    /**
     * Gets the value of the newHandoffPartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNewHandoffPartitionName() {
        return newHandoffPartitionName;
    }

    /**
     * Sets the value of the newHandoffPartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNewHandoffPartitionName(XFkType value) {
        this.newHandoffPartitionName = value;
    }

    /**
     * Gets the value of the newDTMFNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDTMFNumber() {
        return newDTMFNumber;
    }

    /**
     * Sets the value of the newDTMFNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDTMFNumber(String value) {
        this.newDTMFNumber = value;
    }

    /**
     * Gets the value of the newDTMFPartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNewDTMFPartitionName() {
        return newDTMFPartitionName;
    }

    /**
     * Sets the value of the newDTMFPartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNewDTMFPartitionName(XFkType value) {
        this.newDTMFPartitionName = value;
    }

}
