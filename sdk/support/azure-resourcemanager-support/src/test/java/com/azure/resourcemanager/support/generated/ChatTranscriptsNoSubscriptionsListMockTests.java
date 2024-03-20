// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.ChatTranscriptDetails;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ChatTranscriptsNoSubscriptionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"messages\":[{\"communicationDirection\":\"outbound\",\"sender\":\"irpghriypoqeyh\",\"body\":\"qhykprlpyzn\",\"createdDate\":\"2021-04-10T23:45:20Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"ex\",\"body\":\"itdfuxtyasiib\",\"createdDate\":\"2021-11-12T00:43:32Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"stgnl\",\"body\":\"hnmgixhcm\",\"createdDate\":\"2021-04-26T15:04:11Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"dorhcgyyp\",\"body\":\"otwypundmb\",\"createdDate\":\"2021-09-26T18:20:07Z\"}],\"startTime\":\"2021-05-18T07:53:38Z\"},\"id\":\"jkavl\",\"name\":\"or\",\"type\":\"mftpmdtz\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SupportManager manager = SupportManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ChatTranscriptDetails> response
            = manager.chatTranscriptsNoSubscriptions().list("aoqltfaey", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("irpghriypoqeyh", response.iterator().next().messages().get(0).sender());
        Assertions.assertEquals("qhykprlpyzn", response.iterator().next().messages().get(0).body());
    }
}
