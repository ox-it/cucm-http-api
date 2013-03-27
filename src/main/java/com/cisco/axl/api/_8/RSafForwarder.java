
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSafForwarder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSafForwarder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="clientLabel" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="safSecurityProfile" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="safReconnectInterval" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="safNotificationsWindowSize" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="associatedCucms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}RSafForwarderMember" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RSafForwarder", propOrder = {
    "name",
    "description",
    "clientLabel",
    "safSecurityProfile",
    "ipAddress",
    "port",
    "safReconnectInterval",
    "safNotificationsWindowSize",
    "associatedCucms"
})
public class RSafForwarder {

    protected String name;
    protected String description;
    protected String clientLabel;
    protected XFkType safSecurityProfile;
    protected String ipAddress;
    protected String port;
    protected String safReconnectInterval;
    protected String safNotificationsWindowSize;
    protected RSafForwarder.AssociatedCucms associatedCucms;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the associatedCucms property.
     * 
     * @return
     *     possible object is
     *     {@link RSafForwarder.AssociatedCucms }
     *     
     */
    public RSafForwarder.AssociatedCucms getAssociatedCucms() {
        return associatedCucms;
    }

    /**
     * Sets the value of the associatedCucms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSafForwarder.AssociatedCucms }
     *     
     */
    public void setAssociatedCucms(RSafForwarder.AssociatedCucms value) {
        this.associatedCucms = value;
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
     *         &lt;element name="associatedCucm" type="{http://www.cisco.com/AXL/API/8.0}RSafForwarderMember" maxOccurs="unbounded" minOccurs="0"/>
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
        "associatedCucm"
    })
    public static class AssociatedCucms {

        protected List<RSafForwarderMember> associatedCucm;

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
         * {@link RSafForwarderMember }
         * 
         * 
         */
        public List<RSafForwarderMember> getAssociatedCucm() {
            if (associatedCucm == null) {
                associatedCucm = new ArrayList<RSafForwarderMember>();
            }
            return this.associatedCucm;
        }

    }

}
