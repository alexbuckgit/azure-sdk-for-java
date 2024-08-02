// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.fluent.models.CredentialSetInner;
import java.io.IOException;
import java.util.List;

/**
 * The result of a request to list credential sets for a container registry.
 */
@Fluent
public final class CredentialSetListResult implements JsonSerializable<CredentialSetListResult> {
    /*
     * The list of credential sets. Since this list may be incomplete, the nextLink field should be used to request the
     * next list of credential sets.
     */
    private List<CredentialSetInner> value;

    /*
     * The URI that can be used to request the next list of credential sets.
     */
    private String nextLink;

    /**
     * Creates an instance of CredentialSetListResult class.
     */
    public CredentialSetListResult() {
    }

    /**
     * Get the value property: The list of credential sets. Since this list may be incomplete, the nextLink field should
     * be used to request the next list of credential sets.
     * 
     * @return the value value.
     */
    public List<CredentialSetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of credential sets. Since this list may be incomplete, the nextLink field should
     * be used to request the next list of credential sets.
     * 
     * @param value the value value to set.
     * @return the CredentialSetListResult object itself.
     */
    public CredentialSetListResult withValue(List<CredentialSetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of credential sets.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of credential sets.
     * 
     * @param nextLink the nextLink value to set.
     * @return the CredentialSetListResult object itself.
     */
    public CredentialSetListResult withNextLink(String nextLink) {
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
     * Reads an instance of CredentialSetListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CredentialSetListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CredentialSetListResult.
     */
    public static CredentialSetListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CredentialSetListResult deserializedCredentialSetListResult = new CredentialSetListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<CredentialSetInner> value = reader.readArray(reader1 -> CredentialSetInner.fromJson(reader1));
                    deserializedCredentialSetListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCredentialSetListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCredentialSetListResult;
        });
    }
}
