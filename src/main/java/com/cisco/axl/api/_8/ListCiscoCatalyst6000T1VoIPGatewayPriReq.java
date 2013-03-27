
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCiscoCatalyst6000T1VoIPGatewayPriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCiscoCatalyst6000T1VoIPGatewayPriReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="callingSearchSpaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="devicePoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/8.0}LCiscoCatalyst6000T1VoIPGatewayPri"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListCiscoCatalyst6000T1VoIPGatewayPriReq", propOrder = {
    "searchCriteria",
    "returnedTags",
    "skip",
    "first"
})
public class ListCiscoCatalyst6000T1VoIPGatewayPriReq {

    @XmlElement(required = true)
    protected ListCiscoCatalyst6000T1VoIPGatewayPriReq.SearchCriteria searchCriteria;
    @XmlElement(required = true)
    protected LCiscoCatalyst6000T1VoIPGatewayPri returnedTags;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger skip;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger first;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ListCiscoCatalyst6000T1VoIPGatewayPriReq.SearchCriteria }
     *     
     */
    public ListCiscoCatalyst6000T1VoIPGatewayPriReq.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCiscoCatalyst6000T1VoIPGatewayPriReq.SearchCriteria }
     *     
     */
    public void setSearchCriteria(ListCiscoCatalyst6000T1VoIPGatewayPriReq.SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link LCiscoCatalyst6000T1VoIPGatewayPri }
     *     
     */
    public LCiscoCatalyst6000T1VoIPGatewayPri getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCiscoCatalyst6000T1VoIPGatewayPri }
     *     
     */
    public void setReturnedTags(LCiscoCatalyst6000T1VoIPGatewayPri value) {
        this.returnedTags = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkip(BigInteger value) {
        this.skip = value;
    }

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirst(BigInteger value) {
        this.first = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
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
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="callingSearchSpaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="devicePoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "name",
        "description",
        "callingSearchSpaceName",
        "devicePoolName"
    })
    public static class SearchCriteria {

        protected String name;
        protected String description;
        protected String callingSearchSpaceName;
        protected String devicePoolName;

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
         * Gets the value of the callingSearchSpaceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallingSearchSpaceName() {
            return callingSearchSpaceName;
        }

        /**
         * Sets the value of the callingSearchSpaceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallingSearchSpaceName(String value) {
            this.callingSearchSpaceName = value;
        }

        /**
         * Gets the value of the devicePoolName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDevicePoolName() {
            return devicePoolName;
        }

        /**
         * Sets the value of the devicePoolName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDevicePoolName(String value) {
            this.devicePoolName = value;
        }

    }

}
