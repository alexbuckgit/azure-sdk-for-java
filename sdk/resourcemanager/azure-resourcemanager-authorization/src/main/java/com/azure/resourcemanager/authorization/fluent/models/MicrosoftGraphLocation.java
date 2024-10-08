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
import java.util.Map;

/**
 * location.
 */
@Fluent
public final class MicrosoftGraphLocation implements JsonSerializable<MicrosoftGraphLocation> {
    /*
     * physicalAddress
     */
    private MicrosoftGraphPhysicalAddress address;

    /*
     * outlookGeoCoordinates
     */
    private MicrosoftGraphOutlookGeoCoordinates coordinates;

    /*
     * The name associated with the location.
     */
    private String displayName;

    /*
     * Optional email address of the location.
     */
    private String locationEmailAddress;

    /*
     * locationType
     */
    private MicrosoftGraphLocationType locationType;

    /*
     * Optional URI representing the location.
     */
    private String locationUri;

    /*
     * For internal use only.
     */
    private String uniqueId;

    /*
     * locationUniqueIdType
     */
    private MicrosoftGraphLocationUniqueIdType uniqueIdType;

    /*
     * location
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphLocation class.
     */
    public MicrosoftGraphLocation() {
    }

    /**
     * Get the address property: physicalAddress.
     * 
     * @return the address value.
     */
    public MicrosoftGraphPhysicalAddress address() {
        return this.address;
    }

    /**
     * Set the address property: physicalAddress.
     * 
     * @param address the address value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withAddress(MicrosoftGraphPhysicalAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Get the coordinates property: outlookGeoCoordinates.
     * 
     * @return the coordinates value.
     */
    public MicrosoftGraphOutlookGeoCoordinates coordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: outlookGeoCoordinates.
     * 
     * @param coordinates the coordinates value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withCoordinates(MicrosoftGraphOutlookGeoCoordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * Get the displayName property: The name associated with the location.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name associated with the location.
     * 
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the locationEmailAddress property: Optional email address of the location.
     * 
     * @return the locationEmailAddress value.
     */
    public String locationEmailAddress() {
        return this.locationEmailAddress;
    }

    /**
     * Set the locationEmailAddress property: Optional email address of the location.
     * 
     * @param locationEmailAddress the locationEmailAddress value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withLocationEmailAddress(String locationEmailAddress) {
        this.locationEmailAddress = locationEmailAddress;
        return this;
    }

    /**
     * Get the locationType property: locationType.
     * 
     * @return the locationType value.
     */
    public MicrosoftGraphLocationType locationType() {
        return this.locationType;
    }

    /**
     * Set the locationType property: locationType.
     * 
     * @param locationType the locationType value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withLocationType(MicrosoftGraphLocationType locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * Get the locationUri property: Optional URI representing the location.
     * 
     * @return the locationUri value.
     */
    public String locationUri() {
        return this.locationUri;
    }

    /**
     * Set the locationUri property: Optional URI representing the location.
     * 
     * @param locationUri the locationUri value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }

    /**
     * Get the uniqueId property: For internal use only.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Set the uniqueId property: For internal use only.
     * 
     * @param uniqueId the uniqueId value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * Get the uniqueIdType property: locationUniqueIdType.
     * 
     * @return the uniqueIdType value.
     */
    public MicrosoftGraphLocationUniqueIdType uniqueIdType() {
        return this.uniqueIdType;
    }

    /**
     * Set the uniqueIdType property: locationUniqueIdType.
     * 
     * @param uniqueIdType the uniqueIdType value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withUniqueIdType(MicrosoftGraphLocationUniqueIdType uniqueIdType) {
        this.uniqueIdType = uniqueIdType;
        return this;
    }

    /**
     * Get the additionalProperties property: location.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: location.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphLocation object itself.
     */
    public MicrosoftGraphLocation withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (address() != null) {
            address().validate();
        }
        if (coordinates() != null) {
            coordinates().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("address", this.address);
        jsonWriter.writeJsonField("coordinates", this.coordinates);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("locationEmailAddress", this.locationEmailAddress);
        jsonWriter.writeStringField("locationType", this.locationType == null ? null : this.locationType.toString());
        jsonWriter.writeStringField("locationUri", this.locationUri);
        jsonWriter.writeStringField("uniqueId", this.uniqueId);
        jsonWriter.writeStringField("uniqueIdType", this.uniqueIdType == null ? null : this.uniqueIdType.toString());
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphLocation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphLocation if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphLocation.
     */
    public static MicrosoftGraphLocation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphLocation deserializedMicrosoftGraphLocation = new MicrosoftGraphLocation();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("address".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.address = MicrosoftGraphPhysicalAddress.fromJson(reader);
                } else if ("coordinates".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.coordinates
                        = MicrosoftGraphOutlookGeoCoordinates.fromJson(reader);
                } else if ("displayName".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.displayName = reader.getString();
                } else if ("locationEmailAddress".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.locationEmailAddress = reader.getString();
                } else if ("locationType".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.locationType
                        = MicrosoftGraphLocationType.fromString(reader.getString());
                } else if ("locationUri".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.locationUri = reader.getString();
                } else if ("uniqueId".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.uniqueId = reader.getString();
                } else if ("uniqueIdType".equals(fieldName)) {
                    deserializedMicrosoftGraphLocation.uniqueIdType
                        = MicrosoftGraphLocationUniqueIdType.fromString(reader.getString());
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphLocation.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphLocation;
        });
    }
}
