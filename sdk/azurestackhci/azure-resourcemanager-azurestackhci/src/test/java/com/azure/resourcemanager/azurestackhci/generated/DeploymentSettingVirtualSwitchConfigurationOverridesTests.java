// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.DeploymentSettingVirtualSwitchConfigurationOverrides;
import org.junit.jupiter.api.Assertions;

public final class DeploymentSettingVirtualSwitchConfigurationOverridesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentSettingVirtualSwitchConfigurationOverrides model
            = BinaryData.fromString("{\"enableIov\":\"p\",\"loadBalancingAlgorithm\":\"ebmnzbtbhjpglk\"}")
                .toObject(DeploymentSettingVirtualSwitchConfigurationOverrides.class);
        Assertions.assertEquals("p", model.enableIov());
        Assertions.assertEquals("ebmnzbtbhjpglk", model.loadBalancingAlgorithm());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentSettingVirtualSwitchConfigurationOverrides model
            = new DeploymentSettingVirtualSwitchConfigurationOverrides().withEnableIov("p")
                .withLoadBalancingAlgorithm("ebmnzbtbhjpglk");
        model = BinaryData.fromObject(model).toObject(DeploymentSettingVirtualSwitchConfigurationOverrides.class);
        Assertions.assertEquals("p", model.enableIov());
        Assertions.assertEquals("ebmnzbtbhjpglk", model.loadBalancingAlgorithm());
    }
}
