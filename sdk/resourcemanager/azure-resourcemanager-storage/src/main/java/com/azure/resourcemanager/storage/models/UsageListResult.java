// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.fluent.models.UsageInner;
import java.io.IOException;
import java.util.List;

/**
 * The response from the List Usages operation.
 */
@Fluent
public final class UsageListResult implements JsonSerializable<UsageListResult> {
    /*
     * Gets or sets the list of Storage Resource Usages.
     */
    private List<UsageInner> value;

    /**
     * Creates an instance of UsageListResult class.
     */
    public UsageListResult() {
    }

    /**
     * Get the value property: Gets or sets the list of Storage Resource Usages.
     * 
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the list of Storage Resource Usages.
     * 
     * @param value the value value to set.
     * @return the UsageListResult object itself.
     */
    public UsageListResult withValue(List<UsageInner> value) {
        this.value = value;
        return this;
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
     * Reads an instance of UsageListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UsageListResult.
     */
    public static UsageListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageListResult deserializedUsageListResult = new UsageListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<UsageInner> value = reader.readArray(reader1 -> UsageInner.fromJson(reader1));
                    deserializedUsageListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageListResult;
        });
    }
}
