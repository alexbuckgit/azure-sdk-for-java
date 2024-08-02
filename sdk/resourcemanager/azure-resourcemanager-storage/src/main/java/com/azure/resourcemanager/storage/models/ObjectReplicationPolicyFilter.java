// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Filters limit replication to a subset of blobs within the storage account. A logical OR is performed on values in the
 * filter. If multiple filters are defined, a logical AND is performed on all filters.
 */
@Fluent
public final class ObjectReplicationPolicyFilter implements JsonSerializable<ObjectReplicationPolicyFilter> {
    /*
     * Optional. Filters the results to replicate only blobs whose names begin with the specified prefix.
     */
    private List<String> prefixMatch;

    /*
     * Blobs created after the time will be replicated to the destination. It must be in datetime format
     * 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z
     */
    private String minCreationTime;

    /**
     * Creates an instance of ObjectReplicationPolicyFilter class.
     */
    public ObjectReplicationPolicyFilter() {
    }

    /**
     * Get the prefixMatch property: Optional. Filters the results to replicate only blobs whose names begin with the
     * specified prefix.
     * 
     * @return the prefixMatch value.
     */
    public List<String> prefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set the prefixMatch property: Optional. Filters the results to replicate only blobs whose names begin with the
     * specified prefix.
     * 
     * @param prefixMatch the prefixMatch value to set.
     * @return the ObjectReplicationPolicyFilter object itself.
     */
    public ObjectReplicationPolicyFilter withPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get the minCreationTime property: Blobs created after the time will be replicated to the destination. It must be
     * in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z.
     * 
     * @return the minCreationTime value.
     */
    public String minCreationTime() {
        return this.minCreationTime;
    }

    /**
     * Set the minCreationTime property: Blobs created after the time will be replicated to the destination. It must be
     * in datetime format 'yyyy-MM-ddTHH:mm:ssZ'. Example: 2020-02-19T16:05:00Z.
     * 
     * @param minCreationTime the minCreationTime value to set.
     * @return the ObjectReplicationPolicyFilter object itself.
     */
    public ObjectReplicationPolicyFilter withMinCreationTime(String minCreationTime) {
        this.minCreationTime = minCreationTime;
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
        jsonWriter.writeArrayField("prefixMatch", this.prefixMatch, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("minCreationTime", this.minCreationTime);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObjectReplicationPolicyFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObjectReplicationPolicyFilter if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ObjectReplicationPolicyFilter.
     */
    public static ObjectReplicationPolicyFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObjectReplicationPolicyFilter deserializedObjectReplicationPolicyFilter
                = new ObjectReplicationPolicyFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prefixMatch".equals(fieldName)) {
                    List<String> prefixMatch = reader.readArray(reader1 -> reader1.getString());
                    deserializedObjectReplicationPolicyFilter.prefixMatch = prefixMatch;
                } else if ("minCreationTime".equals(fieldName)) {
                    deserializedObjectReplicationPolicyFilter.minCreationTime = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedObjectReplicationPolicyFilter;
        });
    }
}
