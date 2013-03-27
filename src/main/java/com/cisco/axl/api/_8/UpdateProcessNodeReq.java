
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateProcessNodeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProcessNodeReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="mac" type="{http://www.cisco.com/AXL/API/8.0}XMacAddress" minOccurs="0"/>
 *         &lt;element name="ipv6Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProcessNodeReq", propOrder = {
    "newName",
    "description",
    "mac",
    "ipv6Name"
})
public class UpdateProcessNodeReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String mac;
    protected String ipv6Name;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the ipv6Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6Name() {
        return ipv6Name;
    }

    /**
     * Sets the value of the ipv6Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6Name(String value) {
        this.ipv6Name = value;
    }

}
