
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLicenseUnitReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLicenseUnitReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverName" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="phoneLicenseFeature" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="unitsAuthorized" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="unitsUsed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="unitsRemaining" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="unitsPending" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="status" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ccmNodeLicenseFeature" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="unitsAuthorized" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="unitsUsed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="unitsRemaining" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="status" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="softwareLicenseVersion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="swVersion" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *                   &lt;element name="status" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLicenseUnitReport", propOrder = {
    "serverName",
    "phoneLicenseFeature",
    "ccmNodeLicenseFeature",
    "softwareLicenseVersion"
})
public class XLicenseUnitReport {

    protected String serverName;
    protected XLicenseUnitReport.PhoneLicenseFeature phoneLicenseFeature;
    protected XLicenseUnitReport.CcmNodeLicenseFeature ccmNodeLicenseFeature;
    protected XLicenseUnitReport.SoftwareLicenseVersion softwareLicenseVersion;

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the phoneLicenseFeature property.
     * 
     * @return
     *     possible object is
     *     {@link XLicenseUnitReport.PhoneLicenseFeature }
     *     
     */
    public XLicenseUnitReport.PhoneLicenseFeature getPhoneLicenseFeature() {
        return phoneLicenseFeature;
    }

    /**
     * Sets the value of the phoneLicenseFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLicenseUnitReport.PhoneLicenseFeature }
     *     
     */
    public void setPhoneLicenseFeature(XLicenseUnitReport.PhoneLicenseFeature value) {
        this.phoneLicenseFeature = value;
    }

    /**
     * Gets the value of the ccmNodeLicenseFeature property.
     * 
     * @return
     *     possible object is
     *     {@link XLicenseUnitReport.CcmNodeLicenseFeature }
     *     
     */
    public XLicenseUnitReport.CcmNodeLicenseFeature getCcmNodeLicenseFeature() {
        return ccmNodeLicenseFeature;
    }

    /**
     * Sets the value of the ccmNodeLicenseFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLicenseUnitReport.CcmNodeLicenseFeature }
     *     
     */
    public void setCcmNodeLicenseFeature(XLicenseUnitReport.CcmNodeLicenseFeature value) {
        this.ccmNodeLicenseFeature = value;
    }

    /**
     * Gets the value of the softwareLicenseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link XLicenseUnitReport.SoftwareLicenseVersion }
     *     
     */
    public XLicenseUnitReport.SoftwareLicenseVersion getSoftwareLicenseVersion() {
        return softwareLicenseVersion;
    }

    /**
     * Sets the value of the softwareLicenseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLicenseUnitReport.SoftwareLicenseVersion }
     *     
     */
    public void setSoftwareLicenseVersion(XLicenseUnitReport.SoftwareLicenseVersion value) {
        this.softwareLicenseVersion = value;
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
     *       &lt;sequence>
     *         &lt;element name="unitsAuthorized" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="unitsUsed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="unitsRemaining" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="status" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
        "unitsAuthorized",
        "unitsUsed",
        "unitsRemaining",
        "status"
    })
    public static class CcmNodeLicenseFeature {

        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger unitsAuthorized;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger unitsUsed;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger unitsRemaining;
        protected String status;

        /**
         * Gets the value of the unitsAuthorized property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitsAuthorized() {
            return unitsAuthorized;
        }

        /**
         * Sets the value of the unitsAuthorized property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitsAuthorized(BigInteger value) {
            this.unitsAuthorized = value;
        }

        /**
         * Gets the value of the unitsUsed property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitsUsed() {
            return unitsUsed;
        }

        /**
         * Sets the value of the unitsUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitsUsed(BigInteger value) {
            this.unitsUsed = value;
        }

        /**
         * Gets the value of the unitsRemaining property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitsRemaining() {
            return unitsRemaining;
        }

        /**
         * Sets the value of the unitsRemaining property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitsRemaining(BigInteger value) {
            this.unitsRemaining = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="unitsAuthorized" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="unitsUsed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="unitsRemaining" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="unitsPending" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="status" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
        "unitsAuthorized",
        "unitsUsed",
        "unitsRemaining",
        "unitsPending",
        "status"
    })
    public static class PhoneLicenseFeature {

        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger unitsAuthorized;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger unitsUsed;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger unitsRemaining;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger unitsPending;
        protected String status;

        /**
         * Gets the value of the unitsAuthorized property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitsAuthorized() {
            return unitsAuthorized;
        }

        /**
         * Sets the value of the unitsAuthorized property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitsAuthorized(BigInteger value) {
            this.unitsAuthorized = value;
        }

        /**
         * Gets the value of the unitsUsed property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitsUsed() {
            return unitsUsed;
        }

        /**
         * Sets the value of the unitsUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitsUsed(BigInteger value) {
            this.unitsUsed = value;
        }

        /**
         * Gets the value of the unitsRemaining property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitsRemaining() {
            return unitsRemaining;
        }

        /**
         * Sets the value of the unitsRemaining property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitsRemaining(BigInteger value) {
            this.unitsRemaining = value;
        }

        /**
         * Gets the value of the unitsPending property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUnitsPending() {
            return unitsPending;
        }

        /**
         * Sets the value of the unitsPending property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUnitsPending(BigInteger value) {
            this.unitsPending = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="swVersion" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
     *         &lt;element name="status" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
        "swVersion",
        "status"
    })
    public static class SoftwareLicenseVersion {

        protected String swVersion;
        protected String status;

        /**
         * Gets the value of the swVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSwVersion() {
            return swVersion;
        }

        /**
         * Sets the value of the swVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSwVersion(String value) {
            this.swVersion = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

    }

}
