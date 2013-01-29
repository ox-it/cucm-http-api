
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListEnterpriseFeatureAccessConfigurationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListEnterpriseFeatureAccessConfigurationRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enterpriseFeatureAccessConfiguration" type="{http://www.cisco.com/AXL/API/8.5}LEnterpriseFeatureAccessConfiguration" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListEnterpriseFeatureAccessConfigurationRes", propOrder = {
    "_return"
})
public class ListEnterpriseFeatureAccessConfigurationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListEnterpriseFeatureAccessConfigurationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListEnterpriseFeatureAccessConfigurationRes.Return }
     *     
     */
    public ListEnterpriseFeatureAccessConfigurationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEnterpriseFeatureAccessConfigurationRes.Return }
     *     
     */
    public void setReturn(ListEnterpriseFeatureAccessConfigurationRes.Return value) {
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
     *         &lt;element name="enterpriseFeatureAccessConfiguration" type="{http://www.cisco.com/AXL/API/8.5}LEnterpriseFeatureAccessConfiguration" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<LEnterpriseFeatureAccessConfiguration> enterpriseFeatureAccessConfiguration;

        /**
         * Gets the value of the enterpriseFeatureAccessConfiguration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enterpriseFeatureAccessConfiguration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnterpriseFeatureAccessConfiguration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LEnterpriseFeatureAccessConfiguration }
         * 
         * 
         */
        public List<LEnterpriseFeatureAccessConfiguration> getEnterpriseFeatureAccessConfiguration() {
            if (enterpriseFeatureAccessConfiguration == null) {
                enterpriseFeatureAccessConfiguration = new ArrayList<LEnterpriseFeatureAccessConfiguration>();
            }
            return this.enterpriseFeatureAccessConfiguration;
        }

    }

}
