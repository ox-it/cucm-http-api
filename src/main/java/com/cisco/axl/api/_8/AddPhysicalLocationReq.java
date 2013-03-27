
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPhysicalLocationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPhysicalLocationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="physicalLocation" type="{http://www.cisco.com/AXL/API/8.0}XPhysicalLocation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPhysicalLocationReq", propOrder = {
    "physicalLocation"
})
public class AddPhysicalLocationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPhysicalLocation physicalLocation;

    /**
     * Gets the value of the physicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link XPhysicalLocation }
     *     
     */
    public XPhysicalLocation getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Sets the value of the physicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhysicalLocation }
     *     
     */
    public void setPhysicalLocation(XPhysicalLocation value) {
        this.physicalLocation = value;
    }

}
