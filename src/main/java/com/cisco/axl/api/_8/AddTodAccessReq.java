
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTodAccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTodAccessReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="todAccess" type="{http://www.cisco.com/AXL/API/8.5}XTodAccess"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTodAccessReq", propOrder = {
    "todAccess"
})
public class AddTodAccessReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTodAccess todAccess;

    /**
     * Gets the value of the todAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XTodAccess }
     *     
     */
    public XTodAccess getTodAccess() {
        return todAccess;
    }

    /**
     * Sets the value of the todAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTodAccess }
     *     
     */
    public void setTodAccess(XTodAccess value) {
        this.todAccess = value;
    }

}
