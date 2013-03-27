
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RRemoteDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RRemoteDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answerTooSoonTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="answerTooLateTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="delayBeforeRingingCell" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="remoteDestinationProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *           &lt;element name="dualModeDeviceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="isMobilePhone" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileConnect" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="lineAssociations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="lineAssociation" type="{http://www.cisco.com/AXL/API/8.0}RLineAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="timeZone" type="{http://www.cisco.com/AXL/API/8.0}XTimeZone" minOccurs="0"/>
 *         &lt;element name="todAccessName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="mobileSmartClientName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RRemoteDestination", propOrder = {
    "name",
    "destination",
    "answerTooSoonTimer",
    "answerTooLateTimer",
    "delayBeforeRingingCell",
    "remoteDestinationProfileName",
    "dualModeDeviceName",
    "isMobilePhone",
    "enableMobileConnect",
    "lineAssociations",
    "timeZone",
    "todAccessName",
    "mobileSmartClientName"
})
public class RRemoteDestination {

    protected String name;
    protected String destination;
    protected String answerTooSoonTimer;
    protected String answerTooLateTimer;
    protected String delayBeforeRingingCell;
    protected XFkType remoteDestinationProfileName;
    protected XFkType dualModeDeviceName;
    protected String isMobilePhone;
    protected String enableMobileConnect;
    protected RRemoteDestination.LineAssociations lineAssociations;
    protected String timeZone;
    protected XFkType todAccessName;
    protected XFkType mobileSmartClientName;
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
     * Gets the value of the lineAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link RRemoteDestination.LineAssociations }
     *     
     */
    public RRemoteDestination.LineAssociations getLineAssociations() {
        return lineAssociations;
    }

    /**
     * Sets the value of the lineAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RRemoteDestination.LineAssociations }
     *     
     */
    public void setLineAssociations(RRemoteDestination.LineAssociations value) {
        this.lineAssociations = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="lineAssociation" type="{http://www.cisco.com/AXL/API/8.0}RLineAssociation" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lineAssociation"
    })
    public static class LineAssociations {

        protected List<RLineAssociation> lineAssociation;

        /**
         * Gets the value of the lineAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RLineAssociation }
         * 
         * 
         */
        public List<RLineAssociation> getLineAssociation() {
            if (lineAssociation == null) {
                lineAssociation = new ArrayList<RLineAssociation>();
            }
            return this.lineAssociation;
        }

    }

}
