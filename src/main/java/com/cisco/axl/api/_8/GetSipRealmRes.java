
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipRealmRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipRealmRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sipRealm" type="{http://www.cisco.com/AXL/API/8.5}RSipRealm"/>
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
@XmlType(name = "GetSipRealmRes", propOrder = {
    "_return"
})
public class GetSipRealmRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipRealmRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipRealmRes.Return }
     *     
     */
    public GetSipRealmRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipRealmRes.Return }
     *     
     */
    public void setReturn(GetSipRealmRes.Return value) {
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
     *         &lt;element name="sipRealm" type="{http://www.cisco.com/AXL/API/8.5}RSipRealm"/>
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
        "sipRealm"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipRealm sipRealm;

        /**
         * Gets the value of the sipRealm property.
         * 
         * @return
         *     possible object is
         *     {@link RSipRealm }
         *     
         */
        public RSipRealm getSipRealm() {
            return sipRealm;
        }

        /**
         * Sets the value of the sipRealm property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipRealm }
         *     
         */
        public void setSipRealm(RSipRealm value) {
            this.sipRealm = value;
        }

    }

}
