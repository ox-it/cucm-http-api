
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCiscoCatalyst600024PortFXSGatewayRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCiscoCatalyst600024PortFXSGatewayRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ciscoCatalyst600024PortFXSGateway" type="{http://www.cisco.com/AXL/API/8.0}LCiscoCatalyst600024PortFXSGateway" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListCiscoCatalyst600024PortFXSGatewayRes", propOrder = {
    "_return"
})
public class ListCiscoCatalyst600024PortFXSGatewayRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListCiscoCatalyst600024PortFXSGatewayRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListCiscoCatalyst600024PortFXSGatewayRes.Return }
     *     
     */
    public ListCiscoCatalyst600024PortFXSGatewayRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCiscoCatalyst600024PortFXSGatewayRes.Return }
     *     
     */
    public void setReturn(ListCiscoCatalyst600024PortFXSGatewayRes.Return value) {
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
     *         &lt;element name="ciscoCatalyst600024PortFXSGateway" type="{http://www.cisco.com/AXL/API/8.0}LCiscoCatalyst600024PortFXSGateway" maxOccurs="unbounded" minOccurs="0"/>
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
        "ciscoCatalyst600024PortFXSGateway"
    })
    public static class Return {

        protected List<LCiscoCatalyst600024PortFXSGateway> ciscoCatalyst600024PortFXSGateway;

        /**
         * Gets the value of the ciscoCatalyst600024PortFXSGateway property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ciscoCatalyst600024PortFXSGateway property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCiscoCatalyst600024PortFXSGateway().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LCiscoCatalyst600024PortFXSGateway }
         * 
         * 
         */
        public List<LCiscoCatalyst600024PortFXSGateway> getCiscoCatalyst600024PortFXSGateway() {
            if (ciscoCatalyst600024PortFXSGateway == null) {
                ciscoCatalyst600024PortFXSGateway = new ArrayList<LCiscoCatalyst600024PortFXSGateway>();
            }
            return this.ciscoCatalyst600024PortFXSGateway;
        }

    }

}
