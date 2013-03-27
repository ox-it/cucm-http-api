
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RImeE164Transformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RImeE164Transformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="isCgpnPreTransformation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="isCdpnPreTransformation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="incomingCgpnTransformationProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="incomingCdpnTransformationProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
@XmlType(name = "RImeE164Transformation", propOrder = {
    "name",
    "description",
    "cgpnTransformationCssName",
    "isCgpnPreTransformation",
    "cdpnTransformationCssName",
    "isCdpnPreTransformation",
    "incomingCgpnTransformationProfileName",
    "incomingCdpnTransformationProfileName"
})
public class RImeE164Transformation {

    protected String name;
    protected String description;
    protected XFkType cgpnTransformationCssName;
    protected String isCgpnPreTransformation;
    protected XFkType cdpnTransformationCssName;
    protected String isCdpnPreTransformation;
    protected XFkType incomingCgpnTransformationProfileName;
    protected XFkType incomingCdpnTransformationProfileName;
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
     * Gets the value of the cgpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCgpnTransformationCssName(XFkType value) {
        this.cgpnTransformationCssName = value;
    }

    /**
     * Gets the value of the isCgpnPreTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCgpnPreTransformation() {
        return isCgpnPreTransformation;
    }

    /**
     * Sets the value of the isCgpnPreTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCgpnPreTransformation(String value) {
        this.isCgpnPreTransformation = value;
    }

    /**
     * Gets the value of the cdpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCdpnTransformationCssName() {
        return cdpnTransformationCssName;
    }

    /**
     * Sets the value of the cdpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCdpnTransformationCssName(XFkType value) {
        this.cdpnTransformationCssName = value;
    }

    /**
     * Gets the value of the isCdpnPreTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCdpnPreTransformation() {
        return isCdpnPreTransformation;
    }

    /**
     * Sets the value of the isCdpnPreTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCdpnPreTransformation(String value) {
        this.isCdpnPreTransformation = value;
    }

    /**
     * Gets the value of the incomingCgpnTransformationProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getIncomingCgpnTransformationProfileName() {
        return incomingCgpnTransformationProfileName;
    }

    /**
     * Sets the value of the incomingCgpnTransformationProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setIncomingCgpnTransformationProfileName(XFkType value) {
        this.incomingCgpnTransformationProfileName = value;
    }

    /**
     * Gets the value of the incomingCdpnTransformationProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getIncomingCdpnTransformationProfileName() {
        return incomingCdpnTransformationProfileName;
    }

    /**
     * Sets the value of the incomingCdpnTransformationProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setIncomingCdpnTransformationProfileName(XFkType value) {
        this.incomingCdpnTransformationProfileName = value;
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
