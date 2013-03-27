
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTransformationProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransformationProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="internationalStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="unknownStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="subscriberStripDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="nationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="internationalPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="unknownPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="subscriberPrefix" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="nationalCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="internationalCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="unknownCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="subscriberCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransformationProfileReq", propOrder = {
    "newName",
    "description",
    "nationalStripDigits",
    "internationalStripDigits",
    "unknownStripDigits",
    "subscriberStripDigits",
    "nationalPrefix",
    "internationalPrefix",
    "unknownPrefix",
    "subscriberPrefix",
    "nationalCssName",
    "internationalCssName",
    "unknownCssName",
    "subscriberCssName"
})
public class UpdateTransformationProfileReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    @XmlElementRef(name = "nationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> nationalStripDigits;
    @XmlElementRef(name = "internationalStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> internationalStripDigits;
    @XmlElementRef(name = "unknownStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> unknownStripDigits;
    @XmlElementRef(name = "subscriberStripDigits", type = JAXBElement.class)
    protected JAXBElement<String> subscriberStripDigits;
    protected String nationalPrefix;
    protected String internationalPrefix;
    protected String unknownPrefix;
    protected String subscriberPrefix;
    @XmlElementRef(name = "nationalCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> nationalCssName;
    @XmlElementRef(name = "internationalCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> internationalCssName;
    @XmlElementRef(name = "unknownCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> unknownCssName;
    @XmlElementRef(name = "subscriberCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> subscriberCssName;

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
     * Gets the value of the nationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalStripDigits() {
        return nationalStripDigits;
    }

    /**
     * Sets the value of the nationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalStripDigits(JAXBElement<String> value) {
        this.nationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internationalStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternationalStripDigits() {
        return internationalStripDigits;
    }

    /**
     * Sets the value of the internationalStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternationalStripDigits(JAXBElement<String> value) {
        this.internationalStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unknownStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnknownStripDigits() {
        return unknownStripDigits;
    }

    /**
     * Sets the value of the unknownStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnknownStripDigits(JAXBElement<String> value) {
        this.unknownStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subscriberStripDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubscriberStripDigits() {
        return subscriberStripDigits;
    }

    /**
     * Sets the value of the subscriberStripDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubscriberStripDigits(JAXBElement<String> value) {
        this.subscriberStripDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalPrefix() {
        return nationalPrefix;
    }

    /**
     * Sets the value of the nationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalPrefix(String value) {
        this.nationalPrefix = value;
    }

    /**
     * Gets the value of the internationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPrefix() {
        return internationalPrefix;
    }

    /**
     * Sets the value of the internationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPrefix(String value) {
        this.internationalPrefix = value;
    }

    /**
     * Gets the value of the unknownPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownPrefix() {
        return unknownPrefix;
    }

    /**
     * Sets the value of the unknownPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownPrefix(String value) {
        this.unknownPrefix = value;
    }

    /**
     * Gets the value of the subscriberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberPrefix() {
        return subscriberPrefix;
    }

    /**
     * Sets the value of the subscriberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberPrefix(String value) {
        this.subscriberPrefix = value;
    }

    /**
     * Gets the value of the nationalCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNationalCssName() {
        return nationalCssName;
    }

    /**
     * Sets the value of the nationalCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNationalCssName(JAXBElement<XFkType> value) {
        this.nationalCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the internationalCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getInternationalCssName() {
        return internationalCssName;
    }

    /**
     * Sets the value of the internationalCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setInternationalCssName(JAXBElement<XFkType> value) {
        this.internationalCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the unknownCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUnknownCssName() {
        return unknownCssName;
    }

    /**
     * Sets the value of the unknownCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUnknownCssName(JAXBElement<XFkType> value) {
        this.unknownCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the subscriberCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSubscriberCssName() {
        return subscriberCssName;
    }

    /**
     * Sets the value of the subscriberCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSubscriberCssName(JAXBElement<XFkType> value) {
        this.subscriberCssName = ((JAXBElement<XFkType> ) value);
    }

}
