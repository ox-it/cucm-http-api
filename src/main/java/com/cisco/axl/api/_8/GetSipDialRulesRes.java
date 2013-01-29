
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipDialRulesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipDialRulesRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sipDialRules" type="{http://www.cisco.com/AXL/API/8.5}RSipDialRules"/>
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
@XmlType(name = "GetSipDialRulesRes", propOrder = {
    "_return"
})
public class GetSipDialRulesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipDialRulesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipDialRulesRes.Return }
     *     
     */
    public GetSipDialRulesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipDialRulesRes.Return }
     *     
     */
    public void setReturn(GetSipDialRulesRes.Return value) {
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
     *         &lt;element name="sipDialRules" type="{http://www.cisco.com/AXL/API/8.5}RSipDialRules"/>
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
        "sipDialRules"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipDialRules sipDialRules;

        /**
         * Gets the value of the sipDialRules property.
         * 
         * @return
         *     possible object is
         *     {@link RSipDialRules }
         *     
         */
        public RSipDialRules getSipDialRules() {
            return sipDialRules;
        }

        /**
         * Sets the value of the sipDialRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipDialRules }
         *     
         */
        public void setSipDialRules(RSipDialRules value) {
            this.sipDialRules = value;
        }

    }

}
