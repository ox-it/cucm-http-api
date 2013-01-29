
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMlppDomainReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMlppDomainReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="mlppDomain" type="{http://www.cisco.com/AXL/API/8.5}XMlppDomain"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMlppDomainReq", propOrder = {
    "mlppDomain"
})
public class AddMlppDomainReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMlppDomain mlppDomain;

    /**
     * Gets the value of the mlppDomain property.
     * 
     * @return
     *     possible object is
     *     {@link XMlppDomain }
     *     
     */
    public XMlppDomain getMlppDomain() {
        return mlppDomain;
    }

    /**
     * Sets the value of the mlppDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMlppDomain }
     *     
     */
    public void setMlppDomain(XMlppDomain value) {
        this.mlppDomain = value;
    }

}
