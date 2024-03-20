// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.support.fluent.LookUpResourceIdsClient;
import com.azure.resourcemanager.support.fluent.models.LookUpResourceIdResponseInner;
import com.azure.resourcemanager.support.models.LookUpResourceIdRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in LookUpResourceIdsClient.
 */
public final class LookUpResourceIdsClientImpl implements LookUpResourceIdsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LookUpResourceIdsService service;

    /**
     * The service client containing this operation class.
     */
    private final MicrosoftSupportImpl client;

    /**
     * Initializes an instance of LookUpResourceIdsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    LookUpResourceIdsClientImpl(MicrosoftSupportImpl client) {
        this.service
            = RestProxy.create(LookUpResourceIdsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftSupportLookUpResourceIds to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftSupportLook")
    public interface LookUpResourceIdsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.Support/lookUpResourceId")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LookUpResourceIdResponseInner>> post(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") LookUpResourceIdRequest lookUpResourceIdRequest,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * This operation fetches ARM resource id of support resource type.
     * 
     * @param lookUpResourceIdRequest Look up resource id request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the look up resource id response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LookUpResourceIdResponseInner>>
        postWithResponseAsync(LookUpResourceIdRequest lookUpResourceIdRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (lookUpResourceIdRequest == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter lookUpResourceIdRequest is required and cannot be null."));
        } else {
            lookUpResourceIdRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.post(this.client.getEndpoint(), this.client.getApiVersion(),
                lookUpResourceIdRequest, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * This operation fetches ARM resource id of support resource type.
     * 
     * @param lookUpResourceIdRequest Look up resource id request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the look up resource id response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LookUpResourceIdResponseInner>>
        postWithResponseAsync(LookUpResourceIdRequest lookUpResourceIdRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (lookUpResourceIdRequest == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter lookUpResourceIdRequest is required and cannot be null."));
        } else {
            lookUpResourceIdRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.post(this.client.getEndpoint(), this.client.getApiVersion(), lookUpResourceIdRequest, accept,
            context);
    }

    /**
     * This operation fetches ARM resource id of support resource type.
     * 
     * @param lookUpResourceIdRequest Look up resource id request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the look up resource id response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LookUpResourceIdResponseInner> postAsync(LookUpResourceIdRequest lookUpResourceIdRequest) {
        return postWithResponseAsync(lookUpResourceIdRequest).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * This operation fetches ARM resource id of support resource type.
     * 
     * @param lookUpResourceIdRequest Look up resource id request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the look up resource id response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LookUpResourceIdResponseInner> postWithResponse(LookUpResourceIdRequest lookUpResourceIdRequest,
        Context context) {
        return postWithResponseAsync(lookUpResourceIdRequest, context).block();
    }

    /**
     * This operation fetches ARM resource id of support resource type.
     * 
     * @param lookUpResourceIdRequest Look up resource id request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the look up resource id response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LookUpResourceIdResponseInner post(LookUpResourceIdRequest lookUpResourceIdRequest) {
        return postWithResponse(lookUpResourceIdRequest, Context.NONE).getValue();
    }
}
