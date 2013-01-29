
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSoftKeySetRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSoftKeySetRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="softKeySet" type="{http://www.cisco.com/AXL/API/8.5}RSoftKeySet"/>
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
@XmlType(name = "GetSoftKeySetRes", propOrder = {
    "_return"
})
public class GetSoftKeySetRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSoftKeySetRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSoftKeySetRes.Return }
     *     
     */
    public GetSoftKeySetRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSoftKeySetRes.Return }
     *     
     */
    public void setReturn(GetSoftKeySetRes.Return value) {
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
     *         &lt;element name="softKeySet" type="{http://www.cisco.com/AXL/API/8.5}RSoftKeySet"/>
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
        "softKeySet"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSoftKeySet softKeySet;

        /**
         * Gets the value of the softKeySet property.
         * 
         * @return
         *     possible object is
         *     {@link RSoftKeySet }
         *     
         */
        public RSoftKeySet getSoftKeySet() {
            return softKeySet;
        }

        /**
         * Sets the value of the softKeySet property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSoftKeySet }
         *     
         */
        public void setSoftKeySet(RSoftKeySet value) {
            this.softKeySet = value;
        }

    }

}
