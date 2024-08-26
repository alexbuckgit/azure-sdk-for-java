// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.LogCollectionRequest;
import com.azure.resourcemanager.azurestackhci.models.LogCollectionRequestProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class LogCollectionRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogCollectionRequest model = BinaryData
            .fromString("{\"properties\":{\"fromDate\":\"2021-03-03T22:53:05Z\",\"toDate\":\"2021-07-20T02:15:21Z\"}}")
            .toObject(LogCollectionRequest.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T22:53:05Z"), model.properties().fromDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-20T02:15:21Z"), model.properties().toDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogCollectionRequest model = new LogCollectionRequest().withProperties(
            new LogCollectionRequestProperties().withFromDate(OffsetDateTime.parse("2021-03-03T22:53:05Z"))
                .withToDate(OffsetDateTime.parse("2021-07-20T02:15:21Z")));
        model = BinaryData.fromObject(model).toObject(LogCollectionRequest.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T22:53:05Z"), model.properties().fromDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-20T02:15:21Z"), model.properties().toDate());
    }
}
