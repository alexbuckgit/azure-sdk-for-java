// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Log file URL payload.
 */
@Fluent
public final class LogFileUrlResponseInner implements JsonSerializable<LogFileUrlResponseInner> {
    /*
     * URL of the log file
     */
    private String url;

    /**
     * Creates an instance of LogFileUrlResponseInner class.
     */
    public LogFileUrlResponseInner() {
    }

    /**
     * Get the url property: URL of the log file.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL of the log file.
     * 
     * @param url the url value to set.
     * @return the LogFileUrlResponseInner object itself.
     */
    public LogFileUrlResponseInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property url in model LogFileUrlResponseInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogFileUrlResponseInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("url", this.url);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogFileUrlResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogFileUrlResponseInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LogFileUrlResponseInner.
     */
    public static LogFileUrlResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogFileUrlResponseInner deserializedLogFileUrlResponseInner = new LogFileUrlResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("url".equals(fieldName)) {
                    deserializedLogFileUrlResponseInner.url = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogFileUrlResponseInner;
        });
    }
}
