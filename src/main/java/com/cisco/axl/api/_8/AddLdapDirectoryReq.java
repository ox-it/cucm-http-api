
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLdapDirectoryReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLdapDirectoryReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ldapDirectory" type="{http://www.cisco.com/AXL/API/8.0}XLdapDirectory"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLdapDirectoryReq", propOrder = {
    "ldapDirectory"
})
public class AddLdapDirectoryReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLdapDirectory ldapDirectory;

    /**
     * Gets the value of the ldapDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link XLdapDirectory }
     *     
     */
    public XLdapDirectory getLdapDirectory() {
        return ldapDirectory;
    }

    /**
     * Sets the value of the ldapDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLdapDirectory }
     *     
     */
    public void setLdapDirectory(XLdapDirectory value) {
        this.ldapDirectory = value;
    }

}
