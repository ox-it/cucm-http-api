
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XFeatureControlConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XFeatureControlConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="featureName" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="overrideDefault" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="enableSetting" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XFeatureControlConfig", propOrder = {
    "featureName",
    "overrideDefault",
    "enableSetting"
})
public class XFeatureControlConfig {

    protected String featureName;
    protected String overrideDefault;
    protected String enableSetting;

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the overrideDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideDefault() {
        return overrideDefault;
    }

    /**
     * Sets the value of the overrideDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideDefault(String value) {
        this.overrideDefault = value;
    }

    /**
     * Gets the value of the enableSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableSetting() {
        return enableSetting;
    }

    /**
     * Sets the value of the enableSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableSetting(String value) {
        this.enableSetting = value;
    }

}
