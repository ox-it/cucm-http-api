
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateExternalCallControlProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateExternalCallControlProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="primaryUri" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="secondaryUri" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="enableLoadBalancing" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="routingRequestTimer" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="diversionReroutingCssName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callTreatmentOnFailure" type="{http://www.cisco.com/AXL/API/8.5}XCallTreatmentOnFailure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateExternalCallControlProfileReq", propOrder = {
    "newName",
    "primaryUri",
    "secondaryUri",
    "enableLoadBalancing",
    "routingRequestTimer",
    "diversionReroutingCssName",
    "callTreatmentOnFailure"
})
public class UpdateExternalCallControlProfileReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String primaryUri;
    protected String secondaryUri;
    @XmlElement(defaultValue = "false")
    protected String enableLoadBalancing;
    @XmlElementRef(name = "routingRequestTimer", type = JAXBElement.class)
    protected JAXBElement<String> routingRequestTimer;
    @XmlElementRef(name = "diversionReroutingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> diversionReroutingCssName;
    @XmlElement(defaultValue = "Allow Calls")
    protected String callTreatmentOnFailure;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutingRequestTimer() {
        return routingRequestTimer;
    }

    /**
     * Sets the value of the routingRequestTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutingRequestTimer(JAXBElement<String> value) {
        this.routingRequestTimer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the diversionReroutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDiversionReroutingCssName() {
        return diversionReroutingCssName;
    }

    /**
     * Sets the value of the diversionReroutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDiversionReroutingCssName(JAXBElement<XFkType> value) {
        this.diversionReroutingCssName = ((JAXBElement<XFkType> ) value);
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

}
