
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSoftKeyTemplateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSoftKeyTemplateRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="softKeyTemplate" type="{http://www.cisco.com/AXL/API/8.0}RSoftKeyTemplate"/>
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
@XmlType(name = "GetSoftKeyTemplateRes", propOrder = {
    "_return"
})
public class GetSoftKeyTemplateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSoftKeyTemplateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSoftKeyTemplateRes.Return }
     *     
     */
    public GetSoftKeyTemplateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSoftKeyTemplateRes.Return }
     *     
     */
    public void setReturn(GetSoftKeyTemplateRes.Return value) {
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
     *         &lt;element name="softKeyTemplate" type="{http://www.cisco.com/AXL/API/8.0}RSoftKeyTemplate"/>
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
        "softKeyTemplate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSoftKeyTemplate softKeyTemplate;

        /**
         * Gets the value of the softKeyTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link RSoftKeyTemplate }
         *     
         */
        public RSoftKeyTemplate getSoftKeyTemplate() {
            return softKeyTemplate;
        }

        /**
         * Sets the value of the softKeyTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSoftKeyTemplate }
         *     
         */
        public void setSoftKeyTemplate(RSoftKeyTemplate value) {
            this.softKeyTemplate = value;
        }

    }

}
