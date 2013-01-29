
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSubscribedService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSubscribedService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="telecasterServiceName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String100" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlButtonIndex" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="urlLabel" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="urlLabelAscii" type="{http://www.cisco.com/AXL/API/8.5}String100" minOccurs="0"/>
 *         &lt;element name="serviceNameAscii" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="phoneService" type="{http://www.cisco.com/AXL/API/8.5}XPhoneService" minOccurs="0"/>
 *         &lt;element name="phoneServiceCategory" type="{http://www.cisco.com/AXL/API/8.5}XPhoneServiceCategory" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "RSubscribedService", propOrder = {
    "telecasterServiceName",
    "name",
    "url",
    "urlButtonIndex",
    "urlLabel",
    "urlLabelAscii",
    "serviceNameAscii",
    "phoneService",
    "phoneServiceCategory",
    "vendor",
    "version",
    "priority"
})
public class RSubscribedService {

    protected XFkType telecasterServiceName;
    protected String name;
    protected String url;
    protected String urlButtonIndex;
    protected String urlLabel;
    protected String urlLabelAscii;
    protected String serviceNameAscii;
    protected String phoneService;
    protected String phoneServiceCategory;
    protected String vendor;
    protected String version;
    protected Integer priority;
    @XmlAttribute
    protected String uuid;

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
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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

    /**
     * Gets the value of the phoneService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneService() {
        return phoneService;
    }

    /**
     * Sets the value of the phoneService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneService(String value) {
        this.phoneService = value;
    }

    /**
     * Gets the value of the phoneServiceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneServiceCategory() {
        return phoneServiceCategory;
    }

    /**
     * Sets the value of the phoneServiceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneServiceCategory(String value) {
        this.phoneServiceCategory = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
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
