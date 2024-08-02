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
 * Parameters that define the configuration of traffic analytics.
 */
@Fluent
public final class TrafficAnalyticsProperties implements JsonSerializable<TrafficAnalyticsProperties> {
    /*
     * Parameters that define the configuration of traffic analytics.
     */
    private TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration;

    /**
     * Creates an instance of TrafficAnalyticsProperties class.
     */
    public TrafficAnalyticsProperties() {
    }

    /**
     * Get the networkWatcherFlowAnalyticsConfiguration property: Parameters that define the configuration of traffic
     * analytics.
     * 
     * @return the networkWatcherFlowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration() {
        return this.networkWatcherFlowAnalyticsConfiguration;
    }

    /**
     * Set the networkWatcherFlowAnalyticsConfiguration property: Parameters that define the configuration of traffic
     * analytics.
     * 
     * @param networkWatcherFlowAnalyticsConfiguration the networkWatcherFlowAnalyticsConfiguration value to set.
     * @return the TrafficAnalyticsProperties object itself.
     */
    public TrafficAnalyticsProperties withNetworkWatcherFlowAnalyticsConfiguration(
        TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkWatcherFlowAnalyticsConfiguration() != null) {
            networkWatcherFlowAnalyticsConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("networkWatcherFlowAnalyticsConfiguration",
            this.networkWatcherFlowAnalyticsConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrafficAnalyticsProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrafficAnalyticsProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrafficAnalyticsProperties.
     */
    public static TrafficAnalyticsProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrafficAnalyticsProperties deserializedTrafficAnalyticsProperties = new TrafficAnalyticsProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkWatcherFlowAnalyticsConfiguration".equals(fieldName)) {
                    deserializedTrafficAnalyticsProperties.networkWatcherFlowAnalyticsConfiguration
                        = TrafficAnalyticsConfigurationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrafficAnalyticsProperties;
        });
    }
}
