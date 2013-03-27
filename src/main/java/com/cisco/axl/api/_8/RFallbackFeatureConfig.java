
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RFallbackFeatureConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFallbackFeatureConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="enableFallbackForImeCalls" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="qosSensistivityLevel" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfCorrelationDigits" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfCollectionTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callAnswerTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callCss" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFallbackFeatureConfig", propOrder = {
    "enableFallbackForImeCalls",
    "qosSensistivityLevel",
    "dtmfCorrelationDigits",
    "dtmfCollectionTimer",
    "callAnswerTimer",
    "callCss"
})
public class RFallbackFeatureConfig {

    protected String enableFallbackForImeCalls;
    protected String qosSensistivityLevel;
    protected String dtmfCorrelationDigits;
    protected String dtmfCollectionTimer;
    protected String callAnswerTimer;
    protected String callCss;

    /**
     * Gets the value of the enableFallbackForImeCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableFallbackForImeCalls() {
        return enableFallbackForImeCalls;
    }

    /**
     * Sets the value of the enableFallbackForImeCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableFallbackForImeCalls(String value) {
        this.enableFallbackForImeCalls = value;
    }

    /**
     * Gets the value of the qosSensistivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosSensistivityLevel() {
        return qosSensistivityLevel;
    }

    /**
     * Sets the value of the qosSensistivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosSensistivityLevel(String value) {
        this.qosSensistivityLevel = value;
    }

    /**
     * Gets the value of the dtmfCorrelationDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtmfCorrelationDigits() {
        return dtmfCorrelationDigits;
    }

    /**
     * Sets the value of the dtmfCorrelationDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtmfCorrelationDigits(String value) {
        this.dtmfCorrelationDigits = value;
    }

    /**
     * Gets the value of the dtmfCollectionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtmfCollectionTimer() {
        return dtmfCollectionTimer;
    }

    /**
     * Sets the value of the dtmfCollectionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtmfCollectionTimer(String value) {
        this.dtmfCollectionTimer = value;
    }

    /**
     * Gets the value of the callAnswerTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAnswerTimer() {
        return callAnswerTimer;
    }

    /**
     * Sets the value of the callAnswerTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAnswerTimer(String value) {
        this.callAnswerTimer = value;
    }

    /**
     * Gets the value of the callCss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCss() {
        return callCss;
    }

    /**
     * Sets the value of the callCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCss(String value) {
        this.callCss = value;
    }

}
