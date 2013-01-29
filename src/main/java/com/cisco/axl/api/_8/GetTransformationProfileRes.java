
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransformationProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransformationProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transformationProfile" type="{http://www.cisco.com/AXL/API/8.5}RTransformationProfile"/>
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
@XmlType(name = "GetTransformationProfileRes", propOrder = {
    "_return"
})
public class GetTransformationProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTransformationProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransformationProfileRes.Return }
     *     
     */
    public GetTransformationProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransformationProfileRes.Return }
     *     
     */
    public void setReturn(GetTransformationProfileRes.Return value) {
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
     *         &lt;element name="transformationProfile" type="{http://www.cisco.com/AXL/API/8.5}RTransformationProfile"/>
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
        "transformationProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTransformationProfile transformationProfile;

        /**
         * Gets the value of the transformationProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RTransformationProfile }
         *     
         */
        public RTransformationProfile getTransformationProfile() {
            return transformationProfile;
        }

        /**
         * Sets the value of the transformationProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTransformationProfile }
         *     
         */
        public void setTransformationProfile(RTransformationProfile value) {
            this.transformationProfile = value;
        }

    }

}
