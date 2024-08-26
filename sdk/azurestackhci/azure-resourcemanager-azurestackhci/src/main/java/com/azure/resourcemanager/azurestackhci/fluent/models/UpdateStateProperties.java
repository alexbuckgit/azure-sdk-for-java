// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Additional information regarding the state of the update. See definition of UpdateStateProperties type below for more
 * details on this property.
 */
@Fluent
public final class UpdateStateProperties implements JsonSerializable<UpdateStateProperties> {
    /*
     * Progress percentage of ongoing operation. Currently this property is only valid when the update is in the
     * Downloading state, where it maps to how much of the update content has been downloaded.
     */
    private Float progressPercentage;

    /*
     * Brief message with instructions for updates of AvailabilityType Notify.
     */
    private String notifyMessage;

    /**
     * Creates an instance of UpdateStateProperties class.
     */
    public UpdateStateProperties() {
    }

    /**
     * Get the progressPercentage property: Progress percentage of ongoing operation. Currently this property is only
     * valid when the update is in the Downloading state, where it maps to how much of the update content has been
     * downloaded.
     * 
     * @return the progressPercentage value.
     */
    public Float progressPercentage() {
        return this.progressPercentage;
    }

    /**
     * Set the progressPercentage property: Progress percentage of ongoing operation. Currently this property is only
     * valid when the update is in the Downloading state, where it maps to how much of the update content has been
     * downloaded.
     * 
     * @param progressPercentage the progressPercentage value to set.
     * @return the UpdateStateProperties object itself.
     */
    public UpdateStateProperties withProgressPercentage(Float progressPercentage) {
        this.progressPercentage = progressPercentage;
        return this;
    }

    /**
     * Get the notifyMessage property: Brief message with instructions for updates of AvailabilityType Notify.
     * 
     * @return the notifyMessage value.
     */
    public String notifyMessage() {
        return this.notifyMessage;
    }

    /**
     * Set the notifyMessage property: Brief message with instructions for updates of AvailabilityType Notify.
     * 
     * @param notifyMessage the notifyMessage value to set.
     * @return the UpdateStateProperties object itself.
     */
    public UpdateStateProperties withNotifyMessage(String notifyMessage) {
        this.notifyMessage = notifyMessage;
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
        jsonWriter.writeNumberField("progressPercentage", this.progressPercentage);
        jsonWriter.writeStringField("notifyMessage", this.notifyMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateStateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateStateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateStateProperties.
     */
    public static UpdateStateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateStateProperties deserializedUpdateStateProperties = new UpdateStateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("progressPercentage".equals(fieldName)) {
                    deserializedUpdateStateProperties.progressPercentage = reader.getNullable(JsonReader::getFloat);
                } else if ("notifyMessage".equals(fieldName)) {
                    deserializedUpdateStateProperties.notifyMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateStateProperties;
        });
    }
}
