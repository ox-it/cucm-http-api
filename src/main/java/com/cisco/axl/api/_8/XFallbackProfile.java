
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XFallbackProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XFallbackProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="advertisedFallbackDirectoryE164Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qosSensistivityLevel" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callCss" type="{http://www.cisco.com/AXL/API/8.0}XFallBackCSSSelection"/>
 *         &lt;element name="callAnswerTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="directoryNumberPartition" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="directoryNumber" type="{http://www.cisco.com/AXL/API/8.0}String16" minOccurs="0"/>
 *         &lt;element name="numberOfDigitsForCallerIDPartialMatch" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XFallbackProfile", propOrder = {
    "name",
    "description",
    "advertisedFallbackDirectoryE164Number",
    "qosSensistivityLevel",
    "callCss",
    "callAnswerTimer",
    "directoryNumberPartition",
    "directoryNumber",
    "numberOfDigitsForCallerIDPartialMatch"
})
public class XFallbackProfile {

    protected String name;
    protected String description;
    protected String advertisedFallbackDirectoryE164Number;
    @XmlElement(defaultValue = "3")
    protected String qosSensistivityLevel;
    @XmlElement(defaultValue = "Calling device AAR Calling Search Space")
    protected String callCss;
    @XmlElement(defaultValue = "6")
    protected String callAnswerTimer;
    @XmlElementRef(name = "directoryNumberPartition", type = JAXBElement.class)
    protected JAXBElement<XFkType> directoryNumberPartition;
    protected String directoryNumber;
    @XmlElement(defaultValue = "5")
    protected String numberOfDigitsForCallerIDPartialMatch;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the advertisedFallbackDirectoryE164Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertisedFallbackDirectoryE164Number() {
        return advertisedFallbackDirectoryE164Number;
    }

    /**
     * Sets the value of the advertisedFallbackDirectoryE164Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertisedFallbackDirectoryE164Number(String value) {
        this.advertisedFallbackDirectoryE164Number = value;
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
     * Gets the value of the directoryNumberPartition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getDirectoryNumberPartition() {
        return directoryNumberPartition;
    }

    /**
     * Sets the value of the directoryNumberPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setDirectoryNumberPartition(JAXBElement<XFkType> value) {
        this.directoryNumberPartition = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the directoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryNumber() {
        return directoryNumber;
    }

    /**
     * Sets the value of the directoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryNumber(String value) {
        this.directoryNumber = value;
    }

    /**
     * Gets the value of the numberOfDigitsForCallerIDPartialMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfDigitsForCallerIDPartialMatch() {
        return numberOfDigitsForCallerIDPartialMatch;
    }

    /**
     * Sets the value of the numberOfDigitsForCallerIDPartialMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfDigitsForCallerIDPartialMatch(String value) {
        this.numberOfDigitsForCallerIDPartialMatch = value;
    }

}
