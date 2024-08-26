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
import com.azure.resourcemanager.azurestackhci.models.ArcSetting;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ArcSettingsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Creating\",\"arcInstanceResourceGroup\":\"t\",\"arcApplicationClientId\":\"ikizbcu\",\"arcApplicationTenantId\":\"bvntnrgmqsorhce\",\"arcServicePrincipalObjectId\":\"gnlykm\",\"arcApplicationObjectId\":\"pwzvmdoksqdti\",\"aggregateState\":\"DisableInProgress\",\"perNodeDetails\":[{\"name\":\"oncqbazqicqch\",\"arcInstance\":\"tvx\",\"arcNodeServicePrincipalObjectId\":\"janepubdpkx\",\"state\":\"PartiallySucceeded\"},{\"name\":\"xiaodet\",\"arcInstance\":\"hkxdxuwsaifmc\",\"arcNodeServicePrincipalObjectId\":\"osbz\",\"state\":\"Succeeded\"},{\"name\":\"cvk\",\"arcInstance\":\"knjolgjyyxpve\",\"arcNodeServicePrincipalObjectId\":\"zerqzevxoqei\",\"state\":\"Connected\"},{\"name\":\"aljglzobl\",\"arcInstance\":\"aafrqulhmzyqbhd\",\"arcNodeServicePrincipalObjectId\":\"fjrqpjiyr\",\"state\":\"Deleted\"}],\"connectivityProperties\":\"datagaxwmzwdfkbnrzo\",\"defaultExtensions\":[{\"category\":\"tbqctqjfgx\",\"consentTime\":\"2021-01-03T19:23:32Z\"}]},\"id\":\"tgzdgv\",\"name\":\"yig\",\"type\":\"aqqilzdcduwjoed\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureStackHciManager manager = AzureStackHciManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ArcSetting response = manager.arcSettings()
            .getWithResponse("jomevtfycnlb", "gjco", "kk", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("t", response.arcInstanceResourceGroup());
        Assertions.assertEquals("ikizbcu", response.arcApplicationClientId());
        Assertions.assertEquals("bvntnrgmqsorhce", response.arcApplicationTenantId());
        Assertions.assertEquals("gnlykm", response.arcServicePrincipalObjectId());
        Assertions.assertEquals("pwzvmdoksqdti", response.arcApplicationObjectId());
    }
}
