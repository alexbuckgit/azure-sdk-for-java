// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.search.models.OperationDisplay;
import java.io.IOException;

/**
 * Describes a REST API operation.
 */
@Immutable
public final class OperationInner implements JsonSerializable<OperationInner> {
    /*
     * The name of the operation. This name is of the form {provider}/{resource}/{operation}.
     */
    private String name;

    /*
     * The object that describes the operation.
     */
    private OperationDisplay display;

    /**
     * Creates an instance of OperationInner class.
     */
    public OperationInner() {
    }

    /**
     * Get the name property: The name of the operation. This name is of the form {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: The object that describes the operation.
     * 
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
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
     * Reads an instance of OperationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationInner.
     */
    public static OperationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationInner deserializedOperationInner = new OperationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOperationInner.name = reader.getString();
                } else if ("display".equals(fieldName)) {
                    deserializedOperationInner.display = OperationDisplay.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationInner;
        });
    }
}
