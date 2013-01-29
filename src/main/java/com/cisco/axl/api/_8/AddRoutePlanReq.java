
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRoutePlanReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRoutePlanReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="routePlan" type="{http://www.cisco.com/AXL/API/8.5}XRoutePlan"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRoutePlanReq", propOrder = {
    "routePlan"
})
public class AddRoutePlanReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRoutePlan routePlan;

    /**
     * Gets the value of the routePlan property.
     * 
     * @return
     *     possible object is
     *     {@link XRoutePlan }
     *     
     */
    public XRoutePlan getRoutePlan() {
        return routePlan;
    }

    /**
     * Sets the value of the routePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRoutePlan }
     *     
     */
    public void setRoutePlan(XRoutePlan value) {
        this.routePlan = value;
    }

}
