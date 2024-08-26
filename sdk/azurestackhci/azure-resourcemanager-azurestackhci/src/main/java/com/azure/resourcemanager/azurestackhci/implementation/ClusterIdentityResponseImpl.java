// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.resourcemanager.azurestackhci.fluent.models.ClusterIdentityResponseInner;
import com.azure.resourcemanager.azurestackhci.models.ClusterIdentityResponse;

public final class ClusterIdentityResponseImpl implements ClusterIdentityResponse {
    private ClusterIdentityResponseInner innerObject;

    private final com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager;

    ClusterIdentityResponseImpl(ClusterIdentityResponseInner innerObject,
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String aadClientId() {
        return this.innerModel().aadClientId();
    }

    public String aadTenantId() {
        return this.innerModel().aadTenantId();
    }

    public String aadServicePrincipalObjectId() {
        return this.innerModel().aadServicePrincipalObjectId();
    }

    public String aadApplicationObjectId() {
        return this.innerModel().aadApplicationObjectId();
    }

    public ClusterIdentityResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager() {
        return this.serviceManager;
    }
}
