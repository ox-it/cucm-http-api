
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCiscoCatalyst6000T1VoIPGatewayPriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCiscoCatalyst6000T1VoIPGatewayPriReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.0}String100"/>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *         &lt;/choice>
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/8.0}RCiscoCatalyst6000T1VoIPGatewayPri" minOccurs="0"/>
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
@XmlType(name = "GetCiscoCatalyst6000T1VoIPGatewayPriReq", propOrder = {
    "name",
    "uuid",
    "returnedTags"
})
public class GetCiscoCatalyst6000T1VoIPGatewayPriReq {

    protected String name;
    protected String uuid;
    protected RCiscoCatalyst6000T1VoIPGatewayPri returnedTags;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

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
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link RCiscoCatalyst6000T1VoIPGatewayPri }
     *     
     */
    public RCiscoCatalyst6000T1VoIPGatewayPri getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCiscoCatalyst6000T1VoIPGatewayPri }
     *     
     */
    public void setReturnedTags(RCiscoCatalyst6000T1VoIPGatewayPri value) {
        this.returnedTags = value;
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

}
