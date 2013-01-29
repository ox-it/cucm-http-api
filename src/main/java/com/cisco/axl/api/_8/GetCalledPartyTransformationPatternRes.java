
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCalledPartyTransformationPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCalledPartyTransformationPatternRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="calledPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/8.5}RCalledPartyTransformationPattern"/>
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
@XmlType(name = "GetCalledPartyTransformationPatternRes", propOrder = {
    "_return"
})
public class GetCalledPartyTransformationPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCalledPartyTransformationPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCalledPartyTransformationPatternRes.Return }
     *     
     */
    public GetCalledPartyTransformationPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCalledPartyTransformationPatternRes.Return }
     *     
     */
    public void setReturn(GetCalledPartyTransformationPatternRes.Return value) {
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
     *         &lt;element name="calledPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/8.5}RCalledPartyTransformationPattern"/>
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
        "calledPartyTransformationPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCalledPartyTransformationPattern calledPartyTransformationPattern;

        /**
         * Gets the value of the calledPartyTransformationPattern property.
         * 
         * @return
         *     possible object is
         *     {@link RCalledPartyTransformationPattern }
         *     
         */
        public RCalledPartyTransformationPattern getCalledPartyTransformationPattern() {
            return calledPartyTransformationPattern;
        }

        /**
         * Sets the value of the calledPartyTransformationPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCalledPartyTransformationPattern }
         *     
         */
        public void setCalledPartyTransformationPattern(RCalledPartyTransformationPattern value) {
            this.calledPartyTransformationPattern = value;
        }

    }

}
