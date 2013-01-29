
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCallerFilterListMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCallerFilterListMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="DnMask" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="callerFilterMask" type="{http://www.cisco.com/AXL/API/8.5}XCallerFilterMask" minOccurs="0"/>
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
@XmlType(name = "LCallerFilterListMember", propOrder = {
    "dnMask",
    "callerFilterMask"
})
public class LCallerFilterListMember {

    @XmlElement(name = "DnMask")
    protected String dnMask;
    protected String callerFilterMask;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the dnMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnMask() {
        return dnMask;
    }

    /**
     * Sets the value of the dnMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnMask(String value) {
        this.dnMask = value;
    }

    /**
     * Gets the value of the callerFilterMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerFilterMask() {
        return callerFilterMask;
    }

    /**
     * Sets the value of the callerFilterMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerFilterMask(String value) {
        this.callerFilterMask = value;
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
