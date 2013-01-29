
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSoftKeySetReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSoftKeySetReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeCallStates" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}XCallStateMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addCallStates" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}XCallStateMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="callStates" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}XCallStateMember" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
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
@XmlType(name = "UpdateSoftKeySetReq", propOrder = {
    "removeCallStates",
    "addCallStates",
    "callStates"
})
public class UpdateSoftKeySetReq
    extends NameAndGUIDRequest
{

    protected UpdateSoftKeySetReq.RemoveCallStates removeCallStates;
    protected UpdateSoftKeySetReq.AddCallStates addCallStates;
    protected UpdateSoftKeySetReq.CallStates callStates;

    /**
     * Gets the value of the removeCallStates property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSoftKeySetReq.RemoveCallStates }
     *     
     */
    public UpdateSoftKeySetReq.RemoveCallStates getRemoveCallStates() {
        return removeCallStates;
    }

    /**
     * Sets the value of the removeCallStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSoftKeySetReq.RemoveCallStates }
     *     
     */
    public void setRemoveCallStates(UpdateSoftKeySetReq.RemoveCallStates value) {
        this.removeCallStates = value;
    }

    /**
     * Gets the value of the addCallStates property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSoftKeySetReq.AddCallStates }
     *     
     */
    public UpdateSoftKeySetReq.AddCallStates getAddCallStates() {
        return addCallStates;
    }

    /**
     * Sets the value of the addCallStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSoftKeySetReq.AddCallStates }
     *     
     */
    public void setAddCallStates(UpdateSoftKeySetReq.AddCallStates value) {
        this.addCallStates = value;
    }

    /**
     * Gets the value of the callStates property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSoftKeySetReq.CallStates }
     *     
     */
    public UpdateSoftKeySetReq.CallStates getCallStates() {
        return callStates;
    }

    /**
     * Sets the value of the callStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSoftKeySetReq.CallStates }
     *     
     */
    public void setCallStates(UpdateSoftKeySetReq.CallStates value) {
        this.callStates = value;
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
     *         &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}XCallStateMember" maxOccurs="unbounded"/>
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
    public static class AddCallStates {

        protected List<XCallStateMember> callState;

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
         * {@link XCallStateMember }
         * 
         * 
         */
        public List<XCallStateMember> getCallState() {
            if (callState == null) {
                callState = new ArrayList<XCallStateMember>();
            }
            return this.callState;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}XCallStateMember" maxOccurs="unbounded"/>
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

        protected List<XCallStateMember> callState;

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
         * {@link XCallStateMember }
         * 
         * 
         */
        public List<XCallStateMember> getCallState() {
            if (callState == null) {
                callState = new ArrayList<XCallStateMember>();
            }
            return this.callState;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="callState" type="{http://www.cisco.com/AXL/API/8.5}XCallStateMember" maxOccurs="unbounded"/>
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
    public static class RemoveCallStates {

        protected List<XCallStateMember> callState;

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
         * {@link XCallStateMember }
         * 
         * 
         */
        public List<XCallStateMember> getCallState() {
            if (callState == null) {
                callState = new ArrayList<XCallStateMember>();
            }
            return this.callState;
        }

    }

}
