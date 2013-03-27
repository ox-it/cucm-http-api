
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOSVersionRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOSVersionRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="os" type="{http://www.cisco.com/AXL/API/8.0}XOSVersion"/>
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
@XmlType(name = "GetOSVersionRes", propOrder = {
    "_return"
})
public class GetOSVersionRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetOSVersionRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetOSVersionRes.Return }
     *     
     */
    public GetOSVersionRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOSVersionRes.Return }
     *     
     */
    public void setReturn(GetOSVersionRes.Return value) {
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
     *         &lt;element name="os" type="{http://www.cisco.com/AXL/API/8.0}XOSVersion"/>
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
        "os"
    })
    public static class Return {

        @XmlElement(required = true)
        protected XOSVersion os;

        /**
         * Gets the value of the os property.
         * 
         * @return
         *     possible object is
         *     {@link XOSVersion }
         *     
         */
        public XOSVersion getOs() {
            return os;
        }

        /**
         * Sets the value of the os property.
         * 
         * @param value
         *     allowed object is
         *     {@link XOSVersion }
         *     
         */
        public void setOs(XOSVersion value) {
            this.os = value;
        }

    }

}
