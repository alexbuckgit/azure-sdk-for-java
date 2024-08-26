// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.ClusterInner;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * An immutable client-side representation of Cluster.
 */
public interface Cluster {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the principalId property: The service principal ID of the system assigned identity. This property will only
     * be provided for a system assigned identity.
     * 
     * @return the principalId value.
     */
    UUID principalId();

    /**
     * Gets the tenantId property: The tenant ID of the system assigned identity. This property will only be provided
     * for a system assigned identity.
     * 
     * @return the tenantId value.
     */
    UUID tenantId();

    /**
     * Gets the typeIdentityType property: Type of managed service identity (where both SystemAssigned and UserAssigned
     * types are allowed).
     * 
     * @return the typeIdentityType value.
     */
    ManagedServiceIdentityType typeIdentityType();

    /**
     * Gets the userAssignedIdentities property: The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     * 
     * @return the userAssignedIdentities value.
     */
    Map<String, UserAssignedIdentity> userAssignedIdentities();

    /**
     * Gets the provisioningState property: Provisioning state.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the status property: Status of the cluster agent.
     * 
     * @return the status value.
     */
    Status status();

    /**
     * Gets the connectivityStatus property: Overall connectivity status for the cluster resource.
     * 
     * @return the connectivityStatus value.
     */
    ConnectivityStatus connectivityStatus();

    /**
     * Gets the cloudId property: Unique, immutable resource id.
     * 
     * @return the cloudId value.
     */
    String cloudId();

    /**
     * Gets the cloudManagementEndpoint property: Endpoint configured for management from the Azure portal.
     * 
     * @return the cloudManagementEndpoint value.
     */
    String cloudManagementEndpoint();

    /**
     * Gets the aadClientId property: App id of cluster AAD identity.
     * 
     * @return the aadClientId value.
     */
    String aadClientId();

    /**
     * Gets the aadTenantId property: Tenant id of cluster AAD identity.
     * 
     * @return the aadTenantId value.
     */
    String aadTenantId();

    /**
     * Gets the aadApplicationObjectId property: Object id of cluster AAD identity.
     * 
     * @return the aadApplicationObjectId value.
     */
    String aadApplicationObjectId();

    /**
     * Gets the aadServicePrincipalObjectId property: Id of cluster identity service principal.
     * 
     * @return the aadServicePrincipalObjectId value.
     */
    String aadServicePrincipalObjectId();

    /**
     * Gets the softwareAssuranceProperties property: Software Assurance properties of the cluster.
     * 
     * @return the softwareAssuranceProperties value.
     */
    SoftwareAssuranceProperties softwareAssuranceProperties();

    /**
     * Gets the logCollectionProperties property: Log Collection properties of the cluster.
     * 
     * @return the logCollectionProperties value.
     */
    LogCollectionProperties logCollectionProperties();

    /**
     * Gets the remoteSupportProperties property: RemoteSupport properties of the cluster.
     * 
     * @return the remoteSupportProperties value.
     */
    RemoteSupportProperties remoteSupportProperties();

    /**
     * Gets the desiredProperties property: Desired properties of the cluster.
     * 
     * @return the desiredProperties value.
     */
    ClusterDesiredProperties desiredProperties();

    /**
     * Gets the reportedProperties property: Properties reported by cluster agent.
     * 
     * @return the reportedProperties value.
     */
    ClusterReportedProperties reportedProperties();

    /**
     * Gets the isolatedVmAttestationConfiguration property: Attestation configurations for isolated VM (e.g. TVM, CVM)
     * of the cluster.
     * 
     * @return the isolatedVmAttestationConfiguration value.
     */
    IsolatedVmAttestationConfiguration isolatedVmAttestationConfiguration();

    /**
     * Gets the trialDaysRemaining property: Number of days remaining in the trial period.
     * 
     * @return the trialDaysRemaining value.
     */
    Float trialDaysRemaining();

    /**
     * Gets the billingModel property: Type of billing applied to the resource.
     * 
     * @return the billingModel value.
     */
    String billingModel();

