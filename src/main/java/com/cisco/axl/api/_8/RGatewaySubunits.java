
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGatewaySubunits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGatewaySubunits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice minOccurs="0">
 *           &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="gatewayUuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="unit" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="subunits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="subunit" maxOccurs="unbounded" minOccurs="0">
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
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGatewaySubunits", propOrder = {
    "domainName",
    "gatewayUuid",
    "unit",
    "subunits"
})
public class RGatewaySubunits {

    protected String domainName;
    protected String gatewayUuid;
    protected String unit;
    protected RGatewaySubunits.Subunits subunits;
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
     *     {@link RGatewaySubunits.Subunits }
     *     
     */
    public RGatewaySubunits.Subunits getSubunits() {
        return subunits;
    }

    /**
     * Sets the value of the subunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGatewaySubunits.Subunits }
     *     
     */
    public void setSubunits(RGatewaySubunits.Subunits value) {
        this.subunits = value;
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
     *         &lt;element name="subunit" maxOccurs="unbounded" minOccurs="0">
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

        protected List<RGatewaySubunits.Subunits.Subunit> subunit;

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
         * {@link RGatewaySubunits.Subunits.Subunit }
         * 
         * 
         */
        public List<RGatewaySubunits.Subunits.Subunit> getSubunit() {
            if (subunit == null) {
                subunit = new ArrayList<RGatewaySubunits.Subunits.Subunit>();
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
