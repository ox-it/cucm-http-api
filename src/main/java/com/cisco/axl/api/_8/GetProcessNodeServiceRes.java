
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProcessNodeServiceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProcessNodeServiceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="processNodeService" type="{http://www.cisco.com/AXL/API/8.0}RProcessNodeService"/>
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
@XmlType(name = "GetProcessNodeServiceRes", propOrder = {
    "_return"
})
public class GetProcessNodeServiceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetProcessNodeServiceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetProcessNodeServiceRes.Return }
     *     
     */
    public GetProcessNodeServiceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProcessNodeServiceRes.Return }
     *     
     */
    public void setReturn(GetProcessNodeServiceRes.Return value) {
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
     *         &lt;element name="processNodeService" type="{http://www.cisco.com/AXL/API/8.0}RProcessNodeService"/>
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
        "processNodeService"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RProcessNodeService processNodeService;

        /**
         * Gets the value of the processNodeService property.
         * 
         * @return
         *     possible object is
         *     {@link RProcessNodeService }
         *     
         */
        public RProcessNodeService getProcessNodeService() {
            return processNodeService;
        }

        /**
         * Sets the value of the processNodeService property.
         * 
         * @param value
         *     allowed object is
         *     {@link RProcessNodeService }
         *     
         */
        public void setProcessNodeService(RProcessNodeService value) {
            this.processNodeService = value;
        }

    }

}
