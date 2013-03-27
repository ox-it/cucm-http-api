
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddApplicationToSoftkeyTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddApplicationToSoftkeyTemplateReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="applicationToSoftkeyTemplate" type="{http://www.cisco.com/AXL/API/8.0}XApplicationToSoftKeyTemplate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddApplicationToSoftkeyTemplateReq", propOrder = {
    "applicationToSoftkeyTemplate"
})
public class AddApplicationToSoftkeyTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XApplicationToSoftKeyTemplate applicationToSoftkeyTemplate;

    /**
     * Gets the value of the applicationToSoftkeyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XApplicationToSoftKeyTemplate }
     *     
     */
    public XApplicationToSoftKeyTemplate getApplicationToSoftkeyTemplate() {
        return applicationToSoftkeyTemplate;
    }

    /**
     * Sets the value of the applicationToSoftkeyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XApplicationToSoftKeyTemplate }
     *     
     */
    public void setApplicationToSoftkeyTemplate(XApplicationToSoftKeyTemplate value) {
        this.applicationToSoftkeyTemplate = value;
    }

}
