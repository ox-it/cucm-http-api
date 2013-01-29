
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIvrUserLocaleRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIvrUserLocaleRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ivrUserLocale" type="{http://www.cisco.com/AXL/API/8.5}RIvrUserLocale"/>
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
@XmlType(name = "GetIvrUserLocaleRes", propOrder = {
    "_return"
})
public class GetIvrUserLocaleRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetIvrUserLocaleRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetIvrUserLocaleRes.Return }
     *     
     */
    public GetIvrUserLocaleRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIvrUserLocaleRes.Return }
     *     
     */
    public void setReturn(GetIvrUserLocaleRes.Return value) {
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
     *         &lt;element name="ivrUserLocale" type="{http://www.cisco.com/AXL/API/8.5}RIvrUserLocale"/>
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
        "ivrUserLocale"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RIvrUserLocale ivrUserLocale;

        /**
         * Gets the value of the ivrUserLocale property.
         * 
         * @return
         *     possible object is
         *     {@link RIvrUserLocale }
         *     
         */
        public RIvrUserLocale getIvrUserLocale() {
            return ivrUserLocale;
        }

        /**
         * Sets the value of the ivrUserLocale property.
         * 
         * @param value
         *     allowed object is
         *     {@link RIvrUserLocale }
         *     
         */
        public void setIvrUserLocale(RIvrUserLocale value) {
            this.ivrUserLocale = value;
        }

    }

}
