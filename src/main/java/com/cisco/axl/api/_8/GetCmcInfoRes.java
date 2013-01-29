
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCmcInfoRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCmcInfoRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cmcInfo" type="{http://www.cisco.com/AXL/API/8.5}RCmcInfo"/>
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
@XmlType(name = "GetCmcInfoRes", propOrder = {
    "_return"
})
public class GetCmcInfoRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCmcInfoRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCmcInfoRes.Return }
     *     
     */
    public GetCmcInfoRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCmcInfoRes.Return }
     *     
     */
    public void setReturn(GetCmcInfoRes.Return value) {
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
     *         &lt;element name="cmcInfo" type="{http://www.cisco.com/AXL/API/8.5}RCmcInfo"/>
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
        "cmcInfo"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCmcInfo cmcInfo;

        /**
         * Gets the value of the cmcInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RCmcInfo }
         *     
         */
        public RCmcInfo getCmcInfo() {
            return cmcInfo;
        }

        /**
         * Sets the value of the cmcInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCmcInfo }
         *     
         */
        public void setCmcInfo(RCmcInfo value) {
            this.cmcInfo = value;
        }

    }

}
