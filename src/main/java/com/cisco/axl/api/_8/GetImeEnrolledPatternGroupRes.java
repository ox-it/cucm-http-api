
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeEnrolledPatternGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeEnrolledPatternGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imeEnrolledPatternGroup" type="{http://www.cisco.com/AXL/API/8.5}RImeEnrolledPatternGroup"/>
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
@XmlType(name = "GetImeEnrolledPatternGroupRes", propOrder = {
    "_return"
})
public class GetImeEnrolledPatternGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeEnrolledPatternGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeEnrolledPatternGroupRes.Return }
     *     
     */
    public GetImeEnrolledPatternGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeEnrolledPatternGroupRes.Return }
     *     
     */
    public void setReturn(GetImeEnrolledPatternGroupRes.Return value) {
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
     *         &lt;element name="imeEnrolledPatternGroup" type="{http://www.cisco.com/AXL/API/8.5}RImeEnrolledPatternGroup"/>
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
        "imeEnrolledPatternGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeEnrolledPatternGroup imeEnrolledPatternGroup;

        /**
         * Gets the value of the imeEnrolledPatternGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RImeEnrolledPatternGroup }
         *     
         */
        public RImeEnrolledPatternGroup getImeEnrolledPatternGroup() {
            return imeEnrolledPatternGroup;
        }

        /**
         * Sets the value of the imeEnrolledPatternGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeEnrolledPatternGroup }
         *     
         */
        public void setImeEnrolledPatternGroup(RImeEnrolledPatternGroup value) {
            this.imeEnrolledPatternGroup = value;
        }

    }

}
