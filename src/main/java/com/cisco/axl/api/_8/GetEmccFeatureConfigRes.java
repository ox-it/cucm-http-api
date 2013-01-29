
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEmccFeatureConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEmccFeatureConfigRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="emccFeatureConfig" type="{http://www.cisco.com/AXL/API/8.5}REmccFeatureConfig"/>
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
@XmlType(name = "GetEmccFeatureConfigRes", propOrder = {
    "_return"
})
public class GetEmccFeatureConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetEmccFeatureConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetEmccFeatureConfigRes.Return }
     *     
     */
    public GetEmccFeatureConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEmccFeatureConfigRes.Return }
     *     
     */
    public void setReturn(GetEmccFeatureConfigRes.Return value) {
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
     *         &lt;element name="emccFeatureConfig" type="{http://www.cisco.com/AXL/API/8.5}REmccFeatureConfig"/>
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
        "emccFeatureConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected REmccFeatureConfig emccFeatureConfig;

        /**
         * Gets the value of the emccFeatureConfig property.
         * 
         * @return
         *     possible object is
         *     {@link REmccFeatureConfig }
         *     
         */
        public REmccFeatureConfig getEmccFeatureConfig() {
            return emccFeatureConfig;
        }

        /**
         * Sets the value of the emccFeatureConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link REmccFeatureConfig }
         *     
         */
        public void setEmccFeatureConfig(REmccFeatureConfig value) {
            this.emccFeatureConfig = value;
        }

    }

}
