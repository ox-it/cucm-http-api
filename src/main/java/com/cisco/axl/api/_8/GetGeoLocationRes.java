
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGeoLocationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGeoLocationRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="geoLocation" type="{http://www.cisco.com/AXL/API/8.0}RGeoLocation"/>
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
@XmlType(name = "GetGeoLocationRes", propOrder = {
    "_return"
})
public class GetGeoLocationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGeoLocationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGeoLocationRes.Return }
     *     
     */
    public GetGeoLocationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGeoLocationRes.Return }
     *     
     */
    public void setReturn(GetGeoLocationRes.Return value) {
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
     *         &lt;element name="geoLocation" type="{http://www.cisco.com/AXL/API/8.0}RGeoLocation"/>
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
        "geoLocation"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGeoLocation geoLocation;

        /**
         * Gets the value of the geoLocation property.
         * 
         * @return
         *     possible object is
         *     {@link RGeoLocation }
         *     
         */
        public RGeoLocation getGeoLocation() {
            return geoLocation;
        }

        /**
         * Sets the value of the geoLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGeoLocation }
         *     
         */
        public void setGeoLocation(RGeoLocation value) {
            this.geoLocation = value;
        }

    }

}
