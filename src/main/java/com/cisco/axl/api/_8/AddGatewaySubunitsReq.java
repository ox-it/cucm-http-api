
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewaySubunitsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewaySubunitsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="gatewaySubunits" type="{http://www.cisco.com/AXL/API/8.5}XGatewaySubunits"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewaySubunitsReq", propOrder = {
    "gatewaySubunits"
})
public class AddGatewaySubunitsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGatewaySubunits gatewaySubunits;

    /**
     * Gets the value of the gatewaySubunits property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewaySubunits }
     *     
     */
    public XGatewaySubunits getGatewaySubunits() {
        return gatewaySubunits;
    }

    /**
     * Sets the value of the gatewaySubunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewaySubunits }
     *     
     */
    public void setGatewaySubunits(XGatewaySubunits value) {
        this.gatewaySubunits = value;
    }

}
