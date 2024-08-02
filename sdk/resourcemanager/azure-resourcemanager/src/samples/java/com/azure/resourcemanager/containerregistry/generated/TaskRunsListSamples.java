// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for TaskRuns List.
 */
public final class TaskRunsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/
     * TaskRunsList.json
     */
    /**
     * Sample code: TaskRuns_List.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void taskRunsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries()
            .manager()
            .serviceClient()
            .getTaskRuns()
            .list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
