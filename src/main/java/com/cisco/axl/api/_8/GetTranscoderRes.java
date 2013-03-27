
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTranscoderRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTranscoderRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transcoder" type="{http://www.cisco.com/AXL/API/8.0}RTranscoder"/>
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
@XmlType(name = "GetTranscoderRes", propOrder = {
    "_return"
})
public class GetTranscoderRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTranscoderRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTranscoderRes.Return }
     *     
     */
    public GetTranscoderRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTranscoderRes.Return }
     *     
     */
    public void setReturn(GetTranscoderRes.Return value) {
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
     *         &lt;element name="transcoder" type="{http://www.cisco.com/AXL/API/8.0}RTranscoder"/>
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
        "transcoder"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTranscoder transcoder;

        /**
         * Gets the value of the transcoder property.
         * 
         * @return
         *     possible object is
         *     {@link RTranscoder }
         *     
         */
        public RTranscoder getTranscoder() {
            return transcoder;
        }

        /**
         * Sets the value of the transcoder property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTranscoder }
         *     
         */
        public void setTranscoder(RTranscoder value) {
            this.transcoder = value;
        }

    }

}
