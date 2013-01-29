
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCcdAdvertisingServiceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCcdAdvertisingServiceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ccdAdvertisingService" type="{http://www.cisco.com/AXL/API/8.5}RCcdAdvertisingService"/>
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
@XmlType(name = "GetCcdAdvertisingServiceRes", propOrder = {
    "_return"
})
public class GetCcdAdvertisingServiceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCcdAdvertisingServiceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCcdAdvertisingServiceRes.Return }
     *     
     */
    public GetCcdAdvertisingServiceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCcdAdvertisingServiceRes.Return }
     *     
     */
    public void setReturn(GetCcdAdvertisingServiceRes.Return value) {
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
     *         &lt;element name="ccdAdvertisingService" type="{http://www.cisco.com/AXL/API/8.5}RCcdAdvertisingService"/>
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
        "ccdAdvertisingService"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCcdAdvertisingService ccdAdvertisingService;

        /**
         * Gets the value of the ccdAdvertisingService property.
         * 
         * @return
         *     possible object is
         *     {@link RCcdAdvertisingService }
         *     
         */
        public RCcdAdvertisingService getCcdAdvertisingService() {
            return ccdAdvertisingService;
        }

        /**
         * Sets the value of the ccdAdvertisingService property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCcdAdvertisingService }
         *     
         */
        public void setCcdAdvertisingService(RCcdAdvertisingService value) {
            this.ccdAdvertisingService = value;
        }

    }

}
