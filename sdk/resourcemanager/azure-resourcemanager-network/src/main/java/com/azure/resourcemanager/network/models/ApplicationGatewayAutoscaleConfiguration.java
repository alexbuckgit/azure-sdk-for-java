// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Application Gateway autoscale configuration.
 */
@Fluent
public final class ApplicationGatewayAutoscaleConfiguration
    implements JsonSerializable<ApplicationGatewayAutoscaleConfiguration> {
    /*
     * Lower bound on number of Application Gateway capacity.
     */
    private int minCapacity;

    /*
     * Upper bound on number of Application Gateway capacity.
     */
    private Integer maxCapacity;

    /**
     * Creates an instance of ApplicationGatewayAutoscaleConfiguration class.
     */
    public ApplicationGatewayAutoscaleConfiguration() {
    }

    /**
     * Get the minCapacity property: Lower bound on number of Application Gateway capacity.
     * 
     * @return the minCapacity value.
     */
    public int minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: Lower bound on number of Application Gateway capacity.
     * 
     * @param minCapacity the minCapacity value to set.
     * @return the ApplicationGatewayAutoscaleConfiguration object itself.
     */
    public ApplicationGatewayAutoscaleConfiguration withMinCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the maxCapacity property: Upper bound on number of Application Gateway capacity.
     * 
     * @return the maxCapacity value.
     */
    public Integer maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Set the maxCapacity property: Upper bound on number of Application Gateway capacity.
     * 
     * @param maxCapacity the maxCapacity value to set.
     * @return the ApplicationGatewayAutoscaleConfiguration object itself.
     */
    public ApplicationGatewayAutoscaleConfiguration withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
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
        jsonWriter.writeIntField("minCapacity", this.minCapacity);
        jsonWriter.writeNumberField("maxCapacity", this.maxCapacity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayAutoscaleConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayAutoscaleConfiguration if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationGatewayAutoscaleConfiguration.
     */
    public static ApplicationGatewayAutoscaleConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayAutoscaleConfiguration deserializedApplicationGatewayAutoscaleConfiguration
                = new ApplicationGatewayAutoscaleConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minCapacity".equals(fieldName)) {
                    deserializedApplicationGatewayAutoscaleConfiguration.minCapacity = reader.getInt();
                } else if ("maxCapacity".equals(fieldName)) {
                    deserializedApplicationGatewayAutoscaleConfiguration.maxCapacity
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayAutoscaleConfiguration;
        });
    }
}
