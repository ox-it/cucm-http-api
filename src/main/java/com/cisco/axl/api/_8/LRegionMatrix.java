
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LRegionMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LRegionMatrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="bandwidth" type="{http://www.cisco.com/AXL/API/8.0}XBandwidth" minOccurs="0"/>
 *         &lt;element name="videoBandwidth" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="lossyNetwork" type="{http://www.cisco.com/AXL/API/8.0}XLossyNetwork" minOccurs="0"/>
 *         &lt;element name="regionAName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="regionBName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
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
@XmlType(name = "LRegionMatrix", propOrder = {
    "bandwidth",
    "videoBandwidth",
    "lossyNetwork",
    "regionAName",
    "regionBName"
})
public class LRegionMatrix {

    protected String bandwidth;
    protected String videoBandwidth;
    protected String lossyNetwork;
    protected XFkType regionAName;
    protected XFkType regionBName;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidth(String value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the videoBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoBandwidth() {
        return videoBandwidth;
    }

    /**
     * Sets the value of the videoBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoBandwidth(String value) {
        this.videoBandwidth = value;
    }

    /**
     * Gets the value of the lossyNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossyNetwork() {
        return lossyNetwork;
    }

    /**
     * Sets the value of the lossyNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossyNetwork(String value) {
        this.lossyNetwork = value;
    }

    /**
     * Gets the value of the regionAName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRegionAName() {
        return regionAName;
    }

    /**
     * Sets the value of the regionAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRegionAName(XFkType value) {
        this.regionAName = value;
    }

    /**
     * Gets the value of the regionBName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRegionBName() {
        return regionBName;
    }

    /**
     * Sets the value of the regionBName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRegionBName(XFkType value) {
        this.regionBName = value;
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

}
