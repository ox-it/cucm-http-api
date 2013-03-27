
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XVpnGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XVpnGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String50"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpnGateways" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="vpnGateway" type="{http://www.cisco.com/AXL/API/8.0}XVpnGroupMember" maxOccurs="3" minOccurs="0"/>
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
@XmlType(name = "XVpnGroup", propOrder = {
    "name",
    "description",
    "vpnGateways"
})
public class XVpnGroup {

    protected String name;
    protected String description;
    protected XVpnGroup.VpnGateways vpnGateways;

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
     * Gets the value of the vpnGateways property.
     * 
     * @return
     *     possible object is
     *     {@link XVpnGroup.VpnGateways }
     *     
     */
    public XVpnGroup.VpnGateways getVpnGateways() {
        return vpnGateways;
    }

    /**
     * Sets the value of the vpnGateways property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVpnGroup.VpnGateways }
     *     
     */
    public void setVpnGateways(XVpnGroup.VpnGateways value) {
        this.vpnGateways = value;
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
     *         &lt;element name="vpnGateway" type="{http://www.cisco.com/AXL/API/8.0}XVpnGroupMember" maxOccurs="3" minOccurs="0"/>
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
        "vpnGateway"
    })
    public static class VpnGateways {

        protected List<XVpnGroupMember> vpnGateway;

        /**
         * Gets the value of the vpnGateway property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vpnGateway property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVpnGateway().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XVpnGroupMember }
         * 
         * 
         */
        public List<XVpnGroupMember> getVpnGateway() {
            if (vpnGateway == null) {
                vpnGateway = new ArrayList<XVpnGroupMember>();
            }
            return this.vpnGateway;
        }

    }

}
