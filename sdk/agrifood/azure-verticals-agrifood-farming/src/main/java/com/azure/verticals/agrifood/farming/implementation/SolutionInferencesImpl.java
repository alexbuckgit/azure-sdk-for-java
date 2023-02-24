// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.serializer.TypeReference;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SolutionInferences. */
public final class SolutionInferencesImpl {
    /** The proxy service used to perform REST calls. */
    private final SolutionInferencesService service;

    /** The service client containing this operation class. */
    private final FarmBeatsClientImpl client;

    /**
     * Initializes an instance of SolutionInferencesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SolutionInferencesImpl(FarmBeatsClientImpl client) {
        this.service =
                RestProxy.create(
                        SolutionInferencesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for FarmBeatsClientSolutionInferences to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "FarmBeatsClientSolut")
    public interface SolutionInferencesService {
        @Post("/solutions/{solutionId}:cancel")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> cancel(
                @HostParam("endpoint") String endpoint,
                @PathParam("solutionId") String solutionId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData solutionInferenceRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/solutions/{solutionId}:create")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> createOrUpdate(
                @HostParam("endpoint") String endpoint,
                @PathParam("solutionId") String solutionId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData solutionInferenceRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/solutions/{solutionId}:fetch")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> fetch(
                @HostParam("endpoint") String endpoint,
                @PathParam("solutionId") String solutionId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData solutionInferenceRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Cancels a job for given solution id.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requestPath: String (Required)
     *     partnerRequestBody (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     String: Object (Required)
     * }
     * }</pre>
     *
     * @param solutionId Id of solution for which job is to be cancelled.
     * @param solutionInferenceRequest solutionInferenceRequest containing input needed for job request processing.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return dictionary of &lt;any&gt; along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> cancelWithResponseAsync(
            String solutionId, BinaryData solutionInferenceRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.cancel(
                                this.client.getEndpoint(),
                                solutionId,
                                this.client.getServiceVersion().getVersion(),
                                solutionInferenceRequest,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Cancels a job for given solution id.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requestPath: String (Required)
     *     partnerRequestBody (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     String: Object (Required)
     * }
     * }</pre>
     *
     * @param solutionId Id of solution for which job is to be cancelled.
     * @param solutionInferenceRequest solutionInferenceRequest containing input needed for job request processing.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return dictionary of &lt;any&gt; along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> cancelWithResponse(
            String solutionId, BinaryData solutionInferenceRequest, RequestOptions requestOptions) {
        return cancelWithResponseAsync(solutionId, solutionInferenceRequest, requestOptions).block();
    }

    /**
     * Creates a job trigger for a solution.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requestPath: String (Required)
     *     partnerRequestBody (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     String: Object (Required)
     * }
     * }</pre>
     *
     * @param solutionId Id of the solution resource.
     * @param solutionInferenceRequest solutionInferenceRequest containing input needed for job request processing.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return dictionary of &lt;any&gt; along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String solutionId, BinaryData solutionInferenceRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdate(
                                this.client.getEndpoint(),
                                solutionId,
                                this.client.getServiceVersion().getVersion(),
                                solutionInferenceRequest,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Creates a job trigger for a solution.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requestPath: String (Required)
     *     partnerRequestBody (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     String: Object (Required)
     * }
     * }</pre>
     *
     * @param solutionId Id of the solution resource.
     * @param solutionInferenceRequest solutionInferenceRequest containing input needed for job request processing.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of dictionary of &lt;any&gt;.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateOrUpdateAsync(
            String solutionId, BinaryData solutionInferenceRequest, RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.createOrUpdateWithResponseAsync(solutionId, solutionInferenceRequest, requestOptions),
                new DefaultPollingStrategy<>(
                        this.client.getHttpPipeline(),
                        "{endpoint}".replace("{endpoint}", this.client.getEndpoint()),
                        null,
                        requestOptions != null && requestOptions.getContext() != null
                                ? requestOptions.getContext()
                                : Context.NONE),
                TypeReference.createInstance(BinaryData.class),
                TypeReference.createInstance(BinaryData.class));
    }

    /**
     * Creates a job trigger for a solution.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requestPath: String (Required)
     *     partnerRequestBody (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     String: Object (Required)
     * }
     * }</pre>
     *
     * @param solutionId Id of the solution resource.
     * @param solutionInferenceRequest solutionInferenceRequest containing input needed for job request processing.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of dictionary of &lt;any&gt;.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginCreateOrUpdate(
            String solutionId, BinaryData solutionInferenceRequest, RequestOptions requestOptions) {
        return this.beginCreateOrUpdateAsync(solutionId, solutionInferenceRequest, requestOptions).getSyncPoller();
    }

    /**
     * Fetches details of triggered job for a solution.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requestPath: String (Required)
     *     partnerRequestBody (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     String: Object (Required)
     * }
     * }</pre>
     *
     * @param solutionId Id of the solution.
     * @param solutionInferenceRequest solutionInferenceRequest containing input needed for job request processing.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return dictionary of &lt;any&gt; along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> fetchWithResponseAsync(
            String solutionId, BinaryData solutionInferenceRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.fetch(
                                this.client.getEndpoint(),
                                solutionId,
                                this.client.getServiceVersion().getVersion(),
                                solutionInferenceRequest,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Fetches details of triggered job for a solution.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requestPath: String (Required)
     *     partnerRequestBody (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     String: Object (Required)
     * }
     * }</pre>
     *
     * @param solutionId Id of the solution.
     * @param solutionInferenceRequest solutionInferenceRequest containing input needed for job request processing.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return dictionary of &lt;any&gt; along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> fetchWithResponse(
            String solutionId, BinaryData solutionInferenceRequest, RequestOptions requestOptions) {
        return fetchWithResponseAsync(solutionId, solutionInferenceRequest, requestOptions).block();
    }
}