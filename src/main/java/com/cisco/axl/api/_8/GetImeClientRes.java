
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeClientRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeClientRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imeClient" type="{http://www.cisco.com/AXL/API/8.5}RImeClient"/>
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
@XmlType(name = "GetImeClientRes", propOrder = {
    "_return"
})
public class GetImeClientRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeClientRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeClientRes.Return }
     *     
     */
    public GetImeClientRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeClientRes.Return }
     *     
     */
    public void setReturn(GetImeClientRes.Return value) {
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
     *         &lt;element name="imeClient" type="{http://www.cisco.com/AXL/API/8.5}RImeClient"/>
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
        "imeClient"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeClient imeClient;

        /**
         * Gets the value of the imeClient property.
         * 
         * @return
         *     possible object is
         *     {@link RImeClient }
         *     
         */
        public RImeClient getImeClient() {
            return imeClient;
        }

        /**
         * Sets the value of the imeClient property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeClient }
         *     
         */
        public void setImeClient(RImeClient value) {
            this.imeClient = value;
        }

    }

}
