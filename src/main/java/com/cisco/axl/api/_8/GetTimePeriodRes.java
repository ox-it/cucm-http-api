
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTimePeriodRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTimePeriodRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="timePeriod" type="{http://www.cisco.com/AXL/API/8.0}RTimePeriod"/>
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
@XmlType(name = "GetTimePeriodRes", propOrder = {
    "_return"
})
public class GetTimePeriodRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTimePeriodRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTimePeriodRes.Return }
     *     
     */
    public GetTimePeriodRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTimePeriodRes.Return }
     *     
     */
    public void setReturn(GetTimePeriodRes.Return value) {
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
     *         &lt;element name="timePeriod" type="{http://www.cisco.com/AXL/API/8.0}RTimePeriod"/>
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
        "timePeriod"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTimePeriod timePeriod;

        /**
         * Gets the value of the timePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link RTimePeriod }
         *     
         */
        public RTimePeriod getTimePeriod() {
            return timePeriod;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTimePeriod }
         *     
         */
        public void setTimePeriod(RTimePeriod value) {
            this.timePeriod = value;
        }

    }

}
