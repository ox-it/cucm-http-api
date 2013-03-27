
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRoutePartitionReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRoutePartitionReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/8.0}XRoutePartition"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRoutePartitionReq", propOrder = {
    "routePartition"
})
public class AddRoutePartitionReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRoutePartition routePartition;

    /**
     * Gets the value of the routePartition property.
     * 
     * @return
     *     possible object is
     *     {@link XRoutePartition }
     *     
     */
    public XRoutePartition getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRoutePartition }
     *     
     */
    public void setRoutePartition(XRoutePartition value) {
        this.routePartition = value;
    }

}
