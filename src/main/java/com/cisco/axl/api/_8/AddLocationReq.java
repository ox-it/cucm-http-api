
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLocationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLocationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.cisco.com/AXL/API/8.0}XLocation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLocationReq", propOrder = {
    "location"
})
public class AddLocationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLocation location;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link XLocation }
     *     
     */
    public XLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLocation }
     *     
     */
    public void setLocation(XLocation value) {
        this.location = value;
    }

}
