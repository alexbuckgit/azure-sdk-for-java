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
import java.util.List;

/**
 * The request for a VIP swap.
 */
@Fluent
public final class LoadBalancerVipSwapRequest implements JsonSerializable<LoadBalancerVipSwapRequest> {
    /*
     * A list of frontend IP configuration resources that should swap VIPs.
     */
    private List<LoadBalancerVipSwapRequestFrontendIpConfiguration> frontendIpConfigurations;

    /**
     * Creates an instance of LoadBalancerVipSwapRequest class.
     */
    public LoadBalancerVipSwapRequest() {
    }

    /**
     * Get the frontendIpConfigurations property: A list of frontend IP configuration resources that should swap VIPs.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<LoadBalancerVipSwapRequestFrontendIpConfiguration> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: A list of frontend IP configuration resources that should swap VIPs.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerVipSwapRequest object itself.
     */
    public LoadBalancerVipSwapRequest
        withFrontendIpConfigurations(List<LoadBalancerVipSwapRequestFrontendIpConfiguration> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("frontendIPConfigurations", this.frontendIpConfigurations,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerVipSwapRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerVipSwapRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerVipSwapRequest.
     */
    public static LoadBalancerVipSwapRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerVipSwapRequest deserializedLoadBalancerVipSwapRequest = new LoadBalancerVipSwapRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("frontendIPConfigurations".equals(fieldName)) {
                    List<LoadBalancerVipSwapRequestFrontendIpConfiguration> frontendIpConfigurations = reader
                        .readArray(reader1 -> LoadBalancerVipSwapRequestFrontendIpConfiguration.fromJson(reader1));
                    deserializedLoadBalancerVipSwapRequest.frontendIpConfigurations = frontendIpConfigurations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerVipSwapRequest;
        });
    }
}
