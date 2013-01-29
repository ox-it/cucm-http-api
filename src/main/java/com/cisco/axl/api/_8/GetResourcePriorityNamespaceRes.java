
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourcePriorityNamespaceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourcePriorityNamespaceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resourcePriorityNamespace" type="{http://www.cisco.com/AXL/API/8.5}RResourcePriorityNamespace"/>
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
@XmlType(name = "GetResourcePriorityNamespaceRes", propOrder = {
    "_return"
})
public class GetResourcePriorityNamespaceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetResourcePriorityNamespaceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetResourcePriorityNamespaceRes.Return }
     *     
     */
    public GetResourcePriorityNamespaceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResourcePriorityNamespaceRes.Return }
     *     
     */
    public void setReturn(GetResourcePriorityNamespaceRes.Return value) {
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
     *         &lt;element name="resourcePriorityNamespace" type="{http://www.cisco.com/AXL/API/8.5}RResourcePriorityNamespace"/>
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
        "resourcePriorityNamespace"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RResourcePriorityNamespace resourcePriorityNamespace;

        /**
         * Gets the value of the resourcePriorityNamespace property.
         * 
         * @return
         *     possible object is
         *     {@link RResourcePriorityNamespace }
         *     
         */
        public RResourcePriorityNamespace getResourcePriorityNamespace() {
            return resourcePriorityNamespace;
        }

        /**
         * Sets the value of the resourcePriorityNamespace property.
         * 
         * @param value
         *     allowed object is
         *     {@link RResourcePriorityNamespace }
         *     
         */
        public void setResourcePriorityNamespace(RResourcePriorityNamespace value) {
            this.resourcePriorityNamespace = value;
        }

    }

}
