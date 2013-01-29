
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDeviceMobilityRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeviceMobilityRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deviceMobility" type="{http://www.cisco.com/AXL/API/8.5}RDeviceMobility"/>
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
@XmlType(name = "GetDeviceMobilityRes", propOrder = {
    "_return"
})
public class GetDeviceMobilityRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDeviceMobilityRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeviceMobilityRes.Return }
     *     
     */
    public GetDeviceMobilityRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeviceMobilityRes.Return }
     *     
     */
    public void setReturn(GetDeviceMobilityRes.Return value) {
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
     *         &lt;element name="deviceMobility" type="{http://www.cisco.com/AXL/API/8.5}RDeviceMobility"/>
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
        "deviceMobility"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDeviceMobility deviceMobility;

        /**
         * Gets the value of the deviceMobility property.
         * 
         * @return
         *     possible object is
         *     {@link RDeviceMobility }
         *     
         */
        public RDeviceMobility getDeviceMobility() {
            return deviceMobility;
        }

        /**
         * Sets the value of the deviceMobility property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDeviceMobility }
         *     
         */
        public void setDeviceMobility(RDeviceMobility value) {
            this.deviceMobility = value;
        }

    }

}
