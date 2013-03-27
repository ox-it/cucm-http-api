
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMobility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMobility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="handoffNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handoffPartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="DTMFNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DTMFPartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMobility", propOrder = {
    "handoffNumber",
    "handoffPartitionName",
    "dtmfNumber",
    "dtmfPartitionName"
})
public class XMobility {

    @XmlElement(required = true)
    protected String handoffNumber;
    protected XFkType handoffPartitionName;
    @XmlElement(name = "DTMFNumber", required = true)
    protected String dtmfNumber;
    @XmlElement(name = "DTMFPartitionName")
    protected XFkType dtmfPartitionName;

    /**
     * Gets the value of the handoffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoffNumber() {
        return handoffNumber;
    }

    /**
     * Sets the value of the handoffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoffNumber(String value) {
        this.handoffNumber = value;
    }

    /**
     * Gets the value of the handoffPartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getHandoffPartitionName() {
        return handoffPartitionName;
    }

    /**
     * Sets the value of the handoffPartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setHandoffPartitionName(XFkType value) {
        this.handoffPartitionName = value;
    }

    /**
     * Gets the value of the dtmfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMFNumber() {
        return dtmfNumber;
    }

    /**
     * Sets the value of the dtmfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMFNumber(String value) {
        this.dtmfNumber = value;
    }

    /**
     * Gets the value of the dtmfPartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDTMFPartitionName() {
        return dtmfPartitionName;
    }

    /**
     * Sets the value of the dtmfPartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDTMFPartitionName(XFkType value) {
        this.dtmfPartitionName = value;
    }

}
