
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
 * <p>Java class for XGateway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGateway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XProduct"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/8.0}XDeviceProtocol"/>
 *         &lt;element name="callManagerGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="units" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="unit" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *                             &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPSlotModule"/>
 *                             &lt;element name="subunits" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="subunit" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *                                                 &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic"/>
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
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/8.0}XVendorConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGateway", propOrder = {
    "domainName",
    "description",
    "product",
    "protocol",
    "callManagerGroupName",
    "units",
    "vendorConfig"
})
public class XGateway {

    protected String domainName;
    protected String description;
    @XmlElementRef(name = "product", type = JAXBElement.class)
    protected JAXBElement<String> product;
    @XmlElement(defaultValue = "MGCP")
    protected String protocol;
    @XmlElementRef(name = "callManagerGroupName", type = JAXBElement.class)
    protected JAXBElement<XFkType> callManagerGroupName;
    protected XGateway.Units units;
    @XmlElementRef(name = "vendorConfig", type = JAXBElement.class)
    protected JAXBElement<XVendorConfig> vendorConfig;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct(JAXBElement<String> value) {
        this.product = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallManagerGroupName() {
        return callManagerGroupName;
    }

    /**
     * Sets the value of the callManagerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallManagerGroupName(JAXBElement<XFkType> value) {
        this.callManagerGroupName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link XGateway.Units }
     *     
     */
    public XGateway.Units getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGateway.Units }
     *     
     */
    public void setUnits(XGateway.Units value) {
        this.units = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XVendorConfig }{@code >}
     *     
     */
    public JAXBElement<XVendorConfig> getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XVendorConfig }{@code >}
     *     
     */
    public void setVendorConfig(JAXBElement<XVendorConfig> value) {
        this.vendorConfig = ((JAXBElement<XVendorConfig> ) value);
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
     *         &lt;element name="unit" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
     *                   &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPSlotModule"/>
     *                   &lt;element name="subunits" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="subunit" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
     *                                       &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic"/>
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

        protected List<XGateway.Units.Unit> unit;

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
         * {@link XGateway.Units.Unit }
         * 
         * 
         */
        public List<XGateway.Units.Unit> getUnit() {
            if (unit == null) {
                unit = new ArrayList<XGateway.Units.Unit>();
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
         *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPSlotModule"/>
         *         &lt;element name="subunits" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="subunit" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
         *                             &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic"/>
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

            @XmlElement(defaultValue = "0")
            protected String index;
            @XmlElementRef(name = "product", type = JAXBElement.class)
            protected JAXBElement<String> product;
            protected XGateway.Units.Unit.Subunits subunits;

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
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getProduct() {
                return product;
            }

            /**
             * Sets the value of the product property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setProduct(JAXBElement<String> value) {
                this.product = ((JAXBElement<String> ) value);
            }

            /**
             * Gets the value of the subunits property.
             * 
             * @return
             *     possible object is
             *     {@link XGateway.Units.Unit.Subunits }
             *     
             */
            public XGateway.Units.Unit.Subunits getSubunits() {
                return subunits;
            }

            /**
             * Sets the value of the subunits property.
             * 
             * @param value
             *     allowed object is
             *     {@link XGateway.Units.Unit.Subunits }
             *     
             */
            public void setSubunits(XGateway.Units.Unit.Subunits value) {
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
             *         &lt;element name="subunit" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="index" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
             *                   &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic"/>
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

                protected List<XGateway.Units.Unit.Subunits.Subunit> subunit;

                /**
                 * Gets the value of the subunit property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the subunit property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSubunit().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link XGateway.Units.Unit.Subunits.Subunit }
                 * 
                 * 
                 */
                public List<XGateway.Units.Unit.Subunits.Subunit> getSubunit() {
                    if (subunit == null) {
                        subunit = new ArrayList<XGateway.Units.Unit.Subunits.Subunit>();
                    }
                    return this.subunit;
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
                 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/8.0}XMGCPVic"/>
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

                    @XmlElementRef(name = "index", type = JAXBElement.class)
                    protected JAXBElement<String> index;
                    @XmlElementRef(name = "product", type = JAXBElement.class)
                    protected JAXBElement<String> product;
                    @XmlElementRef(name = "beginPort", type = JAXBElement.class)
                    protected JAXBElement<String> beginPort;

                    /**
                     * Gets the value of the index property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getIndex() {
                        return index;
                    }

                    /**
                     * Sets the value of the index property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setIndex(JAXBElement<String> value) {
                        this.index = ((JAXBElement<String> ) value);
                    }

                    /**
                     * Gets the value of the product property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getProduct() {
                        return product;
                    }

                    /**
                     * Sets the value of the product property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setProduct(JAXBElement<String> value) {
                        this.product = ((JAXBElement<String> ) value);
                    }

                    /**
                     * Gets the value of the beginPort property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getBeginPort() {
                        return beginPort;
                    }

                    /**
                     * Sets the value of the beginPort property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setBeginPort(JAXBElement<String> value) {
                        this.beginPort = ((JAXBElement<String> ) value);
                    }

                }

            }

        }

    }

}
