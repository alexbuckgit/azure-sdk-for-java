// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appplatform.models.ApplicationLiveViewProperties;
import java.io.IOException;

/**
 * Application Live View resource.
 */
@Fluent
public final class ApplicationLiveViewResourceInner extends ProxyResource {
    /*
     * Application Live View properties payload
     */
    private ApplicationLiveViewProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ApplicationLiveViewResourceInner class.
     */
    public ApplicationLiveViewResourceInner() {
    }

    /**
     * Get the properties property: Application Live View properties payload.
     * 
     * @return the properties value.
     */
    public ApplicationLiveViewProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Application Live View properties payload.
     * 
     * @param properties the properties value to set.
     * @return the ApplicationLiveViewResourceInner object itself.
     */
    public ApplicationLiveViewResourceInner withProperties(ApplicationLiveViewProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationLiveViewResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationLiveViewResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationLiveViewResourceInner.
     */
    public static ApplicationLiveViewResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationLiveViewResourceInner deserializedApplicationLiveViewResourceInner
                = new ApplicationLiveViewResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationLiveViewResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedApplicationLiveViewResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationLiveViewResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationLiveViewResourceInner.properties
                        = ApplicationLiveViewProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedApplicationLiveViewResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationLiveViewResourceInner;
        });
    }
}
