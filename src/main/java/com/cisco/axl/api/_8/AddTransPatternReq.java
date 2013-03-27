
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTransPatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTransPatternReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/8.0}XTransPattern"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTransPatternReq", propOrder = {
    "transPattern"
})
public class AddTransPatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTransPattern transPattern;

    /**
     * Gets the value of the transPattern property.
     * 
     * @return
     *     possible object is
     *     {@link XTransPattern }
     *     
     */
    public XTransPattern getTransPattern() {
        return transPattern;
    }

    /**
     * Sets the value of the transPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTransPattern }
     *     
     */
    public void setTransPattern(XTransPattern value) {
        this.transPattern = value;
    }

}
