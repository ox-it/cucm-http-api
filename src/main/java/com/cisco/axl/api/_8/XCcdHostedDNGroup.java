
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCcdHostedDNGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCcdHostedDNGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String255"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="pstnFailoverStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="pstnFailoverPrependDigits" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="usePstnFailover" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCcdHostedDNGroup", propOrder = {
    "name",
    "description",
    "pstnFailoverStripDigits",
    "pstnFailoverPrependDigits",
    "usePstnFailover"
})
public class XCcdHostedDNGroup {

    protected String name;
    protected String description;
    @XmlElementRef(name = "pstnFailoverStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> pstnFailoverStripDigits;
    protected String pstnFailoverPrependDigits;
    @XmlElement(defaultValue = "false")
    protected String usePstnFailover;

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
     * Gets the value of the pstnFailoverStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPstnFailoverStripDigits() {
        return pstnFailoverStripDigits;
    }

    /**
     * Sets the value of the pstnFailoverStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPstnFailoverStripDigits(JAXBElement<String> value) {
        this.pstnFailoverStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pstnFailoverPrependDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailoverPrependDigits() {
        return pstnFailoverPrependDigits;
    }

    /**
     * Sets the value of the pstnFailoverPrependDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailoverPrependDigits(String value) {
        this.pstnFailoverPrependDigits = value;
    }

    /**
     * Gets the value of the usePstnFailover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePstnFailover() {
        return usePstnFailover;
    }

    /**
     * Sets the value of the usePstnFailover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePstnFailover(String value) {
        this.usePstnFailover = value;
    }

}
