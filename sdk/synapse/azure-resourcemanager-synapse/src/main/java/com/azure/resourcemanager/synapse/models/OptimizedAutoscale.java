// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class that contains the optimized auto scale definition. */
@Fluent
public final class OptimizedAutoscale {
    /*
     * The version of the template defined, for instance 1.
     */
    @JsonProperty(value = "version", required = true)
    private int version;

    /*
     * A boolean value that indicate if the optimized autoscale feature is
     * enabled or not.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /*
     * Minimum allowed instances count.
     */
    @JsonProperty(value = "minimum", required = true)
    private int minimum;

    /*
     * Maximum allowed instances count.
     */
    @JsonProperty(value = "maximum", required = true)
    private int maximum;

    /**
     * Get the version property: The version of the template defined, for instance 1.
     *
     * @return the version value.
     */
    public int version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the template defined, for instance 1.
     *
     * @param version the version value to set.
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withVersion(int version) {
        this.version = version;
        return this;
    }

    /**
     * Get the isEnabled property: A boolean value that indicate if the optimized autoscale feature is enabled or not.
     *
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: A boolean value that indicate if the optimized autoscale feature is enabled or not.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the minimum property: Minimum allowed instances count.
     *
     * @return the minimum value.
     */
    public int minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Minimum allowed instances count.
     *
     * @param minimum the minimum value to set.
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: Maximum allowed instances count.
     *
     * @return the maximum value.
     */
    public int maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Maximum allowed instances count.
     *
     * @param maximum the maximum value to set.
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withMaximum(int maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
