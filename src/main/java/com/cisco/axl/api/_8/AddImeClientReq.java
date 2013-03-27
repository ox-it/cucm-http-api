
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeClientReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeClientReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="imeClient" type="{http://www.cisco.com/AXL/API/8.0}XImeClient"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeClientReq", propOrder = {
    "imeClient"
})
public class AddImeClientReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeClient imeClient;

    /**
     * Gets the value of the imeClient property.
     * 
     * @return
     *     possible object is
     *     {@link XImeClient }
     *     
     */
    public XImeClient getImeClient() {
        return imeClient;
    }

    /**
     * Sets the value of the imeClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeClient }
     *     
     */
    public void setImeClient(XImeClient value) {
        this.imeClient = value;
    }

}
