// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.StorageAppliancePatchProperties;
import org.junit.jupiter.api.Assertions;

public final class StorageAppliancePatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageAppliancePatchProperties model =
            BinaryData.fromString("{\"serialNumber\":\"esfuught\"}").toObject(StorageAppliancePatchProperties.class);
        Assertions.assertEquals("esfuught", model.serialNumber());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageAppliancePatchProperties model = new StorageAppliancePatchProperties().withSerialNumber("esfuught");
        model = BinaryData.fromObject(model).toObject(StorageAppliancePatchProperties.class);
        Assertions.assertEquals("esfuught", model.serialNumber());
    }
}
