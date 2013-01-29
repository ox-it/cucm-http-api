
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTimeScheduleReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTimeScheduleReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="timeSchedule" type="{http://www.cisco.com/AXL/API/8.5}XTimeSchedule"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTimeScheduleReq", propOrder = {
    "timeSchedule"
})
public class AddTimeScheduleReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTimeSchedule timeSchedule;

    /**
     * Gets the value of the timeSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeSchedule }
     *     
     */
    public XTimeSchedule getTimeSchedule() {
        return timeSchedule;
    }

    /**
     * Sets the value of the timeSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeSchedule }
     *     
     */
    public void setTimeSchedule(XTimeSchedule value) {
        this.timeSchedule = value;
    }

}
