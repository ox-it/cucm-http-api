
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMessageWaitingReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMessageWaitingReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="messageWaiting" type="{http://www.cisco.com/AXL/API/8.0}XMessageWaiting"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMessageWaitingReq", propOrder = {
    "messageWaiting"
})
public class AddMessageWaitingReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMessageWaiting messageWaiting;

    /**
     * Gets the value of the messageWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link XMessageWaiting }
     *     
     */
    public XMessageWaiting getMessageWaiting() {
        return messageWaiting;
    }

    /**
     * Sets the value of the messageWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMessageWaiting }
     *     
     */
    public void setMessageWaiting(XMessageWaiting value) {
        this.messageWaiting = value;
    }

}
