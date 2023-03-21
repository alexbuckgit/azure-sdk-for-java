// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/** Samples for Changes List. */
public final class ChangesListSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2022-05-01/examples/ListChanges.json
     */
    /**
     * Sample code: ListChanges.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listChanges(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .resourceChangeClient()
            .getChanges()
            .list(
                "resourceGroup1",
                "resourceProvider1",
                "resourceType1",
                "resourceName1",
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
