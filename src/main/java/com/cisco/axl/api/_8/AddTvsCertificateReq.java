
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTvsCertificateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTvsCertificateReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="tvsCertificate" type="{http://www.cisco.com/AXL/API/8.0}XTvsCertificate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTvsCertificateReq", propOrder = {
    "tvsCertificate"
})
public class AddTvsCertificateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTvsCertificate tvsCertificate;

    /**
     * Gets the value of the tvsCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link XTvsCertificate }
     *     
     */
    public XTvsCertificate getTvsCertificate() {
        return tvsCertificate;
    }

    /**
     * Sets the value of the tvsCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTvsCertificate }
     *     
     */
    public void setTvsCertificate(XTvsCertificate value) {
        this.tvsCertificate = value;
    }

}
