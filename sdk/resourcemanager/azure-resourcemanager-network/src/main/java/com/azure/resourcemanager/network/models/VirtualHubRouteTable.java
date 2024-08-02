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
import java.util.List;

/**
 * VirtualHub route table.
 */
@Fluent
public final class VirtualHubRouteTable implements JsonSerializable<VirtualHubRouteTable> {
    /*
     * List of all routes.
     */
    private List<VirtualHubRoute> routes;

    /**
     * Creates an instance of VirtualHubRouteTable class.
     */
    public VirtualHubRouteTable() {
    }

    /**
     * Get the routes property: List of all routes.
     * 
     * @return the routes value.
     */
    public List<VirtualHubRoute> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: List of all routes.
     * 
     * @param routes the routes value to set.
     * @return the VirtualHubRouteTable object itself.
     */
    public VirtualHubRouteTable withRoutes(List<VirtualHubRoute> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("routes", this.routes, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualHubRouteTable from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualHubRouteTable if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualHubRouteTable.
     */
    public static VirtualHubRouteTable fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualHubRouteTable deserializedVirtualHubRouteTable = new VirtualHubRouteTable();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("routes".equals(fieldName)) {
                    List<VirtualHubRoute> routes = reader.readArray(reader1 -> VirtualHubRoute.fromJson(reader1));
                    deserializedVirtualHubRouteTable.routes = routes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualHubRouteTable;
        });
    }
}
