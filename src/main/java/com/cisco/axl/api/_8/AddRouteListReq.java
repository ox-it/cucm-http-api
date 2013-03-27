
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRouteListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRouteListReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="routeList" type="{http://www.cisco.com/AXL/API/8.0}XRouteList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRouteListReq", propOrder = {
    "routeList"
})
public class AddRouteListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRouteList routeList;

    /**
     * Gets the value of the routeList property.
     * 
     * @return
     *     possible object is
     *     {@link XRouteList }
     *     
     */
    public XRouteList getRouteList() {
        return routeList;
    }

    /**
     * Sets the value of the routeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRouteList }
     *     
     */
    public void setRouteList(XRouteList value) {
        this.routeList = value;
    }

}
