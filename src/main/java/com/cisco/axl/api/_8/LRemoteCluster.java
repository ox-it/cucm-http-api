
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LRemoteCluster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LRemoteCluster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="clusterId" type="{http://www.cisco.com/AXL/API/8.5}String255" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullyQualifiedName" type="{http://www.cisco.com/AXL/API/8.5}String50" minOccurs="0"/>
 *         &lt;element name="emcc" type="{http://www.cisco.com/AXL/API/8.5}LRemoteClusterMember" minOccurs="0"/>
 *         &lt;element name="pstnAccess" type="{http://www.cisco.com/AXL/API/8.5}LRemoteClusterMember" minOccurs="0"/>
 *         &lt;element name="rsvpAgent" type="{http://www.cisco.com/AXL/API/8.5}LRemoteClusterMember" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRemoteCluster", propOrder = {
    "clusterId",
    "description",
    "fullyQualifiedName",
    "emcc",
    "pstnAccess",
    "rsvpAgent"
})
public class LRemoteCluster {

    protected String clusterId;
    protected String description;
    protected String fullyQualifiedName;
    protected LRemoteClusterMember emcc;
    protected LRemoteClusterMember pstnAccess;
    protected LRemoteClusterMember rsvpAgent;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the clusterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * Sets the value of the clusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterId(String value) {
        this.clusterId = value;
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
     * Gets the value of the fullyQualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Sets the value of the fullyQualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyQualifiedName(String value) {
        this.fullyQualifiedName = value;
    }

    /**
     * Gets the value of the emcc property.
     * 
     * @return
     *     possible object is
     *     {@link LRemoteClusterMember }
     *     
     */
    public LRemoteClusterMember getEmcc() {
        return emcc;
    }

    /**
     * Sets the value of the emcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LRemoteClusterMember }
     *     
     */
    public void setEmcc(LRemoteClusterMember value) {
        this.emcc = value;
    }

    /**
     * Gets the value of the pstnAccess property.
     * 
     * @return
     *     possible object is
     *     {@link LRemoteClusterMember }
     *     
     */
    public LRemoteClusterMember getPstnAccess() {
        return pstnAccess;
    }

    /**
     * Sets the value of the pstnAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link LRemoteClusterMember }
     *     
     */
    public void setPstnAccess(LRemoteClusterMember value) {
        this.pstnAccess = value;
    }

    /**
     * Gets the value of the rsvpAgent property.
     * 
     * @return
     *     possible object is
     *     {@link LRemoteClusterMember }
     *     
     */
    public LRemoteClusterMember getRsvpAgent() {
        return rsvpAgent;
    }

    /**
     * Sets the value of the rsvpAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LRemoteClusterMember }
     *     
     */
    public void setRsvpAgent(LRemoteClusterMember value) {
        this.rsvpAgent = value;
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
