
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRouteListMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRouteListMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="routeGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="selectionOrder" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="calledPartyTransformationMask" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="callingPartyTransformationMask" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="digitDiscardInstructionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyPrefixDigits" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="prefixDigitsOut" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="useFullyQualifiedCallingPartyNumber" type="{http://www.cisco.com/AXL/API/8.0}XStatus"/>
 *         &lt;element name="callingPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberType" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/8.0}XNumberingPlan" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberType" type="{http://www.cisco.com/AXL/API/8.0}XPriOfNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRouteListMember", propOrder = {
    "routeGroupName",
    "selectionOrder",
    "calledPartyTransformationMask",
    "callingPartyTransformationMask",
    "digitDiscardInstructionName",
    "callingPartyPrefixDigits",
    "prefixDigitsOut",
    "useFullyQualifiedCallingPartyNumber",
    "callingPartyNumberingPlan",
    "callingPartyNumberType",
    "calledPartyNumberingPlan",
    "calledPartyNumberType"
})
public class XRouteListMember {

    @XmlElementRef(name = "routeGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routeGroupName;
    protected String selectionOrder;
    @XmlElementRef(name = "calledPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> calledPartyTransformationMask;
    @XmlElementRef(name = "callingPartyTransformationMask", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyTransformationMask;
    @XmlElementRef(name = "digitDiscardInstructionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> digitDiscardInstructionName;
    @XmlElementRef(name = "callingPartyPrefixDigits", type = JAXBElement.class)
    protected JAXBElement<String> callingPartyPrefixDigits;
    @XmlElementRef(name = "prefixDigitsOut", type = JAXBElement.class)
    protected JAXBElement<String> prefixDigitsOut;
    @XmlElement(defaultValue = "Default")
    protected String useFullyQualifiedCallingPartyNumber;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPartyNumberingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String callingPartyNumberType;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPartyNumberingPlan;
    @XmlElement(defaultValue = "Cisco CallManager")
    protected String calledPartyNumberType;

    /**
     * Gets the value of the routeGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRouteGroupName() {
        return routeGroupName;
    }

    /**
     * Sets the value of the routeGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRouteGroupName(JAXBElement<XFkType> value) {
        this.routeGroupName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the selectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionOrder() {
        return selectionOrder;
    }

    /**
     * Sets the value of the selectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionOrder(String value) {
        this.selectionOrder = value;
    }

    /**
     * Gets the value of the calledPartyTransformationMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalledPartyTransformationMask() {
        return calledPartyTransformationMask;
    }

    /**
     * Sets the value of the calledPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalledPartyTransformationMask(JAXBElement<String> value) {
        this.calledPartyTransformationMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingPartyTransformationMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyTransformationMask() {
        return callingPartyTransformationMask;
    }

    /**
     * Sets the value of the callingPartyTransformationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyTransformationMask(JAXBElement<String> value) {
        this.callingPartyTransformationMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the digitDiscardInstructionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDigitDiscardInstructionName() {
        return digitDiscardInstructionName;
    }

    /**
     * Sets the value of the digitDiscardInstructionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDigitDiscardInstructionName(JAXBElement<XFkType> value) {
        this.digitDiscardInstructionName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the callingPartyPrefixDigits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallingPartyPrefixDigits() {
        return callingPartyPrefixDigits;
    }

    /**
     * Sets the value of the callingPartyPrefixDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallingPartyPrefixDigits(JAXBElement<String> value) {
        this.callingPartyPrefixDigits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prefixDigitsOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefixDigitsOut() {
        return prefixDigitsOut;
    }

    /**
     * Sets the value of the prefixDigitsOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefixDigitsOut(JAXBElement<String> value) {
        this.prefixDigitsOut = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the useFullyQualifiedCallingPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseFullyQualifiedCallingPartyNumber() {
        return useFullyQualifiedCallingPartyNumber;
    }

    /**
     * Sets the value of the useFullyQualifiedCallingPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseFullyQualifiedCallingPartyNumber(String value) {
        this.useFullyQualifiedCallingPartyNumber = value;
    }

    /**
     * Gets the value of the callingPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNumberingPlan() {
        return callingPartyNumberingPlan;
    }

    /**
     * Sets the value of the callingPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNumberingPlan(String value) {
        this.callingPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the callingPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyNumberType() {
        return callingPartyNumberType;
    }

    /**
     * Sets the value of the callingPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyNumberType(String value) {
        this.callingPartyNumberType = value;
    }

    /**
     * Gets the value of the calledPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNumberingPlan() {
        return calledPartyNumberingPlan;
    }

    /**
     * Sets the value of the calledPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNumberingPlan(String value) {
        this.calledPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the calledPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledPartyNumberType() {
        return calledPartyNumberType;
    }

    /**
     * Sets the value of the calledPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledPartyNumberType(String value) {
        this.calledPartyNumberType = value;
    }

}
