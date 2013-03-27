
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRecordingProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRecordingProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="recordingProfile" type="{http://www.cisco.com/AXL/API/8.0}XRecordingProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRecordingProfileReq", propOrder = {
    "recordingProfile"
})
public class AddRecordingProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRecordingProfile recordingProfile;

    /**
     * Gets the value of the recordingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XRecordingProfile }
     *     
     */
    public XRecordingProfile getRecordingProfile() {
        return recordingProfile;
    }

    /**
     * Sets the value of the recordingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRecordingProfile }
     *     
     */
    public void setRecordingProfile(XRecordingProfile value) {
        this.recordingProfile = value;
    }

}
