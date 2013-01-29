
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDirectedCallParkReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDirectedCallParkReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="directedCallPark" type="{http://www.cisco.com/AXL/API/8.5}XDirectedCallPark"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDirectedCallParkReq", propOrder = {
    "directedCallPark"
})
public class AddDirectedCallParkReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDirectedCallPark directedCallPark;

    /**
     * Gets the value of the directedCallPark property.
     * 
     * @return
     *     possible object is
     *     {@link XDirectedCallPark }
     *     
     */
    public XDirectedCallPark getDirectedCallPark() {
        return directedCallPark;
    }

    /**
     * Sets the value of the directedCallPark property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirectedCallPark }
     *     
     */
    public void setDirectedCallPark(XDirectedCallPark value) {
        this.directedCallPark = value;
    }

}
