
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetApplicationServerRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApplicationServerRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationServer" type="{http://www.cisco.com/AXL/API/8.5}RApplicationServer"/>
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
@XmlType(name = "GetApplicationServerRes", propOrder = {
    "_return"
})
public class GetApplicationServerRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetApplicationServerRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetApplicationServerRes.Return }
     *     
     */
    public GetApplicationServerRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetApplicationServerRes.Return }
     *     
     */
    public void setReturn(GetApplicationServerRes.Return value) {
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
     *         &lt;element name="applicationServer" type="{http://www.cisco.com/AXL/API/8.5}RApplicationServer"/>
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
        "applicationServer"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RApplicationServer applicationServer;

        /**
         * Gets the value of the applicationServer property.
         * 
         * @return
         *     possible object is
         *     {@link RApplicationServer }
         *     
         */
        public RApplicationServer getApplicationServer() {
            return applicationServer;
        }

        /**
         * Sets the value of the applicationServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link RApplicationServer }
         *     
         */
        public void setApplicationServer(RApplicationServer value) {
            this.applicationServer = value;
        }

    }

}
