
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCommonPhoneConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCommonPhoneConfigRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commonPhoneConfig" type="{http://www.cisco.com/AXL/API/8.5}RCommonPhoneConfig"/>
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
@XmlType(name = "GetCommonPhoneConfigRes", propOrder = {
    "_return"
})
public class GetCommonPhoneConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCommonPhoneConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommonPhoneConfigRes.Return }
     *     
     */
    public GetCommonPhoneConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommonPhoneConfigRes.Return }
     *     
     */
    public void setReturn(GetCommonPhoneConfigRes.Return value) {
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
     *         &lt;element name="commonPhoneConfig" type="{http://www.cisco.com/AXL/API/8.5}RCommonPhoneConfig"/>
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
        "commonPhoneConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCommonPhoneConfig commonPhoneConfig;

        /**
         * Gets the value of the commonPhoneConfig property.
         * 
         * @return
         *     possible object is
         *     {@link RCommonPhoneConfig }
         *     
         */
        public RCommonPhoneConfig getCommonPhoneConfig() {
            return commonPhoneConfig;
        }

        /**
         * Sets the value of the commonPhoneConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCommonPhoneConfig }
         *     
         */
        public void setCommonPhoneConfig(RCommonPhoneConfig value) {
            this.commonPhoneConfig = value;
        }

    }

}
