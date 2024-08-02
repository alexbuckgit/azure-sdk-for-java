// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * attachment.
 */
@Fluent
public final class MicrosoftGraphAttachment extends MicrosoftGraphEntity {
    /*
     * The MIME type.
     */
    private String contentType;

    /*
     * true if the attachment is an inline attachment; otherwise, false.
     */
    private Boolean isInline;

    /*
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For
     * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The attachment's file name.
     */
    private String name;

    /*
     * The length of the attachment in bytes.
     */
    private Integer size;

    /*
     * attachment
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphAttachment class.
     */
    public MicrosoftGraphAttachment() {
    }

    /**
     * Get the contentType property: The MIME type.
     * 
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The MIME type.
     * 
     * @param contentType the contentType value to set.
     * @return the MicrosoftGraphAttachment object itself.
     */
    public MicrosoftGraphAttachment withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the isInline property: true if the attachment is an inline attachment; otherwise, false.
     * 
     * @return the isInline value.
     */
    public Boolean isInline() {
        return this.isInline;
    }

    /**
     * Set the isInline property: true if the attachment is an inline attachment; otherwise, false.
     * 
     * @param isInline the isInline value to set.
     * @return the MicrosoftGraphAttachment object itself.
     */
    public MicrosoftGraphAttachment withIsInline(Boolean isInline) {
        this.isInline = isInline;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     * 
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     * 
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphAttachment object itself.
     */
    public MicrosoftGraphAttachment withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the name property: The attachment's file name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The attachment's file name.
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphAttachment object itself.
     */
    public MicrosoftGraphAttachment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the size property: The length of the attachment in bytes.
     * 
     * @return the size value.
     */
    public Integer size() {
        return this.size;
    }

    /**
     * Set the size property: The length of the attachment in bytes.
     * 
     * @param size the size value to set.
     * @return the MicrosoftGraphAttachment object itself.
     */
    public MicrosoftGraphAttachment withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the additionalProperties property: attachment.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: attachment.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAttachment object itself.
     */
    public MicrosoftGraphAttachment withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphAttachment withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("contentType", this.contentType);
        jsonWriter.writeBooleanField("isInline", this.isInline);
        jsonWriter.writeStringField("lastModifiedDateTime",
            this.lastModifiedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastModifiedDateTime));
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeNumberField("size", this.size);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphAttachment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphAttachment if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphAttachment.
     */
    public static MicrosoftGraphAttachment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphAttachment deserializedMicrosoftGraphAttachment = new MicrosoftGraphAttachment();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachment.withId(reader.getString());
                } else if ("contentType".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachment.contentType = reader.getString();
                } else if ("isInline".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachment.isInline = reader.getNullable(JsonReader::getBoolean);
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachment.lastModifiedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachment.name = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedMicrosoftGraphAttachment.size = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphAttachment.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphAttachment;
        });
    }
}
