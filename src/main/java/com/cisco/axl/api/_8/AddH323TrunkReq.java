
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddH323TrunkReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddH323TrunkReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="h323Trunk" type="{http://www.cisco.com/AXL/API/8.5}XH323Trunk"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddH323TrunkReq", propOrder = {
    "h323Trunk"
})
public class AddH323TrunkReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XH323Trunk h323Trunk;

    /**
     * Gets the value of the h323Trunk property.
     * 
     * @return
     *     possible object is
     *     {@link XH323Trunk }
     *     
     */
    public XH323Trunk getH323Trunk() {
        return h323Trunk;
    }

    /**
     * Sets the value of the h323Trunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XH323Trunk }
     *     
     */
    public void setH323Trunk(XH323Trunk value) {
        this.h323Trunk = value;
    }

}
