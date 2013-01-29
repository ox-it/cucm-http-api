
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTransformationProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTransformationProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="transformationProfile" type="{http://www.cisco.com/AXL/API/8.5}XTransformationProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTransformationProfileReq", propOrder = {
    "transformationProfile"
})
public class AddTransformationProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTransformationProfile transformationProfile;

    /**
     * Gets the value of the transformationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XTransformationProfile }
     *     
     */
    public XTransformationProfile getTransformationProfile() {
        return transformationProfile;
    }

    /**
     * Sets the value of the transformationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTransformationProfile }
     *     
     */
    public void setTransformationProfile(XTransformationProfile value) {
        this.transformationProfile = value;
    }

}
