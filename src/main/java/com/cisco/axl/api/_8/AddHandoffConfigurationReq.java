
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddHandoffConfigurationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddHandoffConfigurationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="handoffConfiguration" type="{http://www.cisco.com/AXL/API/8.5}XHandoffConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddHandoffConfigurationReq", propOrder = {
    "handoffConfiguration"
})
public class AddHandoffConfigurationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XHandoffConfiguration handoffConfiguration;

    /**
     * Gets the value of the handoffConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link XHandoffConfiguration }
     *     
     */
    public XHandoffConfiguration getHandoffConfiguration() {
        return handoffConfiguration;
    }

    /**
     * Sets the value of the handoffConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHandoffConfiguration }
     *     
     */
    public void setHandoffConfiguration(XHandoffConfiguration value) {
        this.handoffConfiguration = value;
    }

}
