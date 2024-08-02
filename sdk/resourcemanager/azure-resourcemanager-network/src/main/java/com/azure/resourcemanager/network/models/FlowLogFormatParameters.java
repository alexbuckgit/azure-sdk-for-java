// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters that define the flow log format.
 */
@Fluent
public final class FlowLogFormatParameters implements JsonSerializable<FlowLogFormatParameters> {
    /*
     * The file type of flow log.
     */
    private FlowLogFormatType type;

    /*
     * The version (revision) of the flow log.
     */
    private Integer version;

    /**
     * Creates an instance of FlowLogFormatParameters class.
     */
    public FlowLogFormatParameters() {
    }

    /**
     * Get the type property: The file type of flow log.
     * 
     * @return the type value.
     */
    public FlowLogFormatType type() {
        return this.type;
    }

    /**
     * Set the type property: The file type of flow log.
     * 
     * @param type the type value to set.
     * @return the FlowLogFormatParameters object itself.
     */
    public FlowLogFormatParameters withType(FlowLogFormatType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version property: The version (revision) of the flow log.
     * 
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version property: The version (revision) of the flow log.
     * 
     * @param version the version value to set.
     * @return the FlowLogFormatParameters object itself.
     */
    public FlowLogFormatParameters withVersion(Integer version) {
        this.version = version;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeNumberField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FlowLogFormatParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FlowLogFormatParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FlowLogFormatParameters.
     */
    public static FlowLogFormatParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FlowLogFormatParameters deserializedFlowLogFormatParameters = new FlowLogFormatParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedFlowLogFormatParameters.type = FlowLogFormatType.fromString(reader.getString());
                } else if ("version".equals(fieldName)) {
                    deserializedFlowLogFormatParameters.version = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFlowLogFormatParameters;
        });
    }
}
