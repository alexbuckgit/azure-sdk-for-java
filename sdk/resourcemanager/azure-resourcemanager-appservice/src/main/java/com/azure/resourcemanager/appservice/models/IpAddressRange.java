// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ip address range. */
@Fluent
public final class IpAddressRange {
    /*
     * The IP address range.
     */
    @JsonProperty(value = "addressRange")
    private String addressRange;

    /** Creates an instance of IpAddressRange class. */
    public IpAddressRange() {
    }

    /**
     * Get the addressRange property: The IP address range.
     *
     * @return the addressRange value.
     */
    public String addressRange() {
        return this.addressRange;
    }

    /**
     * Set the addressRange property: The IP address range.
     *
     * @param addressRange the addressRange value to set.
     * @return the IpAddressRange object itself.
     */
    public IpAddressRange withAddressRange(String addressRange) {
        this.addressRange = addressRange;
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
