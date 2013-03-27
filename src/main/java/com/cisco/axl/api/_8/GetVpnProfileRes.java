
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVpnProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVpnProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vpnProfile" type="{http://www.cisco.com/AXL/API/8.0}RVpnProfile"/>
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
@XmlType(name = "GetVpnProfileRes", propOrder = {
    "_return"
})
public class GetVpnProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVpnProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVpnProfileRes.Return }
     *     
     */
    public GetVpnProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVpnProfileRes.Return }
     *     
     */
    public void setReturn(GetVpnProfileRes.Return value) {
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
     *         &lt;element name="vpnProfile" type="{http://www.cisco.com/AXL/API/8.0}RVpnProfile"/>
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
        "vpnProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVpnProfile vpnProfile;

        /**
         * Gets the value of the vpnProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RVpnProfile }
         *     
         */
        public RVpnProfile getVpnProfile() {
            return vpnProfile;
        }

        /**
         * Sets the value of the vpnProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVpnProfile }
         *     
         */
        public void setVpnProfile(RVpnProfile value) {
            this.vpnProfile = value;
        }

    }

}
