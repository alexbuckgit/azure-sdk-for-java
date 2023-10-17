// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationGroupPatchProperties;
import org.junit.jupiter.api.Assertions;

public final class ApplicationGroupPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationGroupPatchProperties model =
            BinaryData
                .fromString("{\"description\":\"hjpglkf\",\"friendlyName\":\"hdneuelfph\",\"showInFeed\":true}")
                .toObject(ApplicationGroupPatchProperties.class);
        Assertions.assertEquals("hjpglkf", model.description());
        Assertions.assertEquals("hdneuelfph", model.friendlyName());
        Assertions.assertEquals(true, model.showInFeed());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationGroupPatchProperties model =
            new ApplicationGroupPatchProperties()
                .withDescription("hjpglkf")
                .withFriendlyName("hdneuelfph")
                .withShowInFeed(true);
        model = BinaryData.fromObject(model).toObject(ApplicationGroupPatchProperties.class);
        Assertions.assertEquals("hjpglkf", model.description());
        Assertions.assertEquals("hdneuelfph", model.friendlyName());
        Assertions.assertEquals(true, model.showInFeed());
    }
}
