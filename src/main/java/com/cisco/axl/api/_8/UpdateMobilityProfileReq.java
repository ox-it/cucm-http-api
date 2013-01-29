
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMobilityProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMobilityProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileClientCallingOption" type="{http://www.cisco.com/AXL/API/8.5}XDialViaOffice" minOccurs="0"/>
 *         &lt;element name="dvofServiceAccessNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirn" type="{http://www.cisco.com/AXL/API/8.5}XDirn" minOccurs="0"/>
 *         &lt;element name="dvorCallerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMobilityProfileReq", propOrder = {
    "newName",
    "description",
    "mobileClientCallingOption",
    "dvofServiceAccessNumber",
    "dirn",
    "dvorCallerId"
})
public class UpdateMobilityProfileReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    @XmlElement(defaultValue = "Dial via Office Reverse")
    protected String mobileClientCallingOption;
    protected String dvofServiceAccessNumber;
    protected XDirn dirn;
    @XmlElementRef(name = "dvorCallerId", type = JAXBElement.class)
    protected JAXBElement<String> dvorCallerId;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mobileClientCallingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileClientCallingOption() {
        return mobileClientCallingOption;
    }

    /**
     * Sets the value of the mobileClientCallingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileClientCallingOption(String value) {
        this.mobileClientCallingOption = value;
    }

    /**
     * Gets the value of the dvofServiceAccessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvofServiceAccessNumber() {
        return dvofServiceAccessNumber;
    }

    /**
     * Sets the value of the dvofServiceAccessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvofServiceAccessNumber(String value) {
        this.dvofServiceAccessNumber = value;
    }

    /**
     * Gets the value of the dirn property.
     * 
     * @return
     *     possible object is
     *     {@link XDirn }
     *     
     */
    public XDirn getDirn() {
        return dirn;
    }

    /**
     * Sets the value of the dirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirn }
     *     
     */
    public void setDirn(XDirn value) {
        this.dirn = value;
    }

    /**
     * Gets the value of the dvorCallerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDvorCallerId() {
        return dvorCallerId;
    }

    /**
     * Sets the value of the dvorCallerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDvorCallerId(JAXBElement<String> value) {
        this.dvorCallerId = ((JAXBElement<String> ) value);
    }

}
