// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservice.fluent.models.MaintenanceConfigurationInner;
import java.io.IOException;
import java.util.List;

/**
 * The response from the List maintenance configurations operation.
 */
@Fluent
public final class MaintenanceConfigurationListResult implements JsonSerializable<MaintenanceConfigurationListResult> {
    /*
     * The list of maintenance configurations.
     */
    private List<MaintenanceConfigurationInner> value;

    /*
     * The URL to get the next set of maintenance configuration results.
     */
    private String nextLink;

    /**
     * Creates an instance of MaintenanceConfigurationListResult class.
     */
    public MaintenanceConfigurationListResult() {
    }

    /**
     * Get the value property: The list of maintenance configurations.
     * 
     * @return the value value.
     */
    public List<MaintenanceConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of maintenance configurations.
     * 
     * @param value the value value to set.
     * @return the MaintenanceConfigurationListResult object itself.
     */
    public MaintenanceConfigurationListResult withValue(List<MaintenanceConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of maintenance configuration results.
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
     * Reads an instance of MaintenanceConfigurationListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaintenanceConfigurationListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaintenanceConfigurationListResult.
     */
    public static MaintenanceConfigurationListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaintenanceConfigurationListResult deserializedMaintenanceConfigurationListResult
                = new MaintenanceConfigurationListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<MaintenanceConfigurationInner> value
                        = reader.readArray(reader1 -> MaintenanceConfigurationInner.fromJson(reader1));
                    deserializedMaintenanceConfigurationListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedMaintenanceConfigurationListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMaintenanceConfigurationListResult;
        });
    }
}
