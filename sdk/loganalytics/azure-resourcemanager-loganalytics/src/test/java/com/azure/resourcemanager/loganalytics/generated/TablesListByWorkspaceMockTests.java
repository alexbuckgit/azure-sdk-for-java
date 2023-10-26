// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.ColumnDataTypeHintEnum;
import com.azure.resourcemanager.loganalytics.models.ColumnTypeEnum;
import com.azure.resourcemanager.loganalytics.models.Table;
import com.azure.resourcemanager.loganalytics.models.TablePlanEnum;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class TablesListByWorkspaceMockTests {
    @Test
    public void testListByWorkspace() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"retentionInDays\":1168808481,\"totalRetentionInDays\":248802373,\"archiveRetentionInDays\":564672857,\"searchResults\":{\"query\":\"buhzacaq\",\"description\":\"ltcoqc\",\"limit\":1004609054,\"startSearchTime\":\"2021-06-10T09:18:11Z\",\"endSearchTime\":\"2021-04-18T12:03:07Z\",\"sourceTable\":\"kuejk\",\"azureAsyncOperationId\":\"bizt\"},\"restoredLogs\":{\"startRestoreTime\":\"2021-09-28T22:56:41Z\",\"endRestoreTime\":\"2021-06-13T10:08:38Z\",\"sourceTable\":\"vjufycsjmlbe\",\"azureAsyncOperationId\":\"ej\"},\"resultStatistics\":{\"progress\":97.11777,\"ingestedRecords\":859653726,\"scannedGb\":22.48292},\"plan\":\"Analytics\",\"lastPlanModifiedDate\":\"tudaw\",\"schema\":{\"name\":\"felqerpptc\",\"displayName\":\"qnzmnhiil\",\"description\":\"lwcjgckbbcccgzpr\",\"columns\":[{\"name\":\"yuffatsgf\",\"type\":\"string\",\"dataTypeHint\":\"uri\",\"displayName\":\"byubhiqdxyurnpn\",\"description\":\"zafccnuhiigb\",\"isDefaultDisplay\":false,\"isHidden\":true},{\"name\":\"vxva\",\"type\":\"real\",\"dataTypeHint\":\"guid\",\"displayName\":\"lbnb\",\"description\":\"vhcs\",\"isDefaultDisplay\":true,\"isHidden\":true},{\"name\":\"aeaovur\",\"type\":\"dateTime\",\"dataTypeHint\":\"uri\",\"displayName\":\"bdweade\",\"description\":\"mwntopagttmvmma\",\"isDefaultDisplay\":true,\"isHidden\":true},{\"name\":\"kjztjiuazjcgmxi\",\"type\":\"string\",\"dataTypeHint\":\"armPath\",\"displayName\":\"cpdltkrlg\",\"description\":\"tbdrvcqgue\",\"isDefaultDisplay\":true,\"isHidden\":false}],\"standardColumns\":[{\"name\":\"qdurelyujlfyoum\",\"type\":\"dateTime\",\"dataTypeHint\":\"ip\",\"displayName\":\"lcdi\",\"description\":\"tajbrz\",\"isDefaultDisplay\":true,\"isHidden\":true},{\"name\":\"ci\",\"type\":\"real\",\"dataTypeHint\":\"armPath\",\"displayName\":\"utgjcyz\",\"description\":\"jdnrqjbt\",\"isDefaultDisplay\":true,\"isHidden\":false},{\"name\":\"aqbzgyhfwwvuatbw\",\"type\":\"guid\",\"dataTypeHint\":\"guid\",\"displayName\":\"uliyslpkcv\",\"description\":\"f\",\"isDefaultDisplay\":false,\"isHidden\":true},{\"name\":\"myw\",\"type\":\"guid\",\"dataTypeHint\":\"uri\",\"displayName\":\"miciij\",\"description\":\"kzfbojxjmcsmyq\",\"isDefaultDisplay\":false,\"isHidden\":false}],\"categories\":[\"nkwywzwofa\",\"ickduoiqta\",\"t\"],\"labels\":[\"kn\",\"rwzawnvs\",\"cfhzagxnvhycv\",\"imwrzregzgyufu\"],\"source\":\"microsoft\",\"tableType\":\"CustomLog\",\"tableSubType\":\"Classic\",\"solutions\":[\"kzkdhmeott\",\"w\",\"yos\",\"wwhnhjtfvpn\"]},\"provisioningState\":\"Succeeded\",\"retentionInDaysAsDefault\":true,\"totalRetentionInDaysAsDefault\":false},\"systemData\":{\"createdBy\":\"ynudqllzsa\",\"createdByType\":\"Key\",\"createdAt\":\"2021-01-28T04:04:17Z\",\"lastModifiedBy\":\"eehuxiqhzlray\",\"lastModifiedByType\":\"ManagedIdentity\",\"lastModifiedAt\":\"2021-06-28T07:28:45Z\"},\"id\":\"kihmxrfdsajredn\",\"name\":\"yyshtuwgmevua\",\"type\":\"pwzyi\"}]}";

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

        PagedIterable<Table> response =
            manager.tables().listByWorkspace("wugyx", "qi", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(1168808481, response.iterator().next().retentionInDays());
        Assertions.assertEquals(248802373, response.iterator().next().totalRetentionInDays());
        Assertions.assertEquals("buhzacaq", response.iterator().next().searchResults().query());
        Assertions.assertEquals("ltcoqc", response.iterator().next().searchResults().description());
        Assertions.assertEquals(1004609054, response.iterator().next().searchResults().limit());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-10T09:18:11Z"),
                response.iterator().next().searchResults().startSearchTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-18T12:03:07Z"),
                response.iterator().next().searchResults().endSearchTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-28T22:56:41Z"),
                response.iterator().next().restoredLogs().startRestoreTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-13T10:08:38Z"),
                response.iterator().next().restoredLogs().endRestoreTime());
        Assertions.assertEquals("vjufycsjmlbe", response.iterator().next().restoredLogs().sourceTable());
        Assertions.assertEquals(TablePlanEnum.ANALYTICS, response.iterator().next().plan());
        Assertions.assertEquals("felqerpptc", response.iterator().next().schema().name());
        Assertions.assertEquals("qnzmnhiil", response.iterator().next().schema().displayName());
        Assertions.assertEquals("lwcjgckbbcccgzpr", response.iterator().next().schema().description());
        Assertions.assertEquals("yuffatsgf", response.iterator().next().schema().columns().get(0).name());
        Assertions.assertEquals(ColumnTypeEnum.STRING, response.iterator().next().schema().columns().get(0).type());
        Assertions
            .assertEquals(
                ColumnDataTypeHintEnum.URI, response.iterator().next().schema().columns().get(0).dataTypeHint());
        Assertions.assertEquals("byubhiqdxyurnpn", response.iterator().next().schema().columns().get(0).displayName());
        Assertions.assertEquals("zafccnuhiigb", response.iterator().next().schema().columns().get(0).description());
    }
}
