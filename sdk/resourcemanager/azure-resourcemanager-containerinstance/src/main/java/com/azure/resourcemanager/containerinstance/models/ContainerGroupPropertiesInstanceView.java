// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The instance view of the container group. Only valid in response.
 */
@Immutable
public final class ContainerGroupPropertiesInstanceView
    implements JsonSerializable<ContainerGroupPropertiesInstanceView> {
    /*
     * The events of this container group.
     */
    private List<Event> events;

    /*
     * The state of the container group. Only valid in response.
     */
    private String state;

    /**
     * Creates an instance of ContainerGroupPropertiesInstanceView class.
     */
    public ContainerGroupPropertiesInstanceView() {
    }

    /**
     * Get the events property: The events of this container group.
     * 
     * @return the events value.
     */
    public List<Event> events() {
        return this.events;
    }

    /**
     * Get the state property: The state of the container group. Only valid in response.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContainerGroupPropertiesInstanceView from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContainerGroupPropertiesInstanceView if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContainerGroupPropertiesInstanceView.
     */
    public static ContainerGroupPropertiesInstanceView fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContainerGroupPropertiesInstanceView deserializedContainerGroupPropertiesInstanceView
                = new ContainerGroupPropertiesInstanceView();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("events".equals(fieldName)) {
                    List<Event> events = reader.readArray(reader1 -> Event.fromJson(reader1));
                    deserializedContainerGroupPropertiesInstanceView.events = events;
                } else if ("state".equals(fieldName)) {
                    deserializedContainerGroupPropertiesInstanceView.state = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainerGroupPropertiesInstanceView;
        });
    }
}
