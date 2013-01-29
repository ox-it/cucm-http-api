
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
 *         &lt;element name="enableFallbackForImeCalls" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="qosSensistivityLevel" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfCorrelationDigits" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfCollectionTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="callAnswerTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="clearImeCallDelayTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="dtmfInterDigitDelayTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="postConnectFallbackDelayTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="fallbackSplitDelayTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="callCss" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
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
    "clearImeCallDelayTimer",
    "dtmfInterDigitDelayTimer",
    "postConnectFallbackDelayTimer",
    "fallbackSplitDelayTimer",
    "callCss"
})
public class RFallbackFeatureConfig {

    protected String enableFallbackForImeCalls;
    protected String qosSensistivityLevel;
    protected String dtmfCorrelationDigits;
    protected String dtmfCollectionTimer;
    protected String callAnswerTimer;
    protected String clearImeCallDelayTimer;
    protected String dtmfInterDigitDelayTimer;
    protected String postConnectFallbackDelayTimer;
    protected String fallbackSplitDelayTimer;
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
     * Gets the value of the clearImeCallDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearImeCallDelayTimer() {
        return clearImeCallDelayTimer;
    }

    /**
     * Sets the value of the clearImeCallDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearImeCallDelayTimer(String value) {
        this.clearImeCallDelayTimer = value;
    }

    /**
     * Gets the value of the dtmfInterDigitDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtmfInterDigitDelayTimer() {
        return dtmfInterDigitDelayTimer;
    }

    /**
     * Sets the value of the dtmfInterDigitDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtmfInterDigitDelayTimer(String value) {
        this.dtmfInterDigitDelayTimer = value;
    }

    /**
     * Gets the value of the postConnectFallbackDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostConnectFallbackDelayTimer() {
        return postConnectFallbackDelayTimer;
    }

    /**
     * Sets the value of the postConnectFallbackDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostConnectFallbackDelayTimer(String value) {
        this.postConnectFallbackDelayTimer = value;
    }

    /**
     * Gets the value of the fallbackSplitDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackSplitDelayTimer() {
        return fallbackSplitDelayTimer;
    }

    /**
     * Sets the value of the fallbackSplitDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackSplitDelayTimer(String value) {
        this.fallbackSplitDelayTimer = value;
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
