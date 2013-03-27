
package com.cisco.axl.api._8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XTvsCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XTvsCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeToLive" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ipv4Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipv6Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="role" type="{http://www.cisco.com/AXL/API/8.0}XCertificateRole" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="service" type="{http://www.cisco.com/AXL/API/8.0}XTvsCertificateService" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "XTvsCertificate", propOrder = {
    "subjectName",
    "issuerName",
    "serialNumber",
    "timeToLive",
    "ipv4Address",
    "ipv6Address",
    "roles",
    "services"
})
public class XTvsCertificate {

    protected String subjectName;
    protected String issuerName;
    protected String serialNumber;
    @XmlElementRef(name = "timeToLive", type = JAXBElement.class)
    protected JAXBElement<BigInteger> timeToLive;
    protected String ipv4Address;
    protected String ipv6Address;
    protected XTvsCertificate.Roles roles;
    protected XTvsCertificate.Services services;

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the issuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setTimeToLive(JAXBElement<BigInteger> value) {
        this.timeToLive = ((JAXBElement<BigInteger> ) value);
    }

    /**
     * Gets the value of the ipv4Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv4Address() {
        return ipv4Address;
    }

    /**
     * Sets the value of the ipv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv4Address(String value) {
        this.ipv4Address = value;
    }

    /**
     * Gets the value of the ipv6Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * Sets the value of the ipv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6Address(String value) {
        this.ipv6Address = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link XTvsCertificate.Roles }
     *     
     */
    public XTvsCertificate.Roles getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTvsCertificate.Roles }
     *     
     */
    public void setRoles(XTvsCertificate.Roles value) {
        this.roles = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link XTvsCertificate.Services }
     *     
     */
    public XTvsCertificate.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTvsCertificate.Services }
     *     
     */
    public void setServices(XTvsCertificate.Services value) {
        this.services = value;
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
     *         &lt;element name="role" type="{http://www.cisco.com/AXL/API/8.0}XCertificateRole" maxOccurs="unbounded"/>
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
        "role"
    })
    public static class Roles {

        protected List<XCertificateRole> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XCertificateRole }
         * 
         * 
         */
        public List<XCertificateRole> getRole() {
            if (role == null) {
                role = new ArrayList<XCertificateRole>();
            }
            return this.role;
        }

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
     *         &lt;element name="service" type="{http://www.cisco.com/AXL/API/8.0}XTvsCertificateService" maxOccurs="unbounded"/>
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
        "service"
    })
    public static class Services {

        protected List<XTvsCertificateService> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XTvsCertificateService }
         * 
         * 
         */
        public List<XTvsCertificateService> getService() {
            if (service == null) {
                service = new ArrayList<XTvsCertificateService>();
            }
            return this.service;
        }

    }

}
