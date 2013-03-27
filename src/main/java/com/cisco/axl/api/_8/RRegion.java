
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RRegion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="relatedRegions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="relatedRegion" type="{http://www.cisco.com/AXL/API/8.0}RRegionRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultCodec" type="{http://www.cisco.com/AXL/API/8.0}XBandwidth" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RRegion", propOrder = {
    "name",
    "relatedRegions",
    "defaultCodec"
})
public class RRegion {

    protected String name;
    protected RRegion.RelatedRegions relatedRegions;
    protected String defaultCodec;
    @XmlAttribute
    protected String uuid;

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
     *     {@link RRegion.RelatedRegions }
     *     
     */
    public RRegion.RelatedRegions getRelatedRegions() {
        return relatedRegions;
    }

    /**
     * Sets the value of the relatedRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RRegion.RelatedRegions }
     *     
     */
    public void setRelatedRegions(RRegion.RelatedRegions value) {
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
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
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
     *         &lt;element name="relatedRegion" type="{http://www.cisco.com/AXL/API/8.0}RRegionRelationship" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<RRegionRelationship> relatedRegion;

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
         * {@link RRegionRelationship }
         * 
         * 
         */
        public List<RRegionRelationship> getRelatedRegion() {
            if (relatedRegion == null) {
                relatedRegion = new ArrayList<RRegionRelationship>();
            }
            return this.relatedRegion;
        }

    }

}
