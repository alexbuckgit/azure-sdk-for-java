// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of the storage task assignment.
 */
@Fluent
public final class StorageTaskAssignmentProperties implements JsonSerializable<StorageTaskAssignmentProperties> {
    /*
     * Id of the corresponding storage task
     */
    private String taskId;

    /*
     * Whether the storage task assignment is enabled or not
     */
    private boolean enabled;

    /*
     * Text that describes the purpose of the storage task assignment
     */
    private String description;

    /*
     * The storage task assignment execution context
     */
    private StorageTaskAssignmentExecutionContext executionContext;

    /*
     * The storage task assignment report
     */
    private StorageTaskAssignmentReport report;

    /*
     * Represents the provisioning state of the storage task assignment.
     */
    private ProvisioningState provisioningState;

    /*
     * Run status of storage task assignment
     */
    private StorageTaskReportProperties runStatus;

    /**
     * Creates an instance of StorageTaskAssignmentProperties class.
     */
    public StorageTaskAssignmentProperties() {
    }

    /**
     * Get the taskId property: Id of the corresponding storage task.
     * 
     * @return the taskId value.
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: Id of the corresponding storage task.
     * 
     * @param taskId the taskId value to set.
     * @return the StorageTaskAssignmentProperties object itself.
     */
    public StorageTaskAssignmentProperties withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the enabled property: Whether the storage task assignment is enabled or not.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the storage task assignment is enabled or not.
     * 
     * @param enabled the enabled value to set.
     * @return the StorageTaskAssignmentProperties object itself.
     */
    public StorageTaskAssignmentProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the description property: Text that describes the purpose of the storage task assignment.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Text that describes the purpose of the storage task assignment.
     * 
     * @param description the description value to set.
     * @return the StorageTaskAssignmentProperties object itself.
     */
    public StorageTaskAssignmentProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the executionContext property: The storage task assignment execution context.
     * 
     * @return the executionContext value.
     */
    public StorageTaskAssignmentExecutionContext executionContext() {
        return this.executionContext;
    }

    /**
     * Set the executionContext property: The storage task assignment execution context.
     * 
     * @param executionContext the executionContext value to set.
     * @return the StorageTaskAssignmentProperties object itself.
     */
    public StorageTaskAssignmentProperties
        withExecutionContext(StorageTaskAssignmentExecutionContext executionContext) {
        this.executionContext = executionContext;
        return this;
    }

    /**
     * Get the report property: The storage task assignment report.
     * 
     * @return the report value.
     */
    public StorageTaskAssignmentReport report() {
        return this.report;
    }

    /**
     * Set the report property: The storage task assignment report.
     * 
     * @param report the report value to set.
     * @return the StorageTaskAssignmentProperties object itself.
     */
    public StorageTaskAssignmentProperties withReport(StorageTaskAssignmentReport report) {
        this.report = report;
        return this;
    }

    /**
     * Get the provisioningState property: Represents the provisioning state of the storage task assignment.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the runStatus property: Run status of storage task assignment.
     * 
     * @return the runStatus value.
     */
    public StorageTaskReportProperties runStatus() {
        return this.runStatus;
    }

    /**
     * Set the runStatus property: Run status of storage task assignment.
     * 
     * @param runStatus the runStatus value to set.
     * @return the StorageTaskAssignmentProperties object itself.
     */
    public StorageTaskAssignmentProperties withRunStatus(StorageTaskReportProperties runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (taskId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property taskId in model StorageTaskAssignmentProperties"));
        }
        if (description() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property description in model StorageTaskAssignmentProperties"));
        }
        if (executionContext() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property executionContext in model StorageTaskAssignmentProperties"));
        } else {
            executionContext().validate();
        }
        if (report() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property report in model StorageTaskAssignmentProperties"));
        } else {
            report().validate();
        }
        if (runStatus() != null) {
            runStatus().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageTaskAssignmentProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("taskId", this.taskId);
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeJsonField("executionContext", this.executionContext);
        jsonWriter.writeJsonField("report", this.report);
        jsonWriter.writeJsonField("runStatus", this.runStatus);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageTaskAssignmentProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageTaskAssignmentProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StorageTaskAssignmentProperties.
     */
    public static StorageTaskAssignmentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageTaskAssignmentProperties deserializedStorageTaskAssignmentProperties
                = new StorageTaskAssignmentProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("taskId".equals(fieldName)) {
                    deserializedStorageTaskAssignmentProperties.taskId = reader.getString();
                } else if ("enabled".equals(fieldName)) {
                    deserializedStorageTaskAssignmentProperties.enabled = reader.getBoolean();
                } else if ("description".equals(fieldName)) {
                    deserializedStorageTaskAssignmentProperties.description = reader.getString();
                } else if ("executionContext".equals(fieldName)) {
                    deserializedStorageTaskAssignmentProperties.executionContext
                        = StorageTaskAssignmentExecutionContext.fromJson(reader);
                } else if ("report".equals(fieldName)) {
                    deserializedStorageTaskAssignmentProperties.report = StorageTaskAssignmentReport.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedStorageTaskAssignmentProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("runStatus".equals(fieldName)) {
                    deserializedStorageTaskAssignmentProperties.runStatus
                        = StorageTaskReportProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageTaskAssignmentProperties;
        });
    }
}
