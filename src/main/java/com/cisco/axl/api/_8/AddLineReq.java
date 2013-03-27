
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLineReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLineReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://www.cisco.com/AXL/API/8.0}XLine"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLineReq", propOrder = {
    "line"
})
public class AddLineReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLine line;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link XLine }
     *     
     */
    public XLine getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLine }
     *     
     */
    public void setLine(XLine value) {
        this.line = value;
    }

}
