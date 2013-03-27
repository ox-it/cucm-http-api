
package com.cisco.axl.api._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListEndUserCapfProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListEndUserCapfProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="endUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.0}LEndUserCapfProfile" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListEndUserCapfProfileRes", propOrder = {
    "_return"
})
public class ListEndUserCapfProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListEndUserCapfProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListEndUserCapfProfileRes.Return }
     *     
     */
    public ListEndUserCapfProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEndUserCapfProfileRes.Return }
     *     
     */
    public void setReturn(ListEndUserCapfProfileRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="endUserCapfProfile" type="{http://www.cisco.com/AXL/API/8.0}LEndUserCapfProfile" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "endUserCapfProfile"
    })
    public static class Return {

        protected List<LEndUserCapfProfile> endUserCapfProfile;

        /**
         * Gets the value of the endUserCapfProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endUserCapfProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndUserCapfProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LEndUserCapfProfile }
         * 
         * 
         */
        public List<LEndUserCapfProfile> getEndUserCapfProfile() {
            if (endUserCapfProfile == null) {
                endUserCapfProfile = new ArrayList<LEndUserCapfProfile>();
            }
            return this.endUserCapfProfile;
        }

    }

}
