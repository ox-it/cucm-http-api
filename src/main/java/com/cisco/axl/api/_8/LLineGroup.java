
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LLineGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LLineGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}Name" minOccurs="0"/>
 *         &lt;element name="distributionAlgorithm" type="{http://www.cisco.com/AXL/API/8.0}XDistributeAlgorithm" minOccurs="0"/>
 *         &lt;element name="rnaReversionTimeOut" type="{http://www.cisco.com/AXL/API/8.0}XInteger" minOccurs="0"/>
 *         &lt;element name="huntAlgorithmNoAnswer" type="{http://www.cisco.com/AXL/API/8.0}XHuntAlgorithm" minOccurs="0"/>
 *         &lt;element name="huntAlgorithmBusy" type="{http://www.cisco.com/AXL/API/8.0}XHuntAlgorithm" minOccurs="0"/>
 *         &lt;element name="huntAlgorithmNotAvailable" type="{http://www.cisco.com/AXL/API/8.0}XHuntAlgorithm" minOccurs="0"/>
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
@XmlType(name = "LLineGroup", propOrder = {
    "name",
    "distributionAlgorithm",
    "rnaReversionTimeOut",
    "huntAlgorithmNoAnswer",
    "huntAlgorithmBusy",
    "huntAlgorithmNotAvailable"
})
public class LLineGroup {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String name;
    protected String distributionAlgorithm;
    protected String rnaReversionTimeOut;
    protected String huntAlgorithmNoAnswer;
    protected String huntAlgorithmBusy;
    protected String huntAlgorithmNotAvailable;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the distributionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionAlgorithm() {
        return distributionAlgorithm;
    }

    /**
     * Sets the value of the distributionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionAlgorithm(String value) {
        this.distributionAlgorithm = value;
    }

    /**
     * Gets the value of the rnaReversionTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnaReversionTimeOut() {
        return rnaReversionTimeOut;
    }

    /**
     * Sets the value of the rnaReversionTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnaReversionTimeOut(String value) {
        this.rnaReversionTimeOut = value;
    }

    /**
     * Gets the value of the huntAlgorithmNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAlgorithmNoAnswer() {
        return huntAlgorithmNoAnswer;
    }

    /**
     * Sets the value of the huntAlgorithmNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAlgorithmNoAnswer(String value) {
        this.huntAlgorithmNoAnswer = value;
    }

    /**
     * Gets the value of the huntAlgorithmBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAlgorithmBusy() {
        return huntAlgorithmBusy;
    }

    /**
     * Sets the value of the huntAlgorithmBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAlgorithmBusy(String value) {
        this.huntAlgorithmBusy = value;
    }

    /**
     * Gets the value of the huntAlgorithmNotAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAlgorithmNotAvailable() {
        return huntAlgorithmNotAvailable;
    }

    /**
     * Sets the value of the huntAlgorithmNotAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAlgorithmNotAvailable(String value) {
        this.huntAlgorithmNotAvailable = value;
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
