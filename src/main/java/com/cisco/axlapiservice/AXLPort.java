
package com.cisco.axlapiservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.cisco.axl.api._8.AddAarGroupReq;
import com.cisco.axl.api._8.AddAppServerInfoReq;
import com.cisco.axl.api._8.AddAppUserReq;
import com.cisco.axl.api._8.AddApplicationDialRulesReq;
import com.cisco.axl.api._8.AddApplicationServerReq;
import com.cisco.axl.api._8.AddApplicationToSoftkeyTemplateReq;
import com.cisco.axl.api._8.AddApplicationUserCapfProfileReq;
import com.cisco.axl.api._8.AddCallManagerGroupReq;
import com.cisco.axl.api._8.AddCallParkReq;
import com.cisco.axl.api._8.AddCallPickupGroupReq;
import com.cisco.axl.api._8.AddCalledPartyTransformationPatternReq;
import com.cisco.axl.api._8.AddCallerFilterListReq;
import com.cisco.axl.api._8.AddCallingPartyTransformationPatternReq;
import com.cisco.axl.api._8.AddCcdAdvertisingServiceReq;
import com.cisco.axl.api._8.AddCcdHostedDNGroupReq;
import com.cisco.axl.api._8.AddCcdHostedDNReq;
import com.cisco.axl.api._8.AddCcdRequestingServiceReq;
import com.cisco.axl.api._8.AddCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._8.AddCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._8.AddCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._8.AddCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._8.AddCmcInfoReq;
import com.cisco.axl.api._8.AddCommonDeviceConfigReq;
import com.cisco.axl.api._8.AddCommonPhoneConfigReq;
import com.cisco.axl.api._8.AddConferenceBridgeReq;
import com.cisco.axl.api._8.AddCredentialPolicyReq;
import com.cisco.axl.api._8.AddCssReq;
import com.cisco.axl.api._8.AddCtiRoutePointReq;
import com.cisco.axl.api._8.AddCumaServerSecurityProfileReq;
import com.cisco.axl.api._8.AddDateTimeGroupReq;
import com.cisco.axl.api._8.AddDefaultDeviceProfileReq;
import com.cisco.axl.api._8.AddDeviceMobilityGroupReq;
import com.cisco.axl.api._8.AddDeviceMobilityReq;
import com.cisco.axl.api._8.AddDevicePoolReq;
import com.cisco.axl.api._8.AddDeviceProfileReq;
import com.cisco.axl.api._8.AddDhcpServerReq;
import com.cisco.axl.api._8.AddDhcpSubnetReq;
import com.cisco.axl.api._8.AddDirectedCallParkReq;
import com.cisco.axl.api._8.AddDirectoryLookupDialRulesReq;
import com.cisco.axl.api._8.AddEndUserCapfProfileReq;
import com.cisco.axl.api._8.AddExternalCallControlProfileReq;
import com.cisco.axl.api._8.AddFacInfoReq;
import com.cisco.axl.api._8.AddFallbackProfileReq;
import com.cisco.axl.api._8.AddFeatureControlPolicyReq;
import com.cisco.axl.api._8.AddGatekeeperReq;
import com.cisco.axl.api._8.AddGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._8.AddGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._8.AddGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._8.AddGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._8.AddGatewayReq;
import com.cisco.axl.api._8.AddGatewaySubunitsReq;
import com.cisco.axl.api._8.AddGeoLocationFilterReq;
import com.cisco.axl.api._8.AddGeoLocationPolicyReq;
import com.cisco.axl.api._8.AddGeoLocationReq;
import com.cisco.axl.api._8.AddH323GatewayReq;
import com.cisco.axl.api._8.AddH323PhoneReq;
import com.cisco.axl.api._8.AddH323TrunkReq;
import com.cisco.axl.api._8.AddHuntListReq;
import com.cisco.axl.api._8.AddHuntPilotReq;
import com.cisco.axl.api._8.AddImeClientReq;
import com.cisco.axl.api._8.AddImeE164TransformationReq;
import com.cisco.axl.api._8.AddImeEnrolledPatternGroupReq;
import com.cisco.axl.api._8.AddImeEnrolledPatternReq;
import com.cisco.axl.api._8.AddImeExclusionNumberGroupReq;
import com.cisco.axl.api._8.AddImeExclusionNumberReq;
import com.cisco.axl.api._8.AddImeFirewallReq;
import com.cisco.axl.api._8.AddImeRouteFilterElementReq;
import com.cisco.axl.api._8.AddImeRouteFilterGroupReq;
import com.cisco.axl.api._8.AddImeServerReq;
import com.cisco.axl.api._8.AddIpPhoneServicesReq;
import com.cisco.axl.api._8.AddIvrUserLocaleReq;
import com.cisco.axl.api._8.AddLdapDirectoryReq;
import com.cisco.axl.api._8.AddLdapFilterReq;
import com.cisco.axl.api._8.AddLineGroupReq;
import com.cisco.axl.api._8.AddLineReq;
import com.cisco.axl.api._8.AddLocationReq;
import com.cisco.axl.api._8.AddMediaResourceGroupReq;
import com.cisco.axl.api._8.AddMediaResourceListReq;
import com.cisco.axl.api._8.AddMeetMeReq;
import com.cisco.axl.api._8.AddMessageWaitingReq;
import com.cisco.axl.api._8.AddMlppDomainReq;
import com.cisco.axl.api._8.AddMobileVoiceAccessReq;
import com.cisco.axl.api._8.AddMobilityReq;
import com.cisco.axl.api._8.AddMtpReq;
import com.cisco.axl.api._8.AddPhoneButtonTemplateReq;
import com.cisco.axl.api._8.AddPhoneNtpReq;
import com.cisco.axl.api._8.AddPhoneReq;
import com.cisco.axl.api._8.AddPhoneSecurityProfileReq;
import com.cisco.axl.api._8.AddPhysicalLocationReq;
import com.cisco.axl.api._8.AddPresenceGroupReq;
import com.cisco.axl.api._8.AddProcessNodeReq;
import com.cisco.axl.api._8.AddRecordingProfileReq;
import com.cisco.axl.api._8.AddRegionReq;
import com.cisco.axl.api._8.AddRemoteClusterReq;
import com.cisco.axl.api._8.AddRemoteDestinationProfileReq;
import com.cisco.axl.api._8.AddRemoteDestinationReq;
import com.cisco.axl.api._8.AddResourcePriorityNamespaceListReq;
import com.cisco.axl.api._8.AddResourcePriorityNamespaceReq;
import com.cisco.axl.api._8.AddRouteFilterReq;
import com.cisco.axl.api._8.AddRouteGroupReq;
import com.cisco.axl.api._8.AddRouteListReq;
import com.cisco.axl.api._8.AddRoutePartitionReq;
import com.cisco.axl.api._8.AddRoutePatternReq;
import com.cisco.axl.api._8.AddSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._8.AddSafForwarderReq;
import com.cisco.axl.api._8.AddSafSecurityProfileReq;
import com.cisco.axl.api._8.AddSipDialRulesReq;
import com.cisco.axl.api._8.AddSipProfileReq;
import com.cisco.axl.api._8.AddSipRealmReq;
import com.cisco.axl.api._8.AddSipRoutePatternReq;
import com.cisco.axl.api._8.AddSipTrunkReq;
import com.cisco.axl.api._8.AddSipTrunkSecurityProfileReq;
import com.cisco.axl.api._8.AddSoftKeyTemplateReq;
import com.cisco.axl.api._8.AddSrstReq;
import com.cisco.axl.api._8.AddTimePeriodReq;
import com.cisco.axl.api._8.AddTimeScheduleReq;
import com.cisco.axl.api._8.AddTodAccessReq;
import com.cisco.axl.api._8.AddTransPatternReq;
import com.cisco.axl.api._8.AddTranscoderReq;
import com.cisco.axl.api._8.AddTransformationProfileReq;
import com.cisco.axl.api._8.AddUnitsToGatewayReq;
import com.cisco.axl.api._8.AddUserGroupReq;
import com.cisco.axl.api._8.AddUserPhoneAssociationReq;
import com.cisco.axl.api._8.AddUserReq;
import com.cisco.axl.api._8.AddVg224Req;
import com.cisco.axl.api._8.AddVoiceMailPilotReq;
import com.cisco.axl.api._8.AddVoiceMailPortReq;
import com.cisco.axl.api._8.AddVoiceMailProfileReq;
import com.cisco.axl.api._8.AddVpnGatewayReq;
import com.cisco.axl.api._8.AddVpnGroupReq;
import com.cisco.axl.api._8.AddVpnProfileReq;
import com.cisco.axl.api._8.DoAuthenticateUserReq;
import com.cisco.axl.api._8.DoAuthenticateUserRes;
import com.cisco.axl.api._8.DoDeviceLoginReq;
import com.cisco.axl.api._8.DoDeviceLoginRes;
import com.cisco.axl.api._8.DoDeviceLogoutReq;
import com.cisco.axl.api._8.DoDeviceLogoutRes;
import com.cisco.axl.api._8.DoDeviceResetReq;
import com.cisco.axl.api._8.DoDeviceResetRes;
import com.cisco.axl.api._8.ExecuteSQLQueryReq;
import com.cisco.axl.api._8.ExecuteSQLQueryRes;
import com.cisco.axl.api._8.ExecuteSQLUpdateReq;
import com.cisco.axl.api._8.ExecuteSQLUpdateRes;
import com.cisco.axl.api._8.GetAarGroupReq;
import com.cisco.axl.api._8.GetAarGroupRes;
import com.cisco.axl.api._8.GetAnnunciatorReq;
import com.cisco.axl.api._8.GetAnnunciatorRes;
import com.cisco.axl.api._8.GetAppServerInfoReq;
import com.cisco.axl.api._8.GetAppServerInfoRes;
import com.cisco.axl.api._8.GetAppUserReq;
import com.cisco.axl.api._8.GetAppUserRes;
import com.cisco.axl.api._8.GetApplicationDialRulesReq;
import com.cisco.axl.api._8.GetApplicationDialRulesRes;
import com.cisco.axl.api._8.GetApplicationServerReq;
import com.cisco.axl.api._8.GetApplicationServerRes;
import com.cisco.axl.api._8.GetApplicationUserCapfProfileReq;
import com.cisco.axl.api._8.GetApplicationUserCapfProfileRes;
import com.cisco.axl.api._8.GetCCMVersionReq;
import com.cisco.axl.api._8.GetCCMVersionRes;
import com.cisco.axl.api._8.GetCallManagerGroupReq;
import com.cisco.axl.api._8.GetCallManagerGroupRes;
import com.cisco.axl.api._8.GetCallManagerReq;
import com.cisco.axl.api._8.GetCallManagerRes;
import com.cisco.axl.api._8.GetCallParkReq;
import com.cisco.axl.api._8.GetCallParkRes;
import com.cisco.axl.api._8.GetCallPickupGroupReq;
import com.cisco.axl.api._8.GetCallPickupGroupRes;
import com.cisco.axl.api._8.GetCalledPartyTransformationPatternReq;
import com.cisco.axl.api._8.GetCalledPartyTransformationPatternRes;
import com.cisco.axl.api._8.GetCallerFilterListReq;
import com.cisco.axl.api._8.GetCallerFilterListRes;
import com.cisco.axl.api._8.GetCallingPartyTransformationPatternReq;
import com.cisco.axl.api._8.GetCallingPartyTransformationPatternRes;
import com.cisco.axl.api._8.GetCcdAdvertisingServiceReq;
import com.cisco.axl.api._8.GetCcdAdvertisingServiceRes;
import com.cisco.axl.api._8.GetCcdHostedDNGroupReq;
import com.cisco.axl.api._8.GetCcdHostedDNGroupRes;
import com.cisco.axl.api._8.GetCcdHostedDNReq;
import com.cisco.axl.api._8.GetCcdHostedDNRes;
import com.cisco.axl.api._8.GetCcdRequestingServiceReq;
import com.cisco.axl.api._8.GetCcdRequestingServiceRes;
import com.cisco.axl.api._8.GetCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._8.GetCiscoCatalyst600024PortFXSGatewayRes;
import com.cisco.axl.api._8.GetCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._8.GetCiscoCatalyst6000E1VoIPGatewayRes;
import com.cisco.axl.api._8.GetCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._8.GetCiscoCatalyst6000T1VoIPGatewayPriRes;
import com.cisco.axl.api._8.GetCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._8.GetCiscoCatalyst6000T1VoIPGatewayT1Res;
import com.cisco.axl.api._8.GetCmcInfoReq;
import com.cisco.axl.api._8.GetCmcInfoRes;
import com.cisco.axl.api._8.GetCommonDeviceConfigReq;
import com.cisco.axl.api._8.GetCommonDeviceConfigRes;
import com.cisco.axl.api._8.GetCommonPhoneConfigReq;
import com.cisco.axl.api._8.GetCommonPhoneConfigRes;
import com.cisco.axl.api._8.GetConferenceBridgeReq;
import com.cisco.axl.api._8.GetConferenceBridgeRes;
import com.cisco.axl.api._8.GetCredentialPolicyReq;
import com.cisco.axl.api._8.GetCredentialPolicyRes;
import com.cisco.axl.api._8.GetCssReq;
import com.cisco.axl.api._8.GetCssRes;
import com.cisco.axl.api._8.GetCtiRoutePointReq;
import com.cisco.axl.api._8.GetCtiRoutePointRes;
import com.cisco.axl.api._8.GetCumaServerSecurityProfileReq;
import com.cisco.axl.api._8.GetCumaServerSecurityProfileRes;
import com.cisco.axl.api._8.GetDateTimeGroupReq;
import com.cisco.axl.api._8.GetDateTimeGroupRes;
import com.cisco.axl.api._8.GetDdiReq;
import com.cisco.axl.api._8.GetDdiRes;
import com.cisco.axl.api._8.GetDefaultDeviceProfileReq;
import com.cisco.axl.api._8.GetDefaultDeviceProfileRes;
import com.cisco.axl.api._8.GetDeviceMobilityGroupReq;
import com.cisco.axl.api._8.GetDeviceMobilityGroupRes;
import com.cisco.axl.api._8.GetDeviceMobilityReq;
import com.cisco.axl.api._8.GetDeviceMobilityRes;
import com.cisco.axl.api._8.GetDevicePoolReq;
import com.cisco.axl.api._8.GetDevicePoolRes;
import com.cisco.axl.api._8.GetDeviceProfileReq;
import com.cisco.axl.api._8.GetDeviceProfileRes;
import com.cisco.axl.api._8.GetDhcpServerReq;
import com.cisco.axl.api._8.GetDhcpServerRes;
import com.cisco.axl.api._8.GetDhcpSubnetReq;
import com.cisco.axl.api._8.GetDhcpSubnetRes;
import com.cisco.axl.api._8.GetDialPlanReq;
import com.cisco.axl.api._8.GetDialPlanRes;
import com.cisco.axl.api._8.GetDialPlanTagReq;
import com.cisco.axl.api._8.GetDialPlanTagRes;
import com.cisco.axl.api._8.GetDirectedCallParkReq;
import com.cisco.axl.api._8.GetDirectedCallParkRes;
import com.cisco.axl.api._8.GetDirectoryLookupDialRulesReq;
import com.cisco.axl.api._8.GetDirectoryLookupDialRulesRes;
import com.cisco.axl.api._8.GetEmccFeatureConfigReq;
import com.cisco.axl.api._8.GetEmccFeatureConfigRes;
import com.cisco.axl.api._8.GetEndUserCapfProfileReq;
import com.cisco.axl.api._8.GetEndUserCapfProfileRes;
import com.cisco.axl.api._8.GetEnterprisePhoneConfigReq;
import com.cisco.axl.api._8.GetEnterprisePhoneConfigRes;
import com.cisco.axl.api._8.GetExternalCallControlProfileReq;
import com.cisco.axl.api._8.GetExternalCallControlProfileRes;
import com.cisco.axl.api._8.GetFacInfoReq;
import com.cisco.axl.api._8.GetFacInfoRes;
import com.cisco.axl.api._8.GetFallbackFeatureConfigReq;
import com.cisco.axl.api._8.GetFallbackFeatureConfigRes;
import com.cisco.axl.api._8.GetFallbackProfileReq;
import com.cisco.axl.api._8.GetFallbackProfileRes;
import com.cisco.axl.api._8.GetFeatureControlPolicyReq;
import com.cisco.axl.api._8.GetFeatureControlPolicyRes;
import com.cisco.axl.api._8.GetFixedMohAudioSourceReq;
import com.cisco.axl.api._8.GetFixedMohAudioSourceRes;
import com.cisco.axl.api._8.GetGatekeeperReq;
import com.cisco.axl.api._8.GetGatekeeperRes;
import com.cisco.axl.api._8.GetGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._8.GetGatewayEndpointAnalogAccessRes;
import com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessBriRes;
import com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessPriRes;
import com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessT1Res;
import com.cisco.axl.api._8.GetGatewayReq;
import com.cisco.axl.api._8.GetGatewayRes;
import com.cisco.axl.api._8.GetGeoLocationFilterReq;
import com.cisco.axl.api._8.GetGeoLocationFilterRes;
import com.cisco.axl.api._8.GetGeoLocationPolicyReq;
import com.cisco.axl.api._8.GetGeoLocationPolicyRes;
import com.cisco.axl.api._8.GetGeoLocationReq;
import com.cisco.axl.api._8.GetGeoLocationRes;
import com.cisco.axl.api._8.GetH323GatewayReq;
import com.cisco.axl.api._8.GetH323GatewayRes;
import com.cisco.axl.api._8.GetH323PhoneReq;
import com.cisco.axl.api._8.GetH323PhoneRes;
import com.cisco.axl.api._8.GetH323TrunkReq;
import com.cisco.axl.api._8.GetH323TrunkRes;
import com.cisco.axl.api._8.GetHuntListReq;
import com.cisco.axl.api._8.GetHuntListRes;
import com.cisco.axl.api._8.GetHuntPilotReq;
import com.cisco.axl.api._8.GetHuntPilotRes;
import com.cisco.axl.api._8.GetImeClientReq;
import com.cisco.axl.api._8.GetImeClientRes;
import com.cisco.axl.api._8.GetImeE164TransformationReq;
import com.cisco.axl.api._8.GetImeE164TransformationRes;
import com.cisco.axl.api._8.GetImeEnrolledPatternGroupReq;
import com.cisco.axl.api._8.GetImeEnrolledPatternGroupRes;
import com.cisco.axl.api._8.GetImeEnrolledPatternReq;
import com.cisco.axl.api._8.GetImeEnrolledPatternRes;
import com.cisco.axl.api._8.GetImeExclusionNumberGroupReq;
import com.cisco.axl.api._8.GetImeExclusionNumberGroupRes;
import com.cisco.axl.api._8.GetImeExclusionNumberReq;
import com.cisco.axl.api._8.GetImeExclusionNumberRes;
import com.cisco.axl.api._8.GetImeFeatureConfigReq;
import com.cisco.axl.api._8.GetImeFeatureConfigRes;
import com.cisco.axl.api._8.GetImeFirewallReq;
import com.cisco.axl.api._8.GetImeFirewallRes;
import com.cisco.axl.api._8.GetImeRouteFilterElementReq;
import com.cisco.axl.api._8.GetImeRouteFilterElementRes;
import com.cisco.axl.api._8.GetImeRouteFilterGroupReq;
import com.cisco.axl.api._8.GetImeRouteFilterGroupRes;
import com.cisco.axl.api._8.GetImeServerReq;
import com.cisco.axl.api._8.GetImeServerRes;
import com.cisco.axl.api._8.GetInterClusterServiceProfileReq;
import com.cisco.axl.api._8.GetInterClusterServiceProfileRes;
import com.cisco.axl.api._8.GetIpPhoneServicesReq;
import com.cisco.axl.api._8.GetIpPhoneServicesRes;
import com.cisco.axl.api._8.GetIvrUserLocaleReq;
import com.cisco.axl.api._8.GetIvrUserLocaleRes;
import com.cisco.axl.api._8.GetLdapAuthenticationReq;
import com.cisco.axl.api._8.GetLdapAuthenticationRes;
import com.cisco.axl.api._8.GetLdapDirectoryReq;
import com.cisco.axl.api._8.GetLdapDirectoryRes;
import com.cisco.axl.api._8.GetLdapFilterReq;
import com.cisco.axl.api._8.GetLdapFilterRes;
import com.cisco.axl.api._8.GetLdapSystemReq;
import com.cisco.axl.api._8.GetLdapSystemRes;
import com.cisco.axl.api._8.GetLicenseCapabilitiesReq;
import com.cisco.axl.api._8.GetLicenseCapabilitiesRes;
import com.cisco.axl.api._8.GetLicenseUnitReportReq;
import com.cisco.axl.api._8.GetLicenseUnitReportRes;
import com.cisco.axl.api._8.GetLineGroupReq;
import com.cisco.axl.api._8.GetLineGroupRes;
import com.cisco.axl.api._8.GetLineReq;
import com.cisco.axl.api._8.GetLineRes;
import com.cisco.axl.api._8.GetLocationReq;
import com.cisco.axl.api._8.GetLocationRes;
import com.cisco.axl.api._8.GetMediaResourceGroupReq;
import com.cisco.axl.api._8.GetMediaResourceGroupRes;
import com.cisco.axl.api._8.GetMediaResourceListReq;
import com.cisco.axl.api._8.GetMediaResourceListRes;
import com.cisco.axl.api._8.GetMeetMeReq;
import com.cisco.axl.api._8.GetMeetMeRes;
import com.cisco.axl.api._8.GetMessageWaitingReq;
import com.cisco.axl.api._8.GetMessageWaitingRes;
import com.cisco.axl.api._8.GetMlppDomainReq;
import com.cisco.axl.api._8.GetMlppDomainRes;
import com.cisco.axl.api._8.GetMobileSmartClientProfileReq;
import com.cisco.axl.api._8.GetMobileSmartClientProfileRes;
import com.cisco.axl.api._8.GetMobileVoiceAccessReq;
import com.cisco.axl.api._8.GetMobileVoiceAccessRes;
import com.cisco.axl.api._8.GetMobilityReq;
import com.cisco.axl.api._8.GetMobilityRes;
import com.cisco.axl.api._8.GetMohAudioSourceReq;
import com.cisco.axl.api._8.GetMohAudioSourceRes;
import com.cisco.axl.api._8.GetMohServerReq;
import com.cisco.axl.api._8.GetMohServerRes;
import com.cisco.axl.api._8.GetMtpReq;
import com.cisco.axl.api._8.GetMtpRes;
import com.cisco.axl.api._8.GetNumDevicesReq;
import com.cisco.axl.api._8.GetNumDevicesResponse;
import com.cisco.axl.api._8.GetOSVersionReq;
import com.cisco.axl.api._8.GetOSVersionRes;
import com.cisco.axl.api._8.GetPhoneButtonTemplateReq;
import com.cisco.axl.api._8.GetPhoneButtonTemplateRes;
import com.cisco.axl.api._8.GetPhoneNtpReq;
import com.cisco.axl.api._8.GetPhoneNtpRes;
import com.cisco.axl.api._8.GetPhoneReq;
import com.cisco.axl.api._8.GetPhoneRes;
import com.cisco.axl.api._8.GetPhoneSecurityProfileReq;
import com.cisco.axl.api._8.GetPhoneSecurityProfileRes;
import com.cisco.axl.api._8.GetPhysicalLocationReq;
import com.cisco.axl.api._8.GetPhysicalLocationRes;
import com.cisco.axl.api._8.GetPresenceGroupReq;
import com.cisco.axl.api._8.GetPresenceGroupRes;
import com.cisco.axl.api._8.GetProcessNodeReq;
import com.cisco.axl.api._8.GetProcessNodeRes;
import com.cisco.axl.api._8.GetProcessNodeServiceReq;
import com.cisco.axl.api._8.GetProcessNodeServiceRes;
import com.cisco.axl.api._8.GetRecordingProfileReq;
import com.cisco.axl.api._8.GetRecordingProfileRes;
import com.cisco.axl.api._8.GetRegionReq;
import com.cisco.axl.api._8.GetRegionRes;
import com.cisco.axl.api._8.GetRemoteClusterReq;
import com.cisco.axl.api._8.GetRemoteClusterRes;
import com.cisco.axl.api._8.GetRemoteDestinationProfileReq;
import com.cisco.axl.api._8.GetRemoteDestinationProfileRes;
import com.cisco.axl.api._8.GetRemoteDestinationReq;
import com.cisco.axl.api._8.GetRemoteDestinationRes;
import com.cisco.axl.api._8.GetResourcePriorityNamespaceListReq;
import com.cisco.axl.api._8.GetResourcePriorityNamespaceListRes;
import com.cisco.axl.api._8.GetResourcePriorityNamespaceReq;
import com.cisco.axl.api._8.GetResourcePriorityNamespaceRes;
import com.cisco.axl.api._8.GetRouteFilterReq;
import com.cisco.axl.api._8.GetRouteFilterRes;
import com.cisco.axl.api._8.GetRouteGroupReq;
import com.cisco.axl.api._8.GetRouteGroupRes;
import com.cisco.axl.api._8.GetRouteListReq;
import com.cisco.axl.api._8.GetRouteListRes;
import com.cisco.axl.api._8.GetRoutePartitionReq;
import com.cisco.axl.api._8.GetRoutePartitionRes;
import com.cisco.axl.api._8.GetRoutePatternReq;
import com.cisco.axl.api._8.GetRoutePatternRes;
import com.cisco.axl.api._8.GetSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._8.GetSafCcdPurgeBlockLearnedRoutesRes;
import com.cisco.axl.api._8.GetSafForwarderReq;
import com.cisco.axl.api._8.GetSafForwarderRes;
import com.cisco.axl.api._8.GetSafSecurityProfileReq;
import com.cisco.axl.api._8.GetSafSecurityProfileRes;
import com.cisco.axl.api._8.GetServiceParameterReq;
import com.cisco.axl.api._8.GetServiceParameterRes;
import com.cisco.axl.api._8.GetSipDialRulesReq;
import com.cisco.axl.api._8.GetSipDialRulesRes;
import com.cisco.axl.api._8.GetSipProfileReq;
import com.cisco.axl.api._8.GetSipProfileRes;
import com.cisco.axl.api._8.GetSipRealmReq;
import com.cisco.axl.api._8.GetSipRealmRes;
import com.cisco.axl.api._8.GetSipRoutePatternReq;
import com.cisco.axl.api._8.GetSipRoutePatternRes;
import com.cisco.axl.api._8.GetSipTrunkReq;
import com.cisco.axl.api._8.GetSipTrunkRes;
import com.cisco.axl.api._8.GetSipTrunkSecurityProfileReq;
import com.cisco.axl.api._8.GetSipTrunkSecurityProfileRes;
import com.cisco.axl.api._8.GetSoftKeyTemplateReq;
import com.cisco.axl.api._8.GetSoftKeyTemplateRes;
import com.cisco.axl.api._8.GetSrstReq;
import com.cisco.axl.api._8.GetSrstRes;
import com.cisco.axl.api._8.GetTimePeriodReq;
import com.cisco.axl.api._8.GetTimePeriodRes;
import com.cisco.axl.api._8.GetTimeScheduleReq;
import com.cisco.axl.api._8.GetTimeScheduleRes;
import com.cisco.axl.api._8.GetTodAccessReq;
import com.cisco.axl.api._8.GetTodAccessRes;
import com.cisco.axl.api._8.GetTransPatternReq;
import com.cisco.axl.api._8.GetTransPatternRes;
import com.cisco.axl.api._8.GetTranscoderReq;
import com.cisco.axl.api._8.GetTranscoderRes;
import com.cisco.axl.api._8.GetTransformationProfileReq;
import com.cisco.axl.api._8.GetTransformationProfileRes;
import com.cisco.axl.api._8.GetTvsCertificateReq;
import com.cisco.axl.api._8.GetTvsCertificateRes;
import com.cisco.axl.api._8.GetUserGroupReq;
import com.cisco.axl.api._8.GetUserGroupRes;
import com.cisco.axl.api._8.GetUserReq;
import com.cisco.axl.api._8.GetUserRes;
import com.cisco.axl.api._8.GetVg224Req;
import com.cisco.axl.api._8.GetVg224Res;
import com.cisco.axl.api._8.GetVoiceMailPilotReq;
import com.cisco.axl.api._8.GetVoiceMailPilotRes;
import com.cisco.axl.api._8.GetVoiceMailPortReq;
import com.cisco.axl.api._8.GetVoiceMailPortRes;
import com.cisco.axl.api._8.GetVoiceMailProfileReq;
import com.cisco.axl.api._8.GetVoiceMailProfileRes;
import com.cisco.axl.api._8.GetVpnGatewayReq;
import com.cisco.axl.api._8.GetVpnGatewayRes;
import com.cisco.axl.api._8.GetVpnGroupReq;
import com.cisco.axl.api._8.GetVpnGroupRes;
import com.cisco.axl.api._8.GetVpnProfileReq;
import com.cisco.axl.api._8.GetVpnProfileRes;
import com.cisco.axl.api._8.ListAarGroupReq;
import com.cisco.axl.api._8.ListAarGroupRes;
import com.cisco.axl.api._8.ListAnnunciatorReq;
import com.cisco.axl.api._8.ListAnnunciatorRes;
import com.cisco.axl.api._8.ListAppUserReq;
import com.cisco.axl.api._8.ListAppUserRes;
import com.cisco.axl.api._8.ListApplicationDialRulesReq;
import com.cisco.axl.api._8.ListApplicationDialRulesRes;
import com.cisco.axl.api._8.ListApplicationServerReq;
import com.cisco.axl.api._8.ListApplicationServerRes;
import com.cisco.axl.api._8.ListApplicationUserCapfProfileReq;
import com.cisco.axl.api._8.ListApplicationUserCapfProfileRes;
import com.cisco.axl.api._8.ListCallManagerGroupReq;
import com.cisco.axl.api._8.ListCallManagerGroupRes;
import com.cisco.axl.api._8.ListCallManagerReq;
import com.cisco.axl.api._8.ListCallManagerRes;
import com.cisco.axl.api._8.ListCallParkReq;
import com.cisco.axl.api._8.ListCallParkRes;
import com.cisco.axl.api._8.ListCallPickupGroupReq;
import com.cisco.axl.api._8.ListCallPickupGroupRes;
import com.cisco.axl.api._8.ListCalledPartyTransformationPatternReq;
import com.cisco.axl.api._8.ListCalledPartyTransformationPatternRes;
import com.cisco.axl.api._8.ListCallerFilterListReq;
import com.cisco.axl.api._8.ListCallerFilterListRes;
import com.cisco.axl.api._8.ListCallingPartyTransformationPatternReq;
import com.cisco.axl.api._8.ListCallingPartyTransformationPatternRes;
import com.cisco.axl.api._8.ListCcdAdvertisingServiceReq;
import com.cisco.axl.api._8.ListCcdAdvertisingServiceRes;
import com.cisco.axl.api._8.ListCcdHostedDNGroupReq;
import com.cisco.axl.api._8.ListCcdHostedDNGroupRes;
import com.cisco.axl.api._8.ListCcdHostedDNReq;
import com.cisco.axl.api._8.ListCcdHostedDNRes;
import com.cisco.axl.api._8.ListCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._8.ListCiscoCatalyst600024PortFXSGatewayRes;
import com.cisco.axl.api._8.ListCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._8.ListCiscoCatalyst6000E1VoIPGatewayRes;
import com.cisco.axl.api._8.ListCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._8.ListCiscoCatalyst6000T1VoIPGatewayPriRes;
import com.cisco.axl.api._8.ListCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._8.ListCiscoCatalyst6000T1VoIPGatewayT1Res;
import com.cisco.axl.api._8.ListCmcInfoReq;
import com.cisco.axl.api._8.ListCmcInfoRes;
import com.cisco.axl.api._8.ListCommonDeviceConfigReq;
import com.cisco.axl.api._8.ListCommonDeviceConfigRes;
import com.cisco.axl.api._8.ListCommonPhoneConfigReq;
import com.cisco.axl.api._8.ListCommonPhoneConfigRes;
import com.cisco.axl.api._8.ListConferenceBridgeReq;
import com.cisco.axl.api._8.ListConferenceBridgeRes;
import com.cisco.axl.api._8.ListCredentialPolicyReq;
import com.cisco.axl.api._8.ListCredentialPolicyRes;
import com.cisco.axl.api._8.ListCssReq;
import com.cisco.axl.api._8.ListCssRes;
import com.cisco.axl.api._8.ListCtiRoutePointReq;
import com.cisco.axl.api._8.ListCtiRoutePointRes;
import com.cisco.axl.api._8.ListCumaServerSecurityProfileReq;
import com.cisco.axl.api._8.ListCumaServerSecurityProfileRes;
import com.cisco.axl.api._8.ListDateTimeGroupReq;
import com.cisco.axl.api._8.ListDateTimeGroupRes;
import com.cisco.axl.api._8.ListDdiReq;
import com.cisco.axl.api._8.ListDdiRes;
import com.cisco.axl.api._8.ListDefaultDeviceProfileReq;
import com.cisco.axl.api._8.ListDefaultDeviceProfileRes;
import com.cisco.axl.api._8.ListDeviceMobilityGroupReq;
import com.cisco.axl.api._8.ListDeviceMobilityGroupRes;
import com.cisco.axl.api._8.ListDeviceMobilityReq;
import com.cisco.axl.api._8.ListDeviceMobilityRes;
import com.cisco.axl.api._8.ListDevicePoolReq;
import com.cisco.axl.api._8.ListDevicePoolRes;
import com.cisco.axl.api._8.ListDeviceProfileReq;
import com.cisco.axl.api._8.ListDeviceProfileRes;
import com.cisco.axl.api._8.ListDhcpServerReq;
import com.cisco.axl.api._8.ListDhcpServerRes;
import com.cisco.axl.api._8.ListDhcpSubnetReq;
import com.cisco.axl.api._8.ListDhcpSubnetRes;
import com.cisco.axl.api._8.ListDialPlanReq;
import com.cisco.axl.api._8.ListDialPlanRes;
import com.cisco.axl.api._8.ListDialPlanTagReq;
import com.cisco.axl.api._8.ListDialPlanTagRes;
import com.cisco.axl.api._8.ListDirectedCallParkReq;
import com.cisco.axl.api._8.ListDirectedCallParkRes;
import com.cisco.axl.api._8.ListDirectoryLookupDialRulesReq;
import com.cisco.axl.api._8.ListDirectoryLookupDialRulesRes;
import com.cisco.axl.api._8.ListEndUserCapfProfileReq;
import com.cisco.axl.api._8.ListEndUserCapfProfileRes;
import com.cisco.axl.api._8.ListExternalCallControlProfileReq;
import com.cisco.axl.api._8.ListExternalCallControlProfileRes;
import com.cisco.axl.api._8.ListFacInfoReq;
import com.cisco.axl.api._8.ListFacInfoRes;
import com.cisco.axl.api._8.ListFallbackProfileReq;
import com.cisco.axl.api._8.ListFallbackProfileRes;
import com.cisco.axl.api._8.ListFeatureControlPolicyReq;
import com.cisco.axl.api._8.ListFeatureControlPolicyRes;
import com.cisco.axl.api._8.ListGatekeeperReq;
import com.cisco.axl.api._8.ListGatekeeperRes;
import com.cisco.axl.api._8.ListGatewayReq;
import com.cisco.axl.api._8.ListGatewayRes;
import com.cisco.axl.api._8.ListGeoLocationFilterReq;
import com.cisco.axl.api._8.ListGeoLocationFilterRes;
import com.cisco.axl.api._8.ListGeoLocationPolicyReq;
import com.cisco.axl.api._8.ListGeoLocationPolicyRes;
import com.cisco.axl.api._8.ListGeoLocationReq;
import com.cisco.axl.api._8.ListGeoLocationRes;
import com.cisco.axl.api._8.ListH323GatewayReq;
import com.cisco.axl.api._8.ListH323GatewayRes;
import com.cisco.axl.api._8.ListH323PhoneReq;
import com.cisco.axl.api._8.ListH323PhoneRes;
import com.cisco.axl.api._8.ListH323TrunkReq;
import com.cisco.axl.api._8.ListH323TrunkRes;
import com.cisco.axl.api._8.ListHuntListReq;
import com.cisco.axl.api._8.ListHuntListRes;
import com.cisco.axl.api._8.ListHuntPilotReq;
import com.cisco.axl.api._8.ListHuntPilotRes;
import com.cisco.axl.api._8.ListImeClientReq;
import com.cisco.axl.api._8.ListImeClientRes;
import com.cisco.axl.api._8.ListImeE164TransformationReq;
import com.cisco.axl.api._8.ListImeE164TransformationRes;
import com.cisco.axl.api._8.ListImeEnrolledPatternGroupReq;
import com.cisco.axl.api._8.ListImeEnrolledPatternGroupRes;
import com.cisco.axl.api._8.ListImeEnrolledPatternReq;
import com.cisco.axl.api._8.ListImeEnrolledPatternRes;
import com.cisco.axl.api._8.ListImeExclusionNumberGroupReq;
import com.cisco.axl.api._8.ListImeExclusionNumberGroupRes;
import com.cisco.axl.api._8.ListImeExclusionNumberReq;
import com.cisco.axl.api._8.ListImeExclusionNumberRes;
import com.cisco.axl.api._8.ListImeFirewallReq;
import com.cisco.axl.api._8.ListImeFirewallRes;
import com.cisco.axl.api._8.ListImeRouteFilterElementReq;
import com.cisco.axl.api._8.ListImeRouteFilterElementRes;
import com.cisco.axl.api._8.ListImeRouteFilterGroupReq;
import com.cisco.axl.api._8.ListImeRouteFilterGroupRes;
import com.cisco.axl.api._8.ListImeServerReq;
import com.cisco.axl.api._8.ListImeServerRes;
import com.cisco.axl.api._8.ListIpPhoneServicesReq;
import com.cisco.axl.api._8.ListIpPhoneServicesRes;
import com.cisco.axl.api._8.ListIvrUserLocaleReq;
import com.cisco.axl.api._8.ListIvrUserLocaleRes;
import com.cisco.axl.api._8.ListLdapDirectoryReq;
import com.cisco.axl.api._8.ListLdapDirectoryRes;
import com.cisco.axl.api._8.ListLdapFilterReq;
import com.cisco.axl.api._8.ListLdapFilterRes;
import com.cisco.axl.api._8.ListLicenseCapabilitiesReq;
import com.cisco.axl.api._8.ListLicenseCapabilitiesRes;
import com.cisco.axl.api._8.ListLineGroupReq;
import com.cisco.axl.api._8.ListLineGroupRes;
import com.cisco.axl.api._8.ListLineReq;
import com.cisco.axl.api._8.ListLineRes;
import com.cisco.axl.api._8.ListLocationReq;
import com.cisco.axl.api._8.ListLocationRes;
import com.cisco.axl.api._8.ListMediaResourceGroupReq;
import com.cisco.axl.api._8.ListMediaResourceGroupRes;
import com.cisco.axl.api._8.ListMediaResourceListReq;
import com.cisco.axl.api._8.ListMediaResourceListRes;
import com.cisco.axl.api._8.ListMeetMeReq;
import com.cisco.axl.api._8.ListMeetMeRes;
import com.cisco.axl.api._8.ListMessageWaitingReq;
import com.cisco.axl.api._8.ListMessageWaitingRes;
import com.cisco.axl.api._8.ListMlppDomainReq;
import com.cisco.axl.api._8.ListMlppDomainRes;
import com.cisco.axl.api._8.ListMobileSmartClientProfileReq;
import com.cisco.axl.api._8.ListMobileSmartClientProfileRes;
import com.cisco.axl.api._8.ListMohAudioSourceReq;
import com.cisco.axl.api._8.ListMohAudioSourceRes;
import com.cisco.axl.api._8.ListMohServerReq;
import com.cisco.axl.api._8.ListMohServerRes;
import com.cisco.axl.api._8.ListMtpReq;
import com.cisco.axl.api._8.ListMtpRes;
import com.cisco.axl.api._8.ListPhoneButtonTemplateReq;
import com.cisco.axl.api._8.ListPhoneButtonTemplateRes;
import com.cisco.axl.api._8.ListPhoneNtpReq;
import com.cisco.axl.api._8.ListPhoneNtpRes;
import com.cisco.axl.api._8.ListPhoneReq;
import com.cisco.axl.api._8.ListPhoneRes;
import com.cisco.axl.api._8.ListPhoneSecurityProfileReq;
import com.cisco.axl.api._8.ListPhoneSecurityProfileRes;
import com.cisco.axl.api._8.ListPhysicalLocationReq;
import com.cisco.axl.api._8.ListPhysicalLocationRes;
import com.cisco.axl.api._8.ListPresenceGroupReq;
import com.cisco.axl.api._8.ListPresenceGroupRes;
import com.cisco.axl.api._8.ListProcessNodeReq;
import com.cisco.axl.api._8.ListProcessNodeRes;
import com.cisco.axl.api._8.ListProcessNodeServiceReq;
import com.cisco.axl.api._8.ListProcessNodeServiceRes;
import com.cisco.axl.api._8.ListRecordingProfileReq;
import com.cisco.axl.api._8.ListRecordingProfileRes;
import com.cisco.axl.api._8.ListRegionReq;
import com.cisco.axl.api._8.ListRegionRes;
import com.cisco.axl.api._8.ListRemoteClusterReq;
import com.cisco.axl.api._8.ListRemoteClusterRes;
import com.cisco.axl.api._8.ListRemoteDestinationProfileReq;
import com.cisco.axl.api._8.ListRemoteDestinationProfileRes;
import com.cisco.axl.api._8.ListRemoteDestinationReq;
import com.cisco.axl.api._8.ListRemoteDestinationRes;
import com.cisco.axl.api._8.ListResourcePriorityNamespaceListReq;
import com.cisco.axl.api._8.ListResourcePriorityNamespaceListRes;
import com.cisco.axl.api._8.ListResourcePriorityNamespaceReq;
import com.cisco.axl.api._8.ListResourcePriorityNamespaceRes;
import com.cisco.axl.api._8.ListRouteFilterReq;
import com.cisco.axl.api._8.ListRouteFilterRes;
import com.cisco.axl.api._8.ListRouteGroupReq;
import com.cisco.axl.api._8.ListRouteGroupRes;
import com.cisco.axl.api._8.ListRouteListReq;
import com.cisco.axl.api._8.ListRouteListRes;
import com.cisco.axl.api._8.ListRoutePartitionReq;
import com.cisco.axl.api._8.ListRoutePartitionRes;
import com.cisco.axl.api._8.ListRoutePatternReq;
import com.cisco.axl.api._8.ListRoutePatternRes;
import com.cisco.axl.api._8.ListRoutePlanReq;
import com.cisco.axl.api._8.ListRoutePlanRes;
import com.cisco.axl.api._8.ListSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._8.ListSafCcdPurgeBlockLearnedRoutesRes;
import com.cisco.axl.api._8.ListSafForwarderReq;
import com.cisco.axl.api._8.ListSafForwarderRes;
import com.cisco.axl.api._8.ListSafSecurityProfileReq;
import com.cisco.axl.api._8.ListSafSecurityProfileRes;
import com.cisco.axl.api._8.ListSipDialRulesReq;
import com.cisco.axl.api._8.ListSipDialRulesRes;
import com.cisco.axl.api._8.ListSipProfileReq;
import com.cisco.axl.api._8.ListSipProfileRes;
import com.cisco.axl.api._8.ListSipRealmReq;
import com.cisco.axl.api._8.ListSipRealmRes;
import com.cisco.axl.api._8.ListSipRoutePatternReq;
import com.cisco.axl.api._8.ListSipRoutePatternRes;
import com.cisco.axl.api._8.ListSipTrunkReq;
import com.cisco.axl.api._8.ListSipTrunkRes;
import com.cisco.axl.api._8.ListSipTrunkSecurityProfileReq;
import com.cisco.axl.api._8.ListSipTrunkSecurityProfileRes;
import com.cisco.axl.api._8.ListSoftKeyTemplateReq;
import com.cisco.axl.api._8.ListSoftKeyTemplateRes;
import com.cisco.axl.api._8.ListSrstReq;
import com.cisco.axl.api._8.ListSrstRes;
import com.cisco.axl.api._8.ListTimePeriodReq;
import com.cisco.axl.api._8.ListTimePeriodRes;
import com.cisco.axl.api._8.ListTimeScheduleReq;
import com.cisco.axl.api._8.ListTimeScheduleRes;
import com.cisco.axl.api._8.ListTodAccessReq;
import com.cisco.axl.api._8.ListTodAccessRes;
import com.cisco.axl.api._8.ListTransPatternReq;
import com.cisco.axl.api._8.ListTransPatternRes;
import com.cisco.axl.api._8.ListTranscoderReq;
import com.cisco.axl.api._8.ListTranscoderRes;
import com.cisco.axl.api._8.ListTransformationProfileReq;
import com.cisco.axl.api._8.ListTransformationProfileRes;
import com.cisco.axl.api._8.ListTvsCertificateReq;
import com.cisco.axl.api._8.ListTvsCertificateRes;
import com.cisco.axl.api._8.ListUserGroupReq;
import com.cisco.axl.api._8.ListUserGroupRes;
import com.cisco.axl.api._8.ListUserReq;
import com.cisco.axl.api._8.ListUserRes;
import com.cisco.axl.api._8.ListVoiceMailPilotReq;
import com.cisco.axl.api._8.ListVoiceMailPilotRes;
import com.cisco.axl.api._8.ListVoiceMailPortReq;
import com.cisco.axl.api._8.ListVoiceMailPortRes;
import com.cisco.axl.api._8.ListVoiceMailProfileReq;
import com.cisco.axl.api._8.ListVoiceMailProfileRes;
import com.cisco.axl.api._8.ListVpnGatewayReq;
import com.cisco.axl.api._8.ListVpnGatewayRes;
import com.cisco.axl.api._8.ListVpnGroupReq;
import com.cisco.axl.api._8.ListVpnGroupRes;
import com.cisco.axl.api._8.ListVpnProfileReq;
import com.cisco.axl.api._8.ListVpnProfileRes;
import com.cisco.axl.api._8.NameAndGUIDRequest;
import com.cisco.axl.api._8.ObjectFactory;
import com.cisco.axl.api._8.RemoveAppServerInfoReq;
import com.cisco.axl.api._8.RemoveAppUserReq;
import com.cisco.axl.api._8.RemoveApplicationServerReq;
import com.cisco.axl.api._8.RemoveApplicationToSoftkeyTemplateReq;
import com.cisco.axl.api._8.RemoveApplicationUserCapfProfileReq;
import com.cisco.axl.api._8.RemoveCallParkReq;
import com.cisco.axl.api._8.RemoveCallPickupGroupReq;
import com.cisco.axl.api._8.RemoveCalledPartyTransformationPatternReq;
import com.cisco.axl.api._8.RemoveCallingPartyTransformationPatternReq;
import com.cisco.axl.api._8.RemoveCcdHostedDNReq;
import com.cisco.axl.api._8.RemoveCmcInfoReq;
import com.cisco.axl.api._8.RemoveDhcpServerReq;
import com.cisco.axl.api._8.RemoveDhcpSubnetReq;
import com.cisco.axl.api._8.RemoveDirectedCallParkReq;
import com.cisco.axl.api._8.RemoveEndUserCapfProfileReq;
import com.cisco.axl.api._8.RemoveGatewayReq;
import com.cisco.axl.api._8.RemoveGatewaySubunitsReq;
import com.cisco.axl.api._8.RemoveHuntPilotReq;
import com.cisco.axl.api._8.RemoveImeEnrolledPatternReq;
import com.cisco.axl.api._8.RemoveImeExclusionNumberReq;
import com.cisco.axl.api._8.RemoveIpPhoneServicesReq;
import com.cisco.axl.api._8.RemoveIvrUserLocaleReq;
import com.cisco.axl.api._8.RemoveLineReq;
import com.cisco.axl.api._8.RemoveMeetMeReq;
import com.cisco.axl.api._8.RemoveMessageWaitingReq;
import com.cisco.axl.api._8.RemoveMlppDomainReq;
import com.cisco.axl.api._8.RemoveMobileVoiceAccessReq;
import com.cisco.axl.api._8.RemoveMohAudioSourceReq;
import com.cisco.axl.api._8.RemovePhoneNtpReq;
import com.cisco.axl.api._8.RemoveRemoteClusterReq;
import com.cisco.axl.api._8.RemoveRemoteDestinationReq;
import com.cisco.axl.api._8.RemoveResourcePriorityNamespaceReq;
import com.cisco.axl.api._8.RemoveRoutePatternReq;
import com.cisco.axl.api._8.RemoveSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._8.RemoveSipRealmReq;
import com.cisco.axl.api._8.RemoveSipRoutePatternReq;
import com.cisco.axl.api._8.RemoveTransPatternReq;
import com.cisco.axl.api._8.RemoveUnitsToGatewayReq;
import com.cisco.axl.api._8.RemoveUserReq;
import com.cisco.axl.api._8.RemoveVg224Req;
import com.cisco.axl.api._8.RemoveVoiceMailPilotReq;
import com.cisco.axl.api._8.StandardResponse;
import com.cisco.axl.api._8.UpdateAarGroupMatrixReq;
import com.cisco.axl.api._8.UpdateAarGroupReq;
import com.cisco.axl.api._8.UpdateAnnunciatorReq;
import com.cisco.axl.api._8.UpdateAppServerInfoReq;
import com.cisco.axl.api._8.UpdateAppUserReq;
import com.cisco.axl.api._8.UpdateApplicationDialRulesReq;
import com.cisco.axl.api._8.UpdateApplicationServerReq;
import com.cisco.axl.api._8.UpdateApplicationUserCapfProfileReq;
import com.cisco.axl.api._8.UpdateCallManagerGroupReq;
import com.cisco.axl.api._8.UpdateCallManagerReq;
import com.cisco.axl.api._8.UpdateCallParkReq;
import com.cisco.axl.api._8.UpdateCallPickupGroupReq;
import com.cisco.axl.api._8.UpdateCalledPartyTransformationPatternReq;
import com.cisco.axl.api._8.UpdateCallerFilterListReq;
import com.cisco.axl.api._8.UpdateCallingPartyTransformationPatternReq;
import com.cisco.axl.api._8.UpdateCcdAdvertisingServiceReq;
import com.cisco.axl.api._8.UpdateCcdHostedDNGroupReq;
import com.cisco.axl.api._8.UpdateCcdHostedDNReq;
import com.cisco.axl.api._8.UpdateCcdRequestingServiceReq;
import com.cisco.axl.api._8.UpdateCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._8.UpdateCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._8.UpdateCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._8.UpdateCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._8.UpdateCmcInfoReq;
import com.cisco.axl.api._8.UpdateCommonDeviceConfigReq;
import com.cisco.axl.api._8.UpdateCommonPhoneConfigReq;
import com.cisco.axl.api._8.UpdateConferenceBridgeReq;
import com.cisco.axl.api._8.UpdateCredentialPolicyReq;
import com.cisco.axl.api._8.UpdateCssReq;
import com.cisco.axl.api._8.UpdateCtiRoutePointReq;
import com.cisco.axl.api._8.UpdateCumaServerSecurityProfileReq;
import com.cisco.axl.api._8.UpdateDateTimeGroupReq;
import com.cisco.axl.api._8.UpdateDefaultDeviceProfileReq;
import com.cisco.axl.api._8.UpdateDeviceMobilityGroupReq;
import com.cisco.axl.api._8.UpdateDeviceMobilityReq;
import com.cisco.axl.api._8.UpdateDevicePoolReq;
import com.cisco.axl.api._8.UpdateDeviceProfileReq;
import com.cisco.axl.api._8.UpdateDhcpServerReq;
import com.cisco.axl.api._8.UpdateDhcpSubnetReq;
import com.cisco.axl.api._8.UpdateDirectedCallParkReq;
import com.cisco.axl.api._8.UpdateDirectoryLookupDialRulesReq;
import com.cisco.axl.api._8.UpdateEmccFeatureConfigReq;
import com.cisco.axl.api._8.UpdateEndUserCapfProfileReq;
import com.cisco.axl.api._8.UpdateEnterprisePhoneConfigReq;
import com.cisco.axl.api._8.UpdateExternalCallControlProfileReq;
import com.cisco.axl.api._8.UpdateFacInfoReq;
import com.cisco.axl.api._8.UpdateFallbackFeatureConfigReq;
import com.cisco.axl.api._8.UpdateFallbackProfileReq;
import com.cisco.axl.api._8.UpdateFeatureControlPolicyReq;
import com.cisco.axl.api._8.UpdateFixedMohAudioSourceReq;
import com.cisco.axl.api._8.UpdateGatekeeperReq;
import com.cisco.axl.api._8.UpdateGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._8.UpdateGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._8.UpdateGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._8.UpdateGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._8.UpdateGatewayReq;
import com.cisco.axl.api._8.UpdateGeoLocationFilterReq;
import com.cisco.axl.api._8.UpdateGeoLocationPolicyReq;
import com.cisco.axl.api._8.UpdateGeoLocationReq;
import com.cisco.axl.api._8.UpdateH323GatewayReq;
import com.cisco.axl.api._8.UpdateH323PhoneReq;
import com.cisco.axl.api._8.UpdateH323TrunkReq;
import com.cisco.axl.api._8.UpdateHuntListReq;
import com.cisco.axl.api._8.UpdateHuntPilotReq;
import com.cisco.axl.api._8.UpdateImeClientReq;
import com.cisco.axl.api._8.UpdateImeE164TransformationReq;
import com.cisco.axl.api._8.UpdateImeEnrolledPatternGroupReq;
import com.cisco.axl.api._8.UpdateImeEnrolledPatternReq;
import com.cisco.axl.api._8.UpdateImeExclusionNumberGroupReq;
import com.cisco.axl.api._8.UpdateImeExclusionNumberReq;
import com.cisco.axl.api._8.UpdateImeFeatureConfigReq;
import com.cisco.axl.api._8.UpdateImeFirewallReq;
import com.cisco.axl.api._8.UpdateImeRouteFilterElementReq;
import com.cisco.axl.api._8.UpdateImeRouteFilterGroupReq;
import com.cisco.axl.api._8.UpdateImeServerReq;
import com.cisco.axl.api._8.UpdateInterClusterServiceProfileReq;
import com.cisco.axl.api._8.UpdateIpPhoneServicesReq;
import com.cisco.axl.api._8.UpdateIvrUserLocaleReq;
import com.cisco.axl.api._8.UpdateLdapAuthenticationReq;
import com.cisco.axl.api._8.UpdateLdapDirectoryReq;
import com.cisco.axl.api._8.UpdateLdapFilterReq;
import com.cisco.axl.api._8.UpdateLdapSystemReq;
import com.cisco.axl.api._8.UpdateLicenseCapabilitiesReq;
import com.cisco.axl.api._8.UpdateLineGroupReq;
import com.cisco.axl.api._8.UpdateLineReq;
import com.cisco.axl.api._8.UpdateLocationReq;
import com.cisco.axl.api._8.UpdateMediaResourceGroupReq;
import com.cisco.axl.api._8.UpdateMediaResourceListReq;
import com.cisco.axl.api._8.UpdateMeetMeReq;
import com.cisco.axl.api._8.UpdateMessageWaitingReq;
import com.cisco.axl.api._8.UpdateMlppDomainReq;
import com.cisco.axl.api._8.UpdateMobileVoiceAccessReq;
import com.cisco.axl.api._8.UpdateMobilityReq;
import com.cisco.axl.api._8.UpdateMohAudioSourceReq;
import com.cisco.axl.api._8.UpdateMohServerReq;
import com.cisco.axl.api._8.UpdateMtpReq;
import com.cisco.axl.api._8.UpdatePhoneButtonTemplateReq;
import com.cisco.axl.api._8.UpdatePhoneNtpReq;
import com.cisco.axl.api._8.UpdatePhoneReq;
import com.cisco.axl.api._8.UpdatePhoneSecurityProfileReq;
import com.cisco.axl.api._8.UpdatePhysicalLocationReq;
import com.cisco.axl.api._8.UpdatePresenceGroupReq;
import com.cisco.axl.api._8.UpdateProcessNodeReq;
import com.cisco.axl.api._8.UpdateProcessNodeServiceReq;
import com.cisco.axl.api._8.UpdateRecordingProfileReq;
import com.cisco.axl.api._8.UpdateRegionMatrixReq;
import com.cisco.axl.api._8.UpdateRegionReq;
import com.cisco.axl.api._8.UpdateRemoteClusterReq;
import com.cisco.axl.api._8.UpdateRemoteDestinationProfileReq;
import com.cisco.axl.api._8.UpdateRemoteDestinationReq;
import com.cisco.axl.api._8.UpdateResourcePriorityNamespaceListReq;
import com.cisco.axl.api._8.UpdateResourcePriorityNamespaceReq;
import com.cisco.axl.api._8.UpdateRouteFilterReq;
import com.cisco.axl.api._8.UpdateRouteGroupReq;
import com.cisco.axl.api._8.UpdateRouteListReq;
import com.cisco.axl.api._8.UpdateRoutePartitionReq;
import com.cisco.axl.api._8.UpdateRoutePatternReq;
import com.cisco.axl.api._8.UpdateSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._8.UpdateSafForwarderReq;
import com.cisco.axl.api._8.UpdateSafSecurityProfileReq;
import com.cisco.axl.api._8.UpdateServiceParameterReq;
import com.cisco.axl.api._8.UpdateSipDialRulesReq;
import com.cisco.axl.api._8.UpdateSipProfileReq;
import com.cisco.axl.api._8.UpdateSipRealmReq;
import com.cisco.axl.api._8.UpdateSipRoutePatternReq;
import com.cisco.axl.api._8.UpdateSipTrunkReq;
import com.cisco.axl.api._8.UpdateSipTrunkSecurityProfileReq;
import com.cisco.axl.api._8.UpdateSoftKeyTemplateReq;
import com.cisco.axl.api._8.UpdateSrstReq;
import com.cisco.axl.api._8.UpdateTimePeriodReq;
import com.cisco.axl.api._8.UpdateTimeScheduleReq;
import com.cisco.axl.api._8.UpdateTodAccessReq;
import com.cisco.axl.api._8.UpdateTransPatternReq;
import com.cisco.axl.api._8.UpdateTranscoderReq;
import com.cisco.axl.api._8.UpdateTransformationProfileReq;
import com.cisco.axl.api._8.UpdateTvsCertificateReq;
import com.cisco.axl.api._8.UpdateUserGroupReq;
import com.cisco.axl.api._8.UpdateUserReq;
import com.cisco.axl.api._8.UpdateVg224Req;
import com.cisco.axl.api._8.UpdateVoiceMailPilotReq;
import com.cisco.axl.api._8.UpdateVoiceMailPortReq;
import com.cisco.axl.api._8.UpdateVoiceMailProfileReq;
import com.cisco.axl.api._8.UpdateVpnGatewayReq;
import com.cisco.axl.api._8.UpdateVpnGroupReq;
import com.cisco.axl.api._8.UpdateVpnProfileReq;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AXLPort", targetNamespace = "http://www.cisco.com/AXLAPIService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AXLPort {


    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSipProfile")
    @WebResult(name = "addSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSipProfile(
        @WebParam(name = "addSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSipProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSipProfile")
    @WebResult(name = "updateSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSipProfile(
        @WebParam(name = "updateSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSipProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSipProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSipProfile")
    @WebResult(name = "getSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSipProfileRes getSipProfile(
        @WebParam(name = "getSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSipProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSipProfile")
    @WebResult(name = "removeSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSipProfile(
        @WebParam(name = "removeSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSipProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSipProfile")
    @WebResult(name = "listSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSipProfileRes listSipProfile(
        @WebParam(name = "listSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSipProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSipTrunkSecurityProfile")
    @WebResult(name = "addSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSipTrunkSecurityProfile(
        @WebParam(name = "addSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSipTrunkSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSipTrunkSecurityProfile")
    @WebResult(name = "updateSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSipTrunkSecurityProfile(
        @WebParam(name = "updateSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSipTrunkSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSipTrunkSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSipTrunkSecurityProfile")
    @WebResult(name = "getSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSipTrunkSecurityProfileRes getSipTrunkSecurityProfile(
        @WebParam(name = "getSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSipTrunkSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSipTrunkSecurityProfile")
    @WebResult(name = "removeSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSipTrunkSecurityProfile(
        @WebParam(name = "removeSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSipTrunkSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSipTrunkSecurityProfile")
    @WebResult(name = "listSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSipTrunkSecurityProfileRes listSipTrunkSecurityProfile(
        @WebParam(name = "listSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSipTrunkSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addTimePeriod")
    @WebResult(name = "addTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addTimePeriod(
        @WebParam(name = "addTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddTimePeriodReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateTimePeriod")
    @WebResult(name = "updateTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateTimePeriod(
        @WebParam(name = "updateTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateTimePeriodReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetTimePeriodRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getTimePeriod")
    @WebResult(name = "getTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetTimePeriodRes getTimePeriod(
        @WebParam(name = "getTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetTimePeriodReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeTimePeriod")
    @WebResult(name = "removeTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeTimePeriod(
        @WebParam(name = "removeTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListTimePeriodRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listTimePeriod")
    @WebResult(name = "listTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListTimePeriodRes listTimePeriod(
        @WebParam(name = "listTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListTimePeriodReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addTimeSchedule")
    @WebResult(name = "addTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addTimeSchedule(
        @WebParam(name = "addTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddTimeScheduleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateTimeSchedule")
    @WebResult(name = "updateTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateTimeSchedule(
        @WebParam(name = "updateTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateTimeScheduleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetTimeScheduleRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getTimeSchedule")
    @WebResult(name = "getTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetTimeScheduleRes getTimeSchedule(
        @WebParam(name = "getTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetTimeScheduleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeTimeSchedule")
    @WebResult(name = "removeTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeTimeSchedule(
        @WebParam(name = "removeTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListTimeScheduleRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listTimeSchedule")
    @WebResult(name = "listTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListTimeScheduleRes listTimeSchedule(
        @WebParam(name = "listTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListTimeScheduleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addTodAccess")
    @WebResult(name = "addTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addTodAccess(
        @WebParam(name = "addTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddTodAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateTodAccess")
    @WebResult(name = "updateTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateTodAccess(
        @WebParam(name = "updateTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateTodAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetTodAccessRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getTodAccess")
    @WebResult(name = "getTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetTodAccessRes getTodAccess(
        @WebParam(name = "getTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetTodAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeTodAccess")
    @WebResult(name = "removeTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeTodAccess(
        @WebParam(name = "removeTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListTodAccessRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listTodAccess")
    @WebResult(name = "listTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListTodAccessRes listTodAccess(
        @WebParam(name = "listTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListTodAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addVoiceMailPilot")
    @WebResult(name = "addVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addVoiceMailPilot(
        @WebParam(name = "addVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddVoiceMailPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateVoiceMailPilot")
    @WebResult(name = "updateVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateVoiceMailPilot(
        @WebParam(name = "updateVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateVoiceMailPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetVoiceMailPilotRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getVoiceMailPilot")
    @WebResult(name = "getVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetVoiceMailPilotRes getVoiceMailPilot(
        @WebParam(name = "getVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetVoiceMailPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeVoiceMailPilot")
    @WebResult(name = "removeVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeVoiceMailPilot(
        @WebParam(name = "removeVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveVoiceMailPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListVoiceMailPilotRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listVoiceMailPilot")
    @WebResult(name = "listVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListVoiceMailPilotRes listVoiceMailPilot(
        @WebParam(name = "listVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListVoiceMailPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addProcessNode")
    @WebResult(name = "addProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addProcessNode(
        @WebParam(name = "addProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddProcessNodeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateProcessNode")
    @WebResult(name = "updateProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateProcessNode(
        @WebParam(name = "updateProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateProcessNodeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetProcessNodeRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getProcessNode")
    @WebResult(name = "getProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetProcessNodeRes getProcessNode(
        @WebParam(name = "getProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetProcessNodeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeProcessNode")
    @WebResult(name = "removeProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeProcessNode(
        @WebParam(name = "removeProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListProcessNodeRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listProcessNode")
    @WebResult(name = "listProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListProcessNodeRes listProcessNode(
        @WebParam(name = "listProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListProcessNodeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCallerFilterList")
    @WebResult(name = "addCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCallerFilterList(
        @WebParam(name = "addCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCallerFilterListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCallerFilterList")
    @WebResult(name = "updateCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCallerFilterList(
        @WebParam(name = "updateCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCallerFilterListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCallerFilterListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCallerFilterList")
    @WebResult(name = "getCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCallerFilterListRes getCallerFilterList(
        @WebParam(name = "getCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCallerFilterListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCallerFilterList")
    @WebResult(name = "removeCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCallerFilterList(
        @WebParam(name = "removeCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCallerFilterListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCallerFilterList")
    @WebResult(name = "listCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCallerFilterListRes listCallerFilterList(
        @WebParam(name = "listCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCallerFilterListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRoutePartition")
    @WebResult(name = "addRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRoutePartition(
        @WebParam(name = "addRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRoutePartitionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRoutePartition")
    @WebResult(name = "updateRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRoutePartition(
        @WebParam(name = "updateRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRoutePartitionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRoutePartitionRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRoutePartition")
    @WebResult(name = "getRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRoutePartitionRes getRoutePartition(
        @WebParam(name = "getRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRoutePartitionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRoutePartition")
    @WebResult(name = "removeRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRoutePartition(
        @WebParam(name = "removeRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRoutePartitionRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRoutePartition")
    @WebResult(name = "listRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRoutePartitionRes listRoutePartition(
        @WebParam(name = "listRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRoutePartitionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCss")
    @WebResult(name = "addCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCss(
        @WebParam(name = "addCss", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCssReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCss")
    @WebResult(name = "updateCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCss(
        @WebParam(name = "updateCss", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCssReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCssRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCss")
    @WebResult(name = "getCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCssRes getCss(
        @WebParam(name = "getCss", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCssReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCss")
    @WebResult(name = "removeCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCss(
        @WebParam(name = "removeCss", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCssRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCss")
    @WebResult(name = "listCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCssRes listCss(
        @WebParam(name = "listCss", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCssReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCallManager")
    @WebResult(name = "updateCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCallManager(
        @WebParam(name = "updateCallManager", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCallManagerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCallManagerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCallManager")
    @WebResult(name = "getCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCallManagerRes getCallManager(
        @WebParam(name = "getCallManager", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCallManagerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCallManagerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCallManager")
    @WebResult(name = "listCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCallManagerRes listCallManager(
        @WebParam(name = "listCallManager", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCallManagerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMediaResourceGroup")
    @WebResult(name = "addMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMediaResourceGroup(
        @WebParam(name = "addMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMediaResourceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMediaResourceGroup")
    @WebResult(name = "updateMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMediaResourceGroup(
        @WebParam(name = "updateMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMediaResourceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMediaResourceGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMediaResourceGroup")
    @WebResult(name = "getMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMediaResourceGroupRes getMediaResourceGroup(
        @WebParam(name = "getMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMediaResourceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMediaResourceGroup")
    @WebResult(name = "removeMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMediaResourceGroup(
        @WebParam(name = "removeMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMediaResourceGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMediaResourceGroup")
    @WebResult(name = "listMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMediaResourceGroupRes listMediaResourceGroup(
        @WebParam(name = "listMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMediaResourceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMediaResourceList")
    @WebResult(name = "addMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMediaResourceList(
        @WebParam(name = "addMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMediaResourceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMediaResourceList")
    @WebResult(name = "updateMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMediaResourceList(
        @WebParam(name = "updateMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMediaResourceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMediaResourceListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMediaResourceList")
    @WebResult(name = "getMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMediaResourceListRes getMediaResourceList(
        @WebParam(name = "getMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMediaResourceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMediaResourceList")
    @WebResult(name = "removeMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMediaResourceList(
        @WebParam(name = "removeMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMediaResourceListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMediaResourceList")
    @WebResult(name = "listMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMediaResourceListRes listMediaResourceList(
        @WebParam(name = "listMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMediaResourceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRegion")
    @WebResult(name = "addRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRegion(
        @WebParam(name = "addRegion", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRegionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRegion")
    @WebResult(name = "updateRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRegion(
        @WebParam(name = "updateRegion", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRegionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRegionRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRegion")
    @WebResult(name = "getRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRegionRes getRegion(
        @WebParam(name = "getRegion", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRegionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRegion")
    @WebResult(name = "removeRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRegion(
        @WebParam(name = "removeRegion", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRegionRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRegion")
    @WebResult(name = "listRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRegionRes listRegion(
        @WebParam(name = "listRegion", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRegionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addAarGroup")
    @WebResult(name = "addAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addAarGroup(
        @WebParam(name = "addAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddAarGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateAarGroup")
    @WebResult(name = "updateAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateAarGroup(
        @WebParam(name = "updateAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateAarGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetAarGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getAarGroup")
    @WebResult(name = "getAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetAarGroupRes getAarGroup(
        @WebParam(name = "getAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetAarGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeAarGroup")
    @WebResult(name = "removeAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeAarGroup(
        @WebParam(name = "removeAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListAarGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listAarGroup")
    @WebResult(name = "listAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListAarGroupRes listAarGroup(
        @WebParam(name = "listAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListAarGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addPhysicalLocation")
    @WebResult(name = "addPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addPhysicalLocation(
        @WebParam(name = "addPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddPhysicalLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updatePhysicalLocation")
    @WebResult(name = "updatePhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updatePhysicalLocation(
        @WebParam(name = "updatePhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdatePhysicalLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetPhysicalLocationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getPhysicalLocation")
    @WebResult(name = "getPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetPhysicalLocationRes getPhysicalLocation(
        @WebParam(name = "getPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetPhysicalLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removePhysicalLocation")
    @WebResult(name = "removePhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removePhysicalLocation(
        @WebParam(name = "removePhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListPhysicalLocationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listPhysicalLocation")
    @WebResult(name = "listPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListPhysicalLocationRes listPhysicalLocation(
        @WebParam(name = "listPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListPhysicalLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRouteGroup")
    @WebResult(name = "addRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRouteGroup(
        @WebParam(name = "addRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRouteGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRouteGroup")
    @WebResult(name = "updateRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRouteGroup(
        @WebParam(name = "updateRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRouteGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRouteGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRouteGroup")
    @WebResult(name = "getRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRouteGroupRes getRouteGroup(
        @WebParam(name = "getRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRouteGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRouteGroup")
    @WebResult(name = "removeRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRouteGroup(
        @WebParam(name = "removeRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRouteGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRouteGroup")
    @WebResult(name = "listRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRouteGroupRes listRouteGroup(
        @WebParam(name = "listRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRouteGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDevicePool")
    @WebResult(name = "addDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDevicePool(
        @WebParam(name = "addDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDevicePoolReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDevicePool")
    @WebResult(name = "updateDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDevicePool(
        @WebParam(name = "updateDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDevicePoolReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDevicePoolRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDevicePool")
    @WebResult(name = "getDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDevicePoolRes getDevicePool(
        @WebParam(name = "getDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDevicePoolReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDevicePool")
    @WebResult(name = "removeDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDevicePool(
        @WebParam(name = "removeDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDevicePoolRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDevicePool")
    @WebResult(name = "listDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDevicePoolRes listDevicePool(
        @WebParam(name = "listDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDevicePoolReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDeviceMobilityGroup")
    @WebResult(name = "addDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDeviceMobilityGroup(
        @WebParam(name = "addDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDeviceMobilityGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDeviceMobilityGroup")
    @WebResult(name = "updateDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDeviceMobilityGroup(
        @WebParam(name = "updateDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDeviceMobilityGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDeviceMobilityGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDeviceMobilityGroup")
    @WebResult(name = "getDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDeviceMobilityGroupRes getDeviceMobilityGroup(
        @WebParam(name = "getDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDeviceMobilityGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDeviceMobilityGroup")
    @WebResult(name = "removeDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDeviceMobilityGroup(
        @WebParam(name = "removeDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDeviceMobilityGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDeviceMobilityGroup")
    @WebResult(name = "listDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDeviceMobilityGroupRes listDeviceMobilityGroup(
        @WebParam(name = "listDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDeviceMobilityGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addLocation")
    @WebResult(name = "addLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addLocation(
        @WebParam(name = "addLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLocation")
    @WebResult(name = "updateLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLocation(
        @WebParam(name = "updateLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLocationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLocation")
    @WebResult(name = "getLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLocationRes getLocation(
        @WebParam(name = "getLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeLocation")
    @WebResult(name = "removeLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeLocation(
        @WebParam(name = "removeLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListLocationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listLocation")
    @WebResult(name = "listLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListLocationRes listLocation(
        @WebParam(name = "listLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSoftKeyTemplate")
    @WebResult(name = "addSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSoftKeyTemplate(
        @WebParam(name = "addSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSoftKeyTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSoftKeyTemplate")
    @WebResult(name = "updateSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSoftKeyTemplate(
        @WebParam(name = "updateSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSoftKeyTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSoftKeyTemplateRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSoftKeyTemplate")
    @WebResult(name = "getSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSoftKeyTemplateRes getSoftKeyTemplate(
        @WebParam(name = "getSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSoftKeyTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSoftKeyTemplate")
    @WebResult(name = "removeSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSoftKeyTemplate(
        @WebParam(name = "removeSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSoftKeyTemplateRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSoftKeyTemplate")
    @WebResult(name = "listSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSoftKeyTemplateRes listSoftKeyTemplate(
        @WebParam(name = "listSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSoftKeyTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addTranscoder")
    @WebResult(name = "addTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addTranscoder(
        @WebParam(name = "addTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddTranscoderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateTranscoder")
    @WebResult(name = "updateTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateTranscoder(
        @WebParam(name = "updateTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateTranscoderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetTranscoderRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getTranscoder")
    @WebResult(name = "getTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetTranscoderRes getTranscoder(
        @WebParam(name = "getTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetTranscoderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeTranscoder")
    @WebResult(name = "removeTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeTranscoder(
        @WebParam(name = "removeTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListTranscoderRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listTranscoder")
    @WebResult(name = "listTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListTranscoderRes listTranscoder(
        @WebParam(name = "listTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListTranscoderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCommonDeviceConfig")
    @WebResult(name = "addCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCommonDeviceConfig(
        @WebParam(name = "addCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCommonDeviceConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCommonDeviceConfig")
    @WebResult(name = "updateCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCommonDeviceConfig(
        @WebParam(name = "updateCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCommonDeviceConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCommonDeviceConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCommonDeviceConfig")
    @WebResult(name = "getCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCommonDeviceConfigRes getCommonDeviceConfig(
        @WebParam(name = "getCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCommonDeviceConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCommonDeviceConfig")
    @WebResult(name = "removeCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCommonDeviceConfig(
        @WebParam(name = "removeCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCommonDeviceConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCommonDeviceConfig")
    @WebResult(name = "listCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCommonDeviceConfigRes listCommonDeviceConfig(
        @WebParam(name = "listCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCommonDeviceConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addResourcePriorityNamespace")
    @WebResult(name = "addResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addResourcePriorityNamespace(
        @WebParam(name = "addResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddResourcePriorityNamespaceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateResourcePriorityNamespace")
    @WebResult(name = "updateResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateResourcePriorityNamespace(
        @WebParam(name = "updateResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateResourcePriorityNamespaceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetResourcePriorityNamespaceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getResourcePriorityNamespace")
    @WebResult(name = "getResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetResourcePriorityNamespaceRes getResourcePriorityNamespace(
        @WebParam(name = "getResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetResourcePriorityNamespaceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeResourcePriorityNamespace")
    @WebResult(name = "removeResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeResourcePriorityNamespace(
        @WebParam(name = "removeResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveResourcePriorityNamespaceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListResourcePriorityNamespaceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listResourcePriorityNamespace")
    @WebResult(name = "listResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListResourcePriorityNamespaceRes listResourcePriorityNamespace(
        @WebParam(name = "listResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListResourcePriorityNamespaceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addResourcePriorityNamespaceList")
    @WebResult(name = "addResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addResourcePriorityNamespaceList(
        @WebParam(name = "addResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddResourcePriorityNamespaceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateResourcePriorityNamespaceList")
    @WebResult(name = "updateResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateResourcePriorityNamespaceList(
        @WebParam(name = "updateResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateResourcePriorityNamespaceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetResourcePriorityNamespaceListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getResourcePriorityNamespaceList")
    @WebResult(name = "getResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetResourcePriorityNamespaceListRes getResourcePriorityNamespaceList(
        @WebParam(name = "getResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetResourcePriorityNamespaceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeResourcePriorityNamespaceList")
    @WebResult(name = "removeResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeResourcePriorityNamespaceList(
        @WebParam(name = "removeResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListResourcePriorityNamespaceListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listResourcePriorityNamespaceList")
    @WebResult(name = "listResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListResourcePriorityNamespaceListRes listResourcePriorityNamespaceList(
        @WebParam(name = "listResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListResourcePriorityNamespaceListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDeviceMobility")
    @WebResult(name = "addDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDeviceMobility(
        @WebParam(name = "addDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDeviceMobilityReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDeviceMobility")
    @WebResult(name = "updateDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDeviceMobility(
        @WebParam(name = "updateDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDeviceMobilityReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDeviceMobilityRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDeviceMobility")
    @WebResult(name = "getDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDeviceMobilityRes getDeviceMobility(
        @WebParam(name = "getDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDeviceMobilityReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDeviceMobility")
    @WebResult(name = "removeDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDeviceMobility(
        @WebParam(name = "removeDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDeviceMobilityRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDeviceMobility")
    @WebResult(name = "listDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDeviceMobilityRes listDeviceMobility(
        @WebParam(name = "listDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDeviceMobilityReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCmcInfo")
    @WebResult(name = "addCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCmcInfo(
        @WebParam(name = "addCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCmcInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCmcInfo")
    @WebResult(name = "updateCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCmcInfo(
        @WebParam(name = "updateCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCmcInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCmcInfoRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCmcInfo")
    @WebResult(name = "getCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCmcInfoRes getCmcInfo(
        @WebParam(name = "getCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCmcInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCmcInfo")
    @WebResult(name = "removeCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCmcInfo(
        @WebParam(name = "removeCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveCmcInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCmcInfoRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCmcInfo")
    @WebResult(name = "listCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCmcInfoRes listCmcInfo(
        @WebParam(name = "listCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCmcInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCredentialPolicy")
    @WebResult(name = "addCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCredentialPolicy(
        @WebParam(name = "addCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCredentialPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCredentialPolicy")
    @WebResult(name = "updateCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCredentialPolicy(
        @WebParam(name = "updateCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCredentialPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCredentialPolicyRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCredentialPolicy")
    @WebResult(name = "getCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCredentialPolicyRes getCredentialPolicy(
        @WebParam(name = "getCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCredentialPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCredentialPolicy")
    @WebResult(name = "removeCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCredentialPolicy(
        @WebParam(name = "removeCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCredentialPolicyRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCredentialPolicy")
    @WebResult(name = "listCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCredentialPolicyRes listCredentialPolicy(
        @WebParam(name = "listCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCredentialPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addFacInfo")
    @WebResult(name = "addFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addFacInfo(
        @WebParam(name = "addFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddFacInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateFacInfo")
    @WebResult(name = "updateFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateFacInfo(
        @WebParam(name = "updateFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateFacInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetFacInfoRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getFacInfo")
    @WebResult(name = "getFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetFacInfoRes getFacInfo(
        @WebParam(name = "getFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetFacInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeFacInfo")
    @WebResult(name = "removeFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeFacInfo(
        @WebParam(name = "removeFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListFacInfoRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listFacInfo")
    @WebResult(name = "listFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListFacInfoRes listFacInfo(
        @WebParam(name = "listFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListFacInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addHuntList")
    @WebResult(name = "addHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addHuntList(
        @WebParam(name = "addHuntList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddHuntListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateHuntList")
    @WebResult(name = "updateHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateHuntList(
        @WebParam(name = "updateHuntList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateHuntListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetHuntListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getHuntList")
    @WebResult(name = "getHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetHuntListRes getHuntList(
        @WebParam(name = "getHuntList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetHuntListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeHuntList")
    @WebResult(name = "removeHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeHuntList(
        @WebParam(name = "removeHuntList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListHuntListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listHuntList")
    @WebResult(name = "listHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListHuntListRes listHuntList(
        @WebParam(name = "listHuntList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListHuntListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addIvrUserLocale")
    @WebResult(name = "addIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addIvrUserLocale(
        @WebParam(name = "addIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddIvrUserLocaleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateIvrUserLocale")
    @WebResult(name = "updateIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateIvrUserLocale(
        @WebParam(name = "updateIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateIvrUserLocaleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetIvrUserLocaleRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getIvrUserLocale")
    @WebResult(name = "getIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetIvrUserLocaleRes getIvrUserLocale(
        @WebParam(name = "getIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetIvrUserLocaleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeIvrUserLocale")
    @WebResult(name = "removeIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeIvrUserLocale(
        @WebParam(name = "removeIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveIvrUserLocaleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListIvrUserLocaleRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listIvrUserLocale")
    @WebResult(name = "listIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListIvrUserLocaleRes listIvrUserLocale(
        @WebParam(name = "listIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListIvrUserLocaleReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addLineGroup")
    @WebResult(name = "addLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addLineGroup(
        @WebParam(name = "addLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddLineGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLineGroup")
    @WebResult(name = "updateLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLineGroup(
        @WebParam(name = "updateLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLineGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLineGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLineGroup")
    @WebResult(name = "getLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLineGroupRes getLineGroup(
        @WebParam(name = "getLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLineGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeLineGroup")
    @WebResult(name = "removeLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeLineGroup(
        @WebParam(name = "removeLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListLineGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listLineGroup")
    @WebResult(name = "listLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListLineGroupRes listLineGroup(
        @WebParam(name = "listLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListLineGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRecordingProfile")
    @WebResult(name = "addRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRecordingProfile(
        @WebParam(name = "addRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRecordingProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRecordingProfile")
    @WebResult(name = "updateRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRecordingProfile(
        @WebParam(name = "updateRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRecordingProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRecordingProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRecordingProfile")
    @WebResult(name = "getRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRecordingProfileRes getRecordingProfile(
        @WebParam(name = "getRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRecordingProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRecordingProfile")
    @WebResult(name = "removeRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRecordingProfile(
        @WebParam(name = "removeRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRecordingProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRecordingProfile")
    @WebResult(name = "listRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRecordingProfileRes listRecordingProfile(
        @WebParam(name = "listRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRecordingProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRouteFilter")
    @WebResult(name = "addRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRouteFilter(
        @WebParam(name = "addRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRouteFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRouteFilter")
    @WebResult(name = "updateRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRouteFilter(
        @WebParam(name = "updateRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRouteFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRouteFilterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRouteFilter")
    @WebResult(name = "getRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRouteFilterRes getRouteFilter(
        @WebParam(name = "getRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRouteFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRouteFilter")
    @WebResult(name = "removeRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRouteFilter(
        @WebParam(name = "removeRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRouteFilterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRouteFilter")
    @WebResult(name = "listRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRouteFilterRes listRouteFilter(
        @WebParam(name = "listRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRouteFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCallManagerGroup")
    @WebResult(name = "addCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCallManagerGroup(
        @WebParam(name = "addCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCallManagerGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCallManagerGroup")
    @WebResult(name = "updateCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCallManagerGroup(
        @WebParam(name = "updateCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCallManagerGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCallManagerGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCallManagerGroup")
    @WebResult(name = "getCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCallManagerGroupRes getCallManagerGroup(
        @WebParam(name = "getCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCallManagerGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCallManagerGroup")
    @WebResult(name = "removeCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCallManagerGroup(
        @WebParam(name = "removeCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCallManagerGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCallManagerGroup")
    @WebResult(name = "listCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCallManagerGroupRes listCallManagerGroup(
        @WebParam(name = "listCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCallManagerGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addUserGroup")
    @WebResult(name = "addUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addUserGroup(
        @WebParam(name = "addUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddUserGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateUserGroup")
    @WebResult(name = "updateUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateUserGroup(
        @WebParam(name = "updateUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateUserGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetUserGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getUserGroup")
    @WebResult(name = "getUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetUserGroupRes getUserGroup(
        @WebParam(name = "getUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetUserGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeUserGroup")
    @WebResult(name = "removeUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeUserGroup(
        @WebParam(name = "removeUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListUserGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listUserGroup")
    @WebResult(name = "listUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListUserGroupRes listUserGroup(
        @WebParam(name = "listUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListUserGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDialPlanRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDialPlan")
    @WebResult(name = "getDialPlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDialPlanRes getDialPlan(
        @WebParam(name = "getDialPlan", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDialPlanReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDialPlanRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDialPlan")
    @WebResult(name = "listDialPlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDialPlanRes listDialPlan(
        @WebParam(name = "listDialPlan", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDialPlanReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDialPlanTagRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDialPlanTag")
    @WebResult(name = "getDialPlanTagResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDialPlanTagRes getDialPlanTag(
        @WebParam(name = "getDialPlanTag", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDialPlanTagReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDialPlanTagRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDialPlanTag")
    @WebResult(name = "listDialPlanTagResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDialPlanTagRes listDialPlanTag(
        @WebParam(name = "listDialPlanTag", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDialPlanTagReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDdiRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDdi")
    @WebResult(name = "getDdiResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDdiRes getDdi(
        @WebParam(name = "getDdi", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDdiReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDdiRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDdi")
    @WebResult(name = "listDdiResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDdiRes listDdi(
        @WebParam(name = "listDdi", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDdiReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMobileSmartClientProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMobileSmartClientProfile")
    @WebResult(name = "getMobileSmartClientProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMobileSmartClientProfileRes getMobileSmartClientProfile(
        @WebParam(name = "getMobileSmartClientProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMobileSmartClientProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMobileSmartClientProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMobileSmartClientProfile")
    @WebResult(name = "listMobileSmartClientProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMobileSmartClientProfileRes listMobileSmartClientProfile(
        @WebParam(name = "listMobileSmartClientProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMobileSmartClientProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateProcessNodeService")
    @WebResult(name = "updateProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateProcessNodeService(
        @WebParam(name = "updateProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateProcessNodeServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetProcessNodeServiceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getProcessNodeService")
    @WebResult(name = "getProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetProcessNodeServiceRes getProcessNodeService(
        @WebParam(name = "getProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetProcessNodeServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListProcessNodeServiceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listProcessNodeService")
    @WebResult(name = "listProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListProcessNodeServiceRes listProcessNodeService(
        @WebParam(name = "listProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListProcessNodeServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMohAudioSource")
    @WebResult(name = "updateMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMohAudioSource(
        @WebParam(name = "updateMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMohAudioSourceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMohAudioSourceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMohAudioSource")
    @WebResult(name = "getMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMohAudioSourceRes getMohAudioSource(
        @WebParam(name = "getMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMohAudioSourceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMohAudioSource")
    @WebResult(name = "removeMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMohAudioSource(
        @WebParam(name = "removeMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveMohAudioSourceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMohAudioSourceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMohAudioSource")
    @WebResult(name = "listMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMohAudioSourceRes listMohAudioSource(
        @WebParam(name = "listMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMohAudioSourceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDhcpServer")
    @WebResult(name = "addDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDhcpServer(
        @WebParam(name = "addDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDhcpServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDhcpServer")
    @WebResult(name = "updateDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDhcpServer(
        @WebParam(name = "updateDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDhcpServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDhcpServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDhcpServer")
    @WebResult(name = "getDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDhcpServerRes getDhcpServer(
        @WebParam(name = "getDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDhcpServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDhcpServer")
    @WebResult(name = "removeDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDhcpServer(
        @WebParam(name = "removeDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveDhcpServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDhcpServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDhcpServer")
    @WebResult(name = "listDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDhcpServerRes listDhcpServer(
        @WebParam(name = "listDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDhcpServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDhcpSubnet")
    @WebResult(name = "addDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDhcpSubnet(
        @WebParam(name = "addDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDhcpSubnetReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDhcpSubnet")
    @WebResult(name = "updateDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDhcpSubnet(
        @WebParam(name = "updateDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDhcpSubnetReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDhcpSubnetRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDhcpSubnet")
    @WebResult(name = "getDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDhcpSubnetRes getDhcpSubnet(
        @WebParam(name = "getDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDhcpSubnetReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDhcpSubnet")
    @WebResult(name = "removeDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDhcpSubnet(
        @WebParam(name = "removeDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveDhcpSubnetReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDhcpSubnetRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDhcpSubnet")
    @WebResult(name = "listDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDhcpSubnetRes listDhcpSubnet(
        @WebParam(name = "listDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDhcpSubnetReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCallPark")
    @WebResult(name = "addCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCallPark(
        @WebParam(name = "addCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCallPark")
    @WebResult(name = "updateCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCallPark(
        @WebParam(name = "updateCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCallParkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCallPark")
    @WebResult(name = "getCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCallParkRes getCallPark(
        @WebParam(name = "getCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCallPark")
    @WebResult(name = "removeCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCallPark(
        @WebParam(name = "removeCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCallParkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCallPark")
    @WebResult(name = "listCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCallParkRes listCallPark(
        @WebParam(name = "listCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDirectedCallPark")
    @WebResult(name = "addDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDirectedCallPark(
        @WebParam(name = "addDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDirectedCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDirectedCallPark")
    @WebResult(name = "updateDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDirectedCallPark(
        @WebParam(name = "updateDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDirectedCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDirectedCallParkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDirectedCallPark")
    @WebResult(name = "getDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDirectedCallParkRes getDirectedCallPark(
        @WebParam(name = "getDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDirectedCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDirectedCallPark")
    @WebResult(name = "removeDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDirectedCallPark(
        @WebParam(name = "removeDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveDirectedCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDirectedCallParkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDirectedCallPark")
    @WebResult(name = "listDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDirectedCallParkRes listDirectedCallPark(
        @WebParam(name = "listDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDirectedCallParkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMeetMe")
    @WebResult(name = "addMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMeetMe(
        @WebParam(name = "addMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMeetMeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMeetMe")
    @WebResult(name = "updateMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMeetMe(
        @WebParam(name = "updateMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMeetMeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMeetMeRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMeetMe")
    @WebResult(name = "getMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMeetMeRes getMeetMe(
        @WebParam(name = "getMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMeetMeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMeetMe")
    @WebResult(name = "removeMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMeetMe(
        @WebParam(name = "removeMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveMeetMeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMeetMeRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMeetMe")
    @WebResult(name = "listMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMeetMeRes listMeetMe(
        @WebParam(name = "listMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMeetMeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMobileVoiceAccess")
    @WebResult(name = "addMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMobileVoiceAccess(
        @WebParam(name = "addMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMobileVoiceAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMobileVoiceAccess")
    @WebResult(name = "updateMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMobileVoiceAccess(
        @WebParam(name = "updateMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMobileVoiceAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMobileVoiceAccessRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMobileVoiceAccess")
    @WebResult(name = "getMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMobileVoiceAccessRes getMobileVoiceAccess(
        @WebParam(name = "getMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMobileVoiceAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMobileVoiceAccess")
    @WebResult(name = "removeMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMobileVoiceAccess(
        @WebParam(name = "removeMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveMobileVoiceAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRouteList")
    @WebResult(name = "addRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRouteList(
        @WebParam(name = "addRouteList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRouteListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRouteList")
    @WebResult(name = "updateRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRouteList(
        @WebParam(name = "updateRouteList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRouteListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRouteListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRouteList")
    @WebResult(name = "getRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRouteListRes getRouteList(
        @WebParam(name = "getRouteList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRouteListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRouteList")
    @WebResult(name = "removeRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRouteList(
        @WebParam(name = "removeRouteList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRouteListRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRouteList")
    @WebResult(name = "listRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRouteListRes listRouteList(
        @WebParam(name = "listRouteList", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRouteListReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addUser")
    @WebResult(name = "addUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addUser(
        @WebParam(name = "addUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateUser")
    @WebResult(name = "updateUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateUser(
        @WebParam(name = "updateUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetUserRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getUser")
    @WebResult(name = "getUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetUserRes getUser(
        @WebParam(name = "getUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeUser")
    @WebResult(name = "removeUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeUser(
        @WebParam(name = "removeUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListUserRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listUser")
    @WebResult(name = "listUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListUserRes listUser(
        @WebParam(name = "listUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLicenseCapabilities")
    @WebResult(name = "updateLicenseCapabilitiesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLicenseCapabilities(
        @WebParam(name = "updateLicenseCapabilities", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLicenseCapabilitiesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLicenseCapabilitiesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLicenseCapabilities")
    @WebResult(name = "getLicenseCapabilitiesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLicenseCapabilitiesRes getLicenseCapabilities(
        @WebParam(name = "getLicenseCapabilities", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLicenseCapabilitiesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListLicenseCapabilitiesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listLicenseCapabilities")
    @WebResult(name = "listLicenseCapabilitiesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListLicenseCapabilitiesRes listLicenseCapabilities(
        @WebParam(name = "listLicenseCapabilities", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListLicenseCapabilitiesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addAppUser")
    @WebResult(name = "addAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addAppUser(
        @WebParam(name = "addAppUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddAppUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateAppUser")
    @WebResult(name = "updateAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateAppUser(
        @WebParam(name = "updateAppUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateAppUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetAppUserRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getAppUser")
    @WebResult(name = "getAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetAppUserRes getAppUser(
        @WebParam(name = "getAppUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetAppUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeAppUser")
    @WebResult(name = "removeAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeAppUser(
        @WebParam(name = "removeAppUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveAppUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListAppUserRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listAppUser")
    @WebResult(name = "listAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListAppUserRes listAppUser(
        @WebParam(name = "listAppUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListAppUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSipRealm")
    @WebResult(name = "addSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSipRealm(
        @WebParam(name = "addSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSipRealmReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSipRealm")
    @WebResult(name = "updateSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSipRealm(
        @WebParam(name = "updateSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSipRealmReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSipRealmRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSipRealm")
    @WebResult(name = "getSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSipRealmRes getSipRealm(
        @WebParam(name = "getSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSipRealmReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSipRealm")
    @WebResult(name = "removeSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSipRealm(
        @WebParam(name = "removeSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveSipRealmReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSipRealmRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSipRealm")
    @WebResult(name = "listSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSipRealmRes listSipRealm(
        @WebParam(name = "listSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSipRealmReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addPhoneNtp")
    @WebResult(name = "addPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addPhoneNtp(
        @WebParam(name = "addPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddPhoneNtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updatePhoneNtp")
    @WebResult(name = "updatePhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updatePhoneNtp(
        @WebParam(name = "updatePhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdatePhoneNtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetPhoneNtpRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getPhoneNtp")
    @WebResult(name = "getPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetPhoneNtpRes getPhoneNtp(
        @WebParam(name = "getPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetPhoneNtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removePhoneNtp")
    @WebResult(name = "removePhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removePhoneNtp(
        @WebParam(name = "removePhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemovePhoneNtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListPhoneNtpRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listPhoneNtp")
    @WebResult(name = "listPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListPhoneNtpRes listPhoneNtp(
        @WebParam(name = "listPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListPhoneNtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDateTimeGroup")
    @WebResult(name = "addDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDateTimeGroup(
        @WebParam(name = "addDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDateTimeGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDateTimeGroup")
    @WebResult(name = "updateDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDateTimeGroup(
        @WebParam(name = "updateDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDateTimeGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDateTimeGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDateTimeGroup")
    @WebResult(name = "getDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDateTimeGroupRes getDateTimeGroup(
        @WebParam(name = "getDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDateTimeGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDateTimeGroup")
    @WebResult(name = "removeDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDateTimeGroup(
        @WebParam(name = "removeDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDateTimeGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDateTimeGroup")
    @WebResult(name = "listDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDateTimeGroupRes listDateTimeGroup(
        @WebParam(name = "listDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDateTimeGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addPresenceGroup")
    @WebResult(name = "addPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addPresenceGroup(
        @WebParam(name = "addPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddPresenceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updatePresenceGroup")
    @WebResult(name = "updatePresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updatePresenceGroup(
        @WebParam(name = "updatePresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdatePresenceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetPresenceGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getPresenceGroup")
    @WebResult(name = "getPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetPresenceGroupRes getPresenceGroup(
        @WebParam(name = "getPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetPresenceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removePresenceGroup")
    @WebResult(name = "removePresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removePresenceGroup(
        @WebParam(name = "removePresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListPresenceGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listPresenceGroup")
    @WebResult(name = "listPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListPresenceGroupRes listPresenceGroup(
        @WebParam(name = "listPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListPresenceGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGeoLocation")
    @WebResult(name = "addGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGeoLocation(
        @WebParam(name = "addGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGeoLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGeoLocation")
    @WebResult(name = "updateGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGeoLocation(
        @WebParam(name = "updateGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGeoLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGeoLocationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGeoLocation")
    @WebResult(name = "getGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGeoLocationRes getGeoLocation(
        @WebParam(name = "getGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGeoLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGeoLocation")
    @WebResult(name = "removeGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGeoLocation(
        @WebParam(name = "removeGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListGeoLocationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listGeoLocation")
    @WebResult(name = "listGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListGeoLocationRes listGeoLocation(
        @WebParam(name = "listGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListGeoLocationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSrst")
    @WebResult(name = "addSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSrst(
        @WebParam(name = "addSrst", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSrstReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSrst")
    @WebResult(name = "updateSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSrst(
        @WebParam(name = "updateSrst", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSrstReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSrstRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSrst")
    @WebResult(name = "getSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSrstRes getSrst(
        @WebParam(name = "getSrst", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSrstReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSrst")
    @WebResult(name = "removeSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSrst(
        @WebParam(name = "removeSrst", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSrstRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSrst")
    @WebResult(name = "listSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSrstRes listSrst(
        @WebParam(name = "listSrst", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSrstReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMlppDomain")
    @WebResult(name = "addMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMlppDomain(
        @WebParam(name = "addMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMlppDomainReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMlppDomain")
    @WebResult(name = "updateMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMlppDomain(
        @WebParam(name = "updateMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMlppDomainReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMlppDomainRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMlppDomain")
    @WebResult(name = "getMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMlppDomainRes getMlppDomain(
        @WebParam(name = "getMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMlppDomainReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMlppDomain")
    @WebResult(name = "removeMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMlppDomain(
        @WebParam(name = "removeMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveMlppDomainReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMlppDomainRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMlppDomain")
    @WebResult(name = "listMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMlppDomainRes listMlppDomain(
        @WebParam(name = "listMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMlppDomainReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCumaServerSecurityProfile")
    @WebResult(name = "addCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCumaServerSecurityProfile(
        @WebParam(name = "addCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCumaServerSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCumaServerSecurityProfile")
    @WebResult(name = "updateCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCumaServerSecurityProfile(
        @WebParam(name = "updateCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCumaServerSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCumaServerSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCumaServerSecurityProfile")
    @WebResult(name = "getCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCumaServerSecurityProfileRes getCumaServerSecurityProfile(
        @WebParam(name = "getCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCumaServerSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCumaServerSecurityProfile")
    @WebResult(name = "removeCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCumaServerSecurityProfile(
        @WebParam(name = "removeCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCumaServerSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCumaServerSecurityProfile")
    @WebResult(name = "listCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCumaServerSecurityProfileRes listCumaServerSecurityProfile(
        @WebParam(name = "listCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCumaServerSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addApplicationServer")
    @WebResult(name = "addApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addApplicationServer(
        @WebParam(name = "addApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddApplicationServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateApplicationServer")
    @WebResult(name = "updateApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateApplicationServer(
        @WebParam(name = "updateApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateApplicationServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetApplicationServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getApplicationServer")
    @WebResult(name = "getApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetApplicationServerRes getApplicationServer(
        @WebParam(name = "getApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetApplicationServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeApplicationServer")
    @WebResult(name = "removeApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeApplicationServer(
        @WebParam(name = "removeApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveApplicationServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListApplicationServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listApplicationServer")
    @WebResult(name = "listApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListApplicationServerRes listApplicationServer(
        @WebParam(name = "listApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListApplicationServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addApplicationUserCapfProfile")
    @WebResult(name = "addApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addApplicationUserCapfProfile(
        @WebParam(name = "addApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddApplicationUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateApplicationUserCapfProfile")
    @WebResult(name = "updateApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateApplicationUserCapfProfile(
        @WebParam(name = "updateApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateApplicationUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetApplicationUserCapfProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getApplicationUserCapfProfile")
    @WebResult(name = "getApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetApplicationUserCapfProfileRes getApplicationUserCapfProfile(
        @WebParam(name = "getApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetApplicationUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeApplicationUserCapfProfile")
    @WebResult(name = "removeApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeApplicationUserCapfProfile(
        @WebParam(name = "removeApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveApplicationUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListApplicationUserCapfProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listApplicationUserCapfProfile")
    @WebResult(name = "listApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListApplicationUserCapfProfileRes listApplicationUserCapfProfile(
        @WebParam(name = "listApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListApplicationUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addEndUserCapfProfile")
    @WebResult(name = "addEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addEndUserCapfProfile(
        @WebParam(name = "addEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddEndUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateEndUserCapfProfile")
    @WebResult(name = "updateEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateEndUserCapfProfile(
        @WebParam(name = "updateEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateEndUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetEndUserCapfProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getEndUserCapfProfile")
    @WebResult(name = "getEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetEndUserCapfProfileRes getEndUserCapfProfile(
        @WebParam(name = "getEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetEndUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeEndUserCapfProfile")
    @WebResult(name = "removeEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeEndUserCapfProfile(
        @WebParam(name = "removeEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveEndUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListEndUserCapfProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listEndUserCapfProfile")
    @WebResult(name = "listEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListEndUserCapfProfileRes listEndUserCapfProfile(
        @WebParam(name = "listEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListEndUserCapfProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateServiceParameter")
    @WebResult(name = "updateServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateServiceParameter(
        @WebParam(name = "updateServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateServiceParameterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetServiceParameterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getServiceParameter")
    @WebResult(name = "getServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetServiceParameterRes getServiceParameter(
        @WebParam(name = "getServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetServiceParameterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addUserPhoneAssociation")
    @WebResult(name = "addUserPhoneAssociationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addUserPhoneAssociation(
        @WebParam(name = "addUserPhoneAssociation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddUserPhoneAssociationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGeoLocationFilter")
    @WebResult(name = "addGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGeoLocationFilter(
        @WebParam(name = "addGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGeoLocationFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGeoLocationFilter")
    @WebResult(name = "updateGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGeoLocationFilter(
        @WebParam(name = "updateGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGeoLocationFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGeoLocationFilterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGeoLocationFilter")
    @WebResult(name = "getGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGeoLocationFilterRes getGeoLocationFilter(
        @WebParam(name = "getGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGeoLocationFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGeoLocationFilter")
    @WebResult(name = "removeGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGeoLocationFilter(
        @WebParam(name = "removeGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListGeoLocationFilterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listGeoLocationFilter")
    @WebResult(name = "listGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListGeoLocationFilterRes listGeoLocationFilter(
        @WebParam(name = "listGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListGeoLocationFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addVoiceMailProfile")
    @WebResult(name = "addVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addVoiceMailProfile(
        @WebParam(name = "addVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddVoiceMailProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateVoiceMailProfile")
    @WebResult(name = "updateVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateVoiceMailProfile(
        @WebParam(name = "updateVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateVoiceMailProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetVoiceMailProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getVoiceMailProfile")
    @WebResult(name = "getVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetVoiceMailProfileRes getVoiceMailProfile(
        @WebParam(name = "getVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetVoiceMailProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeVoiceMailProfile")
    @WebResult(name = "removeVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeVoiceMailProfile(
        @WebParam(name = "removeVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListVoiceMailProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listVoiceMailProfile")
    @WebResult(name = "listVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListVoiceMailProfileRes listVoiceMailProfile(
        @WebParam(name = "listVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListVoiceMailProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addVoiceMailPort")
    @WebResult(name = "addVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addVoiceMailPort(
        @WebParam(name = "addVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddVoiceMailPortReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateVoiceMailPort")
    @WebResult(name = "updateVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateVoiceMailPort(
        @WebParam(name = "updateVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateVoiceMailPortReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetVoiceMailPortRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getVoiceMailPort")
    @WebResult(name = "getVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetVoiceMailPortRes getVoiceMailPort(
        @WebParam(name = "getVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetVoiceMailPortReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeVoiceMailPort")
    @WebResult(name = "removeVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeVoiceMailPort(
        @WebParam(name = "removeVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListVoiceMailPortRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listVoiceMailPort")
    @WebResult(name = "listVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListVoiceMailPortRes listVoiceMailPort(
        @WebParam(name = "listVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListVoiceMailPortReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGatekeeper")
    @WebResult(name = "addGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGatekeeper(
        @WebParam(name = "addGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGatekeeperReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGatekeeper")
    @WebResult(name = "updateGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGatekeeper(
        @WebParam(name = "updateGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGatekeeperReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGatekeeperRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGatekeeper")
    @WebResult(name = "getGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGatekeeperRes getGatekeeper(
        @WebParam(name = "getGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGatekeeperReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGatekeeper")
    @WebResult(name = "removeGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGatekeeper(
        @WebParam(name = "removeGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListGatekeeperRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listGatekeeper")
    @WebResult(name = "listGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListGatekeeperRes listGatekeeper(
        @WebParam(name = "listGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListGatekeeperReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addPhoneButtonTemplate")
    @WebResult(name = "addPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addPhoneButtonTemplate(
        @WebParam(name = "addPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddPhoneButtonTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updatePhoneButtonTemplate")
    @WebResult(name = "updatePhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updatePhoneButtonTemplate(
        @WebParam(name = "updatePhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdatePhoneButtonTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetPhoneButtonTemplateRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getPhoneButtonTemplate")
    @WebResult(name = "getPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetPhoneButtonTemplateRes getPhoneButtonTemplate(
        @WebParam(name = "getPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetPhoneButtonTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removePhoneButtonTemplate")
    @WebResult(name = "removePhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removePhoneButtonTemplate(
        @WebParam(name = "removePhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListPhoneButtonTemplateRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listPhoneButtonTemplate")
    @WebResult(name = "listPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListPhoneButtonTemplateRes listPhoneButtonTemplate(
        @WebParam(name = "listPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListPhoneButtonTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCommonPhoneConfig")
    @WebResult(name = "addCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCommonPhoneConfig(
        @WebParam(name = "addCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCommonPhoneConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCommonPhoneConfig")
    @WebResult(name = "updateCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCommonPhoneConfig(
        @WebParam(name = "updateCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCommonPhoneConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCommonPhoneConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCommonPhoneConfig")
    @WebResult(name = "getCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCommonPhoneConfigRes getCommonPhoneConfig(
        @WebParam(name = "getCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCommonPhoneConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCommonPhoneConfig")
    @WebResult(name = "removeCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCommonPhoneConfig(
        @WebParam(name = "removeCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCommonPhoneConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCommonPhoneConfig")
    @WebResult(name = "listCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCommonPhoneConfigRes listCommonPhoneConfig(
        @WebParam(name = "listCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCommonPhoneConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMessageWaiting")
    @WebResult(name = "addMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMessageWaiting(
        @WebParam(name = "addMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMessageWaitingReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMessageWaiting")
    @WebResult(name = "updateMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMessageWaiting(
        @WebParam(name = "updateMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMessageWaitingReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMessageWaitingRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMessageWaiting")
    @WebResult(name = "getMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMessageWaitingRes getMessageWaiting(
        @WebParam(name = "getMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMessageWaitingReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMessageWaiting")
    @WebResult(name = "removeMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMessageWaiting(
        @WebParam(name = "removeMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveMessageWaitingReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMessageWaitingRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMessageWaiting")
    @WebResult(name = "listMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMessageWaitingRes listMessageWaiting(
        @WebParam(name = "listMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMessageWaitingReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addIpPhoneServices")
    @WebResult(name = "addIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addIpPhoneServices(
        @WebParam(name = "addIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddIpPhoneServicesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateIpPhoneServices")
    @WebResult(name = "updateIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateIpPhoneServices(
        @WebParam(name = "updateIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateIpPhoneServicesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetIpPhoneServicesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getIpPhoneServices")
    @WebResult(name = "getIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetIpPhoneServicesRes getIpPhoneServices(
        @WebParam(name = "getIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetIpPhoneServicesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeIpPhoneServices")
    @WebResult(name = "removeIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeIpPhoneServices(
        @WebParam(name = "removeIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveIpPhoneServicesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListIpPhoneServicesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listIpPhoneServices")
    @WebResult(name = "listIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListIpPhoneServicesRes listIpPhoneServices(
        @WebParam(name = "listIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListIpPhoneServicesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCtiRoutePoint")
    @WebResult(name = "addCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCtiRoutePoint(
        @WebParam(name = "addCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCtiRoutePointReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCtiRoutePoint")
    @WebResult(name = "updateCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCtiRoutePoint(
        @WebParam(name = "updateCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCtiRoutePointReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCtiRoutePointRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCtiRoutePoint")
    @WebResult(name = "getCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCtiRoutePointRes getCtiRoutePoint(
        @WebParam(name = "getCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCtiRoutePointReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCtiRoutePoint")
    @WebResult(name = "removeCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCtiRoutePoint(
        @WebParam(name = "removeCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCtiRoutePointRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCtiRoutePoint")
    @WebResult(name = "listCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCtiRoutePointRes listCtiRoutePoint(
        @WebParam(name = "listCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCtiRoutePointReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addTransPattern")
    @WebResult(name = "addTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addTransPattern(
        @WebParam(name = "addTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddTransPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateTransPattern")
    @WebResult(name = "updateTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateTransPattern(
        @WebParam(name = "updateTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateTransPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetTransPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getTransPattern")
    @WebResult(name = "getTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetTransPatternRes getTransPattern(
        @WebParam(name = "getTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetTransPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeTransPattern")
    @WebResult(name = "removeTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeTransPattern(
        @WebParam(name = "removeTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveTransPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListTransPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listTransPattern")
    @WebResult(name = "listTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListTransPatternRes listTransPattern(
        @WebParam(name = "listTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListTransPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCallingPartyTransformationPattern")
    @WebResult(name = "addCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCallingPartyTransformationPattern(
        @WebParam(name = "addCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCallingPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCallingPartyTransformationPattern")
    @WebResult(name = "updateCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCallingPartyTransformationPattern(
        @WebParam(name = "updateCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCallingPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCallingPartyTransformationPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCallingPartyTransformationPattern")
    @WebResult(name = "getCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCallingPartyTransformationPatternRes getCallingPartyTransformationPattern(
        @WebParam(name = "getCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCallingPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCallingPartyTransformationPattern")
    @WebResult(name = "removeCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCallingPartyTransformationPattern(
        @WebParam(name = "removeCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveCallingPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCallingPartyTransformationPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCallingPartyTransformationPattern")
    @WebResult(name = "listCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCallingPartyTransformationPatternRes listCallingPartyTransformationPattern(
        @WebParam(name = "listCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCallingPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSipRoutePattern")
    @WebResult(name = "addSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSipRoutePattern(
        @WebParam(name = "addSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSipRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSipRoutePattern")
    @WebResult(name = "updateSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSipRoutePattern(
        @WebParam(name = "updateSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSipRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSipRoutePatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSipRoutePattern")
    @WebResult(name = "getSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSipRoutePatternRes getSipRoutePattern(
        @WebParam(name = "getSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSipRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSipRoutePattern")
    @WebResult(name = "removeSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSipRoutePattern(
        @WebParam(name = "removeSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveSipRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSipRoutePatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSipRoutePattern")
    @WebResult(name = "listSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSipRoutePatternRes listSipRoutePattern(
        @WebParam(name = "listSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSipRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addHuntPilot")
    @WebResult(name = "addHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addHuntPilot(
        @WebParam(name = "addHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddHuntPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateHuntPilot")
    @WebResult(name = "updateHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateHuntPilot(
        @WebParam(name = "updateHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateHuntPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetHuntPilotRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getHuntPilot")
    @WebResult(name = "getHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetHuntPilotRes getHuntPilot(
        @WebParam(name = "getHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetHuntPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeHuntPilot")
    @WebResult(name = "removeHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeHuntPilot(
        @WebParam(name = "removeHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveHuntPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListHuntPilotRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listHuntPilot")
    @WebResult(name = "listHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListHuntPilotRes listHuntPilot(
        @WebParam(name = "listHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListHuntPilotReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRoutePattern")
    @WebResult(name = "addRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRoutePattern(
        @WebParam(name = "addRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRoutePattern")
    @WebResult(name = "updateRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRoutePattern(
        @WebParam(name = "updateRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRoutePatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRoutePattern")
    @WebResult(name = "getRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRoutePatternRes getRoutePattern(
        @WebParam(name = "getRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRoutePattern")
    @WebResult(name = "removeRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRoutePattern(
        @WebParam(name = "removeRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRoutePatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRoutePattern")
    @WebResult(name = "listRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRoutePatternRes listRoutePattern(
        @WebParam(name = "listRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRoutePatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addApplicationDialRules")
    @WebResult(name = "addApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addApplicationDialRules(
        @WebParam(name = "addApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddApplicationDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateApplicationDialRules")
    @WebResult(name = "updateApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateApplicationDialRules(
        @WebParam(name = "updateApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateApplicationDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetApplicationDialRulesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getApplicationDialRules")
    @WebResult(name = "getApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetApplicationDialRulesRes getApplicationDialRules(
        @WebParam(name = "getApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetApplicationDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeApplicationDialRules")
    @WebResult(name = "removeApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeApplicationDialRules(
        @WebParam(name = "removeApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListApplicationDialRulesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listApplicationDialRules")
    @WebResult(name = "listApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListApplicationDialRulesRes listApplicationDialRules(
        @WebParam(name = "listApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListApplicationDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDirectoryLookupDialRules")
    @WebResult(name = "addDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDirectoryLookupDialRules(
        @WebParam(name = "addDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDirectoryLookupDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDirectoryLookupDialRules")
    @WebResult(name = "updateDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDirectoryLookupDialRules(
        @WebParam(name = "updateDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDirectoryLookupDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDirectoryLookupDialRulesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDirectoryLookupDialRules")
    @WebResult(name = "getDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDirectoryLookupDialRulesRes getDirectoryLookupDialRules(
        @WebParam(name = "getDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDirectoryLookupDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDirectoryLookupDialRules")
    @WebResult(name = "removeDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDirectoryLookupDialRules(
        @WebParam(name = "removeDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDirectoryLookupDialRulesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDirectoryLookupDialRules")
    @WebResult(name = "listDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDirectoryLookupDialRulesRes listDirectoryLookupDialRules(
        @WebParam(name = "listDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDirectoryLookupDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addPhoneSecurityProfile")
    @WebResult(name = "addPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addPhoneSecurityProfile(
        @WebParam(name = "addPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddPhoneSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updatePhoneSecurityProfile")
    @WebResult(name = "updatePhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updatePhoneSecurityProfile(
        @WebParam(name = "updatePhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdatePhoneSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetPhoneSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getPhoneSecurityProfile")
    @WebResult(name = "getPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetPhoneSecurityProfileRes getPhoneSecurityProfile(
        @WebParam(name = "getPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetPhoneSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removePhoneSecurityProfile")
    @WebResult(name = "removePhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removePhoneSecurityProfile(
        @WebParam(name = "removePhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListPhoneSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listPhoneSecurityProfile")
    @WebResult(name = "listPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListPhoneSecurityProfileRes listPhoneSecurityProfile(
        @WebParam(name = "listPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListPhoneSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSipDialRules")
    @WebResult(name = "addSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSipDialRules(
        @WebParam(name = "addSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSipDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSipDialRules")
    @WebResult(name = "updateSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSipDialRules(
        @WebParam(name = "updateSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSipDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSipDialRulesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSipDialRules")
    @WebResult(name = "getSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSipDialRulesRes getSipDialRules(
        @WebParam(name = "getSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSipDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSipDialRules")
    @WebResult(name = "removeSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSipDialRules(
        @WebParam(name = "removeSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSipDialRulesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSipDialRules")
    @WebResult(name = "listSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSipDialRulesRes listSipDialRules(
        @WebParam(name = "listSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSipDialRulesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addConferenceBridge")
    @WebResult(name = "addConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addConferenceBridge(
        @WebParam(name = "addConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddConferenceBridgeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateConferenceBridge")
    @WebResult(name = "updateConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateConferenceBridge(
        @WebParam(name = "updateConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateConferenceBridgeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetConferenceBridgeRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getConferenceBridge")
    @WebResult(name = "getConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetConferenceBridgeRes getConferenceBridge(
        @WebParam(name = "getConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetConferenceBridgeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeConferenceBridge")
    @WebResult(name = "removeConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeConferenceBridge(
        @WebParam(name = "removeConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListConferenceBridgeRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listConferenceBridge")
    @WebResult(name = "listConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListConferenceBridgeRes listConferenceBridge(
        @WebParam(name = "listConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListConferenceBridgeReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateAnnunciator")
    @WebResult(name = "updateAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateAnnunciator(
        @WebParam(name = "updateAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateAnnunciatorReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetAnnunciatorRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getAnnunciator")
    @WebResult(name = "getAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetAnnunciatorRes getAnnunciator(
        @WebParam(name = "getAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetAnnunciatorReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListAnnunciatorRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listAnnunciator")
    @WebResult(name = "listAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListAnnunciatorRes listAnnunciator(
        @WebParam(name = "listAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListAnnunciatorReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMtp")
    @WebResult(name = "addMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMtp(
        @WebParam(name = "addMtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMtp")
    @WebResult(name = "updateMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMtp(
        @WebParam(name = "updateMtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMtpRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMtp")
    @WebResult(name = "getMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMtpRes getMtp(
        @WebParam(name = "getMtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeMtp")
    @WebResult(name = "removeMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeMtp(
        @WebParam(name = "removeMtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMtpRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMtp")
    @WebResult(name = "listMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMtpRes listMtp(
        @WebParam(name = "listMtp", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMtpReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateFixedMohAudioSource")
    @WebResult(name = "updateFixedMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateFixedMohAudioSource(
        @WebParam(name = "updateFixedMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateFixedMohAudioSourceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetFixedMohAudioSourceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getFixedMohAudioSource")
    @WebResult(name = "getFixedMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetFixedMohAudioSourceRes getFixedMohAudioSource(
        @WebParam(name = "getFixedMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetFixedMohAudioSourceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateAarGroupMatrix")
    @WebResult(name = "updateAarGroupMatrixResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateAarGroupMatrix(
        @WebParam(name = "updateAarGroupMatrix", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateAarGroupMatrixReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRemoteDestinationProfile")
    @WebResult(name = "addRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRemoteDestinationProfile(
        @WebParam(name = "addRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRemoteDestinationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRemoteDestinationProfile")
    @WebResult(name = "updateRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRemoteDestinationProfile(
        @WebParam(name = "updateRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRemoteDestinationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRemoteDestinationProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRemoteDestinationProfile")
    @WebResult(name = "getRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRemoteDestinationProfileRes getRemoteDestinationProfile(
        @WebParam(name = "getRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRemoteDestinationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRemoteDestinationProfile")
    @WebResult(name = "removeRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRemoteDestinationProfile(
        @WebParam(name = "removeRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRemoteDestinationProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRemoteDestinationProfile")
    @WebResult(name = "listRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRemoteDestinationProfileRes listRemoteDestinationProfile(
        @WebParam(name = "listRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRemoteDestinationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addLine")
    @WebResult(name = "addLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addLine(
        @WebParam(name = "addLine", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddLineReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLine")
    @WebResult(name = "updateLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLine(
        @WebParam(name = "updateLine", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLineReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLineRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLine")
    @WebResult(name = "getLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLineRes getLine(
        @WebParam(name = "getLine", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLineReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeLine")
    @WebResult(name = "removeLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeLine(
        @WebParam(name = "removeLine", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveLineReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListLineRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listLine")
    @WebResult(name = "listLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListLineRes listLine(
        @WebParam(name = "listLine", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListLineReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDefaultDeviceProfile")
    @WebResult(name = "addDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDefaultDeviceProfile(
        @WebParam(name = "addDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDefaultDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDefaultDeviceProfile")
    @WebResult(name = "updateDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDefaultDeviceProfile(
        @WebParam(name = "updateDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDefaultDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDefaultDeviceProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDefaultDeviceProfile")
    @WebResult(name = "getDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDefaultDeviceProfileRes getDefaultDeviceProfile(
        @WebParam(name = "getDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDefaultDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDefaultDeviceProfile")
    @WebResult(name = "removeDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDefaultDeviceProfile(
        @WebParam(name = "removeDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDefaultDeviceProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDefaultDeviceProfile")
    @WebResult(name = "listDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDefaultDeviceProfileRes listDefaultDeviceProfile(
        @WebParam(name = "listDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDefaultDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addH323Phone")
    @WebResult(name = "addH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addH323Phone(
        @WebParam(name = "addH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddH323PhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateH323Phone")
    @WebResult(name = "updateH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateH323Phone(
        @WebParam(name = "updateH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateH323PhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetH323PhoneRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getH323Phone")
    @WebResult(name = "getH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetH323PhoneRes getH323Phone(
        @WebParam(name = "getH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetH323PhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeH323Phone")
    @WebResult(name = "removeH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeH323Phone(
        @WebParam(name = "removeH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListH323PhoneRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listH323Phone")
    @WebResult(name = "listH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListH323PhoneRes listH323Phone(
        @WebParam(name = "listH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListH323PhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMohServer")
    @WebResult(name = "updateMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMohServer(
        @WebParam(name = "updateMohServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMohServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMohServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMohServer")
    @WebResult(name = "getMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMohServerRes getMohServer(
        @WebParam(name = "getMohServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMohServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListMohServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listMohServer")
    @WebResult(name = "listMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListMohServerRes listMohServer(
        @WebParam(name = "listMohServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListMohServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addH323Trunk")
    @WebResult(name = "addH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addH323Trunk(
        @WebParam(name = "addH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddH323TrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateH323Trunk")
    @WebResult(name = "updateH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateH323Trunk(
        @WebParam(name = "updateH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateH323TrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetH323TrunkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getH323Trunk")
    @WebResult(name = "getH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetH323TrunkRes getH323Trunk(
        @WebParam(name = "getH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetH323TrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeH323Trunk")
    @WebResult(name = "removeH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeH323Trunk(
        @WebParam(name = "removeH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListH323TrunkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listH323Trunk")
    @WebResult(name = "listH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListH323TrunkRes listH323Trunk(
        @WebParam(name = "listH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListH323TrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addPhone")
    @WebResult(name = "addPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addPhone(
        @WebParam(name = "addPhone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddPhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updatePhone")
    @WebResult(name = "updatePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updatePhone(
        @WebParam(name = "updatePhone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdatePhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetPhoneRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getPhone")
    @WebResult(name = "getPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetPhoneRes getPhone(
        @WebParam(name = "getPhone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetPhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removePhone")
    @WebResult(name = "removePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removePhone(
        @WebParam(name = "removePhone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListPhoneRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listPhone")
    @WebResult(name = "listPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListPhoneRes listPhone(
        @WebParam(name = "listPhone", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListPhoneReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addH323Gateway")
    @WebResult(name = "addH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addH323Gateway(
        @WebParam(name = "addH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddH323GatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateH323Gateway")
    @WebResult(name = "updateH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateH323Gateway(
        @WebParam(name = "updateH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateH323GatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetH323GatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getH323Gateway")
    @WebResult(name = "getH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetH323GatewayRes getH323Gateway(
        @WebParam(name = "getH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetH323GatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeH323Gateway")
    @WebResult(name = "removeH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeH323Gateway(
        @WebParam(name = "removeH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListH323GatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listH323Gateway")
    @WebResult(name = "listH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListH323GatewayRes listH323Gateway(
        @WebParam(name = "listH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListH323GatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addDeviceProfile")
    @WebResult(name = "addDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addDeviceProfile(
        @WebParam(name = "addDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateDeviceProfile")
    @WebResult(name = "updateDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateDeviceProfile(
        @WebParam(name = "updateDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetDeviceProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getDeviceProfile")
    @WebResult(name = "getDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetDeviceProfileRes getDeviceProfile(
        @WebParam(name = "getDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeDeviceProfile")
    @WebResult(name = "removeDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeDeviceProfile(
        @WebParam(name = "removeDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListDeviceProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listDeviceProfile")
    @WebResult(name = "listDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListDeviceProfileRes listDeviceProfile(
        @WebParam(name = "listDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListDeviceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRemoteDestination")
    @WebResult(name = "addRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRemoteDestination(
        @WebParam(name = "addRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRemoteDestinationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRemoteDestination")
    @WebResult(name = "updateRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRemoteDestination(
        @WebParam(name = "updateRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRemoteDestinationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRemoteDestinationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRemoteDestination")
    @WebResult(name = "getRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRemoteDestinationRes getRemoteDestination(
        @WebParam(name = "getRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRemoteDestinationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRemoteDestination")
    @WebResult(name = "removeRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRemoteDestination(
        @WebParam(name = "removeRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveRemoteDestinationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRemoteDestinationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRemoteDestination")
    @WebResult(name = "listRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRemoteDestinationRes listRemoteDestination(
        @WebParam(name = "listRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRemoteDestinationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGateway")
    @WebResult(name = "addGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGateway(
        @WebParam(name = "addGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGateway")
    @WebResult(name = "updateGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGateway(
        @WebParam(name = "updateGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGateway")
    @WebResult(name = "getGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGatewayRes getGateway(
        @WebParam(name = "getGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGateway")
    @WebResult(name = "removeGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGateway(
        @WebParam(name = "removeGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listGateway")
    @WebResult(name = "listGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListGatewayRes listGateway(
        @WebParam(name = "listGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGatewayEndpointAnalogAccess")
    @WebResult(name = "addGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointAnalogAccess(
        @WebParam(name = "addGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGatewayEndpointAnalogAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGatewayEndpointAnalogAccess")
    @WebResult(name = "updateGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointAnalogAccess(
        @WebParam(name = "updateGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGatewayEndpointAnalogAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGatewayEndpointAnalogAccessRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGatewayEndpointAnalogAccess")
    @WebResult(name = "getGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGatewayEndpointAnalogAccessRes getGatewayEndpointAnalogAccess(
        @WebParam(name = "getGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGatewayEndpointAnalogAccessReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGatewayEndpointAnalogAccess")
    @WebResult(name = "removeGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointAnalogAccess(
        @WebParam(name = "removeGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGatewayEndpointDigitalAccessPri")
    @WebResult(name = "addGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessPri(
        @WebParam(name = "addGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGatewayEndpointDigitalAccessPriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGatewayEndpointDigitalAccessPri")
    @WebResult(name = "updateGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessPri(
        @WebParam(name = "updateGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessPriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessPriRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGatewayEndpointDigitalAccessPri")
    @WebResult(name = "getGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessPriRes getGatewayEndpointDigitalAccessPri(
        @WebParam(name = "getGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGatewayEndpointDigitalAccessPriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGatewayEndpointDigitalAccessPri")
    @WebResult(name = "removeGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessPri(
        @WebParam(name = "removeGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGatewayEndpointDigitalAccessBri")
    @WebResult(name = "addGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessBri(
        @WebParam(name = "addGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGatewayEndpointDigitalAccessBriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGatewayEndpointDigitalAccessBri")
    @WebResult(name = "updateGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessBri(
        @WebParam(name = "updateGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessBriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessBriRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGatewayEndpointDigitalAccessBri")
    @WebResult(name = "getGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessBriRes getGatewayEndpointDigitalAccessBri(
        @WebParam(name = "getGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGatewayEndpointDigitalAccessBriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGatewayEndpointDigitalAccessBri")
    @WebResult(name = "removeGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessBri(
        @WebParam(name = "removeGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGatewayEndpointDigitalAccessT1")
    @WebResult(name = "addGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessT1(
        @WebParam(name = "addGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGatewayEndpointDigitalAccessT1Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGatewayEndpointDigitalAccessT1")
    @WebResult(name = "updateGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessT1(
        @WebParam(name = "updateGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessT1Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGatewayEndpointDigitalAccessT1Res
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGatewayEndpointDigitalAccessT1")
    @WebResult(name = "getGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessT1Res getGatewayEndpointDigitalAccessT1(
        @WebParam(name = "getGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGatewayEndpointDigitalAccessT1Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGatewayEndpointDigitalAccessT1")
    @WebResult(name = "removeGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessT1(
        @WebParam(name = "removeGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addVg224")
    @WebResult(name = "addVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addVg224(
        @WebParam(name = "addVg224", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddVg224Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateVg224")
    @WebResult(name = "updateVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateVg224(
        @WebParam(name = "updateVg224", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateVg224Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetVg224Res
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getVg224")
    @WebResult(name = "getVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetVg224Res getVg224(
        @WebParam(name = "getVg224", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetVg224Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeVg224")
    @WebResult(name = "removeVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeVg224(
        @WebParam(name = "removeVg224", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveVg224Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "addCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "addCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCiscoCatalyst600024PortFXSGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "updateCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "updateCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCiscoCatalyst600024PortFXSGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCiscoCatalyst600024PortFXSGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "getCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCiscoCatalyst600024PortFXSGatewayRes getCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "getCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCiscoCatalyst600024PortFXSGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "removeCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "removeCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCiscoCatalyst600024PortFXSGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "listCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCiscoCatalyst600024PortFXSGatewayRes listCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "listCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCiscoCatalyst600024PortFXSGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "addCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "addCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCiscoCatalyst6000E1VoIPGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "updateCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "updateCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCiscoCatalyst6000E1VoIPGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCiscoCatalyst6000E1VoIPGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "getCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCiscoCatalyst6000E1VoIPGatewayRes getCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "getCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCiscoCatalyst6000E1VoIPGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "removeCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "removeCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCiscoCatalyst6000E1VoIPGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "listCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCiscoCatalyst6000E1VoIPGatewayRes listCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "listCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCiscoCatalyst6000E1VoIPGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "addCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "addCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCiscoCatalyst6000T1VoIPGatewayPriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "updateCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "updateCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCiscoCatalyst6000T1VoIPGatewayPriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCiscoCatalyst6000T1VoIPGatewayPriRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "getCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCiscoCatalyst6000T1VoIPGatewayPriRes getCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "getCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCiscoCatalyst6000T1VoIPGatewayPriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "removeCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "removeCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCiscoCatalyst6000T1VoIPGatewayPriRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "listCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCiscoCatalyst6000T1VoIPGatewayPriRes listCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "listCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCiscoCatalyst6000T1VoIPGatewayPriReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "addCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "addCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCiscoCatalyst6000T1VoIPGatewayT1Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "updateCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "updateCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCiscoCatalyst6000T1VoIPGatewayT1Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCiscoCatalyst6000T1VoIPGatewayT1Res
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "getCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCiscoCatalyst6000T1VoIPGatewayT1Res getCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "getCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCiscoCatalyst6000T1VoIPGatewayT1Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "removeCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "removeCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCiscoCatalyst6000T1VoIPGatewayT1Res
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "listCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCiscoCatalyst6000T1VoIPGatewayT1Res listCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "listCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCiscoCatalyst6000T1VoIPGatewayT1Req axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCallPickupGroup")
    @WebResult(name = "addCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCallPickupGroup(
        @WebParam(name = "addCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCallPickupGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCallPickupGroup")
    @WebResult(name = "updateCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCallPickupGroup(
        @WebParam(name = "updateCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCallPickupGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCallPickupGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCallPickupGroup")
    @WebResult(name = "getCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCallPickupGroupRes getCallPickupGroup(
        @WebParam(name = "getCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCallPickupGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCallPickupGroup")
    @WebResult(name = "removeCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCallPickupGroup(
        @WebParam(name = "removeCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveCallPickupGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCallPickupGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCallPickupGroup")
    @WebResult(name = "listCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCallPickupGroupRes listCallPickupGroup(
        @WebParam(name = "listCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCallPickupGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRoutePlanRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRoutePlan")
    @WebResult(name = "listRoutePlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRoutePlanRes listRoutePlan(
        @WebParam(name = "listRoutePlan", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRoutePlanReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGeoLocationPolicy")
    @WebResult(name = "addGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGeoLocationPolicy(
        @WebParam(name = "addGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGeoLocationPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateGeoLocationPolicy")
    @WebResult(name = "updateGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateGeoLocationPolicy(
        @WebParam(name = "updateGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateGeoLocationPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetGeoLocationPolicyRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getGeoLocationPolicy")
    @WebResult(name = "getGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetGeoLocationPolicyRes getGeoLocationPolicy(
        @WebParam(name = "getGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetGeoLocationPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGeoLocationPolicy")
    @WebResult(name = "removeGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGeoLocationPolicy(
        @WebParam(name = "removeGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListGeoLocationPolicyRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listGeoLocationPolicy")
    @WebResult(name = "listGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListGeoLocationPolicyRes listGeoLocationPolicy(
        @WebParam(name = "listGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListGeoLocationPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSipTrunk")
    @WebResult(name = "addSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSipTrunk(
        @WebParam(name = "addSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSipTrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSipTrunk")
    @WebResult(name = "updateSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSipTrunk(
        @WebParam(name = "updateSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSipTrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSipTrunkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSipTrunk")
    @WebResult(name = "getSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSipTrunkRes getSipTrunk(
        @WebParam(name = "getSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSipTrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSipTrunk")
    @WebResult(name = "removeSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSipTrunk(
        @WebParam(name = "removeSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSipTrunkRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSipTrunk")
    @WebResult(name = "listSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSipTrunkRes listSipTrunk(
        @WebParam(name = "listSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSipTrunkReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRegionMatrix")
    @WebResult(name = "updateRegionMatrixResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRegionMatrix(
        @WebParam(name = "updateRegionMatrix", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRegionMatrixReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCalledPartyTransformationPattern")
    @WebResult(name = "addCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCalledPartyTransformationPattern(
        @WebParam(name = "addCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCalledPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCalledPartyTransformationPattern")
    @WebResult(name = "updateCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCalledPartyTransformationPattern(
        @WebParam(name = "updateCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCalledPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCalledPartyTransformationPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCalledPartyTransformationPattern")
    @WebResult(name = "getCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCalledPartyTransformationPatternRes getCalledPartyTransformationPattern(
        @WebParam(name = "getCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCalledPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCalledPartyTransformationPattern")
    @WebResult(name = "removeCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCalledPartyTransformationPattern(
        @WebParam(name = "removeCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveCalledPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCalledPartyTransformationPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCalledPartyTransformationPattern")
    @WebResult(name = "listCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCalledPartyTransformationPatternRes listCalledPartyTransformationPattern(
        @WebParam(name = "listCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCalledPartyTransformationPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addExternalCallControlProfile")
    @WebResult(name = "addExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addExternalCallControlProfile(
        @WebParam(name = "addExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddExternalCallControlProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateExternalCallControlProfile")
    @WebResult(name = "updateExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateExternalCallControlProfile(
        @WebParam(name = "updateExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateExternalCallControlProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetExternalCallControlProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getExternalCallControlProfile")
    @WebResult(name = "getExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetExternalCallControlProfileRes getExternalCallControlProfile(
        @WebParam(name = "getExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetExternalCallControlProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeExternalCallControlProfile")
    @WebResult(name = "removeExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeExternalCallControlProfile(
        @WebParam(name = "removeExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListExternalCallControlProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listExternalCallControlProfile")
    @WebResult(name = "listExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListExternalCallControlProfileRes listExternalCallControlProfile(
        @WebParam(name = "listExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListExternalCallControlProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSafSecurityProfile")
    @WebResult(name = "addSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSafSecurityProfile(
        @WebParam(name = "addSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSafSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSafSecurityProfile")
    @WebResult(name = "updateSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSafSecurityProfile(
        @WebParam(name = "updateSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSafSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSafSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSafSecurityProfile")
    @WebResult(name = "getSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSafSecurityProfileRes getSafSecurityProfile(
        @WebParam(name = "getSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSafSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSafSecurityProfile")
    @WebResult(name = "removeSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSafSecurityProfile(
        @WebParam(name = "removeSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSafSecurityProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSafSecurityProfile")
    @WebResult(name = "listSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSafSecurityProfileRes listSafSecurityProfile(
        @WebParam(name = "listSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSafSecurityProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSafForwarder")
    @WebResult(name = "addSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSafForwarder(
        @WebParam(name = "addSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSafForwarderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSafForwarder")
    @WebResult(name = "updateSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSafForwarder(
        @WebParam(name = "updateSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSafForwarderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSafForwarderRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSafForwarder")
    @WebResult(name = "getSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSafForwarderRes getSafForwarder(
        @WebParam(name = "getSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSafForwarderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSafForwarder")
    @WebResult(name = "removeSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSafForwarder(
        @WebParam(name = "removeSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSafForwarderRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSafForwarder")
    @WebResult(name = "listSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSafForwarderRes listSafForwarder(
        @WebParam(name = "listSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSafForwarderReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCcdHostedDN")
    @WebResult(name = "addCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCcdHostedDN(
        @WebParam(name = "addCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCcdHostedDNReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCcdHostedDN")
    @WebResult(name = "updateCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCcdHostedDN(
        @WebParam(name = "updateCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCcdHostedDNReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCcdHostedDNRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCcdHostedDN")
    @WebResult(name = "getCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCcdHostedDNRes getCcdHostedDN(
        @WebParam(name = "getCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCcdHostedDNReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCcdHostedDN")
    @WebResult(name = "removeCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCcdHostedDN(
        @WebParam(name = "removeCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveCcdHostedDNReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCcdHostedDNRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCcdHostedDN")
    @WebResult(name = "listCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCcdHostedDNRes listCcdHostedDN(
        @WebParam(name = "listCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCcdHostedDNReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCcdHostedDNGroup")
    @WebResult(name = "addCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCcdHostedDNGroup(
        @WebParam(name = "addCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCcdHostedDNGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCcdHostedDNGroup")
    @WebResult(name = "updateCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCcdHostedDNGroup(
        @WebParam(name = "updateCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCcdHostedDNGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCcdHostedDNGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCcdHostedDNGroup")
    @WebResult(name = "getCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCcdHostedDNGroupRes getCcdHostedDNGroup(
        @WebParam(name = "getCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCcdHostedDNGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCcdHostedDNGroup")
    @WebResult(name = "removeCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCcdHostedDNGroup(
        @WebParam(name = "removeCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCcdHostedDNGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCcdHostedDNGroup")
    @WebResult(name = "listCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCcdHostedDNGroupRes listCcdHostedDNGroup(
        @WebParam(name = "listCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCcdHostedDNGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCcdRequestingService")
    @WebResult(name = "addCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCcdRequestingService(
        @WebParam(name = "addCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCcdRequestingServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCcdRequestingService")
    @WebResult(name = "updateCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCcdRequestingService(
        @WebParam(name = "updateCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCcdRequestingServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCcdRequestingServiceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCcdRequestingService")
    @WebResult(name = "getCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCcdRequestingServiceRes getCcdRequestingService(
        @WebParam(name = "getCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCcdRequestingServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCcdRequestingService")
    @WebResult(name = "removeCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCcdRequestingService(
        @WebParam(name = "removeCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateInterClusterServiceProfile")
    @WebResult(name = "updateInterClusterServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateInterClusterServiceProfile(
        @WebParam(name = "updateInterClusterServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateInterClusterServiceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetInterClusterServiceProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getInterClusterServiceProfile")
    @WebResult(name = "getInterClusterServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetInterClusterServiceProfileRes getInterClusterServiceProfile(
        @WebParam(name = "getInterClusterServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetInterClusterServiceProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addRemoteCluster")
    @WebResult(name = "addRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addRemoteCluster(
        @WebParam(name = "addRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddRemoteClusterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateRemoteCluster")
    @WebResult(name = "updateRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateRemoteCluster(
        @WebParam(name = "updateRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateRemoteClusterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetRemoteClusterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getRemoteCluster")
    @WebResult(name = "getRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetRemoteClusterRes getRemoteCluster(
        @WebParam(name = "getRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetRemoteClusterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeRemoteCluster")
    @WebResult(name = "removeRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeRemoteCluster(
        @WebParam(name = "removeRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveRemoteClusterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListRemoteClusterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listRemoteCluster")
    @WebResult(name = "listRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListRemoteClusterRes listRemoteCluster(
        @WebParam(name = "listRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListRemoteClusterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addCcdAdvertisingService")
    @WebResult(name = "addCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addCcdAdvertisingService(
        @WebParam(name = "addCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddCcdAdvertisingServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateCcdAdvertisingService")
    @WebResult(name = "updateCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateCcdAdvertisingService(
        @WebParam(name = "updateCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateCcdAdvertisingServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCcdAdvertisingServiceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCcdAdvertisingService")
    @WebResult(name = "getCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCcdAdvertisingServiceRes getCcdAdvertisingService(
        @WebParam(name = "getCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCcdAdvertisingServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeCcdAdvertisingService")
    @WebResult(name = "removeCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeCcdAdvertisingService(
        @WebParam(name = "removeCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListCcdAdvertisingServiceRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listCcdAdvertisingService")
    @WebResult(name = "listCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListCcdAdvertisingServiceRes listCcdAdvertisingService(
        @WebParam(name = "listCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListCcdAdvertisingServiceReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addUnitsToGateway")
    @WebResult(name = "addUnitsToGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addUnitsToGateway(
        @WebParam(name = "addUnitsToGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddUnitsToGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addGatewaySubunits")
    @WebResult(name = "addGatewaySubunitsResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addGatewaySubunits(
        @WebParam(name = "addGatewaySubunits", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddGatewaySubunitsReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addLdapDirectory")
    @WebResult(name = "addLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addLdapDirectory(
        @WebParam(name = "addLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddLdapDirectoryReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLdapDirectory")
    @WebResult(name = "updateLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLdapDirectory(
        @WebParam(name = "updateLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLdapDirectoryReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLdapDirectoryRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLdapDirectory")
    @WebResult(name = "getLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLdapDirectoryRes getLdapDirectory(
        @WebParam(name = "getLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLdapDirectoryReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeLdapDirectory")
    @WebResult(name = "removeLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeLdapDirectory(
        @WebParam(name = "removeLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListLdapDirectoryRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listLdapDirectory")
    @WebResult(name = "listLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListLdapDirectoryRes listLdapDirectory(
        @WebParam(name = "listLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListLdapDirectoryReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateEmccFeatureConfig")
    @WebResult(name = "updateEmccFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateEmccFeatureConfig(
        @WebParam(name = "updateEmccFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateEmccFeatureConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetEmccFeatureConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getEmccFeatureConfig")
    @WebResult(name = "getEmccFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetEmccFeatureConfigRes getEmccFeatureConfig(
        @WebParam(name = "getEmccFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetEmccFeatureConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "addSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "addSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddSafCcdPurgeBlockLearnedRoutesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "updateSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "updateSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateSafCcdPurgeBlockLearnedRoutesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetSafCcdPurgeBlockLearnedRoutesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "getSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetSafCcdPurgeBlockLearnedRoutesRes getSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "getSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetSafCcdPurgeBlockLearnedRoutesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "removeSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "removeSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveSafCcdPurgeBlockLearnedRoutesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListSafCcdPurgeBlockLearnedRoutesRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "listSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListSafCcdPurgeBlockLearnedRoutesRes listSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "listSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListSafCcdPurgeBlockLearnedRoutesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addVpnGateway")
    @WebResult(name = "addVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addVpnGateway(
        @WebParam(name = "addVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddVpnGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateVpnGateway")
    @WebResult(name = "updateVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateVpnGateway(
        @WebParam(name = "updateVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateVpnGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetVpnGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getVpnGateway")
    @WebResult(name = "getVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetVpnGatewayRes getVpnGateway(
        @WebParam(name = "getVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetVpnGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeVpnGateway")
    @WebResult(name = "removeVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeVpnGateway(
        @WebParam(name = "removeVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListVpnGatewayRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listVpnGateway")
    @WebResult(name = "listVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListVpnGatewayRes listVpnGateway(
        @WebParam(name = "listVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListVpnGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addVpnGroup")
    @WebResult(name = "addVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addVpnGroup(
        @WebParam(name = "addVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddVpnGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateVpnGroup")
    @WebResult(name = "updateVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateVpnGroup(
        @WebParam(name = "updateVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateVpnGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetVpnGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getVpnGroup")
    @WebResult(name = "getVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetVpnGroupRes getVpnGroup(
        @WebParam(name = "getVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetVpnGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeVpnGroup")
    @WebResult(name = "removeVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeVpnGroup(
        @WebParam(name = "removeVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListVpnGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listVpnGroup")
    @WebResult(name = "listVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListVpnGroupRes listVpnGroup(
        @WebParam(name = "listVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListVpnGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addVpnProfile")
    @WebResult(name = "addVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addVpnProfile(
        @WebParam(name = "addVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddVpnProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateVpnProfile")
    @WebResult(name = "updateVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateVpnProfile(
        @WebParam(name = "updateVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateVpnProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetVpnProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getVpnProfile")
    @WebResult(name = "getVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetVpnProfileRes getVpnProfile(
        @WebParam(name = "getVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetVpnProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeVpnProfile")
    @WebResult(name = "removeVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeVpnProfile(
        @WebParam(name = "removeVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListVpnProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listVpnProfile")
    @WebResult(name = "listVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListVpnProfileRes listVpnProfile(
        @WebParam(name = "listVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListVpnProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeServer")
    @WebResult(name = "addImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeServer(
        @WebParam(name = "addImeServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeServer")
    @WebResult(name = "updateImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeServer(
        @WebParam(name = "updateImeServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeServer")
    @WebResult(name = "getImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeServerRes getImeServer(
        @WebParam(name = "getImeServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeServer")
    @WebResult(name = "removeImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeServer(
        @WebParam(name = "removeImeServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeServerRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeServer")
    @WebResult(name = "listImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeServerRes listImeServer(
        @WebParam(name = "listImeServer", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeServerReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeRouteFilterGroup")
    @WebResult(name = "addImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeRouteFilterGroup(
        @WebParam(name = "addImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeRouteFilterGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeRouteFilterGroup")
    @WebResult(name = "updateImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeRouteFilterGroup(
        @WebParam(name = "updateImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeRouteFilterGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeRouteFilterGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeRouteFilterGroup")
    @WebResult(name = "getImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeRouteFilterGroupRes getImeRouteFilterGroup(
        @WebParam(name = "getImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeRouteFilterGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeRouteFilterGroup")
    @WebResult(name = "removeImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeRouteFilterGroup(
        @WebParam(name = "removeImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeRouteFilterGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeRouteFilterGroup")
    @WebResult(name = "listImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeRouteFilterGroupRes listImeRouteFilterGroup(
        @WebParam(name = "listImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeRouteFilterGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeRouteFilterElement")
    @WebResult(name = "addImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeRouteFilterElement(
        @WebParam(name = "addImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeRouteFilterElementReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeRouteFilterElement")
    @WebResult(name = "updateImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeRouteFilterElement(
        @WebParam(name = "updateImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeRouteFilterElementReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeRouteFilterElementRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeRouteFilterElement")
    @WebResult(name = "getImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeRouteFilterElementRes getImeRouteFilterElement(
        @WebParam(name = "getImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeRouteFilterElementReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeRouteFilterElement")
    @WebResult(name = "removeImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeRouteFilterElement(
        @WebParam(name = "removeImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeRouteFilterElementRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeRouteFilterElement")
    @WebResult(name = "listImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeRouteFilterElementRes listImeRouteFilterElement(
        @WebParam(name = "listImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeRouteFilterElementReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeClient")
    @WebResult(name = "addImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeClient(
        @WebParam(name = "addImeClient", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeClientReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeClient")
    @WebResult(name = "updateImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeClient(
        @WebParam(name = "updateImeClient", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeClientReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeClientRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeClient")
    @WebResult(name = "getImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeClientRes getImeClient(
        @WebParam(name = "getImeClient", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeClientReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeClient")
    @WebResult(name = "removeImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeClient(
        @WebParam(name = "removeImeClient", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeClientRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeClient")
    @WebResult(name = "listImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeClientRes listImeClient(
        @WebParam(name = "listImeClient", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeClientReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeEnrolledPattern")
    @WebResult(name = "addImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeEnrolledPattern(
        @WebParam(name = "addImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeEnrolledPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeEnrolledPattern")
    @WebResult(name = "updateImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeEnrolledPattern(
        @WebParam(name = "updateImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeEnrolledPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeEnrolledPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeEnrolledPattern")
    @WebResult(name = "getImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeEnrolledPatternRes getImeEnrolledPattern(
        @WebParam(name = "getImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeEnrolledPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeEnrolledPattern")
    @WebResult(name = "removeImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeEnrolledPattern(
        @WebParam(name = "removeImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveImeEnrolledPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeEnrolledPatternRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeEnrolledPattern")
    @WebResult(name = "listImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeEnrolledPatternRes listImeEnrolledPattern(
        @WebParam(name = "listImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeEnrolledPatternReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeEnrolledPatternGroup")
    @WebResult(name = "addImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeEnrolledPatternGroup(
        @WebParam(name = "addImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeEnrolledPatternGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeEnrolledPatternGroup")
    @WebResult(name = "updateImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeEnrolledPatternGroup(
        @WebParam(name = "updateImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeEnrolledPatternGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeEnrolledPatternGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeEnrolledPatternGroup")
    @WebResult(name = "getImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeEnrolledPatternGroupRes getImeEnrolledPatternGroup(
        @WebParam(name = "getImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeEnrolledPatternGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeEnrolledPatternGroup")
    @WebResult(name = "removeImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeEnrolledPatternGroup(
        @WebParam(name = "removeImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeEnrolledPatternGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeEnrolledPatternGroup")
    @WebResult(name = "listImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeEnrolledPatternGroupRes listImeEnrolledPatternGroup(
        @WebParam(name = "listImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeEnrolledPatternGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeExclusionNumber")
    @WebResult(name = "addImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeExclusionNumber(
        @WebParam(name = "addImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeExclusionNumberReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeExclusionNumber")
    @WebResult(name = "updateImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeExclusionNumber(
        @WebParam(name = "updateImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeExclusionNumberReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeExclusionNumberRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeExclusionNumber")
    @WebResult(name = "getImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeExclusionNumberRes getImeExclusionNumber(
        @WebParam(name = "getImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeExclusionNumberReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeExclusionNumber")
    @WebResult(name = "removeImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeExclusionNumber(
        @WebParam(name = "removeImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveImeExclusionNumberReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeExclusionNumberRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeExclusionNumber")
    @WebResult(name = "listImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeExclusionNumberRes listImeExclusionNumber(
        @WebParam(name = "listImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeExclusionNumberReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeExclusionNumberGroup")
    @WebResult(name = "addImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeExclusionNumberGroup(
        @WebParam(name = "addImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeExclusionNumberGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeExclusionNumberGroup")
    @WebResult(name = "updateImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeExclusionNumberGroup(
        @WebParam(name = "updateImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeExclusionNumberGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeExclusionNumberGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeExclusionNumberGroup")
    @WebResult(name = "getImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeExclusionNumberGroupRes getImeExclusionNumberGroup(
        @WebParam(name = "getImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeExclusionNumberGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeExclusionNumberGroup")
    @WebResult(name = "removeImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeExclusionNumberGroup(
        @WebParam(name = "removeImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeExclusionNumberGroupRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeExclusionNumberGroup")
    @WebResult(name = "listImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeExclusionNumberGroupRes listImeExclusionNumberGroup(
        @WebParam(name = "listImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeExclusionNumberGroupReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeFirewall")
    @WebResult(name = "addImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeFirewall(
        @WebParam(name = "addImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeFirewallReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeFirewall")
    @WebResult(name = "updateImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeFirewall(
        @WebParam(name = "updateImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeFirewallReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeFirewallRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeFirewall")
    @WebResult(name = "getImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeFirewallRes getImeFirewall(
        @WebParam(name = "getImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeFirewallReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeFirewall")
    @WebResult(name = "removeImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeFirewall(
        @WebParam(name = "removeImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeFirewallRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeFirewall")
    @WebResult(name = "listImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeFirewallRes listImeFirewall(
        @WebParam(name = "listImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeFirewallReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addImeE164Transformation")
    @WebResult(name = "addImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addImeE164Transformation(
        @WebParam(name = "addImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddImeE164TransformationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeE164Transformation")
    @WebResult(name = "updateImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeE164Transformation(
        @WebParam(name = "updateImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeE164TransformationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeE164TransformationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeE164Transformation")
    @WebResult(name = "getImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeE164TransformationRes getImeE164Transformation(
        @WebParam(name = "getImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeE164TransformationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeImeE164Transformation")
    @WebResult(name = "removeImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeImeE164Transformation(
        @WebParam(name = "removeImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListImeE164TransformationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listImeE164Transformation")
    @WebResult(name = "listImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListImeE164TransformationRes listImeE164Transformation(
        @WebParam(name = "listImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListImeE164TransformationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addTransformationProfile")
    @WebResult(name = "addTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addTransformationProfile(
        @WebParam(name = "addTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddTransformationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateTransformationProfile")
    @WebResult(name = "updateTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateTransformationProfile(
        @WebParam(name = "updateTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateTransformationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetTransformationProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getTransformationProfile")
    @WebResult(name = "getTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetTransformationProfileRes getTransformationProfile(
        @WebParam(name = "getTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetTransformationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeTransformationProfile")
    @WebResult(name = "removeTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeTransformationProfile(
        @WebParam(name = "removeTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListTransformationProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listTransformationProfile")
    @WebResult(name = "listTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListTransformationProfileRes listTransformationProfile(
        @WebParam(name = "listTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListTransformationProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addFallbackProfile")
    @WebResult(name = "addFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addFallbackProfile(
        @WebParam(name = "addFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddFallbackProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateFallbackProfile")
    @WebResult(name = "updateFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateFallbackProfile(
        @WebParam(name = "updateFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateFallbackProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetFallbackProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getFallbackProfile")
    @WebResult(name = "getFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetFallbackProfileRes getFallbackProfile(
        @WebParam(name = "getFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetFallbackProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeFallbackProfile")
    @WebResult(name = "removeFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeFallbackProfile(
        @WebParam(name = "removeFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListFallbackProfileRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listFallbackProfile")
    @WebResult(name = "listFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListFallbackProfileRes listFallbackProfile(
        @WebParam(name = "listFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListFallbackProfileReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addLdapFilter")
    @WebResult(name = "addLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addLdapFilter(
        @WebParam(name = "addLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddLdapFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLdapFilter")
    @WebResult(name = "updateLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLdapFilter(
        @WebParam(name = "updateLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLdapFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLdapFilterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLdapFilter")
    @WebResult(name = "getLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLdapFilterRes getLdapFilter(
        @WebParam(name = "getLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLdapFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeLdapFilter")
    @WebResult(name = "removeLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeLdapFilter(
        @WebParam(name = "removeLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListLdapFilterRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listLdapFilter")
    @WebResult(name = "listLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListLdapFilterRes listLdapFilter(
        @WebParam(name = "listLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListLdapFilterReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addAppServerInfo")
    @WebResult(name = "addAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addAppServerInfo(
        @WebParam(name = "addAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddAppServerInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateAppServerInfo")
    @WebResult(name = "updateAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateAppServerInfo(
        @WebParam(name = "updateAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateAppServerInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateTvsCertificate")
    @WebResult(name = "updateTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateTvsCertificate(
        @WebParam(name = "updateTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateTvsCertificateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetTvsCertificateRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getTvsCertificate")
    @WebResult(name = "getTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetTvsCertificateRes getTvsCertificate(
        @WebParam(name = "getTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetTvsCertificateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListTvsCertificateRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listTvsCertificate")
    @WebResult(name = "listTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListTvsCertificateRes listTvsCertificate(
        @WebParam(name = "listTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListTvsCertificateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addFeatureControlPolicy")
    @WebResult(name = "addFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addFeatureControlPolicy(
        @WebParam(name = "addFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddFeatureControlPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateFeatureControlPolicy")
    @WebResult(name = "updateFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateFeatureControlPolicy(
        @WebParam(name = "updateFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateFeatureControlPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetFeatureControlPolicyRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getFeatureControlPolicy")
    @WebResult(name = "getFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetFeatureControlPolicyRes getFeatureControlPolicy(
        @WebParam(name = "getFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetFeatureControlPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeFeatureControlPolicy")
    @WebResult(name = "removeFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeFeatureControlPolicy(
        @WebParam(name = "removeFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        NameAndGUIDRequest axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ListFeatureControlPolicyRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 listFeatureControlPolicy")
    @WebResult(name = "listFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ListFeatureControlPolicyRes listFeatureControlPolicy(
        @WebParam(name = "listFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ListFeatureControlPolicyReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ExecuteSQLQueryRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 executeSQLQuery")
    @WebResult(name = "executeSQLQueryResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ExecuteSQLQueryRes executeSQLQuery(
        @WebParam(name = "executeSQLQuery", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ExecuteSQLQueryReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.ExecuteSQLUpdateRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 executeSQLUpdate")
    @WebResult(name = "executeSQLUpdateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public ExecuteSQLUpdateRes executeSQLUpdate(
        @WebParam(name = "executeSQLUpdate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        ExecuteSQLUpdateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.DoAuthenticateUserRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 doAuthenticateUser")
    @WebResult(name = "doAuthenticateUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public DoAuthenticateUserRes doAuthenticateUser(
        @WebParam(name = "doAuthenticateUser", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        DoAuthenticateUserReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.DoDeviceLoginRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 doDeviceLogin")
    @WebResult(name = "doDeviceLoginResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public DoDeviceLoginRes doDeviceLogin(
        @WebParam(name = "doDeviceLogin", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        DoDeviceLoginReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.DoDeviceLogoutRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 doDeviceLogout")
    @WebResult(name = "doDeviceLogoutResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public DoDeviceLogoutRes doDeviceLogout(
        @WebParam(name = "doDeviceLogout", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        DoDeviceLogoutReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.DoDeviceResetRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 doDeviceReset")
    @WebResult(name = "doDeviceResetResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public DoDeviceResetRes doDeviceReset(
        @WebParam(name = "doDeviceReset", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        DoDeviceResetReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetOSVersionRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getOSVersion")
    @WebResult(name = "getOSVersionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetOSVersionRes getOSVersion(
        @WebParam(name = "getOSVersion", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetOSVersionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetNumDevicesResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getNumDevices")
    @WebResult(name = "getNumDevicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetNumDevicesResponse getNumDevices(
        @WebParam(name = "getNumDevices", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetNumDevicesReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addMobility")
    @WebResult(name = "addMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addMobility(
        @WebParam(name = "addMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddMobilityReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateMobility")
    @WebResult(name = "updateMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateMobility(
        @WebParam(name = "updateMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateMobilityReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetMobilityRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getMobility")
    @WebResult(name = "getMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetMobilityRes getMobility(
        @WebParam(name = "getMobility", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetMobilityReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetEnterprisePhoneConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getEnterprisePhoneConfig")
    @WebResult(name = "getEnterprisePhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetEnterprisePhoneConfigRes getEnterprisePhoneConfig(
        @WebParam(name = "getEnterprisePhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetEnterprisePhoneConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateEnterprisePhoneConfig")
    @WebResult(name = "updateEnterprisePhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateEnterprisePhoneConfig(
        @WebParam(name = "updateEnterprisePhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateEnterprisePhoneConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLicenseUnitReportRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLicenseUnitReport")
    @WebResult(name = "getLicenseUnitReportResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLicenseUnitReportRes getLicenseUnitReport(
        @WebParam(name = "getLicenseUnitReport", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLicenseUnitReportReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLdapSystemRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLdapSystem")
    @WebResult(name = "getLdapSystemResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLdapSystemRes getLdapSystem(
        @WebParam(name = "getLdapSystem", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLdapSystemReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLdapSystem")
    @WebResult(name = "updateLdapSystemResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLdapSystem(
        @WebParam(name = "updateLdapSystem", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLdapSystemReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetLdapAuthenticationRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getLdapAuthentication")
    @WebResult(name = "getLdapAuthenticationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetLdapAuthenticationRes getLdapAuthentication(
        @WebParam(name = "getLdapAuthentication", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetLdapAuthenticationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateLdapAuthentication")
    @WebResult(name = "updateLdapAuthenticationResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateLdapAuthentication(
        @WebParam(name = "updateLdapAuthentication", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateLdapAuthenticationReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 addApplicationToSoftkeyTemplate")
    @WebResult(name = "addApplicationToSoftkeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse addApplicationToSoftkeyTemplate(
        @WebParam(name = "addApplicationToSoftkeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        AddApplicationToSoftkeyTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeApplicationToSoftkeyTemplate")
    @WebResult(name = "removeApplicationToSoftkeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeApplicationToSoftkeyTemplate(
        @WebParam(name = "removeApplicationToSoftkeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveApplicationToSoftkeyTemplateReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetCCMVersionRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getCCMVersion")
    @WebResult(name = "getCCMVersionResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetCCMVersionRes getCCMVersion(
        @WebParam(name = "getCCMVersion", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetCCMVersionReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeUnitsToGateway")
    @WebResult(name = "removeUnitsToGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeUnitsToGateway(
        @WebParam(name = "removeUnitsToGateway", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveUnitsToGatewayReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeGatewaySubunits")
    @WebResult(name = "removeGatewaySubunitsResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeGatewaySubunits(
        @WebParam(name = "removeGatewaySubunits", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveGatewaySubunitsReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateImeFeatureConfig")
    @WebResult(name = "updateImeFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateImeFeatureConfig(
        @WebParam(name = "updateImeFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateImeFeatureConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 updateFallbackFeatureConfig")
    @WebResult(name = "updateFallbackFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse updateFallbackFeatureConfig(
        @WebParam(name = "updateFallbackFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        UpdateFallbackFeatureConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetImeFeatureConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getImeFeatureConfig")
    @WebResult(name = "getImeFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetImeFeatureConfigRes getImeFeatureConfig(
        @WebParam(name = "getImeFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetImeFeatureConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetFallbackFeatureConfigRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getFallbackFeatureConfig")
    @WebResult(name = "getFallbackFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetFallbackFeatureConfigRes getFallbackFeatureConfig(
        @WebParam(name = "getFallbackFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetFallbackFeatureConfigReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.GetAppServerInfoRes
     */
    @WebMethod(action = "CUCM:DB ver=8.0 getAppServerInfo")
    @WebResult(name = "getAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public GetAppServerInfoRes getAppServerInfo(
        @WebParam(name = "getAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        GetAppServerInfoReq axlParams);

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._8.StandardResponse
     */
    @WebMethod(action = "CUCM:DB ver=8.0 removeAppServerInfo")
    @WebResult(name = "removeAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
    public StandardResponse removeAppServerInfo(
        @WebParam(name = "removeAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/8.0", partName = "axlParams")
        RemoveAppServerInfoReq axlParams);

}
