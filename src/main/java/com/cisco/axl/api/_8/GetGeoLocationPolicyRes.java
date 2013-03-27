
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGeoLocationPolicyRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGeoLocationPolicyRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="geoLocationPolicy" type="{http://www.cisco.com/AXL/API/8.0}RGeoLocationPolicy"/>
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
@XmlType(name = "GetGeoLocationPolicyRes", propOrder = {
    "_return"
})
public class GetGeoLocationPolicyRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGeoLocationPolicyRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGeoLocationPolicyRes.Return }
     *     
     */
    public GetGeoLocationPolicyRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGeoLocationPolicyRes.Return }
     *     
     */
    public void setReturn(GetGeoLocationPolicyRes.Return value) {
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
     *         &lt;element name="geoLocationPolicy" type="{http://www.cisco.com/AXL/API/8.0}RGeoLocationPolicy"/>
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
        "geoLocationPolicy"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGeoLocationPolicy geoLocationPolicy;

        /**
         * Gets the value of the geoLocationPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link RGeoLocationPolicy }
         *     
         */
        public RGeoLocationPolicy getGeoLocationPolicy() {
            return geoLocationPolicy;
        }

        /**
         * Sets the value of the geoLocationPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGeoLocationPolicy }
         *     
         */
        public void setGeoLocationPolicy(RGeoLocationPolicy value) {
            this.geoLocationPolicy = value;
        }

    }

}
