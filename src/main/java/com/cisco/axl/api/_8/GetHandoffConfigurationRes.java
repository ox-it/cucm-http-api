
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHandoffConfigurationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHandoffConfigurationRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="handoffConfiguration" type="{http://www.cisco.com/AXL/API/8.5}RHandoffConfiguration"/>
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
@XmlType(name = "GetHandoffConfigurationRes", propOrder = {
    "_return"
})
public class GetHandoffConfigurationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetHandoffConfigurationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetHandoffConfigurationRes.Return }
     *     
     */
    public GetHandoffConfigurationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHandoffConfigurationRes.Return }
     *     
     */
    public void setReturn(GetHandoffConfigurationRes.Return value) {
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
     *         &lt;element name="handoffConfiguration" type="{http://www.cisco.com/AXL/API/8.5}RHandoffConfiguration"/>
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
        "handoffConfiguration"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RHandoffConfiguration handoffConfiguration;

        /**
         * Gets the value of the handoffConfiguration property.
         * 
         * @return
         *     possible object is
         *     {@link RHandoffConfiguration }
         *     
         */
        public RHandoffConfiguration getHandoffConfiguration() {
            return handoffConfiguration;
        }

        /**
         * Sets the value of the handoffConfiguration property.
         * 
         * @param value
         *     allowed object is
         *     {@link RHandoffConfiguration }
         *     
         */
        public void setHandoffConfiguration(RHandoffConfiguration value) {
            this.handoffConfiguration = value;
        }

    }

}
