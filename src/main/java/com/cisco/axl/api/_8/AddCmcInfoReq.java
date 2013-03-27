
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCmcInfoReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCmcInfoReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="cmcInfo" type="{http://www.cisco.com/AXL/API/8.0}XCmcInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCmcInfoReq", propOrder = {
    "cmcInfo"
})
public class AddCmcInfoReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCmcInfo cmcInfo;

    /**
     * Gets the value of the cmcInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XCmcInfo }
     *     
     */
    public XCmcInfo getCmcInfo() {
        return cmcInfo;
    }

    /**
     * Sets the value of the cmcInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCmcInfo }
     *     
     */
    public void setCmcInfo(XCmcInfo value) {
        this.cmcInfo = value;
    }

}
