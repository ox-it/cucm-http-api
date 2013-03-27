
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LBLFDirectedCallPark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LBLFDirectedCallPark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="label" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="directedCallParkId" type="{http://www.cisco.com/AXL/API/8.0}XUUID" minOccurs="0"/>
 *           &lt;element name="directedCallParkDnAndPartition" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *                     &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="labelAscii" type="{http://www.cisco.com/AXL/API/8.0}String50" minOccurs="0"/>
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LBLFDirectedCallPark", propOrder = {
    "label",
    "directedCallParkId",
    "directedCallParkDnAndPartition",
    "labelAscii",
    "index"
})
public class LBLFDirectedCallPark {

    protected String label;
    protected String directedCallParkId;
    protected LBLFDirectedCallPark.DirectedCallParkDnAndPartition directedCallParkDnAndPartition;
    protected String labelAscii;
    protected String index;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the directedCallParkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectedCallParkId() {
        return directedCallParkId;
    }

    /**
     * Sets the value of the directedCallParkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectedCallParkId(String value) {
        this.directedCallParkId = value;
    }

    /**
     * Gets the value of the directedCallParkDnAndPartition property.
     * 
     * @return
     *     possible object is
     *     {@link LBLFDirectedCallPark.DirectedCallParkDnAndPartition }
     *     
     */
    public LBLFDirectedCallPark.DirectedCallParkDnAndPartition getDirectedCallParkDnAndPartition() {
        return directedCallParkDnAndPartition;
    }

    /**
     * Sets the value of the directedCallParkDnAndPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LBLFDirectedCallPark.DirectedCallParkDnAndPartition }
     *     
     */
    public void setDirectedCallParkDnAndPartition(LBLFDirectedCallPark.DirectedCallParkDnAndPartition value) {
        this.directedCallParkDnAndPartition = value;
    }

    /**
     * Gets the value of the labelAscii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelAscii() {
        return labelAscii;
    }

    /**
     * Sets the value of the labelAscii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelAscii(String value) {
        this.labelAscii = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
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
     *         &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
        "dnPattern",
        "routePartitionName"
    })
    public static class DirectedCallParkDnAndPartition {

        protected String dnPattern;
        protected XFkType routePartitionName;

        /**
         * Gets the value of the dnPattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDnPattern() {
            return dnPattern;
        }

        /**
         * Sets the value of the dnPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDnPattern(String value) {
            this.dnPattern = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setRoutePartitionName(XFkType value) {
            this.routePartitionName = value;
        }

    }

}
