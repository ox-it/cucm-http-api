
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVoiceMailPilotRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVoiceMailPilotRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="voiceMailPilot" type="{http://www.cisco.com/AXL/API/8.5}RVoiceMailPilot"/>
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
@XmlType(name = "GetVoiceMailPilotRes", propOrder = {
    "_return"
})
public class GetVoiceMailPilotRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVoiceMailPilotRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVoiceMailPilotRes.Return }
     *     
     */
    public GetVoiceMailPilotRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVoiceMailPilotRes.Return }
     *     
     */
    public void setReturn(GetVoiceMailPilotRes.Return value) {
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
     *         &lt;element name="voiceMailPilot" type="{http://www.cisco.com/AXL/API/8.5}RVoiceMailPilot"/>
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
        "voiceMailPilot"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVoiceMailPilot voiceMailPilot;

        /**
         * Gets the value of the voiceMailPilot property.
         * 
         * @return
         *     possible object is
         *     {@link RVoiceMailPilot }
         *     
         */
        public RVoiceMailPilot getVoiceMailPilot() {
            return voiceMailPilot;
        }

        /**
         * Sets the value of the voiceMailPilot property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVoiceMailPilot }
         *     
         */
        public void setVoiceMailPilot(RVoiceMailPilot value) {
            this.voiceMailPilot = value;
        }

    }

}
