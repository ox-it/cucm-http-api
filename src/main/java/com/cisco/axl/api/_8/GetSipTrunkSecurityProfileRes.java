
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipTrunkSecurityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipTrunkSecurityProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sipTrunkSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}RSipTrunkSecurityProfile"/>
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
@XmlType(name = "GetSipTrunkSecurityProfileRes", propOrder = {
    "_return"
})
public class GetSipTrunkSecurityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipTrunkSecurityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipTrunkSecurityProfileRes.Return }
     *     
     */
    public GetSipTrunkSecurityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipTrunkSecurityProfileRes.Return }
     *     
     */
    public void setReturn(GetSipTrunkSecurityProfileRes.Return value) {
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
     *         &lt;element name="sipTrunkSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}RSipTrunkSecurityProfile"/>
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
        "sipTrunkSecurityProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipTrunkSecurityProfile sipTrunkSecurityProfile;

        /**
         * Gets the value of the sipTrunkSecurityProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RSipTrunkSecurityProfile }
         *     
         */
        public RSipTrunkSecurityProfile getSipTrunkSecurityProfile() {
            return sipTrunkSecurityProfile;
        }

        /**
         * Sets the value of the sipTrunkSecurityProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipTrunkSecurityProfile }
         *     
         */
        public void setSipTrunkSecurityProfile(RSipTrunkSecurityProfile value) {
            this.sipTrunkSecurityProfile = value;
        }

    }

}
