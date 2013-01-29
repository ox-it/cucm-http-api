
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddApplicationDialRulesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddApplicationDialRulesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="applicationDialRules" type="{http://www.cisco.com/AXL/API/8.5}XApplicationDialRules"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddApplicationDialRulesReq", propOrder = {
    "applicationDialRules"
})
public class AddApplicationDialRulesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XApplicationDialRules applicationDialRules;

    /**
     * Gets the value of the applicationDialRules property.
     * 
     * @return
     *     possible object is
     *     {@link XApplicationDialRules }
     *     
     */
    public XApplicationDialRules getApplicationDialRules() {
        return applicationDialRules;
    }

    /**
     * Sets the value of the applicationDialRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link XApplicationDialRules }
     *     
     */
    public void setApplicationDialRules(XApplicationDialRules value) {
        this.applicationDialRules = value;
    }

}
