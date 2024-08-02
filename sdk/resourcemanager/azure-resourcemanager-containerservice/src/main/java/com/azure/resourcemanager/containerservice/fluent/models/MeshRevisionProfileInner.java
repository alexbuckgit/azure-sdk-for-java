// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservice.models.MeshRevisionProfileProperties;
import java.io.IOException;

/**
 * Mesh revision profile for a mesh.
 */
@Fluent
public final class MeshRevisionProfileInner extends ProxyResource {
    /*
     * Mesh revision profile properties for a mesh
     */
    private MeshRevisionProfileProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Creates an instance of MeshRevisionProfileInner class.
     */
    public MeshRevisionProfileInner() {
    }

    /**
     * Get the properties property: Mesh revision profile properties for a mesh.
     * 
     * @return the properties value.
     */
    public MeshRevisionProfileProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Mesh revision profile properties for a mesh.
     * 
     * @param properties the properties value to set.
     * @return the MeshRevisionProfileInner object itself.
     */
    public MeshRevisionProfileInner withProperties(MeshRevisionProfileProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Reads an instance of MeshRevisionProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MeshRevisionProfileInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MeshRevisionProfileInner.
     */
    public static MeshRevisionProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MeshRevisionProfileInner deserializedMeshRevisionProfileInner = new MeshRevisionProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMeshRevisionProfileInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMeshRevisionProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMeshRevisionProfileInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedMeshRevisionProfileInner.properties = MeshRevisionProfileProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedMeshRevisionProfileInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMeshRevisionProfileInner;
        });
    }
}
