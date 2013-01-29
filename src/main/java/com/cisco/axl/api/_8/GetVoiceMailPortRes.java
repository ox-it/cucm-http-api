
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVoiceMailPortRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVoiceMailPortRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="voiceMailPort" type="{http://www.cisco.com/AXL/API/8.5}RVoiceMailPort"/>
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
@XmlType(name = "GetVoiceMailPortRes", propOrder = {
    "_return"
})
public class GetVoiceMailPortRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVoiceMailPortRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVoiceMailPortRes.Return }
     *     
     */
    public GetVoiceMailPortRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVoiceMailPortRes.Return }
     *     
     */
    public void setReturn(GetVoiceMailPortRes.Return value) {
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
     *         &lt;element name="voiceMailPort" type="{http://www.cisco.com/AXL/API/8.5}RVoiceMailPort"/>
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
        "voiceMailPort"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVoiceMailPort voiceMailPort;

        /**
         * Gets the value of the voiceMailPort property.
         * 
         * @return
         *     possible object is
         *     {@link RVoiceMailPort }
         *     
         */
        public RVoiceMailPort getVoiceMailPort() {
            return voiceMailPort;
        }

        /**
         * Sets the value of the voiceMailPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVoiceMailPort }
         *     
         */
        public void setVoiceMailPort(RVoiceMailPort value) {
            this.voiceMailPort = value;
        }

    }

}
