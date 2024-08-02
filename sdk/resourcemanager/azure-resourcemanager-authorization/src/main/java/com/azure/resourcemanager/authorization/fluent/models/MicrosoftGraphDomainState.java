// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * domainState.
 */
@Fluent
public final class MicrosoftGraphDomainState implements JsonSerializable<MicrosoftGraphDomainState> {
    /*
     * Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the
     * asynchronous task starts, and when the operation completes.
     */
    private OffsetDateTime lastActionDateTime;

    /*
     * Type of asynchronous operation. The values can be ForceDelete or Verification
     */
    private String operation;

    /*
     * Current status of the operation. Scheduled - Operation has been scheduled but has not started. InProgress - Task
     * has started and is in progress. Failed - Operation has failed.
     */
    private String status;

    /*
     * domainState
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphDomainState class.
     */
    public MicrosoftGraphDomainState() {
    }

    /**
     * Get the lastActionDateTime property: Timestamp for when the last activity occurred. The value is updated when an
     * operation is scheduled, the asynchronous task starts, and when the operation completes.
     * 
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime lastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Set the lastActionDateTime property: Timestamp for when the last activity occurred. The value is updated when an
     * operation is scheduled, the asynchronous task starts, and when the operation completes.
     * 
     * @param lastActionDateTime the lastActionDateTime value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withLastActionDateTime(OffsetDateTime lastActionDateTime) {
        this.lastActionDateTime = lastActionDateTime;
        return this;
    }

    /**
     * Get the operation property: Type of asynchronous operation. The values can be ForceDelete or Verification.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Type of asynchronous operation. The values can be ForceDelete or Verification.
     * 
     * @param operation the operation value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the status property: Current status of the operation. Scheduled - Operation has been scheduled but has not
     * started. InProgress - Task has started and is in progress. Failed - Operation has failed.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Current status of the operation. Scheduled - Operation has been scheduled but has not
     * started. InProgress - Task has started and is in progress. Failed - Operation has failed.
     * 
     * @param status the status value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: domainState.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: domainState.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
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
        jsonWriter.writeStringField("lastActionDateTime",
            this.lastActionDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastActionDateTime));
        jsonWriter.writeStringField("operation", this.operation);
        jsonWriter.writeStringField("status", this.status);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphDomainState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphDomainState if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphDomainState.
     */
    public static MicrosoftGraphDomainState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphDomainState deserializedMicrosoftGraphDomainState = new MicrosoftGraphDomainState();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("lastActionDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphDomainState.lastActionDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("operation".equals(fieldName)) {
                    deserializedMicrosoftGraphDomainState.operation = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedMicrosoftGraphDomainState.status = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphDomainState.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphDomainState;
        });
    }
}
