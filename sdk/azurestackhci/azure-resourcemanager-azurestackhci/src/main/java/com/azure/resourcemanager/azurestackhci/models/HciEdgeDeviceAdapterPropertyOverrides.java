// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AdapterPropertyOverrides of a cluster.
 */
@Immutable
public final class HciEdgeDeviceAdapterPropertyOverrides
    implements JsonSerializable<HciEdgeDeviceAdapterPropertyOverrides> {
    /*
     * This parameter should only be modified based on your OEM guidance. Do not modify this parameter without OEM
     * validation.
     */
    private String jumboPacket;

    /*
     * This parameter should only be modified based on your OEM guidance. Do not modify this parameter without OEM
     * validation.
     */
    private String networkDirect;

    /*
     * This parameter should only be modified based on your OEM guidance. Do not modify this parameter without OEM
     * validation. Expected values are 'iWARP', 'RoCEv2', 'RoCE'
     */
    private String networkDirectTechnology;

    /**
     * Creates an instance of HciEdgeDeviceAdapterPropertyOverrides class.
     */
    public HciEdgeDeviceAdapterPropertyOverrides() {
    }

    /**
     * Get the jumboPacket property: This parameter should only be modified based on your OEM guidance. Do not modify
     * this parameter without OEM validation.
     * 
     * @return the jumboPacket value.
     */
    public String jumboPacket() {
        return this.jumboPacket;
    }

    /**
     * Get the networkDirect property: This parameter should only be modified based on your OEM guidance. Do not modify
     * this parameter without OEM validation.
     * 
     * @return the networkDirect value.
     */
    public String networkDirect() {
        return this.networkDirect;
    }

    /**
     * Get the networkDirectTechnology property: This parameter should only be modified based on your OEM guidance. Do
     * not modify this parameter without OEM validation. Expected values are 'iWARP', 'RoCEv2', 'RoCE'.
     * 
     * @return the networkDirectTechnology value.
     */
    public String networkDirectTechnology() {
        return this.networkDirectTechnology;
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
     * Reads an instance of HciEdgeDeviceAdapterPropertyOverrides from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HciEdgeDeviceAdapterPropertyOverrides if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HciEdgeDeviceAdapterPropertyOverrides.
     */
    public static HciEdgeDeviceAdapterPropertyOverrides fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HciEdgeDeviceAdapterPropertyOverrides deserializedHciEdgeDeviceAdapterPropertyOverrides
                = new HciEdgeDeviceAdapterPropertyOverrides();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jumboPacket".equals(fieldName)) {
                    deserializedHciEdgeDeviceAdapterPropertyOverrides.jumboPacket = reader.getString();
                } else if ("networkDirect".equals(fieldName)) {
                    deserializedHciEdgeDeviceAdapterPropertyOverrides.networkDirect = reader.getString();
                } else if ("networkDirectTechnology".equals(fieldName)) {
                    deserializedHciEdgeDeviceAdapterPropertyOverrides.networkDirectTechnology = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHciEdgeDeviceAdapterPropertyOverrides;
        });
    }
}
