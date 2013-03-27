
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallParkRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallParkRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callPark" type="{http://www.cisco.com/AXL/API/8.0}RCallPark"/>
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
@XmlType(name = "GetCallParkRes", propOrder = {
    "_return"
})
public class GetCallParkRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallParkRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallParkRes.Return }
     *     
     */
    public GetCallParkRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallParkRes.Return }
     *     
     */
    public void setReturn(GetCallParkRes.Return value) {
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
     *         &lt;element name="callPark" type="{http://www.cisco.com/AXL/API/8.0}RCallPark"/>
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
        "callPark"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallPark callPark;

        /**
         * Gets the value of the callPark property.
         * 
         * @return
         *     possible object is
         *     {@link RCallPark }
         *     
         */
        public RCallPark getCallPark() {
            return callPark;
        }

        /**
         * Sets the value of the callPark property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallPark }
         *     
         */
        public void setCallPark(RCallPark value) {
            this.callPark = value;
        }

    }

}
