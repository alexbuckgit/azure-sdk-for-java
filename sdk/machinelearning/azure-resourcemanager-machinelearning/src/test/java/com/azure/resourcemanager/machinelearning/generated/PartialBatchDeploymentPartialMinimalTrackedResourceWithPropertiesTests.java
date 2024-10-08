// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.PartialBatchDeployment;
import com.azure.resourcemanager.machinelearning.models.PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartialBatchDeploymentPartialMinimalTrackedResourceWithPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties model = BinaryData
            .fromString("{\"properties\":{\"description\":\"yxrxmunj\"},\"tags\":{\"ivbgkcv\":\"glnkvxlxpagl\"}}")
            .toObject(PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties.class);
        Assertions.assertEquals("yxrxmunj", model.properties().description());
        Assertions.assertEquals("glnkvxlxpagl", model.tags().get("ivbgkcv"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties model
            = new PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties()
                .withProperties(new PartialBatchDeployment().withDescription("yxrxmunj"))
                .withTags(mapOf("ivbgkcv", "glnkvxlxpagl"));
        model = BinaryData.fromObject(model)
            .toObject(PartialBatchDeploymentPartialMinimalTrackedResourceWithProperties.class);
        Assertions.assertEquals("yxrxmunj", model.properties().description());
        Assertions.assertEquals("glnkvxlxpagl", model.tags().get("ivbgkcv"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
