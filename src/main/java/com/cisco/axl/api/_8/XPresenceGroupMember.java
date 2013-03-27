
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XPresenceGroupMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XPresenceGroupMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="subscriptionPermission" type="{http://www.cisco.com/AXL/API/8.0}XMatrixValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XPresenceGroupMember", propOrder = {
    "presenceGroupName",
    "subscriptionPermission"
})
public class XPresenceGroupMember {

    protected XFkType presenceGroupName;
    protected String subscriptionPermission;

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPresenceGroupName(XFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the subscriptionPermission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionPermission() {
        return subscriptionPermission;
    }

    /**
     * Sets the value of the subscriptionPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionPermission(String value) {
        this.subscriptionPermission = value;
    }

}
