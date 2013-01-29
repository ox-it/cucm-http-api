
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipTrunkReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipTrunkReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sipTrunk" type="{http://www.cisco.com/AXL/API/8.5}XSipTrunk"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipTrunkReq", propOrder = {
    "sipTrunk"
})
public class AddSipTrunkReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipTrunk sipTrunk;

    /**
     * Gets the value of the sipTrunk property.
     * 
     * @return
     *     possible object is
     *     {@link XSipTrunk }
     *     
     */
    public XSipTrunk getSipTrunk() {
        return sipTrunk;
    }

    /**
     * Sets the value of the sipTrunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipTrunk }
     *     
     */
    public void setSipTrunk(XSipTrunk value) {
        this.sipTrunk = value;
    }

}
