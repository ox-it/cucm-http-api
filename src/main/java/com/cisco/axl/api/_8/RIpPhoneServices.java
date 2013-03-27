
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RIpPhoneServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RIpPhoneServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="serviceName" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128" minOccurs="0"/>
 *         &lt;element name="asciiServiceName" type="{http://www.cisco.com/AXL/API/8.0}UniqueString128" minOccurs="0"/>
 *         &lt;element name="serviceDescription" type="{http://www.cisco.com/AXL/API/8.0}String128" minOccurs="0"/>
 *         &lt;element name="serviceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureServiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCategory" type="{http://www.cisco.com/AXL/API/8.0}XPhoneServiceCategory" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.cisco.com/AXL/API/8.0}XPhoneService" minOccurs="0"/>
 *         &lt;element name="serviceVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enterpriseSubscription" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="parameter" type="{http://www.cisco.com/AXL/API/8.0}RIpPhoneServicesParameter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "RIpPhoneServices", propOrder = {
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
public class RIpPhoneServices {

    protected String serviceName;
    protected String asciiServiceName;
    protected String serviceDescription;
    protected String serviceUrl;
    protected String secureServiceUrl;
    protected String serviceCategory;
    protected String serviceType;
    protected String serviceVendor;
    protected String serviceVersion;
    protected String enabled;
    protected String enterpriseSubscription;
    protected RIpPhoneServices.Parameters parameters;
    @XmlAttribute
    protected String uuid;

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
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the serviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Sets the value of the serviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUrl(String value) {
        this.serviceUrl = value;
    }

    /**
     * Gets the value of the secureServiceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureServiceUrl() {
        return secureServiceUrl;
    }

    /**
     * Sets the value of the secureServiceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureServiceUrl(String value) {
        this.secureServiceUrl = value;
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
     *     {@link RIpPhoneServices.Parameters }
     *     
     */
    public RIpPhoneServices.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RIpPhoneServices.Parameters }
     *     
     */
    public void setParameters(RIpPhoneServices.Parameters value) {
        this.parameters = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="parameter" type="{http://www.cisco.com/AXL/API/8.0}RIpPhoneServicesParameter" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
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
    public static class Parameters {

        protected List<RIpPhoneServicesParameter> parameter;

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
         * {@link RIpPhoneServicesParameter }
         * 
         * 
         */
        public List<RIpPhoneServicesParameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<RIpPhoneServicesParameter>();
            }
            return this.parameter;
        }

    }

}
