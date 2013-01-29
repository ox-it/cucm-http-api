
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateApplicationServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateApplicationServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID"/>
 *         &lt;/choice>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeAppUsers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="selectedAppUser" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence minOccurs="0">
 *                                 &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                                 &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addAppUsers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="selectedAppUser" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence minOccurs="0">
 *                                 &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                                 &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="appUsers" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="selectedAppUser" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                               &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endUserUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeEndUsers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="selectedEndUser" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence minOccurs="0">
 *                                 &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                                 &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addEndUsers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="selectedEndUser" maxOccurs="unbounded">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence minOccurs="0">
 *                                 &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                                 &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="endUsers" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="selectedEndUser" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *                               &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
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
@XmlType(name = "UpdateApplicationServerReq", propOrder = {
    "uuid",
    "newName",
    "ipAddress",
    "removeAppUsers",
    "addAppUsers",
    "appUsers",
    "url",
    "endUserUrl",
    "processNodeName",
    "removeEndUsers",
    "addEndUsers",
    "endUsers"
})
public class UpdateApplicationServerReq
    extends APIRequest
{

    protected String uuid;
    protected String newName;
    protected String ipAddress;
    protected UpdateApplicationServerReq.RemoveAppUsers removeAppUsers;
    protected UpdateApplicationServerReq.AddAppUsers addAppUsers;
    protected UpdateApplicationServerReq.AppUsers appUsers;
    protected String url;
    protected String endUserUrl;
    @XmlElementRef(name = "processNodeName", type = JAXBElement.class)
    protected JAXBElement<XFkType> processNodeName;
    protected UpdateApplicationServerReq.RemoveEndUsers removeEndUsers;
    protected UpdateApplicationServerReq.AddEndUsers addEndUsers;
    protected UpdateApplicationServerReq.EndUsers endUsers;

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
     * Gets the value of the removeAppUsers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateApplicationServerReq.RemoveAppUsers }
     *     
     */
    public UpdateApplicationServerReq.RemoveAppUsers getRemoveAppUsers() {
        return removeAppUsers;
    }

    /**
     * Sets the value of the removeAppUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateApplicationServerReq.RemoveAppUsers }
     *     
     */
    public void setRemoveAppUsers(UpdateApplicationServerReq.RemoveAppUsers value) {
        this.removeAppUsers = value;
    }

    /**
     * Gets the value of the addAppUsers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateApplicationServerReq.AddAppUsers }
     *     
     */
    public UpdateApplicationServerReq.AddAppUsers getAddAppUsers() {
        return addAppUsers;
    }

    /**
     * Sets the value of the addAppUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateApplicationServerReq.AddAppUsers }
     *     
     */
    public void setAddAppUsers(UpdateApplicationServerReq.AddAppUsers value) {
        this.addAppUsers = value;
    }

    /**
     * Gets the value of the appUsers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateApplicationServerReq.AppUsers }
     *     
     */
    public UpdateApplicationServerReq.AppUsers getAppUsers() {
        return appUsers;
    }

    /**
     * Sets the value of the appUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateApplicationServerReq.AppUsers }
     *     
     */
    public void setAppUsers(UpdateApplicationServerReq.AppUsers value) {
        this.appUsers = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the endUserUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserUrl() {
        return endUserUrl;
    }

    /**
     * Sets the value of the endUserUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserUrl(String value) {
        this.endUserUrl = value;
    }

    /**
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setProcessNodeName(JAXBElement<XFkType> value) {
        this.processNodeName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the removeEndUsers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateApplicationServerReq.RemoveEndUsers }
     *     
     */
    public UpdateApplicationServerReq.RemoveEndUsers getRemoveEndUsers() {
        return removeEndUsers;
    }

    /**
     * Sets the value of the removeEndUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateApplicationServerReq.RemoveEndUsers }
     *     
     */
    public void setRemoveEndUsers(UpdateApplicationServerReq.RemoveEndUsers value) {
        this.removeEndUsers = value;
    }

    /**
     * Gets the value of the addEndUsers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateApplicationServerReq.AddEndUsers }
     *     
     */
    public UpdateApplicationServerReq.AddEndUsers getAddEndUsers() {
        return addEndUsers;
    }

    /**
     * Sets the value of the addEndUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateApplicationServerReq.AddEndUsers }
     *     
     */
    public void setAddEndUsers(UpdateApplicationServerReq.AddEndUsers value) {
        this.addEndUsers = value;
    }

    /**
     * Gets the value of the endUsers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateApplicationServerReq.EndUsers }
     *     
     */
    public UpdateApplicationServerReq.EndUsers getEndUsers() {
        return endUsers;
    }

    /**
     * Sets the value of the endUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateApplicationServerReq.EndUsers }
     *     
     */
    public void setEndUsers(UpdateApplicationServerReq.EndUsers value) {
        this.endUsers = value;
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
     *         &lt;element name="selectedAppUser" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "selectedAppUser"
    })
    public static class AddAppUsers
        extends XCommonMembersExtension
    {

        protected List<UpdateApplicationServerReq.AddAppUsers.SelectedAppUser> selectedAppUser;

        /**
         * Gets the value of the selectedAppUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedAppUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedAppUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateApplicationServerReq.AddAppUsers.SelectedAppUser }
         * 
         * 
         */
        public List<UpdateApplicationServerReq.AddAppUsers.SelectedAppUser> getSelectedAppUser() {
            if (selectedAppUser == null) {
                selectedAppUser = new ArrayList<UpdateApplicationServerReq.AddAppUsers.SelectedAppUser>();
            }
            return this.selectedAppUser;
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
         *         &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
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
            "appUserName",
            "content"
        })
        public static class SelectedAppUser {

            protected XFkType appUserName;
            @XmlElementRef(name = "content", type = JAXBElement.class)
            protected JAXBElement<XContent> content;

            /**
             * Gets the value of the appUserName property.
             * 
             * @return
             *     possible object is
             *     {@link XFkType }
             *     
             */
            public XFkType getAppUserName() {
                return appUserName;
            }

            /**
             * Sets the value of the appUserName property.
             * 
             * @param value
             *     allowed object is
             *     {@link XFkType }
             *     
             */
            public void setAppUserName(XFkType value) {
                this.appUserName = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public JAXBElement<XContent> getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public void setContent(JAXBElement<XContent> value) {
                this.content = ((JAXBElement<XContent> ) value);
            }

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
     *         &lt;element name="selectedEndUser" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "selectedEndUser"
    })
    public static class AddEndUsers
        extends XCommonMembersExtension
    {

        protected List<UpdateApplicationServerReq.AddEndUsers.SelectedEndUser> selectedEndUser;

        /**
         * Gets the value of the selectedEndUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedEndUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedEndUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateApplicationServerReq.AddEndUsers.SelectedEndUser }
         * 
         * 
         */
        public List<UpdateApplicationServerReq.AddEndUsers.SelectedEndUser> getSelectedEndUser() {
            if (selectedEndUser == null) {
                selectedEndUser = new ArrayList<UpdateApplicationServerReq.AddEndUsers.SelectedEndUser>();
            }
            return this.selectedEndUser;
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
         *         &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
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
            "endUserName",
            "content"
        })
        public static class SelectedEndUser {

            protected XFkType endUserName;
            @XmlElementRef(name = "content", type = JAXBElement.class)
            protected JAXBElement<XContent> content;

            /**
             * Gets the value of the endUserName property.
             * 
             * @return
             *     possible object is
             *     {@link XFkType }
             *     
             */
            public XFkType getEndUserName() {
                return endUserName;
            }

            /**
             * Sets the value of the endUserName property.
             * 
             * @param value
             *     allowed object is
             *     {@link XFkType }
             *     
             */
            public void setEndUserName(XFkType value) {
                this.endUserName = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public JAXBElement<XContent> getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public void setContent(JAXBElement<XContent> value) {
                this.content = ((JAXBElement<XContent> ) value);
            }

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
     *         &lt;element name="selectedAppUser" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "selectedAppUser"
    })
    public static class AppUsers
        extends XCommonMembersExtension
    {

        protected List<UpdateApplicationServerReq.AppUsers.SelectedAppUser> selectedAppUser;

        /**
         * Gets the value of the selectedAppUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedAppUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedAppUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateApplicationServerReq.AppUsers.SelectedAppUser }
         * 
         * 
         */
        public List<UpdateApplicationServerReq.AppUsers.SelectedAppUser> getSelectedAppUser() {
            if (selectedAppUser == null) {
                selectedAppUser = new ArrayList<UpdateApplicationServerReq.AppUsers.SelectedAppUser>();
            }
            return this.selectedAppUser;
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
         *         &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
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
            "appUserName",
            "content"
        })
        public static class SelectedAppUser {

            protected XFkType appUserName;
            @XmlElementRef(name = "content", type = JAXBElement.class)
            protected JAXBElement<XContent> content;

            /**
             * Gets the value of the appUserName property.
             * 
             * @return
             *     possible object is
             *     {@link XFkType }
             *     
             */
            public XFkType getAppUserName() {
                return appUserName;
            }

            /**
             * Sets the value of the appUserName property.
             * 
             * @param value
             *     allowed object is
             *     {@link XFkType }
             *     
             */
            public void setAppUserName(XFkType value) {
                this.appUserName = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public JAXBElement<XContent> getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public void setContent(JAXBElement<XContent> value) {
                this.content = ((JAXBElement<XContent> ) value);
            }

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
     *         &lt;element name="selectedEndUser" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "selectedEndUser"
    })
    public static class EndUsers
        extends XCommonMembersExtension
    {

        protected List<UpdateApplicationServerReq.EndUsers.SelectedEndUser> selectedEndUser;

        /**
         * Gets the value of the selectedEndUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedEndUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedEndUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateApplicationServerReq.EndUsers.SelectedEndUser }
         * 
         * 
         */
        public List<UpdateApplicationServerReq.EndUsers.SelectedEndUser> getSelectedEndUser() {
            if (selectedEndUser == null) {
                selectedEndUser = new ArrayList<UpdateApplicationServerReq.EndUsers.SelectedEndUser>();
            }
            return this.selectedEndUser;
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
         *         &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
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
            "endUserName",
            "content"
        })
        public static class SelectedEndUser {

            protected XFkType endUserName;
            @XmlElementRef(name = "content", type = JAXBElement.class)
            protected JAXBElement<XContent> content;

            /**
             * Gets the value of the endUserName property.
             * 
             * @return
             *     possible object is
             *     {@link XFkType }
             *     
             */
            public XFkType getEndUserName() {
                return endUserName;
            }

            /**
             * Sets the value of the endUserName property.
             * 
             * @param value
             *     allowed object is
             *     {@link XFkType }
             *     
             */
            public void setEndUserName(XFkType value) {
                this.endUserName = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public JAXBElement<XContent> getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public void setContent(JAXBElement<XContent> value) {
                this.content = ((JAXBElement<XContent> ) value);
            }

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
     *         &lt;element name="selectedAppUser" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "selectedAppUser"
    })
    public static class RemoveAppUsers
        extends XCommonMembersExtension
    {

        protected List<UpdateApplicationServerReq.RemoveAppUsers.SelectedAppUser> selectedAppUser;

        /**
         * Gets the value of the selectedAppUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedAppUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedAppUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateApplicationServerReq.RemoveAppUsers.SelectedAppUser }
         * 
         * 
         */
        public List<UpdateApplicationServerReq.RemoveAppUsers.SelectedAppUser> getSelectedAppUser() {
            if (selectedAppUser == null) {
                selectedAppUser = new ArrayList<UpdateApplicationServerReq.RemoveAppUsers.SelectedAppUser>();
            }
            return this.selectedAppUser;
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
         *         &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
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
            "appUserName",
            "content"
        })
        public static class SelectedAppUser {

            protected XFkType appUserName;
            @XmlElementRef(name = "content", type = JAXBElement.class)
            protected JAXBElement<XContent> content;

            /**
             * Gets the value of the appUserName property.
             * 
             * @return
             *     possible object is
             *     {@link XFkType }
             *     
             */
            public XFkType getAppUserName() {
                return appUserName;
            }

            /**
             * Sets the value of the appUserName property.
             * 
             * @param value
             *     allowed object is
             *     {@link XFkType }
             *     
             */
            public void setAppUserName(XFkType value) {
                this.appUserName = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public JAXBElement<XContent> getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public void setContent(JAXBElement<XContent> value) {
                this.content = ((JAXBElement<XContent> ) value);
            }

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
     *         &lt;element name="selectedEndUser" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "selectedEndUser"
    })
    public static class RemoveEndUsers
        extends XCommonMembersExtension
    {

        protected List<UpdateApplicationServerReq.RemoveEndUsers.SelectedEndUser> selectedEndUser;

        /**
         * Gets the value of the selectedEndUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedEndUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedEndUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateApplicationServerReq.RemoveEndUsers.SelectedEndUser }
         * 
         * 
         */
        public List<UpdateApplicationServerReq.RemoveEndUsers.SelectedEndUser> getSelectedEndUser() {
            if (selectedEndUser == null) {
                selectedEndUser = new ArrayList<UpdateApplicationServerReq.RemoveEndUsers.SelectedEndUser>();
            }
            return this.selectedEndUser;
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
         *         &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.5}XContent" minOccurs="0"/>
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
            "endUserName",
            "content"
        })
        public static class SelectedEndUser {

            protected XFkType endUserName;
            @XmlElementRef(name = "content", type = JAXBElement.class)
            protected JAXBElement<XContent> content;

            /**
             * Gets the value of the endUserName property.
             * 
             * @return
             *     possible object is
             *     {@link XFkType }
             *     
             */
            public XFkType getEndUserName() {
                return endUserName;
            }

            /**
             * Sets the value of the endUserName property.
             * 
             * @param value
             *     allowed object is
             *     {@link XFkType }
             *     
             */
            public void setEndUserName(XFkType value) {
                this.endUserName = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public JAXBElement<XContent> getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
             *     
             */
            public void setContent(JAXBElement<XContent> value) {
                this.content = ((JAXBElement<XContent> ) value);
            }

        }

    }

}
