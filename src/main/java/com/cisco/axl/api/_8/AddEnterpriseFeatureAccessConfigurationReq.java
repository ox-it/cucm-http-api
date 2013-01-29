
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddEnterpriseFeatureAccessConfigurationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddEnterpriseFeatureAccessConfigurationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="enterpriseFeatureAccessConfiguration" type="{http://www.cisco.com/AXL/API/8.5}XEnterpriseFeatureAccessConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddEnterpriseFeatureAccessConfigurationReq", propOrder = {
    "enterpriseFeatureAccessConfiguration"
})
public class AddEnterpriseFeatureAccessConfigurationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XEnterpriseFeatureAccessConfiguration enterpriseFeatureAccessConfiguration;

    /**
     * Gets the value of the enterpriseFeatureAccessConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link XEnterpriseFeatureAccessConfiguration }
     *     
     */
    public XEnterpriseFeatureAccessConfiguration getEnterpriseFeatureAccessConfiguration() {
        return enterpriseFeatureAccessConfiguration;
    }

    /**
     * Sets the value of the enterpriseFeatureAccessConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEnterpriseFeatureAccessConfiguration }
     *     
     */
    public void setEnterpriseFeatureAccessConfiguration(XEnterpriseFeatureAccessConfiguration value) {
        this.enterpriseFeatureAccessConfiguration = value;
    }

}
