
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XImeClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XImeClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String50"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.cisco.com/AXL/API/8.5}String255"/>
 *         &lt;element name="isActivated" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="sipTrunkName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="primaryImeServerName" type="{http://www.cisco.com/AXL/API/8.5}XFkType"/>
 *         &lt;element name="secondaryImeServerName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="learnedRouteFilterGroupName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="exclusionNumberGroupName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="firewallName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *         &lt;element name="members" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.5}XImeClientMember" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ccmExternalIpMaps" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/8.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="ccmExternalIpMap" type="{http://www.cisco.com/AXL/API/8.5}XCcmExternalIpMap" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "XImeClient", propOrder = {
    "name",
    "description",
    "domain",
    "isActivated",
    "sipTrunkName",
    "primaryImeServerName",
    "secondaryImeServerName",
    "learnedRouteFilterGroupName",
    "exclusionNumberGroupName",
    "firewallName",
    "members",
    "ccmExternalIpMaps"
})
public class XImeClient {

    protected String name;
    protected String description;
    protected String domain;
    @XmlElement(defaultValue = "false")
    protected String isActivated;
    protected XFkType sipTrunkName;
    protected XFkType primaryImeServerName;
    @XmlElementRef(name = "secondaryImeServerName", type = JAXBElement.class)
    protected JAXBElement<XFkType> secondaryImeServerName;
    @XmlElementRef(name = "learnedRouteFilterGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> learnedRouteFilterGroupName;
    @XmlElementRef(name = "exclusionNumberGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> exclusionNumberGroupName;
    @XmlElementRef(name = "firewallName", type = JAXBElement.class)
    protected JAXBElement<XFkType> firewallName;
    protected XImeClient.Members members;
    protected XImeClient.CcmExternalIpMaps ccmExternalIpMaps;

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
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the isActivated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActivated() {
        return isActivated;
    }

    /**
     * Sets the value of the isActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActivated(String value) {
        this.isActivated = value;
    }

    /**
     * Gets the value of the sipTrunkName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipTrunkName() {
        return sipTrunkName;
    }

    /**
     * Sets the value of the sipTrunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipTrunkName(XFkType value) {
        this.sipTrunkName = value;
    }

    /**
     * Gets the value of the primaryImeServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPrimaryImeServerName() {
        return primaryImeServerName;
    }

    /**
     * Sets the value of the primaryImeServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPrimaryImeServerName(XFkType value) {
        this.primaryImeServerName = value;
    }

    /**
     * Gets the value of the secondaryImeServerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSecondaryImeServerName() {
        return secondaryImeServerName;
    }

    /**
     * Sets the value of the secondaryImeServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSecondaryImeServerName(JAXBElement<XFkType> value) {
        this.secondaryImeServerName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the learnedRouteFilterGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLearnedRouteFilterGroupName() {
        return learnedRouteFilterGroupName;
    }

    /**
     * Sets the value of the learnedRouteFilterGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLearnedRouteFilterGroupName(JAXBElement<XFkType> value) {
        this.learnedRouteFilterGroupName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the exclusionNumberGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getExclusionNumberGroupName() {
        return exclusionNumberGroupName;
    }

    /**
     * Sets the value of the exclusionNumberGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setExclusionNumberGroupName(JAXBElement<XFkType> value) {
        this.exclusionNumberGroupName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the firewallName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getFirewallName() {
        return firewallName;
    }

    /**
     * Sets the value of the firewallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setFirewallName(JAXBElement<XFkType> value) {
        this.firewallName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link XImeClient.Members }
     *     
     */
    public XImeClient.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeClient.Members }
     *     
     */
    public void setMembers(XImeClient.Members value) {
        this.members = value;
    }

    /**
     * Gets the value of the ccmExternalIpMaps property.
     * 
     * @return
     *     possible object is
     *     {@link XImeClient.CcmExternalIpMaps }
     *     
     */
    public XImeClient.CcmExternalIpMaps getCcmExternalIpMaps() {
        return ccmExternalIpMaps;
    }

    /**
     * Sets the value of the ccmExternalIpMaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeClient.CcmExternalIpMaps }
     *     
     */
    public void setCcmExternalIpMaps(XImeClient.CcmExternalIpMaps value) {
        this.ccmExternalIpMaps = value;
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
     *         &lt;element name="ccmExternalIpMap" type="{http://www.cisco.com/AXL/API/8.5}XCcmExternalIpMap" maxOccurs="unbounded" minOccurs="0"/>
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
        "ccmExternalIpMap"
    })
    public static class CcmExternalIpMaps
        extends XCommonMembersExtension
    {

        protected List<XCcmExternalIpMap> ccmExternalIpMap;

        /**
         * Gets the value of the ccmExternalIpMap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ccmExternalIpMap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCcmExternalIpMap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XCcmExternalIpMap }
         * 
         * 
         */
        public List<XCcmExternalIpMap> getCcmExternalIpMap() {
            if (ccmExternalIpMap == null) {
                ccmExternalIpMap = new ArrayList<XCcmExternalIpMap>();
            }
            return this.ccmExternalIpMap;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/8.5}XImeClientMember" maxOccurs="unbounded"/>
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
        "member"
    })
    public static class Members
        extends XCommonMembersExtension
    {

        protected List<XImeClientMember> member;

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XImeClientMember }
         * 
         * 
         */
        public List<XImeClientMember> getMember() {
            if (member == null) {
                member = new ArrayList<XImeClientMember>();
            }
            return this.member;
        }

    }

}
