
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddEmccFeatureConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddEmccFeatureConfigReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="emccFeatureConfig" type="{http://www.cisco.com/AXL/API/8.0}XEmccFeatureConfig"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddEmccFeatureConfigReq", propOrder = {
    "emccFeatureConfig"
})
public class AddEmccFeatureConfigReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XEmccFeatureConfig emccFeatureConfig;

    /**
     * Gets the value of the emccFeatureConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XEmccFeatureConfig }
     *     
     */
    public XEmccFeatureConfig getEmccFeatureConfig() {
        return emccFeatureConfig;
    }

    /**
     * Sets the value of the emccFeatureConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEmccFeatureConfig }
     *     
     */
    public void setEmccFeatureConfig(XEmccFeatureConfig value) {
        this.emccFeatureConfig = value;
    }

}
