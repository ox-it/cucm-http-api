
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XPhoneButtonTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XPhoneButtonTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="basePhoneTemplateName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="buttons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="button" type="{http://www.cisco.com/AXL/API/8.0}XButton" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "XPhoneButtonTemplate", propOrder = {
    "name",
    "basePhoneTemplateName",
    "buttons"
})
public class XPhoneButtonTemplate {

    protected String name;
    protected XFkType basePhoneTemplateName;
    protected XPhoneButtonTemplate.Buttons buttons;

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
     * Gets the value of the basePhoneTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getBasePhoneTemplateName() {
        return basePhoneTemplateName;
    }

    /**
     * Sets the value of the basePhoneTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setBasePhoneTemplateName(XFkType value) {
        this.basePhoneTemplateName = value;
    }

    /**
     * Gets the value of the buttons property.
     * 
     * @return
     *     possible object is
     *     {@link XPhoneButtonTemplate.Buttons }
     *     
     */
    public XPhoneButtonTemplate.Buttons getButtons() {
        return buttons;
    }

    /**
     * Sets the value of the buttons property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhoneButtonTemplate.Buttons }
     *     
     */
    public void setButtons(XPhoneButtonTemplate.Buttons value) {
        this.buttons = value;
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
     *         &lt;element name="button" type="{http://www.cisco.com/AXL/API/8.0}XButton" maxOccurs="unbounded" minOccurs="0"/>
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
        "button"
    })
    public static class Buttons {

        protected List<XButton> button;

        /**
         * Gets the value of the button property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the button property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getButton().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XButton }
         * 
         * 
         */
        public List<XButton> getButton() {
            if (button == null) {
                button = new ArrayList<XButton>();
            }
            return this.button;
        }

    }

}
