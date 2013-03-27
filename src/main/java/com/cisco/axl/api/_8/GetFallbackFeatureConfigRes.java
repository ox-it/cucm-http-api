
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFallbackFeatureConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFallbackFeatureConfigRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fallbackFeatureConfig" type="{http://www.cisco.com/AXL/API/8.0}RFallbackFeatureConfig"/>
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
@XmlType(name = "GetFallbackFeatureConfigRes", propOrder = {
    "_return"
})
public class GetFallbackFeatureConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetFallbackFeatureConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetFallbackFeatureConfigRes.Return }
     *     
     */
    public GetFallbackFeatureConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFallbackFeatureConfigRes.Return }
     *     
     */
    public void setReturn(GetFallbackFeatureConfigRes.Return value) {
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
     *         &lt;element name="fallbackFeatureConfig" type="{http://www.cisco.com/AXL/API/8.0}RFallbackFeatureConfig"/>
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
        "fallbackFeatureConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RFallbackFeatureConfig fallbackFeatureConfig;

        /**
         * Gets the value of the fallbackFeatureConfig property.
         * 
         * @return
         *     possible object is
         *     {@link RFallbackFeatureConfig }
         *     
         */
        public RFallbackFeatureConfig getFallbackFeatureConfig() {
            return fallbackFeatureConfig;
        }

        /**
         * Sets the value of the fallbackFeatureConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link RFallbackFeatureConfig }
         *     
         */
        public void setFallbackFeatureConfig(RFallbackFeatureConfig value) {
            this.fallbackFeatureConfig = value;
        }

    }

}
