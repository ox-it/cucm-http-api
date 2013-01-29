
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetH323GatewayRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetH323GatewayRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="h323Gateway" type="{http://www.cisco.com/AXL/API/8.5}RH323Gateway"/>
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
@XmlType(name = "GetH323GatewayRes", propOrder = {
    "_return"
})
public class GetH323GatewayRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetH323GatewayRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetH323GatewayRes.Return }
     *     
     */
    public GetH323GatewayRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetH323GatewayRes.Return }
     *     
     */
    public void setReturn(GetH323GatewayRes.Return value) {
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
     *         &lt;element name="h323Gateway" type="{http://www.cisco.com/AXL/API/8.5}RH323Gateway"/>
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
        "h323Gateway"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RH323Gateway h323Gateway;

        /**
         * Gets the value of the h323Gateway property.
         * 
         * @return
         *     possible object is
         *     {@link RH323Gateway }
         *     
         */
        public RH323Gateway getH323Gateway() {
            return h323Gateway;
        }

        /**
         * Sets the value of the h323Gateway property.
         * 
         * @param value
         *     allowed object is
         *     {@link RH323Gateway }
         *     
         */
        public void setH323Gateway(RH323Gateway value) {
            this.h323Gateway = value;
        }

    }

}
