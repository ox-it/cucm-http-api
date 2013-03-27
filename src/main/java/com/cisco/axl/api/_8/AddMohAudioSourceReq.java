
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMohAudioSourceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMohAudioSourceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="mohAudioSource" type="{http://www.cisco.com/AXL/API/8.0}XMohAudioSource"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMohAudioSourceReq", propOrder = {
    "mohAudioSource"
})
public class AddMohAudioSourceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMohAudioSource mohAudioSource;

    /**
     * Gets the value of the mohAudioSource property.
     * 
     * @return
     *     possible object is
     *     {@link XMohAudioSource }
     *     
     */
    public XMohAudioSource getMohAudioSource() {
        return mohAudioSource;
    }

    /**
     * Sets the value of the mohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMohAudioSource }
     *     
     */
    public void setMohAudioSource(XMohAudioSource value) {
        this.mohAudioSource = value;
    }

}
