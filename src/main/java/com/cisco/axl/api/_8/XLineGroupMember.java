
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLineGroupMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLineGroupMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="lineSelectionOrder" type="{http://www.cisco.com/AXL/API/8.5}XInteger"/>
 *         &lt;element name="directoryNumber" type="{http://www.cisco.com/AXL/API/8.5}XDirn"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLineGroupMember", propOrder = {
    "lineSelectionOrder",
    "directoryNumber"
})
public class XLineGroupMember {

    protected String lineSelectionOrder;
    protected XDirn directoryNumber;

    /**
     * Gets the value of the lineSelectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSelectionOrder() {
        return lineSelectionOrder;
    }

    /**
     * Sets the value of the lineSelectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSelectionOrder(String value) {
        this.lineSelectionOrder = value;
    }

    /**
     * Gets the value of the directoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XDirn }
     *     
     */
    public XDirn getDirectoryNumber() {
        return directoryNumber;
    }

    /**
     * Sets the value of the directoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirn }
     *     
     */
    public void setDirectoryNumber(XDirn value) {
        this.directoryNumber = value;
    }

}
