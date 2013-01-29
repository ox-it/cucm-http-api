
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRouteGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRouteGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routeGroup" type="{http://www.cisco.com/AXL/API/8.5}RRouteGroup"/>
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
@XmlType(name = "GetRouteGroupRes", propOrder = {
    "_return"
})
public class GetRouteGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRouteGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRouteGroupRes.Return }
     *     
     */
    public GetRouteGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRouteGroupRes.Return }
     *     
     */
    public void setReturn(GetRouteGroupRes.Return value) {
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
     *         &lt;element name="routeGroup" type="{http://www.cisco.com/AXL/API/8.5}RRouteGroup"/>
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
        "routeGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRouteGroup routeGroup;

        /**
         * Gets the value of the routeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RRouteGroup }
         *     
         */
        public RRouteGroup getRouteGroup() {
            return routeGroup;
        }

        /**
         * Sets the value of the routeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRouteGroup }
         *     
         */
        public void setRouteGroup(RRouteGroup value) {
            this.routeGroup = value;
        }

    }

}
