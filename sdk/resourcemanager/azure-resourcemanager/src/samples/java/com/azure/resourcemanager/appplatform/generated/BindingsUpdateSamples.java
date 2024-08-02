// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.fluent.models.BindingResourceInner;
import com.azure.resourcemanager.appplatform.models.BindingResourceProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Bindings Update.
 */
public final class BindingsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/Bindings_Update.json
     */
    /**
     * Sample code: Bindings_Update.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void bindingsUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getBindings()
            .update("myResourceGroup", "myservice", "myapp", "mybinding",
                new BindingResourceInner()
                    .withProperties(new BindingResourceProperties().withKey("fakeTokenPlaceholder")
                        .withBindingParameters(mapOf("apiType", "SQL", "databaseName", "db1"))),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
