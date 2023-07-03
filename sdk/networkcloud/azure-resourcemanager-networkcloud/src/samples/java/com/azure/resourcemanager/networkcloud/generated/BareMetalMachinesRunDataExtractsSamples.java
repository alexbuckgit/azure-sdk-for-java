// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCommandSpecification;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunDataExtractsParameters;
import java.util.Arrays;

/** Samples for BareMetalMachines RunDataExtracts. */
public final class BareMetalMachinesRunDataExtractsSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/BareMetalMachines_RunDataExtracts.json
     */
    /**
     * Sample code: Run data extraction on bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void runDataExtractionOnBareMetalMachine(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .runDataExtracts(
                "resourceGroupName",
                "bareMetalMachineName",
                new BareMetalMachineRunDataExtractsParameters()
                    .withCommands(
                        Arrays
                            .asList(
                                new BareMetalMachineCommandSpecification()
                                    .withArguments(Arrays.asList("SysInfo", "TTYLog"))
                                    .withCommand("hardware-support-data-collection")))
                    .withLimitTimeSeconds(60L),
                com.azure.core.util.Context.NONE);
    }
}
