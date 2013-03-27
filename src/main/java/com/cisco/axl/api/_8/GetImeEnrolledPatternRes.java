
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeEnrolledPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeEnrolledPatternRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imeEnrolledPattern" type="{http://www.cisco.com/AXL/API/8.0}RImeEnrolledPattern"/>
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
@XmlType(name = "GetImeEnrolledPatternRes", propOrder = {
    "_return"
})
public class GetImeEnrolledPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeEnrolledPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeEnrolledPatternRes.Return }
     *     
     */
    public GetImeEnrolledPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeEnrolledPatternRes.Return }
     *     
     */
    public void setReturn(GetImeEnrolledPatternRes.Return value) {
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
     *         &lt;element name="imeEnrolledPattern" type="{http://www.cisco.com/AXL/API/8.0}RImeEnrolledPattern"/>
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
        "imeEnrolledPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeEnrolledPattern imeEnrolledPattern;

        /**
         * Gets the value of the imeEnrolledPattern property.
         * 
         * @return
         *     possible object is
         *     {@link RImeEnrolledPattern }
         *     
         */
        public RImeEnrolledPattern getImeEnrolledPattern() {
            return imeEnrolledPattern;
        }

        /**
         * Sets the value of the imeEnrolledPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeEnrolledPattern }
         *     
         */
        public void setImeEnrolledPattern(RImeEnrolledPattern value) {
            this.imeEnrolledPattern = value;
        }

    }

}
