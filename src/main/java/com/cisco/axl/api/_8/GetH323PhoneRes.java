
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetH323PhoneRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetH323PhoneRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="h323Phone" type="{http://www.cisco.com/AXL/API/8.5}RH323Phone"/>
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
@XmlType(name = "GetH323PhoneRes", propOrder = {
    "_return"
})
public class GetH323PhoneRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetH323PhoneRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetH323PhoneRes.Return }
     *     
     */
    public GetH323PhoneRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetH323PhoneRes.Return }
     *     
     */
    public void setReturn(GetH323PhoneRes.Return value) {
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
     *         &lt;element name="h323Phone" type="{http://www.cisco.com/AXL/API/8.5}RH323Phone"/>
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
        "h323Phone"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RH323Phone h323Phone;

        /**
         * Gets the value of the h323Phone property.
         * 
         * @return
         *     possible object is
         *     {@link RH323Phone }
         *     
         */
        public RH323Phone getH323Phone() {
            return h323Phone;
        }

        /**
         * Sets the value of the h323Phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link RH323Phone }
         *     
         */
        public void setH323Phone(RH323Phone value) {
            this.h323Phone = value;
        }

    }

}
