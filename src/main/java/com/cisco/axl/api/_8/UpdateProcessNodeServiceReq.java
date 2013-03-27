
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateProcessNodeServiceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProcessNodeServiceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/8.0}XFkType"/>
 *             &lt;element name="service" type="{http://www.cisco.com/AXL/API/8.0}XService"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="traceLevel" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="userCategories" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="enable" type="{http://www.cisco.com/AXL/API/8.0}boolean" minOccurs="0"/>
 *         &lt;element name="numFiles" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="maxFileSize" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProcessNodeServiceReq", propOrder = {
    "uuid",
    "processNodeName",
    "service",
    "traceLevel",
    "userCategories",
    "enable",
    "numFiles",
    "maxFileSize"
})
public class UpdateProcessNodeServiceReq
    extends APIRequest
{

    protected String uuid;
    protected XFkType processNodeName;
    protected String service;
    @XmlElement(defaultValue = "0")
    protected String traceLevel;
    @XmlElement(defaultValue = "0")
    protected String userCategories;
    @XmlElement(defaultValue = "false")
    protected String enable;
    @XmlElement(defaultValue = "250")
    protected String numFiles;
    @XmlElement(defaultValue = "1")
    protected String maxFileSize;

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
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the traceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceLevel() {
        return traceLevel;
    }

    /**
     * Sets the value of the traceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceLevel(String value) {
        this.traceLevel = value;
    }

    /**
     * Gets the value of the userCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCategories() {
        return userCategories;
    }

    /**
     * Sets the value of the userCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCategories(String value) {
        this.userCategories = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnable(String value) {
        this.enable = value;
    }

    /**
     * Gets the value of the numFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFiles() {
        return numFiles;
    }

    /**
     * Sets the value of the numFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFiles(String value) {
        this.numFiles = value;
    }

    /**
     * Gets the value of the maxFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Sets the value of the maxFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFileSize(String value) {
        this.maxFileSize = value;
    }

}
