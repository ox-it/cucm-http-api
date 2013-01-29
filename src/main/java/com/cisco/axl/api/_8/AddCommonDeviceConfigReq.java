
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCommonDeviceConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCommonDeviceConfigReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="commonDeviceConfig" type="{http://www.cisco.com/AXL/API/8.5}XCommonDeviceConfig"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCommonDeviceConfigReq", propOrder = {
    "commonDeviceConfig"
})
public class AddCommonDeviceConfigReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCommonDeviceConfig commonDeviceConfig;

    /**
     * Gets the value of the commonDeviceConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XCommonDeviceConfig }
     *     
     */
    public XCommonDeviceConfig getCommonDeviceConfig() {
        return commonDeviceConfig;
    }

    /**
     * Sets the value of the commonDeviceConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCommonDeviceConfig }
     *     
     */
    public void setCommonDeviceConfig(XCommonDeviceConfig value) {
        this.commonDeviceConfig = value;
    }

}
