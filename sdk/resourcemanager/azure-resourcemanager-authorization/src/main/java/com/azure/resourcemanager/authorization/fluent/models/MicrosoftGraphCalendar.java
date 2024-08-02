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

/**
 * calendar.
 */
@Fluent
public final class MicrosoftGraphCalendar extends MicrosoftGraphEntity {
    /*
     * Represent the online meeting service providers that can be used to create online meetings in this calendar.
     * Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     */
    private List<MicrosoftGraphOnlineMeetingProviderType> allowedOnlineMeetingProviders;

    /*
     * True if the user can write to the calendar, false otherwise. This property is true for the user who created the
     * calendar. This property is also true for a user who has been shared a calendar and granted write access.
     */
    private Boolean canEdit;

    /*
     * True if the user has the permission to share the calendar, false otherwise. Only the user who created the
     * calendar can share it.
     */
    private Boolean canShare;

    /*
     * True if the user can read calendar items that have been marked private, false otherwise.
     */
    private Boolean canViewPrivateItems;

    /*
     * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well.
     * This allows Exchange to apply changes to the correct version of the object. Read-only.
     */
    private String changeKey;

    /*
     * calendarColor
     */
    private MicrosoftGraphCalendarColor color;

    /*
     * onlineMeetingProviderType
     */
    private MicrosoftGraphOnlineMeetingProviderType defaultOnlineMeetingProvider;

    /*
     * The hexColor property.
     */
    private String hexColor;

    /*
     * The isDefaultCalendar property.
     */
    private Boolean isDefaultCalendar;

    /*
     * Indicates whether this user calendar can be deleted from the user mailbox.
     */
    private Boolean isRemovable;

    /*
     * Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from
     * users' primary calendars support tracking of meeting responses.
     */
    private Boolean isTallyingResponses;

    /*
     * The calendar name.
     */
    private String name;

    /*
     * emailAddress
     */
    private MicrosoftGraphEmailAddress owner;

    /*
     * The permissions of the users with whom the calendar is shared.
     */
    private List<MicrosoftGraphCalendarPermission> calendarPermissions;

    /*
     * The calendar view for the calendar. Navigation property. Read-only.
     */
    private List<MicrosoftGraphEvent> calendarView;

    /*
     * The events in the calendar. Navigation property. Read-only.
     */
    private List<MicrosoftGraphEvent> events;

    /*
     * The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
     */
    private List<MicrosoftGraphMultiValueLegacyExtendedProperty> multiValueExtendedProperties;

    /*
     * The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
     */
    private List<MicrosoftGraphSingleValueLegacyExtendedProperty> singleValueExtendedProperties;

    /*
     * calendar
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphCalendar class.
     */
    public MicrosoftGraphCalendar() {
    }

    /**
     * Get the allowedOnlineMeetingProviders property: Represent the online meeting service providers that can be used
     * to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer,
     * teamsForBusiness.
     * 
     * @return the allowedOnlineMeetingProviders value.
     */
    public List<MicrosoftGraphOnlineMeetingProviderType> allowedOnlineMeetingProviders() {
        return this.allowedOnlineMeetingProviders;
    }

    /**
     * Set the allowedOnlineMeetingProviders property: Represent the online meeting service providers that can be used
     * to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer,
     * teamsForBusiness.
     * 
     * @param allowedOnlineMeetingProviders the allowedOnlineMeetingProviders value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar
        withAllowedOnlineMeetingProviders(List<MicrosoftGraphOnlineMeetingProviderType> allowedOnlineMeetingProviders) {
        this.allowedOnlineMeetingProviders = allowedOnlineMeetingProviders;
        return this;
    }

    /**
     * Get the canEdit property: True if the user can write to the calendar, false otherwise. This property is true for
     * the user who created the calendar. This property is also true for a user who has been shared a calendar and
     * granted write access.
     * 
     * @return the canEdit value.
     */
    public Boolean canEdit() {
        return this.canEdit;
    }

    /**
     * Set the canEdit property: True if the user can write to the calendar, false otherwise. This property is true for
     * the user who created the calendar. This property is also true for a user who has been shared a calendar and
     * granted write access.
     * 
     * @param canEdit the canEdit value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * Get the canShare property: True if the user has the permission to share the calendar, false otherwise. Only the
     * user who created the calendar can share it.
     * 
     * @return the canShare value.
     */
    public Boolean canShare() {
        return this.canShare;
    }

