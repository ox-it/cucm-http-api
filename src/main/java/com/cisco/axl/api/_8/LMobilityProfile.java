
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LMobilityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LMobilityProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileClientCallingOption" type="{http://www.cisco.com/AXL/API/8.5}XDialViaOffice" minOccurs="0"/>
 *         &lt;element name="dvofServiceAccessNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dvorCallerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LMobilityProfile", propOrder = {
    "name",
    "description",
    "mobileClientCallingOption",
    "dvofServiceAccessNumber",
    "dvorCallerId"
})
public class LMobilityProfile {

    protected String name;
    protected String description;
    protected String mobileClientCallingOption;
    protected String dvofServiceAccessNumber;
    protected String dvorCallerId;
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
     * Gets the value of the mobileClientCallingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileClientCallingOption() {
        return mobileClientCallingOption;
    }

    /**
     * Sets the value of the mobileClientCallingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileClientCallingOption(String value) {
        this.mobileClientCallingOption = value;
    }

    /**
     * Gets the value of the dvofServiceAccessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvofServiceAccessNumber() {
        return dvofServiceAccessNumber;
    }

    /**
     * Sets the value of the dvofServiceAccessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvofServiceAccessNumber(String value) {
        this.dvofServiceAccessNumber = value;
    }

    /**
     * Gets the value of the dvorCallerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvorCallerId() {
        return dvorCallerId;
    }

    /**
     * Sets the value of the dvorCallerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvorCallerId(String value) {
        this.dvorCallerId = value;
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
