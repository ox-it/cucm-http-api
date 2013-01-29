
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSafForwarderReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSafForwarderReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="safForwarder" type="{http://www.cisco.com/AXL/API/8.5}XSafForwarder"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSafForwarderReq", propOrder = {
    "safForwarder"
})
public class AddSafForwarderReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSafForwarder safForwarder;

    /**
     * Gets the value of the safForwarder property.
     * 
     * @return
     *     possible object is
     *     {@link XSafForwarder }
     *     
     */
    public XSafForwarder getSafForwarder() {
        return safForwarder;
    }

    /**
     * Sets the value of the safForwarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSafForwarder }
     *     
     */
    public void setSafForwarder(XSafForwarder value) {
        this.safForwarder = value;
    }

}
