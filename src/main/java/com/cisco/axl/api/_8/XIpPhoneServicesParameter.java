
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XIpPhoneServicesParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XIpPhoneServicesParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}UniqueString50"/>
 *         &lt;element name="displayName" type="{http://www.cisco.com/AXL/API/8.0}String128"/>
 *         &lt;element name="default" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255"/>
 *         &lt;element name="paramRequired" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="paramPassword" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XIpPhoneServicesParameter", propOrder = {
    "name",
    "displayName",
    "_default",
    "description",
    "paramRequired",
    "paramPassword"
})
public class XIpPhoneServicesParameter {

    protected String name;
    protected String displayName;
    @XmlElement(name = "default")
    protected String _default;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(defaultValue = "true")
    protected String paramRequired;
    @XmlElement(defaultValue = "false")
    protected String paramPassword;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paramRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamRequired() {
        return paramRequired;
    }

    /**
     * Sets the value of the paramRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamRequired(String value) {
        this.paramRequired = value;
    }

    /**
     * Gets the value of the paramPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamPassword() {
        return paramPassword;
    }

    /**
     * Sets the value of the paramPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamPassword(String value) {
        this.paramPassword = value;
    }

}
