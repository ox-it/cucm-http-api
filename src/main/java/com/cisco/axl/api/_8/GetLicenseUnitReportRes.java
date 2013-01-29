
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLicenseUnitReportRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLicenseUnitReportRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="licenseUnitReport" type="{http://www.cisco.com/AXL/API/8.5}XLicenseUnitReport"/>
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
@XmlType(name = "GetLicenseUnitReportRes", propOrder = {
    "_return"
})
public class GetLicenseUnitReportRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLicenseUnitReportRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLicenseUnitReportRes.Return }
     *     
     */
    public GetLicenseUnitReportRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLicenseUnitReportRes.Return }
     *     
     */
    public void setReturn(GetLicenseUnitReportRes.Return value) {
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
     *         &lt;element name="licenseUnitReport" type="{http://www.cisco.com/AXL/API/8.5}XLicenseUnitReport"/>
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
        "licenseUnitReport"
    })
    public static class Return {

        @XmlElement(required = true)
        protected XLicenseUnitReport licenseUnitReport;

        /**
         * Gets the value of the licenseUnitReport property.
         * 
         * @return
         *     possible object is
         *     {@link XLicenseUnitReport }
         *     
         */
        public XLicenseUnitReport getLicenseUnitReport() {
            return licenseUnitReport;
        }

        /**
         * Sets the value of the licenseUnitReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link XLicenseUnitReport }
         *     
         */
        public void setLicenseUnitReport(XLicenseUnitReport value) {
            this.licenseUnitReport = value;
        }

    }

}
