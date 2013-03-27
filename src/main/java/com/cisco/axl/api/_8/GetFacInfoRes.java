
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFacInfoRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFacInfoRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="facInfo" type="{http://www.cisco.com/AXL/API/8.0}RFacInfo"/>
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
@XmlType(name = "GetFacInfoRes", propOrder = {
    "_return"
})
public class GetFacInfoRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetFacInfoRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetFacInfoRes.Return }
     *     
     */
    public GetFacInfoRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFacInfoRes.Return }
     *     
     */
    public void setReturn(GetFacInfoRes.Return value) {
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
     *         &lt;element name="facInfo" type="{http://www.cisco.com/AXL/API/8.0}RFacInfo"/>
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
        "facInfo"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RFacInfo facInfo;

        /**
         * Gets the value of the facInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RFacInfo }
         *     
         */
        public RFacInfo getFacInfo() {
            return facInfo;
        }

        /**
         * Sets the value of the facInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RFacInfo }
         *     
         */
        public void setFacInfo(RFacInfo value) {
            this.facInfo = value;
        }

    }

}
