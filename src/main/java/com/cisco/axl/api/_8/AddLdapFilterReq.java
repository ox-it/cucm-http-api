
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLdapFilterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLdapFilterReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ldapFilter" type="{http://www.cisco.com/AXL/API/8.5}XLdapFilter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLdapFilterReq", propOrder = {
    "ldapFilter"
})
public class AddLdapFilterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLdapFilter ldapFilter;

    /**
     * Gets the value of the ldapFilter property.
     * 
     * @return
     *     possible object is
     *     {@link XLdapFilter }
     *     
     */
    public XLdapFilter getLdapFilter() {
        return ldapFilter;
    }

    /**
     * Sets the value of the ldapFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLdapFilter }
     *     
     */
    public void setLdapFilter(XLdapFilter value) {
        this.ldapFilter = value;
    }

}
