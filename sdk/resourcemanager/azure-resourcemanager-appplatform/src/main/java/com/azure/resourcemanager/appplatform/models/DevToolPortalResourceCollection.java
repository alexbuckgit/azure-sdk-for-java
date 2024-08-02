// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appplatform.fluent.models.DevToolPortalResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Object that includes an array of Dev Tool Portal resources and a possible link for next set.
 */
@Fluent
public final class DevToolPortalResourceCollection implements JsonSerializable<DevToolPortalResourceCollection> {
    /*
     * Collection of Dev Tool Portal resources
     */
    private List<DevToolPortalResourceInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    private String nextLink;

    /**
     * Creates an instance of DevToolPortalResourceCollection class.
     */
    public DevToolPortalResourceCollection() {
    }

    /**
     * Get the value property: Collection of Dev Tool Portal resources.
     * 
     * @return the value value.
     */
    public List<DevToolPortalResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of Dev Tool Portal resources.
     * 
     * @param value the value value to set.
     * @return the DevToolPortalResourceCollection object itself.
     */
    public DevToolPortalResourceCollection withValue(List<DevToolPortalResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DevToolPortalResourceCollection object itself.
     */
    public DevToolPortalResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DevToolPortalResourceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DevToolPortalResourceCollection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DevToolPortalResourceCollection.
     */
    public static DevToolPortalResourceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DevToolPortalResourceCollection deserializedDevToolPortalResourceCollection
                = new DevToolPortalResourceCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DevToolPortalResourceInner> value
                        = reader.readArray(reader1 -> DevToolPortalResourceInner.fromJson(reader1));
                    deserializedDevToolPortalResourceCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDevToolPortalResourceCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDevToolPortalResourceCollection;
        });
    }
}
