// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.azurestackhci.AzureStackHciManager;
import com.azure.resourcemanager.azurestackhci.models.Cluster;
import com.azure.resourcemanager.azurestackhci.models.DiagnosticLevel;
import com.azure.resourcemanager.azurestackhci.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.azurestackhci.models.SoftwareAssuranceChangeRequest;
import com.azure.resourcemanager.azurestackhci.models.SoftwareAssuranceChangeRequestProperties;
import com.azure.resourcemanager.azurestackhci.models.SoftwareAssuranceIntent;
import com.azure.resourcemanager.azurestackhci.models.WindowsServerSubscription;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ClustersExtendSoftwareAssuranceBenefitMockTests {
    @Test
    public void testExtendSoftwareAssuranceBenefit() throws Exception {
        String responseStr
            = "{\"identity\":{\"principalId\":\"a1c0d1b5-155b-47db-8881-25e30ad3f49f\",\"tenantId\":\"95bad002-bc63-47a0-a9a6-9cc1b847edc9\",\"type\":\"None\",\"userAssignedIdentities\":{\"tmk\":{\"principalId\":\"f131e288-9ee8-45ea-a8dd-257b689bcc22\",\"clientId\":\"77ff6a15-2c07-43e8-bb08-06b9da4ac95e\"}}},\"properties\":{\"provisioningState\":\"Succeeded\",\"status\":\"DeploymentInProgress\",\"connectivityStatus\":\"NotYetRegistered\",\"cloudId\":\"xofqovchi\",\"cloudManagementEndpoint\":\"p\",\"aadClientId\":\"fidusztekxbyjgm\",\"aadTenantId\":\"e\",\"aadApplicationObjectId\":\"yihpqadagrh\",\"aadServicePrincipalObjectId\":\"icxdwyjfo\",\"softwareAssuranceProperties\":{\"softwareAssuranceStatus\":\"Disabled\",\"softwareAssuranceIntent\":\"Disable\",\"lastUpdated\":\"2021-08-25T11:50:02Z\"},\"logCollectionProperties\":{\"fromDate\":\"2021-04-13T00:22:08Z\",\"toDate\":\"2021-08-21T21:09:47Z\",\"lastLogGenerated\":\"2021-11-22T15:26:05Z\",\"logCollectionSessionDetails\":[{\"logStartTime\":\"2021-07-09T20:14:47Z\",\"logEndTime\":\"2021-05-21T15:56:42Z\",\"timeCollected\":\"2021-05-26T18:15:22Z\",\"logSize\":4267812501058114274,\"logCollectionStatus\":\"Failed\",\"logCollectionJobType\":\"OnDemand\",\"correlationId\":\"lscrdpibfdyjduss\",\"endTimeCollected\":\"2021-06-08T13:08:24Z\",\"logCollectionError\":{}},{\"logStartTime\":\"2021-09-05T00:37:54Z\",\"logEndTime\":\"2021-06-13T22:26:49Z\",\"timeCollected\":\"2021-11-26T05:02:46Z\",\"logSize\":7353880373342288472,\"logCollectionStatus\":\"InProgress\",\"logCollectionJobType\":\"Scheduled\",\"correlationId\":\"hbfrnuybfflj\",\"endTimeCollected\":\"2021-06-08T15:40:26Z\",\"logCollectionError\":{}}]},\"remoteSupportProperties\":{\"accessLevel\":\"Diagnostics\",\"expirationTimeStamp\":\"2021-08-11T06:24:02Z\",\"remoteSupportType\":\"Revoke\",\"remoteSupportNodeSettings\":[{\"arcResourceId\":\"dusr\",\"state\":\"xfavsqwudoh\",\"createdAt\":\"2021-05-08T17:26:42Z\",\"updatedAt\":\"2021-11-14T01:49:53Z\",\"connectionStatus\":\"l\",\"connectionErrorMessage\":\"psimsf\",\"transcriptLocation\":\"pofqpmbhy\"},{\"arcResourceId\":\"sdrmmttjxophgerh\",\"state\":\"vgohtw\",\"createdAt\":\"2021-11-04T11:49:52Z\",\"updatedAt\":\"2020-12-30T16:03:16Z\",\"connectionStatus\":\"ixysf\",\"connectionErrorMessage\":\"msqywwwmhkruwae\",\"transcriptLocation\":\"ympmlqoin\"},{\"arcResourceId\":\"duewihapfj\",\"state\":\"knjdiqfliejhp\",\"createdAt\":\"2021-08-22T05:16:33Z\",\"updatedAt\":\"2021-08-23T08:00:50Z\",\"connectionStatus\":\"fsbw\",\"connectionErrorMessage\":\"ivbvzi\",\"transcriptLocation\":\"wxgoooxzpra\"}],\"remoteSupportSessionDetails\":[{\"sessionStartTime\":\"2020-12-20T08:32:34Z\",\"sessionEndTime\":\"2021-05-19T19:16:08Z\",\"nodeName\":\"dgzigjsugswhgs\",\"duration\":5564706572038132947,\"accessLevel\":\"Diagnostics\"}]},\"desiredProperties\":{\"windowsServerSubscription\":\"Disabled\",\"diagnosticLevel\":\"Basic\"},\"reportedProperties\":{\"clusterName\":\"ohzha\",\"clusterId\":\"v\",\"clusterVersion\":\"xbg\",\"nodes\":[{\"name\":\"rvqchoadhrsxqvzv\",\"id\":29.559118,\"windowsServerSubscription\":\"Disabled\",\"nodeType\":\"FirstParty\",\"ehcResourceId\":\"fajglzrsubklrxhj\",\"manufacturer\":\"tcetjdv\",\"model\":\"dieq\",\"osName\":\"wa\",\"osVersion\":\"wdxvqzxoebwg\",\"osDisplayVersion\":\"bibanbau\",\"serialNumber\":\"tzvp\",\"coreCount\":51.154564,\"memoryInGiB\":78.0847,\"lastLicensingTimestamp\":\"2021-07-29T22:27:22Z\",\"oemActivation\":\"Disabled\"}],\"lastUpdated\":\"2021-11-26T19:20:25Z\",\"imdsAttestation\":\"Disabled\",\"diagnosticLevel\":\"Enhanced\",\"supportedCapabilities\":[\"anbtttkgsu\"],\"clusterType\":\"ThirdParty\",\"manufacturer\":\"swgkpjhboyikebh\",\"oemActivation\":\"Disabled\"},\"isolatedVmAttestationConfiguration\":{\"attestationResourceId\":\"gwl\",\"relyingPartyServiceEndpoint\":\"hueoijyzcqyp\",\"attestationServiceEndpoint\":\"zufgs\"},\"trialDaysRemaining\":9.9179325,\"billingModel\":\"y\",\"registrationTimestamp\":\"2021-01-25T09:28:03Z\",\"lastSyncTimestamp\":\"2021-01-28T19:23:55Z\",\"lastBillingTimestamp\":\"2020-12-26T21:13:09Z\",\"serviceEndpoint\":\"pqa\",\"resourceProviderObjectId\":\"mkncfgybmxsnxo\"},\"location\":\"ullojk\",\"tags\":{\"wdjuxdbdljzgdy\":\"hg\",\"sgzlrqhb\":\"cvuq\"},\"id\":\"nq\",\"name\":\"gdxwbsfpyxx\",\"type\":\"jlf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureStackHciManager manager = AzureStackHciManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Cluster response
            = manager.clusters()
                .extendSoftwareAssuranceBenefit("toyrplixlajml", "pq",
                    new SoftwareAssuranceChangeRequest().withProperties(new SoftwareAssuranceChangeRequestProperties()
                        .withSoftwareAssuranceIntent(SoftwareAssuranceIntent.DISABLE)),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ullojk", response.location());
        Assertions.assertEquals("hg", response.tags().get("wdjuxdbdljzgdy"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, response.typeIdentityType());
        Assertions.assertEquals("p", response.cloudManagementEndpoint());
        Assertions.assertEquals("fidusztekxbyjgm", response.aadClientId());
        Assertions.assertEquals("e", response.aadTenantId());
        Assertions.assertEquals("yihpqadagrh", response.aadApplicationObjectId());
        Assertions.assertEquals("icxdwyjfo", response.aadServicePrincipalObjectId());
        Assertions.assertEquals(SoftwareAssuranceIntent.DISABLE,
            response.softwareAssuranceProperties().softwareAssuranceIntent());
        Assertions.assertEquals(WindowsServerSubscription.DISABLED,
            response.desiredProperties().windowsServerSubscription());
        Assertions.assertEquals(DiagnosticLevel.BASIC, response.desiredProperties().diagnosticLevel());
    }
}
