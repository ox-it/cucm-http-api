
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddHuntPilotReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddHuntPilotReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="huntPilot" type="{http://www.cisco.com/AXL/API/8.5}XHuntPilot"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddHuntPilotReq", propOrder = {
    "huntPilot"
})
public class AddHuntPilotReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XHuntPilot huntPilot;

    /**
     * Gets the value of the huntPilot property.
     * 
     * @return
     *     possible object is
     *     {@link XHuntPilot }
     *     
     */
    public XHuntPilot getHuntPilot() {
        return huntPilot;
    }

    /**
     * Sets the value of the huntPilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHuntPilot }
     *     
     */
    public void setHuntPilot(XHuntPilot value) {
        this.huntPilot = value;
    }

}
