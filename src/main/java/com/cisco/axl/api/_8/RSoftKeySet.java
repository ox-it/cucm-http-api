
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSoftKeySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSoftKeySet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="softKeyTemplateName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callStates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}RCallStateMember" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSoftKeySet", propOrder = {
    "softKeyTemplateName",
    "callStates"
})
public class RSoftKeySet {

    protected XFkType softKeyTemplateName;
    protected RSoftKeySet.CallStates callStates;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the softKeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftKeyTemplateName() {
        return softKeyTemplateName;
    }

    /**
     * Sets the value of the softKeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftKeyTemplateName(XFkType value) {
        this.softKeyTemplateName = value;
    }

    /**
     * Gets the value of the callStates property.
     * 
     * @return
     *     possible object is
     *     {@link RSoftKeySet.CallStates }
     *     
     */
    public RSoftKeySet.CallStates getCallStates() {
        return callStates;
    }

    /**
     * Sets the value of the callStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSoftKeySet.CallStates }
     *     
     */
    public void setCallStates(RSoftKeySet.CallStates value) {
        this.callStates = value;
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
     *         &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}RCallStateMember" maxOccurs="unbounded" minOccurs="0"/>
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
        "callState"
    })
    public static class CallStates {

        protected List<RCallStateMember> callState;

        /**
         * Gets the value of the callState property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the callState property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCallState().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RCallStateMember }
         * 
         * 
         */
        public List<RCallStateMember> getCallState() {
            if (callState == null) {
                callState = new ArrayList<RCallStateMember>();
            }
            return this.callState;
        }

    }

}
