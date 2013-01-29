
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LAarGroupMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LAarGroupMatrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="prefixDigit" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="aarGroupFromName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarGroupToName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LAarGroupMatrix", propOrder = {
    "prefixDigit",
    "aarGroupFromName",
    "aarGroupToName"
})
public class LAarGroupMatrix {

    protected String prefixDigit;
    protected XFkType aarGroupFromName;
    protected XFkType aarGroupToName;

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

}
