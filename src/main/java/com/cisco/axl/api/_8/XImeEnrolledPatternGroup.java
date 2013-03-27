
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XImeEnrolledPatternGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XImeEnrolledPatternGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="isPatternAllAlias" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XImeEnrolledPatternGroup", propOrder = {
    "name",
    "description",
    "fallbackProfileName",
    "isPatternAllAlias"
})
public class XImeEnrolledPatternGroup {

    protected String name;
    protected String description;
    @XmlElementRef(name = "fallbackProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> fallbackProfileName;
    @XmlElement(defaultValue = "false")
    protected String isPatternAllAlias;

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
     * Gets the value of the fallbackProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getFallbackProfileName() {
        return fallbackProfileName;
    }

    /**
     * Sets the value of the fallbackProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setFallbackProfileName(JAXBElement<XFkType> value) {
        this.fallbackProfileName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the isPatternAllAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPatternAllAlias() {
        return isPatternAllAlias;
    }

    /**
     * Sets the value of the isPatternAllAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPatternAllAlias(String value) {
        this.isPatternAllAlias = value;
    }

}
