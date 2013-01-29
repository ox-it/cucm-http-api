
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sipProfile" type="{http://www.cisco.com/AXL/API/8.5}RSipProfile"/>
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
@XmlType(name = "GetSipProfileRes", propOrder = {
    "_return"
})
public class GetSipProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipProfileRes.Return }
     *     
     */
    public GetSipProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipProfileRes.Return }
     *     
     */
    public void setReturn(GetSipProfileRes.Return value) {
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
     *         &lt;element name="sipProfile" type="{http://www.cisco.com/AXL/API/8.5}RSipProfile"/>
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
        "sipProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipProfile sipProfile;

        /**
         * Gets the value of the sipProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RSipProfile }
         *     
         */
        public RSipProfile getSipProfile() {
            return sipProfile;
        }

        /**
         * Sets the value of the sipProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipProfile }
         *     
         */
        public void setSipProfile(RSipProfile value) {
            this.sipProfile = value;
        }

    }

}
