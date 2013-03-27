
package com.cisco.axl.api._8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateAppServerInfoReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAppServerInfoReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *         &lt;/choice>
 *         &lt;element name="appServerName" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="appServerContent" type="{http://www.cisco.com/AXL/API/8.0}XAppServerContent" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/8.0}XContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAppServerInfoReq", propOrder = {
    "uuid",
    "appServerName",
    "appServerContent",
    "content"
})
public class UpdateAppServerInfoReq
    extends APIRequest
{

    protected String uuid;
    protected XFkType appServerName;
    protected String appServerContent;
    @XmlElementRef(name = "content", type = JAXBElement.class)
    protected JAXBElement<XContent> content;

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
     * Gets the value of the appServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAppServerName() {
        return appServerName;
    }

    /**
     * Sets the value of the appServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAppServerName(XFkType value) {
        this.appServerName = value;
    }

    /**
     * Gets the value of the appServerContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppServerContent() {
        return appServerContent;
    }

    /**
     * Sets the value of the appServerContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppServerContent(String value) {
        this.appServerContent = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
     *     
     */
    public JAXBElement<XContent> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XContent }{@code >}
     *     
     */
    public void setContent(JAXBElement<XContent> value) {
        this.content = ((JAXBElement<XContent> ) value);
    }

}
