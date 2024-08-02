// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ChildResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * The network group resource.
 */
@Fluent
public final class NetworkGroupInner extends ChildResource {
    /*
     * The Network Group properties
     */
    private NetworkGroupProperties innerProperties;

    /*
     * The system metadata related to this resource.
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

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of NetworkGroupInner class.
     */
    public NetworkGroupInner() {
    }

    /**
     * Get the innerProperties property: The Network Group properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
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
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    @Override
    public String etag() {
        return this.etag;
    }

    /**
     * Get the description property: A description of the network group.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the network group.
     * 
     * @param description the description value to set.
     * @return the NetworkGroupInner object itself.
     */
    public NetworkGroupInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkGroupProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the scope assignment resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkGroupInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkGroupInner.
     */
    public static NetworkGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkGroupInner deserializedNetworkGroupInner = new NetworkGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkGroupInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNetworkGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetworkGroupInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedNetworkGroupInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkGroupInner.innerProperties = NetworkGroupProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedNetworkGroupInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkGroupInner;
        });
    }
}
