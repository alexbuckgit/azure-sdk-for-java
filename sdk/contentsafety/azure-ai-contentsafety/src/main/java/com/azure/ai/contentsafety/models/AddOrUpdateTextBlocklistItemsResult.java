// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The response of adding blocklistItems to the text blocklist.
 */
@Immutable
public final class AddOrUpdateTextBlocklistItemsResult
    implements JsonSerializable<AddOrUpdateTextBlocklistItemsResult> {

    /*
     * Array of blocklistItems have been added.
     */
    @Generated
    private final List<TextBlocklistItem> blocklistItems;

    /**
     * Creates an instance of AddOrUpdateTextBlocklistItemsResult class.
     *
     * @param blocklistItems the blocklistItems value to set.
     */
    @Generated
    private AddOrUpdateTextBlocklistItemsResult(List<TextBlocklistItem> blocklistItems) {
        this.blocklistItems = blocklistItems;
    }

    /**
     * Get the blocklistItems property: Array of blocklistItems have been added.
     *
     * @return the blocklistItems value.
     */
    @Generated
    public List<TextBlocklistItem> getBlocklistItems() {
        return this.blocklistItems;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("blocklistItems", this.blocklistItems,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AddOrUpdateTextBlocklistItemsResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AddOrUpdateTextBlocklistItemsResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AddOrUpdateTextBlocklistItemsResult.
     */
    @Generated
    public static AddOrUpdateTextBlocklistItemsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<TextBlocklistItem> blocklistItems = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("blocklistItems".equals(fieldName)) {
                    blocklistItems = reader.readArray(reader1 -> TextBlocklistItem.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new AddOrUpdateTextBlocklistItemsResult(blocklistItems);
        });
    }
}
