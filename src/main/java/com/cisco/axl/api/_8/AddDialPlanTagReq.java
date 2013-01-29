
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDialPlanTagReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDialPlanTagReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="dialPlanTag" type="{http://www.cisco.com/AXL/API/8.5}XDialPlanTag"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDialPlanTagReq", propOrder = {
    "dialPlanTag"
})
public class AddDialPlanTagReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDialPlanTag dialPlanTag;

    /**
     * Gets the value of the dialPlanTag property.
     * 
     * @return
     *     possible object is
     *     {@link XDialPlanTag }
     *     
     */
    public XDialPlanTag getDialPlanTag() {
        return dialPlanTag;
    }

    /**
     * Sets the value of the dialPlanTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDialPlanTag }
     *     
     */
    public void setDialPlanTag(XDialPlanTag value) {
        this.dialPlanTag = value;
    }

}
