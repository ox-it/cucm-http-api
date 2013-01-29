
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateImeFeatureConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateImeFeatureConfigReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preventImeCallsFromAnalogGateways" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableIntraDomain" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="allowMwiNotification" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="trunkConnectionTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="firewallConnectionTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="firewallTranscationTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="firewallIdleTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="failedCallAttemptThreshold" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="callFallbackAttemptThreshold" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="qualityTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="useImeForOutboundCalls" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateImeFeatureConfigReq", propOrder = {
    "preventImeCallsFromAnalogGateways",
    "enableIntraDomain",
    "allowMwiNotification",
    "trunkConnectionTimer",
    "firewallConnectionTimer",
    "firewallTranscationTimer",
    "firewallIdleTimer",
    "failedCallAttemptThreshold",
    "callFallbackAttemptThreshold",
    "qualityTimer",
    "useImeForOutboundCalls"
})
public class UpdateImeFeatureConfigReq {

    @XmlElementRef(name = "preventImeCallsFromAnalogGateways", type = JAXBElement.class)
    protected JAXBElement<String> preventImeCallsFromAnalogGateways;
    @XmlElementRef(name = "enableIntraDomain", type = JAXBElement.class)
    protected JAXBElement<String> enableIntraDomain;
    @XmlElementRef(name = "allowMwiNotification", type = JAXBElement.class)
    protected JAXBElement<String> allowMwiNotification;
    @XmlElementRef(name = "trunkConnectionTimer", type = JAXBElement.class)
    protected JAXBElement<String> trunkConnectionTimer;
    @XmlElementRef(name = "firewallConnectionTimer", type = JAXBElement.class)
    protected JAXBElement<String> firewallConnectionTimer;
    @XmlElementRef(name = "firewallTranscationTimer", type = JAXBElement.class)
    protected JAXBElement<String> firewallTranscationTimer;
    protected String firewallIdleTimer;
    @XmlElementRef(name = "failedCallAttemptThreshold", type = JAXBElement.class)
    protected JAXBElement<String> failedCallAttemptThreshold;
    @XmlElementRef(name = "callFallbackAttemptThreshold", type = JAXBElement.class)
    protected JAXBElement<String> callFallbackAttemptThreshold;
    @XmlElementRef(name = "qualityTimer", type = JAXBElement.class)
    protected JAXBElement<String> qualityTimer;
    @XmlElementRef(name = "useImeForOutboundCalls", type = JAXBElement.class)
    protected JAXBElement<String> useImeForOutboundCalls;

    /**
     * Gets the value of the preventImeCallsFromAnalogGateways property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreventImeCallsFromAnalogGateways() {
        return preventImeCallsFromAnalogGateways;
    }

    /**
     * Sets the value of the preventImeCallsFromAnalogGateways property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreventImeCallsFromAnalogGateways(JAXBElement<String> value) {
        this.preventImeCallsFromAnalogGateways = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the enableIntraDomain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnableIntraDomain() {
        return enableIntraDomain;
    }

    /**
     * Sets the value of the enableIntraDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnableIntraDomain(JAXBElement<String> value) {
        this.enableIntraDomain = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the allowMwiNotification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAllowMwiNotification() {
        return allowMwiNotification;
    }

    /**
     * Sets the value of the allowMwiNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAllowMwiNotification(JAXBElement<String> value) {
        this.allowMwiNotification = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trunkConnectionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrunkConnectionTimer() {
        return trunkConnectionTimer;
    }

    /**
     * Sets the value of the trunkConnectionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrunkConnectionTimer(JAXBElement<String> value) {
        this.trunkConnectionTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firewallConnectionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirewallConnectionTimer() {
        return firewallConnectionTimer;
    }

    /**
     * Sets the value of the firewallConnectionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirewallConnectionTimer(JAXBElement<String> value) {
        this.firewallConnectionTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firewallTranscationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirewallTranscationTimer() {
        return firewallTranscationTimer;
    }

    /**
     * Sets the value of the firewallTranscationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirewallTranscationTimer(JAXBElement<String> value) {
        this.firewallTranscationTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firewallIdleTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirewallIdleTimer() {
        return firewallIdleTimer;
    }

    /**
     * Sets the value of the firewallIdleTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirewallIdleTimer(String value) {
        this.firewallIdleTimer = value;
    }

    /**
     * Gets the value of the failedCallAttemptThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFailedCallAttemptThreshold() {
        return failedCallAttemptThreshold;
    }

    /**
     * Sets the value of the failedCallAttemptThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFailedCallAttemptThreshold(JAXBElement<String> value) {
        this.failedCallAttemptThreshold = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callFallbackAttemptThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallFallbackAttemptThreshold() {
        return callFallbackAttemptThreshold;
    }

    /**
     * Sets the value of the callFallbackAttemptThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallFallbackAttemptThreshold(JAXBElement<String> value) {
        this.callFallbackAttemptThreshold = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qualityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQualityTimer() {
        return qualityTimer;
    }

    /**
     * Sets the value of the qualityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQualityTimer(JAXBElement<String> value) {
        this.qualityTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the useImeForOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUseImeForOutboundCalls() {
        return useImeForOutboundCalls;
    }

    /**
     * Sets the value of the useImeForOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUseImeForOutboundCalls(JAXBElement<String> value) {
        this.useImeForOutboundCalls = ((JAXBElement<String> ) value);
    }

}
