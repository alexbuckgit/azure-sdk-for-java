// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.azurestackhci.models.UserAssignedIdentity;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * Managed service identity (system assigned and/or user assigned identities).
 */
@Fluent
public final class ManagedServiceIdentity implements JsonSerializable<ManagedServiceIdentity> {
    /*
     * The service principal ID of the system assigned identity. This property will only be provided for a system
     * assigned identity.
     */
    private UUID principalId;

    /*
     * The tenant ID of the system assigned identity. This property will only be provided for a system assigned
     * identity.
     */
    private UUID tenantId;

    /*
     * Type of managed service identity (where both SystemAssigned and UserAssigned types are allowed).
     */
    private ManagedServiceIdentityType type;

    /*
     * The set of user assigned identities associated with the resource. The userAssignedIdentities dictionary keys will
     * be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/
     * userAssignedIdentities/{identityName}. The dictionary values can be empty objects ({}) in requests.
     */
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of ManagedServiceIdentity class.
     */
    public ManagedServiceIdentity() {
    }

    /**
     * Get the principalId property: The service principal ID of the system assigned identity. This property will only
     * be provided for a system assigned identity.
     * 
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of the system assigned identity. This property will only be provided for
     * a system assigned identity.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: Type of managed service identity (where both SystemAssigned and UserAssigned types are
     * allowed).
     * 
     * @return the type value.
     */
    public ManagedServiceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of managed service identity (where both SystemAssigned and UserAssigned types are
     * allowed).
     * 
     * @param type the type value to set.
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withType(ManagedServiceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model ManagedServiceIdentity"));
        }
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedServiceIdentity.class);

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
     * Reads an instance of ManagedServiceIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedServiceIdentity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedServiceIdentity.
     */
    public static ManagedServiceIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedServiceIdentity deserializedManagedServiceIdentity = new ManagedServiceIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedManagedServiceIdentity.type = ManagedServiceIdentityType.fromString(reader.getString());
                } else if ("principalId".equals(fieldName)) {
                    deserializedManagedServiceIdentity.principalId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("tenantId".equals(fieldName)) {
                    deserializedManagedServiceIdentity.tenantId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    Map<String, UserAssignedIdentity> userAssignedIdentities
                        = reader.readMap(reader1 -> UserAssignedIdentity.fromJson(reader1));
                    deserializedManagedServiceIdentity.userAssignedIdentities = userAssignedIdentities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedServiceIdentity;
        });
    }
}
