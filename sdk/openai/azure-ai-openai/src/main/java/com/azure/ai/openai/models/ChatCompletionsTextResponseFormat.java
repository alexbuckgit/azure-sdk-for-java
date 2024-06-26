// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The standard Chat Completions response format that can freely generate text and is not guaranteed to produce response
 * content that adheres to a specific schema.
 */
@Immutable
public final class ChatCompletionsTextResponseFormat extends ChatCompletionsResponseFormat {

    /**
     * Creates an instance of ChatCompletionsTextResponseFormat class.
     */
    @Generated
    public ChatCompletionsTextResponseFormat() {
    }

    /*
     * The discriminated type for the response format.
     */
    @Generated
    private String type = "text";

    /**
     * Get the type property: The discriminated type for the response format.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionsTextResponseFormat from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionsTextResponseFormat if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ChatCompletionsTextResponseFormat.
     */
    @Generated
    public static ChatCompletionsTextResponseFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatCompletionsTextResponseFormat deserializedChatCompletionsTextResponseFormat
                = new ChatCompletionsTextResponseFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedChatCompletionsTextResponseFormat.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedChatCompletionsTextResponseFormat;
        });
    }
}
