
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSafForwarderRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSafForwarderRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="safForwarder" type="{http://www.cisco.com/AXL/API/8.5}RSafForwarder"/>
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
@XmlType(name = "GetSafForwarderRes", propOrder = {
    "_return"
})
public class GetSafForwarderRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSafForwarderRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSafForwarderRes.Return }
     *     
     */
    public GetSafForwarderRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSafForwarderRes.Return }
     *     
     */
    public void setReturn(GetSafForwarderRes.Return value) {
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
     *         &lt;element name="safForwarder" type="{http://www.cisco.com/AXL/API/8.5}RSafForwarder"/>
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
        "safForwarder"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSafForwarder safForwarder;

        /**
         * Gets the value of the safForwarder property.
         * 
         * @return
         *     possible object is
         *     {@link RSafForwarder }
         *     
         */
        public RSafForwarder getSafForwarder() {
            return safForwarder;
        }

        /**
         * Sets the value of the safForwarder property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSafForwarder }
         *     
         */
        public void setSafForwarder(RSafForwarder value) {
            this.safForwarder = value;
        }

    }

}
