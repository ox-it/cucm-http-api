
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LVg224 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LVg224">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XProduct" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/8.0}XDeviceProtocol" minOccurs="0"/>
 *         &lt;element name="callManagerGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="units" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="unit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *                             &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPSlotModule" minOccurs="0"/>
 *                             &lt;element name="subunits" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="subunit" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *                                                 &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic" minOccurs="0"/>
 *                                                 &lt;element name="beginPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlType(name = "LVg224", propOrder = {
    "domainName",
    "description",
    "product",
    "protocol",
    "callManagerGroupName",
    "units"
})
public class LVg224 {

    protected String domainName;
    protected String description;
    protected String product;
    protected String protocol;
    protected XFkType callManagerGroupName;
    protected LVg224 .Units units;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the callManagerGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallManagerGroupName() {
        return callManagerGroupName;
    }

    /**
     * Sets the value of the callManagerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallManagerGroupName(XFkType value) {
        this.callManagerGroupName = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link LVg224 .Units }
     *     
     */
    public LVg224 .Units getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link LVg224 .Units }
     *     
     */
    public void setUnits(LVg224 .Units value) {
        this.units = value;
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
     *         &lt;element name="unit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
     *                   &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPSlotModule" minOccurs="0"/>
     *                   &lt;element name="subunits" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="subunit" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
     *                                       &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic" minOccurs="0"/>
     *                                       &lt;element name="beginPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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

        protected LVg224 .Units.Unit unit;

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link LVg224 .Units.Unit }
         *     
         */
        public LVg224 .Units.Unit getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link LVg224 .Units.Unit }
         *     
         */
        public void setUnit(LVg224 .Units.Unit value) {
            this.unit = value;
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
         *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
         *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPSlotModule" minOccurs="0"/>
         *         &lt;element name="subunits" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="subunit" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
         *                             &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic" minOccurs="0"/>
         *                             &lt;element name="beginPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "index",
            "product",
            "subunits"
        })
        public static class Unit {

            protected String index;
            protected String product;
            protected LVg224 .Units.Unit.Subunits subunits;

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

            /**
             * Gets the value of the product property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProduct() {
                return product;
            }

            /**
             * Sets the value of the product property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProduct(String value) {
                this.product = value;
            }

            /**
             * Gets the value of the subunits property.
             * 
             * @return
             *     possible object is
             *     {@link LVg224 .Units.Unit.Subunits }
             *     
             */
            public LVg224 .Units.Unit.Subunits getSubunits() {
                return subunits;
            }

            /**
             * Sets the value of the subunits property.
             * 
             * @param value
             *     allowed object is
             *     {@link LVg224 .Units.Unit.Subunits }
             *     
             */
            public void setSubunits(LVg224 .Units.Unit.Subunits value) {
                this.subunits = value;
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
             *         &lt;element name="subunit" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
             *                   &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic" minOccurs="0"/>
             *                   &lt;element name="beginPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
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
                "subunit"
            })
            public static class Subunits {

                protected LVg224 .Units.Unit.Subunits.Subunit subunit;

                /**
                 * Gets the value of the subunit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LVg224 .Units.Unit.Subunits.Subunit }
                 *     
                 */
                public LVg224 .Units.Unit.Subunits.Subunit getSubunit() {
                    return subunit;
                }

                /**
                 * Sets the value of the subunit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LVg224 .Units.Unit.Subunits.Subunit }
                 *     
                 */
                public void setSubunit(LVg224 .Units.Unit.Subunits.Subunit value) {
                    this.subunit = value;
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
                 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
                 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic" minOccurs="0"/>
                 *         &lt;element name="beginPort" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
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
                    "index",
                    "product",
                    "beginPort"
                })
                public static class Subunit {

                    protected String index;
                    protected String product;
                    protected String beginPort;

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

                    /**
                     * Gets the value of the product property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProduct() {
                        return product;
                    }

                    /**
                     * Sets the value of the product property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProduct(String value) {
                        this.product = value;
                    }

                    /**
                     * Gets the value of the beginPort property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBeginPort() {
                        return beginPort;
                    }

                    /**
                     * Sets the value of the beginPort property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBeginPort(String value) {
                        this.beginPort = value;
                    }

                }

            }

        }

    }

}
