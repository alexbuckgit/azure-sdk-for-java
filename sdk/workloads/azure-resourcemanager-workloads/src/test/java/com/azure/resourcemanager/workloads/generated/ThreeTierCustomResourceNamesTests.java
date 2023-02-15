// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.ThreeTierCustomResourceNames;

public final class ThreeTierCustomResourceNamesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreeTierCustomResourceNames model =
            BinaryData
                .fromString("{\"namingPatternType\":\"ThreeTierCustomResourceNames\"}")
                .toObject(ThreeTierCustomResourceNames.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreeTierCustomResourceNames model = new ThreeTierCustomResourceNames();
        model = BinaryData.fromObject(model).toObject(ThreeTierCustomResourceNames.class);
    }
}