
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCcdHostedDN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCcdHostedDN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="hostedPattern" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="CcdHostedDnGroup" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
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
@XmlType(name = "XCcdHostedDN", propOrder = {
    "hostedPattern",
    "description",
    "ccdHostedDnGroup",
    "pstnFailoverStripDigits",
    "pstnFailoverPrependDigits",
    "usePstnFailover"
})
public class XCcdHostedDN {

    protected String hostedPattern;
    protected String description;
    @XmlElement(name = "CcdHostedDnGroup")
    protected XFkType ccdHostedDnGroup;
    @XmlElementRef(name = "pstnFailoverStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> pstnFailoverStripDigits;
    protected String pstnFailoverPrependDigits;
    @XmlElement(defaultValue = "false")
    protected String usePstnFailover;

    /**
     * Gets the value of the hostedPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedPattern() {
        return hostedPattern;
    }

    /**
     * Sets the value of the hostedPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedPattern(String value) {
        this.hostedPattern = value;
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
     * Gets the value of the ccdHostedDnGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCcdHostedDnGroup() {
        return ccdHostedDnGroup;
    }

    /**
     * Sets the value of the ccdHostedDnGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCcdHostedDnGroup(XFkType value) {
        this.ccdHostedDnGroup = value;
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
