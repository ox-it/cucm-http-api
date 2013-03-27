
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCallParkReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCallParkReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="callPark" type="{http://www.cisco.com/AXL/API/8.0}XCallPark"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCallParkReq", propOrder = {
    "callPark"
})
public class AddCallParkReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCallPark callPark;

    /**
     * Gets the value of the callPark property.
     * 
     * @return
     *     possible object is
     *     {@link XCallPark }
     *     
     */
    public XCallPark getCallPark() {
        return callPark;
    }

    /**
     * Sets the value of the callPark property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallPark }
     *     
     */
    public void setCallPark(XCallPark value) {
        this.callPark = value;
    }

}
