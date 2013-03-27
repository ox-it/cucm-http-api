
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRecordingProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecordingProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="recordingProfile" type="{http://www.cisco.com/AXL/API/8.0}RRecordingProfile"/>
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
@XmlType(name = "GetRecordingProfileRes", propOrder = {
    "_return"
})
public class GetRecordingProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRecordingProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRecordingProfileRes.Return }
     *     
     */
    public GetRecordingProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecordingProfileRes.Return }
     *     
     */
    public void setReturn(GetRecordingProfileRes.Return value) {
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
     *         &lt;element name="recordingProfile" type="{http://www.cisco.com/AXL/API/8.0}RRecordingProfile"/>
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
        "recordingProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRecordingProfile recordingProfile;

        /**
         * Gets the value of the recordingProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RRecordingProfile }
         *     
         */
        public RRecordingProfile getRecordingProfile() {
            return recordingProfile;
        }

        /**
         * Sets the value of the recordingProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRecordingProfile }
         *     
         */
        public void setRecordingProfile(RRecordingProfile value) {
            this.recordingProfile = value;
        }

    }

}
