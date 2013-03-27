
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeRouteFilterGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeRouteFilterGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imeRouteFilterGroup" type="{http://www.cisco.com/AXL/API/8.0}RImeRouteFilterGroup"/>
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
@XmlType(name = "GetImeRouteFilterGroupRes", propOrder = {
    "_return"
})
public class GetImeRouteFilterGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeRouteFilterGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeRouteFilterGroupRes.Return }
     *     
     */
    public GetImeRouteFilterGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeRouteFilterGroupRes.Return }
     *     
     */
    public void setReturn(GetImeRouteFilterGroupRes.Return value) {
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
     *         &lt;element name="imeRouteFilterGroup" type="{http://www.cisco.com/AXL/API/8.0}RImeRouteFilterGroup"/>
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
        "imeRouteFilterGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeRouteFilterGroup imeRouteFilterGroup;

        /**
         * Gets the value of the imeRouteFilterGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RImeRouteFilterGroup }
         *     
         */
        public RImeRouteFilterGroup getImeRouteFilterGroup() {
            return imeRouteFilterGroup;
        }

        /**
         * Sets the value of the imeRouteFilterGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeRouteFilterGroup }
         *     
         */
        public void setImeRouteFilterGroup(RImeRouteFilterGroup value) {
            this.imeRouteFilterGroup = value;
        }

    }

}
