
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddFixedMohAudioSourceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFixedMohAudioSourceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="fixedMohAudioSource" type="{http://www.cisco.com/AXL/API/8.5}XFixedMohAudioSource"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFixedMohAudioSourceReq", propOrder = {
    "fixedMohAudioSource"
})
public class AddFixedMohAudioSourceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XFixedMohAudioSource fixedMohAudioSource;

    /**
     * Gets the value of the fixedMohAudioSource property.
     * 
     * @return
     *     possible object is
     *     {@link XFixedMohAudioSource }
     *     
     */
    public XFixedMohAudioSource getFixedMohAudioSource() {
        return fixedMohAudioSource;
    }

    /**
     * Sets the value of the fixedMohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFixedMohAudioSource }
     *     
     */
    public void setFixedMohAudioSource(XFixedMohAudioSource value) {
        this.fixedMohAudioSource = value;
    }

}
