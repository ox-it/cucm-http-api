
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRegionMatrixReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRegionMatrixReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="regionMatrix" type="{http://www.cisco.com/AXL/API/8.0}XRegionMatrix"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRegionMatrixReq", propOrder = {
    "regionMatrix"
})
public class AddRegionMatrixReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRegionMatrix regionMatrix;

    /**
     * Gets the value of the regionMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link XRegionMatrix }
     *     
     */
    public XRegionMatrix getRegionMatrix() {
        return regionMatrix;
    }

    /**
     * Sets the value of the regionMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRegionMatrix }
     *     
     */
    public void setRegionMatrix(XRegionMatrix value) {
        this.regionMatrix = value;
    }

}
