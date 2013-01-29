
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeExclusionNumberGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeExclusionNumberGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imeExclusionNumberGroup" type="{http://www.cisco.com/AXL/API/8.5}RImeExclusionNumberGroup"/>
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
@XmlType(name = "GetImeExclusionNumberGroupRes", propOrder = {
    "_return"
})
public class GetImeExclusionNumberGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeExclusionNumberGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeExclusionNumberGroupRes.Return }
     *     
     */
    public GetImeExclusionNumberGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeExclusionNumberGroupRes.Return }
     *     
     */
    public void setReturn(GetImeExclusionNumberGroupRes.Return value) {
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
     *         &lt;element name="imeExclusionNumberGroup" type="{http://www.cisco.com/AXL/API/8.5}RImeExclusionNumberGroup"/>
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
        "imeExclusionNumberGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeExclusionNumberGroup imeExclusionNumberGroup;

        /**
         * Gets the value of the imeExclusionNumberGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RImeExclusionNumberGroup }
         *     
         */
        public RImeExclusionNumberGroup getImeExclusionNumberGroup() {
            return imeExclusionNumberGroup;
        }

        /**
         * Sets the value of the imeExclusionNumberGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeExclusionNumberGroup }
         *     
         */
        public void setImeExclusionNumberGroup(RImeExclusionNumberGroup value) {
            this.imeExclusionNumberGroup = value;
        }

    }

}
