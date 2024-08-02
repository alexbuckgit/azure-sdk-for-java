// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.models.CaptureDescription;
import com.azure.resourcemanager.eventhubs.models.EntityStatus;
import com.azure.resourcemanager.eventhubs.models.RetentionDescription;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Properties supplied to the Create Or Update Event Hub operation.
 */
@Fluent
public final class EventhubProperties implements JsonSerializable<EventhubProperties> {
    /*
     * Current number of shards on the Event Hub.
     */
    private List<String> partitionIds;

    /*
     * Exact time the Event Hub was created.
     */
    private OffsetDateTime createdAt;

    /*
     * The exact time the message was updated.
     */
    private OffsetDateTime updatedAt;

    /*
     * Number of days to retain the events for this Event Hub, value should be 1 to 7 days
     */
    private Long messageRetentionInDays;

    /*
     * Number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     */
    private Long partitionCount;

    /*
     * Enumerates the possible values for the status of the Event Hub.
     */
    private EntityStatus status;

    /*
     * Gets and Sets Metadata of User.
     */
    private String userMetadata;

    /*
     * Properties of capture description
     */
    private CaptureDescription captureDescription;

    /*
     * Event Hub retention settings
     */
    private RetentionDescription retentionDescription;

    /**
     * Creates an instance of EventhubProperties class.
     */
    public EventhubProperties() {
    }

    /**
     * Get the partitionIds property: Current number of shards on the Event Hub.
     * 
     * @return the partitionIds value.
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }

    /**
     * Get the createdAt property: Exact time the Event Hub was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the messageRetentionInDays property: Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     * 
     * @return the messageRetentionInDays value.
     */
    public Long messageRetentionInDays() {
        return this.messageRetentionInDays;
    }

    /**
     * Set the messageRetentionInDays property: Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     * 
     * @param messageRetentionInDays the messageRetentionInDays value to set.
     * @return the EventhubProperties object itself.
     */
    public EventhubProperties withMessageRetentionInDays(Long messageRetentionInDays) {
        this.messageRetentionInDays = messageRetentionInDays;
        return this;
    }

    /**
     * Get the partitionCount property: Number of partitions created for the Event Hub, allowed values are from 1 to 32
     * partitions.
     * 
     * @return the partitionCount value.
     */
    public Long partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount property: Number of partitions created for the Event Hub, allowed values are from 1 to 32
     * partitions.
     * 
     * @param partitionCount the partitionCount value to set.
     * @return the EventhubProperties object itself.
     */
    public EventhubProperties withPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the status property: Enumerates the possible values for the status of the Event Hub.
     * 
     * @return the status value.
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Enumerates the possible values for the status of the Event Hub.
     * 
     * @param status the status value to set.
     * @return the EventhubProperties object itself.
     */
    public EventhubProperties withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the userMetadata property: Gets and Sets Metadata of User.
     * 
     * @return the userMetadata value.
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata property: Gets and Sets Metadata of User.
     * 
     * @param userMetadata the userMetadata value to set.
     * @return the EventhubProperties object itself.
     */
    public EventhubProperties withUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Get the captureDescription property: Properties of capture description.
     * 
     * @return the captureDescription value.
     */
    public CaptureDescription captureDescription() {
        return this.captureDescription;
    }

    /**
     * Set the captureDescription property: Properties of capture description.
     * 
     * @param captureDescription the captureDescription value to set.
     * @return the EventhubProperties object itself.
     */
    public EventhubProperties withCaptureDescription(CaptureDescription captureDescription) {
        this.captureDescription = captureDescription;
        return this;
    }

    /**
     * Get the retentionDescription property: Event Hub retention settings.
     * 
     * @return the retentionDescription value.
     */
    public RetentionDescription retentionDescription() {
        return this.retentionDescription;
    }

    /**
     * Set the retentionDescription property: Event Hub retention settings.
     * 
     * @param retentionDescription the retentionDescription value to set.
     * @return the EventhubProperties object itself.
     */
    public EventhubProperties withRetentionDescription(RetentionDescription retentionDescription) {
        this.retentionDescription = retentionDescription;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (captureDescription() != null) {
            captureDescription().validate();
        }
        if (retentionDescription() != null) {
            retentionDescription().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("messageRetentionInDays", this.messageRetentionInDays);
        jsonWriter.writeNumberField("partitionCount", this.partitionCount);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("userMetadata", this.userMetadata);
        jsonWriter.writeJsonField("captureDescription", this.captureDescription);
        jsonWriter.writeJsonField("retentionDescription", this.retentionDescription);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventhubProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventhubProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventhubProperties.
     */
    public static EventhubProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventhubProperties deserializedEventhubProperties = new EventhubProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("partitionIds".equals(fieldName)) {
                    List<String> partitionIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedEventhubProperties.partitionIds = partitionIds;
                } else if ("createdAt".equals(fieldName)) {
                    deserializedEventhubProperties.createdAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("updatedAt".equals(fieldName)) {
                    deserializedEventhubProperties.updatedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("messageRetentionInDays".equals(fieldName)) {
                    deserializedEventhubProperties.messageRetentionInDays = reader.getNullable(JsonReader::getLong);
                } else if ("partitionCount".equals(fieldName)) {
                    deserializedEventhubProperties.partitionCount = reader.getNullable(JsonReader::getLong);
                } else if ("status".equals(fieldName)) {
                    deserializedEventhubProperties.status = EntityStatus.fromString(reader.getString());
                } else if ("userMetadata".equals(fieldName)) {
                    deserializedEventhubProperties.userMetadata = reader.getString();
                } else if ("captureDescription".equals(fieldName)) {
                    deserializedEventhubProperties.captureDescription = CaptureDescription.fromJson(reader);
                } else if ("retentionDescription".equals(fieldName)) {
                    deserializedEventhubProperties.retentionDescription = RetentionDescription.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventhubProperties;
        });
    }
}
