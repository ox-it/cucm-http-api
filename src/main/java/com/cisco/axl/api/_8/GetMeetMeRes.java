
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMeetMeRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMeetMeRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="meetMe" type="{http://www.cisco.com/AXL/API/8.0}RMeetMe"/>
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
@XmlType(name = "GetMeetMeRes", propOrder = {
    "_return"
})
public class GetMeetMeRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMeetMeRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMeetMeRes.Return }
     *     
     */
    public GetMeetMeRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMeetMeRes.Return }
     *     
     */
    public void setReturn(GetMeetMeRes.Return value) {
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
     *         &lt;element name="meetMe" type="{http://www.cisco.com/AXL/API/8.0}RMeetMe"/>
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
        "meetMe"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMeetMe meetMe;

        /**
         * Gets the value of the meetMe property.
         * 
         * @return
         *     possible object is
         *     {@link RMeetMe }
         *     
         */
        public RMeetMe getMeetMe() {
            return meetMe;
        }

        /**
         * Sets the value of the meetMe property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMeetMe }
         *     
         */
        public void setMeetMe(RMeetMe value) {
            this.meetMe = value;
        }

    }

}
