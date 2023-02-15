// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.SparkConfigurationResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SparkConfigurationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"description\":\"vavucg\",\"configs\":{\"qpmnu\":\"ua\",\"wuzdmh\":\"zhrchx\"},\"annotations\":[\"vivjm\",\"mlitqdsj\"],\"notes\":\"dvisco\",\"createdBy\":\"xbriifefn\",\"created\":\"2021-04-05T15:00:08Z\",\"configMergeRule\":{\"eailwdqmqf\":\"qoemwsi\",\"kd\":\"deotmfx\",\"gnamkuuyiu\":\"g\",\"hdcfm\":\"uafixlxicwgp\"}},\"etag\":\"cfasfodropal\",\"id\":\"ngtwyuskwgq\",\"name\":\"ntaumd\",\"type\":\"cjlvkrkegtyc\"}";

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

        SynapseManager manager =
            SynapseManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SparkConfigurationResource response =
            manager
                .sparkConfigurations()
                .getWithResponse("tonvhgnhtmeplhb", "jba", "mumm", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("vavucg", response.description());
        Assertions.assertEquals("ua", response.configs().get("qpmnu"));
        Assertions.assertEquals("vivjm", response.annotations().get(0));
        Assertions.assertEquals("dvisco", response.notes());
        Assertions.assertEquals("xbriifefn", response.createdBy());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-05T15:00:08Z"), response.created());
        Assertions.assertEquals("qoemwsi", response.configMergeRule().get("eailwdqmqf"));
    }
}