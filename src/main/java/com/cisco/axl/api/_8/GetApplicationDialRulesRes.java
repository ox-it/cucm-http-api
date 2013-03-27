
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetApplicationDialRulesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApplicationDialRulesRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationDialRules" type="{http://www.cisco.com/AXL/API/8.0}RApplicationDialRules"/>
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
@XmlType(name = "GetApplicationDialRulesRes", propOrder = {
    "_return"
})
public class GetApplicationDialRulesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetApplicationDialRulesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetApplicationDialRulesRes.Return }
     *     
     */
    public GetApplicationDialRulesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetApplicationDialRulesRes.Return }
     *     
     */
    public void setReturn(GetApplicationDialRulesRes.Return value) {
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
     *         &lt;element name="applicationDialRules" type="{http://www.cisco.com/AXL/API/8.0}RApplicationDialRules"/>
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
        "applicationDialRules"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RApplicationDialRules applicationDialRules;

        /**
         * Gets the value of the applicationDialRules property.
         * 
         * @return
         *     possible object is
         *     {@link RApplicationDialRules }
         *     
         */
        public RApplicationDialRules getApplicationDialRules() {
            return applicationDialRules;
        }

        /**
         * Sets the value of the applicationDialRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link RApplicationDialRules }
         *     
         */
        public void setApplicationDialRules(RApplicationDialRules value) {
            this.applicationDialRules = value;
        }

    }

}
