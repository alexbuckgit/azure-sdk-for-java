// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SyncSetProperties represents the properties of a SyncSet.
 */
@Fluent
public final class SyncIdentityProviderProperties implements JsonSerializable<SyncIdentityProviderProperties> {
    /*
     * The resources property.
     */
    private String resources;

    /**
     * Creates an instance of SyncIdentityProviderProperties class.
     */
    public SyncIdentityProviderProperties() {
    }

    /**
     * Get the resources property: The resources property.
     * 
     * @return the resources value.
     */
    public String resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The resources property.
     * 
     * @param resources the resources value to set.
     * @return the SyncIdentityProviderProperties object itself.
     */
    public SyncIdentityProviderProperties withResources(String resources) {
        this.resources = resources;
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
        jsonWriter.writeStringField("resources", this.resources);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SyncIdentityProviderProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SyncIdentityProviderProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SyncIdentityProviderProperties.
     */
    public static SyncIdentityProviderProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SyncIdentityProviderProperties deserializedSyncIdentityProviderProperties
                = new SyncIdentityProviderProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resources".equals(fieldName)) {
                    deserializedSyncIdentityProviderProperties.resources = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSyncIdentityProviderProperties;
        });
    }
}
