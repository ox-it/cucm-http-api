
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSafSecurityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSafSecurityProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="safSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}RSafSecurityProfile"/>
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
@XmlType(name = "GetSafSecurityProfileRes", propOrder = {
    "_return"
})
public class GetSafSecurityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSafSecurityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSafSecurityProfileRes.Return }
     *     
     */
    public GetSafSecurityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSafSecurityProfileRes.Return }
     *     
     */
    public void setReturn(GetSafSecurityProfileRes.Return value) {
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
     *         &lt;element name="safSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}RSafSecurityProfile"/>
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
        "safSecurityProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSafSecurityProfile safSecurityProfile;

        /**
         * Gets the value of the safSecurityProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RSafSecurityProfile }
         *     
         */
        public RSafSecurityProfile getSafSecurityProfile() {
            return safSecurityProfile;
        }

        /**
         * Sets the value of the safSecurityProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSafSecurityProfile }
         *     
         */
        public void setSafSecurityProfile(RSafSecurityProfile value) {
            this.safSecurityProfile = value;
        }

    }

}
