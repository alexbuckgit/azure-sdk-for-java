// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.msi.fluent.models.FederatedIdentityCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Values returned by the List operation for federated identity credentials. */
@Fluent
public final class FederatedIdentityCredentialsListResult {
    /*
     * The collection of federated identity credentials returned by the listing operation.
     */
    @JsonProperty(value = "value")
    private List<FederatedIdentityCredentialInner> value;

    /*
     * The url to get the next page of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of FederatedIdentityCredentialsListResult class. */
    public FederatedIdentityCredentialsListResult() {
    }

    /**
     * Get the value property: The collection of federated identity credentials returned by the listing operation.
     *
     * @return the value value.
     */
    public List<FederatedIdentityCredentialInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of federated identity credentials returned by the listing operation.
     *
     * @param value the value value to set.
     * @return the FederatedIdentityCredentialsListResult object itself.
     */
    public FederatedIdentityCredentialsListResult withValue(List<FederatedIdentityCredentialInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The url to get the next page of results, if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The url to get the next page of results, if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the FederatedIdentityCredentialsListResult object itself.
     */
    public FederatedIdentityCredentialsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}