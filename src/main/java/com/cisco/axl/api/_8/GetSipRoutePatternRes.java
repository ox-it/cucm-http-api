
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipRoutePatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipRoutePatternRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sipRoutePattern" type="{http://www.cisco.com/AXL/API/8.5}RSipRoutePattern"/>
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
@XmlType(name = "GetSipRoutePatternRes", propOrder = {
    "_return"
})
public class GetSipRoutePatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipRoutePatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipRoutePatternRes.Return }
     *     
     */
    public GetSipRoutePatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipRoutePatternRes.Return }
     *     
     */
    public void setReturn(GetSipRoutePatternRes.Return value) {
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
     *         &lt;element name="sipRoutePattern" type="{http://www.cisco.com/AXL/API/8.5}RSipRoutePattern"/>
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
        "sipRoutePattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipRoutePattern sipRoutePattern;

        /**
         * Gets the value of the sipRoutePattern property.
         * 
         * @return
         *     possible object is
         *     {@link RSipRoutePattern }
         *     
         */
        public RSipRoutePattern getSipRoutePattern() {
            return sipRoutePattern;
        }

        /**
         * Sets the value of the sipRoutePattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipRoutePattern }
         *     
         */
        public void setSipRoutePattern(RSipRoutePattern value) {
            this.sipRoutePattern = value;
        }

    }

}
