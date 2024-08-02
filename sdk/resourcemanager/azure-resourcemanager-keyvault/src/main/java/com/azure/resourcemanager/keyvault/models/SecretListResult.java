// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.keyvault.fluent.models.SecretInner;
import java.io.IOException;
import java.util.List;

/**
 * List of secrets.
 */
@Fluent
public final class SecretListResult implements JsonSerializable<SecretListResult> {
    /*
     * The list of secrets.
     */
    private List<SecretInner> value;

    /*
     * The URL to get the next set of secrets.
     */
    private String nextLink;

    /**
     * Creates an instance of SecretListResult class.
     */
    public SecretListResult() {
    }

    /**
     * Get the value property: The list of secrets.
     * 
     * @return the value value.
     */
    public List<SecretInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of secrets.
     * 
     * @param value the value value to set.
     * @return the SecretListResult object itself.
     */
    public SecretListResult withValue(List<SecretInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of secrets.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of secrets.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SecretListResult object itself.
     */
    public SecretListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecretListResult.
     */
    public static SecretListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretListResult deserializedSecretListResult = new SecretListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SecretInner> value = reader.readArray(reader1 -> SecretInner.fromJson(reader1));
                    deserializedSecretListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSecretListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretListResult;
        });
    }
}
