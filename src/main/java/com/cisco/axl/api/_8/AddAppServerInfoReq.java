
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAppServerInfoReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAppServerInfoReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="appServerInfo" type="{http://www.cisco.com/AXL/API/8.0}XAppServerInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAppServerInfoReq", propOrder = {
    "appServerInfo"
})
public class AddAppServerInfoReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAppServerInfo appServerInfo;

    /**
     * Gets the value of the appServerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XAppServerInfo }
     *     
     */
    public XAppServerInfo getAppServerInfo() {
        return appServerInfo;
    }

    /**
     * Sets the value of the appServerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAppServerInfo }
     *     
     */
    public void setAppServerInfo(XAppServerInfo value) {
        this.appServerInfo = value;
    }

}
