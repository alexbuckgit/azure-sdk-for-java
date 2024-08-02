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
import java.util.Map;

/**
 * deviceCategory
 * 
 * Device categories provides a way to organize your devices. Using device categories, company administrators can define
 * their own categories that make sense to their company. These categories can then be applied to a device in the Intune
 * Azure console or selected by a user during device enrollment. You can filter reports and create dynamic Azure Active
 * Directory device groups based on device categories.
 */
@Fluent
public final class MicrosoftGraphDeviceCategory extends MicrosoftGraphEntity {
    /*
     * Optional description for the device category.
     */
    private String description;

    /*
     * Display name for the device category.
     */
    private String displayName;

    /*
     * Device categories provides a way to organize your devices. Using device categories, company administrators can
     * define their own categories that make sense to their company. These categories can then be applied to a device in
     * the Intune Azure console or selected by a user during device enrollment. You can filter reports and create
     * dynamic Azure Active Directory device groups based on device categories.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphDeviceCategory class.
     */
    public MicrosoftGraphDeviceCategory() {
    }

    /**
     * Get the description property: Optional description for the device category.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Optional description for the device category.
     * 
     * @param description the description value to set.
     * @return the MicrosoftGraphDeviceCategory object itself.
     */
    public MicrosoftGraphDeviceCategory withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Display name for the device category.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the device category.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphDeviceCategory object itself.
     */
    public MicrosoftGraphDeviceCategory withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the additionalProperties property: Device categories provides a way to organize your devices. Using device
     * categories, company administrators can define their own categories that make sense to their company. These
     * categories can then be applied to a device in the Intune Azure console or selected by a user during device
     * enrollment. You can filter reports and create dynamic Azure Active Directory device groups based on device
     * categories.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Device categories provides a way to organize your devices. Using device
     * categories, company administrators can define their own categories that make sense to their company. These
     * categories can then be applied to a device in the Intune Azure console or selected by a user during device
     * enrollment. You can filter reports and create dynamic Azure Active Directory device groups based on device
     * categories.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDeviceCategory object itself.
     */
    public MicrosoftGraphDeviceCategory withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphDeviceCategory withId(String id) {
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
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayName", this.displayName);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphDeviceCategory from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphDeviceCategory if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphDeviceCategory.
     */
    public static MicrosoftGraphDeviceCategory fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphDeviceCategory deserializedMicrosoftGraphDeviceCategory = new MicrosoftGraphDeviceCategory();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceCategory.withId(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceCategory.description = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceCategory.displayName = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphDeviceCategory.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphDeviceCategory;
        });
    }
}
