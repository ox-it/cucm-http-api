
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPhoneNtpReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPhoneNtpReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="phoneNtp" type="{http://www.cisco.com/AXL/API/8.5}XPhoneNtp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPhoneNtpReq", propOrder = {
    "phoneNtp"
})
public class AddPhoneNtpReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPhoneNtp phoneNtp;

    /**
     * Gets the value of the phoneNtp property.
     * 
     * @return
     *     possible object is
     *     {@link XPhoneNtp }
     *     
     */
    public XPhoneNtp getPhoneNtp() {
        return phoneNtp;
    }

    /**
     * Sets the value of the phoneNtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhoneNtp }
     *     
     */
    public void setPhoneNtp(XPhoneNtp value) {
        this.phoneNtp = value;
    }

}
