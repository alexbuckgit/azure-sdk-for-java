// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

import com.azure.resourcemanager.eventhubs.fluent.models.ClusterInner;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Clusters Update.
 */
public final class ClustersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/Clusters/ClusterPatch.json
     */
    /**
     * Sample code: ClusterPatch.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void clusterPatch(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getClusters()
            .update("myResourceGroup", "testCluster",
                new ClusterInner().withLocation("South Central US").withTags(mapOf("tag3", "value3", "tag4", "value4")),
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
