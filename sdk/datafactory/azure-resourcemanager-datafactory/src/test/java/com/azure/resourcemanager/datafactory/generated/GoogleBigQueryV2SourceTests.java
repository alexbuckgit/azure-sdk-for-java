// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GoogleBigQueryV2Source;

public final class GoogleBigQueryV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GoogleBigQueryV2Source model = BinaryData.fromString(
            "{\"type\":\"yfubgnm\",\"query\":\"dataarxtd\",\"queryTimeout\":\"datazsdnfp\",\"additionalColumns\":\"datayksu\",\"sourceRetryCount\":\"datajdaxiohulvp\",\"sourceRetryWait\":\"datavcutwngfdsztmqqu\",\"maxConcurrentConnections\":\"dataokpfyojfwvmsf\",\"disableMetricsCollection\":\"datayxt\",\"\":{\"gsa\":\"dataqqzhqgmoexgny\",\"y\":\"datagheicexdxhxpqkcs\"}}")
            .toObject(GoogleBigQueryV2Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GoogleBigQueryV2Source model = new GoogleBigQueryV2Source().withSourceRetryCount("datajdaxiohulvp")
            .withSourceRetryWait("datavcutwngfdsztmqqu")
            .withMaxConcurrentConnections("dataokpfyojfwvmsf")
            .withDisableMetricsCollection("datayxt")
            .withQueryTimeout("datazsdnfp")
            .withAdditionalColumns("datayksu")
            .withQuery("dataarxtd");
        model = BinaryData.fromObject(model).toObject(GoogleBigQueryV2Source.class);
    }
}
