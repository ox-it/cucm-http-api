
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddIpPhoneServicesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddIpPhoneServicesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ipPhoneServices" type="{http://www.cisco.com/AXL/API/8.5}XIpPhoneServices"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddIpPhoneServicesReq", propOrder = {
    "ipPhoneServices"
})
public class AddIpPhoneServicesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XIpPhoneServices ipPhoneServices;

    /**
     * Gets the value of the ipPhoneServices property.
     * 
     * @return
     *     possible object is
     *     {@link XIpPhoneServices }
     *     
     */
    public XIpPhoneServices getIpPhoneServices() {
        return ipPhoneServices;
    }

    /**
     * Sets the value of the ipPhoneServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIpPhoneServices }
     *     
     */
    public void setIpPhoneServices(XIpPhoneServices value) {
        this.ipPhoneServices = value;
    }

}
