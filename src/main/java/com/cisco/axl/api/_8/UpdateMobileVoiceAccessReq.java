
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMobileVoiceAccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMobileVoiceAccessReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="newPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeLocales" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}XMobileVoiceMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addLocales" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}XMobileVoiceMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="locales" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}XMobileVoiceMember" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMobileVoiceAccessReq", propOrder = {
    "uuid",
    "pattern",
    "newPattern",
    "routePartitionName",
    "removeLocales",
    "addLocales",
    "locales"
})
public class UpdateMobileVoiceAccessReq
    extends APIRequest
{

    protected String uuid;
    protected String pattern;
    protected String newPattern;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartitionName;
    protected UpdateMobileVoiceAccessReq.RemoveLocales removeLocales;
    protected UpdateMobileVoiceAccessReq.AddLocales addLocales;
    protected UpdateMobileVoiceAccessReq.Locales locales;

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
     * Gets the value of the newPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPattern() {
        return newPattern;
    }

    /**
     * Sets the value of the newPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPattern(String value) {
        this.newPattern = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartitionName(JAXBElement<XFkType> value) {
        this.routePartitionName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the removeLocales property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMobileVoiceAccessReq.RemoveLocales }
     *     
     */
    public UpdateMobileVoiceAccessReq.RemoveLocales getRemoveLocales() {
        return removeLocales;
    }

    /**
     * Sets the value of the removeLocales property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMobileVoiceAccessReq.RemoveLocales }
     *     
     */
    public void setRemoveLocales(UpdateMobileVoiceAccessReq.RemoveLocales value) {
        this.removeLocales = value;
    }

    /**
     * Gets the value of the addLocales property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMobileVoiceAccessReq.AddLocales }
     *     
     */
    public UpdateMobileVoiceAccessReq.AddLocales getAddLocales() {
        return addLocales;
    }

    /**
     * Sets the value of the addLocales property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMobileVoiceAccessReq.AddLocales }
     *     
     */
    public void setAddLocales(UpdateMobileVoiceAccessReq.AddLocales value) {
        this.addLocales = value;
    }

    /**
     * Gets the value of the locales property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMobileVoiceAccessReq.Locales }
     *     
     */
    public UpdateMobileVoiceAccessReq.Locales getLocales() {
        return locales;
    }

    /**
     * Sets the value of the locales property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMobileVoiceAccessReq.Locales }
     *     
     */
    public void setLocales(UpdateMobileVoiceAccessReq.Locales value) {
        this.locales = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}XMobileVoiceMember" maxOccurs="unbounded"/>
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
        "locale"
    })
    public static class AddLocales
        extends XCommonMembersExtension
    {

        protected List<XMobileVoiceMember> locale;

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
         * {@link XMobileVoiceMember }
         * 
         * 
         */
        public List<XMobileVoiceMember> getLocale() {
            if (locale == null) {
                locale = new ArrayList<XMobileVoiceMember>();
            }
            return this.locale;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}XMobileVoiceMember" maxOccurs="unbounded"/>
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
        "locale"
    })
    public static class Locales
        extends XCommonMembersExtension
    {

        protected List<XMobileVoiceMember> locale;

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
         * {@link XMobileVoiceMember }
         * 
         * 
         */
        public List<XMobileVoiceMember> getLocale() {
            if (locale == null) {
                locale = new ArrayList<XMobileVoiceMember>();
            }
            return this.locale;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="locale" type="{http://www.cisco.com/AXL/API/8.0}XMobileVoiceMember" maxOccurs="unbounded"/>
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
        "locale"
    })
    public static class RemoveLocales
        extends XCommonMembersExtension
    {

        protected List<XMobileVoiceMember> locale;

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
         * {@link XMobileVoiceMember }
         * 
         * 
         */
        public List<XMobileVoiceMember> getLocale() {
            if (locale == null) {
                locale = new ArrayList<XMobileVoiceMember>();
            }
            return this.locale;
        }

    }

}
