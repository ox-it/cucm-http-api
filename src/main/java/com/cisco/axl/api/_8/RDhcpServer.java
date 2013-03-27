
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDhcpServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDhcpServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="primaryDnsIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryDnsIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryTftpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryTftpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bootstrapServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tftpServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arpCacheTimeout" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="ipAddressLeaseTime" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="renewalTime" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="rebindingTime" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
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
@XmlType(name = "RDhcpServer", propOrder = {
    "processNodeName",
    "primaryDnsIpAddress",
    "secondaryDnsIpAddress",
    "primaryTftpServerIpAddress",
    "secondaryTftpServerIpAddress",
    "bootstrapServerIpAddress",
    "domainName",
    "tftpServerName",
    "arpCacheTimeout",
    "ipAddressLeaseTime",
    "renewalTime",
    "rebindingTime"
})
public class RDhcpServer {

    protected XFkType processNodeName;
    protected String primaryDnsIpAddress;
    protected String secondaryDnsIpAddress;
    protected String primaryTftpServerIpAddress;
    protected String secondaryTftpServerIpAddress;
    protected String bootstrapServerIpAddress;
    protected String domainName;
    protected String tftpServerName;
    protected String arpCacheTimeout;
    protected String ipAddressLeaseTime;
    protected String renewalTime;
    protected String rebindingTime;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
    }

    /**
     * Gets the value of the primaryDnsIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDnsIpAddress() {
        return primaryDnsIpAddress;
    }

    /**
     * Sets the value of the primaryDnsIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDnsIpAddress(String value) {
        this.primaryDnsIpAddress = value;
    }

    /**
     * Gets the value of the secondaryDnsIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDnsIpAddress() {
        return secondaryDnsIpAddress;
    }

    /**
     * Sets the value of the secondaryDnsIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDnsIpAddress(String value) {
        this.secondaryDnsIpAddress = value;
    }

    /**
     * Gets the value of the primaryTftpServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTftpServerIpAddress() {
        return primaryTftpServerIpAddress;
    }

    /**
     * Sets the value of the primaryTftpServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTftpServerIpAddress(String value) {
        this.primaryTftpServerIpAddress = value;
    }

    /**
     * Gets the value of the secondaryTftpServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryTftpServerIpAddress() {
        return secondaryTftpServerIpAddress;
    }

    /**
     * Sets the value of the secondaryTftpServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryTftpServerIpAddress(String value) {
        this.secondaryTftpServerIpAddress = value;
    }

    /**
     * Gets the value of the bootstrapServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBootstrapServerIpAddress() {
        return bootstrapServerIpAddress;
    }

    /**
     * Sets the value of the bootstrapServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBootstrapServerIpAddress(String value) {
        this.bootstrapServerIpAddress = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the tftpServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTftpServerName() {
        return tftpServerName;
    }

    /**
     * Sets the value of the tftpServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTftpServerName(String value) {
        this.tftpServerName = value;
    }

    /**
     * Gets the value of the arpCacheTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArpCacheTimeout() {
        return arpCacheTimeout;
    }

    /**
     * Sets the value of the arpCacheTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArpCacheTimeout(String value) {
        this.arpCacheTimeout = value;
    }

    /**
     * Gets the value of the ipAddressLeaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressLeaseTime() {
        return ipAddressLeaseTime;
    }

    /**
     * Sets the value of the ipAddressLeaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressLeaseTime(String value) {
        this.ipAddressLeaseTime = value;
    }

    /**
     * Gets the value of the renewalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalTime() {
        return renewalTime;
    }

    /**
     * Sets the value of the renewalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalTime(String value) {
        this.renewalTime = value;
    }

    /**
     * Gets the value of the rebindingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebindingTime() {
        return rebindingTime;
    }

    /**
     * Sets the value of the rebindingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebindingTime(String value) {
        this.rebindingTime = value;
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
