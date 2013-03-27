
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDevicePoolRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDevicePoolRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="devicePool" type="{http://www.cisco.com/AXL/API/8.0}RDevicePool"/>
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
@XmlType(name = "GetDevicePoolRes", propOrder = {
    "_return"
})
public class GetDevicePoolRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDevicePoolRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDevicePoolRes.Return }
     *     
     */
    public GetDevicePoolRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDevicePoolRes.Return }
     *     
     */
    public void setReturn(GetDevicePoolRes.Return value) {
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
     *         &lt;element name="devicePool" type="{http://www.cisco.com/AXL/API/8.0}RDevicePool"/>
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
        "devicePool"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDevicePool devicePool;

        /**
         * Gets the value of the devicePool property.
         * 
         * @return
         *     possible object is
         *     {@link RDevicePool }
         *     
         */
        public RDevicePool getDevicePool() {
            return devicePool;
        }

        /**
         * Sets the value of the devicePool property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDevicePool }
         *     
         */
        public void setDevicePool(RDevicePool value) {
            this.devicePool = value;
        }

    }

}
