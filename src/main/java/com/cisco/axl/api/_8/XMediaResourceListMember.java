
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMediaResourceListMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMediaResourceListMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="mediaResourceGroupName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *         &lt;element name="order" type="{http://www.cisco.com/AXL/API/8.0}XInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMediaResourceListMember", propOrder = {
    "mediaResourceGroupName",
    "order"
})
public class XMediaResourceListMember {

    protected XFkType mediaResourceGroupName;
    protected String order;

    /**
     * Gets the value of the mediaResourceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMediaResourceGroupName() {
        return mediaResourceGroupName;
    }

    /**
     * Sets the value of the mediaResourceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMediaResourceGroupName(XFkType value) {
        this.mediaResourceGroupName = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

}
