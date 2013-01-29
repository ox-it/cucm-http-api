
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRouteFilterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRouteFilterReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="routeFilter" type="{http://www.cisco.com/AXL/API/8.5}XRouteFilter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRouteFilterReq", propOrder = {
    "routeFilter"
})
public class AddRouteFilterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRouteFilter routeFilter;

    /**
     * Gets the value of the routeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link XRouteFilter }
     *     
     */
    public XRouteFilter getRouteFilter() {
        return routeFilter;
    }

    /**
     * Sets the value of the routeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRouteFilter }
     *     
     */
    public void setRouteFilter(XRouteFilter value) {
        this.routeFilter = value;
    }

}
