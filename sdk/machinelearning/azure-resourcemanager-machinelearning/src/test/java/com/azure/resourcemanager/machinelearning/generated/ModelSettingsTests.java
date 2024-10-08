// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ModelSettings;
import org.junit.jupiter.api.Assertions;

public final class ModelSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ModelSettings model = BinaryData.fromString("{\"modelId\":\"okatu\"}").toObject(ModelSettings.class);
        Assertions.assertEquals("okatu", model.modelId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ModelSettings model = new ModelSettings().withModelId("okatu");
        model = BinaryData.fromObject(model).toObject(ModelSettings.class);
        Assertions.assertEquals("okatu", model.modelId());
    }
}
