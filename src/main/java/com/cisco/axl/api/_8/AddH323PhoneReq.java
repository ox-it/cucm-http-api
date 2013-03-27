
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddH323PhoneReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddH323PhoneReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="h323Phone" type="{http://www.cisco.com/AXL/API/8.0}XH323Phone"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddH323PhoneReq", propOrder = {
    "h323Phone"
})
public class AddH323PhoneReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XH323Phone h323Phone;

    /**
     * Gets the value of the h323Phone property.
     * 
     * @return
     *     possible object is
     *     {@link XH323Phone }
     *     
     */
    public XH323Phone getH323Phone() {
        return h323Phone;
    }

    /**
     * Sets the value of the h323Phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XH323Phone }
     *     
     */
    public void setH323Phone(XH323Phone value) {
        this.h323Phone = value;
    }

}
