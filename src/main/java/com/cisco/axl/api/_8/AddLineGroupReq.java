
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLineGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLineGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="lineGroup" type="{http://www.cisco.com/AXL/API/8.0}XLineGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLineGroupReq", propOrder = {
    "lineGroup"
})
public class AddLineGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLineGroup lineGroup;

    /**
     * Gets the value of the lineGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XLineGroup }
     *     
     */
    public XLineGroup getLineGroup() {
        return lineGroup;
    }

    /**
     * Sets the value of the lineGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLineGroup }
     *     
     */
    public void setLineGroup(XLineGroup value) {
        this.lineGroup = value;
    }

}
