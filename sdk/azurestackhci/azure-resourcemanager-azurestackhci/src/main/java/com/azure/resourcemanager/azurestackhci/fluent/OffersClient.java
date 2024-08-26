// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.OfferInner;

/**
 * An instance of this class provides access to all the operations defined in OffersClient.
 */
public interface OffersClient {
    /**
     * List Offers available for a publisher within the HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param publisherName The name of the publisher available within HCI cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Offer proxy resources for the HCI cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OfferInner> listByPublisher(String resourceGroupName, String clusterName, String publisherName);

    /**
     * List Offers available for a publisher within the HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param publisherName The name of the publisher available within HCI cluster.
     * @param expand Specify $expand=content,contentVersion to populate additional fields related to the marketplace
     * offer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Offer proxy resources for the HCI cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OfferInner> listByPublisher(String resourceGroupName, String clusterName, String publisherName,
        String expand, Context context);

    /**
     * List Offers available across publishers for the HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Offer proxy resources for the HCI cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OfferInner> listByCluster(String resourceGroupName, String clusterName);

    /**
     * List Offers available across publishers for the HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param expand Specify $expand=content,contentVersion to populate additional fields related to the marketplace
     * offer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Offer proxy resources for the HCI cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OfferInner> listByCluster(String resourceGroupName, String clusterName, String expand,
        Context context);

    /**
     * Get Offer resource details within a publisher of HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param publisherName The name of the publisher available within HCI cluster.
     * @param offerName The name of the offer available within HCI cluster.
     * @param expand Specify $expand=content,contentVersion to populate additional fields related to the marketplace
     * offer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return offer resource details within a publisher of HCI Cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OfferInner> getWithResponse(String resourceGroupName, String clusterName, String publisherName,
        String offerName, String expand, Context context);

    /**
     * Get Offer resource details within a publisher of HCI Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param publisherName The name of the publisher available within HCI cluster.
     * @param offerName The name of the offer available within HCI cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return offer resource details within a publisher of HCI Cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OfferInner get(String resourceGroupName, String clusterName, String publisherName, String offerName);
}
