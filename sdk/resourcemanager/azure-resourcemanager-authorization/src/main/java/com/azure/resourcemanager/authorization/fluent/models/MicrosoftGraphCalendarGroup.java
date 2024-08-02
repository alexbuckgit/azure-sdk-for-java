// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * calendarGroup.
 */
@Fluent
public final class MicrosoftGraphCalendarGroup extends MicrosoftGraphEntity {
    /*
     * Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as
     * well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     */
    private String changeKey;

    /*
     * The class identifier. Read-only.
     */
    private UUID classId;

    /*
     * The group name.
     */
    private String name;

    /*
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     */
    private List<MicrosoftGraphCalendar> calendars;

    /*
     * calendarGroup
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphCalendarGroup class.
     */
    public MicrosoftGraphCalendarGroup() {
    }

    /**
     * Get the changeKey property: Identifies the version of the calendar group. Every time the calendar group is
     * changed, ChangeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * Read-only.
     * 
     * @return the changeKey value.
     */
    public String changeKey() {
        return this.changeKey;
    }

    /**
     * Set the changeKey property: Identifies the version of the calendar group. Every time the calendar group is
     * changed, ChangeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * Read-only.
     * 
     * @param changeKey the changeKey value to set.
     * @return the MicrosoftGraphCalendarGroup object itself.
     */
    public MicrosoftGraphCalendarGroup withChangeKey(String changeKey) {
        this.changeKey = changeKey;
        return this;
    }

    /**
     * Get the classId property: The class identifier. Read-only.
     * 
     * @return the classId value.
     */
    public UUID classId() {
        return this.classId;
    }

    /**
     * Set the classId property: The class identifier. Read-only.
     * 
     * @param classId the classId value to set.
     * @return the MicrosoftGraphCalendarGroup object itself.
     */
    public MicrosoftGraphCalendarGroup withClassId(UUID classId) {
        this.classId = classId;
        return this;
    }

    /**
     * Get the name property: The group name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The group name.
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphCalendarGroup object itself.
     */
    public MicrosoftGraphCalendarGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the calendars property: The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * 
     * @return the calendars value.
     */
    public List<MicrosoftGraphCalendar> calendars() {
        return this.calendars;
    }

    /**
     * Set the calendars property: The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * 
     * @param calendars the calendars value to set.
     * @return the MicrosoftGraphCalendarGroup object itself.
     */
    public MicrosoftGraphCalendarGroup withCalendars(List<MicrosoftGraphCalendar> calendars) {
        this.calendars = calendars;
        return this;
    }

    /**
     * Get the additionalProperties property: calendarGroup.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: calendarGroup.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphCalendarGroup object itself.
     */
    public MicrosoftGraphCalendarGroup withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphCalendarGroup withId(String id) {
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
        if (calendars() != null) {
            calendars().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("changeKey", this.changeKey);
        jsonWriter.writeStringField("classId", Objects.toString(this.classId, null));
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeArrayField("calendars", this.calendars, (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphCalendarGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphCalendarGroup if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphCalendarGroup.
     */
    public static MicrosoftGraphCalendarGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphCalendarGroup deserializedMicrosoftGraphCalendarGroup = new MicrosoftGraphCalendarGroup();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendarGroup.withId(reader.getString());
                } else if ("changeKey".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendarGroup.changeKey = reader.getString();
                } else if ("classId".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendarGroup.classId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendarGroup.name = reader.getString();
                } else if ("calendars".equals(fieldName)) {
                    List<MicrosoftGraphCalendar> calendars
                        = reader.readArray(reader1 -> MicrosoftGraphCalendar.fromJson(reader1));
                    deserializedMicrosoftGraphCalendarGroup.calendars = calendars;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphCalendarGroup.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphCalendarGroup;
        });
    }
}
