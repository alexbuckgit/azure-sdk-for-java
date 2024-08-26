// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.UpdatePrerequisite;
import org.junit.jupiter.api.Assertions;

public final class UpdatePrerequisiteTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdatePrerequisite model
            = BinaryData.fromString("{\"updateType\":\"wvnph\",\"version\":\"zqtpjhmq\",\"packageName\":\"v\"}")
                .toObject(UpdatePrerequisite.class);
        Assertions.assertEquals("wvnph", model.updateType());
        Assertions.assertEquals("zqtpjhmq", model.version());
        Assertions.assertEquals("v", model.packageName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdatePrerequisite model
            = new UpdatePrerequisite().withUpdateType("wvnph").withVersion("zqtpjhmq").withPackageName("v");
        model = BinaryData.fromObject(model).toObject(UpdatePrerequisite.class);
        Assertions.assertEquals("wvnph", model.updateType());
        Assertions.assertEquals("zqtpjhmq", model.version());
        Assertions.assertEquals("v", model.packageName());
    }
}
