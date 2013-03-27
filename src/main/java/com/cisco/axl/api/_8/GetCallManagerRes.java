
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallManagerRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallManagerRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callManager" type="{http://www.cisco.com/AXL/API/8.0}RCallManager"/>
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
@XmlType(name = "GetCallManagerRes", propOrder = {
    "_return"
})
public class GetCallManagerRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallManagerRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallManagerRes.Return }
     *     
     */
    public GetCallManagerRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallManagerRes.Return }
     *     
     */
    public void setReturn(GetCallManagerRes.Return value) {
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
     *         &lt;element name="callManager" type="{http://www.cisco.com/AXL/API/8.0}RCallManager"/>
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
        "callManager"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallManager callManager;

        /**
         * Gets the value of the callManager property.
         * 
         * @return
         *     possible object is
         *     {@link RCallManager }
         *     
         */
        public RCallManager getCallManager() {
            return callManager;
        }

        /**
         * Sets the value of the callManager property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallManager }
         *     
         */
        public void setCallManager(RCallManager value) {
            this.callManager = value;
        }

    }

}
