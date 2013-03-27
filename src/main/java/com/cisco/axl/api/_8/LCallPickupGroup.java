
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LCallPickupGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCallPickupGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/8.0}XPatternUsage" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}Name" minOccurs="0"/>
 *         &lt;element name="pickupNotification" type="{http://www.cisco.com/AXL/API/8.0}XPickupNotification" minOccurs="0"/>
 *         &lt;element name="pickupNotificationTimer" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="callInfoForPickupNotification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="callingPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *                   &lt;element name="calledPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
@XmlType(name = "LCallPickupGroup", propOrder = {
    "pattern",
    "description",
    "usage",
    "routePartitionName",
    "name",
    "pickupNotification",
    "pickupNotificationTimer",
    "callInfoForPickupNotification"
})
public class LCallPickupGroup {

    protected String pattern;
    protected String description;
    protected String usage;
    protected XFkType routePartitionName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String name;
    protected String pickupNotification;
    protected String pickupNotificationTimer;
    protected LCallPickupGroup.CallInfoForPickupNotification callInfoForPickupNotification;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRoutePartitionName(XFkType value) {
        this.routePartitionName = value;
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
     * Gets the value of the pickupNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNotification() {
        return pickupNotification;
    }

    /**
     * Sets the value of the pickupNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNotification(String value) {
        this.pickupNotification = value;
    }

    /**
     * Gets the value of the pickupNotificationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNotificationTimer() {
        return pickupNotificationTimer;
    }

    /**
     * Sets the value of the pickupNotificationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNotificationTimer(String value) {
        this.pickupNotificationTimer = value;
    }

    /**
     * Gets the value of the callInfoForPickupNotification property.
     * 
     * @return
     *     possible object is
     *     {@link LCallPickupGroup.CallInfoForPickupNotification }
     *     
     */
    public LCallPickupGroup.CallInfoForPickupNotification getCallInfoForPickupNotification() {
        return callInfoForPickupNotification;
    }

    /**
     * Sets the value of the callInfoForPickupNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCallPickupGroup.CallInfoForPickupNotification }
     *     
     */
    public void setCallInfoForPickupNotification(LCallPickupGroup.CallInfoForPickupNotification value) {
        this.callInfoForPickupNotification = value;
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
     *         &lt;element name="callingPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
     *         &lt;element name="calledPartyInfo" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
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
        "callingPartyInfo",
        "calledPartyInfo"
    })
    public static class CallInfoForPickupNotification {

        protected String callingPartyInfo;
        protected String calledPartyInfo;

        /**
         * Gets the value of the callingPartyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallingPartyInfo() {
            return callingPartyInfo;
        }

        /**
         * Sets the value of the callingPartyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallingPartyInfo(String value) {
            this.callingPartyInfo = value;
        }

        /**
         * Gets the value of the calledPartyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalledPartyInfo() {
            return calledPartyInfo;
        }

        /**
         * Sets the value of the calledPartyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalledPartyInfo(String value) {
            this.calledPartyInfo = value;
        }

    }

}
