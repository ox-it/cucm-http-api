
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCumaServerSecurityProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCumaServerSecurityProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="cumaServerSecurityProfile" type="{http://www.cisco.com/AXL/API/8.5}XCumaServerSecurityProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCumaServerSecurityProfileReq", propOrder = {
    "cumaServerSecurityProfile"
})
public class AddCumaServerSecurityProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCumaServerSecurityProfile cumaServerSecurityProfile;

    /**
     * Gets the value of the cumaServerSecurityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XCumaServerSecurityProfile }
     *     
     */
    public XCumaServerSecurityProfile getCumaServerSecurityProfile() {
        return cumaServerSecurityProfile;
    }

    /**
     * Sets the value of the cumaServerSecurityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCumaServerSecurityProfile }
     *     
     */
    public void setCumaServerSecurityProfile(XCumaServerSecurityProfile value) {
        this.cumaServerSecurityProfile = value;
    }

}
