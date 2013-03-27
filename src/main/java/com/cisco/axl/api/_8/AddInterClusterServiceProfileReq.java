
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddInterClusterServiceProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddInterClusterServiceProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="interClusterServiceProfile" type="{http://www.cisco.com/AXL/API/8.0}XInterClusterServiceProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddInterClusterServiceProfileReq", propOrder = {
    "interClusterServiceProfile"
})
public class AddInterClusterServiceProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XInterClusterServiceProfile interClusterServiceProfile;

    /**
     * Gets the value of the interClusterServiceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XInterClusterServiceProfile }
     *     
     */
    public XInterClusterServiceProfile getInterClusterServiceProfile() {
        return interClusterServiceProfile;
    }

    /**
     * Sets the value of the interClusterServiceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XInterClusterServiceProfile }
     *     
     */
    public void setInterClusterServiceProfile(XInterClusterServiceProfile value) {
        this.interClusterServiceProfile = value;
    }

}
