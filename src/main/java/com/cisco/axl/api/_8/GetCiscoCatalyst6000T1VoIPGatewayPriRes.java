
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCiscoCatalyst6000T1VoIPGatewayPriRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCiscoCatalyst6000T1VoIPGatewayPriRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ciscoCatalyst6000T1VoIPGatewayPri" type="{http://www.cisco.com/AXL/API/8.0}RCiscoCatalyst6000T1VoIPGatewayPri"/>
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
@XmlType(name = "GetCiscoCatalyst6000T1VoIPGatewayPriRes", propOrder = {
    "_return"
})
public class GetCiscoCatalyst6000T1VoIPGatewayPriRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return }
     *     
     */
    public GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return }
     *     
     */
    public void setReturn(GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return value) {
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
     *         &lt;element name="ciscoCatalyst6000T1VoIPGatewayPri" type="{http://www.cisco.com/AXL/API/8.0}RCiscoCatalyst6000T1VoIPGatewayPri"/>
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
        "ciscoCatalyst6000T1VoIPGatewayPri"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCiscoCatalyst6000T1VoIPGatewayPri ciscoCatalyst6000T1VoIPGatewayPri;

        /**
         * Gets the value of the ciscoCatalyst6000T1VoIPGatewayPri property.
         * 
         * @return
         *     possible object is
         *     {@link RCiscoCatalyst6000T1VoIPGatewayPri }
         *     
         */
        public RCiscoCatalyst6000T1VoIPGatewayPri getCiscoCatalyst6000T1VoIPGatewayPri() {
            return ciscoCatalyst6000T1VoIPGatewayPri;
        }

        /**
         * Sets the value of the ciscoCatalyst6000T1VoIPGatewayPri property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCiscoCatalyst6000T1VoIPGatewayPri }
         *     
         */
        public void setCiscoCatalyst6000T1VoIPGatewayPri(RCiscoCatalyst6000T1VoIPGatewayPri value) {
            this.ciscoCatalyst6000T1VoIPGatewayPri = value;
        }

    }

}
