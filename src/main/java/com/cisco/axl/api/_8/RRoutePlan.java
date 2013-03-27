
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RRoutePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RRoutePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="dnOrPattern" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="partition" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.cisco.com/AXL/API/8.0}XPatternUsage" minOccurs="0"/>
 *         &lt;element name="routeDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RRoutePlan", propOrder = {
    "dnOrPattern",
    "partition",
    "type",
    "routeDetail"
})
public class RRoutePlan {

    protected String dnOrPattern;
    protected XFkType partition;
    protected String type;
    protected String routeDetail;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the dnOrPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnOrPattern() {
        return dnOrPattern;
    }

    /**
     * Sets the value of the dnOrPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnOrPattern(String value) {
        this.dnOrPattern = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPartition(XFkType value) {
        this.partition = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the routeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDetail() {
        return routeDetail;
    }

    /**
     * Sets the value of the routeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDetail(String value) {
        this.routeDetail = value;
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
