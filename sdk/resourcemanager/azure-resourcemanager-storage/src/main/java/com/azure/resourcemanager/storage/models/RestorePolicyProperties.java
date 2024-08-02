// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The blob service properties for blob restore policy.
 */
@Fluent
public final class RestorePolicyProperties implements JsonSerializable<RestorePolicyProperties> {
    /*
     * Blob restore is enabled if set to true.
     */
    private boolean enabled;

    /*
     * how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
     */
    private Integer days;

    /*
     * Deprecated in favor of minRestoreTime property.
     */
    private OffsetDateTime lastEnabledTime;

    /*
     * Returns the minimum date and time that the restore can be started.
     */
    private OffsetDateTime minRestoreTime;

    /**
     * Creates an instance of RestorePolicyProperties class.
     */
    public RestorePolicyProperties() {
    }

    /**
     * Get the enabled property: Blob restore is enabled if set to true.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Blob restore is enabled if set to true.
     * 
     * @param enabled the enabled value to set.
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: how long this blob can be restored. It should be great than zero and less than
     * DeleteRetentionPolicy.days.
     * 
     * @return the days value.
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the days property: how long this blob can be restored. It should be great than zero and less than
     * DeleteRetentionPolicy.days.
     * 
     * @param days the days value to set.
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get the lastEnabledTime property: Deprecated in favor of minRestoreTime property.
     * 
     * @return the lastEnabledTime value.
     */
    public OffsetDateTime lastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * Get the minRestoreTime property: Returns the minimum date and time that the restore can be started.
     * 
     * @return the minRestoreTime value.
     */
    public OffsetDateTime minRestoreTime() {
        return this.minRestoreTime;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeNumberField("days", this.days);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorePolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorePolicyProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RestorePolicyProperties.
     */
    public static RestorePolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorePolicyProperties deserializedRestorePolicyProperties = new RestorePolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedRestorePolicyProperties.enabled = reader.getBoolean();
                } else if ("days".equals(fieldName)) {
                    deserializedRestorePolicyProperties.days = reader.getNullable(JsonReader::getInt);
                } else if ("lastEnabledTime".equals(fieldName)) {
                    deserializedRestorePolicyProperties.lastEnabledTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("minRestoreTime".equals(fieldName)) {
                    deserializedRestorePolicyProperties.minRestoreTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorePolicyProperties;
        });
    }
}
