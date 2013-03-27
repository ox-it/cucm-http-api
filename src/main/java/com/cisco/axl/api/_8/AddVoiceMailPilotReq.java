
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVoiceMailPilotReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVoiceMailPilotReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="voiceMailPilot" type="{http://www.cisco.com/AXL/API/8.0}XVoiceMailPilot"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVoiceMailPilotReq", propOrder = {
    "voiceMailPilot"
})
public class AddVoiceMailPilotReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVoiceMailPilot voiceMailPilot;

    /**
     * Gets the value of the voiceMailPilot property.
     * 
     * @return
     *     possible object is
     *     {@link XVoiceMailPilot }
     *     
     */
    public XVoiceMailPilot getVoiceMailPilot() {
        return voiceMailPilot;
    }

    /**
     * Sets the value of the voiceMailPilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVoiceMailPilot }
     *     
     */
    public void setVoiceMailPilot(XVoiceMailPilot value) {
        this.voiceMailPilot = value;
    }

}
