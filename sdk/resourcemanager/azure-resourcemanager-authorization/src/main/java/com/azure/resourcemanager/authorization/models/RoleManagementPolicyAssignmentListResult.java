// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.authorization.fluent.models.RoleManagementPolicyAssignmentInner;
import java.io.IOException;
import java.util.List;

/**
 * Role management policy assignment list operation result.
 */
@Fluent
public final class RoleManagementPolicyAssignmentListResult
    implements JsonSerializable<RoleManagementPolicyAssignmentListResult> {
    /*
     * Role management policy assignment list.
     */
    private List<RoleManagementPolicyAssignmentInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of RoleManagementPolicyAssignmentListResult class.
     */
    public RoleManagementPolicyAssignmentListResult() {
    }

    /**
     * Get the value property: Role management policy assignment list.
     * 
     * @return the value value.
     */
    public List<RoleManagementPolicyAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Role management policy assignment list.
     * 
     * @param value the value value to set.
     * @return the RoleManagementPolicyAssignmentListResult object itself.
     */
    public RoleManagementPolicyAssignmentListResult withValue(List<RoleManagementPolicyAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the RoleManagementPolicyAssignmentListResult object itself.
     */
    public RoleManagementPolicyAssignmentListResult withNextLink(String nextLink) {
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
     * Reads an instance of RoleManagementPolicyAssignmentListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleManagementPolicyAssignmentListResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleManagementPolicyAssignmentListResult.
     */
    public static RoleManagementPolicyAssignmentListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleManagementPolicyAssignmentListResult deserializedRoleManagementPolicyAssignmentListResult
                = new RoleManagementPolicyAssignmentListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RoleManagementPolicyAssignmentInner> value
                        = reader.readArray(reader1 -> RoleManagementPolicyAssignmentInner.fromJson(reader1));
                    deserializedRoleManagementPolicyAssignmentListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedRoleManagementPolicyAssignmentListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleManagementPolicyAssignmentListResult;
        });
    }
}
