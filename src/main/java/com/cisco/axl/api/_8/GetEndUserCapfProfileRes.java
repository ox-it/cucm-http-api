
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEndUserCapfProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEndUserCapfProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="endUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.5}REndUserCapfProfile"/>
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
@XmlType(name = "GetEndUserCapfProfileRes", propOrder = {
    "_return"
})
public class GetEndUserCapfProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetEndUserCapfProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetEndUserCapfProfileRes.Return }
     *     
     */
    public GetEndUserCapfProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEndUserCapfProfileRes.Return }
     *     
     */
    public void setReturn(GetEndUserCapfProfileRes.Return value) {
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
     *         &lt;element name="endUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.5}REndUserCapfProfile"/>
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
        "endUserCapfProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected REndUserCapfProfile endUserCapfProfile;

        /**
         * Gets the value of the endUserCapfProfile property.
         * 
         * @return
         *     possible object is
         *     {@link REndUserCapfProfile }
         *     
         */
        public REndUserCapfProfile getEndUserCapfProfile() {
            return endUserCapfProfile;
        }

        /**
         * Sets the value of the endUserCapfProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link REndUserCapfProfile }
         *     
         */
        public void setEndUserCapfProfile(REndUserCapfProfile value) {
            this.endUserCapfProfile = value;
        }

    }

}
