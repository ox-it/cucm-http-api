
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddH323GatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddH323GatewayReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="h323Gateway" type="{http://www.cisco.com/AXL/API/8.5}XH323Gateway"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddH323GatewayReq", propOrder = {
    "h323Gateway"
})
public class AddH323GatewayReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XH323Gateway h323Gateway;

    /**
     * Gets the value of the h323Gateway property.
     * 
     * @return
     *     possible object is
     *     {@link XH323Gateway }
     *     
     */
    public XH323Gateway getH323Gateway() {
        return h323Gateway;
    }

    /**
     * Sets the value of the h323Gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link XH323Gateway }
     *     
     */
    public void setH323Gateway(XH323Gateway value) {
        this.h323Gateway = value;
    }

}
