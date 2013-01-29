
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMobilityReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMobilityReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="mobility" type="{http://www.cisco.com/AXL/API/8.5}XMobility"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMobilityReq", propOrder = {
    "mobility"
})
public class AddMobilityReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMobility mobility;

    /**
     * Gets the value of the mobility property.
     * 
     * @return
     *     possible object is
     *     {@link XMobility }
     *     
     */
    public XMobility getMobility() {
        return mobility;
    }

    /**
     * Sets the value of the mobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMobility }
     *     
     */
    public void setMobility(XMobility value) {
        this.mobility = value;
    }

}
