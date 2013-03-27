
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCalledPartyTransformationPatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCalledPartyTransformationPatternReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="calledPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/8.0}XCalledPartyTransformationPattern"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCalledPartyTransformationPatternReq", propOrder = {
    "calledPartyTransformationPattern"
})
public class AddCalledPartyTransformationPatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCalledPartyTransformationPattern calledPartyTransformationPattern;

    /**
     * Gets the value of the calledPartyTransformationPattern property.
     * 
     * @return
     *     possible object is
     *     {@link XCalledPartyTransformationPattern }
     *     
     */
    public XCalledPartyTransformationPattern getCalledPartyTransformationPattern() {
        return calledPartyTransformationPattern;
    }

    /**
     * Sets the value of the calledPartyTransformationPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCalledPartyTransformationPattern }
     *     
     */
    public void setCalledPartyTransformationPattern(XCalledPartyTransformationPattern value) {
        this.calledPartyTransformationPattern = value;
    }

}
