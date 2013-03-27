
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetApplicationUserCapfProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApplicationUserCapfProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.0}RApplicationUserCapfProfile"/>
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
@XmlType(name = "GetApplicationUserCapfProfileRes", propOrder = {
    "_return"
})
public class GetApplicationUserCapfProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetApplicationUserCapfProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetApplicationUserCapfProfileRes.Return }
     *     
     */
    public GetApplicationUserCapfProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetApplicationUserCapfProfileRes.Return }
     *     
     */
    public void setReturn(GetApplicationUserCapfProfileRes.Return value) {
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
     *         &lt;element name="applicationUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.0}RApplicationUserCapfProfile"/>
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
        "applicationUserCapfProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RApplicationUserCapfProfile applicationUserCapfProfile;

        /**
         * Gets the value of the applicationUserCapfProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RApplicationUserCapfProfile }
         *     
         */
        public RApplicationUserCapfProfile getApplicationUserCapfProfile() {
            return applicationUserCapfProfile;
        }

        /**
         * Sets the value of the applicationUserCapfProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RApplicationUserCapfProfile }
         *     
         */
        public void setApplicationUserCapfProfile(RApplicationUserCapfProfile value) {
            this.applicationUserCapfProfile = value;
        }

    }

}
