
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProcessNodeRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProcessNodeRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="processNode" type="{http://www.cisco.com/AXL/API/8.0}RProcessNode"/>
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
@XmlType(name = "GetProcessNodeRes", propOrder = {
    "_return"
})
public class GetProcessNodeRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetProcessNodeRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetProcessNodeRes.Return }
     *     
     */
    public GetProcessNodeRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProcessNodeRes.Return }
     *     
     */
    public void setReturn(GetProcessNodeRes.Return value) {
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
     *         &lt;element name="processNode" type="{http://www.cisco.com/AXL/API/8.0}RProcessNode"/>
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
        "processNode"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RProcessNode processNode;

        /**
         * Gets the value of the processNode property.
         * 
         * @return
         *     possible object is
         *     {@link RProcessNode }
         *     
         */
        public RProcessNode getProcessNode() {
            return processNode;
        }

        /**
         * Sets the value of the processNode property.
         * 
         * @param value
         *     allowed object is
         *     {@link RProcessNode }
         *     
         */
        public void setProcessNode(RProcessNode value) {
            this.processNode = value;
        }

    }

}
