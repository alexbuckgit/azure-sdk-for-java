// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.models.AclAction;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentityType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WebPubSubsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"bjhwuaan\",\"tier\":\"Free\",\"size\":\"sphyoulpjrvxa\",\"family\":\"rvimjwosytxitcsk\",\"capacity\":212130052},\"properties\":{\"provisioningState\":\"Succeeded\",\"externalIP\":\"iekkezz\",\"hostName\":\"hlyfjhdgqgg\",\"publicPort\":1278183507,\"serverPort\":1059730193,\"version\":\"g\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"tls\":{\"clientCertEnabled\":true},\"hostNamePrefix\":\"t\",\"liveTraceConfiguration\":{\"enabled\":\"lr\",\"categories\":[]},\"resourceLogConfiguration\":{\"categories\":[]},\"networkACLs\":{\"defaultAction\":\"Allow\",\"privateEndpoints\":[]},\"publicNetworkAccess\":\"varmywdmj\",\"disableLocalAuth\":false,\"disableAadAuth\":true},\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{},\"principalId\":\"wlycoduhpkxkg\",\"tenantId\":\"areqna\"},\"location\":\"qugjhkycube\",\"tags\":{\"krmnjijpxacqqud\":\"ssofwqmzqa\",\"yffimrzrtuzqogs\":\"nbyxbaaabjyv\"},\"id\":\"xnevfdnwn\",\"name\":\"mewzsyyc\",\"type\":\"uzsoi\"}]}";

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

        WebPubSubManager manager =
            WebPubSubManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WebPubSubResource> response = manager.webPubSubs().listByResourceGroup("fatkld", Context.NONE);

        Assertions.assertEquals("qugjhkycube", response.iterator().next().location());
        Assertions.assertEquals("ssofwqmzqa", response.iterator().next().tags().get("krmnjijpxacqqud"));
        Assertions.assertEquals("bjhwuaan", response.iterator().next().sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.FREE, response.iterator().next().sku().tier());
        Assertions.assertEquals(212130052, response.iterator().next().sku().capacity());
        Assertions.assertEquals(ManagedIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals(true, response.iterator().next().tls().clientCertEnabled());
        Assertions.assertEquals("lr", response.iterator().next().liveTraceConfiguration().enabled());
        Assertions.assertEquals(AclAction.ALLOW, response.iterator().next().networkACLs().defaultAction());
        Assertions.assertEquals("varmywdmj", response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals(false, response.iterator().next().disableLocalAuth());
        Assertions.assertEquals(true, response.iterator().next().disableAadAuth());
    }
}
