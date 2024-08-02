// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

/**
 * Samples for ManagedHsms ListByResourceGroup.
 */
public final class ManagedHsmsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2023-07-01/examples/
     * ManagedHsm_ListByResourceGroup.json
     */
    /**
     * Sample code: List managed HSM Pools in a resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedHSMPoolsInAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults()
            .manager()
            .serviceClient()
            .getManagedHsms()
            .listByResourceGroup("hsm-group", null, com.azure.core.util.Context.NONE);
    }
}
