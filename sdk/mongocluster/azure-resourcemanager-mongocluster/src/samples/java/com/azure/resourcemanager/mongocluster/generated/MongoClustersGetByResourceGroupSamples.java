// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

/**
 * Samples for MongoClusters GetByResourceGroup.
 */
public final class MongoClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mongocluster/DocumentDB.MongoCluster.Management/examples/2024-03-01-preview/MongoClusters_Get.json
     */
    /**
     * Sample code: Gets a Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void getsAMongoClusterResource(com.azure.resourcemanager.mongocluster.MongoClusterManager manager) {
        manager.mongoClusters()
            .getByResourceGroupWithResponse("TestResourceGroup", "myMongoCluster", com.azure.core.util.Context.NONE);
    }
}
