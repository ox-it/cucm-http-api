
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallPickupGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallPickupGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callPickupGroup" type="{http://www.cisco.com/AXL/API/8.0}RCallPickupGroup"/>
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
@XmlType(name = "GetCallPickupGroupRes", propOrder = {
    "_return"
})
public class GetCallPickupGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallPickupGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallPickupGroupRes.Return }
     *     
     */
    public GetCallPickupGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallPickupGroupRes.Return }
     *     
     */
    public void setReturn(GetCallPickupGroupRes.Return value) {
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
     *         &lt;element name="callPickupGroup" type="{http://www.cisco.com/AXL/API/8.0}RCallPickupGroup"/>
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
        "callPickupGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallPickupGroup callPickupGroup;

        /**
         * Gets the value of the callPickupGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RCallPickupGroup }
         *     
         */
        public RCallPickupGroup getCallPickupGroup() {
            return callPickupGroup;
        }

        /**
         * Sets the value of the callPickupGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallPickupGroup }
         *     
         */
        public void setCallPickupGroup(RCallPickupGroup value) {
            this.callPickupGroup = value;
        }

    }

}
