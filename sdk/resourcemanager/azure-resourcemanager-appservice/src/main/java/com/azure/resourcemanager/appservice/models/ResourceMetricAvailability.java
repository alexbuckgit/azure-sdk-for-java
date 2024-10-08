// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Metrics availability and retention.
 */
@Immutable
public final class ResourceMetricAvailability implements JsonSerializable<ResourceMetricAvailability> {
    /*
     * Time grain .
     */
    private String timeGrain;

    /*
     * Retention period for the current time grain.
     */
    private String retention;

    /**
     * Creates an instance of ResourceMetricAvailability class.
     */
    public ResourceMetricAvailability() {
    }

    /**
     * Get the timeGrain property: Time grain .
     * 
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the retention property: Retention period for the current time grain.
     * 
     * @return the retention value.
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceMetricAvailability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceMetricAvailability if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceMetricAvailability.
     */
    public static ResourceMetricAvailability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceMetricAvailability deserializedResourceMetricAvailability = new ResourceMetricAvailability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeGrain".equals(fieldName)) {
                    deserializedResourceMetricAvailability.timeGrain = reader.getString();
                } else if ("retention".equals(fieldName)) {
                    deserializedResourceMetricAvailability.retention = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceMetricAvailability;
        });
    }
}
