// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.CapacityReservationLevel;
import com.azure.resourcemanager.loganalytics.models.IdentityType;
import com.azure.resourcemanager.loganalytics.models.PublicNetworkAccessType;
import com.azure.resourcemanager.loganalytics.models.Workspace;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSkuNameEnum;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkspacesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"customerId\":\"urjtumghi\",\"sku\":{\"name\":\"Free\",\"capacityReservationLevel\":5000,\"lastSkuUpdate\":\"slclblyjxltbsju\"},\"retentionInDays\":2065272697,\"workspaceCapping\":{\"dailyQuotaGb\":24.84942054557402,\"quotaNextResetTime\":\"ctmgxuupbezqccy\",\"dataIngestionStatus\":\"ApproachingQuota\"},\"createdDate\":\"eukdqkkyih\",\"modifiedDate\":\"geqmgqzgwldoych\",\"publicNetworkAccessForIngestion\":\"Enabled\",\"publicNetworkAccessForQuery\":\"Enabled\",\"forceCmkForQuery\":true,\"privateLinkScopedResources\":[{\"resourceId\":\"waoaguhi\",\"scopeId\":\"llizs\"},{\"resourceId\":\"csjvhrwef\",\"scopeId\":\"wqejpmvsse\"},{\"resourceId\":\"epwamcxtcz\",\"scopeId\":\"peuknijd\"}],\"features\":{\"enableDataExport\":false,\"immediatePurgeDataOn30Days\":false,\"enableLogAccessUsingOnlyResourcePermissions\":false,\"clusterResourceId\":\"fbocyvhh\",\"disableLocalAuth\":false,\"\":{\"akuflgbhgauacdix\":\"datawikdmh\",\"nozoeoq\":\"dataxufrsryjqgdk\"}},\"defaultDataCollectionRuleResourceId\":\"jhvefgwbmqjchnt\"},\"identity\":{\"principalId\":\"ay\",\"tenantId\":\"b\",\"type\":\"application\",\"userAssignedIdentities\":{\"hxsgxj\":{\"principalId\":\"albmqkyojwyvfk\",\"clientId\":\"tsu\"},\"jrmmuabwib\":{\"principalId\":\"mzrrscubiwsdrn\",\"clientId\":\"qwodiffjx\"},\"fvfkak\":{\"principalId\":\"ogjo\",\"clientId\":\"cyefoyzbamwine\"}}},\"systemData\":{\"createdBy\":\"dt\",\"createdByType\":\"ManagedIdentity\",\"createdAt\":\"2021-01-09T05:30:45Z\",\"lastModifiedBy\":\"lz\",\"lastModifiedByType\":\"Application\",\"lastModifiedAt\":\"2021-07-23T01:20:06Z\"},\"etag\":\"uxgvttxpnr\",\"location\":\"pzaamrdixtreki\",\"tags\":{\"l\":\"yskbruff\",\"hrpqhv\":\"ukkutvl\",\"yr\":\"blcouqehbhbcdszi\"},\"id\":\"ndo\",\"name\":\"pmbltoormkfql\",\"type\":\"xldykalsygaolnjp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        LogAnalyticsManager manager =
            LogAnalyticsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Workspace response =
            manager
                .workspaces()
                .getByResourceGroupWithResponse(
                    "tnjuhpsprkzyaupi", "ccxnafbwqroohtuo", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("pzaamrdixtreki", response.location());
        Assertions.assertEquals("yskbruff", response.tags().get("l"));
        Assertions.assertEquals(IdentityType.APPLICATION, response.identity().type());
        Assertions.assertEquals("uxgvttxpnr", response.etag());
        Assertions.assertEquals(WorkspaceSkuNameEnum.FREE, response.sku().name());
        Assertions
            .assertEquals(CapacityReservationLevel.FIVE_ZERO_ZERO_ZERO, response.sku().capacityReservationLevel());
        Assertions.assertEquals(2065272697, response.retentionInDays());
        Assertions.assertEquals(24.84942054557402D, response.workspaceCapping().dailyQuotaGb());
        Assertions.assertEquals(PublicNetworkAccessType.ENABLED, response.publicNetworkAccessForIngestion());
        Assertions.assertEquals(PublicNetworkAccessType.ENABLED, response.publicNetworkAccessForQuery());
        Assertions.assertEquals(true, response.forceCmkForQuery());
        Assertions.assertEquals(false, response.features().enableDataExport());
        Assertions.assertEquals(false, response.features().immediatePurgeDataOn30Days());
        Assertions.assertEquals(false, response.features().enableLogAccessUsingOnlyResourcePermissions());
        Assertions.assertEquals("fbocyvhh", response.features().clusterResourceId());
        Assertions.assertEquals(false, response.features().disableLocalAuth());
        Assertions.assertEquals("jhvefgwbmqjchnt", response.defaultDataCollectionRuleResourceId());
    }
}
