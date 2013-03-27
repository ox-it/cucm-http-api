
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhoneNtpRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneNtpRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNtp" type="{http://www.cisco.com/AXL/API/8.0}RPhoneNtp"/>
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
@XmlType(name = "GetPhoneNtpRes", propOrder = {
    "_return"
})
public class GetPhoneNtpRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPhoneNtpRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPhoneNtpRes.Return }
     *     
     */
    public GetPhoneNtpRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPhoneNtpRes.Return }
     *     
     */
    public void setReturn(GetPhoneNtpRes.Return value) {
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
     *         &lt;element name="phoneNtp" type="{http://www.cisco.com/AXL/API/8.0}RPhoneNtp"/>
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
        "phoneNtp"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPhoneNtp phoneNtp;

        /**
         * Gets the value of the phoneNtp property.
         * 
         * @return
         *     possible object is
         *     {@link RPhoneNtp }
         *     
         */
        public RPhoneNtp getPhoneNtp() {
            return phoneNtp;
        }

        /**
         * Sets the value of the phoneNtp property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPhoneNtp }
         *     
         */
        public void setPhoneNtp(RPhoneNtp value) {
            this.phoneNtp = value;
        }

    }

}
