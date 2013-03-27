
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRemoteClusterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRemoteClusterReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="remoteCluster" type="{http://www.cisco.com/AXL/API/8.0}XRemoteCluster"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRemoteClusterReq", propOrder = {
    "remoteCluster"
})
public class AddRemoteClusterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRemoteCluster remoteCluster;

    /**
     * Gets the value of the remoteCluster property.
     * 
     * @return
     *     possible object is
     *     {@link XRemoteCluster }
     *     
     */
    public XRemoteCluster getRemoteCluster() {
        return remoteCluster;
    }

    /**
     * Sets the value of the remoteCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRemoteCluster }
     *     
     */
    public void setRemoteCluster(XRemoteCluster value) {
        this.remoteCluster = value;
    }

}
