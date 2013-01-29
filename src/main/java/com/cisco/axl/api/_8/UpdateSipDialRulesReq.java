
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSipDialRulesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSipDialRulesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removePatterns" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addPatterns" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="patterns" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removePlars" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="plar" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addPlars" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="plar" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="plars" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="plar" type="{http://www.cisco.com/AXL/API/8.5}XPatternMember" maxOccurs="unbounded"/>
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
@XmlType(name = "UpdateSipDialRulesReq", propOrder = {
    "newName",
    "description",
    "removePatterns",
    "addPatterns",
    "patterns",
    "removePlars",
    "addPlars",
    "plars"
})
public class UpdateSipDialRulesReq
    extends NameAndGUIDRequest
{

    protected String newName;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    protected UpdateSipDialRulesReq.RemovePatterns removePatterns;
    protected UpdateSipDialRulesReq.AddPatterns addPatterns;
    protected UpdateSipDialRulesReq.Patterns patterns;
    protected UpdateSipDialRulesReq.RemovePlars removePlars;
    protected UpdateSipDialRulesReq.AddPlars addPlars;
    protected UpdateSipDialRulesReq.Plars plars;

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
     * Gets the value of the removePatterns property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSipDialRulesReq.RemovePatterns }
     *     
     */
    public UpdateSipDialRulesReq.RemovePatterns getRemovePatterns() {
        return removePatterns;
    }

    /**
     * Sets the value of the removePatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSipDialRulesReq.RemovePatterns }
     *     
     */
    public void setRemovePatterns(UpdateSipDialRulesReq.RemovePatterns value) {
        this.removePatterns = value;
    }

    /**
     * Gets the value of the addPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSipDialRulesReq.AddPatterns }
     *     
     */
    public UpdateSipDialRulesReq.AddPatterns getAddPatterns() {
        return addPatterns;
    }

    /**
     * Sets the value of the addPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSipDialRulesReq.AddPatterns }
     *     
     */
    public void setAddPatterns(UpdateSipDialRulesReq.AddPatterns value) {
        this.addPatterns = value;
    }

    /**
     * Gets the value of the patterns property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSipDialRulesReq.Patterns }
     *     
     */
    public UpdateSipDialRulesReq.Patterns getPatterns() {
        return patterns;
    }

    /**
     * Sets the value of the patterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSipDialRulesReq.Patterns }
     *     
     */
    public void setPatterns(UpdateSipDialRulesReq.Patterns value) {
        this.patterns = value;
    }

    /**
     * Gets the value of the removePlars property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSipDialRulesReq.RemovePlars }
     *     
     */
    public UpdateSipDialRulesReq.RemovePlars getRemovePlars() {
        return removePlars;
    }

    /**
     * Sets the value of the removePlars property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSipDialRulesReq.RemovePlars }
     *     
     */
    public void setRemovePlars(UpdateSipDialRulesReq.RemovePlars value) {
        this.removePlars = value;
    }

    /**
     * Gets the value of the addPlars property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSipDialRulesReq.AddPlars }
     *     
     */
    public UpdateSipDialRulesReq.AddPlars getAddPlars() {
        return addPlars;
    }

    /**
     * Sets the value of the addPlars property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSipDialRulesReq.AddPlars }
     *     
     */
    public void setAddPlars(UpdateSipDialRulesReq.AddPlars value) {
        this.addPlars = value;
    }

    /**
     * Gets the value of the plars property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSipDialRulesReq.Plars }
     *     
     */
    public UpdateSipDialRulesReq.Plars getPlars() {
        return plars;
    }

    /**
     * Sets the value of the plars property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSipDialRulesReq.Plars }
     *     
     */
    public void setPlars(UpdateSipDialRulesReq.Plars value) {
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
    public static class AddPatterns
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
    public static class AddPlars
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
    public static class RemovePatterns
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
    public static class RemovePlars
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
