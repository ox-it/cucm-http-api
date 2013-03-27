
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddServiceParameterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddServiceParameterReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="serviceParameter" type="{http://www.cisco.com/AXL/API/8.0}XServiceParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddServiceParameterReq", propOrder = {
    "serviceParameter"
})
public class AddServiceParameterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XServiceParameter serviceParameter;

    /**
     * Gets the value of the serviceParameter property.
     * 
     * @return
     *     possible object is
     *     {@link XServiceParameter }
     *     
     */
    public XServiceParameter getServiceParameter() {
        return serviceParameter;
    }

    /**
     * Sets the value of the serviceParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XServiceParameter }
     *     
     */
    public void setServiceParameter(XServiceParameter value) {
        this.serviceParameter = value;
    }

}
