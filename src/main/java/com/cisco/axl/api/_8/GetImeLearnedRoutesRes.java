
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeLearnedRoutesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeLearnedRoutesRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imeLearnedRoutes" type="{http://www.cisco.com/AXL/API/8.5}RImeLearnedRoutes"/>
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
@XmlType(name = "GetImeLearnedRoutesRes", propOrder = {
    "_return"
})
public class GetImeLearnedRoutesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeLearnedRoutesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeLearnedRoutesRes.Return }
     *     
     */
    public GetImeLearnedRoutesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeLearnedRoutesRes.Return }
     *     
     */
    public void setReturn(GetImeLearnedRoutesRes.Return value) {
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
     *         &lt;element name="imeLearnedRoutes" type="{http://www.cisco.com/AXL/API/8.5}RImeLearnedRoutes"/>
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
        "imeLearnedRoutes"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeLearnedRoutes imeLearnedRoutes;

        /**
         * Gets the value of the imeLearnedRoutes property.
         * 
         * @return
         *     possible object is
         *     {@link RImeLearnedRoutes }
         *     
         */
        public RImeLearnedRoutes getImeLearnedRoutes() {
            return imeLearnedRoutes;
        }

        /**
         * Sets the value of the imeLearnedRoutes property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeLearnedRoutes }
         *     
         */
        public void setImeLearnedRoutes(RImeLearnedRoutes value) {
            this.imeLearnedRoutes = value;
        }

    }

}
