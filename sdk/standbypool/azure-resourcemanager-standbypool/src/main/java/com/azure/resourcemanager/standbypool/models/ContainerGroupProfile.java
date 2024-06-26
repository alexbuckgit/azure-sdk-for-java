// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the ContainerGroupProfile.
 */
@Fluent
public final class ContainerGroupProfile {
    /*
     * Specifies container group profile id of standby container groups.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Specifies revision of container group profile.
     */
    @JsonProperty(value = "revision")
    private Long revision;

    /**
     * Creates an instance of ContainerGroupProfile class.
     */
    public ContainerGroupProfile() {
    }

    /**
     * Get the id property: Specifies container group profile id of standby container groups.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Specifies container group profile id of standby container groups.
     * 
     * @param id the id value to set.
     * @return the ContainerGroupProfile object itself.
     */
    public ContainerGroupProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the revision property: Specifies revision of container group profile.
     * 
     * @return the revision value.
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set the revision property: Specifies revision of container group profile.
     * 
     * @param revision the revision value to set.
     * @return the ContainerGroupProfile object itself.
     */
    public ContainerGroupProfile withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model ContainerGroupProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerGroupProfile.class);
}
