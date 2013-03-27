
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSipRealmReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSipRealmReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.0}XUUID"/>
 *           &lt;element name="realm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="newRealm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digestCredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSipRealmReq", propOrder = {
    "uuid",
    "realm",
    "newRealm",
    "userid",
    "digestCredentials"
})
public class UpdateSipRealmReq
    extends APIRequest
{

    protected String uuid;
    protected String realm;
    protected String newRealm;
    protected String userid;
    protected String digestCredentials;

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
     * Gets the value of the realm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealm() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealm(String value) {
        this.realm = value;
    }

    /**
     * Gets the value of the newRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewRealm() {
        return newRealm;
    }

    /**
     * Sets the value of the newRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewRealm(String value) {
        this.newRealm = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the digestCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestCredentials() {
        return digestCredentials;
    }

    /**
     * Sets the value of the digestCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestCredentials(String value) {
        this.digestCredentials = value;
    }

}
