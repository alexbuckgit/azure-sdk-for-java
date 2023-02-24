// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.generated;

/** Samples for CommunicationsGateways GetByResourceGroup. */
public final class CommunicationsGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/voiceservices/resource-manager/Microsoft.VoiceServices/stable/2023-01-31/examples/CommunicationsGateways_Get.json
     */
    /**
     * Sample code: GetCommunicationsGatewayResource.
     *
     * @param manager Entry point to VoiceservicesManager.
     */
    public static void getCommunicationsGatewayResource(
        com.azure.resourcemanager.voiceservices.VoiceservicesManager manager) {
        manager
            .communicationsGateways()
            .getByResourceGroupWithResponse("testrg", "myname", com.azure.core.util.Context.NONE);
    }
}