// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.resourcemanager.azurestackhci.models.DeviceConfiguration;
import com.azure.resourcemanager.azurestackhci.models.HciEdgeDevice;
import com.azure.resourcemanager.azurestackhci.models.HciEdgeDeviceProperties;
import com.azure.resourcemanager.azurestackhci.models.NicDetail;
import java.util.Arrays;

/**
 * Samples for EdgeDevices CreateOrUpdate.
 */
public final class EdgeDevicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/StackHCI/stable/2024-04-01/examples/
     * CreateHciEdgeDevice.json
     */
    /**
     * Sample code: Create HCI Edge Device.
     * 
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void createHCIEdgeDevice(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.edgeDevices()
            .createOrUpdate(
                "subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/ArcInstance-rg/providers/Microsoft.HybridCompute/machines/Node-1",
                "default",
                new HciEdgeDevice().withProperties(new HciEdgeDeviceProperties().withDeviceConfiguration(
                    new DeviceConfiguration().withNicDetails(Arrays.asList(new NicDetail().withAdapterName("ethernet")
                        .withInterfaceDescription("NDIS 6.70 ")
                        .withComponentId("VMBUS{f8615163-df3e-46c5-913f-f2d2f965ed0g} ")
                        .withDriverVersion("10.0.20348.1547 ")
                        .withIp4Address("10.10.10.10")
                        .withSubnetMask("255.255.255.0")
                        .withDefaultGateway("10.10.10.1")
                        .withDnsServers(Arrays.asList("100.10.10.1"))
                        .withDefaultIsolationId("0"))).withDeviceMetadata(""))),
                com.azure.core.util.Context.NONE);
    }
}
