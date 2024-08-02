// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.RouteMapInner;
import java.io.IOException;
import java.util.List;

/**
 * List of RouteMaps and a URL nextLink to get the next set of results.
 */
@Fluent
public final class ListRouteMapsResult implements JsonSerializable<ListRouteMapsResult> {
    /*
     * List of RouteMaps.
     */
    private List<RouteMapInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ListRouteMapsResult class.
     */
    public ListRouteMapsResult() {
    }

    /**
     * Get the value property: List of RouteMaps.
     * 
     * @return the value value.
     */
    public List<RouteMapInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of RouteMaps.
     * 
     * @param value the value value to set.
     * @return the ListRouteMapsResult object itself.
     */
    public ListRouteMapsResult withValue(List<RouteMapInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListRouteMapsResult object itself.
     */
    public ListRouteMapsResult withNextLink(String nextLink) {
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
     * Reads an instance of ListRouteMapsResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListRouteMapsResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListRouteMapsResult.
     */
    public static ListRouteMapsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListRouteMapsResult deserializedListRouteMapsResult = new ListRouteMapsResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RouteMapInner> value = reader.readArray(reader1 -> RouteMapInner.fromJson(reader1));
                    deserializedListRouteMapsResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListRouteMapsResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListRouteMapsResult;
        });
    }
}
