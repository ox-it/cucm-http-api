
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAppServerInfoRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAppServerInfoRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="appServerInfo" type="{http://www.cisco.com/AXL/API/8.0}RAppServerInfo"/>
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
@XmlType(name = "GetAppServerInfoRes", propOrder = {
    "_return"
})
public class GetAppServerInfoRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAppServerInfoRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAppServerInfoRes.Return }
     *     
     */
    public GetAppServerInfoRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAppServerInfoRes.Return }
     *     
     */
    public void setReturn(GetAppServerInfoRes.Return value) {
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
     *         &lt;element name="appServerInfo" type="{http://www.cisco.com/AXL/API/8.0}RAppServerInfo"/>
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
        "appServerInfo"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAppServerInfo appServerInfo;

        /**
         * Gets the value of the appServerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RAppServerInfo }
         *     
         */
        public RAppServerInfo getAppServerInfo() {
            return appServerInfo;
        }

        /**
         * Sets the value of the appServerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAppServerInfo }
         *     
         */
        public void setAppServerInfo(RAppServerInfo value) {
            this.appServerInfo = value;
        }

    }

}
