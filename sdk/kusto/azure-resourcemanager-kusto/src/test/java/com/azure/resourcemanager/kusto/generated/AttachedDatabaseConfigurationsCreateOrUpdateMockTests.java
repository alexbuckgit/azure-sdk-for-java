// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.AttachedDatabaseConfiguration;
import com.azure.resourcemanager.kusto.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.kusto.models.TableLevelSharingProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AttachedDatabaseConfigurationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"gc\",\"properties\":{\"provisioningState\":\"Succeeded\",\"databaseName\":\"nwm\",\"clusterResourceId\":\"tmvpdvjdhtt\",\"attachedDatabaseNames\":[\"fedxihchrphkm\",\"rjdqnsdfzp\",\"gtgkylkdghr\",\"euutlwxezwzh\"],\"defaultPrincipalsModificationKind\":\"None\",\"tableLevelSharingProperties\":{\"tablesToInclude\":[],\"tablesToExclude\":[],\"externalTablesToInclude\":[],\"externalTablesToExclude\":[],\"materializedViewsToInclude\":[],\"materializedViewsToExclude\":[],\"functionsToInclude\":[],\"functionsToExclude\":[]},\"databaseNameOverride\":\"ehgpp\",\"databaseNamePrefix\":\"ifhpf\"},\"id\":\"oajvgcxtxjcs\",\"name\":\"eafidltugsresm\",\"type\":\"ssjhoiftxfkf\"}";

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

        KustoManager manager =
            KustoManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AttachedDatabaseConfiguration response =
            manager
                .attachedDatabaseConfigurations()
                .define("dfgsftufqobrj")
                .withExistingCluster("kdlpa", "zrcxfailcfxwmdbo")
                .withRegion("acgcckknhx")
                .withDatabaseName("ytnrzvuljraae")
                .withClusterResourceId("anokqgu")
                .withDefaultPrincipalsModificationKind(DefaultPrincipalsModificationKind.UNION)
                .withTableLevelSharingProperties(
                    new TableLevelSharingProperties()
                        .withTablesToInclude(Arrays.asList())
                        .withTablesToExclude(Arrays.asList())
                        .withExternalTablesToInclude(Arrays.asList())
                        .withExternalTablesToExclude(Arrays.asList())
                        .withMaterializedViewsToInclude(Arrays.asList())
                        .withMaterializedViewsToExclude(Arrays.asList())
                        .withFunctionsToInclude(Arrays.asList())
                        .withFunctionsToExclude(Arrays.asList()))
                .withDatabaseNameOverride("sdosfjbjsvgjr")
                .withDatabaseNamePrefix("r")
                .create();

        Assertions.assertEquals("gc", response.location());
        Assertions.assertEquals("nwm", response.databaseName());
        Assertions.assertEquals("tmvpdvjdhtt", response.clusterResourceId());
        Assertions.assertEquals(DefaultPrincipalsModificationKind.NONE, response.defaultPrincipalsModificationKind());
        Assertions.assertEquals("ehgpp", response.databaseNameOverride());
        Assertions.assertEquals("ifhpf", response.databaseNamePrefix());
    }
}