
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSafCcdPurgeBlockLearnedRoutesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSafCcdPurgeBlockLearnedRoutesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="safCcdPurgeBlockLearnedRoutes" type="{http://www.cisco.com/AXL/API/8.0}XSafCcdPurgeBlockLearnedRoutes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSafCcdPurgeBlockLearnedRoutesReq", propOrder = {
    "safCcdPurgeBlockLearnedRoutes"
})
public class AddSafCcdPurgeBlockLearnedRoutesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSafCcdPurgeBlockLearnedRoutes safCcdPurgeBlockLearnedRoutes;

    /**
     * Gets the value of the safCcdPurgeBlockLearnedRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link XSafCcdPurgeBlockLearnedRoutes }
     *     
     */
    public XSafCcdPurgeBlockLearnedRoutes getSafCcdPurgeBlockLearnedRoutes() {
        return safCcdPurgeBlockLearnedRoutes;
    }

    /**
     * Sets the value of the safCcdPurgeBlockLearnedRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSafCcdPurgeBlockLearnedRoutes }
     *     
     */
    public void setSafCcdPurgeBlockLearnedRoutes(XSafCcdPurgeBlockLearnedRoutes value) {
        this.safCcdPurgeBlockLearnedRoutes = value;
    }

}
