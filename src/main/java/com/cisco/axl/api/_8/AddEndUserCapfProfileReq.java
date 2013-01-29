
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddEndUserCapfProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddEndUserCapfProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="endUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.5}XEndUserCapfProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddEndUserCapfProfileReq", propOrder = {
    "endUserCapfProfile"
})
public class AddEndUserCapfProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XEndUserCapfProfile endUserCapfProfile;

    /**
     * Gets the value of the endUserCapfProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XEndUserCapfProfile }
     *     
     */
    public XEndUserCapfProfile getEndUserCapfProfile() {
        return endUserCapfProfile;
    }

    /**
     * Sets the value of the endUserCapfProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEndUserCapfProfile }
     *     
     */
    public void setEndUserCapfProfile(XEndUserCapfProfile value) {
        this.endUserCapfProfile = value;
    }

}
