
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLicenseCapabilitiesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLicenseCapabilitiesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID"/>
 *           &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="enableUps" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableUpc" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLicenseCapabilitiesReq", propOrder = {
    "uuid",
    "userid",
    "enableUps",
    "enableUpc"
})
public class UpdateLicenseCapabilitiesReq
    extends APIRequest
{

    protected String uuid;
    protected String userid;
    @XmlElement(defaultValue = "false")
    protected String enableUps;
    @XmlElement(defaultValue = "false")
    protected String enableUpc;

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
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the enableUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableUps() {
        return enableUps;
    }

    /**
     * Sets the value of the enableUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableUps(String value) {
        this.enableUps = value;
    }

    /**
     * Gets the value of the enableUpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableUpc() {
        return enableUpc;
    }

    /**
     * Sets the value of the enableUpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableUpc(String value) {
        this.enableUpc = value;
    }

}
