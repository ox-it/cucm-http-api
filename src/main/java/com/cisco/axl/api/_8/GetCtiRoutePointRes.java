
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCtiRoutePointRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCtiRoutePointRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ctiRoutePoint" type="{http://www.cisco.com/AXL/API/8.5}RCtiRoutePoint"/>
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
@XmlType(name = "GetCtiRoutePointRes", propOrder = {
    "_return"
})
public class GetCtiRoutePointRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCtiRoutePointRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCtiRoutePointRes.Return }
     *     
     */
    public GetCtiRoutePointRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCtiRoutePointRes.Return }
     *     
     */
    public void setReturn(GetCtiRoutePointRes.Return value) {
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
     *         &lt;element name="ctiRoutePoint" type="{http://www.cisco.com/AXL/API/8.5}RCtiRoutePoint"/>
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
        "ctiRoutePoint"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCtiRoutePoint ctiRoutePoint;

        /**
         * Gets the value of the ctiRoutePoint property.
         * 
         * @return
         *     possible object is
         *     {@link RCtiRoutePoint }
         *     
         */
        public RCtiRoutePoint getCtiRoutePoint() {
            return ctiRoutePoint;
        }

        /**
         * Sets the value of the ctiRoutePoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCtiRoutePoint }
         *     
         */
        public void setCtiRoutePoint(RCtiRoutePoint value) {
            this.ctiRoutePoint = value;
        }

    }

}
