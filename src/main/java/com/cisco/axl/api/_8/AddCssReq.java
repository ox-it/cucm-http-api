
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCssReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCssReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="css" type="{http://www.cisco.com/AXL/API/8.0}XCss"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCssReq", propOrder = {
    "css"
})
public class AddCssReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCss css;

    /**
     * Gets the value of the css property.
     * 
     * @return
     *     possible object is
     *     {@link XCss }
     *     
     */
    public XCss getCss() {
        return css;
    }

    /**
     * Sets the value of the css property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCss }
     *     
     */
    public void setCss(XCss value) {
        this.css = value;
    }

}
