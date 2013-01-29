
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSubscribedService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSubscribedService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="telecasterServiceName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String100"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlButtonIndex" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="urlLabel" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="urlLabelAscii" type="{http://www.cisco.com/AXL/API/8.5}String100" minOccurs="0"/>
 *         &lt;element name="serviceNameAscii" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSubscribedService", propOrder = {
    "telecasterServiceName",
    "name",
    "url",
    "urlButtonIndex",
    "urlLabel",
    "urlLabelAscii",
    "serviceNameAscii"
})
public class XSubscribedService {

    protected XFkType telecasterServiceName;
    protected String name;
    @XmlElementRef(name = "url", type = JAXBElement.class)
    protected JAXBElement<String> url;
    @XmlElement(defaultValue = "0")
    protected String urlButtonIndex;
    protected String urlLabel;
    protected String urlLabelAscii;
    protected String serviceNameAscii;

    /**
     * Gets the value of the telecasterServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getTelecasterServiceName() {
        return telecasterServiceName;
    }

    /**
     * Sets the value of the telecasterServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setTelecasterServiceName(XFkType value) {
        this.telecasterServiceName = value;
    }

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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urlButtonIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlButtonIndex() {
        return urlButtonIndex;
    }

    /**
     * Sets the value of the urlButtonIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlButtonIndex(String value) {
        this.urlButtonIndex = value;
    }

    /**
     * Gets the value of the urlLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLabel() {
        return urlLabel;
    }

    /**
     * Sets the value of the urlLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLabel(String value) {
        this.urlLabel = value;
    }

    /**
     * Gets the value of the urlLabelAscii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLabelAscii() {
        return urlLabelAscii;
    }

    /**
     * Sets the value of the urlLabelAscii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLabelAscii(String value) {
        this.urlLabelAscii = value;
    }

    /**
     * Gets the value of the serviceNameAscii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNameAscii() {
        return serviceNameAscii;
    }

    /**
     * Sets the value of the serviceNameAscii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNameAscii(String value) {
        this.serviceNameAscii = value;
    }

}
