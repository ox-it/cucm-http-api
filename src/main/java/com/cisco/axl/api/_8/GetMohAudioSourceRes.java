
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMohAudioSourceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMohAudioSourceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mohAudioSource" type="{http://www.cisco.com/AXL/API/8.0}RMohAudioSource"/>
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
@XmlType(name = "GetMohAudioSourceRes", propOrder = {
    "_return"
})
public class GetMohAudioSourceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMohAudioSourceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMohAudioSourceRes.Return }
     *     
     */
    public GetMohAudioSourceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMohAudioSourceRes.Return }
     *     
     */
    public void setReturn(GetMohAudioSourceRes.Return value) {
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
     *         &lt;element name="mohAudioSource" type="{http://www.cisco.com/AXL/API/8.0}RMohAudioSource"/>
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
        "mohAudioSource"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMohAudioSource mohAudioSource;

        /**
         * Gets the value of the mohAudioSource property.
         * 
         * @return
         *     possible object is
         *     {@link RMohAudioSource }
         *     
         */
        public RMohAudioSource getMohAudioSource() {
            return mohAudioSource;
        }

        /**
         * Sets the value of the mohAudioSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMohAudioSource }
         *     
         */
        public void setMohAudioSource(RMohAudioSource value) {
            this.mohAudioSource = value;
        }

    }

}
