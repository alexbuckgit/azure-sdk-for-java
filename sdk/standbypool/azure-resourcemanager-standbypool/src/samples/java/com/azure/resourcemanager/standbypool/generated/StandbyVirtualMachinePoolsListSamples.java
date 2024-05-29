// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for StandbyVirtualMachinePools List.
 */
public final class StandbyVirtualMachinePoolsListSamples {
    /*
     * x-ms-original-file: specification/standbypool/StandbyPool.Management/examples/2023-12-01-preview/
     * StandbyVirtualMachinePools_ListBySubscription.json
     */
    /**
     * Sample code: StandbyVirtualMachinePools_ListBySubscription.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void
        standbyVirtualMachinePoolsListBySubscription(com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.standbyVirtualMachinePools().list(com.azure.core.util.Context.NONE);
    }
}
