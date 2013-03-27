
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddApplicationUserCapfProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddApplicationUserCapfProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="applicationUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.0}XApplicationUserCapfProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddApplicationUserCapfProfileReq", propOrder = {
    "applicationUserCapfProfile"
})
public class AddApplicationUserCapfProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XApplicationUserCapfProfile applicationUserCapfProfile;

    /**
     * Gets the value of the applicationUserCapfProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XApplicationUserCapfProfile }
     *     
     */
    public XApplicationUserCapfProfile getApplicationUserCapfProfile() {
        return applicationUserCapfProfile;
    }

    /**
     * Sets the value of the applicationUserCapfProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XApplicationUserCapfProfile }
     *     
     */
    public void setApplicationUserCapfProfile(XApplicationUserCapfProfile value) {
        this.applicationUserCapfProfile = value;
    }

}
