
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAppUserReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAppUserReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="appUser" type="{http://www.cisco.com/AXL/API/8.0}XAppUser"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAppUserReq", propOrder = {
    "appUser"
})
public class AddAppUserReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAppUser appUser;

    /**
     * Gets the value of the appUser property.
     * 
     * @return
     *     possible object is
     *     {@link XAppUser }
     *     
     */
    public XAppUser getAppUser() {
        return appUser;
    }

    /**
     * Sets the value of the appUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAppUser }
     *     
     */
    public void setAppUser(XAppUser value) {
        this.appUser = value;
    }

}
