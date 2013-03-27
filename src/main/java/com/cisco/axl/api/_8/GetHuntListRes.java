
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHuntListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHuntListRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="huntList" type="{http://www.cisco.com/AXL/API/8.0}RHuntList"/>
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
@XmlType(name = "GetHuntListRes", propOrder = {
    "_return"
})
public class GetHuntListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetHuntListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetHuntListRes.Return }
     *     
     */
    public GetHuntListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHuntListRes.Return }
     *     
     */
    public void setReturn(GetHuntListRes.Return value) {
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
     *         &lt;element name="huntList" type="{http://www.cisco.com/AXL/API/8.0}RHuntList"/>
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
        "huntList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RHuntList huntList;

        /**
         * Gets the value of the huntList property.
         * 
         * @return
         *     possible object is
         *     {@link RHuntList }
         *     
         */
        public RHuntList getHuntList() {
            return huntList;
        }

        /**
         * Sets the value of the huntList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RHuntList }
         *     
         */
        public void setHuntList(RHuntList value) {
            this.huntList = value;
        }

    }

}
