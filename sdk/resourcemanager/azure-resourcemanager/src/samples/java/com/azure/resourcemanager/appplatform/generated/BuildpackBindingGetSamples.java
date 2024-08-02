// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for BuildpackBinding Get.
 */
public final class BuildpackBindingGetSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/BuildpackBinding_Get.
     * json
     */
    /**
     * Sample code: BuildpackBinding_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildpackBindingGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getBuildpackBindings()
            .getWithResponse("myResourceGroup", "myservice", "default", "default", "myBuildpackBinding",
                com.azure.core.util.Context.NONE);
    }
}
