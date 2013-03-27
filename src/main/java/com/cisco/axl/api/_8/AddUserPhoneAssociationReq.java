
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUserPhoneAssociationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUserPhoneAssociationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="userPhoneAssociation" type="{http://www.cisco.com/AXL/API/8.0}XUserPhoneAssociation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUserPhoneAssociationReq", propOrder = {
    "userPhoneAssociation"
})
public class AddUserPhoneAssociationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUserPhoneAssociation userPhoneAssociation;

    /**
     * Gets the value of the userPhoneAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link XUserPhoneAssociation }
     *     
     */
    public XUserPhoneAssociation getUserPhoneAssociation() {
        return userPhoneAssociation;
    }

    /**
     * Sets the value of the userPhoneAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUserPhoneAssociation }
     *     
     */
    public void setUserPhoneAssociation(XUserPhoneAssociation value) {
        this.userPhoneAssociation = value;
    }

}
