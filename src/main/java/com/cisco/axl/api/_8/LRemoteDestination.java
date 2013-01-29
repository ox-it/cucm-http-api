
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LRemoteDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LRemoteDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answerTooSoonTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="answerTooLateTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="delayBeforeRingingCell" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="remoteDestinationProfileName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *           &lt;element name="dualModeDeviceName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="isMobilePhone" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileConnect" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.cisco.com/AXL/API/8.5}XTimeZone" minOccurs="0"/>
 *         &lt;element name="todAccessName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="mobileSmartClientName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="mobilityProfileName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRemoteDestination", propOrder = {
    "name",
    "destination",
    "answerTooSoonTimer",
    "answerTooLateTimer",
    "delayBeforeRingingCell",
    "remoteDestinationProfileName",
    "dualModeDeviceName",
    "isMobilePhone",
    "enableMobileConnect",
    "timeZone",
    "todAccessName",
    "mobileSmartClientName",
    "mobilityProfileName"
})
public class LRemoteDestination {

    protected String name;
    protected String destination;
    protected String answerTooSoonTimer;
    protected String answerTooLateTimer;
    protected String delayBeforeRingingCell;
    protected XFkType remoteDestinationProfileName;
    protected XFkType dualModeDeviceName;
    protected String isMobilePhone;
    protected String enableMobileConnect;
    protected String timeZone;
    protected XFkType todAccessName;
    protected XFkType mobileSmartClientName;
    protected XFkType mobilityProfileName;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the answerTooSoonTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerTooSoonTimer() {
        return answerTooSoonTimer;
    }

    /**
     * Sets the value of the answerTooSoonTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerTooSoonTimer(String value) {
        this.answerTooSoonTimer = value;
    }

    /**
     * Gets the value of the answerTooLateTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerTooLateTimer() {
        return answerTooLateTimer;
    }

    /**
     * Sets the value of the answerTooLateTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerTooLateTimer(String value) {
        this.answerTooLateTimer = value;
    }

    /**
     * Gets the value of the delayBeforeRingingCell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayBeforeRingingCell() {
        return delayBeforeRingingCell;
    }

    /**
     * Sets the value of the delayBeforeRingingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayBeforeRingingCell(String value) {
        this.delayBeforeRingingCell = value;
    }

    /**
     * Gets the value of the remoteDestinationProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRemoteDestinationProfileName() {
        return remoteDestinationProfileName;
    }

    /**
     * Sets the value of the remoteDestinationProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRemoteDestinationProfileName(XFkType value) {
        this.remoteDestinationProfileName = value;
    }

    /**
     * Gets the value of the dualModeDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDualModeDeviceName() {
        return dualModeDeviceName;
    }

    /**
     * Sets the value of the dualModeDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDualModeDeviceName(XFkType value) {
        this.dualModeDeviceName = value;
    }

    /**
     * Gets the value of the isMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMobilePhone() {
        return isMobilePhone;
    }

    /**
     * Sets the value of the isMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMobilePhone(String value) {
        this.isMobilePhone = value;
    }

    /**
     * Gets the value of the enableMobileConnect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobileConnect() {
        return enableMobileConnect;
    }

    /**
     * Sets the value of the enableMobileConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobileConnect(String value) {
        this.enableMobileConnect = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the todAccessName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getTodAccessName() {
        return todAccessName;
    }

    /**
     * Sets the value of the todAccessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setTodAccessName(XFkType value) {
        this.todAccessName = value;
    }

    /**
     * Gets the value of the mobileSmartClientName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMobileSmartClientName() {
        return mobileSmartClientName;
    }

    /**
     * Sets the value of the mobileSmartClientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMobileSmartClientName(XFkType value) {
        this.mobileSmartClientName = value;
    }

    /**
     * Gets the value of the mobilityProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMobilityProfileName() {
        return mobilityProfileName;
    }

    /**
     * Sets the value of the mobilityProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMobilityProfileName(XFkType value) {
        this.mobilityProfileName = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
