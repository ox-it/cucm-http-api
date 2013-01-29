
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAarGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAarGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="aarGroup" type="{http://www.cisco.com/AXL/API/8.5}XAarGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAarGroupReq", propOrder = {
    "aarGroup"
})
public class AddAarGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAarGroup aarGroup;

    /**
     * Gets the value of the aarGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XAarGroup }
     *     
     */
    public XAarGroup getAarGroup() {
        return aarGroup;
    }

    /**
     * Sets the value of the aarGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAarGroup }
     *     
     */
    public void setAarGroup(XAarGroup value) {
        this.aarGroup = value;
    }

}
