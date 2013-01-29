
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XDateTimeGroupNtpReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XDateTimeGroupNtpReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="phoneNtpName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="selectionOrder" type="{http://www.cisco.com/AXL/API/8.5}XInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XDateTimeGroupNtpReference", propOrder = {
    "phoneNtpName",
    "selectionOrder"
})
public class XDateTimeGroupNtpReference {

    protected XFkType phoneNtpName;
    @XmlElementRef(name = "selectionOrder", type = JAXBElement.class)
    protected JAXBElement<String> selectionOrder;

    /**
     * Gets the value of the phoneNtpName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPhoneNtpName() {
        return phoneNtpName;
    }

    /**
     * Sets the value of the phoneNtpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPhoneNtpName(XFkType value) {
        this.phoneNtpName = value;
    }

    /**
     * Gets the value of the selectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectionOrder() {
        return selectionOrder;
    }

    /**
     * Sets the value of the selectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectionOrder(JAXBElement<String> value) {
        this.selectionOrder = ((JAXBElement<String> ) value);
    }

}
