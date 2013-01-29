
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XInterClusterServiceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XInterClusterServiceProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="interClusterService" type="{http://www.cisco.com/AXL/API/8.5}XInterClusterService"/>
 *         &lt;element name="isActivated" type="{http://www.cisco.com/AXL/API/8.5}boolean" minOccurs="0"/>
 *         &lt;element name="sipTrunkName" type="{http://www.cisco.com/AXL/API/8.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XInterClusterServiceProfile", propOrder = {
    "interClusterService",
    "isActivated",
    "sipTrunkName"
})
public class XInterClusterServiceProfile {

    @XmlElement(defaultValue = "EMCC")
    protected String interClusterService;
    @XmlElement(defaultValue = "false")
    protected String isActivated;
    protected XFkType sipTrunkName;

    /**
     * Gets the value of the interClusterService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterClusterService() {
        return interClusterService;
    }

    /**
     * Sets the value of the interClusterService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterClusterService(String value) {
        this.interClusterService = value;
    }

    /**
     * Gets the value of the isActivated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActivated() {
        return isActivated;
    }

    /**
     * Sets the value of the isActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActivated(String value) {
        this.isActivated = value;
    }

    /**
     * Gets the value of the sipTrunkName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSipTrunkName() {
        return sipTrunkName;
    }

    /**
     * Sets the value of the sipTrunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSipTrunkName(XFkType value) {
        this.sipTrunkName = value;
    }

}
