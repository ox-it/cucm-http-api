
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeLearnedRoutesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeLearnedRoutesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID"/>
 *           &lt;element name="e164Did" type="{http://www.cisco.com/AXL/API/8.5}String32"/>
 *         &lt;/choice>
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/8.5}RImeLearnedRoutes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImeLearnedRoutesReq", propOrder = {
    "uuid",
    "e164Did",
    "returnedTags"
})
public class GetImeLearnedRoutesReq
    extends APIRequest
{

    protected String uuid;
    protected String e164Did;
    protected RImeLearnedRoutes returnedTags;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the e164Did property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE164Did() {
        return e164Did;
    }

    /**
     * Sets the value of the e164Did property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE164Did(String value) {
        this.e164Did = value;
    }

    /**
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link RImeLearnedRoutes }
     *     
     */
    public RImeLearnedRoutes getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link RImeLearnedRoutes }
     *     
     */
    public void setReturnedTags(RImeLearnedRoutes value) {
        this.returnedTags = value;
    }

}
