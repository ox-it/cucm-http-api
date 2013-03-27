
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDeviceMobilityReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDeviceMobilityReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="deviceMobility" type="{http://www.cisco.com/AXL/API/8.0}XDeviceMobility"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDeviceMobilityReq", propOrder = {
    "deviceMobility"
})
public class AddDeviceMobilityReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDeviceMobility deviceMobility;

    /**
     * Gets the value of the deviceMobility property.
     * 
     * @return
     *     possible object is
     *     {@link XDeviceMobility }
     *     
     */
    public XDeviceMobility getDeviceMobility() {
        return deviceMobility;
    }

    /**
     * Sets the value of the deviceMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDeviceMobility }
     *     
     */
    public void setDeviceMobility(XDeviceMobility value) {
        this.deviceMobility = value;
    }

}
