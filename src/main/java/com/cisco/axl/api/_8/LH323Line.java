
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LH323Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LH323Line">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="asciiLabel" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="display" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="dirn" type="{http://www.cisco.com/AXL/API/8.0}LDirn" minOccurs="0"/>
 *         &lt;element name="displayAscii" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="e164Mask" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="dialPlanWizardId" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="maxNumCalls" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="busyTrigger" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callInfoDisplay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="callerName" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="callerNumber" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="redirectedNumber" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="dialedNumber" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recordingProfileName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="monitoringCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="recordingFlag" type="{http://www.cisco.com/AXL/API/8.0}XRecordingFlag" minOccurs="0"/>
 *         &lt;element name="audibleMwi" type="{http://www.cisco.com/AXL/API/8.0}XStatus" minOccurs="0"/>
 *         &lt;element name="speedDial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partitionUsage" type="{http://www.cisco.com/AXL/API/8.0}XPartitionUsage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LH323Line", propOrder = {
    "index",
    "label",
    "asciiLabel",
    "display",
    "dirn",
    "displayAscii",
    "e164Mask",
    "dialPlanWizardId",
    "maxNumCalls",
    "busyTrigger",
    "callInfoDisplay",
    "recordingProfileName",
    "monitoringCssName",
    "recordingFlag",
    "audibleMwi",
    "speedDial",
    "partitionUsage"
})
public class LH323Line {

    protected String index;
    protected String label;
    protected String asciiLabel;
    protected String display;
    protected LDirn dirn;
    protected String displayAscii;
    protected String e164Mask;
    protected String dialPlanWizardId;
    protected String maxNumCalls;
    protected String busyTrigger;
    protected LH323Line.CallInfoDisplay callInfoDisplay;
    protected XFkType recordingProfileName;
    protected XFkType monitoringCssName;
    protected String recordingFlag;
    protected String audibleMwi;
    protected String speedDial;
    protected String partitionUsage;
    @XmlAttribute
    protected String uuid;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ctiid;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the asciiLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsciiLabel() {
        return asciiLabel;
    }

    /**
     * Sets the value of the asciiLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsciiLabel(String value) {
        this.asciiLabel = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the dirn property.
     * 
     * @return
     *     possible object is
     *     {@link LDirn }
     *     
     */
    public LDirn getDirn() {
        return dirn;
    }

    /**
     * Sets the value of the dirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDirn }
     *     
     */
    public void setDirn(LDirn value) {
        this.dirn = value;
    }

    /**
     * Gets the value of the displayAscii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayAscii() {
        return displayAscii;
    }

    /**
     * Sets the value of the displayAscii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayAscii(String value) {
        this.displayAscii = value;
    }

    /**
     * Gets the value of the e164Mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE164Mask() {
        return e164Mask;
    }

    /**
     * Sets the value of the e164Mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE164Mask(String value) {
        this.e164Mask = value;
    }

    /**
     * Gets the value of the dialPlanWizardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPlanWizardId() {
        return dialPlanWizardId;
    }

    /**
     * Sets the value of the dialPlanWizardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPlanWizardId(String value) {
        this.dialPlanWizardId = value;
    }

    /**
     * Gets the value of the maxNumCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumCalls() {
        return maxNumCalls;
    }

    /**
     * Sets the value of the maxNumCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumCalls(String value) {
        this.maxNumCalls = value;
    }

    /**
     * Gets the value of the busyTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyTrigger() {
        return busyTrigger;
    }

    /**
     * Sets the value of the busyTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyTrigger(String value) {
        this.busyTrigger = value;
    }

    /**
     * Gets the value of the callInfoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link LH323Line.CallInfoDisplay }
     *     
     */
    public LH323Line.CallInfoDisplay getCallInfoDisplay() {
        return callInfoDisplay;
    }

    /**
     * Sets the value of the callInfoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link LH323Line.CallInfoDisplay }
     *     
     */
    public void setCallInfoDisplay(LH323Line.CallInfoDisplay value) {
        this.callInfoDisplay = value;
    }

    /**
     * Gets the value of the recordingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRecordingProfileName() {
        return recordingProfileName;
    }

    /**
     * Sets the value of the recordingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRecordingProfileName(XFkType value) {
        this.recordingProfileName = value;
    }

    /**
     * Gets the value of the monitoringCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMonitoringCssName() {
        return monitoringCssName;
    }

    /**
     * Sets the value of the monitoringCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMonitoringCssName(XFkType value) {
        this.monitoringCssName = value;
    }

    /**
     * Gets the value of the recordingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingFlag() {
        return recordingFlag;
    }

    /**
     * Sets the value of the recordingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingFlag(String value) {
        this.recordingFlag = value;
    }

    /**
     * Gets the value of the audibleMwi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudibleMwi() {
        return audibleMwi;
    }

    /**
     * Sets the value of the audibleMwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudibleMwi(String value) {
        this.audibleMwi = value;
    }

    /**
     * Gets the value of the speedDial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedDial() {
        return speedDial;
    }

    /**
     * Sets the value of the speedDial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedDial(String value) {
        this.speedDial = value;
    }

    /**
     * Gets the value of the partitionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionUsage() {
        return partitionUsage;
    }

    /**
     * Sets the value of the partitionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionUsage(String value) {
        this.partitionUsage = value;
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
     * Gets the value of the ctiid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCtiid() {
        return ctiid;
    }

    /**
     * Sets the value of the ctiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCtiid(BigInteger value) {
        this.ctiid = value;
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
     *         &lt;element name="callerName" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="callerNumber" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="redirectedNumber" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="dialedNumber" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
        "callerName",
        "callerNumber",
        "redirectedNumber",
        "dialedNumber"
    })
    public static class CallInfoDisplay {

        protected String callerName;
        protected String callerNumber;
        protected String redirectedNumber;
        protected String dialedNumber;

        /**
         * Gets the value of the callerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallerName() {
            return callerName;
        }

        /**
         * Sets the value of the callerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallerName(String value) {
            this.callerName = value;
        }

        /**
         * Gets the value of the callerNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallerNumber() {
            return callerNumber;
        }

        /**
         * Sets the value of the callerNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallerNumber(String value) {
            this.callerNumber = value;
        }

        /**
         * Gets the value of the redirectedNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRedirectedNumber() {
            return redirectedNumber;
        }

        /**
         * Sets the value of the redirectedNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRedirectedNumber(String value) {
            this.redirectedNumber = value;
        }

        /**
         * Gets the value of the dialedNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDialedNumber() {
            return dialedNumber;
        }

        /**
         * Sets the value of the dialedNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDialedNumber(String value) {
            this.dialedNumber = value;
        }

    }

}
