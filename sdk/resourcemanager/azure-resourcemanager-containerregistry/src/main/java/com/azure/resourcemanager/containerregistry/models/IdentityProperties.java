// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Managed identity for the resource.
 */
@Fluent
public final class IdentityProperties implements JsonSerializable<IdentityProperties> {
    /*
     * The principal ID of resource identity.
     */
    private String principalId;

    /*
     * The tenant ID of resource.
     */
    private String tenantId;

    /*
     * The identity type.
     */
    private ResourceIdentityType type;

    /*
     * The list of user identities associated with the resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     * providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    private Map<String, UserIdentityProperties> userAssignedIdentities;

    /**
     * Creates an instance of IdentityProperties class.
     */
    public IdentityProperties() {
    }

    /**
     * Get the principalId property: The principal ID of resource identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of resource.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The identity type.
     * 
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     * 
     * @param type the type value to set.
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the resource. The user
     * identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     * providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserIdentityProperties> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the resource. The user
     * identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     * providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withUserAssignedIdentities(Map<String, UserIdentityProperties> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeMapField("userAssignedIdentities", this.userAssignedIdentities,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IdentityProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IdentityProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IdentityProperties.
     */
    public static IdentityProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IdentityProperties deserializedIdentityProperties = new IdentityProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedIdentityProperties.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedIdentityProperties.tenantId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIdentityProperties.type = ResourceIdentityType.fromString(reader.getString());
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    Map<String, UserIdentityProperties> userAssignedIdentities
                        = reader.readMap(reader1 -> UserIdentityProperties.fromJson(reader1));
                    deserializedIdentityProperties.userAssignedIdentities = userAssignedIdentities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIdentityProperties;
        });
    }
}
