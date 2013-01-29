
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddProcessNodeServiceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddProcessNodeServiceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="processNodeService" type="{http://www.cisco.com/AXL/API/8.5}XProcessNodeService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddProcessNodeServiceReq", propOrder = {
    "processNodeService"
})
public class AddProcessNodeServiceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XProcessNodeService processNodeService;

    /**
     * Gets the value of the processNodeService property.
     * 
     * @return
     *     possible object is
     *     {@link XProcessNodeService }
     *     
     */
    public XProcessNodeService getProcessNodeService() {
        return processNodeService;
    }

    /**
     * Sets the value of the processNodeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XProcessNodeService }
     *     
     */
    public void setProcessNodeService(XProcessNodeService value) {
        this.processNodeService = value;
    }

}
