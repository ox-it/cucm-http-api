
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMobilityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobilityProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mobilityProfile" type="{http://www.cisco.com/AXL/API/8.5}RMobilityProfile"/>
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
@XmlType(name = "GetMobilityProfileRes", propOrder = {
    "_return"
})
public class GetMobilityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMobilityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMobilityProfileRes.Return }
     *     
     */
    public GetMobilityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMobilityProfileRes.Return }
     *     
     */
    public void setReturn(GetMobilityProfileRes.Return value) {
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
     *         &lt;element name="mobilityProfile" type="{http://www.cisco.com/AXL/API/8.5}RMobilityProfile"/>
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
        "mobilityProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMobilityProfile mobilityProfile;

        /**
         * Gets the value of the mobilityProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RMobilityProfile }
         *     
         */
        public RMobilityProfile getMobilityProfile() {
            return mobilityProfile;
        }

        /**
         * Sets the value of the mobilityProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMobilityProfile }
         *     
         */
        public void setMobilityProfile(RMobilityProfile value) {
            this.mobilityProfile = value;
        }

    }

}
