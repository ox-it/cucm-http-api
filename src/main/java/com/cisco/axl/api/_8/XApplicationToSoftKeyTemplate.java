
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XApplicationToSoftKeyTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XApplicationToSoftKeyTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="softKeyTemplateName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="standardSoftKeyTemplateName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XApplicationToSoftKeyTemplate", propOrder = {
    "softKeyTemplateName",
    "standardSoftKeyTemplateName"
})
public class XApplicationToSoftKeyTemplate {

    @XmlElement(required = true)
    protected XFkType softKeyTemplateName;
    @XmlElement(required = true)
    protected XFkType standardSoftKeyTemplateName;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the softKeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftKeyTemplateName() {
        return softKeyTemplateName;
    }

    /**
     * Sets the value of the softKeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftKeyTemplateName(XFkType value) {
        this.softKeyTemplateName = value;
    }

    /**
     * Gets the value of the standardSoftKeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getStandardSoftKeyTemplateName() {
        return standardSoftKeyTemplateName;
    }

    /**
     * Sets the value of the standardSoftKeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setStandardSoftKeyTemplateName(XFkType value) {
        this.standardSoftKeyTemplateName = value;
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
