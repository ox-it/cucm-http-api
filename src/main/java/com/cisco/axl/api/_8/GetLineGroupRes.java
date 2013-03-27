
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLineGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLineGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lineGroup" type="{http://www.cisco.com/AXL/API/8.0}RLineGroup"/>
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
@XmlType(name = "GetLineGroupRes", propOrder = {
    "_return"
})
public class GetLineGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLineGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLineGroupRes.Return }
     *     
     */
    public GetLineGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLineGroupRes.Return }
     *     
     */
    public void setReturn(GetLineGroupRes.Return value) {
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
     *         &lt;element name="lineGroup" type="{http://www.cisco.com/AXL/API/8.0}RLineGroup"/>
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
        "lineGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLineGroup lineGroup;

        /**
         * Gets the value of the lineGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RLineGroup }
         *     
         */
        public RLineGroup getLineGroup() {
            return lineGroup;
        }

        /**
         * Sets the value of the lineGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLineGroup }
         *     
         */
        public void setLineGroup(RLineGroup value) {
            this.lineGroup = value;
        }

    }

}
