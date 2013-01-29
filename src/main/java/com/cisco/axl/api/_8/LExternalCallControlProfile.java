
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LExternalCallControlProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LExternalCallControlProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="primaryUri" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="secondaryUri" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="enableLoadBalancing" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="routingRequestTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="diversionReroutingCssName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callTreatmentOnFailure" type="{http://www.cisco.com/AXL/API/8.5}XCallTreatmentOnFailure" minOccurs="0"/>
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
@XmlType(name = "LExternalCallControlProfile", propOrder = {
    "name",
    "primaryUri",
    "secondaryUri",
    "enableLoadBalancing",
    "routingRequestTimer",
    "diversionReroutingCssName",
    "callTreatmentOnFailure"
})
public class LExternalCallControlProfile {

    protected String name;
    protected String primaryUri;
    protected String secondaryUri;
    protected String enableLoadBalancing;
    protected String routingRequestTimer;
    protected XFkType diversionReroutingCssName;
    protected String callTreatmentOnFailure;
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
     * Gets the value of the primaryUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryUri() {
        return primaryUri;
    }

    /**
     * Sets the value of the primaryUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryUri(String value) {
        this.primaryUri = value;
    }

    /**
     * Gets the value of the secondaryUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryUri() {
        return secondaryUri;
    }

    /**
     * Sets the value of the secondaryUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryUri(String value) {
        this.secondaryUri = value;
    }

    /**
     * Gets the value of the enableLoadBalancing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableLoadBalancing() {
        return enableLoadBalancing;
    }

    /**
     * Sets the value of the enableLoadBalancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableLoadBalancing(String value) {
        this.enableLoadBalancing = value;
    }

    /**
     * Gets the value of the routingRequestTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingRequestTimer() {
        return routingRequestTimer;
    }

    /**
     * Sets the value of the routingRequestTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingRequestTimer(String value) {
        this.routingRequestTimer = value;
    }

    /**
     * Gets the value of the diversionReroutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDiversionReroutingCssName() {
        return diversionReroutingCssName;
    }

    /**
     * Sets the value of the diversionReroutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDiversionReroutingCssName(XFkType value) {
        this.diversionReroutingCssName = value;
    }

    /**
     * Gets the value of the callTreatmentOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTreatmentOnFailure() {
        return callTreatmentOnFailure;
    }

    /**
     * Sets the value of the callTreatmentOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTreatmentOnFailure(String value) {
        this.callTreatmentOnFailure = value;
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
