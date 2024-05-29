// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

/**
 * Samples for Pools ListByResourceGroup.
 */
public final class PoolsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/devopsinfrastructure/Microsoft.DevOpsInfrastructure/examples/2024-04-04-preview/
     * ListPoolsBySubscriptionAndResourceGroup.json
     */
    /**
     * Sample code: Pools_ListByResourceGroup.
     * 
     * @param manager Entry point to DevOpsInfrastructureManager.
     */
    public static void
        poolsListByResourceGroup(com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager manager) {
        manager.pools().listByResourceGroup("rg", com.azure.core.util.Context.NONE);
    }
}
