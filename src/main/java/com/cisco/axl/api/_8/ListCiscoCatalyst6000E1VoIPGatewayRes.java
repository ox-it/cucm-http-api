
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCiscoCatalyst6000E1VoIPGatewayRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCiscoCatalyst6000E1VoIPGatewayRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ciscoCatalyst6000E1VoIPGateway" type="{http://www.cisco.com/AXL/API/8.0}LCiscoCatalyst6000E1VoIPGateway" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListCiscoCatalyst6000E1VoIPGatewayRes", propOrder = {
    "_return"
})
public class ListCiscoCatalyst6000E1VoIPGatewayRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListCiscoCatalyst6000E1VoIPGatewayRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListCiscoCatalyst6000E1VoIPGatewayRes.Return }
     *     
     */
    public ListCiscoCatalyst6000E1VoIPGatewayRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCiscoCatalyst6000E1VoIPGatewayRes.Return }
     *     
     */
    public void setReturn(ListCiscoCatalyst6000E1VoIPGatewayRes.Return value) {
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
     *         &lt;element name="ciscoCatalyst6000E1VoIPGateway" type="{http://www.cisco.com/AXL/API/8.0}LCiscoCatalyst6000E1VoIPGateway" maxOccurs="unbounded" minOccurs="0"/>
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
        "ciscoCatalyst6000E1VoIPGateway"
    })
    public static class Return {

        protected List<LCiscoCatalyst6000E1VoIPGateway> ciscoCatalyst6000E1VoIPGateway;

        /**
         * Gets the value of the ciscoCatalyst6000E1VoIPGateway property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ciscoCatalyst6000E1VoIPGateway property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCiscoCatalyst6000E1VoIPGateway().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LCiscoCatalyst6000E1VoIPGateway }
         * 
         * 
         */
        public List<LCiscoCatalyst6000E1VoIPGateway> getCiscoCatalyst6000E1VoIPGateway() {
            if (ciscoCatalyst6000E1VoIPGateway == null) {
                ciscoCatalyst6000E1VoIPGateway = new ArrayList<LCiscoCatalyst6000E1VoIPGateway>();
            }
            return this.ciscoCatalyst6000E1VoIPGateway;
        }

    }

}
