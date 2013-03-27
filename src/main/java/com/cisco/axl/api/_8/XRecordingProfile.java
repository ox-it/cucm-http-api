
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRecordingProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRecordingProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="recordingCssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="recorderDestination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRecordingProfile", propOrder = {
    "name",
    "recordingCssName",
    "recorderDestination"
})
public class XRecordingProfile {

    protected String name;
    @XmlElementRef(name = "recordingCssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> recordingCssName;
    protected String recorderDestination;

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
     * Gets the value of the recordingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRecordingCssName() {
        return recordingCssName;
    }

    /**
     * Sets the value of the recordingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRecordingCssName(JAXBElement<XFkType> value) {
        this.recordingCssName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the recorderDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecorderDestination() {
        return recorderDestination;
    }

    /**
     * Sets the value of the recorderDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecorderDestination(String value) {
        this.recorderDestination = value;
    }

}
