// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The job error information containing the list of job errors. */
@Immutable
public final class JobErrorDetails {
    /*
     * The error details.
     */
    @JsonProperty(value = "errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobErrorItem> errorDetails;

    /*
     * The code intended for programmatic access.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The message that describes the error in detail.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /** Creates an instance of JobErrorDetails class. */
    public JobErrorDetails() {
    }

    /**
     * Get the errorDetails property: The error details.
     *
     * @return the errorDetails value.
     */
    public List<JobErrorItem> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Get the code property: The code intended for programmatic access.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: The message that describes the error in detail.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorDetails() != null) {
            errorDetails().forEach(e -> e.validate());
        }
    }
}
