
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPhoneReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPhoneReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://www.cisco.com/AXL/API/8.0}XPhone"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPhoneReq", propOrder = {
    "phone"
})
public class AddPhoneReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPhone phone;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone }
     *     
     */
    public XPhone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone }
     *     
     */
    public void setPhone(XPhone value) {
        this.phone = value;
    }

}
