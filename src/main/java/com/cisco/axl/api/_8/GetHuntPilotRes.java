
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHuntPilotRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHuntPilotRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="huntPilot" type="{http://www.cisco.com/AXL/API/8.5}RHuntPilot"/>
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
@XmlType(name = "GetHuntPilotRes", propOrder = {
    "_return"
})
public class GetHuntPilotRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetHuntPilotRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetHuntPilotRes.Return }
     *     
     */
    public GetHuntPilotRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHuntPilotRes.Return }
     *     
     */
    public void setReturn(GetHuntPilotRes.Return value) {
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
     *         &lt;element name="huntPilot" type="{http://www.cisco.com/AXL/API/8.5}RHuntPilot"/>
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
        "huntPilot"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RHuntPilot huntPilot;

        /**
         * Gets the value of the huntPilot property.
         * 
         * @return
         *     possible object is
         *     {@link RHuntPilot }
         *     
         */
        public RHuntPilot getHuntPilot() {
            return huntPilot;
        }

        /**
         * Sets the value of the huntPilot property.
         * 
         * @param value
         *     allowed object is
         *     {@link RHuntPilot }
         *     
         */
        public void setHuntPilot(RHuntPilot value) {
            this.huntPilot = value;
        }

    }

}
