// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.keyvault.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.keyvault.models.PrivateEndpointConnectionsPutResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient.
 */
public interface PrivateEndpointConnectionsClient {
    /**
     * Gets the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the key vault along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateEndpointConnectionInner>> getWithResponseAsync(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName);

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the key vault on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName);

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the key vault along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the key vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName);

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionsPutResponse> putWithResponseAsync(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner properties);

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> putAsync(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner properties);

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionsPutResponse putWithResponse(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner properties, Context context);

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties The intended state of private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner put(String resourceGroupName, String vaultName, String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>
        beginDeleteAsync(String resourceGroupName, String vaultName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>
        beginDelete(String resourceGroupName, String vaultName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>
        beginDelete(String resourceGroupName, String vaultName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateEndpointConnectionInner> deleteAsync(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner delete(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner delete(String resourceGroupName, String vaultName,
        String privateEndpointConnectionName, Context context);

    /**
     * The List operation gets information about the private endpoint connections associated with the vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connections as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PrivateEndpointConnectionInner> listByResourceAsync(String resourceGroupName, String vaultName);

    /**
     * The List operation gets information about the private endpoint connections associated with the vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByResource(String resourceGroupName, String vaultName);

    /**
     * The List operation gets information about the private endpoint connections associated with the vault.
     * 
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByResource(String resourceGroupName, String vaultName,
        Context context);
}
