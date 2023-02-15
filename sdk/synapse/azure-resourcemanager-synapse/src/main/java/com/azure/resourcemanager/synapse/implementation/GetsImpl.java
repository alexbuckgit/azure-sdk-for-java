// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.GetsClient;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeEnableinteractivequeryInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeOperationStatusInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeStopOperationStatusInner;
import com.azure.resourcemanager.synapse.models.Gets;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeEnableinteractivequery;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeOperationStatus;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeStopOperationStatus;

public final class GetsImpl implements Gets {
    private static final ClientLogger LOGGER = new ClientLogger(GetsImpl.class);

    private final GetsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public GetsImpl(GetsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<IntegrationRuntimeOperationStatus> integrationRuntimeStartWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
        Response<IntegrationRuntimeOperationStatusInner> inner =
            this
                .serviceClient()
                .integrationRuntimeStartWithResponse(
                    resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeOperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeOperationStatus integrationRuntimeStart(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        IntegrationRuntimeOperationStatusInner inner =
            this
                .serviceClient()
                .integrationRuntimeStart(
                    resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId);
        if (inner != null) {
            return new IntegrationRuntimeOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeStopOperationStatus> integrationRuntimeStopWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
        Response<IntegrationRuntimeStopOperationStatusInner> inner =
            this
                .serviceClient()
                .integrationRuntimeStopWithResponse(
                    resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeStopOperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeStopOperationStatus integrationRuntimeStop(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        IntegrationRuntimeStopOperationStatusInner inner =
            this
                .serviceClient()
                .integrationRuntimeStop(
                    resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId);
        if (inner != null) {
            return new IntegrationRuntimeStopOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeEnableinteractivequery> integrationRuntimeEnableInteractivequeryWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId,
        Context context) {
        Response<IntegrationRuntimeEnableinteractivequeryInner> inner =
            this
                .serviceClient()
                .integrationRuntimeEnableInteractivequeryWithResponse(
                    resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeEnableinteractivequeryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeEnableinteractivequery integrationRuntimeEnableInteractivequery(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String integrationRuntimeOperationId) {
        IntegrationRuntimeEnableinteractivequeryInner inner =
            this
                .serviceClient()
                .integrationRuntimeEnableInteractivequery(
                    resourceGroupName, workspaceName, integrationRuntimeName, integrationRuntimeOperationId);
        if (inner != null) {
            return new IntegrationRuntimeEnableinteractivequeryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private GetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}