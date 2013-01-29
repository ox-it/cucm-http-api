
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDeviceMobilityGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDeviceMobilityGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="deviceMobilityGroup" type="{http://www.cisco.com/AXL/API/8.5}XDeviceMobilityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDeviceMobilityGroupReq", propOrder = {
    "deviceMobilityGroup"
})
public class AddDeviceMobilityGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDeviceMobilityGroup deviceMobilityGroup;

    /**
     * Gets the value of the deviceMobilityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XDeviceMobilityGroup }
     *     
     */
    public XDeviceMobilityGroup getDeviceMobilityGroup() {
        return deviceMobilityGroup;
    }

    /**
     * Sets the value of the deviceMobilityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDeviceMobilityGroup }
     *     
     */
    public void setDeviceMobilityGroup(XDeviceMobilityGroup value) {
        this.deviceMobilityGroup = value;
    }

}