    /**
     * Gets the registrationTimestamp property: First cluster sync timestamp.
     * 
     * @return the registrationTimestamp value.
     */
    OffsetDateTime registrationTimestamp();

    /**
     * Gets the lastSyncTimestamp property: Most recent cluster sync timestamp.
     * 
     * @return the lastSyncTimestamp value.
     */
    OffsetDateTime lastSyncTimestamp();

    /**
     * Gets the lastBillingTimestamp property: Most recent billing meter timestamp.
     * 
     * @return the lastBillingTimestamp value.
     */
    OffsetDateTime lastBillingTimestamp();

    /**
     * Gets the serviceEndpoint property: Region specific DataPath Endpoint of the cluster.
     * 
     * @return the serviceEndpoint value.
     */
    String serviceEndpoint();

    /**
     * Gets the resourceProviderObjectId property: Object id of RP Service Principal.
     * 
     * @return the resourceProviderObjectId value.
     */
    String resourceProviderObjectId();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.azurestackhci.fluent.models.ClusterInner object.
     * 
     * @return the inner object.
     */
    ClusterInner innerModel();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Cluster definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Cluster definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the Cluster definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the Cluster definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithTypeIdentityType,
            DefinitionStages.WithUserAssignedIdentities, DefinitionStages.WithCloudManagementEndpoint,
            DefinitionStages.WithAadClientId, DefinitionStages.WithAadTenantId,
            DefinitionStages.WithAadApplicationObjectId, DefinitionStages.WithAadServicePrincipalObjectId,
            DefinitionStages.WithSoftwareAssuranceProperties, DefinitionStages.WithLogCollectionProperties,
            DefinitionStages.WithRemoteSupportProperties, DefinitionStages.WithDesiredProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Cluster create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cluster create(Context context);
        }

        /**
         * The stage of the Cluster definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Cluster definition allowing to specify typeIdentityType.
         */
        interface WithTypeIdentityType {
            /**
             * Specifies the typeIdentityType property: Type of managed service identity (where both SystemAssigned and
             * UserAssigned types are allowed)..
             * 
             * @param typeIdentityType Type of managed service identity (where both SystemAssigned and UserAssigned
             * types are allowed).
             * @return the next definition stage.
             */
            WithCreate withTypeIdentityType(ManagedServiceIdentityType typeIdentityType);
        }

        /**
         * The stage of the Cluster definition allowing to specify userAssignedIdentities.
         */
        interface WithUserAssignedIdentities {
            /**
             * Specifies the userAssignedIdentities property: The set of user assigned identities associated with the
             * resource. The userAssignedIdentities dictionary keys will be ARM resource ids in the form:
             * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
             * The dictionary values can be empty objects ({}) in requests..
             * 
             * @param userAssignedIdentities The set of user assigned identities associated with the resource. The
             * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
             * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
             * The dictionary values can be empty objects ({}) in requests.
             * @return the next definition stage.
             */
            WithCreate withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities);
        }

        /**
         * The stage of the Cluster definition allowing to specify cloudManagementEndpoint.
         */
        interface WithCloudManagementEndpoint {
            /**
             * Specifies the cloudManagementEndpoint property: Endpoint configured for management from the Azure
             * portal..
             * 
             * @param cloudManagementEndpoint Endpoint configured for management from the Azure portal.
             * @return the next definition stage.
             */
            WithCreate withCloudManagementEndpoint(String cloudManagementEndpoint);
        }

        /**
         * The stage of the Cluster definition allowing to specify aadClientId.
         */
        interface WithAadClientId {
            /**
             * Specifies the aadClientId property: App id of cluster AAD identity..
             * 
             * @param aadClientId App id of cluster AAD identity.
             * @return the next definition stage.
             */
            WithCreate withAadClientId(String aadClientId);
        }

        /**
         * The stage of the Cluster definition allowing to specify aadTenantId.
         */
        interface WithAadTenantId {
            /**
             * Specifies the aadTenantId property: Tenant id of cluster AAD identity..
             * 
             * @param aadTenantId Tenant id of cluster AAD identity.
             * @return the next definition stage.
             */
            WithCreate withAadTenantId(String aadTenantId);
        }

        /**
         * The stage of the Cluster definition allowing to specify aadApplicationObjectId.
         */
        interface WithAadApplicationObjectId {
            /**
             * Specifies the aadApplicationObjectId property: Object id of cluster AAD identity..
             * 
             * @param aadApplicationObjectId Object id of cluster AAD identity.
             * @return the next definition stage.
             */
            WithCreate withAadApplicationObjectId(String aadApplicationObjectId);
        }

        /**
         * The stage of the Cluster definition allowing to specify aadServicePrincipalObjectId.
         */
        interface WithAadServicePrincipalObjectId {
            /**
             * Specifies the aadServicePrincipalObjectId property: Id of cluster identity service principal..
             * 
             * @param aadServicePrincipalObjectId Id of cluster identity service principal.
             * @return the next definition stage.
             */
            WithCreate withAadServicePrincipalObjectId(String aadServicePrincipalObjectId);
        }

        /**
         * The stage of the Cluster definition allowing to specify softwareAssuranceProperties.
         */
        interface WithSoftwareAssuranceProperties {
            /**
             * Specifies the softwareAssuranceProperties property: Software Assurance properties of the cluster..
             * 
             * @param softwareAssuranceProperties Software Assurance properties of the cluster.
             * @return the next definition stage.
             */
            WithCreate withSoftwareAssuranceProperties(SoftwareAssuranceProperties softwareAssuranceProperties);
        }

        /**
         * The stage of the Cluster definition allowing to specify logCollectionProperties.
         */
        interface WithLogCollectionProperties {
            /**
             * Specifies the logCollectionProperties property: Log Collection properties of the cluster..
             * 
             * @param logCollectionProperties Log Collection properties of the cluster.
             * @return the next definition stage.
             */
            WithCreate withLogCollectionProperties(LogCollectionProperties logCollectionProperties);
        }

        /**
         * The stage of the Cluster definition allowing to specify remoteSupportProperties.
         */
        interface WithRemoteSupportProperties {
            /**
             * Specifies the remoteSupportProperties property: RemoteSupport properties of the cluster..
             * 
             * @param remoteSupportProperties RemoteSupport properties of the cluster.
             * @return the next definition stage.
             */
            WithCreate withRemoteSupportProperties(RemoteSupportProperties remoteSupportProperties);
        }

        /**
         * The stage of the Cluster definition allowing to specify desiredProperties.
         */
        interface WithDesiredProperties {
            /**
             * Specifies the desiredProperties property: Desired properties of the cluster..
             * 
             * @param desiredProperties Desired properties of the cluster.
             * @return the next definition stage.
             */
            WithCreate withDesiredProperties(ClusterDesiredProperties desiredProperties);
        }
    }

    /**
     * Begins update for the Cluster resource.
     * 
     * @return the stage of resource update.
     */
    Cluster.Update update();

    /**
     * The template for Cluster update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithType, UpdateStages.WithUserAssignedIdentities,
        UpdateStages.WithCloudManagementEndpoint, UpdateStages.WithAadClientId, UpdateStages.WithAadTenantId,
        UpdateStages.WithDesiredProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Cluster apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cluster apply(Context context);
    }

    /**
     * The Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Cluster update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Cluster update allowing to specify type.
         */
        interface WithType {
            /**
             * Specifies the type property: Type of managed service identity (where both SystemAssigned and UserAssigned
             * types are allowed)..
             * 
             * @param type Type of managed service identity (where both SystemAssigned and UserAssigned types are
             * allowed).
             * @return the next definition stage.
             */
            Update withType(ManagedServiceIdentityType type);
        }

        /**
         * The stage of the Cluster update allowing to specify userAssignedIdentities.
         */
        interface WithUserAssignedIdentities {
            /**
             * Specifies the userAssignedIdentities property: The set of user assigned identities associated with the
             * resource. The userAssignedIdentities dictionary keys will be ARM resource ids in the form:
             * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
             * The dictionary values can be empty objects ({}) in requests..
             * 
             * @param userAssignedIdentities The set of user assigned identities associated with the resource. The
             * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
             * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
             * The dictionary values can be empty objects ({}) in requests.
             * @return the next definition stage.
             */
            Update withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities);
        }

        /**
         * The stage of the Cluster update allowing to specify cloudManagementEndpoint.
         */
        interface WithCloudManagementEndpoint {
            /**
             * Specifies the cloudManagementEndpoint property: Endpoint configured for management from the Azure portal.
             * 
             * @param cloudManagementEndpoint Endpoint configured for management from the Azure portal.
             * @return the next definition stage.
             */
            Update withCloudManagementEndpoint(String cloudManagementEndpoint);
        }

        /**
         * The stage of the Cluster update allowing to specify aadClientId.
         */
        interface WithAadClientId {
            /**
             * Specifies the aadClientId property: App id of cluster AAD identity..
             * 
             * @param aadClientId App id of cluster AAD identity.
             * @return the next definition stage.
             */
            Update withAadClientId(String aadClientId);
        }

        /**
         * The stage of the Cluster update allowing to specify aadTenantId.
         */
        interface WithAadTenantId {
            /**
             * Specifies the aadTenantId property: Tenant id of cluster AAD identity..
             * 
             * @param aadTenantId Tenant id of cluster AAD identity.
             * @return the next definition stage.
             */
            Update withAadTenantId(String aadTenantId);
        }

        /**
         * The stage of the Cluster update allowing to specify desiredProperties.
         */
        interface WithDesiredProperties {
            /**
             * Specifies the desiredProperties property: Desired properties of the cluster..
             * 
             * @param desiredProperties Desired properties of the cluster.
             * @return the next definition stage.
             */
            Update withDesiredProperties(ClusterDesiredProperties desiredProperties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Cluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cluster refresh(Context context);

    /**
     * Upload certificate.
     * 
     * @param uploadCertificateRequest Upload certificate request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void uploadCertificate(UploadCertificateRequest uploadCertificateRequest);

    /**
     * Upload certificate.
     * 
     * @param uploadCertificateRequest Upload certificate request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void uploadCertificate(UploadCertificateRequest uploadCertificateRequest, Context context);

    /**
     * Create cluster identity.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster Identity details.
     */
    ClusterIdentityResponse createIdentity();

    /**
     * Create cluster identity.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster Identity details.
     */
    ClusterIdentityResponse createIdentity(Context context);

    /**
     * Extends Software Assurance Benefit to a cluster.
     * 
     * @param softwareAssuranceChangeRequest Software Assurance Change Request Payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    Cluster extendSoftwareAssuranceBenefit(SoftwareAssuranceChangeRequest softwareAssuranceChangeRequest);

    /**
     * Extends Software Assurance Benefit to a cluster.
     * 
     * @param softwareAssuranceChangeRequest Software Assurance Change Request Payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    Cluster extendSoftwareAssuranceBenefit(SoftwareAssuranceChangeRequest softwareAssuranceChangeRequest,
        Context context);

    /**
     * Trigger Log Collection on a cluster.
     * 
     * @param logCollectionRequest Trigger Log Collection Request Payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    Cluster triggerLogCollection(LogCollectionRequest logCollectionRequest);

    /**
     * Trigger Log Collection on a cluster.
     * 
     * @param logCollectionRequest Trigger Log Collection Request Payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    Cluster triggerLogCollection(LogCollectionRequest logCollectionRequest, Context context);

    /**
     * Configure RemoteSupport on a cluster.
     * 
     * @param remoteSupportRequest Configure Remote Support Request Payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    Cluster configureRemoteSupport(RemoteSupportRequest remoteSupportRequest);

    /**
     * Configure RemoteSupport on a cluster.
     * 
     * @param remoteSupportRequest Configure Remote Support Request Payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster details.
     */
    Cluster configureRemoteSupport(RemoteSupportRequest remoteSupportRequest, Context context);
}
