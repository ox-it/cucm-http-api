
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddIvrUserLocaleReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddIvrUserLocaleReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ivrUserLocale" type="{http://www.cisco.com/AXL/API/8.5}XIvrUserLocale"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddIvrUserLocaleReq", propOrder = {
    "ivrUserLocale"
})
public class AddIvrUserLocaleReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XIvrUserLocale ivrUserLocale;

    /**
     * Gets the value of the ivrUserLocale property.
     * 
     * @return
     *     possible object is
     *     {@link XIvrUserLocale }
     *     
     */
    public XIvrUserLocale getIvrUserLocale() {
        return ivrUserLocale;
    }

    /**
     * Sets the value of the ivrUserLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIvrUserLocale }
     *     
     */
    public void setIvrUserLocale(XIvrUserLocale value) {
        this.ivrUserLocale = value;
    }

}
