// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnection;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointProperty;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkServiceConnectionStateProperty;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"privateEndpoint\":{\"id\":\"ugjknf\"},\"privateLinkServiceConnectionState\":{\"status\":\"fcttuxuuyilfl\",\"description\":\"oiquvrehmrnjhvs\",\"actionsRequired\":\"ztczytq\"},\"provisioningState\":\"Succeeded\",\"groupIds\":[\"unfprnjletlxs\",\"rpddouifamo\",\"aziynknlqwzdv\",\"iwhxqszdtmaajq\"]},\"id\":\"uxylrjvmtygjbm\",\"name\":\"yospspshc\",\"type\":\"fkyjpmspbpssdfpp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.privateEndpointConnections()
            .define("p")
            .withExistingPrivateLinkScope("pakdkifmjnnawt", "abpxuc")
            .withProperties(new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpointProperty().withId("wey"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionStateProperty().withStatus("dhlisngwflqqmpi")
                        .withDescription("ruwnpqxpx")))
            .create();

        Assertions.assertEquals("ugjknf", response.properties().privateEndpoint().id());
        Assertions.assertEquals("fcttuxuuyilfl", response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("oiquvrehmrnjhvs",
            response.properties().privateLinkServiceConnectionState().description());
    }
}
