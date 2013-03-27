
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateAarGroupMatrixReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAarGroupMatrixReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="aarGroupFromName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *             &lt;element name="aarGroupToName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="prefixDigit" type="{http://www.cisco.com/AXL/API/8.0}String255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAarGroupMatrixReq", propOrder = {
    "uuid",
    "aarGroupFromName",
    "aarGroupToName",
    "prefixDigit"
})
public class UpdateAarGroupMatrixReq
    extends APIRequest
{

    protected String uuid;
    protected XFkType aarGroupFromName;
    protected XFkType aarGroupToName;
    protected String prefixDigit;

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
     * Gets the value of the aarGroupFromName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarGroupFromName() {
        return aarGroupFromName;
    }

    /**
     * Sets the value of the aarGroupFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarGroupFromName(XFkType value) {
        this.aarGroupFromName = value;
    }

    /**
     * Gets the value of the aarGroupToName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarGroupToName() {
        return aarGroupToName;
    }

    /**
     * Sets the value of the aarGroupToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarGroupToName(XFkType value) {
        this.aarGroupToName = value;
    }

    /**
     * Gets the value of the prefixDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixDigit() {
        return prefixDigit;
    }

    /**
     * Sets the value of the prefixDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixDigit(String value) {
        this.prefixDigit = value;
    }

}
