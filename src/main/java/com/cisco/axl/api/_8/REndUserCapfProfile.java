
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REndUserCapfProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REndUserCapfProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="endUserId" type="{http://www.cisco.com/AXL/API/8.0}XFkType" minOccurs="0"/>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificationOperation" type="{http://www.cisco.com/AXL/API/8.0}XCertificateOperation" minOccurs="0"/>
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/8.0}XAuthenticationMode" minOccurs="0"/>
 *         &lt;element name="authenticationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/8.0}XKeySize" minOccurs="0"/>
 *         &lt;element name="operationCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificationOperationStatus" type="{http://www.cisco.com/AXL/API/8.0}XCertificateStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REndUserCapfProfile", propOrder = {
    "endUserId",
    "instanceId",
    "certificationOperation",
    "authenticationMode",
    "authenticationString",
    "keySize",
    "operationCompletion",
    "certificationOperationStatus"
})
public class REndUserCapfProfile {

    protected XFkType endUserId;
    protected String instanceId;
    protected String certificationOperation;
    protected String authenticationMode;
    protected String authenticationString;
    protected String keySize;
    protected String operationCompletion;
    protected String certificationOperationStatus;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the endUserId property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getEndUserId() {
        return endUserId;
    }

    /**
     * Sets the value of the endUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setEndUserId(XFkType value) {
        this.endUserId = value;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the certificationOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationOperation() {
        return certificationOperation;
    }

    /**
     * Sets the value of the certificationOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationOperation(String value) {
        this.certificationOperation = value;
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMode(String value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the authenticationString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationString() {
        return authenticationString;
    }

    /**
     * Sets the value of the authenticationString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationString(String value) {
        this.authenticationString = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySize(String value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the operationCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCompletion() {
        return operationCompletion;
    }

    /**
     * Sets the value of the operationCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCompletion(String value) {
        this.operationCompletion = value;
    }

    /**
     * Gets the value of the certificationOperationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationOperationStatus() {
        return certificationOperationStatus;
    }

    /**
     * Sets the value of the certificationOperationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationOperationStatus(String value) {
        this.certificationOperationStatus = value;
    }

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

}