    /**
     * Set the canShare property: True if the user has the permission to share the calendar, false otherwise. Only the
     * user who created the calendar can share it.
     * 
     * @param canShare the canShare value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCanShare(Boolean canShare) {
        this.canShare = canShare;
        return this;
    }

    /**
     * Get the canViewPrivateItems property: True if the user can read calendar items that have been marked private,
     * false otherwise.
     * 
     * @return the canViewPrivateItems value.
     */
    public Boolean canViewPrivateItems() {
        return this.canViewPrivateItems;
    }

    /**
     * Set the canViewPrivateItems property: True if the user can read calendar items that have been marked private,
     * false otherwise.
     * 
     * @param canViewPrivateItems the canViewPrivateItems value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCanViewPrivateItems(Boolean canViewPrivateItems) {
        this.canViewPrivateItems = canViewPrivateItems;
        return this;
    }

    /**
     * Get the changeKey property: Identifies the version of the calendar object. Every time the calendar is changed,
     * changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * 
     * @return the changeKey value.
     */
    public String changeKey() {
        return this.changeKey;
    }

    /**
     * Set the changeKey property: Identifies the version of the calendar object. Every time the calendar is changed,
     * changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * 
     * @param changeKey the changeKey value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withChangeKey(String changeKey) {
        this.changeKey = changeKey;
        return this;
    }

    /**
     * Get the color property: calendarColor.
     * 
     * @return the color value.
     */
    public MicrosoftGraphCalendarColor color() {
        return this.color;
    }

    /**
     * Set the color property: calendarColor.
     * 
     * @param color the color value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withColor(MicrosoftGraphCalendarColor color) {
        this.color = color;
        return this;
    }

    /**
     * Get the defaultOnlineMeetingProvider property: onlineMeetingProviderType.
     * 
     * @return the defaultOnlineMeetingProvider value.
     */
    public MicrosoftGraphOnlineMeetingProviderType defaultOnlineMeetingProvider() {
        return this.defaultOnlineMeetingProvider;
    }

    /**
     * Set the defaultOnlineMeetingProvider property: onlineMeetingProviderType.
     * 
     * @param defaultOnlineMeetingProvider the defaultOnlineMeetingProvider value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar
        withDefaultOnlineMeetingProvider(MicrosoftGraphOnlineMeetingProviderType defaultOnlineMeetingProvider) {
        this.defaultOnlineMeetingProvider = defaultOnlineMeetingProvider;
        return this;
    }

    /**
     * Get the hexColor property: The hexColor property.
     * 
     * @return the hexColor value.
     */
    public String hexColor() {
        return this.hexColor;
    }

    /**
     * Set the hexColor property: The hexColor property.
     * 
     * @param hexColor the hexColor value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withHexColor(String hexColor) {
        this.hexColor = hexColor;
        return this;
    }

    /**
     * Get the isDefaultCalendar property: The isDefaultCalendar property.
     * 
     * @return the isDefaultCalendar value.
     */
    public Boolean isDefaultCalendar() {
        return this.isDefaultCalendar;
    }

    /**
     * Set the isDefaultCalendar property: The isDefaultCalendar property.
     * 
     * @param isDefaultCalendar the isDefaultCalendar value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withIsDefaultCalendar(Boolean isDefaultCalendar) {
        this.isDefaultCalendar = isDefaultCalendar;
        return this;
    }

    /**
     * Get the isRemovable property: Indicates whether this user calendar can be deleted from the user mailbox.
     * 
     * @return the isRemovable value.
     */
    public Boolean isRemovable() {
        return this.isRemovable;
    }

    /**
     * Set the isRemovable property: Indicates whether this user calendar can be deleted from the user mailbox.
     * 
     * @param isRemovable the isRemovable value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withIsRemovable(Boolean isRemovable) {
        this.isRemovable = isRemovable;
        return this;
    }

    /**
     * Get the isTallyingResponses property: Indicates whether this user calendar supports tracking of meeting
     * responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     * 
     * @return the isTallyingResponses value.
     */
    public Boolean isTallyingResponses() {
        return this.isTallyingResponses;
    }

    /**
     * Set the isTallyingResponses property: Indicates whether this user calendar supports tracking of meeting
     * responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     * 
     * @param isTallyingResponses the isTallyingResponses value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withIsTallyingResponses(Boolean isTallyingResponses) {
        this.isTallyingResponses = isTallyingResponses;
        return this;
    }

    /**
     * Get the name property: The calendar name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The calendar name.
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the owner property: emailAddress.
     * 
     * @return the owner value.
     */
    public MicrosoftGraphEmailAddress owner() {
        return this.owner;
    }

