
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhysicalLocationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhysicalLocationRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="physicalLocation" type="{http://www.cisco.com/AXL/API/8.0}RPhysicalLocation"/>
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
@XmlType(name = "GetPhysicalLocationRes", propOrder = {
    "_return"
})
public class GetPhysicalLocationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPhysicalLocationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPhysicalLocationRes.Return }
     *     
     */
    public GetPhysicalLocationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPhysicalLocationRes.Return }
     *     
     */
    public void setReturn(GetPhysicalLocationRes.Return value) {
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
     *         &lt;element name="physicalLocation" type="{http://www.cisco.com/AXL/API/8.0}RPhysicalLocation"/>
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
        "physicalLocation"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPhysicalLocation physicalLocation;

        /**
         * Gets the value of the physicalLocation property.
         * 
         * @return
         *     possible object is
         *     {@link RPhysicalLocation }
         *     
         */
        public RPhysicalLocation getPhysicalLocation() {
            return physicalLocation;
        }

        /**
         * Sets the value of the physicalLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPhysicalLocation }
         *     
         */
        public void setPhysicalLocation(RPhysicalLocation value) {
            this.physicalLocation = value;
        }

    }

}
