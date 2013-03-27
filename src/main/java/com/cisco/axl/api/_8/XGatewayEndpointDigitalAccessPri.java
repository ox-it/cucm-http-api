
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XGatewayEndpointDigitalAccessPri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGatewayEndpointDigitalAccessPri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="gatewayUuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *         &lt;/choice>
 *         &lt;element name="unit" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="subunit" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/8.0}XGatewayEndpointDigitalPri"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGatewayEndpointDigitalAccessPri", propOrder = {
    "domainName",
    "gatewayUuid",
    "unit",
    "subunit",
    "endpoint"
})
public class XGatewayEndpointDigitalAccessPri {

    protected String domainName;
    protected String gatewayUuid;
    protected String unit;
    protected String subunit;
    protected XGatewayEndpointDigitalPri endpoint;

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
     * Gets the value of the subunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubunit() {
        return subunit;
    }

    /**
     * Sets the value of the subunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubunit(String value) {
        this.subunit = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalPri }
     *     
     */
    public XGatewayEndpointDigitalPri getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalPri }
     *     
     */
    public void setEndpoint(XGatewayEndpointDigitalPri value) {
        this.endpoint = value;
    }

}
