
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="kbits" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="videoKbits" type="{http://www.cisco.com/AXL/API/8.5}XInteger" minOccurs="0"/>
 *         &lt;element name="relatedLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="relatedLocation" type="{http://www.cisco.com/AXL/API/8.5}RLocationRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RLocation", propOrder = {
    "name",
    "id",
    "kbits",
    "videoKbits",
    "relatedLocations"
})
public class RLocation {

    protected String name;
    protected String id;
    protected String kbits;
    protected String videoKbits;
    protected RLocation.RelatedLocations relatedLocations;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the kbits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbits() {
        return kbits;
    }

    /**
     * Sets the value of the kbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbits(String value) {
        this.kbits = value;
    }

    /**
     * Gets the value of the videoKbits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoKbits() {
        return videoKbits;
    }

    /**
     * Sets the value of the videoKbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoKbits(String value) {
        this.videoKbits = value;
    }

    /**
     * Gets the value of the relatedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link RLocation.RelatedLocations }
     *     
     */
    public RLocation.RelatedLocations getRelatedLocations() {
        return relatedLocations;
    }

    /**
     * Sets the value of the relatedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RLocation.RelatedLocations }
     *     
     */
    public void setRelatedLocations(RLocation.RelatedLocations value) {
        this.relatedLocations = value;
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
     *         &lt;element name="relatedLocation" type="{http://www.cisco.com/AXL/API/8.5}RLocationRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
        "relatedLocation"
    })
    public static class RelatedLocations {

        protected List<RLocationRelationship> relatedLocation;

        /**
         * Gets the value of the relatedLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RLocationRelationship }
         * 
         * 
         */
        public List<RLocationRelationship> getRelatedLocation() {
            if (relatedLocation == null) {
                relatedLocation = new ArrayList<RLocationRelationship>();
            }
            return this.relatedLocation;
        }

    }

}
