// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * Describes a system assigned identity resource.
 */
@Fluent
public final class SystemAssignedIdentityInner extends ProxyResource {
    /*
     * The geo-location where the resource lives
     */
    private String location;

    /*
     * Resource tags
     */
    private Map<String, String> tags;

    /*
     * The properties associated with the identity.
     */
    private SystemAssignedIdentityProperties innerProperties;

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
     * Creates an instance of SystemAssignedIdentityInner class.
     */
    public SystemAssignedIdentityInner() {
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     * 
     * @param location the location value to set.
     * @return the SystemAssignedIdentityInner object itself.
     */
    public SystemAssignedIdentityInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the SystemAssignedIdentityInner object itself.
     */
    public SystemAssignedIdentityInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The properties associated with the identity.
     * 
     * @return the innerProperties value.
     */
    private SystemAssignedIdentityProperties innerProperties() {
        return this.innerProperties;
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
     * Get the tenantId property: The id of the tenant which the identity belongs to.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Get the principalId property: The id of the service principal object associated with the created identity.
     * 
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Get the clientId property: The id of the app associated with the identity. This is a random generated UUID by
     * MSI.
     * 
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientId();
    }

    /**
     * Get the clientSecretUrl property: The ManagedServiceIdentity DataPlane URL that can be queried to obtain the
     * identity credentials.
     * 
     * @return the clientSecretUrl value.
     */
    public String clientSecretUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecretUrl();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model SystemAssignedIdentityInner"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SystemAssignedIdentityInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SystemAssignedIdentityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SystemAssignedIdentityInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SystemAssignedIdentityInner.
     */
    public static SystemAssignedIdentityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SystemAssignedIdentityInner deserializedSystemAssignedIdentityInner = new SystemAssignedIdentityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSystemAssignedIdentityInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSystemAssignedIdentityInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSystemAssignedIdentityInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSystemAssignedIdentityInner.location = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSystemAssignedIdentityInner.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedSystemAssignedIdentityInner.innerProperties
                        = SystemAssignedIdentityProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSystemAssignedIdentityInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSystemAssignedIdentityInner;
        });
    }
}
