
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransPatternRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/8.5}RTransPattern"/>
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
@XmlType(name = "GetTransPatternRes", propOrder = {
    "_return"
})
public class GetTransPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTransPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransPatternRes.Return }
     *     
     */
    public GetTransPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransPatternRes.Return }
     *     
     */
    public void setReturn(GetTransPatternRes.Return value) {
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
     *         &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/8.5}RTransPattern"/>
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
        "transPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTransPattern transPattern;

        /**
         * Gets the value of the transPattern property.
         * 
         * @return
         *     possible object is
         *     {@link RTransPattern }
         *     
         */
        public RTransPattern getTransPattern() {
            return transPattern;
        }

        /**
         * Sets the value of the transPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTransPattern }
         *     
         */
        public void setTransPattern(RTransPattern value) {
            this.transPattern = value;
        }

    }

}
