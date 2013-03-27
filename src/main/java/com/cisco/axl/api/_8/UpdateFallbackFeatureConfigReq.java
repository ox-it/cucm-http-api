
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateFallbackFeatureConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateFallbackFeatureConfigReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "UpdateFallbackFeatureConfigReq", propOrder = {
    "enableFallbackForImeCalls",
    "qosSensistivityLevel",
    "dtmfCorrelationDigits",
    "dtmfCollectionTimer",
    "callAnswerTimer",
    "callCss"
})
public class UpdateFallbackFeatureConfigReq {

    @XmlElementRef(name = "enableFallbackForImeCalls", type = JAXBElement.class)
    protected JAXBElement<String> enableFallbackForImeCalls;
    @XmlElementRef(name = "qosSensistivityLevel", type = JAXBElement.class)
    protected JAXBElement<String> qosSensistivityLevel;
    @XmlElementRef(name = "dtmfCorrelationDigits", type = JAXBElement.class)
    protected JAXBElement<String> dtmfCorrelationDigits;
    @XmlElementRef(name = "dtmfCollectionTimer", type = JAXBElement.class)
    protected JAXBElement<String> dtmfCollectionTimer;
    @XmlElementRef(name = "callAnswerTimer", type = JAXBElement.class)
    protected JAXBElement<String> callAnswerTimer;
    @XmlElementRef(name = "callCss", type = JAXBElement.class)
    protected JAXBElement<String> callCss;

    /**
     * Gets the value of the enableFallbackForImeCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnableFallbackForImeCalls() {
        return enableFallbackForImeCalls;
    }

    /**
     * Sets the value of the enableFallbackForImeCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnableFallbackForImeCalls(JAXBElement<String> value) {
        this.enableFallbackForImeCalls = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qosSensistivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQosSensistivityLevel() {
        return qosSensistivityLevel;
    }

    /**
     * Sets the value of the qosSensistivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQosSensistivityLevel(JAXBElement<String> value) {
        this.qosSensistivityLevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dtmfCorrelationDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtmfCorrelationDigits() {
        return dtmfCorrelationDigits;
    }

    /**
     * Sets the value of the dtmfCorrelationDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtmfCorrelationDigits(JAXBElement<String> value) {
        this.dtmfCorrelationDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dtmfCollectionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDtmfCollectionTimer() {
        return dtmfCollectionTimer;
    }

    /**
     * Sets the value of the dtmfCollectionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDtmfCollectionTimer(JAXBElement<String> value) {
        this.dtmfCollectionTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callAnswerTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallAnswerTimer() {
        return callAnswerTimer;
    }

    /**
     * Sets the value of the callAnswerTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallAnswerTimer(JAXBElement<String> value) {
        this.callAnswerTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callCss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCss() {
        return callCss;
    }

    /**
     * Sets the value of the callCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCss(JAXBElement<String> value) {
        this.callCss = ((JAXBElement<String> ) value);
    }

}
