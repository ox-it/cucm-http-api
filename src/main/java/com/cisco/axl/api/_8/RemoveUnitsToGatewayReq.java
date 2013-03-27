
package com.cisco.axl.api._8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveUnitsToGatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveUnitsToGatewayReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="gatewayUuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="units">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="unit" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
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
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveUnitsToGatewayReq", propOrder = {
    "gatewayUuid",
    "domainName",
    "units"
})
public class RemoveUnitsToGatewayReq {

    protected String gatewayUuid;
    protected String domainName;
    @XmlElement(required = true)
    protected RemoveUnitsToGatewayReq.Units units;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

    /**
     * Gets the value of the gatewayUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayUuid() {
        return gatewayUuid;
    }

    /**
     * Sets the value of the gatewayUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayUuid(String value) {
        this.gatewayUuid = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveUnitsToGatewayReq.Units }
     *     
     */
    public RemoveUnitsToGatewayReq.Units getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveUnitsToGatewayReq.Units }
     *     
     */
    public void setUnits(RemoveUnitsToGatewayReq.Units value) {
        this.units = value;
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
     *         &lt;element name="unit" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
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
        "unit"
    })
    public static class Units {

        @XmlElement(required = true)
        protected List<RemoveUnitsToGatewayReq.Units.Unit> unit;

        /**
         * Gets the value of the unit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RemoveUnitsToGatewayReq.Units.Unit }
         * 
         * 
         */
        public List<RemoveUnitsToGatewayReq.Units.Unit> getUnit() {
            if (unit == null) {
                unit = new ArrayList<RemoveUnitsToGatewayReq.Units.Unit>();
            }
            return this.unit;
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
         *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
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
            "index"
        })
        public static class Unit {

            @XmlElement(defaultValue = "0")
            protected String index;

            /**
             * Gets the value of the index property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndex() {
                return index;
            }

            /**
             * Sets the value of the index property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndex(String value) {
                this.index = value;
            }

        }

    }

}
