// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourceDetailsObjectProperties;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourceStatus;
import org.junit.jupiter.api.Assertions;

public final class ResourceDetailsObjectPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceDetailsObjectProperties model = BinaryData
            .fromString("{\"status\":\"Leased\",\"image\":\"zcdrqjsdpydnfyhx\",\"imageVersion\":\"eoejzic\"}")
            .toObject(ResourceDetailsObjectProperties.class);
        Assertions.assertEquals(ResourceStatus.LEASED, model.status());
        Assertions.assertEquals("zcdrqjsdpydnfyhx", model.image());
        Assertions.assertEquals("eoejzic", model.imageVersion());
    }
}
