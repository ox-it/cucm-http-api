
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRemoteDestinationProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRemoteDestinationProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="remoteDestinationProfile" type="{http://www.cisco.com/AXL/API/8.5}XRemoteDestinationProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRemoteDestinationProfileReq", propOrder = {
    "remoteDestinationProfile"
})
public class AddRemoteDestinationProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRemoteDestinationProfile remoteDestinationProfile;

    /**
     * Gets the value of the remoteDestinationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteDestinationProfile }
     *     
     */
    public XRemoteDestinationProfile getRemoteDestinationProfile() {
        return remoteDestinationProfile;
    }

    /**
     * Sets the value of the remoteDestinationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteDestinationProfile }
     *     
     */
    public void setRemoteDestinationProfile(XRemoteDestinationProfile value) {
        this.remoteDestinationProfile = value;
    }

}
