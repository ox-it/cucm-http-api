
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTimePeriodReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTimePeriodReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.cisco.com/AXL/API/8.5}XTimeOfDay" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.cisco.com/AXL/API/8.5}XTimeOfDay" minOccurs="0"/>
 *         &lt;element name="startDay" type="{http://www.cisco.com/AXL/API/8.5}XDayOfWeek" minOccurs="0"/>
 *         &lt;element name="endDay" type="{http://www.cisco.com/AXL/API/8.5}XDayOfWeek" minOccurs="0"/>
 *         &lt;element name="monthOfYear" type="{http://www.cisco.com/AXL/API/8.5}XMonthOfYear" minOccurs="0"/>
 *         &lt;element name="dayOfMonth" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="dayOfMonthEnd" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="monthOfYearEnd" type="{http://www.cisco.com/AXL/API/8.5}XMonthOfYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTimePeriodReq", propOrder = {
    "newName",
    "startTime",
    "endTime",
    "startDay",
    "endDay",
    "monthOfYear",
    "dayOfMonth",
    "description",
    "dayOfMonthEnd",
    "monthOfYearEnd"
})
public class UpdateTimePeriodReq
    extends NameAndGUIDRequest
{

    protected String newName;
    @XmlElement(defaultValue = "No Office Hours")
    protected String startTime;
    @XmlElement(defaultValue = "No Office Hours")
    protected String endTime;
    @XmlElement(defaultValue = "None")
    protected String startDay;
    @XmlElement(defaultValue = "None")
    protected String endDay;
    @XmlElement(defaultValue = "None")
    protected String monthOfYear;
    @XmlElement(defaultValue = "0")
    protected String dayOfMonth;
    protected String description;
    @XmlElement(defaultValue = "0")
    protected String dayOfMonthEnd;
    @XmlElement(defaultValue = "None")
    protected String monthOfYearEnd;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the startDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDay() {
        return startDay;
    }

    /**
     * Sets the value of the startDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDay(String value) {
        this.startDay = value;
    }

    /**
     * Gets the value of the endDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDay() {
        return endDay;
    }

    /**
     * Sets the value of the endDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDay(String value) {
        this.endDay = value;
    }

    /**
     * Gets the value of the monthOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthOfYear() {
        return monthOfYear;
    }

    /**
     * Sets the value of the monthOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthOfYear(String value) {
        this.monthOfYear = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfMonth(String value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dayOfMonthEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfMonthEnd() {
        return dayOfMonthEnd;
    }

    /**
     * Sets the value of the dayOfMonthEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfMonthEnd(String value) {
        this.dayOfMonthEnd = value;
    }

    /**
     * Gets the value of the monthOfYearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthOfYearEnd() {
        return monthOfYearEnd;
    }

    /**
     * Sets the value of the monthOfYearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthOfYearEnd(String value) {
        this.monthOfYearEnd = value;
    }

}
