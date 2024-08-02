// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Storage task execution report for a run instance.
 */
@Immutable
public final class StorageTaskReportProperties implements JsonSerializable<StorageTaskReportProperties> {
    /*
     * Represents the Storage Task Assignment Id associated with the storage task that provided an execution context.
     */
    private String taskAssignmentId;

    /*
     * Represents the Storage Account Id where the storage task definition was applied and executed.
     */
    private String storageAccountId;

    /*
     * Start time of the run instance. Filter options such as startTime gt '2023-06-26T20:51:24.4494016Z' and other
     * comparison operators can be used as described for DateTime properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-
     * operators
     */
    private String startTime;

    /*
     * End time of the run instance. Filter options such as startTime gt '2023-06-26T20:51:24.4494016Z' and other
     * comparison operators can be used as described for DateTime properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-
     * operators
     */
    private String finishTime;

    /*
     * Total number of objects that meet the condition as defined in the storage task assignment execution context.
     * Filter options such as objectsTargetedCount gt 50 and other comparison operators can be used as described for
     * Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-
     * operators
     */
    private String objectsTargetedCount;

    /*
     * Total number of objects that meet the storage tasks condition and were operated upon. Filter options such as
     * objectsOperatedOnCount ge 100 and other comparison operators can be used as described for Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-
     * operators
     */
    private String objectsOperatedOnCount;

    /*
     * Total number of objects where task operation failed when was attempted. Filter options such as objectFailedCount
     * eq 0 and other comparison operators can be used as described for Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-
     * operators
     */
    private String objectFailedCount;

    /*
     * Total number of objects where task operation succeeded when was attempted.Filter options such as
     * objectsSucceededCount gt 150 and other comparison operators can be used as described for Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-
     * operators
     */
    private String objectsSucceededCount;

    /*
     * Well known Azure Storage error code that represents the error encountered during execution of the run instance.
     */
    private String runStatusError;

    /*
     * Represents the status of the execution.
     */
    private RunStatusEnum runStatusEnum;

    /*
     * Full path to the verbose report stored in the reporting container as specified in the assignment execution
     * context for the storage account.
     */
    private String summaryReportPath;

    /*
     * Storage Task Arm Id.
     */
    private String taskId;

    /*
     * Storage Task Version
     */
    private String taskVersion;

    /*
     * Represents the overall result of the execution for the run instance
     */
    private RunResult runResult;

    /**
     * Creates an instance of StorageTaskReportProperties class.
     */
    public StorageTaskReportProperties() {
    }

    /**
     * Get the taskAssignmentId property: Represents the Storage Task Assignment Id associated with the storage task
     * that provided an execution context.
     * 
     * @return the taskAssignmentId value.
     */
    public String taskAssignmentId() {
        return this.taskAssignmentId;
    }

    /**
     * Get the storageAccountId property: Represents the Storage Account Id where the storage task definition was
     * applied and executed.
     * 
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Get the startTime property: Start time of the run instance. Filter options such as startTime gt
     * '2023-06-26T20:51:24.4494016Z' and other comparison operators can be used as described for DateTime properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-operators.
     * 
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Get the finishTime property: End time of the run instance. Filter options such as startTime gt
     * '2023-06-26T20:51:24.4494016Z' and other comparison operators can be used as described for DateTime properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-operators.
     * 
     * @return the finishTime value.
     */
    public String finishTime() {
        return this.finishTime;
    }

    /**
     * Get the objectsTargetedCount property: Total number of objects that meet the condition as defined in the storage
     * task assignment execution context. Filter options such as objectsTargetedCount gt 50 and other comparison
     * operators can be used as described for Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-operators.
     * 
     * @return the objectsTargetedCount value.
     */
    public String objectsTargetedCount() {
        return this.objectsTargetedCount;
    }

    /**
     * Get the objectsOperatedOnCount property: Total number of objects that meet the storage tasks condition and were
     * operated upon. Filter options such as objectsOperatedOnCount ge 100 and other comparison operators can be used as
     * described for Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-operators.
     * 
     * @return the objectsOperatedOnCount value.
     */
    public String objectsOperatedOnCount() {
        return this.objectsOperatedOnCount;
    }

    /**
     * Get the objectFailedCount property: Total number of objects where task operation failed when was attempted.
     * Filter options such as objectFailedCount eq 0 and other comparison operators can be used as described for
     * Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-operators.
     * 
     * @return the objectFailedCount value.
     */
    public String objectFailedCount() {
        return this.objectFailedCount;
    }

    /**
     * Get the objectsSucceededCount property: Total number of objects where task operation succeeded when was
     * attempted.Filter options such as objectsSucceededCount gt 150 and other comparison operators can be used as
     * described for Numerical properties in
     * https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#supported-comparison-operators.
     * 
     * @return the objectsSucceededCount value.
     */
    public String objectsSucceededCount() {
        return this.objectsSucceededCount;
    }

    /**
     * Get the runStatusError property: Well known Azure Storage error code that represents the error encountered during
     * execution of the run instance.
     * 
     * @return the runStatusError value.
     */
    public String runStatusError() {
        return this.runStatusError;
    }

    /**
     * Get the runStatusEnum property: Represents the status of the execution.
     * 
     * @return the runStatusEnum value.
     */
    public RunStatusEnum runStatusEnum() {
        return this.runStatusEnum;
    }

    /**
     * Get the summaryReportPath property: Full path to the verbose report stored in the reporting container as
     * specified in the assignment execution context for the storage account.
     * 
     * @return the summaryReportPath value.
     */
    public String summaryReportPath() {
        return this.summaryReportPath;
    }

    /**
     * Get the taskId property: Storage Task Arm Id.
     * 
     * @return the taskId value.
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Get the taskVersion property: Storage Task Version.
     * 
     * @return the taskVersion value.
     */
    public String taskVersion() {
        return this.taskVersion;
    }

    /**
     * Get the runResult property: Represents the overall result of the execution for the run instance.
     * 
     * @return the runResult value.
     */
    public RunResult runResult() {
        return this.runResult;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
     * Reads an instance of StorageTaskReportProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageTaskReportProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageTaskReportProperties.
     */
    public static StorageTaskReportProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageTaskReportProperties deserializedStorageTaskReportProperties = new StorageTaskReportProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("taskAssignmentId".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.taskAssignmentId = reader.getString();
                } else if ("storageAccountId".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.storageAccountId = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.startTime = reader.getString();
                } else if ("finishTime".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.finishTime = reader.getString();
                } else if ("objectsTargetedCount".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.objectsTargetedCount = reader.getString();
                } else if ("objectsOperatedOnCount".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.objectsOperatedOnCount = reader.getString();
                } else if ("objectFailedCount".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.objectFailedCount = reader.getString();
                } else if ("objectsSucceededCount".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.objectsSucceededCount = reader.getString();
                } else if ("runStatusError".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.runStatusError = reader.getString();
                } else if ("runStatusEnum".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.runStatusEnum
                        = RunStatusEnum.fromString(reader.getString());
                } else if ("summaryReportPath".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.summaryReportPath = reader.getString();
                } else if ("taskId".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.taskId = reader.getString();
                } else if ("taskVersion".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.taskVersion = reader.getString();
                } else if ("runResult".equals(fieldName)) {
                    deserializedStorageTaskReportProperties.runResult = RunResult.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageTaskReportProperties;
        });
    }
}
