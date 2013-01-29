
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCumaServerSecurityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCumaServerSecurityProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cumaServerSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}RCumaServerSecurityProfile"/>
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
@XmlType(name = "GetCumaServerSecurityProfileRes", propOrder = {
    "_return"
})
public class GetCumaServerSecurityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCumaServerSecurityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCumaServerSecurityProfileRes.Return }
     *     
     */
    public GetCumaServerSecurityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCumaServerSecurityProfileRes.Return }
     *     
     */
    public void setReturn(GetCumaServerSecurityProfileRes.Return value) {
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
     *         &lt;element name="cumaServerSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}RCumaServerSecurityProfile"/>
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
        "cumaServerSecurityProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCumaServerSecurityProfile cumaServerSecurityProfile;

        /**
         * Gets the value of the cumaServerSecurityProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RCumaServerSecurityProfile }
         *     
         */
        public RCumaServerSecurityProfile getCumaServerSecurityProfile() {
            return cumaServerSecurityProfile;
        }

        /**
         * Sets the value of the cumaServerSecurityProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCumaServerSecurityProfile }
         *     
         */
        public void setCumaServerSecurityProfile(RCumaServerSecurityProfile value) {
            this.cumaServerSecurityProfile = value;
        }

    }

}
