
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XDateTimeGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XDateTimeGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZone" type="{http://www.cisco.com/AXL/API/8.5}XTimeZone"/>
 *         &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateformat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNtpReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="selectedPhoneNtpReference" type="{http://www.cisco.com/AXL/API/8.5}XDateTimeGroupNtpReference" maxOccurs="unbounded"/>
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
@XmlType(name = "XDateTimeGroup", propOrder = {
    "name",
    "timeZone",
    "separator",
    "dateformat",
    "timeFormat",
    "phoneNtpReferences"
})
public class XDateTimeGroup {

    protected String name;
    @XmlElement(defaultValue = "Europe/London")
    protected String timeZone;
    protected String separator;
    protected String dateformat;
    protected String timeFormat;
    protected XDateTimeGroup.PhoneNtpReferences phoneNtpReferences;

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
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Gets the value of the dateformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateformat() {
        return dateformat;
    }

    /**
     * Sets the value of the dateformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateformat(String value) {
        this.dateformat = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the phoneNtpReferences property.
     * 
     * @return
     *     possible object is
     *     {@link XDateTimeGroup.PhoneNtpReferences }
     *     
     */
    public XDateTimeGroup.PhoneNtpReferences getPhoneNtpReferences() {
        return phoneNtpReferences;
    }

    /**
     * Sets the value of the phoneNtpReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDateTimeGroup.PhoneNtpReferences }
     *     
     */
    public void setPhoneNtpReferences(XDateTimeGroup.PhoneNtpReferences value) {
        this.phoneNtpReferences = value;
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
     *         &lt;element name="selectedPhoneNtpReference" type="{http://www.cisco.com/AXL/API/8.5}XDateTimeGroupNtpReference" maxOccurs="unbounded"/>
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
        "selectedPhoneNtpReference"
    })
    public static class PhoneNtpReferences
        extends XCommonMembersExtension
    {

        protected List<XDateTimeGroupNtpReference> selectedPhoneNtpReference;

        /**
         * Gets the value of the selectedPhoneNtpReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedPhoneNtpReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedPhoneNtpReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XDateTimeGroupNtpReference }
         * 
         * 
         */
        public List<XDateTimeGroupNtpReference> getSelectedPhoneNtpReference() {
            if (selectedPhoneNtpReference == null) {
                selectedPhoneNtpReference = new ArrayList<XDateTimeGroupNtpReference>();
            }
            return this.selectedPhoneNtpReference;
        }

    }

}
