
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVpnGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVpnGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vpnGroup" type="{http://www.cisco.com/AXL/API/8.0}RVpnGroup"/>
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
@XmlType(name = "GetVpnGroupRes", propOrder = {
    "_return"
})
public class GetVpnGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVpnGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVpnGroupRes.Return }
     *     
     */
    public GetVpnGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVpnGroupRes.Return }
     *     
     */
    public void setReturn(GetVpnGroupRes.Return value) {
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
     *         &lt;element name="vpnGroup" type="{http://www.cisco.com/AXL/API/8.0}RVpnGroup"/>
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
        "vpnGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVpnGroup vpnGroup;

        /**
         * Gets the value of the vpnGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RVpnGroup }
         *     
         */
        public RVpnGroup getVpnGroup() {
            return vpnGroup;
        }

        /**
         * Sets the value of the vpnGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVpnGroup }
         *     
         */
        public void setVpnGroup(RVpnGroup value) {
            this.vpnGroup = value;
        }

    }

}
