
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XPatternMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XPatternMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dialParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="dialParameter" type="{http://www.cisco.com/AXL/API/8.0}XParameterMember" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectionOrder" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XPatternMember", propOrder = {
    "description",
    "dialParameters",
    "selectionOrder"
})
public class XPatternMember {

    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    protected XPatternMember.DialParameters dialParameters;
    protected String selectionOrder;

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
     * Gets the value of the dialParameters property.
     * 
     * @return
     *     possible object is
     *     {@link XPatternMember.DialParameters }
     *     
     */
    public XPatternMember.DialParameters getDialParameters() {
        return dialParameters;
    }

    /**
     * Sets the value of the dialParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPatternMember.DialParameters }
     *     
     */
    public void setDialParameters(XPatternMember.DialParameters value) {
        this.dialParameters = value;
    }

    /**
     * Gets the value of the selectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionOrder() {
        return selectionOrder;
    }

    /**
     * Sets the value of the selectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionOrder(String value) {
        this.selectionOrder = value;
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
     *         &lt;element name="dialParameter" type="{http://www.cisco.com/AXL/API/8.0}XParameterMember" maxOccurs="unbounded"/>
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
        "dialParameter"
    })
    public static class DialParameters {

        protected List<XParameterMember> dialParameter;

        /**
         * Gets the value of the dialParameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dialParameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDialParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XParameterMember }
         * 
         * 
         */
        public List<XParameterMember> getDialParameter() {
            if (dialParameter == null) {
                dialParameter = new ArrayList<XParameterMember>();
            }
            return this.dialParameter;
        }

    }

}
