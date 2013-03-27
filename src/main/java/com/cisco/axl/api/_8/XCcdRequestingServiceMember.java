
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCcdRequestingServiceMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCcdRequestingServiceMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="trunkName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCcdRequestingServiceMember", propOrder = {
    "trunkName"
})
public class XCcdRequestingServiceMember {

    protected XFkType trunkName;

    /**
     * Gets the value of the trunkName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getTrunkName() {
        return trunkName;
    }

    /**
     * Sets the value of the trunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setTrunkName(XFkType value) {
        this.trunkName = value;
    }

}
