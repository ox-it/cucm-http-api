
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSoftKeyTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSoftKeyTemplateReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="softKeyTemplate" type="{http://www.cisco.com/AXL/API/8.5}XSoftKeyTemplate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSoftKeyTemplateReq", propOrder = {
    "softKeyTemplate"
})
public class AddSoftKeyTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSoftKeyTemplate softKeyTemplate;

    /**
     * Gets the value of the softKeyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XSoftKeyTemplate }
     *     
     */
    public XSoftKeyTemplate getSoftKeyTemplate() {
        return softKeyTemplate;
    }

    /**
     * Sets the value of the softKeyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSoftKeyTemplate }
     *     
     */
    public void setSoftKeyTemplate(XSoftKeyTemplate value) {
        this.softKeyTemplate = value;
    }

}
