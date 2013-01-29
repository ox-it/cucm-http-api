
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDhcpSubnetReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDhcpSubnetReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="dhcpServerName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *             &lt;element name="subnetIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="newDhcpServerName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="newSubnetIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryStartIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryEndIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryStartIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryEndIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryRouterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryRouterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryDnsIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryDnsIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tftpServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryTftpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryTftpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bootstrapServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arpCacheTimeout" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="ipAddressLeaseTime" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="renewalTime" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="rebindingTime" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDhcpSubnetReq", propOrder = {
    "uuid",
    "dhcpServerName",
    "subnetIpAddress",
    "newDhcpServerName",
    "newSubnetIpAddress",
    "primaryStartIpAddress",
    "primaryEndIpAddress",
    "secondaryStartIpAddress",
    "secondaryEndIpAddress",
    "primaryRouterIpAddress",
    "secondaryRouterIpAddress",
    "subnetMask",
    "domainName",
    "primaryDnsIpAddress",
    "secondaryDnsIpAddress",
    "tftpServerName",
    "primaryTftpServerIpAddress",
    "secondaryTftpServerIpAddress",
    "bootstrapServerIpAddress",
    "arpCacheTimeout",
    "ipAddressLeaseTime",
    "renewalTime",
    "rebindingTime"
})
public class UpdateDhcpSubnetReq
    extends APIRequest
{

    protected String uuid;
    protected XFkType dhcpServerName;
    protected String subnetIpAddress;
    protected XFkType newDhcpServerName;
    protected String newSubnetIpAddress;
    protected String primaryStartIpAddress;
    protected String primaryEndIpAddress;
    protected String secondaryStartIpAddress;
    protected String secondaryEndIpAddress;
    protected String primaryRouterIpAddress;
    protected String secondaryRouterIpAddress;
    protected String subnetMask;
    protected String domainName;
    protected String primaryDnsIpAddress;
    protected String secondaryDnsIpAddress;
    protected String tftpServerName;
    protected String primaryTftpServerIpAddress;
    protected String secondaryTftpServerIpAddress;
    protected String bootstrapServerIpAddress;
    @XmlElement(defaultValue = "0")
    protected String arpCacheTimeout;
    @XmlElement(defaultValue = "0")
    protected String ipAddressLeaseTime;
    @XmlElement(defaultValue = "0")
    protected String renewalTime;
    @XmlElement(defaultValue = "0")
    protected String rebindingTime;

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
     * Gets the value of the dhcpServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDhcpServerName() {
        return dhcpServerName;
    }

    /**
     * Sets the value of the dhcpServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDhcpServerName(XFkType value) {
        this.dhcpServerName = value;
    }

    /**
     * Gets the value of the subnetIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetIpAddress() {
        return subnetIpAddress;
    }

    /**
     * Sets the value of the subnetIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetIpAddress(String value) {
        this.subnetIpAddress = value;
    }

    /**
     * Gets the value of the newDhcpServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNewDhcpServerName() {
        return newDhcpServerName;
    }

    /**
     * Sets the value of the newDhcpServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNewDhcpServerName(XFkType value) {
        this.newDhcpServerName = value;
    }

    /**
     * Gets the value of the newSubnetIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSubnetIpAddress() {
        return newSubnetIpAddress;
    }

    /**
     * Sets the value of the newSubnetIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSubnetIpAddress(String value) {
        this.newSubnetIpAddress = value;
    }

    /**
     * Gets the value of the primaryStartIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryStartIpAddress() {
        return primaryStartIpAddress;
    }

    /**
     * Sets the value of the primaryStartIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryStartIpAddress(String value) {
        this.primaryStartIpAddress = value;
    }

    /**
     * Gets the value of the primaryEndIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEndIpAddress() {
        return primaryEndIpAddress;
    }

    /**
     * Sets the value of the primaryEndIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEndIpAddress(String value) {
        this.primaryEndIpAddress = value;
    }

    /**
     * Gets the value of the secondaryStartIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryStartIpAddress() {
        return secondaryStartIpAddress;
    }

    /**
     * Sets the value of the secondaryStartIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryStartIpAddress(String value) {
        this.secondaryStartIpAddress = value;
    }

    /**
     * Gets the value of the secondaryEndIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryEndIpAddress() {
        return secondaryEndIpAddress;
    }

    /**
     * Sets the value of the secondaryEndIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryEndIpAddress(String value) {
        this.secondaryEndIpAddress = value;
    }

    /**
     * Gets the value of the primaryRouterIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryRouterIpAddress() {
        return primaryRouterIpAddress;
    }

    /**
     * Sets the value of the primaryRouterIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryRouterIpAddress(String value) {
        this.primaryRouterIpAddress = value;
    }

    /**
     * Gets the value of the secondaryRouterIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryRouterIpAddress() {
        return secondaryRouterIpAddress;
    }

    /**
     * Sets the value of the secondaryRouterIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryRouterIpAddress(String value) {
        this.secondaryRouterIpAddress = value;
    }

    /**
     * Gets the value of the subnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMask() {
        return subnetMask;
    }

    /**
     * Sets the value of the subnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMask(String value) {
        this.subnetMask = value;
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

}
