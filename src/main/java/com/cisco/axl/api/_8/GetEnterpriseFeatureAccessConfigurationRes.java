
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEnterpriseFeatureAccessConfigurationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEnterpriseFeatureAccessConfigurationRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enterpriseFeatureAccessConfiguration" type="{http://www.cisco.com/AXL/API/8.5}REnterpriseFeatureAccessConfiguration"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEnterpriseFeatureAccessConfigurationRes", propOrder = {
    "_return"
})
public class GetEnterpriseFeatureAccessConfigurationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetEnterpriseFeatureAccessConfigurationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetEnterpriseFeatureAccessConfigurationRes.Return }
     *     
     */
    public GetEnterpriseFeatureAccessConfigurationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEnterpriseFeatureAccessConfigurationRes.Return }
     *     
     */
    public void setReturn(GetEnterpriseFeatureAccessConfigurationRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="enterpriseFeatureAccessConfiguration" type="{http://www.cisco.com/AXL/API/8.5}REnterpriseFeatureAccessConfiguration"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enterpriseFeatureAccessConfiguration"
    })
    public static class Return {

        @XmlElement(required = true)
        protected REnterpriseFeatureAccessConfiguration enterpriseFeatureAccessConfiguration;

        /**
         * Gets the value of the enterpriseFeatureAccessConfiguration property.
         * 
         * @return
         *     possible object is
         *     {@link REnterpriseFeatureAccessConfiguration }
         *     
         */
        public REnterpriseFeatureAccessConfiguration getEnterpriseFeatureAccessConfiguration() {
            return enterpriseFeatureAccessConfiguration;
        }

        /**
         * Sets the value of the enterpriseFeatureAccessConfiguration property.
         * 
         * @param value
         *     allowed object is
         *     {@link REnterpriseFeatureAccessConfiguration }
         *     
         */
        public void setEnterpriseFeatureAccessConfiguration(REnterpriseFeatureAccessConfiguration value) {
            this.enterpriseFeatureAccessConfiguration = value;
        }

    }

}
