
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourcePriorityNamespaceListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourcePriorityNamespaceListRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resourcePriorityNamespaceList" type="{http://www.cisco.com/AXL/API/8.0}RResourcePriorityNamespaceList"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResourcePriorityNamespaceListRes", propOrder = {
    "_return"
})
public class GetResourcePriorityNamespaceListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetResourcePriorityNamespaceListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetResourcePriorityNamespaceListRes.Return }
     *     
     */
    public GetResourcePriorityNamespaceListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResourcePriorityNamespaceListRes.Return }
     *     
     */
    public void setReturn(GetResourcePriorityNamespaceListRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="resourcePriorityNamespaceList" type="{http://www.cisco.com/AXL/API/8.0}RResourcePriorityNamespaceList"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resourcePriorityNamespaceList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RResourcePriorityNamespaceList resourcePriorityNamespaceList;

        /**
         * Gets the value of the resourcePriorityNamespaceList property.
         * 
         * @return
         *     possible object is
         *     {@link RResourcePriorityNamespaceList }
         *     
         */
        public RResourcePriorityNamespaceList getResourcePriorityNamespaceList() {
            return resourcePriorityNamespaceList;
        }

        /**
         * Sets the value of the resourcePriorityNamespaceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RResourcePriorityNamespaceList }
         *     
         */
        public void setResourcePriorityNamespaceList(RResourcePriorityNamespaceList value) {
            this.resourcePriorityNamespaceList = value;
        }

    }

}
