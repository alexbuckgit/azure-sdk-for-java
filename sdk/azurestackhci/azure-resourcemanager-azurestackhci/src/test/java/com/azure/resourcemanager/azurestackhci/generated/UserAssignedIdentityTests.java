// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.UserAssignedIdentity;

public final class UserAssignedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAssignedIdentity model = BinaryData.fromString(
            "{\"principalId\":\"7072640a-2e6c-4cbc-8a6f-cd0382bd7ee1\",\"clientId\":\"9ba6fe17-b9ab-4adb-8d77-54bf995c2ddc\"}")
            .toObject(UserAssignedIdentity.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAssignedIdentity model = new UserAssignedIdentity();
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentity.class);
    }
}
