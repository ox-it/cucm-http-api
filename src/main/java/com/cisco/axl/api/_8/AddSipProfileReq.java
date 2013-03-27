
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sipProfile" type="{http://www.cisco.com/AXL/API/8.0}XSipProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipProfileReq", propOrder = {
    "sipProfile"
})
public class AddSipProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipProfile sipProfile;

    /**
     * Gets the value of the sipProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XSipProfile }
     *     
     */
    public XSipProfile getSipProfile() {
        return sipProfile;
    }

    /**
     * Sets the value of the sipProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipProfile }
     *     
     */
    public void setSipProfile(XSipProfile value) {
        this.sipProfile = value;
    }

}
