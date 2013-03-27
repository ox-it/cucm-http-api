
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMohServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMohServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="mohServer" type="{http://www.cisco.com/AXL/API/8.0}XMohServer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMohServerReq", propOrder = {
    "mohServer"
})
public class AddMohServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMohServer mohServer;

    /**
     * Gets the value of the mohServer property.
     * 
     * @return
     *     possible object is
     *     {@link XMohServer }
     *     
     */
    public XMohServer getMohServer() {
        return mohServer;
    }

    /**
     * Sets the value of the mohServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMohServer }
     *     
     */
    public void setMohServer(XMohServer value) {
        this.mohServer = value;
    }

}
