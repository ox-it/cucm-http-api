
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEnterprisePhoneConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEnterprisePhoneConfigRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enterprisePhoneConfig" type="{http://www.cisco.com/AXL/API/8.5}XEnterprisePhoneConfig"/>
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
@XmlType(name = "GetEnterprisePhoneConfigRes", propOrder = {
    "_return"
})
public class GetEnterprisePhoneConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetEnterprisePhoneConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetEnterprisePhoneConfigRes.Return }
     *     
     */
    public GetEnterprisePhoneConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEnterprisePhoneConfigRes.Return }
     *     
     */
    public void setReturn(GetEnterprisePhoneConfigRes.Return value) {
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
     *         &lt;element name="enterprisePhoneConfig" type="{http://www.cisco.com/AXL/API/8.5}XEnterprisePhoneConfig"/>
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
        "enterprisePhoneConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected XEnterprisePhoneConfig enterprisePhoneConfig;

        /**
         * Gets the value of the enterprisePhoneConfig property.
         * 
         * @return
         *     possible object is
         *     {@link XEnterprisePhoneConfig }
         *     
         */
        public XEnterprisePhoneConfig getEnterprisePhoneConfig() {
            return enterprisePhoneConfig;
        }

        /**
         * Sets the value of the enterprisePhoneConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link XEnterprisePhoneConfig }
         *     
         */
        public void setEnterprisePhoneConfig(XEnterprisePhoneConfig value) {
            this.enterprisePhoneConfig = value;
        }

    }

}
