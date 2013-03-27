
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAarGroupMatrixReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAarGroupMatrixReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="aarGroupMatrix" type="{http://www.cisco.com/AXL/API/8.0}XAarGroupMatrix"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAarGroupMatrixReq", propOrder = {
    "aarGroupMatrix"
})
public class AddAarGroupMatrixReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAarGroupMatrix aarGroupMatrix;

    /**
     * Gets the value of the aarGroupMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link XAarGroupMatrix }
     *     
     */
    public XAarGroupMatrix getAarGroupMatrix() {
        return aarGroupMatrix;
    }

    /**
     * Sets the value of the aarGroupMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAarGroupMatrix }
     *     
     */
    public void setAarGroupMatrix(XAarGroupMatrix value) {
        this.aarGroupMatrix = value;
    }

}
