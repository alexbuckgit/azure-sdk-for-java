// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Publishers.
 */
public interface Publishers {
    /**
     * List Publishers available for the HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Publisher proxy resources for the HCI cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Publisher> listByCluster(String resourceGroupName, String clusterName);

    /**
     * List Publishers available for the HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Publisher proxy resources for the HCI cluster as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Publisher> listByCluster(String resourceGroupName, String clusterName, Context context);

    /**
     * Get Publisher resource details of HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param publisherName The name of the publisher available within HCI cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publisher resource details of HCI Cluster along with {@link Response}.
     */
    Response<Publisher> getWithResponse(String resourceGroupName, String clusterName, String publisherName,
        Context context);

    /**
     * Get Publisher resource details of HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param publisherName The name of the publisher available within HCI cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publisher resource details of HCI Cluster.
     */
    Publisher get(String resourceGroupName, String clusterName, String publisherName);
}
