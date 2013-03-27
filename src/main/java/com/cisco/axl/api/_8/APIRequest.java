
package com.cisco.axl.api._8;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * All requests must extend abstractRequest.
 * 
 * <p>Java class for APIRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIRequest")
@XmlSeeAlso({
    AddUserReq.class,
    AddDeviceMobilityGroupReq.class,
    AddTransformationProfileReq.class,
    UpdateCmcInfoReq.class,
    AddCallParkReq.class,
    UpdateCallParkReq.class,
    AddSafForwarderReq.class,
    UpdateMessageWaitingReq.class,
    AddRoutePatternReq.class,
    AddH323TrunkReq.class,
    AddRouteFilterReq.class,
    AddRemoteClusterReq.class,
    AddIvrUserLocaleReq.class,
    AddRecordingProfileReq.class,
    AddPhoneNtpReq.class,
    AddResourcePriorityNamespaceListReq.class,
    AddSafCcdPurgeBlockLearnedRoutesReq.class,
    UpdateApplicationServerReq.class,
    AddPresenceGroupReq.class,
    AddCalledPartyTransformationPatternReq.class,
    UpdateServiceParameterReq.class,
    AddCumaServerSecurityProfileReq.class,
    AddCcdRequestingServiceReq.class,
    UpdateInterClusterServiceProfileReq.class,
    AddHuntListReq.class,
    AddImeEnrolledPatternReq.class,
    AddSipTrunkSecurityProfileReq.class,
    DoDeviceResetReq.class,
    AddGeoLocationReq.class,
    UpdateDhcpServerReq.class,
    UpdateDhcpSubnetReq.class,
    AddCssReq.class,
    AddLineReq.class,
    UpdateVoiceMailPilotReq.class,
    UpdateSipRealmReq.class,
    UpdateTransPatternReq.class,
    AddApplicationDialRulesReq.class,
    AddRemoteDestinationReq.class,
    UpdateProcessNodeServiceReq.class,
    AddDeviceProfileReq.class,
    AddMessageWaitingReq.class,
    AddVg224Req.class,
    AddPhoneSecurityProfileReq.class,
    AddMobileVoiceAccessReq.class,
    AddMediaResourceListReq.class,
    AddDhcpSubnetReq.class,
    UpdateDirectedCallParkReq.class,
    UpdateImeEnrolledPatternReq.class,
    UpdateGatewayReq.class,
    ExecuteSQLUpdateReq.class,
    AddImeFirewallReq.class,
    AddSrstReq.class,
    UpdateIvrUserLocaleReq.class,
    AddDeviceMobilityReq.class,
    AddMeetMeReq.class,
    AddImeExclusionNumberGroupReq.class,
    AddCommonPhoneConfigReq.class,
    AddUnitsToGatewayReq.class,
    UpdateSafCcdPurgeBlockLearnedRoutesReq.class,
    AddCommonDeviceConfigReq.class,
    UpdateHuntPilotReq.class,
    UpdateRemoteDestinationReq.class,
    AddGatewaySubunitsReq.class,
    AddCallerFilterListReq.class,
    UpdateApplicationUserCapfProfileReq.class,
    AddConferenceBridgeReq.class,
    AddAppServerInfoReq.class,
    AddSipTrunkReq.class,
    AddCallPickupGroupReq.class,
    AddTransPatternReq.class,
    AddGatewayEndpointAnalogAccessReq.class,
    AddRouteListReq.class,
    AddApplicationServerReq.class,
    UpdateRoutePatternReq.class,
    AddPhoneButtonTemplateReq.class,
    AddSipDialRulesReq.class,
    AddIpPhoneServicesReq.class,
    AddRouteGroupReq.class,
    AddVpnGatewayReq.class,
    DoDeviceLoginReq.class,
    AddSafSecurityProfileReq.class,
    UpdateMohAudioSourceReq.class,
    AddGatewayReq.class,
    AddRoutePartitionReq.class,
    AddApplicationToSoftkeyTemplateReq.class,
    AddVoiceMailProfileReq.class,
    AddCallingPartyTransformationPatternReq.class,
    AddPhoneReq.class,
    AddH323PhoneReq.class,
    AddMediaResourceGroupReq.class,
    UpdateCcdHostedDNReq.class,
    AddRemoteDestinationProfileReq.class,
    AddImeRouteFilterGroupReq.class,
    UpdateAppUserReq.class,
    AddEndUserCapfProfileReq.class,
    AddLocationReq.class,
    UpdateMlppDomainReq.class,
    AddTranscoderReq.class,
    AddImeClientReq.class,
    UpdateCallPickupGroupReq.class,
    AddSipRealmReq.class,
    AddCtiRoutePointReq.class,
    UpdateCalledPartyTransformationPatternReq.class,
    AddImeRouteFilterElementReq.class,
    UpdateEmccFeatureConfigReq.class,
    UpdateRegionMatrixReq.class,
    UpdateIpPhoneServicesReq.class,
    UpdateVg224Req.class,
    UpdateEndUserCapfProfileReq.class,
    AddGatewayEndpointDigitalAccessT1Req.class,
    AddVpnGroupReq.class,
    AddAppUserReq.class,
    UpdateLicenseCapabilitiesReq.class,
    AddCcdAdvertisingServiceReq.class,
    AddCiscoCatalyst6000T1VoIPGatewayT1Req.class,
    UpdateLineReq.class,
    AddVoiceMailPilotReq.class,
    AddCiscoCatalyst600024PortFXSGatewayReq.class,
    AddTimePeriodReq.class,
    UpdateSipRoutePatternReq.class,
    AddFallbackProfileReq.class,
    AddCallManagerGroupReq.class,
    AddLineGroupReq.class,
    AddHuntPilotReq.class,
    DoDeviceLogoutReq.class,
    UpdateMobileVoiceAccessReq.class,
    DoAuthenticateUserReq.class,
    AddFacInfoReq.class,
    AddProcessNodeReq.class,
    AddCredentialPolicyReq.class,
    AddTodAccessReq.class,
    AddDirectedCallParkReq.class,
    AddGeoLocationFilterReq.class,
    AddImeServerReq.class,
    AddCcdHostedDNGroupReq.class,
    AddGatekeeperReq.class,
    AddMobilityReq.class,
    AddPhysicalLocationReq.class,
    AddFeatureControlPolicyReq.class,
    AddH323GatewayReq.class,
    AddLdapFilterReq.class,
    AddMtpReq.class,
    AddDirectoryLookupDialRulesReq.class,
    UpdateImeExclusionNumberReq.class,
    AddVpnProfileReq.class,
    AddImeEnrolledPatternGroupReq.class,
    AddGatewayEndpointDigitalAccessBriReq.class,
    AddCmcInfoReq.class,
    UpdateTvsCertificateReq.class,
    AddDhcpServerReq.class,
    AddTimeScheduleReq.class,
    AddUserGroupReq.class,
    UpdateResourcePriorityNamespaceReq.class,
    GetNumDevicesReq.class,
    AddCiscoCatalyst6000E1VoIPGatewayReq.class,
    UpdateAppServerInfoReq.class,
    AddGeoLocationPolicyReq.class,
    AddImeExclusionNumberReq.class,
    AddSipProfileReq.class,
    AddUserPhoneAssociationReq.class,
    UpdateUserReq.class,
    AddCiscoCatalyst6000T1VoIPGatewayPriReq.class,
    AddAarGroupReq.class,
    AddGatewayEndpointDigitalAccessPriReq.class,
    AddDefaultDeviceProfileReq.class,
    AddVoiceMailPortReq.class,
    AddCcdHostedDNReq.class,
    ExecuteSQLQueryReq.class,
    UpdateRemoteClusterReq.class,
    UpdateAarGroupMatrixReq.class,
    AddSipRoutePatternReq.class,
    AddApplicationUserCapfProfileReq.class,
    AddDevicePoolReq.class,
    UpdateMeetMeReq.class,
    AddMlppDomainReq.class,
    AddExternalCallControlProfileReq.class,
    UpdatePhoneNtpReq.class,
    AddDateTimeGroupReq.class,
    AddSoftKeyTemplateReq.class,
    AddResourcePriorityNamespaceReq.class,
    AddRegionReq.class,
    UpdateCallingPartyTransformationPatternReq.class,
    AddLdapDirectoryReq.class,
    AddImeE164TransformationReq.class,
    NameAndGUIDRequest.class,
    AddMohServerReq.class,
    AddServiceParameterReq.class,
    AddMobileSmartClientProfileReq.class,
    AddLicenseCapabilitiesReq.class,
    AddAnnunciatorReq.class,
    AddRegionMatrixReq.class,
    AddDdiReq.class,
    AddCallManagerReq.class,
    AddAarGroupMatrixReq.class,
    AddEmccFeatureConfigReq.class,
    AddMohAudioSourceReq.class,
    AddDialPlanReq.class,
    AddFixedMohAudioSourceReq.class,
    AddTvsCertificateReq.class,
    AddInterClusterServiceProfileReq.class,
    AddRoutePlanReq.class,
    AddDialPlanTagReq.class,
    AddProcessNodeServiceReq.class
})
public abstract class APIRequest {

    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}
