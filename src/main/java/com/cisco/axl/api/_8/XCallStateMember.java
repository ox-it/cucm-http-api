
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCallStateMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCallStateMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="callStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softKeys" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="softKey" type="{http://www.cisco.com/AXL/API/8.5}XSoftKeyMember" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "XCallStateMember", propOrder = {
    "callStateName",
    "softKeys"
})
public class XCallStateMember {

    @XmlElementRef(name = "callStateName", type = JAXBElement.class)
    protected JAXBElement<String> callStateName;
    protected XCallStateMember.SoftKeys softKeys;

    /**
     * Gets the value of the callStateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallStateName() {
        return callStateName;
    }

    /**
     * Sets the value of the callStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallStateName(JAXBElement<String> value) {
        this.callStateName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the softKeys property.
     * 
     * @return
     *     possible object is
     *     {@link XCallStateMember.SoftKeys }
     *     
     */
    public XCallStateMember.SoftKeys getSoftKeys() {
        return softKeys;
    }

    /**
     * Sets the value of the softKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallStateMember.SoftKeys }
     *     
     */
    public void setSoftKeys(XCallStateMember.SoftKeys value) {
        this.softKeys = value;
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
     *         &lt;element name="softKey" type="{http://www.cisco.com/AXL/API/8.5}XSoftKeyMember" maxOccurs="unbounded" minOccurs="0"/>
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
        "softKey"
    })
    public static class SoftKeys {

        protected List<XSoftKeyMember> softKey;

        /**
         * Gets the value of the softKey property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the softKey property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSoftKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSoftKeyMember }
         * 
         * 
         */
        public List<XSoftKeyMember> getSoftKey() {
            if (softKey == null) {
                softKey = new ArrayList<XSoftKeyMember>();
            }
            return this.softKey;
        }

    }

}
