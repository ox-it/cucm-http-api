
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RImeFeatureConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RImeFeatureConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
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
@XmlType(name = "RImeFeatureConfig", propOrder = {
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
public class RImeFeatureConfig {

    protected String preventImeCallsFromAnalogGateways;
    protected String enableIntraDomain;
    protected String allowMwiNotification;
    protected String trunkConnectionTimer;
    protected String firewallConnectionTimer;
    protected String firewallTranscationTimer;
    protected String firewallIdleTimer;
    protected String failedCallAttemptThreshold;
    protected String callFallbackAttemptThreshold;
    protected String qualityTimer;
    protected String useImeForOutboundCalls;

    /**
     * Gets the value of the preventImeCallsFromAnalogGateways property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreventImeCallsFromAnalogGateways() {
        return preventImeCallsFromAnalogGateways;
    }

    /**
     * Sets the value of the preventImeCallsFromAnalogGateways property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreventImeCallsFromAnalogGateways(String value) {
        this.preventImeCallsFromAnalogGateways = value;
    }

    /**
     * Gets the value of the enableIntraDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableIntraDomain() {
        return enableIntraDomain;
    }

    /**
     * Sets the value of the enableIntraDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableIntraDomain(String value) {
        this.enableIntraDomain = value;
    }

    /**
     * Gets the value of the allowMwiNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowMwiNotification() {
        return allowMwiNotification;
    }

    /**
     * Sets the value of the allowMwiNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowMwiNotification(String value) {
        this.allowMwiNotification = value;
    }

    /**
     * Gets the value of the trunkConnectionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkConnectionTimer() {
        return trunkConnectionTimer;
    }

    /**
     * Sets the value of the trunkConnectionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkConnectionTimer(String value) {
        this.trunkConnectionTimer = value;
    }

    /**
     * Gets the value of the firewallConnectionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirewallConnectionTimer() {
        return firewallConnectionTimer;
    }

    /**
     * Sets the value of the firewallConnectionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirewallConnectionTimer(String value) {
        this.firewallConnectionTimer = value;
    }

    /**
     * Gets the value of the firewallTranscationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirewallTranscationTimer() {
        return firewallTranscationTimer;
    }

    /**
     * Sets the value of the firewallTranscationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirewallTranscationTimer(String value) {
        this.firewallTranscationTimer = value;
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
     *     {@link String }
     *     
     */
    public String getFailedCallAttemptThreshold() {
        return failedCallAttemptThreshold;
    }

    /**
     * Sets the value of the failedCallAttemptThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedCallAttemptThreshold(String value) {
        this.failedCallAttemptThreshold = value;
    }

    /**
     * Gets the value of the callFallbackAttemptThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFallbackAttemptThreshold() {
        return callFallbackAttemptThreshold;
    }

    /**
     * Sets the value of the callFallbackAttemptThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallFallbackAttemptThreshold(String value) {
        this.callFallbackAttemptThreshold = value;
    }

    /**
     * Gets the value of the qualityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityTimer() {
        return qualityTimer;
    }

    /**
     * Sets the value of the qualityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityTimer(String value) {
        this.qualityTimer = value;
    }

    /**
     * Gets the value of the useImeForOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseImeForOutboundCalls() {
        return useImeForOutboundCalls;
    }

    /**
     * Sets the value of the useImeForOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseImeForOutboundCalls(String value) {
        this.useImeForOutboundCalls = value;
    }

}
