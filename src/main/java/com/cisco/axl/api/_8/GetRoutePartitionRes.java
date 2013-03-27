
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRoutePartitionRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRoutePartitionRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/8.0}RRoutePartition"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRoutePartitionRes", propOrder = {
    "_return"
})
public class GetRoutePartitionRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRoutePartitionRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoutePartitionRes.Return }
     *     
     */
    public GetRoutePartitionRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoutePartitionRes.Return }
     *     
     */
    public void setReturn(GetRoutePartitionRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/8.0}RRoutePartition"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "routePartition"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRoutePartition routePartition;

        /**
         * Gets the value of the routePartition property.
         * 
         * @return
         *     possible object is
         *     {@link RRoutePartition }
         *     
         */
        public RRoutePartition getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRoutePartition }
         *     
         */
        public void setRoutePartition(RRoutePartition value) {
            this.routePartition = value;
        }

    }

}
