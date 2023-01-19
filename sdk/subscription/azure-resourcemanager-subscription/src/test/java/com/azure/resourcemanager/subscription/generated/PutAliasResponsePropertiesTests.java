// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.subscription.models.ProvisioningState;
import com.azure.resourcemanager.subscription.models.PutAliasResponseProperties;
import org.junit.jupiter.api.Assertions;

public final class PutAliasResponsePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PutAliasResponseProperties model =
            BinaryData
                .fromString("{\"subscriptionId\":\"lnrosfqp\",\"provisioningState\":\"Failed\"}")
                .toObject(PutAliasResponseProperties.class);
        Assertions.assertEquals(ProvisioningState.FAILED, model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PutAliasResponseProperties model =
            new PutAliasResponseProperties().withProvisioningState(ProvisioningState.FAILED);
        model = BinaryData.fromObject(model).toObject(PutAliasResponseProperties.class);
        Assertions.assertEquals(ProvisioningState.FAILED, model.provisioningState());
    }
}
