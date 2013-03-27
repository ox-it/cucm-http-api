
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCommonPhoneConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCommonPhoneConfigReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="commonPhoneConfig" type="{http://www.cisco.com/AXL/API/8.0}XCommonPhoneConfig"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCommonPhoneConfigReq", propOrder = {
    "commonPhoneConfig"
})
public class AddCommonPhoneConfigReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCommonPhoneConfig commonPhoneConfig;

    /**
     * Gets the value of the commonPhoneConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XCommonPhoneConfig }
     *     
     */
    public XCommonPhoneConfig getCommonPhoneConfig() {
        return commonPhoneConfig;
    }

    /**
     * Sets the value of the commonPhoneConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCommonPhoneConfig }
     *     
     */
    public void setCommonPhoneConfig(XCommonPhoneConfig value) {
        this.commonPhoneConfig = value;
    }

}
