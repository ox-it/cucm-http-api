
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRouteGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRouteGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="routeGroup" type="{http://www.cisco.com/AXL/API/8.5}XRouteGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRouteGroupReq", propOrder = {
    "routeGroup"
})
public class AddRouteGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRouteGroup routeGroup;

    /**
     * Gets the value of the routeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XRouteGroup }
     *     
     */
    public XRouteGroup getRouteGroup() {
        return routeGroup;
    }

    /**
     * Sets the value of the routeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRouteGroup }
     *     
     */
    public void setRouteGroup(XRouteGroup value) {
        this.routeGroup = value;
    }

}
