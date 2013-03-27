
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeApplicationToSoftkeyTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeApplicationToSoftkeyTemplateReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="softKeyTemplateName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="applicationName" type="{http://www.cisco.com/AXL/API/8.0}String100"/>
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
@XmlType(name = "removeApplicationToSoftkeyTemplateReq", propOrder = {
    "softKeyTemplateName",
    "applicationName"
})
public class RemoveApplicationToSoftkeyTemplateReq {

    @XmlElement(required = true)
    protected XFkType softKeyTemplateName;
    @XmlElement(required = true)
    protected String applicationName;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

    /**
     * Gets the value of the softKeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftKeyTemplateName() {
        return softKeyTemplateName;
    }

    /**
     * Sets the value of the softKeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftKeyTemplateName(XFkType value) {
        this.softKeyTemplateName = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
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
