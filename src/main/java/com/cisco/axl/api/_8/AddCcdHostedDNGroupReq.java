
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCcdHostedDNGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCcdHostedDNGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ccdHostedDNGroup" type="{http://www.cisco.com/AXL/API/8.5}XCcdHostedDNGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCcdHostedDNGroupReq", propOrder = {
    "ccdHostedDNGroup"
})
public class AddCcdHostedDNGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCcdHostedDNGroup ccdHostedDNGroup;

    /**
     * Gets the value of the ccdHostedDNGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XCcdHostedDNGroup }
     *     
     */
    public XCcdHostedDNGroup getCcdHostedDNGroup() {
        return ccdHostedDNGroup;
    }

    /**
     * Sets the value of the ccdHostedDNGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCcdHostedDNGroup }
     *     
     */
    public void setCcdHostedDNGroup(XCcdHostedDNGroup value) {
        this.ccdHostedDNGroup = value;
    }

}
