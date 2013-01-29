
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipTrunkRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipTrunkRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sipTrunk" type="{http://www.cisco.com/AXL/API/8.5}RSipTrunk"/>
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
@XmlType(name = "GetSipTrunkRes", propOrder = {
    "_return"
})
public class GetSipTrunkRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipTrunkRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipTrunkRes.Return }
     *     
     */
    public GetSipTrunkRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipTrunkRes.Return }
     *     
     */
    public void setReturn(GetSipTrunkRes.Return value) {
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
     *         &lt;element name="sipTrunk" type="{http://www.cisco.com/AXL/API/8.5}RSipTrunk"/>
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
        "sipTrunk"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipTrunk sipTrunk;

        /**
         * Gets the value of the sipTrunk property.
         * 
         * @return
         *     possible object is
         *     {@link RSipTrunk }
         *     
         */
        public RSipTrunk getSipTrunk() {
            return sipTrunk;
        }

        /**
         * Sets the value of the sipTrunk property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipTrunk }
         *     
         */
        public void setSipTrunk(RSipTrunk value) {
            this.sipTrunk = value;
        }

    }

}
