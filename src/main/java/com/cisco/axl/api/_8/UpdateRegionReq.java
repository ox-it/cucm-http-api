
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRegionReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRegionReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="relatedRegions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="relatedRegion" type="{http://www.cisco.com/AXL/API/8.5}XRegionRelationship" maxOccurs="unbounded"/>
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
@XmlType(name = "UpdateRegionReq", propOrder = {
    "newName",
    "relatedRegions"
})
public class UpdateRegionReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected UpdateRegionReq.RelatedRegions relatedRegions;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
    }

    /**
     * Gets the value of the relatedRegions property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRegionReq.RelatedRegions }
     *     
     */
    public UpdateRegionReq.RelatedRegions getRelatedRegions() {
        return relatedRegions;
    }

    /**
     * Sets the value of the relatedRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRegionReq.RelatedRegions }
     *     
     */
    public void setRelatedRegions(UpdateRegionReq.RelatedRegions value) {
        this.relatedRegions = value;
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
     *         &lt;element name="relatedRegion" type="{http://www.cisco.com/AXL/API/8.5}XRegionRelationship" maxOccurs="unbounded"/>
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
