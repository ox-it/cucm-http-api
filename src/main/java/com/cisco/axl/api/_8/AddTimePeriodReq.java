
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTimePeriodReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTimePeriodReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="timePeriod" type="{http://www.cisco.com/AXL/API/8.0}XTimePeriod"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTimePeriodReq", propOrder = {
    "timePeriod"
})
public class AddTimePeriodReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTimePeriod timePeriod;

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XTimePeriod }
     *     
     */
    public XTimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimePeriod }
     *     
     */
    public void setTimePeriod(XTimePeriod value) {
        this.timePeriod = value;
    }

}
