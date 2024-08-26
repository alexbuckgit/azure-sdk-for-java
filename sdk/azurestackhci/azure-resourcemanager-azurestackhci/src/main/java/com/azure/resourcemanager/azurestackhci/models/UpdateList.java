// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.fluent.models.HciUpdateInner;
import java.io.IOException;
import java.util.List;

/**
 * List of Updates.
 */
@Fluent
public final class UpdateList implements JsonSerializable<UpdateList> {
    /*
     * List of Updates
     */
    private List<HciUpdateInner> value;

    /*
     * Link to the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of UpdateList class.
     */
    public UpdateList() {
    }

    /**
     * Get the value property: List of Updates.
     * 
     * @return the value value.
     */
    public List<HciUpdateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Updates.
     * 
     * @param value the value value to set.
     * @return the UpdateList object itself.
     */
    public UpdateList withValue(List<HciUpdateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateList if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the UpdateList.
     */
    public static UpdateList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateList deserializedUpdateList = new UpdateList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<HciUpdateInner> value = reader.readArray(reader1 -> HciUpdateInner.fromJson(reader1));
                    deserializedUpdateList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedUpdateList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateList;
        });
    }
}
