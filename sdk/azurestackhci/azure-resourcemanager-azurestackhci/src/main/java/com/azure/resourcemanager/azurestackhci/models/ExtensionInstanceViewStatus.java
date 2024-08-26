// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Instance view status.
 */
@Fluent
public final class ExtensionInstanceViewStatus implements JsonSerializable<ExtensionInstanceViewStatus> {
    /*
     * The status code.
     */
    private String code;

    /*
     * The level code.
     */
    private StatusLevelTypes level;

    /*
     * The short localizable label for the status.
     */
    private String displayStatus;

    /*
     * The detailed status message, including for alerts and error messages.
     */
    private String message;

    /*
     * The time of the status.
     */
    private OffsetDateTime time;

    /**
     * Creates an instance of ExtensionInstanceViewStatus class.
     */
    public ExtensionInstanceViewStatus() {
    }

    /**
     * Get the code property: The status code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The status code.
     * 
     * @param code the code value to set.
     * @return the ExtensionInstanceViewStatus object itself.
     */
    public ExtensionInstanceViewStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the level property: The level code.
     * 
     * @return the level value.
     */
    public StatusLevelTypes level() {
        return this.level;
    }

    /**
     * Set the level property: The level code.
     * 
     * @param level the level value to set.
     * @return the ExtensionInstanceViewStatus object itself.
     */
    public ExtensionInstanceViewStatus withLevel(StatusLevelTypes level) {
        this.level = level;
        return this;
    }

    /**
     * Get the displayStatus property: The short localizable label for the status.
     * 
     * @return the displayStatus value.
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Set the displayStatus property: The short localizable label for the status.
     * 
     * @param displayStatus the displayStatus value to set.
     * @return the ExtensionInstanceViewStatus object itself.
     */
    public ExtensionInstanceViewStatus withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    /**
     * Get the message property: The detailed status message, including for alerts and error messages.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The detailed status message, including for alerts and error messages.
     * 
     * @param message the message value to set.
     * @return the ExtensionInstanceViewStatus object itself.
     */
    public ExtensionInstanceViewStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the time property: The time of the status.
     * 
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Set the time property: The time of the status.
     * 
     * @param time the time value to set.
     * @return the ExtensionInstanceViewStatus object itself.
     */
    public ExtensionInstanceViewStatus withTime(OffsetDateTime time) {
        this.time = time;
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
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("level", this.level == null ? null : this.level.toString());
        jsonWriter.writeStringField("displayStatus", this.displayStatus);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("time",
            this.time == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.time));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionInstanceViewStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionInstanceViewStatus if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionInstanceViewStatus.
     */
    public static ExtensionInstanceViewStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionInstanceViewStatus deserializedExtensionInstanceViewStatus = new ExtensionInstanceViewStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedExtensionInstanceViewStatus.code = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedExtensionInstanceViewStatus.level = StatusLevelTypes.fromString(reader.getString());
                } else if ("displayStatus".equals(fieldName)) {
                    deserializedExtensionInstanceViewStatus.displayStatus = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedExtensionInstanceViewStatus.message = reader.getString();
                } else if ("time".equals(fieldName)) {
                    deserializedExtensionInstanceViewStatus.time = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionInstanceViewStatus;
        });
    }
}
