
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XIpPhoneServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XIpPhoneServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="serviceName" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128"/>
 *         &lt;element name="asciiServiceName" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128"/>
 *         &lt;element name="serviceDescription" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="serviceUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secureServiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCategory" type="{http://www.cisco.com/AXL/API/8.0}XPhoneServiceCategory"/>
 *         &lt;element name="serviceType" type="{http://www.cisco.com/AXL/API/8.0}XPhoneService"/>
 *         &lt;element name="serviceVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enterpriseSubscription" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="parameter" type="{http://www.cisco.com/AXL/API/8.0}XIpPhoneServicesParameter" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XIpPhoneServices", propOrder = {
    "serviceName",
    "asciiServiceName",
    "serviceDescription",
    "serviceUrl",
    "secureServiceUrl",
    "serviceCategory",
    "serviceType",
    "serviceVendor",
    "serviceVersion",
    "enabled",
    "enterpriseSubscription",
    "parameters"
})
public class XIpPhoneServices {

    protected String serviceName;
    protected String asciiServiceName;
    @XmlElementRef(name = "serviceDescription", type = JAXBElement.class)
    protected JAXBElement<String> serviceDescription;
    @XmlElementRef(name = "serviceUrl", type = JAXBElement.class)
    protected JAXBElement<String> serviceUrl;
    @XmlElementRef(name = "secureServiceUrl", type = JAXBElement.class)
    protected JAXBElement<String> secureServiceUrl;
    @XmlElement(defaultValue = "XML Service")
    protected String serviceCategory;
    @XmlElement(defaultValue = "Standard IP Phone Service")
    protected String serviceType;
    protected String serviceVendor;
    protected String serviceVersion;
    @XmlElement(defaultValue = "true")
    protected String enabled;
    @XmlElement(defaultValue = "false")
    protected String enterpriseSubscription;
    protected XIpPhoneServices.Parameters parameters;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the asciiServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsciiServiceName() {
        return asciiServiceName;
    }

    /**
     * Sets the value of the asciiServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsciiServiceName(String value) {
        this.asciiServiceName = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceDescription(JAXBElement<String> value) {
        this.serviceDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Sets the value of the serviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceUrl(JAXBElement<String> value) {
        this.serviceUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secureServiceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecureServiceUrl() {
        return secureServiceUrl;
    }

    /**
     * Sets the value of the secureServiceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecureServiceUrl(JAXBElement<String> value) {
        this.secureServiceUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVendor() {
        return serviceVendor;
    }

    /**
     * Sets the value of the serviceVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVendor(String value) {
        this.serviceVendor = value;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of the serviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVersion(String value) {
        this.serviceVersion = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the enterpriseSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseSubscription() {
        return enterpriseSubscription;
    }

    /**
     * Sets the value of the enterpriseSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseSubscription(String value) {
        this.enterpriseSubscription = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link XIpPhoneServices.Parameters }
     *     
     */
    public XIpPhoneServices.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIpPhoneServices.Parameters }
     *     
     */
    public void setParameters(XIpPhoneServices.Parameters value) {
        this.parameters = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="parameter" type="{http://www.cisco.com/AXL/API/8.0}XIpPhoneServicesParameter" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parameter"
    })
    public static class Parameters
        extends XCommonMembersExtension
    {

        protected List<XIpPhoneServicesParameter> parameter;

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XIpPhoneServicesParameter }
         * 
         * 
         */
        public List<XIpPhoneServicesParameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<XIpPhoneServicesParameter>();
            }
            return this.parameter;
        }

    }

}
