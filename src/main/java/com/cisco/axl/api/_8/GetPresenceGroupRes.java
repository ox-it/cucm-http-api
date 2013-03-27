
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPresenceGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPresenceGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="presenceGroup" type="{http://www.cisco.com/AXL/API/8.0}RPresenceGroup"/>
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
@XmlType(name = "GetPresenceGroupRes", propOrder = {
    "_return"
})
public class GetPresenceGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPresenceGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPresenceGroupRes.Return }
     *     
     */
    public GetPresenceGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPresenceGroupRes.Return }
     *     
     */
    public void setReturn(GetPresenceGroupRes.Return value) {
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
     *         &lt;element name="presenceGroup" type="{http://www.cisco.com/AXL/API/8.0}RPresenceGroup"/>
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
        "presenceGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPresenceGroup presenceGroup;

        /**
         * Gets the value of the presenceGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RPresenceGroup }
         *     
         */
        public RPresenceGroup getPresenceGroup() {
            return presenceGroup;
        }

        /**
         * Sets the value of the presenceGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPresenceGroup }
         *     
         */
        public void setPresenceGroup(RPresenceGroup value) {
            this.presenceGroup = value;
        }

    }

}
