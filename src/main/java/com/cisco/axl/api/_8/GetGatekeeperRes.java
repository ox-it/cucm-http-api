
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGatekeeperRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGatekeeperRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gatekeeper" type="{http://www.cisco.com/AXL/API/8.5}RGatekeeper"/>
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
@XmlType(name = "GetGatekeeperRes", propOrder = {
    "_return"
})
public class GetGatekeeperRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGatekeeperRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGatekeeperRes.Return }
     *     
     */
    public GetGatekeeperRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGatekeeperRes.Return }
     *     
     */
    public void setReturn(GetGatekeeperRes.Return value) {
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
     *         &lt;element name="gatekeeper" type="{http://www.cisco.com/AXL/API/8.5}RGatekeeper"/>
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
        "gatekeeper"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGatekeeper gatekeeper;

        /**
         * Gets the value of the gatekeeper property.
         * 
         * @return
         *     possible object is
         *     {@link RGatekeeper }
         *     
         */
        public RGatekeeper getGatekeeper() {
            return gatekeeper;
        }

        /**
         * Sets the value of the gatekeeper property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGatekeeper }
         *     
         */
        public void setGatekeeper(RGatekeeper value) {
            this.gatekeeper = value;
        }

    }

}
