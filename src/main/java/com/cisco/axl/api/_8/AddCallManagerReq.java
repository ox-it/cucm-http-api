
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCallManagerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCallManagerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="callManager" type="{http://www.cisco.com/AXL/API/8.0}XCallManager"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCallManagerReq", propOrder = {
    "callManager"
})
public class AddCallManagerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCallManager callManager;

    /**
     * Gets the value of the callManager property.
     * 
     * @return
     *     possible object is
     *     {@link XCallManager }
     *     
     */
    public XCallManager getCallManager() {
        return callManager;
    }

    /**
     * Sets the value of the callManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallManager }
     *     
     */
    public void setCallManager(XCallManager value) {
        this.callManager = value;
    }

}
