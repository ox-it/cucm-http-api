
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapSystemRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapSystemRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ldapSystem" type="{http://www.cisco.com/AXL/API/8.5}XLdapSystem"/>
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
@XmlType(name = "GetLdapSystemRes", propOrder = {
    "_return"
})
public class GetLdapSystemRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapSystemRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapSystemRes.Return }
     *     
     */
    public GetLdapSystemRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapSystemRes.Return }
     *     
     */
    public void setReturn(GetLdapSystemRes.Return value) {
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
     *         &lt;element name="ldapSystem" type="{http://www.cisco.com/AXL/API/8.5}XLdapSystem"/>
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
        "ldapSystem"
    })
    public static class Return {

        @XmlElement(required = true)
        protected XLdapSystem ldapSystem;

        /**
         * Gets the value of the ldapSystem property.
         * 
         * @return
         *     possible object is
         *     {@link XLdapSystem }
         *     
         */
        public XLdapSystem getLdapSystem() {
            return ldapSystem;
        }

        /**
         * Sets the value of the ldapSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link XLdapSystem }
         *     
         */
        public void setLdapSystem(XLdapSystem value) {
            this.ldapSystem = value;
        }

    }

}
