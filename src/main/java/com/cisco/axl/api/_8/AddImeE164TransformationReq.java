
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeE164TransformationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeE164TransformationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="imeE164Transformation" type="{http://www.cisco.com/AXL/API/8.5}XImeE164Transformation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeE164TransformationReq", propOrder = {
    "imeE164Transformation"
})
public class AddImeE164TransformationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeE164Transformation imeE164Transformation;

    /**
     * Gets the value of the imeE164Transformation property.
     * 
     * @return
     *     possible object is
     *     {@link XImeE164Transformation }
     *     
     */
    public XImeE164Transformation getImeE164Transformation() {
        return imeE164Transformation;
    }

    /**
     * Sets the value of the imeE164Transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeE164Transformation }
     *     
     */
    public void setImeE164Transformation(XImeE164Transformation value) {
        this.imeE164Transformation = value;
    }

}