    /**
     * Set the owner property: emailAddress.
     * 
     * @param owner the owner value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withOwner(MicrosoftGraphEmailAddress owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the calendarPermissions property: The permissions of the users with whom the calendar is shared.
     * 
     * @return the calendarPermissions value.
     */
    public List<MicrosoftGraphCalendarPermission> calendarPermissions() {
        return this.calendarPermissions;
    }

    /**
     * Set the calendarPermissions property: The permissions of the users with whom the calendar is shared.
     * 
     * @param calendarPermissions the calendarPermissions value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCalendarPermissions(List<MicrosoftGraphCalendarPermission> calendarPermissions) {
        this.calendarPermissions = calendarPermissions;
        return this;
    }

    /**
     * Get the calendarView property: The calendar view for the calendar. Navigation property. Read-only.
     * 
     * @return the calendarView value.
     */
    public List<MicrosoftGraphEvent> calendarView() {
        return this.calendarView;
    }

    /**
     * Set the calendarView property: The calendar view for the calendar. Navigation property. Read-only.
     * 
     * @param calendarView the calendarView value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCalendarView(List<MicrosoftGraphEvent> calendarView) {
        this.calendarView = calendarView;
        return this;
    }

    /**
     * Get the events property: The events in the calendar. Navigation property. Read-only.
     * 
     * @return the events value.
     */
    public List<MicrosoftGraphEvent> events() {
        return this.events;
    }

