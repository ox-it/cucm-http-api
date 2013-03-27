
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCallManagerGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCallManagerGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="callManagerGroup" type="{http://www.cisco.com/AXL/API/8.0}XCallManagerGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCallManagerGroupReq", propOrder = {
    "callManagerGroup"
})
public class AddCallManagerGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCallManagerGroup callManagerGroup;

    /**
     * Gets the value of the callManagerGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XCallManagerGroup }
     *     
     */
    public XCallManagerGroup getCallManagerGroup() {
        return callManagerGroup;
    }

    /**
     * Sets the value of the callManagerGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallManagerGroup }
     *     
     */
    public void setCallManagerGroup(XCallManagerGroup value) {
        this.callManagerGroup = value;
    }

}
