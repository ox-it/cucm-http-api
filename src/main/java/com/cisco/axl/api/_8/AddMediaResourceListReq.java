
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMediaResourceListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMediaResourceListReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="mediaResourceList" type="{http://www.cisco.com/AXL/API/8.0}XMediaResourceList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMediaResourceListReq", propOrder = {
    "mediaResourceList"
})
public class AddMediaResourceListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMediaResourceList mediaResourceList;

    /**
     * Gets the value of the mediaResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link XMediaResourceList }
     *     
     */
    public XMediaResourceList getMediaResourceList() {
        return mediaResourceList;
    }

    /**
     * Sets the value of the mediaResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMediaResourceList }
     *     
     */
    public void setMediaResourceList(XMediaResourceList value) {
        this.mediaResourceList = value;
    }

}
