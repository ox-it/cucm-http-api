
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUnitsToGatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUnitsToGatewayReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="unitsToGateway" type="{http://www.cisco.com/AXL/API/8.0}XUnitsToGateway"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUnitsToGatewayReq", propOrder = {
    "unitsToGateway"
})
public class AddUnitsToGatewayReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUnitsToGateway unitsToGateway;

    /**
     * Gets the value of the unitsToGateway property.
     * 
     * @return
     *     possible object is
     *     {@link XUnitsToGateway }
     *     
     */
    public XUnitsToGateway getUnitsToGateway() {
        return unitsToGateway;
    }

    /**
     * Sets the value of the unitsToGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUnitsToGateway }
     *     
     */
    public void setUnitsToGateway(XUnitsToGateway value) {
        this.unitsToGateway = value;
    }

}
