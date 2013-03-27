
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRoutePatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRoutePatternRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routePattern" type="{http://www.cisco.com/AXL/API/8.0}RRoutePattern"/>
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
@XmlType(name = "GetRoutePatternRes", propOrder = {
    "_return"
})
public class GetRoutePatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRoutePatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoutePatternRes.Return }
     *     
     */
    public GetRoutePatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoutePatternRes.Return }
     *     
     */
    public void setReturn(GetRoutePatternRes.Return value) {
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
     *         &lt;element name="routePattern" type="{http://www.cisco.com/AXL/API/8.0}RRoutePattern"/>
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
        "routePattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRoutePattern routePattern;

        /**
         * Gets the value of the routePattern property.
         * 
         * @return
         *     possible object is
         *     {@link RRoutePattern }
         *     
         */
        public RRoutePattern getRoutePattern() {
            return routePattern;
        }

        /**
         * Sets the value of the routePattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRoutePattern }
         *     
         */
        public void setRoutePattern(RRoutePattern value) {
            this.routePattern = value;
        }

    }

}
