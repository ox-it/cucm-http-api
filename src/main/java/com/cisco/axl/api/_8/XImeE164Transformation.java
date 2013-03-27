
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XImeE164Transformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XImeE164Transformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="isCgpnPreTransformation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="cdpnTransformationCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="isCdpnPreTransformation" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="incomingCgpnTransformationProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="incomingCdpnTransformationProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XImeE164Transformation", propOrder = {
    "name",
    "description",
    "cgpnTransformationCssName",
    "isCgpnPreTransformation",
    "cdpnTransformationCssName",
    "isCdpnPreTransformation",
    "incomingCgpnTransformationProfileName",
    "incomingCdpnTransformationProfileName"
})
public class XImeE164Transformation {

    protected String name;
    protected String description;
    @XmlElementRef(name = "cgpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cgpnTransformationCssName;
    @XmlElement(defaultValue = "false")
    protected String isCgpnPreTransformation;
    @XmlElementRef(name = "cdpnTransformationCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cdpnTransformationCssName;
    @XmlElement(defaultValue = "false")
    protected String isCdpnPreTransformation;
    @XmlElementRef(name = "incomingCgpnTransformationProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> incomingCgpnTransformationProfileName;
    @XmlElementRef(name = "incomingCdpnTransformationProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> incomingCdpnTransformationProfileName;

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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCgpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cgpnTransformationCssName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCdpnTransformationCssName() {
        return cdpnTransformationCssName;
    }

    /**
     * Sets the value of the cdpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCdpnTransformationCssName(JAXBElement<XFkType> value) {
        this.cdpnTransformationCssName = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getIncomingCgpnTransformationProfileName() {
        return incomingCgpnTransformationProfileName;
    }

    /**
     * Sets the value of the incomingCgpnTransformationProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setIncomingCgpnTransformationProfileName(JAXBElement<XFkType> value) {
        this.incomingCgpnTransformationProfileName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the incomingCdpnTransformationProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getIncomingCdpnTransformationProfileName() {
        return incomingCdpnTransformationProfileName;
    }

    /**
     * Sets the value of the incomingCdpnTransformationProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setIncomingCdpnTransformationProfileName(JAXBElement<XFkType> value) {
        this.incomingCdpnTransformationProfileName = ((JAXBElement<XFkType> ) value);
    }

}
