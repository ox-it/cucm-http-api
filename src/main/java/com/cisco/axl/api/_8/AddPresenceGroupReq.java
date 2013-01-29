
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPresenceGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPresenceGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="presenceGroup" type="{http://www.cisco.com/AXL/API/8.5}XPresenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPresenceGroupReq", propOrder = {
    "presenceGroup"
})
public class AddPresenceGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPresenceGroup presenceGroup;

    /**
     * Gets the value of the presenceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XPresenceGroup }
     *     
     */
    public XPresenceGroup getPresenceGroup() {
        return presenceGroup;
    }

    /**
     * Sets the value of the presenceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPresenceGroup }
     *     
     */
    public void setPresenceGroup(XPresenceGroup value) {
        this.presenceGroup = value;
    }

}
