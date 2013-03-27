
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCallerFilterListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCallerFilterListReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="callerFilterList" type="{http://www.cisco.com/AXL/API/8.0}XCallerFilterList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCallerFilterListReq", propOrder = {
    "callerFilterList"
})
public class AddCallerFilterListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCallerFilterList callerFilterList;

    /**
     * Gets the value of the callerFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link XCallerFilterList }
     *     
     */
    public XCallerFilterList getCallerFilterList() {
        return callerFilterList;
    }

    /**
     * Sets the value of the callerFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallerFilterList }
     *     
     */
    public void setCallerFilterList(XCallerFilterList value) {
        this.callerFilterList = value;
    }

}
