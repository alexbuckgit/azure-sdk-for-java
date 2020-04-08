// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CollectionRegions. */
public final class CollectionRegionsInner {
    /** The proxy service used to perform REST calls. */
    private final CollectionRegionsService service;

    /** The service client containing this operation class. */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of CollectionRegionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CollectionRegionsInner(CosmosDBManagementClientImpl client) {
        this.service =
            RestProxy.create(CollectionRegionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientCollectionRegions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    private interface CollectionRegionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB"
                + "/databaseAccounts/{accountName}/region/{region}/databases/{databaseRid}/collections/{collectionRid}"
                + "/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<MetricListResultInner>> listMetrics(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("region") String region,
            @PathParam("databaseRid") String databaseRid,
            @PathParam("collectionRid") String collectionRid,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            Context context);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given database account, collection and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metrics request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<MetricInner>> listMetricsSinglePageAsync(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter) {
        final String apiVersion = "2019-08-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listMetrics(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            accountName,
                            region,
                            databaseRid,
                            collectionRid,
                            apiVersion,
                            filter,
                            context))
            .<PagedResponse<MetricInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given database account, collection and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<MetricInner> listMetricsAsync(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter) {
        return new PagedFlux<>(
            () ->
                listMetricsSinglePageAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, filter));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given database account, collection and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MetricInner> listMetrics(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter) {
        return new PagedIterable<>(
            listMetricsAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, filter));
    }
}
