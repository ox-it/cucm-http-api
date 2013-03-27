
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMobileVoiceAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMobileVoiceAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="locales" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}RMobileVoiceMember" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "RMobileVoiceAccess", propOrder = {
    "pattern",
    "routePartitionName",
    "locales"
})
public class RMobileVoiceAccess {

    protected String pattern;
    protected XFkType routePartitionName;
    protected RMobileVoiceAccess.Locales locales;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
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

    /**
     * Gets the value of the locales property.
     * 
     * @return
     *     possible object is
     *     {@link RMobileVoiceAccess.Locales }
     *     
     */
    public RMobileVoiceAccess.Locales getLocales() {
        return locales;
    }

    /**
     * Sets the value of the locales property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMobileVoiceAccess.Locales }
     *     
     */
    public void setLocales(RMobileVoiceAccess.Locales value) {
        this.locales = value;
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
     *         &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}RMobileVoiceMember" maxOccurs="unbounded" minOccurs="0"/>
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
        "locale"
    })
    public static class Locales {

        protected List<RMobileVoiceMember> locale;

        /**
         * Gets the value of the locale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RMobileVoiceMember }
         * 
         * 
         */
        public List<RMobileVoiceMember> getLocale() {
            if (locale == null) {
                locale = new ArrayList<RMobileVoiceMember>();
            }
            return this.locale;
        }

    }

}
