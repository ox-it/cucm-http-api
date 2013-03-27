
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddExternalCallControlProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddExternalCallControlProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/8.0}XExternalCallControlProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddExternalCallControlProfileReq", propOrder = {
    "externalCallControlProfile"
})
public class AddExternalCallControlProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XExternalCallControlProfile externalCallControlProfile;

    /**
     * Gets the value of the externalCallControlProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XExternalCallControlProfile }
     *     
     */
    public XExternalCallControlProfile getExternalCallControlProfile() {
        return externalCallControlProfile;
    }

    /**
     * Sets the value of the externalCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XExternalCallControlProfile }
     *     
     */
    public void setExternalCallControlProfile(XExternalCallControlProfile value) {
        this.externalCallControlProfile = value;
    }

}
