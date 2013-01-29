
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDialPlanRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDialPlanRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dialPlan" type="{http://www.cisco.com/AXL/API/8.5}RDialPlan"/>
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
@XmlType(name = "GetDialPlanRes", propOrder = {
    "_return"
})
public class GetDialPlanRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDialPlanRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDialPlanRes.Return }
     *     
     */
    public GetDialPlanRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDialPlanRes.Return }
     *     
     */
    public void setReturn(GetDialPlanRes.Return value) {
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
     *         &lt;element name="dialPlan" type="{http://www.cisco.com/AXL/API/8.5}RDialPlan"/>
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
        "dialPlan"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDialPlan dialPlan;

        /**
         * Gets the value of the dialPlan property.
         * 
         * @return
         *     possible object is
         *     {@link RDialPlan }
         *     
         */
        public RDialPlan getDialPlan() {
            return dialPlan;
        }

        /**
         * Sets the value of the dialPlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDialPlan }
         *     
         */
        public void setDialPlan(RDialPlan value) {
            this.dialPlan = value;
        }

    }

}
