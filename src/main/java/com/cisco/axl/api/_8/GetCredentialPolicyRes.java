
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCredentialPolicyRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCredentialPolicyRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="credentialPolicy" type="{http://www.cisco.com/AXL/API/8.0}RCredentialPolicy"/>
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
@XmlType(name = "GetCredentialPolicyRes", propOrder = {
    "_return"
})
public class GetCredentialPolicyRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCredentialPolicyRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCredentialPolicyRes.Return }
     *     
     */
    public GetCredentialPolicyRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCredentialPolicyRes.Return }
     *     
     */
    public void setReturn(GetCredentialPolicyRes.Return value) {
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
     *         &lt;element name="credentialPolicy" type="{http://www.cisco.com/AXL/API/8.0}RCredentialPolicy"/>
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
        "credentialPolicy"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCredentialPolicy credentialPolicy;

        /**
         * Gets the value of the credentialPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link RCredentialPolicy }
         *     
         */
        public RCredentialPolicy getCredentialPolicy() {
            return credentialPolicy;
        }

        /**
         * Sets the value of the credentialPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCredentialPolicy }
         *     
         */
        public void setCredentialPolicy(RCredentialPolicy value) {
            this.credentialPolicy = value;
        }

    }

}
