
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhoneButtonTemplateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneButtonTemplateRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneButtonTemplate" type="{http://www.cisco.com/AXL/API/8.5}RPhoneButtonTemplate"/>
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
@XmlType(name = "GetPhoneButtonTemplateRes", propOrder = {
    "_return"
})
public class GetPhoneButtonTemplateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPhoneButtonTemplateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPhoneButtonTemplateRes.Return }
     *     
     */
    public GetPhoneButtonTemplateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPhoneButtonTemplateRes.Return }
     *     
     */
    public void setReturn(GetPhoneButtonTemplateRes.Return value) {
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
     *         &lt;element name="phoneButtonTemplate" type="{http://www.cisco.com/AXL/API/8.5}RPhoneButtonTemplate"/>
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
        "phoneButtonTemplate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPhoneButtonTemplate phoneButtonTemplate;

        /**
         * Gets the value of the phoneButtonTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link RPhoneButtonTemplate }
         *     
         */
        public RPhoneButtonTemplate getPhoneButtonTemplate() {
            return phoneButtonTemplate;
        }

        /**
         * Sets the value of the phoneButtonTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPhoneButtonTemplate }
         *     
         */
        public void setPhoneButtonTemplate(RPhoneButtonTemplate value) {
            this.phoneButtonTemplate = value;
        }

    }

}
