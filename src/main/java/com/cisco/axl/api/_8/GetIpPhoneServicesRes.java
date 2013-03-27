
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIpPhoneServicesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIpPhoneServicesRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ipPhoneServices" type="{http://www.cisco.com/AXL/API/8.0}RIpPhoneServices"/>
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
@XmlType(name = "GetIpPhoneServicesRes", propOrder = {
    "_return"
})
public class GetIpPhoneServicesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetIpPhoneServicesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetIpPhoneServicesRes.Return }
     *     
     */
    public GetIpPhoneServicesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIpPhoneServicesRes.Return }
     *     
     */
    public void setReturn(GetIpPhoneServicesRes.Return value) {
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
     *         &lt;element name="ipPhoneServices" type="{http://www.cisco.com/AXL/API/8.0}RIpPhoneServices"/>
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
        "ipPhoneServices"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RIpPhoneServices ipPhoneServices;

        /**
         * Gets the value of the ipPhoneServices property.
         * 
         * @return
         *     possible object is
         *     {@link RIpPhoneServices }
         *     
         */
        public RIpPhoneServices getIpPhoneServices() {
            return ipPhoneServices;
        }

        /**
         * Sets the value of the ipPhoneServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link RIpPhoneServices }
         *     
         */
        public void setIpPhoneServices(RIpPhoneServices value) {
            this.ipPhoneServices = value;
        }

    }

}
