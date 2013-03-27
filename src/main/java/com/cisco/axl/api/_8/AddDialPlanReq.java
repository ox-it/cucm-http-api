
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDialPlanReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDialPlanReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="dialPlan" type="{http://www.cisco.com/AXL/API/8.0}XDialPlan"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDialPlanReq", propOrder = {
    "dialPlan"
})
public class AddDialPlanReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDialPlan dialPlan;

    /**
     * Gets the value of the dialPlan property.
     * 
     * @return
     *     possible object is
     *     {@link XDialPlan }
     *     
     */
    public XDialPlan getDialPlan() {
        return dialPlan;
    }

    /**
     * Sets the value of the dialPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDialPlan }
     *     
     */
    public void setDialPlan(XDialPlan value) {
        this.dialPlan = value;
    }

}
