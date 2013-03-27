
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveVoiceMailPilotReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveVoiceMailPilotReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="dirn" type="{http://www.cisco.com/AXL/API/8.0}String255"/>
 *             &lt;element name="cssName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
@XmlType(name = "RemoveVoiceMailPilotReq", propOrder = {
    "uuid",
    "dirn",
    "cssName"
})
public class RemoveVoiceMailPilotReq {

    protected String uuid;
    @XmlElementRef(name = "dirn", type = JAXBElement.class)
    protected JAXBElement<String> dirn;
    @XmlElementRef(name = "cssName", type = JAXBElement.class)
    protected JAXBElement<XFkType> cssName;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

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
     * Gets the value of the dirn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirn() {
        return dirn;
    }

    /**
     * Sets the value of the dirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirn(JAXBElement<String> value) {
        this.dirn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cssName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCssName() {
        return cssName;
    }

    /**
     * Sets the value of the cssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCssName(JAXBElement<XFkType> value) {
        this.cssName = ((JAXBElement<XFkType> ) value);
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
