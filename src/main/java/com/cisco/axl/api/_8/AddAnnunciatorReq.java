
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAnnunciatorReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAnnunciatorReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="annunciator" type="{http://www.cisco.com/AXL/API/8.5}XAnnunciator"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAnnunciatorReq", propOrder = {
    "annunciator"
})
public class AddAnnunciatorReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAnnunciator annunciator;

    /**
     * Gets the value of the annunciator property.
     * 
     * @return
     *     possible object is
     *     {@link XAnnunciator }
     *     
     */
    public XAnnunciator getAnnunciator() {
        return annunciator;
    }

    /**
     * Sets the value of the annunciator property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAnnunciator }
     *     
     */
    public void setAnnunciator(XAnnunciator value) {
        this.annunciator = value;
    }

}
