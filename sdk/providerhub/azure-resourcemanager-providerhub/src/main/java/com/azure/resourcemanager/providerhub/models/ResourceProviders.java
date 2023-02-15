// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<ResourceProviderManifest> generateManifestWithResponse(String providerNamespace, Context context);

    /**
     * Generates the manifest for the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    ResourceProviderManifest generateManifest(String providerNamespace);

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param checkinManifestParams The required body parameters supplied to the checkin manifest operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<CheckinManifestInfo> checkinManifestWithResponse(
        String providerNamespace, CheckinManifestParams checkinManifestParams, Context context);

    /**
     * Checkin the manifest.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param checkinManifestParams The required body parameters supplied to the checkin manifest operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    CheckinManifestInfo checkinManifest(String providerNamespace, CheckinManifestParams checkinManifestParams);
}