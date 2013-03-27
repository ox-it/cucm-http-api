
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSafForwarderReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSafForwarderReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="clientLabel" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="safSecurityProfile" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="safReconnectInterval" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="safNotificationsWindowSize" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeAssociatedCucms" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}XSafForwarderMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addAssociatedCucms" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}XSafForwarderMember" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="associatedCucms" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.0}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}XSafForwarderMember" maxOccurs="unbounded"/>
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
@XmlType(name = "UpdateSafForwarderReq", propOrder = {
    "newName",
    "description",
    "clientLabel",
    "safSecurityProfile",
    "ipAddress",
    "port",
    "safReconnectInterval",
    "safNotificationsWindowSize",
    "removeAssociatedCucms",
    "addAssociatedCucms",
    "associatedCucms"
})
public class UpdateSafForwarderReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String clientLabel;
    protected XFkType safSecurityProfile;
    protected String ipAddress;
    @XmlElement(defaultValue = "5050")
    protected String port;
    @XmlElement(defaultValue = "20")
    protected String safReconnectInterval;
    @XmlElement(defaultValue = "7")
    protected String safNotificationsWindowSize;
    protected UpdateSafForwarderReq.RemoveAssociatedCucms removeAssociatedCucms;
    protected UpdateSafForwarderReq.AddAssociatedCucms addAssociatedCucms;
    protected UpdateSafForwarderReq.AssociatedCucms associatedCucms;

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
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the clientLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLabel() {
        return clientLabel;
    }

    /**
     * Sets the value of the clientLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLabel(String value) {
        this.clientLabel = value;
    }

    /**
     * Gets the value of the safSecurityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSafSecurityProfile() {
        return safSecurityProfile;
    }

    /**
     * Sets the value of the safSecurityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSafSecurityProfile(XFkType value) {
        this.safSecurityProfile = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the safReconnectInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafReconnectInterval() {
        return safReconnectInterval;
    }

    /**
     * Sets the value of the safReconnectInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafReconnectInterval(String value) {
        this.safReconnectInterval = value;
    }

    /**
     * Gets the value of the safNotificationsWindowSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafNotificationsWindowSize() {
        return safNotificationsWindowSize;
    }

    /**
     * Sets the value of the safNotificationsWindowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafNotificationsWindowSize(String value) {
        this.safNotificationsWindowSize = value;
    }

    /**
     * Gets the value of the removeAssociatedCucms property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSafForwarderReq.RemoveAssociatedCucms }
     *     
     */
    public UpdateSafForwarderReq.RemoveAssociatedCucms getRemoveAssociatedCucms() {
        return removeAssociatedCucms;
    }

    /**
     * Sets the value of the removeAssociatedCucms property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSafForwarderReq.RemoveAssociatedCucms }
     *     
     */
    public void setRemoveAssociatedCucms(UpdateSafForwarderReq.RemoveAssociatedCucms value) {
        this.removeAssociatedCucms = value;
    }

    /**
     * Gets the value of the addAssociatedCucms property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSafForwarderReq.AddAssociatedCucms }
     *     
     */
    public UpdateSafForwarderReq.AddAssociatedCucms getAddAssociatedCucms() {
        return addAssociatedCucms;
    }

    /**
     * Sets the value of the addAssociatedCucms property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSafForwarderReq.AddAssociatedCucms }
     *     
     */
    public void setAddAssociatedCucms(UpdateSafForwarderReq.AddAssociatedCucms value) {
        this.addAssociatedCucms = value;
    }

    /**
     * Gets the value of the associatedCucms property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSafForwarderReq.AssociatedCucms }
     *     
     */
    public UpdateSafForwarderReq.AssociatedCucms getAssociatedCucms() {
        return associatedCucms;
    }

    /**
     * Sets the value of the associatedCucms property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSafForwarderReq.AssociatedCucms }
     *     
     */
    public void setAssociatedCucms(UpdateSafForwarderReq.AssociatedCucms value) {
        this.associatedCucms = value;
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
     *         &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}XSafForwarderMember" maxOccurs="unbounded"/>
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
        "associatedCucm"
    })
    public static class AddAssociatedCucms
        extends XCommonMembersExtension
    {

        protected List<XSafForwarderMember> associatedCucm;

        /**
         * Gets the value of the associatedCucm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedCucm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedCucm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSafForwarderMember }
         * 
         * 
         */
        public List<XSafForwarderMember> getAssociatedCucm() {
            if (associatedCucm == null) {
                associatedCucm = new ArrayList<XSafForwarderMember>();
            }
            return this.associatedCucm;
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
     *         &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}XSafForwarderMember" maxOccurs="unbounded"/>
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
        "associatedCucm"
    })
    public static class AssociatedCucms
        extends XCommonMembersExtension
    {

        protected List<XSafForwarderMember> associatedCucm;

        /**
         * Gets the value of the associatedCucm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedCucm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedCucm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSafForwarderMember }
         * 
         * 
         */
        public List<XSafForwarderMember> getAssociatedCucm() {
            if (associatedCucm == null) {
                associatedCucm = new ArrayList<XSafForwarderMember>();
            }
            return this.associatedCucm;
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
     *         &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}XSafForwarderMember" maxOccurs="unbounded"/>
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
        "associatedCucm"
    })
    public static class RemoveAssociatedCucms
        extends XCommonMembersExtension
    {

        protected List<XSafForwarderMember> associatedCucm;

        /**
         * Gets the value of the associatedCucm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedCucm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedCucm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSafForwarderMember }
         * 
         * 
         */
        public List<XSafForwarderMember> getAssociatedCucm() {
            if (associatedCucm == null) {
                associatedCucm = new ArrayList<XSafForwarderMember>();
            }
            return this.associatedCucm;
        }

    }

}
