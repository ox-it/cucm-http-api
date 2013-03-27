
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRegion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="relatedRegions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="relatedRegion" type="{http://www.cisco.com/AXL/API/8.0}XRegionRelationship" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultCodec" type="{http://www.cisco.com/AXL/API/8.0}XBandwidth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRegion", propOrder = {
    "name",
    "relatedRegions",
    "defaultCodec"
})
public class XRegion {

    protected String name;
    protected XRegion.RelatedRegions relatedRegions;
    protected String defaultCodec;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relatedRegions property.
     * 
     * @return
     *     possible object is
     *     {@link XRegion.RelatedRegions }
     *     
     */
    public XRegion.RelatedRegions getRelatedRegions() {
        return relatedRegions;
    }

    /**
     * Sets the value of the relatedRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRegion.RelatedRegions }
     *     
     */
    public void setRelatedRegions(XRegion.RelatedRegions value) {
        this.relatedRegions = value;
    }

    /**
     * Gets the value of the defaultCodec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCodec() {
        return defaultCodec;
    }

    /**
     * Sets the value of the defaultCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCodec(String value) {
        this.defaultCodec = value;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="relatedRegion" type="{http://www.cisco.com/AXL/API/8.0}XRegionRelationship" maxOccurs="unbounded"/>
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
        "relatedRegion"
    })
    public static class RelatedRegions {

        protected List<XRegionRelationship> relatedRegion;

        /**
         * Gets the value of the relatedRegion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedRegion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedRegion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XRegionRelationship }
         * 
         * 
         */
        public List<XRegionRelationship> getRelatedRegion() {
            if (relatedRegion == null) {
                relatedRegion = new ArrayList<XRegionRelationship>();
            }
            return this.relatedRegion;
        }

    }

}
