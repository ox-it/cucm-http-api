
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDevicePoolReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDevicePoolReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="devicePool" type="{http://www.cisco.com/AXL/API/8.0}XDevicePool"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDevicePoolReq", propOrder = {
    "devicePool"
})
public class AddDevicePoolReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDevicePool devicePool;

    /**
     * Gets the value of the devicePool property.
     * 
     * @return
     *     possible object is
     *     {@link XDevicePool }
     *     
     */
    public XDevicePool getDevicePool() {
        return devicePool;
    }

    /**
     * Sets the value of the devicePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDevicePool }
     *     
     */
    public void setDevicePool(XDevicePool value) {
        this.devicePool = value;
    }

}
