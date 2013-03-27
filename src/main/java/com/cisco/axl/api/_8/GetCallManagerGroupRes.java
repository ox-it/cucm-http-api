
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallManagerGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallManagerGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callManagerGroup" type="{http://www.cisco.com/AXL/API/8.0}RCallManagerGroup"/>
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
@XmlType(name = "GetCallManagerGroupRes", propOrder = {
    "_return"
})
public class GetCallManagerGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallManagerGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallManagerGroupRes.Return }
     *     
     */
    public GetCallManagerGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallManagerGroupRes.Return }
     *     
     */
    public void setReturn(GetCallManagerGroupRes.Return value) {
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
     *         &lt;element name="callManagerGroup" type="{http://www.cisco.com/AXL/API/8.0}RCallManagerGroup"/>
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
        "callManagerGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallManagerGroup callManagerGroup;

        /**
         * Gets the value of the callManagerGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RCallManagerGroup }
         *     
         */
        public RCallManagerGroup getCallManagerGroup() {
            return callManagerGroup;
        }

        /**
         * Sets the value of the callManagerGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallManagerGroup }
         *     
         */
        public void setCallManagerGroup(RCallManagerGroup value) {
            this.callManagerGroup = value;
        }

    }

}
