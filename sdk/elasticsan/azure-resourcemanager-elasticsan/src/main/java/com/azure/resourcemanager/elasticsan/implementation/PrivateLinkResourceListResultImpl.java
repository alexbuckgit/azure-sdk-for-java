// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.implementation;

import com.azure.resourcemanager.elasticsan.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkResource;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkResourceListResult;
import java.util.Collections;
import java.util.List;

public final class PrivateLinkResourceListResultImpl implements PrivateLinkResourceListResult {
    private PrivateLinkResourceListResultInner innerObject;

    private final com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager;

    PrivateLinkResourceListResultImpl(
        PrivateLinkResourceListResultInner innerObject,
        com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateLinkResource> value() {
        List<PrivateLinkResource> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public PrivateLinkResourceListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.elasticsan.ElasticSanManager manager() {
        return this.serviceManager;
    }
}
