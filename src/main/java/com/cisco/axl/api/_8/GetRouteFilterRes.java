
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRouteFilterRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRouteFilterRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routeFilter" type="{http://www.cisco.com/AXL/API/8.5}RRouteFilter"/>
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
@XmlType(name = "GetRouteFilterRes", propOrder = {
    "_return"
})
public class GetRouteFilterRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRouteFilterRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRouteFilterRes.Return }
     *     
     */
    public GetRouteFilterRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRouteFilterRes.Return }
     *     
     */
    public void setReturn(GetRouteFilterRes.Return value) {
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
     *         &lt;element name="routeFilter" type="{http://www.cisco.com/AXL/API/8.5}RRouteFilter"/>
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
        "routeFilter"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRouteFilter routeFilter;

        /**
         * Gets the value of the routeFilter property.
         * 
         * @return
         *     possible object is
         *     {@link RRouteFilter }
         *     
         */
        public RRouteFilter getRouteFilter() {
            return routeFilter;
        }

        /**
         * Sets the value of the routeFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRouteFilter }
         *     
         */
        public void setRouteFilter(RRouteFilter value) {
            this.routeFilter = value;
        }

    }

}
