
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhoneSecurityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneSecurityProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneSecurityProfile" type="{http://www.cisco.com/AXL/API/8.0}RPhoneSecurityProfile"/>
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
@XmlType(name = "GetPhoneSecurityProfileRes", propOrder = {
    "_return"
})
public class GetPhoneSecurityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPhoneSecurityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPhoneSecurityProfileRes.Return }
     *     
     */
    public GetPhoneSecurityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPhoneSecurityProfileRes.Return }
     *     
     */
    public void setReturn(GetPhoneSecurityProfileRes.Return value) {
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
     *         &lt;element name="phoneSecurityProfile" type="{http://www.cisco.com/AXL/API/8.0}RPhoneSecurityProfile"/>
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
        "phoneSecurityProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPhoneSecurityProfile phoneSecurityProfile;

        /**
         * Gets the value of the phoneSecurityProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RPhoneSecurityProfile }
         *     
         */
        public RPhoneSecurityProfile getPhoneSecurityProfile() {
            return phoneSecurityProfile;
        }

        /**
         * Sets the value of the phoneSecurityProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPhoneSecurityProfile }
         *     
         */
        public void setPhoneSecurityProfile(RPhoneSecurityProfile value) {
            this.phoneSecurityProfile = value;
        }

    }

}
