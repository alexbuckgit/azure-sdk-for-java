// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines the type of Azure DevOps pool permission.
 */
@Fluent
public final class AzureDevOpsPermissionProfile {
    /*
     * Determines who has admin permissions to the Azure DevOps pool.
     */
    @JsonProperty(value = "kind", required = true)
    private AzureDevOpsPermissionType kind;

    /*
     * User email addresses
     */
    @JsonProperty(value = "users")
    private List<String> users;

    /*
     * Group email addresses
     */
    @JsonProperty(value = "groups")
    private List<String> groups;

    /**
     * Creates an instance of AzureDevOpsPermissionProfile class.
     */
    public AzureDevOpsPermissionProfile() {
    }

    /**
     * Get the kind property: Determines who has admin permissions to the Azure DevOps pool.
     * 
     * @return the kind value.
     */
    public AzureDevOpsPermissionType kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Determines who has admin permissions to the Azure DevOps pool.
     * 
     * @param kind the kind value to set.
     * @return the AzureDevOpsPermissionProfile object itself.
     */
    public AzureDevOpsPermissionProfile withKind(AzureDevOpsPermissionType kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the users property: User email addresses.
     * 
     * @return the users value.
     */
    public List<String> users() {
        return this.users;
    }

    /**
     * Set the users property: User email addresses.
     * 
     * @param users the users value to set.
     * @return the AzureDevOpsPermissionProfile object itself.
     */
    public AzureDevOpsPermissionProfile withUsers(List<String> users) {
        this.users = users;
        return this;
    }

    /**
     * Get the groups property: Group email addresses.
     * 
     * @return the groups value.
     */
    public List<String> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: Group email addresses.
     * 
     * @param groups the groups value to set.
     * @return the AzureDevOpsPermissionProfile object itself.
     */
    public AzureDevOpsPermissionProfile withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kind() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property kind in model AzureDevOpsPermissionProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDevOpsPermissionProfile.class);
}
