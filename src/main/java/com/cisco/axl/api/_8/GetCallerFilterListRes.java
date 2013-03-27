
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallerFilterListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallerFilterListRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callerFilterList" type="{http://www.cisco.com/AXL/API/8.0}RCallerFilterList"/>
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
@XmlType(name = "GetCallerFilterListRes", propOrder = {
    "_return"
})
public class GetCallerFilterListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallerFilterListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallerFilterListRes.Return }
     *     
     */
    public GetCallerFilterListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallerFilterListRes.Return }
     *     
     */
    public void setReturn(GetCallerFilterListRes.Return value) {
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
     *         &lt;element name="callerFilterList" type="{http://www.cisco.com/AXL/API/8.0}RCallerFilterList"/>
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
        "callerFilterList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallerFilterList callerFilterList;

        /**
         * Gets the value of the callerFilterList property.
         * 
         * @return
         *     possible object is
         *     {@link RCallerFilterList }
         *     
         */
        public RCallerFilterList getCallerFilterList() {
            return callerFilterList;
        }

        /**
         * Sets the value of the callerFilterList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallerFilterList }
         *     
         */
        public void setCallerFilterList(RCallerFilterList value) {
            this.callerFilterList = value;
        }

    }

}
