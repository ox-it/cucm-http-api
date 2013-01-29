
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallingPartyTransformationPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallingPartyTransformationPatternRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callingPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/8.5}RCallingPartyTransformationPattern"/>
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
@XmlType(name = "GetCallingPartyTransformationPatternRes", propOrder = {
    "_return"
})
public class GetCallingPartyTransformationPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallingPartyTransformationPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallingPartyTransformationPatternRes.Return }
     *     
     */
    public GetCallingPartyTransformationPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallingPartyTransformationPatternRes.Return }
     *     
     */
    public void setReturn(GetCallingPartyTransformationPatternRes.Return value) {
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
     *         &lt;element name="callingPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/8.5}RCallingPartyTransformationPattern"/>
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
        "callingPartyTransformationPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallingPartyTransformationPattern callingPartyTransformationPattern;

        /**
         * Gets the value of the callingPartyTransformationPattern property.
         * 
         * @return
         *     possible object is
         *     {@link RCallingPartyTransformationPattern }
         *     
         */
        public RCallingPartyTransformationPattern getCallingPartyTransformationPattern() {
            return callingPartyTransformationPattern;
        }

        /**
         * Sets the value of the callingPartyTransformationPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallingPartyTransformationPattern }
         *     
         */
        public void setCallingPartyTransformationPattern(RCallingPartyTransformationPattern value) {
            this.callingPartyTransformationPattern = value;
        }

    }

}
