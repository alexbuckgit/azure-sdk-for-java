// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * scheduleInformation.
 */
@Fluent
public final class MicrosoftGraphScheduleInformation implements JsonSerializable<MicrosoftGraphScheduleInformation> {
    /*
     * Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots.
     * Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4=
     * working elsewhere.
     */
    private String availabilityView;

    /*
     * freeBusyError
     */
    private MicrosoftGraphFreeBusyError error;

    /*
     * An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
     */
    private String scheduleId;

    /*
     * Contains the items that describe the availability of the user or resource.
     */
    private List<MicrosoftGraphScheduleItem> scheduleItems;

    /*
     * workingHours
     */
    private MicrosoftGraphWorkingHours workingHours;

    /*
     * scheduleInformation
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphScheduleInformation class.
     */
    public MicrosoftGraphScheduleInformation() {
    }

    /**
     * Get the availabilityView property: Represents a merged view of availability of all the items in scheduleItems.
     * The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2=
     * busy, 3= out of office, 4= working elsewhere.
     * 
     * @return the availabilityView value.
     */
    public String availabilityView() {
        return this.availabilityView;
    }

    /**
     * Set the availabilityView property: Represents a merged view of availability of all the items in scheduleItems.
     * The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2=
     * busy, 3= out of office, 4= working elsewhere.
     * 
     * @param availabilityView the availabilityView value to set.
     * @return the MicrosoftGraphScheduleInformation object itself.
     */
    public MicrosoftGraphScheduleInformation withAvailabilityView(String availabilityView) {
        this.availabilityView = availabilityView;
        return this;
    }

    /**
     * Get the error property: freeBusyError.
     * 
     * @return the error value.
     */
    public MicrosoftGraphFreeBusyError error() {
        return this.error;
    }

    /**
     * Set the error property: freeBusyError.
     * 
     * @param error the error value to set.
     * @return the MicrosoftGraphScheduleInformation object itself.
     */
    public MicrosoftGraphScheduleInformation withError(MicrosoftGraphFreeBusyError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the scheduleId property: An SMTP address of the user, distribution list, or resource, identifying an instance
     * of scheduleInformation.
     * 
     * @return the scheduleId value.
     */
    public String scheduleId() {
        return this.scheduleId;
    }

    /**
     * Set the scheduleId property: An SMTP address of the user, distribution list, or resource, identifying an instance
     * of scheduleInformation.
     * 
     * @param scheduleId the scheduleId value to set.
     * @return the MicrosoftGraphScheduleInformation object itself.
     */
    public MicrosoftGraphScheduleInformation withScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }

    /**
     * Get the scheduleItems property: Contains the items that describe the availability of the user or resource.
     * 
     * @return the scheduleItems value.
     */
    public List<MicrosoftGraphScheduleItem> scheduleItems() {
        return this.scheduleItems;
    }

    /**
     * Set the scheduleItems property: Contains the items that describe the availability of the user or resource.
     * 
     * @param scheduleItems the scheduleItems value to set.
     * @return the MicrosoftGraphScheduleInformation object itself.
     */
    public MicrosoftGraphScheduleInformation withScheduleItems(List<MicrosoftGraphScheduleItem> scheduleItems) {
        this.scheduleItems = scheduleItems;
        return this;
    }

    /**
     * Get the workingHours property: workingHours.
     * 
     * @return the workingHours value.
     */
    public MicrosoftGraphWorkingHours workingHours() {
        return this.workingHours;
    }

    /**
     * Set the workingHours property: workingHours.
     * 
     * @param workingHours the workingHours value to set.
     * @return the MicrosoftGraphScheduleInformation object itself.
     */
    public MicrosoftGraphScheduleInformation withWorkingHours(MicrosoftGraphWorkingHours workingHours) {
        this.workingHours = workingHours;
        return this;
    }

    /**
     * Get the additionalProperties property: scheduleInformation.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: scheduleInformation.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphScheduleInformation object itself.
     */
    public MicrosoftGraphScheduleInformation withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
        if (scheduleItems() != null) {
            scheduleItems().forEach(e -> e.validate());
        }
        if (workingHours() != null) {
            workingHours().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("availabilityView", this.availabilityView);
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeStringField("scheduleId", this.scheduleId);
        jsonWriter.writeArrayField("scheduleItems", this.scheduleItems, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("workingHours", this.workingHours);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphScheduleInformation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphScheduleInformation if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphScheduleInformation.
     */
    public static MicrosoftGraphScheduleInformation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphScheduleInformation deserializedMicrosoftGraphScheduleInformation
                = new MicrosoftGraphScheduleInformation();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("availabilityView".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleInformation.availabilityView = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleInformation.error = MicrosoftGraphFreeBusyError.fromJson(reader);
                } else if ("scheduleId".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleInformation.scheduleId = reader.getString();
                } else if ("scheduleItems".equals(fieldName)) {
                    List<MicrosoftGraphScheduleItem> scheduleItems
                        = reader.readArray(reader1 -> MicrosoftGraphScheduleItem.fromJson(reader1));
                    deserializedMicrosoftGraphScheduleInformation.scheduleItems = scheduleItems;
                } else if ("workingHours".equals(fieldName)) {
                    deserializedMicrosoftGraphScheduleInformation.workingHours
                        = MicrosoftGraphWorkingHours.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphScheduleInformation.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphScheduleInformation;
        });
    }
}
