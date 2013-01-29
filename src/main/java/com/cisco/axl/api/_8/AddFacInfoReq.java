
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddFacInfoReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFacInfoReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="facInfo" type="{http://www.cisco.com/AXL/API/8.5}XFacInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFacInfoReq", propOrder = {
    "facInfo"
})
public class AddFacInfoReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XFacInfo facInfo;

    /**
     * Gets the value of the facInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XFacInfo }
     *     
     */
    public XFacInfo getFacInfo() {
        return facInfo;
    }

    /**
     * Sets the value of the facInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFacInfo }
     *     
     */
    public void setFacInfo(XFacInfo value) {
        this.facInfo = value;
    }

}
