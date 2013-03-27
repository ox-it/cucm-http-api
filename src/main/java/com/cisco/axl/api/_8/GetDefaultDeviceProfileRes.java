
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDefaultDeviceProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDefaultDeviceProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="defaultDeviceProfile" type="{http://www.cisco.com/AXL/API/8.0}RDefaultDeviceProfile"/>
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
@XmlType(name = "GetDefaultDeviceProfileRes", propOrder = {
    "_return"
})
public class GetDefaultDeviceProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDefaultDeviceProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDefaultDeviceProfileRes.Return }
     *     
     */
    public GetDefaultDeviceProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDefaultDeviceProfileRes.Return }
     *     
     */
    public void setReturn(GetDefaultDeviceProfileRes.Return value) {
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
     *         &lt;element name="defaultDeviceProfile" type="{http://www.cisco.com/AXL/API/8.0}RDefaultDeviceProfile"/>
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
        "defaultDeviceProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDefaultDeviceProfile defaultDeviceProfile;

        /**
         * Gets the value of the defaultDeviceProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RDefaultDeviceProfile }
         *     
         */
        public RDefaultDeviceProfile getDefaultDeviceProfile() {
            return defaultDeviceProfile;
        }

        /**
         * Sets the value of the defaultDeviceProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDefaultDeviceProfile }
         *     
         */
        public void setDefaultDeviceProfile(RDefaultDeviceProfile value) {
            this.defaultDeviceProfile = value;
        }

    }

}
