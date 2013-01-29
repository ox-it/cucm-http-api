
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMediaResourceGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMediaResourceGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mediaResourceGroup" type="{http://www.cisco.com/AXL/API/8.5}RMediaResourceGroup"/>
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
@XmlType(name = "GetMediaResourceGroupRes", propOrder = {
    "_return"
})
public class GetMediaResourceGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMediaResourceGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMediaResourceGroupRes.Return }
     *     
     */
    public GetMediaResourceGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMediaResourceGroupRes.Return }
     *     
     */
    public void setReturn(GetMediaResourceGroupRes.Return value) {
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
     *         &lt;element name="mediaResourceGroup" type="{http://www.cisco.com/AXL/API/8.5}RMediaResourceGroup"/>
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
        "mediaResourceGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMediaResourceGroup mediaResourceGroup;

        /**
         * Gets the value of the mediaResourceGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RMediaResourceGroup }
         *     
         */
        public RMediaResourceGroup getMediaResourceGroup() {
            return mediaResourceGroup;
        }

        /**
         * Sets the value of the mediaResourceGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMediaResourceGroup }
         *     
         */
        public void setMediaResourceGroup(RMediaResourceGroup value) {
            this.mediaResourceGroup = value;
        }

    }

}
