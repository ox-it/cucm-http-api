
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipDialRulesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipDialRulesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sipDialRules" type="{http://www.cisco.com/AXL/API/8.0}XSipDialRules"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipDialRulesReq", propOrder = {
    "sipDialRules"
})
public class AddSipDialRulesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipDialRules sipDialRules;

    /**
     * Gets the value of the sipDialRules property.
     * 
     * @return
     *     possible object is
     *     {@link XSipDialRules }
     *     
     */
    public XSipDialRules getSipDialRules() {
        return sipDialRules;
    }

    /**
     * Sets the value of the sipDialRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipDialRules }
     *     
     */
    public void setSipDialRules(XSipDialRules value) {
        this.sipDialRules = value;
    }

}
