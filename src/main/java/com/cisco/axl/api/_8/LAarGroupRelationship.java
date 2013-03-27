
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LAarGroupRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LAarGroupRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="aarGroupFromName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="aarGroupToName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="prefixDigit" type="{http://www.cisco.com/AXL/API/8.0}String32" minOccurs="0"/>
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
@XmlType(name = "LAarGroupRelationship", propOrder = {
    "aarGroupFromName",
    "aarGroupToName",
    "prefixDigit"
})
public class LAarGroupRelationship {

    protected XFkType aarGroupFromName;
    protected XFkType aarGroupToName;
    protected String prefixDigit;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the aarGroupFromName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarGroupFromName() {
        return aarGroupFromName;
    }

    /**
     * Sets the value of the aarGroupFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarGroupFromName(XFkType value) {
        this.aarGroupFromName = value;
    }

    /**
     * Gets the value of the aarGroupToName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarGroupToName() {
        return aarGroupToName;
    }

    /**
     * Sets the value of the aarGroupToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarGroupToName(XFkType value) {
        this.aarGroupToName = value;
    }

    /**
     * Gets the value of the prefixDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixDigit() {
        return prefixDigit;
    }

    /**
     * Sets the value of the prefixDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixDigit(String value) {
        this.prefixDigit = value;
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
