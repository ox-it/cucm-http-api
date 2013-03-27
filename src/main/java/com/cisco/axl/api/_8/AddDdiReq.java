
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDdiReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDdiReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ddi" type="{http://www.cisco.com/AXL/API/8.0}XDdi"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDdiReq", propOrder = {
    "ddi"
})
public class AddDdiReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDdi ddi;

    /**
     * Gets the value of the ddi property.
     * 
     * @return
     *     possible object is
     *     {@link XDdi }
     *     
     */
    public XDdi getDdi() {
        return ddi;
    }

    /**
     * Sets the value of the ddi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDdi }
     *     
     */
    public void setDdi(XDdi value) {
        this.ddi = value;
    }

}
