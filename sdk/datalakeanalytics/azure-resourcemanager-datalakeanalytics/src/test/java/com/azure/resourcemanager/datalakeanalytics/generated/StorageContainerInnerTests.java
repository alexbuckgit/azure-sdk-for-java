// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.StorageContainerInner;
import org.junit.jupiter.api.Assertions;

public final class StorageContainerInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageContainerInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"lastModifiedTime\":\"2021-03-24T05:50:38Z\"},\"name\":\"ncwscwsvlxoto\",\"type\":\"wrupqsxvnmicykvc\",\"id\":\"vei\"}")
                .toObject(StorageContainerInner.class);
        Assertions.assertEquals("vei", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageContainerInner model = new StorageContainerInner().withId("vei");
        model = BinaryData.fromObject(model).toObject(StorageContainerInner.class);
        Assertions.assertEquals("vei", model.id());
    }
}