
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAnnunciatorRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAnnunciatorRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="annunciator" type="{http://www.cisco.com/AXL/API/8.5}RAnnunciator"/>
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
@XmlType(name = "GetAnnunciatorRes", propOrder = {
    "_return"
})
public class GetAnnunciatorRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAnnunciatorRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAnnunciatorRes.Return }
     *     
     */
    public GetAnnunciatorRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAnnunciatorRes.Return }
     *     
     */
    public void setReturn(GetAnnunciatorRes.Return value) {
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
     *         &lt;element name="annunciator" type="{http://www.cisco.com/AXL/API/8.5}RAnnunciator"/>
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
        "annunciator"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAnnunciator annunciator;

        /**
         * Gets the value of the annunciator property.
         * 
         * @return
         *     possible object is
         *     {@link RAnnunciator }
         *     
         */
        public RAnnunciator getAnnunciator() {
            return annunciator;
        }

        /**
         * Sets the value of the annunciator property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAnnunciator }
         *     
         */
        public void setAnnunciator(RAnnunciator value) {
            this.annunciator = value;
        }

    }

}
