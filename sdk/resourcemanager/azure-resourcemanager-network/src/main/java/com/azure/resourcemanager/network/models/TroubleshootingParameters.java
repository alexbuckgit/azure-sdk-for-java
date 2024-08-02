// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.TroubleshootingProperties;
import java.io.IOException;

/**
 * Parameters that define the resource to troubleshoot.
 */
@Fluent
public final class TroubleshootingParameters implements JsonSerializable<TroubleshootingParameters> {
    /*
     * The target resource to troubleshoot.
     */
    private String targetResourceId;

    /*
     * Properties of the troubleshooting resource.
     */
    private TroubleshootingProperties innerProperties = new TroubleshootingProperties();

    /**
     * Creates an instance of TroubleshootingParameters class.
     */
    public TroubleshootingParameters() {
    }

    /**
     * Get the targetResourceId property: The target resource to troubleshoot.
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource to troubleshoot.
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the troubleshooting resource.
     * 
     * @return the innerProperties value.
     */
    private TroubleshootingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the storageId property: The ID for the storage account to save the troubleshoot result.
     * 
     * @return the storageId value.
     */
    public String storageId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageId();
    }

    /**
     * Set the storageId property: The ID for the storage account to save the troubleshoot result.
     * 
     * @param storageId the storageId value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStorageId(String storageId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TroubleshootingProperties();
        }
        this.innerProperties().withStorageId(storageId);
        return this;
    }

    /**
     * Get the storagePath property: The path to the blob to save the troubleshoot result in.
     * 
     * @return the storagePath value.
     */
    public String storagePath() {
        return this.innerProperties() == null ? null : this.innerProperties().storagePath();
    }

    /**
     * Set the storagePath property: The path to the blob to save the troubleshoot result in.
     * 
     * @param storagePath the storagePath value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStoragePath(String storagePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TroubleshootingProperties();
        }
        this.innerProperties().withStoragePath(storagePath);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetResourceId in model TroubleshootingParameters"));
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model TroubleshootingParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TroubleshootingParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetResourceId", this.targetResourceId);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TroubleshootingParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TroubleshootingParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TroubleshootingParameters.
     */
    public static TroubleshootingParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TroubleshootingParameters deserializedTroubleshootingParameters = new TroubleshootingParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetResourceId".equals(fieldName)) {
                    deserializedTroubleshootingParameters.targetResourceId = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedTroubleshootingParameters.innerProperties = TroubleshootingProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTroubleshootingParameters;
        });
    }
}
