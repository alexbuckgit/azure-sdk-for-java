// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The name of the SKU supported by Azure AI Search.
 */
@Fluent
public final class QuotaUsageResultName implements JsonSerializable<QuotaUsageResultName> {
    /*
     * The SKU name supported by Azure AI Search.
     */
    private String value;

    /*
     * The localized string value for the SKU name.
     */
    private String localizedValue;

    /**
     * Creates an instance of QuotaUsageResultName class.
     */
    public QuotaUsageResultName() {
    }

    /**
     * Get the value property: The SKU name supported by Azure AI Search.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The SKU name supported by Azure AI Search.
     * 
     * @param value the value value to set.
     * @return the QuotaUsageResultName object itself.
     */
    public QuotaUsageResultName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: The localized string value for the SKU name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: The localized string value for the SKU name.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the QuotaUsageResultName object itself.
     */
    public QuotaUsageResultName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("localizedValue", this.localizedValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuotaUsageResultName from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaUsageResultName if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the QuotaUsageResultName.
     */
    public static QuotaUsageResultName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuotaUsageResultName deserializedQuotaUsageResultName = new QuotaUsageResultName();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedQuotaUsageResultName.value = reader.getString();
                } else if ("localizedValue".equals(fieldName)) {
                    deserializedQuotaUsageResultName.localizedValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuotaUsageResultName;
        });
    }
}