    /**
     * Set the events property: The events in the calendar. Navigation property. Read-only.
     * 
     * @param events the events value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withEvents(List<MicrosoftGraphEvent> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the multiValueExtendedProperties property: The collection of multi-value extended properties defined for the
     * calendar. Read-only. Nullable.
     * 
     * @return the multiValueExtendedProperties value.
     */
    public List<MicrosoftGraphMultiValueLegacyExtendedProperty> multiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }

    /**
     * Set the multiValueExtendedProperties property: The collection of multi-value extended properties defined for the
     * calendar. Read-only. Nullable.
     * 
     * @param multiValueExtendedProperties the multiValueExtendedProperties value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withMultiValueExtendedProperties(
        List<MicrosoftGraphMultiValueLegacyExtendedProperty> multiValueExtendedProperties) {
        this.multiValueExtendedProperties = multiValueExtendedProperties;
        return this;
    }

    /**
     * Get the singleValueExtendedProperties property: The collection of single-value extended properties defined for
     * the calendar. Read-only. Nullable.
     * 
     * @return the singleValueExtendedProperties value.
     */
    public List<MicrosoftGraphSingleValueLegacyExtendedProperty> singleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }

    /**
     * Set the singleValueExtendedProperties property: The collection of single-value extended properties defined for
     * the calendar. Read-only. Nullable.
     * 
     * @param singleValueExtendedProperties the singleValueExtendedProperties value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withSingleValueExtendedProperties(
        List<MicrosoftGraphSingleValueLegacyExtendedProperty> singleValueExtendedProperties) {
        this.singleValueExtendedProperties = singleValueExtendedProperties;
        return this;
    }

    /**
     * Get the additionalProperties property: calendar.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: calendar.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphCalendar withId(String id) {
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
        if (owner() != null) {
            owner().validate();
        }
        if (calendarPermissions() != null) {
            calendarPermissions().forEach(e -> e.validate());
        }
        if (calendarView() != null) {
            calendarView().forEach(e -> e.validate());
        }
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
        if (multiValueExtendedProperties() != null) {
            multiValueExtendedProperties().forEach(e -> e.validate());
        }
        if (singleValueExtendedProperties() != null) {
            singleValueExtendedProperties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeArrayField("allowedOnlineMeetingProviders", this.allowedOnlineMeetingProviders,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeBooleanField("canEdit", this.canEdit);
        jsonWriter.writeBooleanField("canShare", this.canShare);
        jsonWriter.writeBooleanField("canViewPrivateItems", this.canViewPrivateItems);
        jsonWriter.writeStringField("changeKey", this.changeKey);
        jsonWriter.writeStringField("color", this.color == null ? null : this.color.toString());
        jsonWriter.writeStringField("defaultOnlineMeetingProvider",
            this.defaultOnlineMeetingProvider == null ? null : this.defaultOnlineMeetingProvider.toString());
        jsonWriter.writeStringField("hexColor", this.hexColor);
        jsonWriter.writeBooleanField("isDefaultCalendar", this.isDefaultCalendar);
        jsonWriter.writeBooleanField("isRemovable", this.isRemovable);
        jsonWriter.writeBooleanField("isTallyingResponses", this.isTallyingResponses);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("owner", this.owner);
        jsonWriter.writeArrayField("calendarPermissions", this.calendarPermissions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("calendarView", this.calendarView, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("events", this.events, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("multiValueExtendedProperties", this.multiValueExtendedProperties,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("singleValueExtendedProperties", this.singleValueExtendedProperties,
            (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphCalendar from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphCalendar if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphCalendar.
     */
    public static MicrosoftGraphCalendar fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphCalendar deserializedMicrosoftGraphCalendar = new MicrosoftGraphCalendar();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.withId(reader.getString());
                } else if ("allowedOnlineMeetingProviders".equals(fieldName)) {
                    List<MicrosoftGraphOnlineMeetingProviderType> allowedOnlineMeetingProviders = reader
                        .readArray(reader1 -> MicrosoftGraphOnlineMeetingProviderType.fromString(reader1.getString()));
                    deserializedMicrosoftGraphCalendar.allowedOnlineMeetingProviders = allowedOnlineMeetingProviders;
                } else if ("canEdit".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.canEdit = reader.getNullable(JsonReader::getBoolean);
                } else if ("canShare".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.canShare = reader.getNullable(JsonReader::getBoolean);
                } else if ("canViewPrivateItems".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.canViewPrivateItems = reader.getNullable(JsonReader::getBoolean);
                } else if ("changeKey".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.changeKey = reader.getString();
                } else if ("color".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.color
                        = MicrosoftGraphCalendarColor.fromString(reader.getString());
                } else if ("defaultOnlineMeetingProvider".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.defaultOnlineMeetingProvider
                        = MicrosoftGraphOnlineMeetingProviderType.fromString(reader.getString());
                } else if ("hexColor".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.hexColor = reader.getString();
                } else if ("isDefaultCalendar".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.isDefaultCalendar = reader.getNullable(JsonReader::getBoolean);
                } else if ("isRemovable".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.isRemovable = reader.getNullable(JsonReader::getBoolean);
                } else if ("isTallyingResponses".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.isTallyingResponses = reader.getNullable(JsonReader::getBoolean);
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.name = reader.getString();
                } else if ("owner".equals(fieldName)) {
                    deserializedMicrosoftGraphCalendar.owner = MicrosoftGraphEmailAddress.fromJson(reader);
                } else if ("calendarPermissions".equals(fieldName)) {
                    List<MicrosoftGraphCalendarPermission> calendarPermissions
                        = reader.readArray(reader1 -> MicrosoftGraphCalendarPermission.fromJson(reader1));
                    deserializedMicrosoftGraphCalendar.calendarPermissions = calendarPermissions;
                } else if ("calendarView".equals(fieldName)) {
                    List<MicrosoftGraphEvent> calendarView
                        = reader.readArray(reader1 -> MicrosoftGraphEvent.fromJson(reader1));
                    deserializedMicrosoftGraphCalendar.calendarView = calendarView;
                } else if ("events".equals(fieldName)) {
                    List<MicrosoftGraphEvent> events
                        = reader.readArray(reader1 -> MicrosoftGraphEvent.fromJson(reader1));
                    deserializedMicrosoftGraphCalendar.events = events;
                } else if ("multiValueExtendedProperties".equals(fieldName)) {
                    List<MicrosoftGraphMultiValueLegacyExtendedProperty> multiValueExtendedProperties
                        = reader.readArray(reader1 -> MicrosoftGraphMultiValueLegacyExtendedProperty.fromJson(reader1));
                    deserializedMicrosoftGraphCalendar.multiValueExtendedProperties = multiValueExtendedProperties;
                } else if ("singleValueExtendedProperties".equals(fieldName)) {
                    List<MicrosoftGraphSingleValueLegacyExtendedProperty> singleValueExtendedProperties = reader
                        .readArray(reader1 -> MicrosoftGraphSingleValueLegacyExtendedProperty.fromJson(reader1));
                    deserializedMicrosoftGraphCalendar.singleValueExtendedProperties = singleValueExtendedProperties;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphCalendar.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphCalendar;
        });
    }
}
