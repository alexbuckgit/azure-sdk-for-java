// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HttpReadSettings;

public final class HttpReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpReadSettings model = BinaryData.fromString(
            "{\"type\":\"cnkgius\",\"requestMethod\":\"datamxgglkqitpbyne\",\"requestBody\":\"dataxux\",\"additionalHeaders\":\"dataoclef\",\"requestTimeout\":\"dataggglzsbou\",\"additionalColumns\":\"datan\",\"maxConcurrentConnections\":\"dataswcpspaoxig\",\"disableMetricsCollection\":\"datai\",\"\":{\"yn\":\"datapgpqsmglutn\",\"xbgfwwcfwlwnj\":\"datalxxnbogxkidb\"}}")
            .toObject(HttpReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpReadSettings model = new HttpReadSettings().withMaxConcurrentConnections("dataswcpspaoxig")
            .withDisableMetricsCollection("datai")
            .withRequestMethod("datamxgglkqitpbyne")
            .withRequestBody("dataxux")
            .withAdditionalHeaders("dataoclef")
            .withRequestTimeout("dataggglzsbou")
            .withAdditionalColumns("datan");
        model = BinaryData.fromObject(model).toObject(HttpReadSettings.class);
    }
}
