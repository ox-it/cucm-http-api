
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServiceParameterRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceParameterRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceParameter" type="{http://www.cisco.com/AXL/API/8.0}RServiceParameter"/>
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
@XmlType(name = "GetServiceParameterRes", propOrder = {
    "_return"
})
public class GetServiceParameterRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetServiceParameterRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetServiceParameterRes.Return }
     *     
     */
    public GetServiceParameterRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServiceParameterRes.Return }
     *     
     */
    public void setReturn(GetServiceParameterRes.Return value) {
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
     *         &lt;element name="serviceParameter" type="{http://www.cisco.com/AXL/API/8.0}RServiceParameter"/>
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
        "serviceParameter"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RServiceParameter serviceParameter;

        /**
         * Gets the value of the serviceParameter property.
         * 
         * @return
         *     possible object is
         *     {@link RServiceParameter }
         *     
         */
        public RServiceParameter getServiceParameter() {
            return serviceParameter;
        }

        /**
         * Sets the value of the serviceParameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link RServiceParameter }
         *     
         */
        public void setServiceParameter(RServiceParameter value) {
            this.serviceParameter = value;
        }

    }

}
