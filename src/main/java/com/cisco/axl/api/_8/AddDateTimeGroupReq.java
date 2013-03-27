
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDateTimeGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDateTimeGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="dateTimeGroup" type="{http://www.cisco.com/AXL/API/8.0}XDateTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDateTimeGroupReq", propOrder = {
    "dateTimeGroup"
})
public class AddDateTimeGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDateTimeGroup dateTimeGroup;

    /**
     * Gets the value of the dateTimeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XDateTimeGroup }
     *     
     */
    public XDateTimeGroup getDateTimeGroup() {
        return dateTimeGroup;
    }

    /**
     * Sets the value of the dateTimeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDateTimeGroup }
     *     
     */
    public void setDateTimeGroup(XDateTimeGroup value) {
        this.dateTimeGroup = value;
    }

}
