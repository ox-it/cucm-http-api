
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="imeServer" type="{http://www.cisco.com/AXL/API/8.5}XImeServer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeServerReq", propOrder = {
    "imeServer"
})
public class AddImeServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeServer imeServer;

    /**
     * Gets the value of the imeServer property.
     * 
     * @return
     *     possible object is
     *     {@link XImeServer }
     *     
     */
    public XImeServer getImeServer() {
        return imeServer;
    }

    /**
     * Sets the value of the imeServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeServer }
     *     
     */
    public void setImeServer(XImeServer value) {
        this.imeServer = value;
    }

}
