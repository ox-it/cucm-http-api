
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMediaResourceListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMediaResourceListRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mediaResourceList" type="{http://www.cisco.com/AXL/API/8.0}RMediaResourceList"/>
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
@XmlType(name = "GetMediaResourceListRes", propOrder = {
    "_return"
})
public class GetMediaResourceListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMediaResourceListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMediaResourceListRes.Return }
     *     
     */
    public GetMediaResourceListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMediaResourceListRes.Return }
     *     
     */
    public void setReturn(GetMediaResourceListRes.Return value) {
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
     *         &lt;element name="mediaResourceList" type="{http://www.cisco.com/AXL/API/8.0}RMediaResourceList"/>
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
        "mediaResourceList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMediaResourceList mediaResourceList;

        /**
         * Gets the value of the mediaResourceList property.
         * 
         * @return
         *     possible object is
         *     {@link RMediaResourceList }
         *     
         */
        public RMediaResourceList getMediaResourceList() {
            return mediaResourceList;
        }

        /**
         * Sets the value of the mediaResourceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMediaResourceList }
         *     
         */
        public void setMediaResourceList(RMediaResourceList value) {
            this.mediaResourceList = value;
        }

    }

}
