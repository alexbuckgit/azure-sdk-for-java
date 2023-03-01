// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;

public final class RetentionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RetentionPolicy model =
            BinaryData.fromString("{\"retentionPolicyType\":\"RetentionPolicy\"}").toObject(RetentionPolicy.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RetentionPolicy model = new RetentionPolicy();
        model = BinaryData.fromObject(model).toObject(RetentionPolicy.class);
    }
}