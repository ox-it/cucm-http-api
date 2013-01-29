
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVg224Res complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVg224Res">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vg224" type="{http://www.cisco.com/AXL/API/8.5}RVg224"/>
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
@XmlType(name = "GetVg224Res", propOrder = {
    "_return"
})
public class GetVg224Res
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVg224Res.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVg224Res.Return }
     *     
     */
    public GetVg224Res.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVg224Res.Return }
     *     
     */
    public void setReturn(GetVg224Res.Return value) {
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
     *         &lt;element name="vg224" type="{http://www.cisco.com/AXL/API/8.5}RVg224"/>
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
        "vg224"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVg224 vg224;

        /**
         * Gets the value of the vg224 property.
         * 
         * @return
         *     possible object is
         *     {@link RVg224 }
         *     
         */
        public RVg224 getVg224() {
            return vg224;
        }

        /**
         * Sets the value of the vg224 property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVg224 }
         *     
         */
        public void setVg224(RVg224 value) {
            this.vg224 = value;
        }

    }

}
