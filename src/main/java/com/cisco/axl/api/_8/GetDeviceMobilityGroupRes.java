
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDeviceMobilityGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeviceMobilityGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deviceMobilityGroup" type="{http://www.cisco.com/AXL/API/8.5}RDeviceMobilityGroup"/>
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
@XmlType(name = "GetDeviceMobilityGroupRes", propOrder = {
    "_return"
})
public class GetDeviceMobilityGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDeviceMobilityGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeviceMobilityGroupRes.Return }
     *     
     */
    public GetDeviceMobilityGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeviceMobilityGroupRes.Return }
     *     
     */
    public void setReturn(GetDeviceMobilityGroupRes.Return value) {
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
     *         &lt;element name="deviceMobilityGroup" type="{http://www.cisco.com/AXL/API/8.5}RDeviceMobilityGroup"/>
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
        "deviceMobilityGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDeviceMobilityGroup deviceMobilityGroup;

        /**
         * Gets the value of the deviceMobilityGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RDeviceMobilityGroup }
         *     
         */
        public RDeviceMobilityGroup getDeviceMobilityGroup() {
            return deviceMobilityGroup;
        }

        /**
         * Sets the value of the deviceMobilityGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDeviceMobilityGroup }
         *     
         */
        public void setDeviceMobilityGroup(RDeviceMobilityGroup value) {
            this.deviceMobilityGroup = value;
        }

    }

}
