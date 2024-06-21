// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the error happened when create or update an image template.
 */
@Fluent
public final class ProvisioningError implements JsonSerializable<ProvisioningError> {
    /*
     * Error code of the provisioning failure
     */
    private ProvisioningErrorCode provisioningErrorCode;

    /*
     * Verbose error message about the provisioning failure
     */
    private String message;

    /**
     * Creates an instance of ProvisioningError class.
     */
    public ProvisioningError() {
    }

    /**
     * Get the provisioningErrorCode property: Error code of the provisioning failure.
     * 
     * @return the provisioningErrorCode value.
     */
    public ProvisioningErrorCode provisioningErrorCode() {
        return this.provisioningErrorCode;
    }

    /**
     * Set the provisioningErrorCode property: Error code of the provisioning failure.
     * 
     * @param provisioningErrorCode the provisioningErrorCode value to set.
     * @return the ProvisioningError object itself.
     */
    public ProvisioningError withProvisioningErrorCode(ProvisioningErrorCode provisioningErrorCode) {
        this.provisioningErrorCode = provisioningErrorCode;
        return this;
    }

    /**
     * Get the message property: Verbose error message about the provisioning failure.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Verbose error message about the provisioning failure.
     * 
     * @param message the message value to set.
     * @return the ProvisioningError object itself.
     */
    public ProvisioningError withMessage(String message) {
        this.message = message;
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
        jsonWriter.writeStringField("provisioningErrorCode",
            this.provisioningErrorCode == null ? null : this.provisioningErrorCode.toString());
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProvisioningError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProvisioningError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProvisioningError.
     */
    public static ProvisioningError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProvisioningError deserializedProvisioningError = new ProvisioningError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningErrorCode".equals(fieldName)) {
                    deserializedProvisioningError.provisioningErrorCode
                        = ProvisioningErrorCode.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedProvisioningError.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProvisioningError;
        });
    }
}
