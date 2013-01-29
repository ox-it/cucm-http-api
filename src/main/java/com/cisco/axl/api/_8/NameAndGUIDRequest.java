
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a utility object that created because many of the Get, Remove, and Update methods allow the user to specify either the name or the uuid.
 * 
 * <p>Java class for NameAndGUIDRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameAndGUIDRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/8.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="name" type="{http://www.cisco.com/AXL/API/8.5}String100"/>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/8.5}XUUID"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndGUIDRequest", propOrder = {
    "name",
    "uuid"
})
@XmlSeeAlso({
    UpdatePresenceGroupReq.class,
    UpdateImeRouteFilterGroupReq.class,
    UpdateRouteGroupReq.class,
    UpdateCcdHostedDNGroupReq.class,
    UpdateCtiRoutePointReq.class,
    UpdateCcdRequestingServiceReq.class,
    UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.class,
    UpdateCommonDeviceConfigReq.class,
    UpdateTodAccessReq.class,
    UpdateCallManagerGroupReq.class,
    UpdateDeviceProfileReq.class,
    UpdateFallbackProfileReq.class,
    UpdateCredentialPolicyReq.class,
    UpdateSipDialRulesReq.class,
    UpdateCiscoCatalyst600024PortFXSGatewayReq.class,
    UpdateSafForwarderReq.class,
    UpdateTransformationProfileReq.class,
    UpdateRecordingProfileReq.class,
    UpdateCommonPhoneConfigReq.class,
    UpdateLdapFilterReq.class,
    UpdateHuntListReq.class,
    UpdateCiscoCatalyst6000E1VoIPGatewayReq.class,
    UpdateAnnunciatorReq.class,
    UpdateGeoLocationPolicyReq.class,
    UpdateFixedMohAudioSourceReq.class,
    UpdateGatewayEndpointDigitalAccessT1Req.class,
    UpdateImeClientReq.class,
    UpdateImeE164TransformationReq.class,
    UpdateCumaServerSecurityProfileReq.class,
    UpdateCiscoCatalyst6000T1VoIPGatewayPriReq.class,
    UpdateExternalCallControlProfileReq.class,
    UpdateAarGroupReq.class,
    UpdateImeEnrolledPatternGroupReq.class,
    UpdateSipProfileReq.class,
    UpdateApplicationDialRulesReq.class,
    UpdateImeServerReq.class,
    UpdateCcdAdvertisingServiceReq.class,
    UpdateDeviceMobilityReq.class,
    UpdateSipTrunkReq.class,
    UpdateDateTimeGroupReq.class,
    UpdateSrstReq.class,
    UpdateH323TrunkReq.class,
    UpdateMediaResourceGroupReq.class,
    UpdateImeExclusionNumberGroupReq.class,
    UpdateGatekeeperReq.class,
    UpdateConferenceBridgeReq.class,
    UpdateLdapDirectoryReq.class,
    UpdateVpnProfileReq.class,
    UpdatePhysicalLocationReq.class,
    UpdateDirectoryLookupDialRulesReq.class,
    UpdateGeoLocationFilterReq.class,
    UpdateSoftKeySetReq.class,
    UpdateTimePeriodReq.class,
    UpdateRoutePartitionReq.class,
    UpdateRegionReq.class,
    UpdateCallerFilterListReq.class,
    UpdateImeRouteFilterElementReq.class,
    UpdateDefaultDeviceProfileReq.class,
    UpdateDeviceMobilityGroupReq.class,
    UpdateSafSecurityProfileReq.class,
    UpdateGatewayEndpointAnalogAccessReq.class,
    UpdateMediaResourceListReq.class,
    UpdatePhoneSecurityProfileReq.class,
    UpdateRouteFilterReq.class,
    UpdateProcessNodeReq.class,
    UpdateH323PhoneReq.class,
    UpdatePhoneButtonTemplateReq.class,
    UpdateUserGroupReq.class,
    UpdateMohServerReq.class,
    UpdateVpnGroupReq.class,
    UpdateTranscoderReq.class,
    UpdateCallManagerReq.class,
    UpdateDevicePoolReq.class,
    UpdateGatewayEndpointDigitalAccessPriReq.class,
    UpdateSoftKeyTemplateReq.class,
    UpdateVoiceMailProfileReq.class,
    UpdateMobilityProfileReq.class,
    UpdateMtpReq.class,
    UpdateCssReq.class,
    UpdateH323GatewayReq.class,
    UpdateTimeScheduleReq.class,
    UpdateResourcePriorityNamespaceListReq.class,
    UpdateVpnGatewayReq.class,
    UpdateGeoLocationReq.class,
    UpdateVoiceMailPortReq.class,
    UpdateLocationReq.class,
    UpdateFacInfoReq.class,
    UpdateRouteListReq.class,
    UpdatePhoneReq.class,
    UpdateFeatureControlPolicyReq.class,
    UpdateSipTrunkSecurityProfileReq.class,
    UpdateImeFirewallReq.class,
    UpdateLineGroupReq.class,
    UpdateRemoteDestinationProfileReq.class,
    UpdateGatewayEndpointDigitalAccessBriReq.class
})
public class NameAndGUIDRequest
    extends APIRequest
{

    protected String name;
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
