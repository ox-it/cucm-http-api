
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAarGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAarGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aarGroup" type="{http://www.cisco.com/AXL/API/8.5}RAarGroup"/>
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
@XmlType(name = "GetAarGroupRes", propOrder = {
    "_return"
})
public class GetAarGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAarGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAarGroupRes.Return }
     *     
     */
    public GetAarGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAarGroupRes.Return }
     *     
     */
    public void setReturn(GetAarGroupRes.Return value) {
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
     *         &lt;element name="aarGroup" type="{http://www.cisco.com/AXL/API/8.5}RAarGroup"/>
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
        "aarGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAarGroup aarGroup;

        /**
         * Gets the value of the aarGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RAarGroup }
         *     
         */
        public RAarGroup getAarGroup() {
            return aarGroup;
        }

        /**
         * Sets the value of the aarGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAarGroup }
         *     
         */
        public void setAarGroup(RAarGroup value) {
            this.aarGroup = value;
        }

    }

}
