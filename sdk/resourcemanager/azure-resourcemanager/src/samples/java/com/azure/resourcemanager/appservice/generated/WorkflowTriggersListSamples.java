// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for WorkflowTriggers List. */
public final class WorkflowTriggersListSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/WorkflowTriggers_List.json
     */
    /**
     * Sample code: List workflow triggers.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listWorkflowTriggers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWorkflowTriggers()
            .list("test-resource-group", "test-name", "test-workflow", null, null, com.azure.core.util.Context.NONE);
    }
}
