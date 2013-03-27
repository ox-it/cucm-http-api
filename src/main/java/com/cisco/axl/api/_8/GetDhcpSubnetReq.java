
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDhcpSubnetReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDhcpSubnetReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="dhcpServerName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *             &lt;element name="subnetIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/8.0}RDhcpSubnet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDhcpSubnetReq", propOrder = {
    "uuid",
    "dhcpServerName",
    "subnetIpAddress",
    "returnedTags"
})
public class GetDhcpSubnetReq {

    protected String uuid;
    protected XFkType dhcpServerName;
    protected String subnetIpAddress;
    protected RDhcpSubnet returnedTags;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

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
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link RDhcpSubnet }
     *     
     */
    public RDhcpSubnet getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link RDhcpSubnet }
     *     
     */
    public void setReturnedTags(RDhcpSubnet value) {
        this.returnedTags = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}
