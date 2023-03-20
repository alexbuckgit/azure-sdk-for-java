// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for WebApps GetInstanceWorkflowSlot. */
public final class WebAppsGetInstanceWorkflowSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/GetWorkflow.json
     */
    /**
     * Sample code: GET a workflow Slot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gETAWorkflowSlot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getInstanceWorkflowSlotWithResponse(
                "testrg123", "testsite2", "staging", "stateful1", com.azure.core.util.Context.NONE);
    }
}
