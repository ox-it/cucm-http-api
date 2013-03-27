
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddResourcePriorityNamespaceListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddResourcePriorityNamespaceListReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="resourcePriorityNamespaceList" type="{http://www.cisco.com/AXL/API/8.0}XResourcePriorityNamespaceList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddResourcePriorityNamespaceListReq", propOrder = {
    "resourcePriorityNamespaceList"
})
public class AddResourcePriorityNamespaceListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XResourcePriorityNamespaceList resourcePriorityNamespaceList;

    /**
     * Gets the value of the resourcePriorityNamespaceList property.
     * 
     * @return
     *     possible object is
     *     {@link XResourcePriorityNamespaceList }
     *     
     */
    public XResourcePriorityNamespaceList getResourcePriorityNamespaceList() {
        return resourcePriorityNamespaceList;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XResourcePriorityNamespaceList }
     *     
     */
    public void setResourcePriorityNamespaceList(XResourcePriorityNamespaceList value) {
        this.resourcePriorityNamespaceList = value;
    }

}
