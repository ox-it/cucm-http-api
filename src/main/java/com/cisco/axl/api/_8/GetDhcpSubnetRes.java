
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDhcpSubnetRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDhcpSubnetRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dhcpSubnet" type="{http://www.cisco.com/AXL/API/8.0}RDhcpSubnet"/>
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
@XmlType(name = "GetDhcpSubnetRes", propOrder = {
    "_return"
})
public class GetDhcpSubnetRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDhcpSubnetRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDhcpSubnetRes.Return }
     *     
     */
    public GetDhcpSubnetRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDhcpSubnetRes.Return }
     *     
     */
    public void setReturn(GetDhcpSubnetRes.Return value) {
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
     *         &lt;element name="dhcpSubnet" type="{http://www.cisco.com/AXL/API/8.0}RDhcpSubnet"/>
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
        "dhcpSubnet"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDhcpSubnet dhcpSubnet;

        /**
         * Gets the value of the dhcpSubnet property.
         * 
         * @return
         *     possible object is
         *     {@link RDhcpSubnet }
         *     
         */
        public RDhcpSubnet getDhcpSubnet() {
            return dhcpSubnet;
        }

        /**
         * Sets the value of the dhcpSubnet property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDhcpSubnet }
         *     
         */
        public void setDhcpSubnet(RDhcpSubnet value) {
            this.dhcpSubnet = value;
        }

    }

}
