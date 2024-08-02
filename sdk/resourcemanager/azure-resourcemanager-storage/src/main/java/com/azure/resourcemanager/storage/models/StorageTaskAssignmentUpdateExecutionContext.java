// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Execution context of the storage task assignment update.
 */
@Fluent
public final class StorageTaskAssignmentUpdateExecutionContext
    implements JsonSerializable<StorageTaskAssignmentUpdateExecutionContext> {
    /*
     * Execution target of the storage task assignment
     */
    private ExecutionTarget target;

    /*
     * Execution trigger of the storage task assignment
     */
    private ExecutionTriggerUpdate trigger;

    /**
     * Creates an instance of StorageTaskAssignmentUpdateExecutionContext class.
     */
    public StorageTaskAssignmentUpdateExecutionContext() {
    }

    /**
     * Get the target property: Execution target of the storage task assignment.
     * 
     * @return the target value.
     */
    public ExecutionTarget target() {
        return this.target;
    }

    /**
     * Set the target property: Execution target of the storage task assignment.
     * 
     * @param target the target value to set.
     * @return the StorageTaskAssignmentUpdateExecutionContext object itself.
     */
    public StorageTaskAssignmentUpdateExecutionContext withTarget(ExecutionTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get the trigger property: Execution trigger of the storage task assignment.
     * 
     * @return the trigger value.
     */
    public ExecutionTriggerUpdate trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: Execution trigger of the storage task assignment.
     * 
     * @param trigger the trigger value to set.
     * @return the StorageTaskAssignmentUpdateExecutionContext object itself.
     */
    public StorageTaskAssignmentUpdateExecutionContext withTrigger(ExecutionTriggerUpdate trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (target() != null) {
            target().validate();
        }
        if (trigger() != null) {
            trigger().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("target", this.target);
        jsonWriter.writeJsonField("trigger", this.trigger);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageTaskAssignmentUpdateExecutionContext from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageTaskAssignmentUpdateExecutionContext if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageTaskAssignmentUpdateExecutionContext.
     */
    public static StorageTaskAssignmentUpdateExecutionContext fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageTaskAssignmentUpdateExecutionContext deserializedStorageTaskAssignmentUpdateExecutionContext
                = new StorageTaskAssignmentUpdateExecutionContext();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("target".equals(fieldName)) {
                    deserializedStorageTaskAssignmentUpdateExecutionContext.target = ExecutionTarget.fromJson(reader);
                } else if ("trigger".equals(fieldName)) {
                    deserializedStorageTaskAssignmentUpdateExecutionContext.trigger
                        = ExecutionTriggerUpdate.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageTaskAssignmentUpdateExecutionContext;
        });
    }
}
