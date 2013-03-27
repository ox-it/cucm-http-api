
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RApplicationServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RApplicationServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="appServerType" type="{http://www.cisco.com/AXL/API/8.0}XAppServer" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appUsers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="selectedAppUser" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                             &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.0}XContent" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endUserUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="endUsers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="selectedEndUser" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *                             &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.0}XContent" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RApplicationServer", propOrder = {
    "appServerType",
    "name",
    "ipAddress",
    "appUsers",
    "url",
    "endUserUrl",
    "processNodeName",
    "endUsers"
})
public class RApplicationServer {

    protected String appServerType;
    protected String name;
    protected String ipAddress;
    protected RApplicationServer.AppUsers appUsers;
    protected String url;
    protected String endUserUrl;
    protected XFkType processNodeName;
    protected RApplicationServer.EndUsers endUsers;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the appServerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppServerType() {
        return appServerType;
    }

    /**
     * Sets the value of the appServerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppServerType(String value) {
        this.appServerType = value;
    }

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
     * Gets the value of the appUsers property.
     * 
     * @return
     *     possible object is
     *     {@link RApplicationServer.AppUsers }
     *     
     */
    public RApplicationServer.AppUsers getAppUsers() {
        return appUsers;
    }

    /**
     * Sets the value of the appUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RApplicationServer.AppUsers }
     *     
     */
    public void setAppUsers(RApplicationServer.AppUsers value) {
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
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
    }

    /**
     * Gets the value of the endUsers property.
     * 
     * @return
     *     possible object is
     *     {@link RApplicationServer.EndUsers }
     *     
     */
    public RApplicationServer.EndUsers getEndUsers() {
        return endUsers;
    }

    /**
     * Sets the value of the endUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RApplicationServer.EndUsers }
     *     
     */
    public void setEndUsers(RApplicationServer.EndUsers value) {
        this.endUsers = value;
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
     *         &lt;element name="selectedAppUser" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.0}XContent" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "selectedAppUser"
    })
    public static class AppUsers {

        protected List<RApplicationServer.AppUsers.SelectedAppUser> selectedAppUser;

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
         * {@link RApplicationServer.AppUsers.SelectedAppUser }
         * 
         * 
         */
        public List<RApplicationServer.AppUsers.SelectedAppUser> getSelectedAppUser() {
            if (selectedAppUser == null) {
                selectedAppUser = new ArrayList<RApplicationServer.AppUsers.SelectedAppUser>();
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
         *         &lt;element name="appUserName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.0}XContent" minOccurs="0"/>
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
            protected XContent content;

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
             *     {@link XContent }
             *     
             */
            public XContent getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link XContent }
             *     
             */
            public void setContent(XContent value) {
                this.content = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="selectedEndUser" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
     *                   &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.0}XContent" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "selectedEndUser"
    })
    public static class EndUsers {

        protected List<RApplicationServer.EndUsers.SelectedEndUser> selectedEndUser;

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
         * {@link RApplicationServer.EndUsers.SelectedEndUser }
         * 
         * 
         */
        public List<RApplicationServer.EndUsers.SelectedEndUser> getSelectedEndUser() {
            if (selectedEndUser == null) {
                selectedEndUser = new ArrayList<RApplicationServer.EndUsers.SelectedEndUser>();
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
         *         &lt;element name="endUserName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
         *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.0}XContent" minOccurs="0"/>
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
            protected XContent content;

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
             *     {@link XContent }
             *     
             */
            public XContent getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link XContent }
             *     
             */
            public void setContent(XContent value) {
                this.content = value;
            }

        }

    }

}
