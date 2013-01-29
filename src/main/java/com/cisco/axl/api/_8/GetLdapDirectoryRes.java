
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapDirectoryRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapDirectoryRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ldapDirectory" type="{http://www.cisco.com/AXL/API/8.5}RLdapDirectory"/>
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
@XmlType(name = "GetLdapDirectoryRes", propOrder = {
    "_return"
})
public class GetLdapDirectoryRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapDirectoryRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapDirectoryRes.Return }
     *     
     */
    public GetLdapDirectoryRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapDirectoryRes.Return }
     *     
     */
    public void setReturn(GetLdapDirectoryRes.Return value) {
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
     *         &lt;element name="ldapDirectory" type="{http://www.cisco.com/AXL/API/8.5}RLdapDirectory"/>
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
        "ldapDirectory"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapDirectory ldapDirectory;

        /**
         * Gets the value of the ldapDirectory property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapDirectory }
         *     
         */
        public RLdapDirectory getLdapDirectory() {
            return ldapDirectory;
        }

        /**
         * Sets the value of the ldapDirectory property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapDirectory }
         *     
         */
        public void setLdapDirectory(RLdapDirectory value) {
            this.ldapDirectory = value;
        }

    }

}
