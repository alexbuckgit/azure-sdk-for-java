// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.generated;

/**
 * Samples for PrivateZones ListByResourceGroup.
 */
public final class PrivateZonesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2020-06-01/examples/
     * PrivateZoneListInResourceGroup.json
     */
    /**
     * Sample code: GET Private DNS Zone by Resource Group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gETPrivateDNSZoneByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.privateDnsZones()
            .manager()
            .serviceClient()
            .getPrivateZones()
            .listByResourceGroup("resourceGroup1", null, com.azure.core.util.Context.NONE);
    }
}
