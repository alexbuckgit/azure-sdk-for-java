// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the Power State of the cluster.
 */
@Fluent
public final class PowerState implements JsonSerializable<PowerState> {
    /*
     * Tells whether the cluster is Running or Stopped
     */
    private Code code;

    /**
     * Creates an instance of PowerState class.
     */
    public PowerState() {
    }

    /**
     * Get the code property: Tells whether the cluster is Running or Stopped.
     * 
     * @return the code value.
     */
    public Code code() {
        return this.code;
    }

    /**
     * Set the code property: Tells whether the cluster is Running or Stopped.
     * 
     * @param code the code value to set.
     * @return the PowerState object itself.
     */
    public PowerState withCode(Code code) {
        this.code = code;
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
        jsonWriter.writeStringField("code", this.code == null ? null : this.code.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PowerState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PowerState if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the PowerState.
     */
    public static PowerState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PowerState deserializedPowerState = new PowerState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedPowerState.code = Code.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPowerState;
        });
    }
}
