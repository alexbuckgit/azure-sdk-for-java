// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitRoutesTable;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListRoutesTable associated with the Express Route Circuits API.
 */
@Fluent
public final class ExpressRouteCircuitsRoutesTableListResultInner
    implements JsonSerializable<ExpressRouteCircuitsRoutesTableListResultInner> {
    /*
     * The list of routes table.
     */
    private List<ExpressRouteCircuitRoutesTable> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteCircuitsRoutesTableListResultInner class.
     */
    public ExpressRouteCircuitsRoutesTableListResultInner() {
    }

    /**
     * Get the value property: The list of routes table.
     * 
     * @return the value value.
     */
    public List<ExpressRouteCircuitRoutesTable> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of routes table.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteCircuitsRoutesTableListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableListResultInner withValue(List<ExpressRouteCircuitRoutesTable> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteCircuitsRoutesTableListResultInner object itself.
     */
    public ExpressRouteCircuitsRoutesTableListResultInner withNextLink(String nextLink) {
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
     * Reads an instance of ExpressRouteCircuitsRoutesTableListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCircuitsRoutesTableListResultInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteCircuitsRoutesTableListResultInner.
     */
    public static ExpressRouteCircuitsRoutesTableListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCircuitsRoutesTableListResultInner deserializedExpressRouteCircuitsRoutesTableListResultInner
                = new ExpressRouteCircuitsRoutesTableListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ExpressRouteCircuitRoutesTable> value
                        = reader.readArray(reader1 -> ExpressRouteCircuitRoutesTable.fromJson(reader1));
                    deserializedExpressRouteCircuitsRoutesTableListResultInner.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedExpressRouteCircuitsRoutesTableListResultInner.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCircuitsRoutesTableListResultInner;
        });
    }
}
