
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RRemoteClusterMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RRemoteClusterMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="enabled" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="remoteIpAddress1" type="{http://www.cisco.com/AXL/API/8.5}String15" minOccurs="0"/>
 *         &lt;element name="remoteIpAddress2" type="{http://www.cisco.com/AXL/API/8.5}String15" minOccurs="0"/>
 *         &lt;element name="remoteIpAddress3" type="{http://www.cisco.com/AXL/API/8.5}String15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RRemoteClusterMember", propOrder = {
    "enabled",
    "remoteIpAddress1",
    "remoteIpAddress2",
    "remoteIpAddress3"
})
public class RRemoteClusterMember {

    protected String enabled;
    protected String remoteIpAddress1;
    protected String remoteIpAddress2;
    protected String remoteIpAddress3;

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
     * Gets the value of the remoteIpAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIpAddress1() {
        return remoteIpAddress1;
    }

    /**
     * Sets the value of the remoteIpAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIpAddress1(String value) {
        this.remoteIpAddress1 = value;
    }

    /**
     * Gets the value of the remoteIpAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIpAddress2() {
        return remoteIpAddress2;
    }

    /**
     * Sets the value of the remoteIpAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIpAddress2(String value) {
        this.remoteIpAddress2 = value;
    }

    /**
     * Gets the value of the remoteIpAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIpAddress3() {
        return remoteIpAddress3;
    }

    /**
     * Sets the value of the remoteIpAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIpAddress3(String value) {
        this.remoteIpAddress3 = value;
    }

}
