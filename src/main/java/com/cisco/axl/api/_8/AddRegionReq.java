
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRegionReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRegionReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="region" type="{http://www.cisco.com/AXL/API/8.5}XRegion"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRegionReq", propOrder = {
    "region"
})
public class AddRegionReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRegion region;

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link XRegion }
     *     
     */
    public XRegion getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRegion }
     *     
     */
    public void setRegion(XRegion value) {
        this.region = value;
    }

}
