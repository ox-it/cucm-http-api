
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRemoteDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRemoteDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="answerTooSoonTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="answerTooLateTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="delayBeforeRingingCell" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;choice>
 *           &lt;element name="remoteDestinationProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *           &lt;element name="dualModeDeviceName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;/choice>
 *         &lt;element name="isMobilePhone" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileConnect" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="lineAssociations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="lineAssociation" type="{http://www.cisco.com/AXL/API/8.0}XLineAssociation" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="timeZone" type="{http://www.cisco.com/AXL/API/8.0}XTimeZone" minOccurs="0"/>
 *         &lt;element name="todAccessName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="mobileSmartClientName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRemoteDestination", propOrder = {
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
public class XRemoteDestination {

    protected String name;
    protected String destination;
    @XmlElement(defaultValue = "1500")
    protected String answerTooSoonTimer;
    @XmlElement(defaultValue = "19000")
    protected String answerTooLateTimer;
    @XmlElement(defaultValue = "4000")
    protected String delayBeforeRingingCell;
    @XmlElementRef(name = "remoteDestinationProfileName", type = JAXBElement.class)
    protected JAXBElement<XFkType> remoteDestinationProfileName;
    @XmlElementRef(name = "dualModeDeviceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> dualModeDeviceName;
    @XmlElement(defaultValue = "false")
    protected String isMobilePhone;
    @XmlElement(defaultValue = "true")
    protected String enableMobileConnect;
    protected XRemoteDestination.LineAssociations lineAssociations;
    @XmlElement(defaultValue = "GMT")
    protected String timeZone;
    @XmlElementRef(name = "todAccessName", type = JAXBElement.class)
    protected JAXBElement<XFkType> todAccessName;
    @XmlElementRef(name = "mobileSmartClientName", type = JAXBElement.class)
    protected JAXBElement<XFkType> mobileSmartClientName;

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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRemoteDestinationProfileName() {
        return remoteDestinationProfileName;
    }

    /**
     * Sets the value of the remoteDestinationProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRemoteDestinationProfileName(JAXBElement<XFkType> value) {
        this.remoteDestinationProfileName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the dualModeDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDualModeDeviceName() {
        return dualModeDeviceName;
    }

    /**
     * Sets the value of the dualModeDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDualModeDeviceName(JAXBElement<XFkType> value) {
        this.dualModeDeviceName = ((JAXBElement<XFkType> ) value);
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
     *     {@link XRemoteDestination.LineAssociations }
     *     
     */
    public XRemoteDestination.LineAssociations getLineAssociations() {
        return lineAssociations;
    }

    /**
     * Sets the value of the lineAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteDestination.LineAssociations }
     *     
     */
    public void setLineAssociations(XRemoteDestination.LineAssociations value) {
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getTodAccessName() {
        return todAccessName;
    }

    /**
     * Sets the value of the todAccessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setTodAccessName(JAXBElement<XFkType> value) {
        this.todAccessName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the mobileSmartClientName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMobileSmartClientName() {
        return mobileSmartClientName;
    }

    /**
     * Sets the value of the mobileSmartClientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMobileSmartClientName(JAXBElement<XFkType> value) {
        this.mobileSmartClientName = ((JAXBElement<XFkType> ) value);
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
     *         &lt;element name="lineAssociation" type="{http://www.cisco.com/AXL/API/8.0}XLineAssociation" maxOccurs="unbounded"/>
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

        protected List<XLineAssociation> lineAssociation;

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
         * {@link XLineAssociation }
         * 
         * 
         */
        public List<XLineAssociation> getLineAssociation() {
            if (lineAssociation == null) {
                lineAssociation = new ArrayList<XLineAssociation>();
            }
            return this.lineAssociation;
        }

    }

}
