
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddApplicationServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddApplicationServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="applicationServer" type="{http://www.cisco.com/AXL/API/8.0}XApplicationServer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddApplicationServerReq", propOrder = {
    "applicationServer"
})
public class AddApplicationServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XApplicationServer applicationServer;

    /**
     * Gets the value of the applicationServer property.
     * 
     * @return
     *     possible object is
     *     {@link XApplicationServer }
     *     
     */
    public XApplicationServer getApplicationServer() {
        return applicationServer;
    }

    /**
     * Sets the value of the applicationServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XApplicationServer }
     *     
     */
    public void setApplicationServer(XApplicationServer value) {
        this.applicationServer = value;
    }

}
