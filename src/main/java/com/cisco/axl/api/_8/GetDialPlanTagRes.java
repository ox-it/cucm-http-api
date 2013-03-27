
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDialPlanTagRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDialPlanTagRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dialPlanTag" type="{http://www.cisco.com/AXL/API/8.0}RDialPlanTag"/>
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
@XmlType(name = "GetDialPlanTagRes", propOrder = {
    "_return"
})
public class GetDialPlanTagRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDialPlanTagRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDialPlanTagRes.Return }
     *     
     */
    public GetDialPlanTagRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDialPlanTagRes.Return }
     *     
     */
    public void setReturn(GetDialPlanTagRes.Return value) {
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
     *         &lt;element name="dialPlanTag" type="{http://www.cisco.com/AXL/API/8.0}RDialPlanTag"/>
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
        "dialPlanTag"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDialPlanTag dialPlanTag;

        /**
         * Gets the value of the dialPlanTag property.
         * 
         * @return
         *     possible object is
         *     {@link RDialPlanTag }
         *     
         */
        public RDialPlanTag getDialPlanTag() {
            return dialPlanTag;
        }

        /**
         * Sets the value of the dialPlanTag property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDialPlanTag }
         *     
         */
        public void setDialPlanTag(RDialPlanTag value) {
            this.dialPlanTag = value;
        }

    }

}
