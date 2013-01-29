
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCommonDeviceConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCommonDeviceConfigRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commonDeviceConfig" type="{http://www.cisco.com/AXL/API/8.5}RCommonDeviceConfig"/>
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
@XmlType(name = "GetCommonDeviceConfigRes", propOrder = {
    "_return"
})
public class GetCommonDeviceConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCommonDeviceConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommonDeviceConfigRes.Return }
     *     
     */
    public GetCommonDeviceConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommonDeviceConfigRes.Return }
     *     
     */
    public void setReturn(GetCommonDeviceConfigRes.Return value) {
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
     *         &lt;element name="commonDeviceConfig" type="{http://www.cisco.com/AXL/API/8.5}RCommonDeviceConfig"/>
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
        "commonDeviceConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCommonDeviceConfig commonDeviceConfig;

        /**
         * Gets the value of the commonDeviceConfig property.
         * 
         * @return
         *     possible object is
         *     {@link RCommonDeviceConfig }
         *     
         */
        public RCommonDeviceConfig getCommonDeviceConfig() {
            return commonDeviceConfig;
        }

        /**
         * Sets the value of the commonDeviceConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCommonDeviceConfig }
         *     
         */
        public void setCommonDeviceConfig(RCommonDeviceConfig value) {
            this.commonDeviceConfig = value;
        }

    }

}
