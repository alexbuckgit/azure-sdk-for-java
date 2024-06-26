// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventStreamEventInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Get live event stream events result. */
@Fluent
public final class LiveEventGetStreamEventsResult {
    /*
     * The result of the get live event stream events.
     */
    @JsonProperty(value = "value")
    private List<LiveEventStreamEventInner> value;

    /** Creates an instance of LiveEventGetStreamEventsResult class. */
    public LiveEventGetStreamEventsResult() {
    }

    /**
     * Get the value property: The result of the get live event stream events.
     *
     * @return the value value.
     */
    public List<LiveEventStreamEventInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The result of the get live event stream events.
     *
     * @param value the value value to set.
     * @return the LiveEventGetStreamEventsResult object itself.
     */
    public LiveEventGetStreamEventsResult withValue(List<LiveEventStreamEventInner> value) {
        this.value = value;
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
