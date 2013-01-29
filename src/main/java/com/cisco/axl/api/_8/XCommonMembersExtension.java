
package com.cisco.axl.api._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCommonMembersExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCommonMembersExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCommonMembersExtension")
@XmlSeeAlso({
    com.cisco.axl.api._8.UpdateRouteGroupReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateRouteGroupReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateRouteGroupReq.Members.class,
    com.cisco.axl.api._8.UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks.class,
    com.cisco.axl.api._8.UpdateCcdRequestingServiceReq.AddAssociatedTrunks.class,
    com.cisco.axl.api._8.UpdateCcdRequestingServiceReq.AssociatedTrunks.class,
    com.cisco.axl.api._8.UpdateApplicationServerReq.RemoveAppUsers.class,
    com.cisco.axl.api._8.UpdateApplicationServerReq.AddAppUsers.class,
    com.cisco.axl.api._8.UpdateApplicationServerReq.AppUsers.class,
    com.cisco.axl.api._8.UpdateApplicationServerReq.RemoveEndUsers.class,
    com.cisco.axl.api._8.UpdateApplicationServerReq.AddEndUsers.class,
    com.cisco.axl.api._8.UpdateApplicationServerReq.EndUsers.class,
    com.cisco.axl.api._8.UpdateCallManagerGroupReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateCallManagerGroupReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateCallManagerGroupReq.Members.class,
    com.cisco.axl.api._8.UpdateSipDialRulesReq.RemovePatterns.class,
    com.cisco.axl.api._8.UpdateSipDialRulesReq.AddPatterns.class,
    com.cisco.axl.api._8.UpdateSipDialRulesReq.Patterns.class,
    com.cisco.axl.api._8.UpdateSipDialRulesReq.RemovePlars.class,
    com.cisco.axl.api._8.UpdateSipDialRulesReq.AddPlars.class,
    com.cisco.axl.api._8.UpdateSipDialRulesReq.Plars.class,
    com.cisco.axl.api._8.UpdateSafForwarderReq.RemoveAssociatedCucms.class,
    com.cisco.axl.api._8.UpdateSafForwarderReq.AddAssociatedCucms.class,
    com.cisco.axl.api._8.UpdateSafForwarderReq.AssociatedCucms.class,
    com.cisco.axl.api._8.UpdateHuntListReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateHuntListReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateHuntListReq.Members.class,
    com.cisco.axl.api._8.UpdateGeoLocationPolicyReq.RemoveRelatedPolicies.class,
    com.cisco.axl.api._8.UpdateGeoLocationPolicyReq.AddRelatedPolicies.class,
    com.cisco.axl.api._8.UpdateGeoLocationPolicyReq.RelatedPolicies.class,
    com.cisco.axl.api._8.UpdateImeClientReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateImeClientReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateImeClientReq.Members.class,
    com.cisco.axl.api._8.UpdateImeClientReq.RemoveCcmExternalIpMaps.class,
    com.cisco.axl.api._8.UpdateImeClientReq.AddCcmExternalIpMaps.class,
    com.cisco.axl.api._8.UpdateImeClientReq.CcmExternalIpMaps.class,
    com.cisco.axl.api._8.UpdateDeviceMobilityReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateDeviceMobilityReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateDeviceMobilityReq.Members.class,
    com.cisco.axl.api._8.UpdateSipTrunkReq.RemoveDestinations.class,
    com.cisco.axl.api._8.UpdateSipTrunkReq.AddDestinations.class,
    com.cisco.axl.api._8.UpdateSipTrunkReq.Destinations.class,
    com.cisco.axl.api._8.UpdateDateTimeGroupReq.RemovePhoneNtpReferences.class,
    com.cisco.axl.api._8.UpdateDateTimeGroupReq.AddPhoneNtpReferences.class,
    com.cisco.axl.api._8.UpdateDateTimeGroupReq.PhoneNtpReferences.class,
    com.cisco.axl.api._8.UpdateH323TrunkReq.RemoveDestinations.class,
    com.cisco.axl.api._8.UpdateH323TrunkReq.AddDestinations.class,
    com.cisco.axl.api._8.UpdateH323TrunkReq.Destinations.class,
    com.cisco.axl.api._8.UpdateMediaResourceGroupReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateMediaResourceGroupReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateMediaResourceGroupReq.Members.class,
    com.cisco.axl.api._8.UpdateCallPickupGroupReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateCallPickupGroupReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateCallPickupGroupReq.Members.class,
    com.cisco.axl.api._8.UpdateIpPhoneServicesReq.RemoveParameters.class,
    com.cisco.axl.api._8.UpdateIpPhoneServicesReq.AddParameters.class,
    com.cisco.axl.api._8.UpdateIpPhoneServicesReq.Parameters.class,
    com.cisco.axl.api._8.UpdateCallerFilterListReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateCallerFilterListReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateCallerFilterListReq.Members.class,
    com.cisco.axl.api._8.UpdateMediaResourceListReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateMediaResourceListReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateMediaResourceListReq.Members.class,
    com.cisco.axl.api._8.UpdateRouteFilterReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateRouteFilterReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateRouteFilterReq.Members.class,
    com.cisco.axl.api._8.UpdateMobileVoiceAccessReq.RemoveLocales.class,
    com.cisco.axl.api._8.UpdateMobileVoiceAccessReq.AddLocales.class,
    com.cisco.axl.api._8.UpdateMobileVoiceAccessReq.Locales.class,
    com.cisco.axl.api._8.UpdateUserGroupReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateUserGroupReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateUserGroupReq.Members.class,
    com.cisco.axl.api._8.UpdateUserGroupReq.RemoveUserRoles.class,
    com.cisco.axl.api._8.UpdateUserGroupReq.AddUserRoles.class,
    com.cisco.axl.api._8.UpdateUserGroupReq.UserRoles.class,
    com.cisco.axl.api._8.UpdateCssReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateCssReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateCssReq.Members.class,
    com.cisco.axl.api._8.UpdateTimeScheduleReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateTimeScheduleReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateTimeScheduleReq.Members.class,
    com.cisco.axl.api._8.UpdateResourcePriorityNamespaceListReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateResourcePriorityNamespaceListReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateResourcePriorityNamespaceListReq.Members.class,
    com.cisco.axl.api._8.UpdateRouteListReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateRouteListReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateRouteListReq.Members.class,
    com.cisco.axl.api._8.UpdateLineGroupReq.RemoveMembers.class,
    com.cisco.axl.api._8.UpdateLineGroupReq.AddMembers.class,
    com.cisco.axl.api._8.UpdateLineGroupReq.Members.class,
    com.cisco.axl.api._8.XCallPickupGroup.Members.class,
    com.cisco.axl.api._8.XRouteGroup.Members.class,
    com.cisco.axl.api._8.XMediaResourceList.Members.class,
    com.cisco.axl.api._8.XTimeSchedule.Members.class,
    com.cisco.axl.api._8.XRouteFilter.Members.class,
    com.cisco.axl.api._8.XH323Trunk.Destinations.class,
    com.cisco.axl.api._8.XResourcePriorityNamespaceList.Members.class,
    com.cisco.axl.api._8.XSafForwarder.AssociatedCucms.class,
    com.cisco.axl.api._8.XLineGroup.Members.class,
    com.cisco.axl.api._8.XDeviceMobility.Members.class,
    com.cisco.axl.api._8.XGeoLocationPolicy.RelatedPolicies.class,
    com.cisco.axl.api._8.XHuntList.Members.class,
    com.cisco.axl.api._8.XSipTrunk.Destinations.class,
    com.cisco.axl.api._8.XMobileVoiceAccess.Locales.class,
    com.cisco.axl.api._8.XUserGroup.Members.class,
    com.cisco.axl.api._8.XUserGroup.UserRoles.class,
    com.cisco.axl.api._8.XCallManagerGroup.Members.class,
    com.cisco.axl.api._8.XRouteList.Members.class,
    com.cisco.axl.api._8.XCss.Members.class,
    com.cisco.axl.api._8.XCcdRequestingService.AssociatedTrunks.class,
    com.cisco.axl.api._8.XCallerFilterList.Members.class,
    com.cisco.axl.api._8.XDdi.Members.class,
    com.cisco.axl.api._8.XSipDialRules.Patterns.class,
    com.cisco.axl.api._8.XSipDialRules.Plars.class,
    com.cisco.axl.api._8.XDateTimeGroup.PhoneNtpReferences.class,
    com.cisco.axl.api._8.XMediaResourceGroup.Members.class,
    com.cisco.axl.api._8.XIpPhoneServices.Parameters.class,
    com.cisco.axl.api._8.XImeClient.Members.class,
    com.cisco.axl.api._8.XImeClient.CcmExternalIpMaps.class,
    com.cisco.axl.api._8.XApplicationServer.AppUsers.class,
    com.cisco.axl.api._8.XApplicationServer.EndUsers.class
})
public class XCommonMembersExtension {


}
