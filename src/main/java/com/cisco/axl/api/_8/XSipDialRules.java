
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSipDialRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSipDialRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="dialPattern" type="{http://www.cisco.com/AXL/API/8.5}XDialPattern"/>
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String50"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patterns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="plars" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="plar" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSipDialRules", propOrder = {
    "dialPattern",
    "name",
    "description",
    "patterns",
    "plars"
})
public class XSipDialRules {

    @XmlElement(defaultValue = "7940_7960_OTHER")
    protected String dialPattern;
    protected String name;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    protected XSipDialRules.Patterns patterns;
    protected XSipDialRules.Plars plars;

    /**
     * Gets the value of the dialPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialPattern() {
        return dialPattern;
    }

    /**
     * Sets the value of the dialPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialPattern(String value) {
        this.dialPattern = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the patterns property.
     * 
     * @return
     *     possible object is
     *     {@link XSipDialRules.Patterns }
     *     
     */
    public XSipDialRules.Patterns getPatterns() {
        return patterns;
    }

    /**
     * Sets the value of the patterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipDialRules.Patterns }
     *     
     */
    public void setPatterns(XSipDialRules.Patterns value) {
        this.patterns = value;
    }

    /**
     * Gets the value of the plars property.
     * 
     * @return
     *     possible object is
     *     {@link XSipDialRules.Plars }
     *     
     */
    public XSipDialRules.Plars getPlars() {
        return plars;
    }

    /**
     * Sets the value of the plars property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipDialRules.Plars }
     *     
     */
    public void setPlars(XSipDialRules.Plars value) {
        this.plars = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pattern"
    })
    public static class Patterns
        extends XCommonMembersExtension
    {

        protected List<XPatternMember> pattern;

        /**
         * Gets the value of the pattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPatternMember }
         * 
         * 
         */
        public List<XPatternMember> getPattern() {
            if (pattern == null) {
                pattern = new ArrayList<XPatternMember>();
            }
            return this.pattern;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="plar" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "plar"
    })
    public static class Plars
        extends XCommonMembersExtension
    {

        protected List<XPatternMember> plar;

        /**
         * Gets the value of the plar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XPatternMember }
         * 
         * 
         */
        public List<XPatternMember> getPlar() {
            if (plar == null) {
                plar = new ArrayList<XPatternMember>();
            }
            return this.plar;
        }

    }

}
