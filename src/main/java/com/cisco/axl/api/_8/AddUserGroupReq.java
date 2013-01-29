
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUserGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUserGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="userGroup" type="{http://www.cisco.com/AXL/API/8.5}XUserGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUserGroupReq", propOrder = {
    "userGroup"
})
public class AddUserGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUserGroup userGroup;

    /**
     * Gets the value of the userGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XUserGroup }
     *     
     */
    public XUserGroup getUserGroup() {
        return userGroup;
    }

    /**
     * Sets the value of the userGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUserGroup }
     *     
     */
    public void setUserGroup(XUserGroup value) {
        this.userGroup = value;
    }

}
