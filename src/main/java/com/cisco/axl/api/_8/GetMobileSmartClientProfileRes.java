
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMobileSmartClientProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileSmartClientProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mobileSmartClientProfile" type="{http://www.cisco.com/AXL/API/8.0}RMobileSmartClientProfile"/>
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
@XmlType(name = "GetMobileSmartClientProfileRes", propOrder = {
    "_return"
})
public class GetMobileSmartClientProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMobileSmartClientProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMobileSmartClientProfileRes.Return }
     *     
     */
    public GetMobileSmartClientProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMobileSmartClientProfileRes.Return }
     *     
     */
    public void setReturn(GetMobileSmartClientProfileRes.Return value) {
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
     *         &lt;element name="mobileSmartClientProfile" type="{http://www.cisco.com/AXL/API/8.0}RMobileSmartClientProfile"/>
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
        "mobileSmartClientProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMobileSmartClientProfile mobileSmartClientProfile;

        /**
         * Gets the value of the mobileSmartClientProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RMobileSmartClientProfile }
         *     
         */
        public RMobileSmartClientProfile getMobileSmartClientProfile() {
            return mobileSmartClientProfile;
        }

        /**
         * Sets the value of the mobileSmartClientProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMobileSmartClientProfile }
         *     
         */
        public void setMobileSmartClientProfile(RMobileSmartClientProfile value) {
            this.mobileSmartClientProfile = value;
        }

    }

}
