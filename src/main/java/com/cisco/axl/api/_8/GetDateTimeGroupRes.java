
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDateTimeGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDateTimeGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dateTimeGroup" type="{http://www.cisco.com/AXL/API/8.5}RDateTimeGroup"/>
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
@XmlType(name = "GetDateTimeGroupRes", propOrder = {
    "_return"
})
public class GetDateTimeGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDateTimeGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDateTimeGroupRes.Return }
     *     
     */
    public GetDateTimeGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDateTimeGroupRes.Return }
     *     
     */
    public void setReturn(GetDateTimeGroupRes.Return value) {
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
     *         &lt;element name="dateTimeGroup" type="{http://www.cisco.com/AXL/API/8.5}RDateTimeGroup"/>
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
        "dateTimeGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDateTimeGroup dateTimeGroup;

        /**
         * Gets the value of the dateTimeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RDateTimeGroup }
         *     
         */
        public RDateTimeGroup getDateTimeGroup() {
            return dateTimeGroup;
        }

        /**
         * Sets the value of the dateTimeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDateTimeGroup }
         *     
         */
        public void setDateTimeGroup(RDateTimeGroup value) {
            this.dateTimeGroup = value;
        }

    }

}
