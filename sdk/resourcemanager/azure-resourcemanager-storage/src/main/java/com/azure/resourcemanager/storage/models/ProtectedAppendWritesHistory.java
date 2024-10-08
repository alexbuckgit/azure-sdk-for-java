// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Protected append writes history setting for the blob container with Legal holds.
 */
@Fluent
public final class ProtectedAppendWritesHistory implements JsonSerializable<ProtectedAppendWritesHistory> {
    /*
     * When enabled, new blocks can be written to both 'Append and Bock Blobs' while maintaining legal hold protection
     * and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted.
     */
    private Boolean allowProtectedAppendWritesAll;

    /*
     * Returns the date and time the tag was added.
     */
    private OffsetDateTime timestamp;

    /**
     * Creates an instance of ProtectedAppendWritesHistory class.
     */
    public ProtectedAppendWritesHistory() {
    }

    /**
     * Get the allowProtectedAppendWritesAll property: When enabled, new blocks can be written to both 'Append and Bock
     * Blobs' while maintaining legal hold protection and compliance. Only new blocks can be added and any existing
     * blocks cannot be modified or deleted.
     * 
     * @return the allowProtectedAppendWritesAll value.
     */
    public Boolean allowProtectedAppendWritesAll() {
        return this.allowProtectedAppendWritesAll;
    }

    /**
     * Set the allowProtectedAppendWritesAll property: When enabled, new blocks can be written to both 'Append and Bock
     * Blobs' while maintaining legal hold protection and compliance. Only new blocks can be added and any existing
     * blocks cannot be modified or deleted.
     * 
     * @param allowProtectedAppendWritesAll the allowProtectedAppendWritesAll value to set.
     * @return the ProtectedAppendWritesHistory object itself.
     */
    public ProtectedAppendWritesHistory withAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        this.allowProtectedAppendWritesAll = allowProtectedAppendWritesAll;
        return this;
    }

    /**
     * Get the timestamp property: Returns the date and time the tag was added.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
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
        jsonWriter.writeBooleanField("allowProtectedAppendWritesAll", this.allowProtectedAppendWritesAll);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProtectedAppendWritesHistory from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProtectedAppendWritesHistory if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProtectedAppendWritesHistory.
     */
    public static ProtectedAppendWritesHistory fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProtectedAppendWritesHistory deserializedProtectedAppendWritesHistory = new ProtectedAppendWritesHistory();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allowProtectedAppendWritesAll".equals(fieldName)) {
                    deserializedProtectedAppendWritesHistory.allowProtectedAppendWritesAll
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("timestamp".equals(fieldName)) {
                    deserializedProtectedAppendWritesHistory.timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProtectedAppendWritesHistory;
        });
    }
}
