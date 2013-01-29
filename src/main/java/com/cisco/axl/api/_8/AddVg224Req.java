
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVg224Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVg224Req">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="vg224" type="{http://www.cisco.com/AXL/API/8.5}XVg224"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVg224Req", propOrder = {
    "vg224"
})
public class AddVg224Req
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVg224 vg224;

    /**
     * Gets the value of the vg224 property.
     * 
     * @return
     *     possible object is
     *     {@link XVg224 }
     *     
     */
    public XVg224 getVg224() {
        return vg224;
    }

    /**
     * Sets the value of the vg224 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVg224 }
     *     
     */
    public void setVg224(XVg224 value) {
        this.vg224 = value;
    }

}
