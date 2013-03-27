
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
 * <p>Java class for XGatewaySubunits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGatewaySubunits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="gatewayUuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *         &lt;/choice>
 *         &lt;element name="unit" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="subunits">
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
@XmlType(name = "XGatewaySubunits", propOrder = {
    "domainName",
    "gatewayUuid",
    "unit",
    "subunits"
})
public class XGatewaySubunits {

    protected String domainName;
    protected String gatewayUuid;
    @XmlElement(defaultValue = "0")
    protected String unit;
    protected XGatewaySubunits.Subunits subunits;

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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the subunits property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewaySubunits.Subunits }
     *     
     */
    public XGatewaySubunits.Subunits getSubunits() {
        return subunits;
    }

    /**
     * Sets the value of the subunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewaySubunits.Subunits }
     *     
     */
    public void setSubunits(XGatewaySubunits.Subunits value) {
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

        protected List<XGatewaySubunits.Subunits.Subunit> subunit;

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
         * {@link XGatewaySubunits.Subunits.Subunit }
         * 
         * 
         */
        public List<XGatewaySubunits.Subunits.Subunit> getSubunit() {
            if (subunit == null) {
                subunit = new ArrayList<XGatewaySubunits.Subunits.Subunit>();
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
